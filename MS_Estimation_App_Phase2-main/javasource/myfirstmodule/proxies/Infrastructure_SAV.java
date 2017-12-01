// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Infrastructure_SAV
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject infrastructure_SAVMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Infrastructure_SAV";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value_Point("Value_Point"),
		Value_Name("Value_Name"),
		Service_Name("Service_Name"),
		Service_Attribute("Service_Attribute"),
		Infrastructure_SAV_Template("MyFirstModule.Infrastructure_SAV_Template");

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

	public Infrastructure_SAV(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Infrastructure_SAV"));
	}

	protected Infrastructure_SAV(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject infrastructure_SAVMendixObject)
	{
		if (infrastructure_SAVMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Infrastructure_SAV", infrastructure_SAVMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Infrastructure_SAV");

		this.infrastructure_SAVMendixObject = infrastructure_SAVMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Infrastructure_SAV.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Infrastructure_SAV initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Infrastructure_SAV.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Infrastructure_SAV initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Infrastructure_SAV(context, mendixObject);
	}

	public static myfirstmodule.proxies.Infrastructure_SAV load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Infrastructure_SAV.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Infrastructure_SAV> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Infrastructure_SAV> result = new java.util.ArrayList<myfirstmodule.proxies.Infrastructure_SAV>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Infrastructure_SAV" + xpathConstraint))
			result.add(myfirstmodule.proxies.Infrastructure_SAV.initialize(context, obj));
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
	 * @return value of Value_Point
	 */
	public final java.math.BigDecimal getValue_Point()
	{
		return getValue_Point(getContext());
	}

	/**
	 * @param context
	 * @return value of Value_Point
	 */
	public final java.math.BigDecimal getValue_Point(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Value_Point.toString());
	}

	/**
	 * Set value of Value_Point
	 * @param value_point
	 */
	public final void setValue_Point(java.math.BigDecimal value_point)
	{
		setValue_Point(getContext(), value_point);
	}

	/**
	 * Set value of Value_Point
	 * @param context
	 * @param value_point
	 */
	public final void setValue_Point(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal value_point)
	{
		getMendixObject().setValue(context, MemberNames.Value_Point.toString(), value_point);
	}

	/**
	 * @return value of Value_Name
	 */
	public final java.lang.String getValue_Name()
	{
		return getValue_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Value_Name
	 */
	public final java.lang.String getValue_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value_Name.toString());
	}

	/**
	 * Set value of Value_Name
	 * @param value_name
	 */
	public final void setValue_Name(java.lang.String value_name)
	{
		setValue_Name(getContext(), value_name);
	}

	/**
	 * Set value of Value_Name
	 * @param context
	 * @param value_name
	 */
	public final void setValue_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value_name)
	{
		getMendixObject().setValue(context, MemberNames.Value_Name.toString(), value_name);
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
	 * @return value of Service_Attribute
	 */
	public final java.lang.String getService_Attribute()
	{
		return getService_Attribute(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Attribute
	 */
	public final java.lang.String getService_Attribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service_Attribute.toString());
	}

	/**
	 * Set value of Service_Attribute
	 * @param service_attribute
	 */
	public final void setService_Attribute(java.lang.String service_attribute)
	{
		setService_Attribute(getContext(), service_attribute);
	}

	/**
	 * Set value of Service_Attribute
	 * @param context
	 * @param service_attribute
	 */
	public final void setService_Attribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service_attribute)
	{
		getMendixObject().setValue(context, MemberNames.Service_Attribute.toString(), service_attribute);
	}

	/**
	 * @return value of Infrastructure_SAV_Template
	 */
	public final myfirstmodule.proxies.Template getInfrastructure_SAV_Template() throws com.mendix.core.CoreException
	{
		return getInfrastructure_SAV_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Infrastructure_SAV_Template
	 */
	public final myfirstmodule.proxies.Template getInfrastructure_SAV_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Infrastructure_SAV_Template.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Infrastructure_SAV_Template
	 * @param infrastructure_sav_template
	 */
	public final void setInfrastructure_SAV_Template(myfirstmodule.proxies.Template infrastructure_sav_template)
	{
		setInfrastructure_SAV_Template(getContext(), infrastructure_sav_template);
	}

	/**
	 * Set value of Infrastructure_SAV_Template
	 * @param context
	 * @param infrastructure_sav_template
	 */
	public final void setInfrastructure_SAV_Template(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Template infrastructure_sav_template)
	{
		if (infrastructure_sav_template == null)
			getMendixObject().setValue(context, MemberNames.Infrastructure_SAV_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Infrastructure_SAV_Template.toString(), infrastructure_sav_template.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return infrastructure_SAVMendixObject;
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
			final myfirstmodule.proxies.Infrastructure_SAV that = (myfirstmodule.proxies.Infrastructure_SAV) obj;
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
		return "MyFirstModule.Infrastructure_SAV";
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