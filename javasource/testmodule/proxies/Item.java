// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testmodule.proxies;

public class Item
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject itemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestModule.Item";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ItemId("ItemId"),
		SeqNbr("SeqNbr"),
		Name("Name"),
		IsDragDisabled("IsDragDisabled"),
		Item_TaskBoard("TestModule.Item_TaskBoard"),
		Item_Column("TestModule.Item_Column");

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

	public Item(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Item(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject itemMendixObject)
	{
		if (itemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, itemMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.itemMendixObject = itemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Item.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static testmodule.proxies.Item initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testmodule.proxies.Item.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testmodule.proxies.Item initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testmodule.proxies.Item(context, mendixObject);
	}

	public static testmodule.proxies.Item load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testmodule.proxies.Item.initialize(context, mendixObject);
	}

	public static java.util.List<testmodule.proxies.Item> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testmodule.proxies.Item.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
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
	 * @return value of ItemId
	 */
	public final java.lang.Long getItemId()
	{
		return getItemId(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemId
	 */
	public final java.lang.Long getItemId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ItemId.toString());
	}

	/**
	 * Set value of ItemId
	 * @param itemid
	 */
	public final void setItemId(java.lang.Long itemid)
	{
		setItemId(getContext(), itemid);
	}

	/**
	 * Set value of ItemId
	 * @param context
	 * @param itemid
	 */
	public final void setItemId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long itemid)
	{
		getMendixObject().setValue(context, MemberNames.ItemId.toString(), itemid);
	}

	/**
	 * @return value of SeqNbr
	 */
	public final java.lang.Integer getSeqNbr()
	{
		return getSeqNbr(getContext());
	}

	/**
	 * @param context
	 * @return value of SeqNbr
	 */
	public final java.lang.Integer getSeqNbr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SeqNbr.toString());
	}

	/**
	 * Set value of SeqNbr
	 * @param seqnbr
	 */
	public final void setSeqNbr(java.lang.Integer seqnbr)
	{
		setSeqNbr(getContext(), seqnbr);
	}

	/**
	 * Set value of SeqNbr
	 * @param context
	 * @param seqnbr
	 */
	public final void setSeqNbr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer seqnbr)
	{
		getMendixObject().setValue(context, MemberNames.SeqNbr.toString(), seqnbr);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of IsDragDisabled
	 */
	public final java.lang.Boolean getIsDragDisabled()
	{
		return getIsDragDisabled(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDragDisabled
	 */
	public final java.lang.Boolean getIsDragDisabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDragDisabled.toString());
	}

	/**
	 * Set value of IsDragDisabled
	 * @param isdragdisabled
	 */
	public final void setIsDragDisabled(java.lang.Boolean isdragdisabled)
	{
		setIsDragDisabled(getContext(), isdragdisabled);
	}

	/**
	 * Set value of IsDragDisabled
	 * @param context
	 * @param isdragdisabled
	 */
	public final void setIsDragDisabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdragdisabled)
	{
		getMendixObject().setValue(context, MemberNames.IsDragDisabled.toString(), isdragdisabled);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Item_TaskBoard
	 */
	public final testmodule.proxies.TaskBoard getItem_TaskBoard() throws com.mendix.core.CoreException
	{
		return getItem_TaskBoard(getContext());
	}

	/**
	 * @param context
	 * @return value of Item_TaskBoard
	 * @throws com.mendix.core.CoreException
	 */
	public final testmodule.proxies.TaskBoard getItem_TaskBoard(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testmodule.proxies.TaskBoard result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Item_TaskBoard.toString());
		if (identifier != null) {
			result = testmodule.proxies.TaskBoard.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Item_TaskBoard
	 * @param item_taskboard
	 */
	public final void setItem_TaskBoard(testmodule.proxies.TaskBoard item_taskboard)
	{
		setItem_TaskBoard(getContext(), item_taskboard);
	}

	/**
	 * Set value of Item_TaskBoard
	 * @param context
	 * @param item_taskboard
	 */
	public final void setItem_TaskBoard(com.mendix.systemwideinterfaces.core.IContext context, testmodule.proxies.TaskBoard item_taskboard)
	{
		if (item_taskboard == null) {
			getMendixObject().setValue(context, MemberNames.Item_TaskBoard.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Item_TaskBoard.toString(), item_taskboard.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Item_Column
	 */
	public final testmodule.proxies.Column getItem_Column() throws com.mendix.core.CoreException
	{
		return getItem_Column(getContext());
	}

	/**
	 * @param context
	 * @return value of Item_Column
	 * @throws com.mendix.core.CoreException
	 */
	public final testmodule.proxies.Column getItem_Column(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testmodule.proxies.Column result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Item_Column.toString());
		if (identifier != null) {
			result = testmodule.proxies.Column.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Item_Column
	 * @param item_column
	 */
	public final void setItem_Column(testmodule.proxies.Column item_column)
	{
		setItem_Column(getContext(), item_column);
	}

	/**
	 * Set value of Item_Column
	 * @param context
	 * @param item_column
	 */
	public final void setItem_Column(com.mendix.systemwideinterfaces.core.IContext context, testmodule.proxies.Column item_column)
	{
		if (item_column == null) {
			getMendixObject().setValue(context, MemberNames.Item_Column.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Item_Column.toString(), item_column.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return itemMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
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
			final testmodule.proxies.Item that = (testmodule.proxies.Item) obj;
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
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
