package md542f353d1b1081f7745f0b06ca2e9e57a;


public class MvxFilteringAdapter
	extends md542f353d1b1081f7745f0b06ca2e9e57a.MvxAdapter
	implements
		mono.android.IGCUserPeer,
		android.widget.Filterable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_notifyDataSetChanged:()V:GetNotifyDataSetChangedHandler\n" +
			"n_getItem:(I)Ljava/lang/Object;:GetGetItem_IHandler\n" +
			"n_getFilter:()Landroid/widget/Filter;:GetGetFilterHandler:Android.Widget.IFilterableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxFilteringAdapter, MvvmCross.Binding.Droid, Version=5.7.0.0, Culture=neutral, PublicKeyToken=null", MvxFilteringAdapter.class, __md_methods);
	}


	public MvxFilteringAdapter ()
	{
		super ();
		if (getClass () == MvxFilteringAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxFilteringAdapter, MvvmCross.Binding.Droid, Version=5.7.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MvxFilteringAdapter (android.content.Context p0)
	{
		super ();
		if (getClass () == MvxFilteringAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxFilteringAdapter, MvvmCross.Binding.Droid, Version=5.7.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void notifyDataSetChanged ()
	{
		n_notifyDataSetChanged ();
	}

	private native void n_notifyDataSetChanged ();


	public java.lang.Object getItem (int p0)
	{
		return n_getItem (p0);
	}

	private native java.lang.Object n_getItem (int p0);


	public android.widget.Filter getFilter ()
	{
		return n_getFilter ();
	}

	private native android.widget.Filter n_getFilter ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
