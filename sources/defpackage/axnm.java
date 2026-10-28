package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axnm {
    private static final Object a = new Object();
    private static Context b;
    private static Bundle c;

    private axnm() {
    }

    public static Bundle a(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                new axjt("CronetManifest#getMetaData fetching info", 0);
                try {
                    serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                c = (serviceInfo == null || serviceInfo.metaData == null) ? new Bundle() : serviceInfo.metaData;
                b = applicationContext;
            }
            bundle = c;
        }
        return bundle;
    }

    public static boolean b(Context context, axnh axnhVar) {
        boolean z = true;
        if (axnhVar != axnh.CRONET_SOURCE_PLATFORM && axnhVar != axnh.CRONET_SOURCE_PLAY_SERVICES) {
            z = false;
        }
        return a(context).getBoolean("android.net.http.EnableTelemetry", z);
    }
}
