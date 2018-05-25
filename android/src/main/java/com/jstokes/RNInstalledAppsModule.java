
package com.jstokes;

import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.annotation.Nullable;

public class RNInstalledAppsModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNInstalledAppsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNInstalledApps";
    }

    private List<String> getApps() {
        List<PackageInfo> packages = this.reactContext
            .getPackageManager()
            .getInstalledPackages(0);

        List<String> ret = new ArrayList<>();
        for (final PackageInfo p: packages) {
            ret.add(p.packageName);
        }
        return ret;
    }

    private List<String> getNonSystemApps() {
        List<PackageInfo> packages = this.reactContext
            .getPackageManager()
            .getInstalledPackages(0);

        List<String> ret = new ArrayList<>();
        for (final PackageInfo p: packages) {
            if ((p.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                ret.add(p.packageName);
            }
        }
        return ret;
    } 
    
    @Override
    public @Nullable Map<String, Object> getConstants() {
        Map<String, Object> constants = new HashMap<>();

        constants.put("getApps", getApps());
        constants.put("getNonSystemApps", getNonSystemApps());
        return constants;
    }
}
