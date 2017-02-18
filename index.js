import { NativeModules } from 'react-native';

const { RNInstalledApps } = NativeModules.RNInstalledApps;

module.exports = {
    installedApp: function() {
        return RNInstalledApps.installedApp;
    }
};
