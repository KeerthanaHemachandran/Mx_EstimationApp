/*jslint white:true, nomen: true, plusplus: true */
/*global mx, define, require, browser, devel, console, document, jQuery */
/*mendix */
/*
    DropdownDivConverter
    ========================

    @file      : DropdownDivConverter.js
    @version   : 1.4
    @author    : Willem Gorisse
    @date      : Wed, 24 Jun 2015 15:15:32 GMT
    @copyright : 2015 Mendix
    @license   : Apache Licence 2.0

    Documentation
    ========================
    The DropdownDivConverter converts a Mendix (div-)container into a - Bootstrap based - dropdown menu with a button. Simply create a container in Mendix with all the content you want in the dropdown menu and the DropdownDivConverter widget as it's last child. Everything you will have added then becomes the content of the dropdown menu.
*/

// Required module list. Remove unnecessary modules, you can always get them back from the boilerplate.
define([
    'dojo/_base/declare', 'mxui/widget/_WidgetBase', 'dijit/_TemplatedMixin',
    'mxui/dom', 'dojo/dom', 'dojo/query', 'dojo/NodeList-traverse', 'dojo/dom-prop', 'dojo/dom-geometry', 'dojo/dom-class', 'dojo/dom-style', 'dojo/dom-construct', 'dojo/_base/array', 'dojo/_base/lang', 'dojo/text', 'dojo/html', 'dojo/_base/event',
     'dojo/text!DropdownDivConverter/widget/template/DropdownDivConverter.html'
], function (declare, _WidgetBase, _TemplatedMixin, dom, dojoDom, domQuery, domTraverse, domProp, domGeom, domClass, domStyle, domConstruct, dojoArray, lang, text, html, event, widgetTemplate) {
    'use strict';

    // Declare widget's prototype.
    return declare('DropdownDivConverter.widget.DropdownDivConverter', [_WidgetBase, _TemplatedMixin], {

        // _TemplatedMixin will create our dom node using this HTML template.
        templateString: widgetTemplate,

        // Parameters configured in the Modeler.
        buttonTitle: "",
        // dropdownImg: null,
        dynamicButtonTitleAttribute: "",
        buttonGlyphicon: "",
        isDropUp: "",
        isRightAligned: "",
        startOpen: "",
        guid:null,
        changedDate:null,
        autoClose: "",
        splitButtonActive: "",
        splitButtonClicked: "",
        imgObj: null,
        fileID: null,
        imgNode: null,
        _contextObj: null,
        _alertDiv: null,
        _allDropDowns: {},
        _eventsSet: null,
        _isOpen: null,
        _buttonLabel: null,
        _dynamicLabel: false,

        // dojo.declare.constructor is called to construct the widget instance. Implement to initialize non-primitive properties.
        constructor: function () {
            this._eventsSet = false;
        },

        // dijit._WidgetBase.postCreate is called after constructing the widget. Implement to do extra setup work.
        postCreate: function () {
            //logger.level(console.log);
            console.log('profilemenu.widget postcreate');
            this._allDropDowns[this.id] = this;
            this._isOpen = false;
        },

        // mxui.widget._WidgetBase.update is called when context is changed or initialized. Implement to re-render and / or fetch data.
        update: function (obj, callback) {
            console.log('profilemenu.widget update');
            this._contextObj = obj;

            // preset the label
            this._buttonLabel = this.buttonTitle;
            if (this.dynamicButtonTitleAttribute !== "" && this._contextObj !== null) {
                this._dynamicLabel = true;
                this._buttonLabel = this._contextObj.get(this.dynamicButtonTitleAttribute);
            }
            console.log('profilemenu.widget update obj', obj);
            this.guid = this._contextObj.getGuid();
            console.log('profilemenu.widget guid', this.guid);
            this.changedDate = this._contextObj.get('changedDate');
            if (this._handles && this._handles.length && this._handles.length > 0) {
                dojoArray.forEach(this._handles, function (handle) {
                    mx.data.unsubscribe(handle);
                });
            }
            this._handles = [];

            this._contextObj = obj;
            if (typeof callback !== 'undefined') {
                callback();
            }

            this._resetSubscriptions();
            this._updateRendering(callback);
        },

        // Reordering the interface: selecting the siblings and putting them in the dropdown menu
        _updateRendering: function (callback) {
            // find all the siblings
            console.log('profilemenu.widget _updateRendering');
            var siblings = domQuery(this.domNode).siblings();
            // loop through siblings and move them inside the dropdownMenu
            dojoArray.forEach(siblings, lang.hitch(this, function (entry, i) {
                domConstruct.place(entry, this.dropdownMenu, "last");
            }));

            this._renderInterface(this.startOpen, callback);
        },

        // Really render the interface, if renderAsOpen is true: render the menu in open state
        _renderInterface: function (renderAsOpen, callback) {
             console.log('profilemenu.widget renderInterface');
//            this.dropdownButton.innerHTML = this._buttonLabel + "<span class='caret'></span>";
//            // if a glyphicon icon was requested and the splitButton is not wanted: add the glyphicon to the button.
//            if (this.buttonGlyphicon !== "" && !this.splitButtonActive) {
//                this._addGlyphicon(this.dropdownButton);
//            }
//
//            this._setButtonTypes(this.dropdownButton);

            // implement visual settings of the widget
            if (renderAsOpen && !domClass.contains(this.domNode, "open")) {
                domClass.add(this.domNode, "open");
                this._isOpen = true;
            }
            if (this.isDropUp) {
                this._transformToDropUp();
            }
            if (this.isRightAligned) {
                if (!domClass.contains(this.dropdownMenu, "dropdown-menu-right")) {
                    domClass.add(this.dropdownMenu, "dropdown-menu-right");
                }
            }
            if (this.splitButtonActive) {
                this._createSplitButton();
            } else {
                domConstruct.destroy(this.splitButton);
            }
            
            
    
//            var path = this.picture;
//            var imageView = dom.get("dropdownImgTag");
//            console.log('img :', imageView);
            var img_node = domQuery('.menubutton-imagewrapper img')[0];
            console.log('img :', img_node);
          //  console.log('src :', 'http://localhost:8888/file?guid='+this.guid+"&changedDate="+this.changedDate);
            console.log('src :', 'file?guid='+this.guid+"&changedDate="+this.changedDate);
           // dojo.setAttr(img_node,"src",this.picture + "?preventCache=" + Date.now())
           //  dojo.setAttr(img_node,"src",'http://localhost:8888/file?guid='+this.guid+"&changedDate="+this.changedDate)
            dojo.setAttr(img_node,"src",'file?guid='+this.guid+"&changedDate="+this.changedDate)
    //            this.dropdownImgTag.set("src", 'http://localhost:8080/' + this.picture + "?preventCache=" + Date.now());
             

            this._setupEvents(callback);
        },

        // Attach events to HTML dom elements
        _setupEvents: function (callback) {
              console.log('profilemenu.widget _setupEvents');
            // only set events one time
            if (!this._eventsSet) {
                this._eventsSet = true;

                // set window click
                this.connect(document, "click", lang.hitch(this, function (event) {
                    // if a widget external click is made: close the menu if open
                    if (!this.domNode.contains(event.target)) {
                        if (domClass.contains(this.domNode, "open")) {
                            domClass.remove(this.domNode, "open");
                            this._isOpen = false;
                        }
                    }
                }));

                // set action for the normal dropdown button
//                this.connect(this.dropdownButton, "click", lang.hitch(this, function (e) {
//                    //event.stop(e);
//                    var dropdown = null;
//                    this._toggleMenu();
//                }));

                this.connect(this.dropdownImg, "click", lang.hitch(this, function (e) {
                    //event.stop(e);
                    var dropdown = null;
                    this._toggleMenu();
                }));

                // prevent default closing on dropdownMenu if needed
                if (!this.autoClose) {
                    this.connect(this.dropdownMenu, "click", lang.hitch(this, function (e) {
                        event.stop(e);
                    }));
                }

                // Mendix buttons and links stop events from bubbling: set actions for internal button clicks to close the menu if needed
                if (this.autoClose) {
                    this.connect(this.dropdownMenu, 'click', lang.hitch(this, function (e) {
                        if (this._isOpen) {
                            this._toggleMenu();
                        }
                    }));

                    var internalButtons = domQuery("button, a", this.dropdownMenu);
                    dojoArray.forEach(internalButtons, lang.hitch(this, function (node, i) {
                        this.connect(node, "click", lang.hitch(this, function (e) {
                            if (this._isOpen) {
                                this._toggleMenu();
                            }
                        }));
                    }));
                    // add logic to deal with listviews as they stop events from 6+
                    var internalListviews = domQuery(".mx-listview-clickable .mx-list", this.dropdownMenu);
                    dojoArray.forEach(internalListviews, lang.hitch(this, function (listNode, i) {
                        var listItemClick = lang.hitch(this, function (e) {
                            if (this._isOpen) {
                                this._toggleMenu();
                            }
                        });
                        listNode.addEventListener('click', listItemClick, true);
                        // manually remove the eventlistener on destroy
                        this.addOnDestroy(function () {
                            listNode.removeEventListener('click', listItemClick, true)
                        });
                    }));
                }

                // set the action for the possible split group button
                if (this.splitButtonActive) {
                    this.connect(this.splitButton, "click", lang.hitch(this, function (e) {
                        // if the widget is set to autoclose: close the dropdown menu
                        if (this.autoClose) {
                            if (this._isOpen) {
                                this._toggleMenu();
                            }
                        }

                        // if a microflow is checked and a contextobject is defined
                        if (this.splitButtonClicked !== "" && this._contextObj) {
                            // do we have a contextObj for the microflow?

                            var id = this._contextObj.getGuid();

                            mx.ui.action(this.splitButtonClicked, {
                                params: {
                                    applyto: "selection",
                                    guids: [id]
                                },
                                callback: function (success) {
                                    // if success was true, the microflow was indeed followed through
                                },
                                error: function (error) {
                                    // if there was an error
                                }
                            }, this);
                        } else if (this.simpleSplitButtonClicked !== "") {

                            mx.ui.action(this.simpleSplitButtonClicked, {
                                params: {
                                    applyto: "none"
                                },
                                callback: function (success) {
                                    // if success was true, the microflow was indeed followed through
                                },
                                error: function (error) {
                                    // if there was an error
                                }
                            }, this);
                        }

                    }));
                }

            }
            if (callback) {
                callback();
            }
        },

        // toggle dropdown state
        _toggleMenu: function () {
            if (domClass.contains(this.domNode, "open")) {
                domClass.remove(this.domNode, "open");
                this._isOpen = false;
            } else {
                domClass.add(this.domNode, "open");
                this._isOpen = true;
            }
        },

        // Set button types: size and type
        _setButtonTypes: function (button) {
            // first set the button type
            var typeClassName = "btn-" + this.buttonType,
                sizeClassName;

            if (!domClass.contains(button, typeClassName)) {
                domClass.add(button, typeClassName);
            }

            switch (this.buttonSize) {
            case "default":
                // default buttonsize is allready implemented
                break;
            default:
                sizeClassName = "btn-" + this.buttonSize;
                if (!domClass.contains(button, sizeClassName)) {
                    domClass.add(button, sizeClassName);
                }
            }
        },

        // Transform the dropdown into a dropup
        _transformToDropUp: function () {
            if (!domClass.contains(this.domNode, "dropup")) {
                domClass.add(this.domNode, "dropup");
            }
        },

        // Create a split button group 
        _createSplitButton: function () {
            // create the new split button label
            this.splitButton.innerHTML = this._buttonLabel;
            // if a glyphicon icon was requested: add the glyphicon to the button.
            if (this.buttonGlyphicon !== "") {
                this._addGlyphicon(this.splitButton);
            }
            this._setButtonTypes(this.splitButton);

            // adjust the dropdownButtons content
           // this.dropdownButton.innerHTML = "<span class='caret'></span><span class='sr-only'>Toggle Dropdown</span";
        },

        // Add a glyphicon to a button
        _addGlyphicon: function (buttonObject) {
            buttonObject.innerHTML = "<span class='glyphicon " + this.buttonGlyphicon + "'></span>" + buttonObject.innerHTML;
        },

        // Reset subscriptions.
        _resetSubscriptions: function () {
            console.log('profilemenu.widget _resetSubscriptions');
            this.unsubscribeAll();
            console.log("******previous conntext handles unsubscribed*******")
            if (this._contextObj) {

                this.subscribe({
                    guid: this._contextObj.getGuid(),
                    callback: lang.hitch(this, function (guid) {
                        this._updateRendering();
                        console.log("*****render subscriptions called on Mxobject change*******")
                    })
                });
            }
        }
    });
});
require(['DropdownDivConverter/widget/DropdownDivConverter'], function () {
    'use strict';
});