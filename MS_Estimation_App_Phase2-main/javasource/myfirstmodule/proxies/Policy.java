// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Policy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject policyMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Policy";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UseCase("UseCase"),
		Service_Name("Service_Name"),
		Access_Control("Access_Control"),
		Authentication("Authentication"),
		Concurrent_Rate_Limit("Concurrent_Rate_Limit"),
		Spike_Arrest("Spike_Arrest"),
		Validation("Validation"),
		Statistic_Collector("Statistic_Collector"),
		JSON_Thread_Protection("JSON_Thread_Protection"),
		Regular_Expression_Protection("Regular_Expression_Protection"),
		Complexity("Complexity"),
		Complexity_In_Percentage("Complexity_In_Percentage"),
		Template_Name("Template_Name"),
		Policy_Template("MyFirstModule.Policy_Template"),
		Policy_Policy_SAV("MyFirstModule.Policy_Policy_SAV");

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

	public Policy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Policy"));
	}

	protected Policy(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject policyMendixObject)
	{
		if (policyMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Policy", policyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Policy");

		this.policyMendixObject = policyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Policy.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Policy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Policy.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Policy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Policy(context, mendixObject);
	}

	public static myfirstmodule.proxies.Policy load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Policy.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Policy> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Policy> result = new java.util.ArrayList<myfirstmodule.proxies.Policy>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Policy" + xpathConstraint))
			result.add(myfirstmodule.proxies.Policy.initialize(context, obj));
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
	 * @return value of UseCase
	 */
	public final java.lang.String getUseCase()
	{
		return getUseCase(getContext());
	}

	/**
	 * @param context
	 * @return value of UseCase
	 */
	public final java.lang.String getUseCase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UseCase.toString());
	}

	/**
	 * Set value of UseCase
	 * @param usecase
	 */
	public final void setUseCase(java.lang.String usecase)
	{
		setUseCase(getContext(), usecase);
	}

	/**
	 * Set value of UseCase
	 * @param context
	 * @param usecase
	 */
	public final void setUseCase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String usecase)
	{
		getMendixObject().setValue(context, MemberNames.UseCase.toString(), usecase);
	}

	/**
	 * @return value of Service_Name
	 */
	public final java.lang.String getService_Name()
	{
		return getService_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Name
	 */
	public final java.lang.String getService_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service_Name.toString());
	}

	/**
	 * Set value of Service_Name
	 * @param service_name
	 */
	public final void setService_Name(java.lang.String service_name)
	{
		setService_Name(getContext(), service_name);
	}

	/**
	 * Set value of Service_Name
	 * @param context
	 * @param service_name
	 */
	public final void setService_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service_name)
	{
		getMendixObject().setValue(context, MemberNames.Service_Name.toString(), service_name);
	}

	/**
	 * Set value of Access_Control
	 * @param access_control
	 */
	public final myfirstmodule.proxies.Yes_No getAccess_Control()
	{
		return getAccess_Control(getContext());
	}

	/**
	 * @param context
	 * @return value of Access_Control
	 */
	public final myfirstmodule.proxies.Yes_No getAccess_Control(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Access_Control.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Access_Control
	 * @param access_control
	 */
	public final void setAccess_Control(myfirstmodule.proxies.Yes_No access_control)
	{
		setAccess_Control(getContext(), access_control);
	}

	/**
	 * Set value of Access_Control
	 * @param context
	 * @param access_control
	 */
	public final void setAccess_Control(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No access_control)
	{
		if (access_control != null)
			getMendixObject().setValue(context, MemberNames.Access_Control.toString(), access_control.toString());
		else
			getMendixObject().setValue(context, MemberNames.Access_Control.toString(), null);
	}

	/**
	 * @return value of Authentication
	 */
	public final java.lang.String getAuthentication()
	{
		return getAuthentication(getContext());
	}

	/**
	 * @param context
	 * @return value of Authentication
	 */
	public final java.lang.String getAuthentication(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Authentication.toString());
	}

	/**
	 * Set value of Authentication
	 * @param authentication
	 */
	public final void setAuthentication(java.lang.String authentication)
	{
		setAuthentication(getContext(), authentication);
	}

	/**
	 * Set value of Authentication
	 * @param context
	 * @param authentication
	 */
	public final void setAuthentication(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String authentication)
	{
		getMendixObject().setValue(context, MemberNames.Authentication.toString(), authentication);
	}

	/**
	 * Set value of Concurrent_Rate_Limit
	 * @param concurrent_rate_limit
	 */
	public final myfirstmodule.proxies.Yes_No getConcurrent_Rate_Limit()
	{
		return getConcurrent_Rate_Limit(getContext());
	}

	/**
	 * @param context
	 * @return value of Concurrent_Rate_Limit
	 */
	public final myfirstmodule.proxies.Yes_No getConcurrent_Rate_Limit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Concurrent_Rate_Limit.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Concurrent_Rate_Limit
	 * @param concurrent_rate_limit
	 */
	public final void setConcurrent_Rate_Limit(myfirstmodule.proxies.Yes_No concurrent_rate_limit)
	{
		setConcurrent_Rate_Limit(getContext(), concurrent_rate_limit);
	}

	/**
	 * Set value of Concurrent_Rate_Limit
	 * @param context
	 * @param concurrent_rate_limit
	 */
	public final void setConcurrent_Rate_Limit(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No concurrent_rate_limit)
	{
		if (concurrent_rate_limit != null)
			getMendixObject().setValue(context, MemberNames.Concurrent_Rate_Limit.toString(), concurrent_rate_limit.toString());
		else
			getMendixObject().setValue(context, MemberNames.Concurrent_Rate_Limit.toString(), null);
	}

	/**
	 * Set value of Spike_Arrest
	 * @param spike_arrest
	 */
	public final myfirstmodule.proxies.Yes_No getSpike_Arrest()
	{
		return getSpike_Arrest(getContext());
	}

	/**
	 * @param context
	 * @return value of Spike_Arrest
	 */
	public final myfirstmodule.proxies.Yes_No getSpike_Arrest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Spike_Arrest.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Spike_Arrest
	 * @param spike_arrest
	 */
	public final void setSpike_Arrest(myfirstmodule.proxies.Yes_No spike_arrest)
	{
		setSpike_Arrest(getContext(), spike_arrest);
	}

	/**
	 * Set value of Spike_Arrest
	 * @param context
	 * @param spike_arrest
	 */
	public final void setSpike_Arrest(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No spike_arrest)
	{
		if (spike_arrest != null)
			getMendixObject().setValue(context, MemberNames.Spike_Arrest.toString(), spike_arrest.toString());
		else
			getMendixObject().setValue(context, MemberNames.Spike_Arrest.toString(), null);
	}

	/**
	 * Set value of Validation
	 * @param validation
	 */
	public final myfirstmodule.proxies.Yes_No getValidation()
	{
		return getValidation(getContext());
	}

	/**
	 * @param context
	 * @return value of Validation
	 */
	public final myfirstmodule.proxies.Yes_No getValidation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Validation.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Validation
	 * @param validation
	 */
	public final void setValidation(myfirstmodule.proxies.Yes_No validation)
	{
		setValidation(getContext(), validation);
	}

	/**
	 * Set value of Validation
	 * @param context
	 * @param validation
	 */
	public final void setValidation(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No validation)
	{
		if (validation != null)
			getMendixObject().setValue(context, MemberNames.Validation.toString(), validation.toString());
		else
			getMendixObject().setValue(context, MemberNames.Validation.toString(), null);
	}

	/**
	 * Set value of Statistic_Collector
	 * @param statistic_collector
	 */
	public final myfirstmodule.proxies.Yes_No getStatistic_Collector()
	{
		return getStatistic_Collector(getContext());
	}

	/**
	 * @param context
	 * @return value of Statistic_Collector
	 */
	public final myfirstmodule.proxies.Yes_No getStatistic_Collector(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Statistic_Collector.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Statistic_Collector
	 * @param statistic_collector
	 */
	public final void setStatistic_Collector(myfirstmodule.proxies.Yes_No statistic_collector)
	{
		setStatistic_Collector(getContext(), statistic_collector);
	}

	/**
	 * Set value of Statistic_Collector
	 * @param context
	 * @param statistic_collector
	 */
	public final void setStatistic_Collector(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No statistic_collector)
	{
		if (statistic_collector != null)
			getMendixObject().setValue(context, MemberNames.Statistic_Collector.toString(), statistic_collector.toString());
		else
			getMendixObject().setValue(context, MemberNames.Statistic_Collector.toString(), null);
	}

	/**
	 * Set value of JSON_Thread_Protection
	 * @param json_thread_protection
	 */
	public final myfirstmodule.proxies.Yes_No getJSON_Thread_Protection()
	{
		return getJSON_Thread_Protection(getContext());
	}

	/**
	 * @param context
	 * @return value of JSON_Thread_Protection
	 */
	public final myfirstmodule.proxies.Yes_No getJSON_Thread_Protection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.JSON_Thread_Protection.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of JSON_Thread_Protection
	 * @param json_thread_protection
	 */
	public final void setJSON_Thread_Protection(myfirstmodule.proxies.Yes_No json_thread_protection)
	{
		setJSON_Thread_Protection(getContext(), json_thread_protection);
	}

	/**
	 * Set value of JSON_Thread_Protection
	 * @param context
	 * @param json_thread_protection
	 */
	public final void setJSON_Thread_Protection(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No json_thread_protection)
	{
		if (json_thread_protection != null)
			getMendixObject().setValue(context, MemberNames.JSON_Thread_Protection.toString(), json_thread_protection.toString());
		else
			getMendixObject().setValue(context, MemberNames.JSON_Thread_Protection.toString(), null);
	}

	/**
	 * Set value of Regular_Expression_Protection
	 * @param regular_expression_protection
	 */
	public final myfirstmodule.proxies.Yes_No getRegular_Expression_Protection()
	{
		return getRegular_Expression_Protection(getContext());
	}

	/**
	 * @param context
	 * @return value of Regular_Expression_Protection
	 */
	public final myfirstmodule.proxies.Yes_No getRegular_Expression_Protection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Regular_Expression_Protection.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Regular_Expression_Protection
	 * @param regular_expression_protection
	 */
	public final void setRegular_Expression_Protection(myfirstmodule.proxies.Yes_No regular_expression_protection)
	{
		setRegular_Expression_Protection(getContext(), regular_expression_protection);
	}

	/**
	 * Set value of Regular_Expression_Protection
	 * @param context
	 * @param regular_expression_protection
	 */
	public final void setRegular_Expression_Protection(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No regular_expression_protection)
	{
		if (regular_expression_protection != null)
			getMendixObject().setValue(context, MemberNames.Regular_Expression_Protection.toString(), regular_expression_protection.toString());
		else
			getMendixObject().setValue(context, MemberNames.Regular_Expression_Protection.toString(), null);
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
	 * @return value of Policy_Template
	 */
	public final myfirstmodule.proxies.Template getPolicy_Template() throws com.mendix.core.CoreException
	{
		return getPolicy_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Policy_Template
	 */
	public final myfirstmodule.proxies.Template getPolicy_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Policy_Template.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Policy_Template
	 * @param policy_template
	 */
	public final void setPolicy_Template(myfirstmodule.proxies.Template policy_template)
	{
		setPolicy_Template(getContext(), policy_template);
	}

	/**
	 * Set value of Policy_Template
	 * @param context
	 * @param policy_template
	 */
	public final void setPolicy_Template(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Template policy_template)
	{
		if (policy_template == null)
			getMendixObject().setValue(context, MemberNames.Policy_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Policy_Template.toString(), policy_template.getMendixObject().getId());
	}

	/**
	 * @return value of Policy_Policy_SAV
	 */
	public final myfirstmodule.proxies.Policy_SAV getPolicy_Policy_SAV() throws com.mendix.core.CoreException
	{
		return getPolicy_Policy_SAV(getContext());
	}

	/**
	 * @param context
	 * @return value of Policy_Policy_SAV
	 */
	public final myfirstmodule.proxies.Policy_SAV getPolicy_Policy_SAV(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Policy_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Policy_Policy_SAV.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Policy_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Policy_Policy_SAV
	 * @param policy_policy_sav
	 */
	public final void setPolicy_Policy_SAV(myfirstmodule.proxies.Policy_SAV policy_policy_sav)
	{
		setPolicy_Policy_SAV(getContext(), policy_policy_sav);
	}

	/**
	 * Set value of Policy_Policy_SAV
	 * @param context
	 * @param policy_policy_sav
	 */
	public final void setPolicy_Policy_SAV(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Policy_SAV policy_policy_sav)
	{
		if (policy_policy_sav == null)
			getMendixObject().setValue(context, MemberNames.Policy_Policy_SAV.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Policy_Policy_SAV.toString(), policy_policy_sav.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return policyMendixObject;
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
			final myfirstmodule.proxies.Policy that = (myfirstmodule.proxies.Policy) obj;
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
		return "MyFirstModule.Policy";
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
