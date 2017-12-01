// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Common_Effort
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject common_EffortMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Common_Effort";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Service_Registry("Service_Registry"),
		Service_Retry_Itself("Service_Retry_Itself"),
		Channel_Driven_Service_call("Channel_Driven_Service_call"),
		Centralized_Configuration("Centralized_Configuration"),
		Load_Balancer_Required("Load_Balancer_Required"),
		Service_monitoring("Service_monitoring"),
		Complexity("Complexity"),
		Complexity_In_Percentage("Complexity_In_Percentage"),
		Template_Name("Template_Name"),
		Common_Effort_Template("MyFirstModule.Common_Effort_Template"),
		Common_Effort_Data_Based_SAV_2_Servicereg("MyFirstModule.Common_Effort_Data_Based_SAV_2_Servicereg"),
		Common_Effort_Data_Based_SAV_2_Changedri("MyFirstModule.Common_Effort_Data_Based_SAV_2_Changedri"),
		Common_Effort_Data_Based_SAV_2_central("MyFirstModule.Common_Effort_Data_Based_SAV_2_central"),
		Common_Effort_Data_Based_SAV_2_Load("MyFirstModule.Common_Effort_Data_Based_SAV_2_Load"),
		Common_Effort_Common_Effort_SAV_Servicemon("MyFirstModule.Common_Effort_Common_Effort_SAV_Servicemon");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Common_Effort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Common_Effort"));
	}

	protected Common_Effort(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject common_EffortMendixObject)
	{
		if (common_EffortMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Common_Effort", common_EffortMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Common_Effort");

		this.common_EffortMendixObject = common_EffortMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Common_Effort.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Common_Effort initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Common_Effort.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Common_Effort initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Common_Effort(context, mendixObject);
	}

	public static myfirstmodule.proxies.Common_Effort load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Common_Effort.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Common_Effort> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Common_Effort> result = new java.util.ArrayList<myfirstmodule.proxies.Common_Effort>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Common_Effort" + xpathConstraint))
			result.add(myfirstmodule.proxies.Common_Effort.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Service_Registry
	 */
	public final java.lang.String getService_Registry()
	{
		return getService_Registry(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Registry
	 */
	public final java.lang.String getService_Registry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service_Registry.toString());
	}

	/**
	 * Set value of Service_Registry
	 * @param service_registry
	 */
	public final void setService_Registry(java.lang.String service_registry)
	{
		setService_Registry(getContext(), service_registry);
	}

	/**
	 * Set value of Service_Registry
	 * @param context
	 * @param service_registry
	 */
	public final void setService_Registry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service_registry)
	{
		getMendixObject().setValue(context, MemberNames.Service_Registry.toString(), service_registry);
	}

	/**
	 * Set value of Service_Retry_Itself
	 * @param service_retry_itself
	 */
	public final myfirstmodule.proxies.Yes_No getService_Retry_Itself()
	{
		return getService_Retry_Itself(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Retry_Itself
	 */
	public final myfirstmodule.proxies.Yes_No getService_Retry_Itself(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Service_Retry_Itself.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Service_Retry_Itself
	 * @param service_retry_itself
	 */
	public final void setService_Retry_Itself(myfirstmodule.proxies.Yes_No service_retry_itself)
	{
		setService_Retry_Itself(getContext(), service_retry_itself);
	}

	/**
	 * Set value of Service_Retry_Itself
	 * @param context
	 * @param service_retry_itself
	 */
	public final void setService_Retry_Itself(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No service_retry_itself)
	{
		if (service_retry_itself != null)
			getMendixObject().setValue(context, MemberNames.Service_Retry_Itself.toString(), service_retry_itself.toString());
		else
			getMendixObject().setValue(context, MemberNames.Service_Retry_Itself.toString(), null);
	}

	/**
	 * @return value of Channel_Driven_Service_call
	 */
	public final java.lang.String getChannel_Driven_Service_call()
	{
		return getChannel_Driven_Service_call(getContext());
	}

	/**
	 * @param context
	 * @return value of Channel_Driven_Service_call
	 */
	public final java.lang.String getChannel_Driven_Service_call(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Channel_Driven_Service_call.toString());
	}

	/**
	 * Set value of Channel_Driven_Service_call
	 * @param channel_driven_service_call
	 */
	public final void setChannel_Driven_Service_call(java.lang.String channel_driven_service_call)
	{
		setChannel_Driven_Service_call(getContext(), channel_driven_service_call);
	}

	/**
	 * Set value of Channel_Driven_Service_call
	 * @param context
	 * @param channel_driven_service_call
	 */
	public final void setChannel_Driven_Service_call(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String channel_driven_service_call)
	{
		getMendixObject().setValue(context, MemberNames.Channel_Driven_Service_call.toString(), channel_driven_service_call);
	}

	/**
	 * Set value of Centralized_Configuration
	 * @param centralized_configuration
	 */
	public final myfirstmodule.proxies.Yes_No getCentralized_Configuration()
	{
		return getCentralized_Configuration(getContext());
	}

	/**
	 * @param context
	 * @return value of Centralized_Configuration
	 */
	public final myfirstmodule.proxies.Yes_No getCentralized_Configuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Centralized_Configuration.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Centralized_Configuration
	 * @param centralized_configuration
	 */
	public final void setCentralized_Configuration(myfirstmodule.proxies.Yes_No centralized_configuration)
	{
		setCentralized_Configuration(getContext(), centralized_configuration);
	}

	/**
	 * Set value of Centralized_Configuration
	 * @param context
	 * @param centralized_configuration
	 */
	public final void setCentralized_Configuration(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No centralized_configuration)
	{
		if (centralized_configuration != null)
			getMendixObject().setValue(context, MemberNames.Centralized_Configuration.toString(), centralized_configuration.toString());
		else
			getMendixObject().setValue(context, MemberNames.Centralized_Configuration.toString(), null);
	}

	/**
	 * @return value of Load_Balancer_Required
	 */
	public final java.lang.String getLoad_Balancer_Required()
	{
		return getLoad_Balancer_Required(getContext());
	}

	/**
	 * @param context
	 * @return value of Load_Balancer_Required
	 */
	public final java.lang.String getLoad_Balancer_Required(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Load_Balancer_Required.toString());
	}

	/**
	 * Set value of Load_Balancer_Required
	 * @param load_balancer_required
	 */
	public final void setLoad_Balancer_Required(java.lang.String load_balancer_required)
	{
		setLoad_Balancer_Required(getContext(), load_balancer_required);
	}

	/**
	 * Set value of Load_Balancer_Required
	 * @param context
	 * @param load_balancer_required
	 */
	public final void setLoad_Balancer_Required(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String load_balancer_required)
	{
		getMendixObject().setValue(context, MemberNames.Load_Balancer_Required.toString(), load_balancer_required);
	}

	/**
	 * @return value of Service_monitoring
	 */
	public final java.lang.String getService_monitoring()
	{
		return getService_monitoring(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_monitoring
	 */
	public final java.lang.String getService_monitoring(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service_monitoring.toString());
	}

	/**
	 * Set value of Service_monitoring
	 * @param service_monitoring
	 */
	public final void setService_monitoring(java.lang.String service_monitoring)
	{
		setService_monitoring(getContext(), service_monitoring);
	}

	/**
	 * Set value of Service_monitoring
	 * @param context
	 * @param service_monitoring
	 */
	public final void setService_monitoring(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service_monitoring)
	{
		getMendixObject().setValue(context, MemberNames.Service_monitoring.toString(), service_monitoring);
	}

	/**
	 * @return value of Complexity
	 */
	public final java.math.BigDecimal getComplexity()
	{
		return getComplexity(getContext());
	}

	/**
	 * @param context
	 * @return value of Complexity
	 */
	public final java.math.BigDecimal getComplexity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Complexity.toString());
	}

	/**
	 * Set value of Complexity
	 * @param complexity
	 */
	public final void setComplexity(java.math.BigDecimal complexity)
	{
		setComplexity(getContext(), complexity);
	}

	/**
	 * Set value of Complexity
	 * @param context
	 * @param complexity
	 */
	public final void setComplexity(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal complexity)
	{
		getMendixObject().setValue(context, MemberNames.Complexity.toString(), complexity);
	}

	/**
	 * @return value of Complexity_In_Percentage
	 */
	public final java.math.BigDecimal getComplexity_In_Percentage()
	{
		return getComplexity_In_Percentage(getContext());
	}

	/**
	 * @param context
	 * @return value of Complexity_In_Percentage
	 */
	public final java.math.BigDecimal getComplexity_In_Percentage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Complexity_In_Percentage.toString());
	}

	/**
	 * Set value of Complexity_In_Percentage
	 * @param complexity_in_percentage
	 */
	public final void setComplexity_In_Percentage(java.math.BigDecimal complexity_in_percentage)
	{
		setComplexity_In_Percentage(getContext(), complexity_in_percentage);
	}

	/**
	 * Set value of Complexity_In_Percentage
	 * @param context
	 * @param complexity_in_percentage
	 */
	public final void setComplexity_In_Percentage(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal complexity_in_percentage)
	{
		getMendixObject().setValue(context, MemberNames.Complexity_In_Percentage.toString(), complexity_in_percentage);
	}

	/**
	 * @return value of Template_Name
	 */
	public final java.lang.String getTemplate_Name()
	{
		return getTemplate_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Template_Name
	 */
	public final java.lang.String getTemplate_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Template_Name.toString());
	}

	/**
	 * Set value of Template_Name
	 * @param template_name
	 */
	public final void setTemplate_Name(java.lang.String template_name)
	{
		setTemplate_Name(getContext(), template_name);
	}

	/**
	 * Set value of Template_Name
	 * @param context
	 * @param template_name
	 */
	public final void setTemplate_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String template_name)
	{
		getMendixObject().setValue(context, MemberNames.Template_Name.toString(), template_name);
	}

	/**
	 * @return value of Common_Effort_Template
	 */
	public final myfirstmodule.proxies.Template getCommon_Effort_Template() throws com.mendix.core.CoreException
	{
		return getCommon_Effort_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort_Template
	 */
	public final myfirstmodule.proxies.Template getCommon_Effort_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Common_Effort_Template.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Common_Effort_Template
	 * @param common_effort_template
	 */
	public final void setCommon_Effort_Template(myfirstmodule.proxies.Template common_effort_template)
	{
		setCommon_Effort_Template(getContext(), common_effort_template);
	}

	/**
	 * Set value of Common_Effort_Template
	 * @param context
	 * @param common_effort_template
	 */
	public final void setCommon_Effort_Template(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Template common_effort_template)
	{
		if (common_effort_template == null)
			getMendixObject().setValue(context, MemberNames.Common_Effort_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Common_Effort_Template.toString(), common_effort_template.getMendixObject().getId());
	}

	/**
	 * @return value of Common_Effort_Data_Based_SAV_2_Servicereg
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_Servicereg() throws com.mendix.core.CoreException
	{
		return getCommon_Effort_Data_Based_SAV_2_Servicereg(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort_Data_Based_SAV_2_Servicereg
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_Servicereg(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Common_Effort_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Servicereg.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Common_Effort_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_Servicereg
	 * @param common_effort_data_based_sav_2_servicereg
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_Servicereg(myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_servicereg)
	{
		setCommon_Effort_Data_Based_SAV_2_Servicereg(getContext(), common_effort_data_based_sav_2_servicereg);
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_Servicereg
	 * @param context
	 * @param common_effort_data_based_sav_2_servicereg
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_Servicereg(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_servicereg)
	{
		if (common_effort_data_based_sav_2_servicereg == null)
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Servicereg.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Servicereg.toString(), common_effort_data_based_sav_2_servicereg.getMendixObject().getId());
	}

	/**
	 * @return value of Common_Effort_Data_Based_SAV_2_Changedri
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_Changedri() throws com.mendix.core.CoreException
	{
		return getCommon_Effort_Data_Based_SAV_2_Changedri(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort_Data_Based_SAV_2_Changedri
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_Changedri(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Common_Effort_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Changedri.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Common_Effort_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_Changedri
	 * @param common_effort_data_based_sav_2_changedri
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_Changedri(myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_changedri)
	{
		setCommon_Effort_Data_Based_SAV_2_Changedri(getContext(), common_effort_data_based_sav_2_changedri);
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_Changedri
	 * @param context
	 * @param common_effort_data_based_sav_2_changedri
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_Changedri(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_changedri)
	{
		if (common_effort_data_based_sav_2_changedri == null)
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Changedri.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Changedri.toString(), common_effort_data_based_sav_2_changedri.getMendixObject().getId());
	}

	/**
	 * @return value of Common_Effort_Data_Based_SAV_2_central
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_central() throws com.mendix.core.CoreException
	{
		return getCommon_Effort_Data_Based_SAV_2_central(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort_Data_Based_SAV_2_central
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_central(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Common_Effort_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_central.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Common_Effort_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_central
	 * @param common_effort_data_based_sav_2_central
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_central(myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_central)
	{
		setCommon_Effort_Data_Based_SAV_2_central(getContext(), common_effort_data_based_sav_2_central);
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_central
	 * @param context
	 * @param common_effort_data_based_sav_2_central
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_central(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_central)
	{
		if (common_effort_data_based_sav_2_central == null)
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_central.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_central.toString(), common_effort_data_based_sav_2_central.getMendixObject().getId());
	}

	/**
	 * @return value of Common_Effort_Data_Based_SAV_2_Load
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_Load() throws com.mendix.core.CoreException
	{
		return getCommon_Effort_Data_Based_SAV_2_Load(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort_Data_Based_SAV_2_Load
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Data_Based_SAV_2_Load(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Common_Effort_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Load.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Common_Effort_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_Load
	 * @param common_effort_data_based_sav_2_load
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_Load(myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_load)
	{
		setCommon_Effort_Data_Based_SAV_2_Load(getContext(), common_effort_data_based_sav_2_load);
	}

	/**
	 * Set value of Common_Effort_Data_Based_SAV_2_Load
	 * @param context
	 * @param common_effort_data_based_sav_2_load
	 */
	public final void setCommon_Effort_Data_Based_SAV_2_Load(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Common_Effort_SAV common_effort_data_based_sav_2_load)
	{
		if (common_effort_data_based_sav_2_load == null)
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Load.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Common_Effort_Data_Based_SAV_2_Load.toString(), common_effort_data_based_sav_2_load.getMendixObject().getId());
	}

	/**
	 * @return value of Common_Effort_Common_Effort_SAV_Servicemon
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Common_Effort_SAV_Servicemon() throws com.mendix.core.CoreException
	{
		return getCommon_Effort_Common_Effort_SAV_Servicemon(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort_Common_Effort_SAV_Servicemon
	 */
	public final myfirstmodule.proxies.Common_Effort_SAV getCommon_Effort_Common_Effort_SAV_Servicemon(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Common_Effort_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Common_Effort_Common_Effort_SAV_Servicemon.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Common_Effort_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Common_Effort_Common_Effort_SAV_Servicemon
	 * @param common_effort_common_effort_sav_servicemon
	 */
	public final void setCommon_Effort_Common_Effort_SAV_Servicemon(myfirstmodule.proxies.Common_Effort_SAV common_effort_common_effort_sav_servicemon)
	{
		setCommon_Effort_Common_Effort_SAV_Servicemon(getContext(), common_effort_common_effort_sav_servicemon);
	}

	/**
	 * Set value of Common_Effort_Common_Effort_SAV_Servicemon
	 * @param context
	 * @param common_effort_common_effort_sav_servicemon
	 */
	public final void setCommon_Effort_Common_Effort_SAV_Servicemon(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Common_Effort_SAV common_effort_common_effort_sav_servicemon)
	{
		if (common_effort_common_effort_sav_servicemon == null)
			getMendixObject().setValue(context, MemberNames.Common_Effort_Common_Effort_SAV_Servicemon.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Common_Effort_Common_Effort_SAV_Servicemon.toString(), common_effort_common_effort_sav_servicemon.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return common_EffortMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Common_Effort that = (myfirstmodule.proxies.Common_Effort) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Common_Effort";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}