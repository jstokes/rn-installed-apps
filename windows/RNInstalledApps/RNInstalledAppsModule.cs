using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNInstalledApps
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNInstalledAppsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNInstalledAppsModule"/>.
        /// </summary>
        internal RNInstalledAppsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNInstalledApps";
            }
        }
    }
}
