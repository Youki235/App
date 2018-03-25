using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MvvmCross.Core.ViewModels;
using System.Threading.Tasks;

namespace legacyPortable.VievModels
{
    public class MainViewModel :  MvxViewModel
    {
        public MvxObservableCollection<Photo> Photos { get; }

        public MainViewModel()
        {
            Photos = new MvxObservableCollection<Photo>();
            Photos.Add(new Photo
            {
                Url = "http://www.koty.pl/wp-content/uploads/2013/07/shutterstock_208765051-e1502744473499.jpg"
            });
        }
    }

    public class Photo
    {
        public string Url { get; set; }
    }
}

