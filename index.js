var RNInstalledApps = require('react-native').NativeModules.RNInstalledApps;

module.exports = {
	getApps: function() {
		return RNInstalledApps.getApps;
	},
	getNonSystemApps: function() {
		return RNInstalledApps.getNonSystemApps;
	}
};
