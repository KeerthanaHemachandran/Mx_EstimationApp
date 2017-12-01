// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Consolidated_Estimate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject consolidated_EstimateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Consolidated_Estimate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Total_Development("Total_Development"),
		Common_Effort("Common_Effort"),
		Contingency("Contingency"),
		Performance_Engineering("Performance_Engineering"),
		Project_Management("Project_Management"),
		Infrastructure("Infrastructure"),
		UAT_Effort("UAT_Effort"),
		Post_Prod_Support("Post_Prod_Support"),
		Training("Training"),
		Total("Total"),
		With_QA("With_QA"),
		TotalQA("TotalQA"),
		Template_Name("Template_Name"),
		Consolidated_Estimate_Template("MyFirstModule.Consolidated_Estimate_Template");

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

	public Consolidated_Estimate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Consolidated_Estimate"));
	}

	protected Consolidated_Estimate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject consolidated_EstimateMendixObject)
	{
		if (consolidated_EstimateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Consolidated_Estimate", consolidated_EstimateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Consolidated_Estimate");

		this.consolidated_EstimateMendixObject = consolidated_EstimateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Consolidated_Estimate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Consolidated_Estimate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Consolidated_Estimate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Consolidated_Estimate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Consolidated_Estimate(context, mendixObject);
	}

	public static myfirstmodule.proxies.Consolidated_Estimate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Consolidated_Estimate.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Consolidated_Estimate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Consolidated_Estimate> result = new java.util.ArrayList<myfirstmodule.proxies.Consolidated_Estimate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Consolidated_Estimate" + xpathConstraint))
			result.add(myfirstmodule.proxies.Consolidated_Estimate.initialize(context, obj));
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
	 * @return value of Total_Development
	 */
	public final java.lang.Integer getTotal_Development()
	{
		return getTotal_Development(getContext());
	}

	/**
	 * @param context
	 * @return value of Total_Development
	 */
	public final java.lang.Integer getTotal_Development(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Total_Development.toString());
	}

	/**
	 * Set value of Total_Development
	 * @param total_development
	 */
	public final void setTotal_Development(java.lang.Integer total_development)
	{
		setTotal_Development(getContext(), total_development);
	}

	/**
	 * Set value of Total_Development
	 * @param context
	 * @param total_development
	 */
	public final void setTotal_Development(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer total_development)
	{
		getMendixObject().setValue(context, MemberNames.Total_Development.toString(), total_development);
	}

	/**
	 * @return value of Common_Effort
	 */
	public final java.lang.Integer getCommon_Effort()
	{
		return getCommon_Effort(getContext());
	}

	/**
	 * @param context
	 * @return value of Common_Effort
	 */
	public final java.lang.Integer getCommon_Effort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Common_Effort.toString());
	}

	/**
	 * Set value of Common_Effort
	 * @param common_effort
	 */
	public final void setCommon_Effort(java.lang.Integer common_effort)
	{
		setCommon_Effort(getContext(), common_effort);
	}

	/**
	 * Set value of Common_Effort
	 * @param context
	 * @param common_effort
	 */
	public final void setCommon_Effort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer common_effort)
	{
		getMendixObject().setValue(context, MemberNames.Common_Effort.toString(), common_effort);
	}

	/**
	 * @return value of Contingency
	 */
	public final java.lang.Integer getContingency()
	{
		return getContingency(getContext());
	}

	/**
	 * @param context
	 * @return value of Contingency
	 */
	public final java.lang.Integer getContingency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Contingency.toString());
	}

	/**
	 * Set value of Contingency
	 * @param contingency
	 */
	public final void setContingency(java.lang.Integer contingency)
	{
		setContingency(getContext(), contingency);
	}

	/**
	 * Set value of Contingency
	 * @param context
	 * @param contingency
	 */
	public final void setContingency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer contingency)
	{
		getMendixObject().setValue(context, MemberNames.Contingency.toString(), contingency);
	}

	/**
	 * @return value of Performance_Engineering
	 */
	public final java.lang.Integer getPerformance_Engineering()
	{
		return getPerformance_Engineering(getContext());
	}

	/**
	 * @param context
	 * @return value of Performance_Engineering
	 */
	public final java.lang.Integer getPerformance_Engineering(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Performance_Engineering.toString());
	}

	/**
	 * Set value of Performance_Engineering
	 * @param performance_engineering
	 */
	public final void setPerformance_Engineering(java.lang.Integer performance_engineering)
	{
		setPerformance_Engineering(getContext(), performance_engineering);
	}

	/**
	 * Set value of Performance_Engineering
	 * @param context
	 * @param performance_engineering
	 */
	public final void setPerformance_Engineering(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer performance_engineering)
	{
		getMendixObject().setValue(context, MemberNames.Performance_Engineering.toString(), performance_engineering);
	}

	/**
	 * @return value of Project_Management
	 */
	public final java.lang.Integer getProject_Management()
	{
		return getProject_Management(getContext());
	}

	/**
	 * @param context
	 * @return value of Project_Management
	 */
	public final java.lang.Integer getProject_Management(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Project_Management.toString());
	}

	/**
	 * Set value of Project_Management
	 * @param project_management
	 */
	public final void setProject_Management(java.lang.Integer project_management)
	{
		setProject_Management(getContext(), project_management);
	}

	/**
	 * Set value of Project_Management
	 * @param context
	 * @param project_management
	 */
	public final void setProject_Management(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer project_management)
	{
		getMendixObject().setValue(context, MemberNames.Project_Management.toString(), project_management);
	}

	/**
	 * @return value of Infrastructure
	 */
	public final java.lang.Integer getInfrastructure()
	{
		return getInfrastructure(getContext());
	}

	/**
	 * @param context
	 * @return value of Infrastructure
	 */
	public final java.lang.Integer getInfrastructure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Infrastructure.toString());
	}

	/**
	 * Set value of Infrastructure
	 * @param infrastructure
	 */
	public final void setInfrastructure(java.lang.Integer infrastructure)
	{
		setInfrastructure(getContext(), infrastructure);
	}

	/**
	 * Set value of Infrastructure
	 * @param context
	 * @param infrastructure
	 */
	public final void setInfrastructure(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer infrastructure)
	{
		getMendixObject().setValue(context, MemberNames.Infrastructure.toString(), infrastructure);
	}

	/**
	 * @return value of UAT_Effort
	 */
	public final java.lang.Integer getUAT_Effort()
	{
		return getUAT_Effort(getContext());
	}

	/**
	 * @param context
	 * @return value of UAT_Effort
	 */
	public final java.lang.Integer getUAT_Effort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UAT_Effort.toString());
	}

	/**
	 * Set value of UAT_Effort
	 * @param uat_effort
	 */
	public final void setUAT_Effort(java.lang.Integer uat_effort)
	{
		setUAT_Effort(getContext(), uat_effort);
	}

	/**
	 * Set value of UAT_Effort
	 * @param context
	 * @param uat_effort
	 */
	public final void setUAT_Effort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer uat_effort)
	{
		getMendixObject().setValue(context, MemberNames.UAT_Effort.toString(), uat_effort);
	}

	/**
	 * @return value of Post_Prod_Support
	 */
	public final java.lang.Integer getPost_Prod_Support()
	{
		return getPost_Prod_Support(getContext());
	}

	/**
	 * @param context
	 * @return value of Post_Prod_Support
	 */
	public final java.lang.Integer getPost_Prod_Support(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Post_Prod_Support.toString());
	}

	/**
	 * Set value of Post_Prod_Support
	 * @param post_prod_support
	 */
	public final void setPost_Prod_Support(java.lang.Integer post_prod_support)
	{
		setPost_Prod_Support(getContext(), post_prod_support);
	}

	/**
	 * Set value of Post_Prod_Support
	 * @param context
	 * @param post_prod_support
	 */
	public final void setPost_Prod_Support(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer post_prod_support)
	{
		getMendixObject().setValue(context, MemberNames.Post_Prod_Support.toString(), post_prod_support);
	}

	/**
	 * @return value of Training
	 */
	public final java.lang.Integer getTraining()
	{
		return getTraining(getContext());
	}

	/**
	 * @param context
	 * @return value of Training
	 */
	public final java.lang.Integer getTraining(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Training.toString());
	}

	/**
	 * Set value of Training
	 * @param training
	 */
	public final void setTraining(java.lang.Integer training)
	{
		setTraining(getContext(), training);
	}

	/**
	 * Set value of Training
	 * @param context
	 * @param training
	 */
	public final void setTraining(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer training)
	{
		getMendixObject().setValue(context, MemberNames.Training.toString(), training);
	}

	/**
	 * @return value of Total
	 */
	public final java.math.BigDecimal getTotal()
	{
		return getTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of Total
	 */
	public final java.math.BigDecimal getTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Total.toString());
	}

	/**
	 * Set value of Total
	 * @param total
	 */
	public final void setTotal(java.math.BigDecimal total)
	{
		setTotal(getContext(), total);
	}

	/**
	 * Set value of Total
	 * @param context
	 * @param total
	 */
	public final void setTotal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal total)
	{
		getMendixObject().setValue(context, MemberNames.Total.toString(), total);
	}

	/**
	 * @return value of With_QA
	 */
	public final java.lang.Integer getWith_QA()
	{
		return getWith_QA(getContext());
	}

	/**
	 * @param context
	 * @return value of With_QA
	 */
	public final java.lang.Integer getWith_QA(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.With_QA.toString());
	}

	/**
	 * Set value of With_QA
	 * @param with_qa
	 */
	public final void setWith_QA(java.lang.Integer with_qa)
	{
		setWith_QA(getContext(), with_qa);
	}

	/**
	 * Set value of With_QA
	 * @param context
	 * @param with_qa
	 */
	public final void setWith_QA(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer with_qa)
	{
		getMendixObject().setValue(context, MemberNames.With_QA.toString(), with_qa);
	}

	/**
	 * @return value of TotalQA
	 */
	public final java.lang.Integer getTotalQA()
	{
		return getTotalQA(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalQA
	 */
	public final java.lang.Integer getTotalQA(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TotalQA.toString());
	}

	/**
	 * Set value of TotalQA
	 * @param totalqa
	 */
	public final void setTotalQA(java.lang.Integer totalqa)
	{
		setTotalQA(getContext(), totalqa);
	}

	/**
	 * Set value of TotalQA
	 * @param context
	 * @param totalqa
	 */
	public final void setTotalQA(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totalqa)
	{
		getMendixObject().setValue(context, MemberNames.TotalQA.toString(), totalqa);
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
	 * @return value of Consolidated_Estimate_Template
	 */
	public final myfirstmodule.proxies.Template getConsolidated_Estimate_Template() throws com.mendix.core.CoreException
	{
		return getConsolidated_Estimate_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Consolidated_Estimate_Template
	 */
	public final myfirstmodule.proxies.Template getConsolidated_Estimate_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Consolidated_Estimate_Template.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Consolidated_Estimate_Template
	 * @param consolidated_estimate_template
	 */
	public final void setConsolidated_Estimate_Template(myfirstmodule.proxies.Template consolidated_estimate_template)
	{
		setConsolidated_Estimate_Template(getContext(), consolidated_estimate_template);
	}

	/**
	 * Set value of Consolidated_Estimate_Template
	 * @param context
	 * @param consolidated_estimate_template
	 */
	public final void setConsolidated_Estimate_Template(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Template consolidated_estimate_template)
	{
		if (consolidated_estimate_template == null)
			getMendixObject().setValue(context, MemberNames.Consolidated_Estimate_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Consolidated_Estimate_Template.toString(), consolidated_estimate_template.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return consolidated_EstimateMendixObject;
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
			final myfirstmodule.proxies.Consolidated_Estimate that = (myfirstmodule.proxies.Consolidated_Estimate) obj;
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
		return "MyFirstModule.Consolidated_Estimate";
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
