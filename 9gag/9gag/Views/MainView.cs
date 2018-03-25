using Android.App;
using Android.OS;
using Android.Widget;
using MvvmCross.Droid.Views;

namespace _9gag.Views
{
    [Activity(Label = "View for MainViewModel")]
    public class MainView : MvxActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView(Resource.Layout.Main);
            
        }
    }
}
