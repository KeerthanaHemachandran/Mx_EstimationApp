// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Tech_Stack
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tech_StackMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Tech_Stack";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UseCase("UseCase"),
		Service_name("Service_name"),
		Platform("Platform"),
		Language("Language"),
		Runtime("Runtime"),
		Runtime_Type("Runtime_Type"),
		Database("Database"),
		Message_Queue("Message_Queue"),
		CI("CI"),
		CD("CD"),
		Framework("Framework"),
		Complexity("Complexity"),
		Complexity_In_Percentage("Complexity_In_Percentage"),
		UC("UC"),
		Template_Name("Template_Name"),
		Tech_Stack_Template("MyFirstModule.Tech_Stack_Template"),
		Tech_Stack_SAV_platform("MyFirstModule.Tech_Stack_SAV_platform"),
		Tech_Stack_SAV_Lang("MyFirstModule.Tech_Stack_SAV_Lang"),
		Tech_Stack_SAV_runtime("MyFirstModule.Tech_Stack_SAV_runtime"),
		Tech_Stack_SAV_runtype("MyFirstModule.Tech_Stack_SAV_runtype"),
		Tech_Stack_SAV_database("MyFirstModule.Tech_Stack_SAV_database"),
		Tech_Stack_Tech_Stack_SAV_message("MyFirstModule.Tech_Stack_Tech_Stack_SAV_message"),
		Tech_Stack_SAV_CI("MyFirstModule.Tech_Stack_SAV_CI"),
		Tech_Stack_SAV_CD("MyFirstModule.Tech_Stack_SAV_CD"),
		Tech_Stack_SAV_framework("MyFirstModule.Tech_Stack_SAV_framework");

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

	public Tech_Stack(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Tech_Stack"));
	}

	protected Tech_Stack(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tech_StackMendixObject)
	{
		if (tech_StackMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Tech_Stack", tech_StackMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Tech_Stack");

		this.tech_StackMendixObject = tech_StackMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Tech_Stack.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Tech_Stack initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Tech_Stack.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Tech_Stack initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Tech_Stack(context, mendixObject);
	}

	public static myfirstmodule.proxies.Tech_Stack load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Tech_Stack.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Tech_Stack> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Tech_Stack> result = new java.util.ArrayList<myfirstmodule.proxies.Tech_Stack>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Tech_Stack" + xpathConstraint))
			result.add(myfirstmodule.proxies.Tech_Stack.initialize(context, obj));
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
	 * @return value of Service_name
	 */
	public final java.lang.String getService_name()
	{
		return getService_name(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_name
	 */
	public final java.lang.String getService_name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service_name.toString());
	}

	/**
	 * Set value of Service_name
	 * @param service_name
	 */
	public final void setService_name(java.lang.String service_name)
	{
		setService_name(getContext(), service_name);
	}

	/**
	 * Set value of Service_name
	 * @param context
	 * @param service_name
	 */
	public final void setService_name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service_name)
	{
		getMendixObject().setValue(context, MemberNames.Service_name.toString(), service_name);
	}

	/**
	 * @return value of Platform
	 */
	public final java.lang.String getPlatform()
	{
		return getPlatform(getContext());
	}

	/**
	 * @param context
	 * @return value of Platform
	 */
	public final java.lang.String getPlatform(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Platform.toString());
	}

	/**
	 * Set value of Platform
	 * @param platform
	 */
	public final void setPlatform(java.lang.String platform)
	{
		setPlatform(getContext(), platform);
	}

	/**
	 * Set value of Platform
	 * @param context
	 * @param platform
	 */
	public final void setPlatform(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String platform)
	{
		getMendixObject().setValue(context, MemberNames.Platform.toString(), platform);
	}

	/**
	 * @return value of Language
	 */
	public final java.lang.String getLanguage()
	{
		return getLanguage(getContext());
	}

	/**
	 * @param context
	 * @return value of Language
	 */
	public final java.lang.String getLanguage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Language.toString());
	}

	/**
	 * Set value of Language
	 * @param language
	 */
	public final void setLanguage(java.lang.String language)
	{
		setLanguage(getContext(), language);
	}

	/**
	 * Set value of Language
	 * @param context
	 * @param language
	 */
	public final void setLanguage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String language)
	{
		getMendixObject().setValue(context, MemberNames.Language.toString(), language);
	}

	/**
	 * @return value of Runtime
	 */
	public final java.lang.String getRuntime()
	{
		return getRuntime(getContext());
	}

	/**
	 * @param context
	 * @return value of Runtime
	 */
	public final java.lang.String getRuntime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Runtime.toString());
	}

	/**
	 * Set value of Runtime
	 * @param runtime
	 */
	public final void setRuntime(java.lang.String runtime)
	{
		setRuntime(getContext(), runtime);
	}

	/**
	 * Set value of Runtime
	 * @param context
	 * @param runtime
	 */
	public final void setRuntime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String runtime)
	{
		getMendixObject().setValue(context, MemberNames.Runtime.toString(), runtime);
	}

	/**
	 * @return value of Runtime_Type
	 */
	public final java.lang.String getRuntime_Type()
	{
		return getRuntime_Type(getContext());
	}

	/**
	 * @param context
	 * @return value of Runtime_Type
	 */
	public final java.lang.String getRuntime_Type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Runtime_Type.toString());
	}

	/**
	 * Set value of Runtime_Type
	 * @param runtime_type
	 */
	public final void setRuntime_Type(java.lang.String runtime_type)
	{
		setRuntime_Type(getContext(), runtime_type);
	}

	/**
	 * Set value of Runtime_Type
	 * @param context
	 * @param runtime_type
	 */
	public final void setRuntime_Type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String runtime_type)
	{
		getMendixObject().setValue(context, MemberNames.Runtime_Type.toString(), runtime_type);
	}

	/**
	 * @return value of Database
	 */
	public final java.lang.String getDatabase()
	{
		return getDatabase(getContext());
	}

	/**
	 * @param context
	 * @return value of Database
	 */
	public final java.lang.String getDatabase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Database.toString());
	}

	/**
	 * Set value of Database
	 * @param database
	 */
	public final void setDatabase(java.lang.String database)
	{
		setDatabase(getContext(), database);
	}

	/**
	 * Set value of Database
	 * @param context
	 * @param database
	 */
	public final void setDatabase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String database)
	{
		getMendixObject().setValue(context, MemberNames.Database.toString(), database);
	}

	/**
	 * @return value of Message_Queue
	 */
	public final java.lang.String getMessage_Queue()
	{
		return getMessage_Queue(getContext());
	}

	/**
	 * @param context
	 * @return value of Message_Queue
	 */
	public final java.lang.String getMessage_Queue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message_Queue.toString());
	}

	/**
	 * Set value of Message_Queue
	 * @param message_queue
	 */
	public final void setMessage_Queue(java.lang.String message_queue)
	{
		setMessage_Queue(getContext(), message_queue);
	}

	/**
	 * Set value of Message_Queue
	 * @param context
	 * @param message_queue
	 */
	public final void setMessage_Queue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message_queue)
	{
		getMendixObject().setValue(context, MemberNames.Message_Queue.toString(), message_queue);
	}

	/**
	 * @return value of CI
	 */
	public final java.lang.String getCI()
	{
		return getCI(getContext());
	}

	/**
	 * @param context
	 * @return value of CI
	 */
	public final java.lang.String getCI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CI.toString());
	}

	/**
	 * Set value of CI
	 * @param ci
	 */
	public final void setCI(java.lang.String ci)
	{
		setCI(getContext(), ci);
	}

	/**
	 * Set value of CI
	 * @param context
	 * @param ci
	 */
	public final void setCI(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ci)
	{
		getMendixObject().setValue(context, MemberNames.CI.toString(), ci);
	}

	/**
	 * @return value of CD
	 */
	public final java.lang.String getCD()
	{
		return getCD(getContext());
	}

	/**
	 * @param context
	 * @return value of CD
	 */
	public final java.lang.String getCD(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CD.toString());
	}

	/**
	 * Set value of CD
	 * @param cd
	 */
	public final void setCD(java.lang.String cd)
	{
		setCD(getContext(), cd);
	}

	/**
	 * Set value of CD
	 * @param context
	 * @param cd
	 */
	public final void setCD(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cd)
	{
		getMendixObject().setValue(context, MemberNames.CD.toString(), cd);
	}

	/**
	 * @return value of Framework
	 */
	public final java.lang.String getFramework()
	{
		return getFramework(getContext());
	}

	/**
	 * @param context
	 * @return value of Framework
	 */
	public final java.lang.String getFramework(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Framework.toString());
	}

	/**
	 * Set value of Framework
	 * @param framework
	 */
	public final void setFramework(java.lang.String framework)
	{
		setFramework(getContext(), framework);
	}

	/**
	 * Set value of Framework
	 * @param context
	 * @param framework
	 */
	public final void setFramework(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String framework)
	{
		getMendixObject().setValue(context, MemberNames.Framework.toString(), framework);
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
	 * @return value of UC
	 */
	public final java.lang.Long getUC()
	{
		return getUC(getContext());
	}

	/**
	 * @param context
	 * @return value of UC
	 */
	public final java.lang.Long getUC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.UC.toString());
	}

	/**
	 * Set value of UC
	 * @param uc
	 */
	public final void setUC(java.lang.Long uc)
	{
		setUC(getContext(), uc);
	}

	/**
	 * Set value of UC
	 * @param context
	 * @param uc
	 */
	public final void setUC(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long uc)
	{
		getMendixObject().setValue(context, MemberNames.UC.toString(), uc);
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
	 * @return value of Tech_Stack_Template
	 */
	public final myfirstmodule.proxies.Template getTech_Stack_Template() throws com.mendix.core.CoreException
	{
		return getTech_Stack_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_Template
	 */
	public final myfirstmodule.proxies.Template getTech_Stack_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_Template.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_Template
	 * @param tech_stack_template
	 */
	public final void setTech_Stack_Template(myfirstmodule.proxies.Template tech_stack_template)
	{
		setTech_Stack_Template(getContext(), tech_stack_template);
	}

	/**
	 * Set value of Tech_Stack_Template
	 * @param context
	 * @param tech_stack_template
	 */
	public final void setTech_Stack_Template(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Template tech_stack_template)
	{
		if (tech_stack_template == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_Template.toString(), tech_stack_template.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_platform
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_platform() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_platform(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_platform
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_platform(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_platform.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_platform
	 * @param tech_stack_sav_platform
	 */
	public final void setTech_Stack_SAV_platform(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_platform)
	{
		setTech_Stack_SAV_platform(getContext(), tech_stack_sav_platform);
	}

	/**
	 * Set value of Tech_Stack_SAV_platform
	 * @param context
	 * @param tech_stack_sav_platform
	 */
	public final void setTech_Stack_SAV_platform(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_platform)
	{
		if (tech_stack_sav_platform == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_platform.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_platform.toString(), tech_stack_sav_platform.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_Lang
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_Lang() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_Lang(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_Lang
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_Lang(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_Lang.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_Lang
	 * @param tech_stack_sav_lang
	 */
	public final void setTech_Stack_SAV_Lang(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_lang)
	{
		setTech_Stack_SAV_Lang(getContext(), tech_stack_sav_lang);
	}

	/**
	 * Set value of Tech_Stack_SAV_Lang
	 * @param context
	 * @param tech_stack_sav_lang
	 */
	public final void setTech_Stack_SAV_Lang(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_lang)
	{
		if (tech_stack_sav_lang == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_Lang.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_Lang.toString(), tech_stack_sav_lang.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_runtime
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_runtime() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_runtime(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_runtime
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_runtime(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_runtime.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_runtime
	 * @param tech_stack_sav_runtime
	 */
	public final void setTech_Stack_SAV_runtime(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_runtime)
	{
		setTech_Stack_SAV_runtime(getContext(), tech_stack_sav_runtime);
	}

	/**
	 * Set value of Tech_Stack_SAV_runtime
	 * @param context
	 * @param tech_stack_sav_runtime
	 */
	public final void setTech_Stack_SAV_runtime(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_runtime)
	{
		if (tech_stack_sav_runtime == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_runtime.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_runtime.toString(), tech_stack_sav_runtime.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_runtype
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_runtype() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_runtype(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_runtype
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_runtype(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_runtype.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_runtype
	 * @param tech_stack_sav_runtype
	 */
	public final void setTech_Stack_SAV_runtype(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_runtype)
	{
		setTech_Stack_SAV_runtype(getContext(), tech_stack_sav_runtype);
	}

	/**
	 * Set value of Tech_Stack_SAV_runtype
	 * @param context
	 * @param tech_stack_sav_runtype
	 */
	public final void setTech_Stack_SAV_runtype(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_runtype)
	{
		if (tech_stack_sav_runtype == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_runtype.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_runtype.toString(), tech_stack_sav_runtype.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_database
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_database() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_database(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_database
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_database(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_database.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_database
	 * @param tech_stack_sav_database
	 */
	public final void setTech_Stack_SAV_database(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_database)
	{
		setTech_Stack_SAV_database(getContext(), tech_stack_sav_database);
	}

	/**
	 * Set value of Tech_Stack_SAV_database
	 * @param context
	 * @param tech_stack_sav_database
	 */
	public final void setTech_Stack_SAV_database(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_database)
	{
		if (tech_stack_sav_database == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_database.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_database.toString(), tech_stack_sav_database.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_Tech_Stack_SAV_message
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_Tech_Stack_SAV_message() throws com.mendix.core.CoreException
	{
		return getTech_Stack_Tech_Stack_SAV_message(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_Tech_Stack_SAV_message
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_Tech_Stack_SAV_message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_Tech_Stack_SAV_message.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_Tech_Stack_SAV_message
	 * @param tech_stack_tech_stack_sav_message
	 */
	public final void setTech_Stack_Tech_Stack_SAV_message(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_tech_stack_sav_message)
	{
		setTech_Stack_Tech_Stack_SAV_message(getContext(), tech_stack_tech_stack_sav_message);
	}

	/**
	 * Set value of Tech_Stack_Tech_Stack_SAV_message
	 * @param context
	 * @param tech_stack_tech_stack_sav_message
	 */
	public final void setTech_Stack_Tech_Stack_SAV_message(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_tech_stack_sav_message)
	{
		if (tech_stack_tech_stack_sav_message == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_Tech_Stack_SAV_message.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_Tech_Stack_SAV_message.toString(), tech_stack_tech_stack_sav_message.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_CI
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_CI() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_CI(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_CI
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_CI(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_CI.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_CI
	 * @param tech_stack_sav_ci
	 */
	public final void setTech_Stack_SAV_CI(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_ci)
	{
		setTech_Stack_SAV_CI(getContext(), tech_stack_sav_ci);
	}

	/**
	 * Set value of Tech_Stack_SAV_CI
	 * @param context
	 * @param tech_stack_sav_ci
	 */
	public final void setTech_Stack_SAV_CI(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_ci)
	{
		if (tech_stack_sav_ci == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_CI.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_CI.toString(), tech_stack_sav_ci.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_CD
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_CD() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_CD(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_CD
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_CD(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_CD.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_CD
	 * @param tech_stack_sav_cd
	 */
	public final void setTech_Stack_SAV_CD(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_cd)
	{
		setTech_Stack_SAV_CD(getContext(), tech_stack_sav_cd);
	}

	/**
	 * Set value of Tech_Stack_SAV_CD
	 * @param context
	 * @param tech_stack_sav_cd
	 */
	public final void setTech_Stack_SAV_CD(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_cd)
	{
		if (tech_stack_sav_cd == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_CD.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_CD.toString(), tech_stack_sav_cd.getMendixObject().getId());
	}

	/**
	 * @return value of Tech_Stack_SAV_framework
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_framework() throws com.mendix.core.CoreException
	{
		return getTech_Stack_SAV_framework(getContext());
	}

	/**
	 * @param context
	 * @return value of Tech_Stack_SAV_framework
	 */
	public final myfirstmodule.proxies.Tech_Stack_SAV getTech_Stack_SAV_framework(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Tech_Stack_SAV result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tech_Stack_SAV_framework.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Tech_Stack_SAV.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tech_Stack_SAV_framework
	 * @param tech_stack_sav_framework
	 */
	public final void setTech_Stack_SAV_framework(myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_framework)
	{
		setTech_Stack_SAV_framework(getContext(), tech_stack_sav_framework);
	}

	/**
	 * Set value of Tech_Stack_SAV_framework
	 * @param context
	 * @param tech_stack_sav_framework
	 */
	public final void setTech_Stack_SAV_framework(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Tech_Stack_SAV tech_stack_sav_framework)
	{
		if (tech_stack_sav_framework == null)
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_framework.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tech_Stack_SAV_framework.toString(), tech_stack_sav_framework.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tech_StackMendixObject;
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
			final myfirstmodule.proxies.Tech_Stack that = (myfirstmodule.proxies.Tech_Stack) obj;
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
		return "MyFirstModule.Tech_Stack";
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