package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import defpackage.axje;
import defpackage.axjk;
import defpackage.axst;
import internal.J.N;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class DeviceInfo {
    private static DeviceInfo a;
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static volatile boolean d;
    private static axst g;
    private final IDeviceInfo e;
    private Boolean f;

    private DeviceInfo() {
        boolean zHasSystemFeature;
        SensorManager sensorManager;
        IDeviceInfo iDeviceInfo = new IDeviceInfo();
        this.e = iDeviceInfo;
        Context context = JniAndroid.a;
        PackageManager packageManager = context.getPackageManager();
        iDeviceInfo.e = (context.getResources().getConfiguration().uiMode & 15) == 4;
        axje axjeVar = null;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
                if (systemAvailableFeatures != null) {
                    axjeVar = new axje(systemAvailableFeatures);
                }
            } catch (SecurityException e) {
                Log.e("cn_DeviceInfo", "Unable to query available system features", e);
            }
        }
        if (axjeVar != null) {
            zHasSystemFeature = axjeVar.a;
        } else {
            try {
                zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.type.automotive");
            } catch (SecurityException e2) {
                Log.e("cn_DeviceInfo", "Unable to query for Automotive system feature", e2);
                zHasSystemFeature = false;
            }
        }
        IDeviceInfo iDeviceInfo2 = this.e;
        iDeviceInfo2.b = zHasSystemFeature;
        iDeviceInfo2.c = CommandLine.a.e("force-desktop-android");
        IDeviceInfo iDeviceInfo3 = this.e;
        iDeviceInfo3.d = !iDeviceInfo3.c && Build.VERSION.SDK_INT >= 30 && (axjeVar == null ? packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle") : axjeVar.b) && Build.VERSION.SDK_INT >= 30 && (sensorManager = (SensorManager) context.getSystemService("sensor")) != null && sensorManager.getDefaultSensor(36) != null;
        IDeviceInfo iDeviceInfo4 = this.e;
        iDeviceInfo4.f = axjeVar == null ? 0 : axjeVar.d;
        DisplayMetrics displayMetrics = JniAndroid.a.getResources().getDisplayMetrics();
        iDeviceInfo4.h = ((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= 600;
        this.e.g = axjeVar != null ? axjeVar.c : packageManager.hasSystemFeature("android.software.xr.api.openxr");
    }

    private static DeviceInfo a() {
        DeviceInfo deviceInfo;
        synchronized (b) {
            deviceInfo = a;
            if (deviceInfo == null) {
                deviceInfo = new DeviceInfo();
                a = deviceInfo;
            }
        }
        return deviceInfo;
    }

    public static String getDeviceName() {
        return Settings.Global.getString(JniAndroid.a.getContentResolver(), "device_name");
    }

    private static String getGmsVersionCodeForNative() {
        Object obj;
        d = true;
        synchronized (c) {
            axst axstVar = g;
            if (axstVar == null) {
                PackageInfo packageInfoA = axjk.a("com.google.android.gms", 0);
                String strValueOf = "gms versionCode not available.";
                if (packageInfoA != null) {
                    strValueOf = String.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfoA.getLongVersionCode() : packageInfoA.versionCode);
                    ApplicationInfo applicationInfo = packageInfoA.applicationInfo;
                }
                axstVar = new axst(strValueOf);
                g = axstVar;
            }
            obj = axstVar.a;
        }
        return (String) obj;
    }

    public static boolean isRetailDemoMode() {
        DeviceInfo deviceInfoA = a();
        Boolean bool = deviceInfoA.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = Settings.Global.getInt(JniAndroid.a.getContentResolver(), "device_demo_mode", 0) != 0;
        deviceInfoA.f = Boolean.valueOf(z);
        return z;
    }

    private static void nativeReadyForFields() {
        IDeviceInfo iDeviceInfo = a().e;
        N.MFWeJGQZ(iDeviceInfo.e, iDeviceInfo.b, iDeviceInfo.d, iDeviceInfo.c, iDeviceInfo.f, iDeviceInfo.g, iDeviceInfo.h);
        String str = iDeviceInfo.a;
        if (str != null) {
            N.MUTU$IiO(str);
        }
    }
}
