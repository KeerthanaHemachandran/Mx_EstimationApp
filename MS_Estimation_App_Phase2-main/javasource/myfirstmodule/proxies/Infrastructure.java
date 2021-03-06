// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Infrastructure
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject infrastructureMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Infrastructure";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Multi_data_center_Deployment("Multi_data_center_Deployment"),
		Geo_Load_Balancer_Required("Geo_Load_Balancer_Required"),
		Auto_Scaling("Auto_Scaling"),
		Performance("Performance"),
		Complexity("Complexity"),
		Complexity_In_percentage("Complexity_In_percentage"),
		Template_Name("Template_Name"),
		Infrastructure_Template("MyFirstModule.Infrastructure_Template"),
		Infrastructure_Infrastructure("MyFirstModule.Infrastructure_Infrastructure"),
		Infrastructure_Infrastructure_SAV("MyFirstModule.Infrastructure_Infrastructure_SAV");

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

	public Infrastructure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Infrastructure"));
	}

	protected Infrastructure(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject infrastructureMendixObject)
	{
		if (infrastructureMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Infrastructure", infrastructureMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Infrastructure");

		this.infrastructureMendixObject = infrastructureMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Infrastructure.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Infrastructure initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Infrastructure.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Infrastructure initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Infrastructure(context, mendixObject);
	}

	public static myfirstmodule.proxies.Infrastructure load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Infrastructure.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Infrastructure> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Infrastructure> result = new java.util.ArrayList<myfirstmodule.proxies.Infrastructure>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Infrastructure" + xpathConstraint))
			result.add(myfirstmodule.proxies.Infrastructure.initialize(context, obj));
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
	 * Set value of Multi_data_center_Deployment
	 * @param multi_data_center_deployment
	 */
	public final myfirstmodule.proxies.Yes_No getMulti_data_center_Deployment()
	{
		return getMulti_data_center_Deployment(getContext());
	}

	/**
	 * @param context
	 * @return value of Multi_data_center_Deployment
	 */
	public final myfirstmodule.proxies.Yes_No getMulti_data_center_Deployment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Multi_data_center_Deployment.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Multi_data_center_Deployment
	 * @param multi_data_center_deployment
	 */
	public final void setMulti_data_center_Deployment(myfirstmodule.proxies.Yes_No multi_data_center_deployment)
	{
		setMulti_data_center_Deployment(getContext(), multi_data_center_deployment);
	}

	/**
	 * Set value of Multi_data_center_Deployment
	 * @param context
	 * @param multi_data_center_deployment
	 */
	public final void setMulti_data_center_Deployment(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No multi_data_center_deployment)
	{
		if (multi_data_center_deployment != null)
			getMendixObject().setValue(context, MemberNames.Multi_data_center_Deployment.toString(), multi_data_center_deployment.toString());
		else
			getMendixObject().setValue(context, MemberNames.Multi_data_center_Deployment.toString(), null);
	}

	/**
	 * Set value of Geo_Load_Balancer_Required
	 * @param geo_load_balancer_required
	 */
	public final myfirstmodule.proxies.Yes_No getGeo_Load_Balancer_Required()
	{
		return getGeo_Load_Balancer_Required(getContext());
	}

	/**
	 * @param context
	 * @return value of Geo_Load_Balancer_Required
	 */
	public final myfirstmodule.proxies.Yes_No getGeo_Load_Balancer_Required(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Geo_Load_Balancer_Required.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Geo_Load_Balancer_Required
	 * @param geo_load_balancer_required
	 */
	public final void setGeo_Load_Balancer_Required(myfirstmodule.proxies.Yes_No geo_load_balancer_required)
	{
		setGeo_Load_Balancer_Required(getContext(), geo_load_balancer_required);
	}

	/**
	 * Set value of Geo_Load_Balancer_Required
	 * @param context
	 * @param geo_load_balancer_required
	 */
	public final void setGeo_Load_Balancer_Required(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No geo_load_balancer_required)
	{
		if (geo_load_balancer_required != null)
			getMendixObject().setValue(context, MemberNames.Geo_Load_Balancer_Required.toString(), geo_load_balancer_required.toString());
		else
			getMendixObject().setValue(context, MemberNames.Geo_Load_Balancer_Required.toString(), null);
	}

	/**
	 * Set value of Auto_Scaling
	 * @param auto_scaling
	 */
	public final myfirstmodule.proxies.Yes_No getAuto_Scaling()
	{
		return getAuto_Scaling(getContext());
	}

	/**
	 * @param context
	 * @return value of Auto_Scaling
	 */
	public final myfirstmodule.proxies.Yes_No getAuto_Scaling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Auto_Scaling.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Yes_No.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Auto_Scaling
	 * @param auto_scaling
	 */
	public final void setAuto_Scaling(myfirstmodule.proxies.Yes_No auto_scaling)
	{
		setAuto_Scaling(getContext(), auto_scaling);
	}

	/**
	 * Set value of Auto_Scaling
	 * @param context
	 * @param auto_scaling
	 */
	public final void setAuto_Scaling(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Yes_No auto_scaling)
	{
		if (auto_scaling != null)
			getMendixObject().setValue(context, MemberNames.Auto_Scaling.toString(), auto_scaling.toString());
		else
			getMendixObject().setValue(context, MemberNames.Auto_Scaling.toString(), null);
	}

	/**
	 * Set value of Performance
	 * @param performance
	 */
	public final myfirstmodule.proxies.Performance getPerformance()
	{
		return getPerformance(getContext());
	}

	/**
	 * @param context
	 * @return value of Performance
	 */
	public final myfirstmodule.proxies.Performance getPerformance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Performance.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Performance.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Performance
	 * @param performance
	 */
	public final void setPerformance(myfirstmodule.proxies.Performance performance)
	{
		setPerformance(getContext(), performance);
	}

	/**
	 * Set value of Performance
	 * @param context
	 * @param performance
	 */
	public final void setPerformance(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Performance performance)
	{
		if (performance != null)
			getMendixObject().setValue(context, MemberNames.Performance.toString(), performance.toString());
		else
			getMendixObject().setValue(context, MemberNames.Performance.toString(), null);
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
	 * @return value of Complexity_In_percentage
	 */
	public final java.math.BigDecimal getComplexity_In_percentage()
	{
		return getComplexity_In_percentage(getContext());
	}

	/**
	 * @param context
	 * @return value of Complexity_In_percentage
	 */
	public final java.math.BigDecimal getComplexity_In_percentage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Complexity_In_percentage.toString());
	}

	/**
	 * Set value of Complexity_In_percentage
	 * @param complexity_in_percentage
	 */
	public final void setComplexity_In_percentage(java.math.BigDecimal complexity_in_percentage)
	{
		setComplexity_In_percentage(getContext(), complexity_in_percentage);
	}

	/**
	 * Set value of Complexity_In_percentage
	 * @param context
	 * @param complexity_in_percentage
	 */
	public final void setComplexity_In_percentage(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal complexity_in_percentage)
	{
		getMendixObject().setValue(context, MemberNames.Complexity_In_percentage.toString(), complexity_in_percentage);
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
	 * @return value of Infrastructure_Template
	 */
	public final myfirstmodule.proxies.Template getInfrastructure_Template() throws com.mendix.core.CoreException
	{
		return getInfrastructure_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Infrastructure_Template
	 */
	public final myfirstmodule.proxies.Template getInfrastructure_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Infrastructure_Template.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Infrastructure_Template
	 * @param infrastructure_template
	 */
	public final void setInfrastructure_Template(myfirstmodule.proxies.Template infrastructure_template)
	{
		setInfrastructure_Template(getContext(), infrastructure_template);
	}

	/**
	 * Set value of Infrastructure_Template
	 * @param context
	 * @param infrastructure_template
	 */
	public final void setInfrastructure_Template(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Template infrastructure_template)
	{
		if (infrastructure_template == null)
			getMendixObject().setValue(context, MemberNames.Infrastructure_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Infrastructure_Template.toString(), infrastructure_template.getMendixObject().getId());
	}

	/**
	 * @return value of Infrastructure_Infrastructure
	 */
	public final myfirstmodule.proxies.Infrastructure getInfrastructure_Infrastructure() throws com.mendix.core.CoreException
	{
		return getInfrastructure_Infrastructure(getContext());
	}

	/**
	 * @param context
	 * @return value of Infrastructure_Infrastructure
	 */
	public final myfirstmodule.proxies.Infrastructure getInfrastructure_Infrastructure(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Infrastructure result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Infrastructure_Infrastructure.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Infrastructure.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Infrastructure_Infrastructure
	 * @param infrastructure_infrastructure
	 */
	public final void setInfrastructure_Infrastructure(myfirstmodule.proxies.Infrastructure infrastructure_infrastructure)
	{
		setInfrastructure_Infrastructure(getContext(), infrastructure_infrastructure);
	}

	/**
	 * Set value of Infrastructure_Infrastructure
	 * @param context
	 * @param infrastructure_infrastructure
	 */
	public final void setInfrastructure_Infrastructure(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Infrastructure infrastructure_infrastructure)
	{
		if (infrastructure_infrastructure == null)
			getMendixObject().setValue(context, MemberNames.Infrastructure_Infrastructure.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Infrastructure_Infrastructure.toString(), infrastructure_infrastructure.getMendixObject().getId());
	}

	/**
	 * @return value of Infrastructure_Infrastructure_SAV
	 */
	public final myfirstmodule.proxies.Infrastructure_SAV getInfrastructure_Infrastructure_SAV() throws com.mendix.core.CoreException
	{
		return getInfrastructure_Infrastructure_SAV(getContext());
	}

	/**
	 * @param context
	 * @return value of Infrastructure_Infrastructure_SAV
	 */
	public final myfirstmodule.proxies.Infrastructure_SAV getInfrastructure_Infrastructure_SAV(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Infrastructure_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Infrastructure_Infrastructure_SAV.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Infrastructure_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Infrastructure_Infrastructure_SAV
	 * @param infrastructure_infrastructure_sav
	 */
	public final void setInfrastructure_Infrastructure_SAV(myfirstmodule.proxies.Infrastructure_SAV infrastructure_infrastructure_sav)
	{
		setInfrastructure_Infrastructure_SAV(getContext(), infrastructure_infrastructure_sav);
	}

	/**
	 * Set value of Infrastructure_Infrastructure_SAV
	 * @param context
	 * @param infrastructure_infrastructure_sav
	 */
	public final void setInfrastructure_Infrastructure_SAV(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Infrastructure_SAV infrastructure_infrastructure_sav)
	{
		if (infrastructure_infrastructure_sav == null)
			getMendixObject().setValue(context, MemberNames.Infrastructure_Infrastructure_SAV.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Infrastructure_Infrastructure_SAV.toString(), infrastructure_infrastructure_sav.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return infrastructureMendixObject;
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
			final myfirstmodule.proxies.Infrastructure that = (myfirstmodule.proxies.Infrastructure) obj;
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
		return "MyFirstModule.Infrastructure";
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
