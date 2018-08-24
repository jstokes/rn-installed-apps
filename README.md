
# react-native-installed-packages

## Getting started

`$ npm install react-native-installed-packages --save`

### Mostly automatic installation

`$ react-native link react-native-installed-packages`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.jstokes.RNInstalledAppsPackage;` to the imports at the top of the file
  - Add `new RNInstalledAppsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-installed-packages'
  	project(':react-native-installed-packages').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-installed-packages/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-installed-packages')
  	```

## Usage
```javascript
var InstalledApps = require('react-native-installed-packages');

console.log("All packages", InstalledApps.getApps);
console.log("User packages", InstalledApps.getNonSystemApps);
```
  
