
# react-native-installed-apps

## Getting started

`$ npm install react-native-installed-apps --save`

### Mostly automatic installation

`$ react-native link react-native-installed-apps`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNInstalledAppsPackage;` to the imports at the top of the file
  - Add `new RNInstalledAppsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-installed-apps'
  	project(':react-native-installed-apps').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-installed-apps/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-installed-apps')
  	```

## Usage
```javascript
var InstalledApps = require('react-native-installed-apps');

console.log("Installed packages", InstalledApps.getApps);
```
  
