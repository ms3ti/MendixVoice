// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package retellai.proxies;

public class Call_Status implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject call_StatusMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RetellAi.Call_Status";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OnCall("OnCall");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Call_Status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Call_Status(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject call_StatusMendixObject)
	{
		if (call_StatusMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, call_StatusMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.call_StatusMendixObject = call_StatusMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static retellai.proxies.Call_Status initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new retellai.proxies.Call_Status(context, mendixObject);
	}

	public static retellai.proxies.Call_Status load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return retellai.proxies.Call_Status.initialize(context, mendixObject);
	}

	/**
	 * @return value of OnCall
	 */
	public final java.lang.Boolean getOnCall()
	{
		return getOnCall(getContext());
	}

	/**
	 * @param context
	 * @return value of OnCall
	 */
	public final java.lang.Boolean getOnCall(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.OnCall.toString());
	}

	/**
	 * Set value of OnCall
	 * @param oncall
	 */
	public final void setOnCall(java.lang.Boolean oncall)
	{
		setOnCall(getContext(), oncall);
	}

	/**
	 * Set value of OnCall
	 * @param context
	 * @param oncall
	 */
	public final void setOnCall(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean oncall)
	{
		getMendixObject().setValue(context, MemberNames.OnCall.toString(), oncall);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return call_StatusMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final retellai.proxies.Call_Status that = (retellai.proxies.Call_Status) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
