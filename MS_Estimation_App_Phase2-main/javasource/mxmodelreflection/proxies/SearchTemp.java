// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class SearchTemp
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchTempMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.SearchTemp";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Module("Module"),
		Entity("Entity"),
		Persistence("Persistence");

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

	public SearchTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxModelReflection.SearchTemp"));
	}

	protected SearchTemp(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchTempMendixObject)
	{
		if (searchTempMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxModelReflection.SearchTemp", searchTempMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxModelReflection.SearchTemp");

		this.searchTempMendixObject = searchTempMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SearchTemp.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.SearchTemp initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.SearchTemp.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.SearchTemp initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.SearchTemp(context, mendixObject);
	}

	public static mxmodelreflection.proxies.SearchTemp load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.SearchTemp.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.SearchTemp> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.SearchTemp> result = new java.util.ArrayList<mxmodelreflection.proxies.SearchTemp>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxModelReflection.SearchTemp" + xpathConstraint))
			result.add(mxmodelreflection.proxies.SearchTemp.initialize(context, obj));
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
	 * @return value of Module
	 */
	public final java.lang.String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final java.lang.String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(java.lang.String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of Entity
	 */
	public final java.lang.String getEntity()
	{
		return getEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity
	 */
	public final java.lang.String getEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Entity.toString());
	}

	/**
	 * Set value of Entity
	 * @param entity
	 */
	public final void setEntity(java.lang.String entity)
	{
		setEntity(getContext(), entity);
	}

	/**
	 * Set value of Entity
	 * @param context
	 * @param entity
	 */
	public final void setEntity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String entity)
	{
		getMendixObject().setValue(context, MemberNames.Entity.toString(), entity);
	}

	/**
	 * @return value of Persistence
	 */
	public final java.lang.String getPersistence()
	{
		return getPersistence(getContext());
	}

	/**
	 * @param context
	 * @return value of Persistence
	 */
	public final java.lang.String getPersistence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Persistence.toString());
	}

	/**
	 * Set value of Persistence
	 * @param persistence
	 */
	public final void setPersistence(java.lang.String persistence)
	{
		setPersistence(getContext(), persistence);
	}

	/**
	 * Set value of Persistence
	 * @param context
	 * @param persistence
	 */
	public final void setPersistence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String persistence)
	{
		getMendixObject().setValue(context, MemberNames.Persistence.toString(), persistence);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchTempMendixObject;
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
			final mxmodelreflection.proxies.SearchTemp that = (mxmodelreflection.proxies.SearchTemp) obj;
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
		return "MxModelReflection.SearchTemp";
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
