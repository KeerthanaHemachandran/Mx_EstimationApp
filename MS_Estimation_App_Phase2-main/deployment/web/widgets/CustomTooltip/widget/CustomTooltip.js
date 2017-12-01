define([
    "dojo/_base/declare",
    "mxui/widget/_WidgetBase",
    "dijit/_TemplatedMixin",
    "mxui/dom",
    "dojo/_base/lang",
    "CustomTooltip/lib/jquery",
    "CustomTooltip/lib/tooltip",
    "dojo/text!CustomTooltip/widget/template/CustomTooltip.html"
], function (declare, _WidgetBase, _TemplatedMixin, dom, lang, _jQuery, tooltip, widgetTemplate) {
    "use strict";

    var _jQ = _jQuery.noConflict(true);
    var j$ = tooltip.createInstance(_jQ);

    return declare("CustomTooltip.widget.CustomTooltip", [_WidgetBase, _TemplatedMixin], {

        templateString: widgetTemplate,

        tooltipClassName: "",
        tooltipMessageMicroflow: "",
        tooltipMessageString: "",
        tooltipLocation: "top",
        tooltipMode: "hover",
        tooltipColor:"",
        tooltipTextColor:"",

        _tooltipText: "No custom text specified for this tooltip",
        _tooltipTrigger: null,
        _tooltipcolor:"#000",
        _tooltipTextColr:"#fff",

        postCreate: function () {
            console.log(this.id + ".postCreate");

            if (this.tooltipMode === "hover") {
                console.log("**event set to hover***")
                this._tooltipTrigger = "focus hover";
            } else if (this.tooltipMode === "focus") {
                 console.log("**event set to focus***")
                this._tooltipTrigger = "focus";
            } else if (this.tooltipMode === "click") {
                 console.log("**event set to click***")
                this._tooltipTrigger = "click";
            }
        },

        update: function (obj, callback) {
            console.log(this.id + ".update");

            if (this.tooltipMessageMicroflow !== "") {
                this._execMf(this.tooltipMessageMicroflow, obj ? obj.getGuid() : null, lang.hitch(this, function (string) {
                    console.log("*********Microflow called**************")
                    this._tooltipText = string;
                    this._initializeTooltip(callback);
                }));
                if (this.tooltipColor !== "") {
                    this._tooltipcolor = this.tooltipColor;
                    this._tooltipTextColr = this.tooltipTextColor;
                }
            } else {
                if (this.tooltipMessageString !== "") {
                    this._tooltipText = this.tooltipMessageString;
                }
                if (this.tooltipColor !== "") {
                    this._tooltipcolor = this.tooltipColor;
                    this._tooltipTextColr = this.tooltipTextColor;
                }
                this._initializeTooltip(callback);
            }
        },

        _initializeTooltip: function (cb) {
            console.log(this.id + "._initializeTooltip");

            // Find element by classname in the same container (DOM level) as widget
            var $targetElement = j$(this.domNode).siblings("." + this.tooltipClassName);

            // No element found on same level, try to find target element on page
            if ($targetElement.length === 0) {
                $targetElement = j$("." + this.tooltipClassName);
            }

            if ($targetElement.length === 0) {
                console.warn("Did you configure CustomTooltip widget correctly? Couldn't find an element with class '"+ this.tooltipClassName +"' on same level as widget (id='" + this.domNode.id+"')" );
            }

            //if the element is a label+input combination, find the input element.
            if ($targetElement.hasClass("form-group")){
                $targetElement = $targetElement.find(".form-control").length !== 0 ? $targetElement.find(".form-control") : $targetElement.find("input");
            }
            
            console.log("**************values sent to tooltip library***************",this._tooltipcolor,this._tooltipTextColr)
            $targetElement.tooltip({
                title: this._tooltipText,
                placement: this.tooltipLocation,
                trigger: this._tooltipTrigger,
                html : this.tooltipRenderHTML,
                colorVal:this._tooltipcolor,
                textColor:this._tooltipTextColr
            });

            this._executeCallback(cb, "_initializeTooltip");
        },

        _execMf: function (mf, guid, cb) {
            console.log(this.id + "._execMf");
            console.log("**********Microflow exceution called*************")
            var mfParams = {
                actionname: mf
            };

            if (guid) {
                mfParams.applyto = "selection";
                mfParams.guids = [ guid ];
            }

            var mfAction = {
                params: mfParams,
                callback: lang.hitch(this, function (obj) {
                    if (typeof cb === "function") {
                        cb(obj);
                    }
                }),
                error: lang.hitch(this, function (error) {
                    console.log(this.id + "._execMf error: " + error.description);
                })
            };

            if (!mx.version || mx.version && parseInt(mx.version.split(".")[0]) < 6) {
                mfAction.store = {
                    caller: this.mxform
                };
            } else {
                mfAction.origin = this.mxform;
            }

            mx.data.action(mfAction, this);

        },

        _executeCallback: function (cb, from) {
            console.log(this.id + "._executeCallback" + (from ? " from " + from : ""));
            if (cb && typeof cb === "function") {
                cb();
            }
        }
    });
});

require(["CustomTooltip/widget/CustomTooltip"]);
