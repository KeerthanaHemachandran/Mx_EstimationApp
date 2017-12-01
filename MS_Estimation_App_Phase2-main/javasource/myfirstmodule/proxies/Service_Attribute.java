// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Service_Attribute
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject service_AttributeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Service_Attribute";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Service_id("Service_id"),
		Service_Name("Service_Name"),
		Service_Point("Service_Point"),
		Service_Attribute_Name("Service_Attribute_Name"),
		Service_Attribute_Service_Attribute_Entries("MyFirstModule.Service_Attribute_Service_Attribute_Entries"),
		Service_Attribute_Orchestration_Service("MyFirstModule.Service_Attribute_Orchestration_Service");

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

	public Service_Attribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Service_Attribute"));
	}

	protected Service_Attribute(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject service_AttributeMendixObject)
	{
		if (service_AttributeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Service_Attribute", service_AttributeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Service_Attribute");

		this.service_AttributeMendixObject = service_AttributeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Service_Attribute.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Service_Attribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Service_Attribute.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Service_Attribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Service_Attribute(context, mendixObject);
	}

	public static myfirstmodule.proxies.Service_Attribute load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Service_Attribute.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Service_Attribute> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Service_Attribute> result = new java.util.ArrayList<myfirstmodule.proxies.Service_Attribute>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Service_Attribute" + xpathConstraint))
			result.add(myfirstmodule.proxies.Service_Attribute.initialize(context, obj));
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
	 * @return value of Service_id
	 */
	public final java.lang.Long getService_id()
	{
		return getService_id(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_id
	 */
	public final java.lang.Long getService_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Service_id.toString());
	}

	/**
	 * Set value of Service_id
	 * @param service_id
	 */
	public final void setService_id(java.lang.Long service_id)
	{
		setService_id(getContext(), service_id);
	}

	/**
	 * Set value of Service_id
	 * @param context
	 * @param service_id
	 */
	public final void setService_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long service_id)
	{
		getMendixObject().setValue(context, MemberNames.Service_id.toString(), service_id);
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
	 * @return value of Service_Point
	 */
	public final java.lang.Integer getService_Point()
	{
		return getService_Point(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Point
	 */
	public final java.lang.Integer getService_Point(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Service_Point.toString());
	}

	/**
	 * Set value of Service_Point
	 * @param service_point
	 */
	public final void setService_Point(java.lang.Integer service_point)
	{
		setService_Point(getContext(), service_point);
	}

	/**
	 * Set value of Service_Point
	 * @param context
	 * @param service_point
	 */
	public final void setService_Point(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer service_point)
	{
		getMendixObject().setValue(context, MemberNames.Service_Point.toString(), service_point);
	}

	/**
	 * @return value of Service_Attribute_Name
	 */
	public final java.lang.String getService_Attribute_Name()
	{
		return getService_Attribute_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Attribute_Name
	 */
	public final java.lang.String getService_Attribute_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service_Attribute_Name.toString());
	}

	/**
	 * Set value of Service_Attribute_Name
	 * @param service_attribute_name
	 */
	public final void setService_Attribute_Name(java.lang.String service_attribute_name)
	{
		setService_Attribute_Name(getContext(), service_attribute_name);
	}

	/**
	 * Set value of Service_Attribute_Name
	 * @param context
	 * @param service_attribute_name
	 */
	public final void setService_Attribute_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service_attribute_name)
	{
		getMendixObject().setValue(context, MemberNames.Service_Attribute_Name.toString(), service_attribute_name);
	}

	/**
	 * @return value of Service_Attribute_Service_Attribute_Entries
	 */
	public final myfirstmodule.proxies.Service_Attribute_Entries getService_Attribute_Service_Attribute_Entries() throws com.mendix.core.CoreException
	{
		return getService_Attribute_Service_Attribute_Entries(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Attribute_Service_Attribute_Entries
	 */
	public final myfirstmodule.proxies.Service_Attribute_Entries getService_Attribute_Service_Attribute_Entries(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Service_Attribute_Entries result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Service_Attribute_Service_Attribute_Entries.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Service_Attribute_Entries.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Service_Attribute_Service_Attribute_Entries
	 * @param service_attribute_service_attribute_entries
	 */
	public final void setService_Attribute_Service_Attribute_Entries(myfirstmodule.proxies.Service_Attribute_Entries service_attribute_service_attribute_entries)
	{
		setService_Attribute_Service_Attribute_Entries(getContext(), service_attribute_service_attribute_entries);
	}

	/**
	 * Set value of Service_Attribute_Service_Attribute_Entries
	 * @param context
	 * @param service_attribute_service_attribute_entries
	 */
	public final void setService_Attribute_Service_Attribute_Entries(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Service_Attribute_Entries service_attribute_service_attribute_entries)
	{
		if (service_attribute_service_attribute_entries == null)
			getMendixObject().setValue(context, MemberNames.Service_Attribute_Service_Attribute_Entries.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Service_Attribute_Service_Attribute_Entries.toString(), service_attribute_service_attribute_entries.getMendixObject().getId());
	}

	/**
	 * @return value of Service_Attribute_Orchestration_Service
	 */
	public final myfirstmodule.proxies.Orchestration_Service getService_Attribute_Orchestration_Service() throws com.mendix.core.CoreException
	{
		return getService_Attribute_Orchestration_Service(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Attribute_Orchestration_Service
	 */
	public final myfirstmodule.proxies.Orchestration_Service getService_Attribute_Orchestration_Service(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Orchestration_Service result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Service_Attribute_Orchestration_Service.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Orchestration_Service.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Service_Attribute_Orchestration_Service
	 * @param service_attribute_orchestration_service
	 */
	public final void setService_Attribute_Orchestration_Service(myfirstmodule.proxies.Orchestration_Service service_attribute_orchestration_service)
	{
		setService_Attribute_Orchestration_Service(getContext(), service_attribute_orchestration_service);
	}

	/**
	 * Set value of Service_Attribute_Orchestration_Service
	 * @param context
	 * @param service_attribute_orchestration_service
	 */
	public final void setService_Attribute_Orchestration_Service(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Orchestration_Service service_attribute_orchestration_service)
	{
		if (service_attribute_orchestration_service == null)
			getMendixObject().setValue(context, MemberNames.Service_Attribute_Orchestration_Service.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Service_Attribute_Orchestration_Service.toString(), service_attribute_orchestration_service.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return service_AttributeMendixObject;
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
			final myfirstmodule.proxies.Service_Attribute that = (myfirstmodule.proxies.Service_Attribute) obj;
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
		return "MyFirstModule.Service_Attribute";
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