package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahtj {
    private static ahtj d;
    private String e = null;
    public Boolean a = null;
    public Boolean b = null;
    public final Queue c = new ArrayDeque();

    private ahtj() {
    }

    public static synchronized ahtj a() {
        ahtj ahtjVar;
        ahtjVar = d;
        if (ahtjVar == null) {
            ahtjVar = new ahtj();
            d = ahtjVar;
        }
        return ahtjVar;
    }

    public final synchronized String b(Context context, Intent intent) {
        String str;
        String strConcat;
        str = this.e;
        if (str == null) {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            str = null;
            if (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) {
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            } else {
                ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
                if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + '/' + serviceInfo.name);
                } else {
                    if (serviceInfo.name.startsWith(".")) {
                        strConcat = String.valueOf(context.getPackageName()).concat(String.valueOf(serviceInfo.name));
                        this.e = strConcat;
                    } else {
                        strConcat = serviceInfo.name;
                        this.e = strConcat;
                    }
                    str = strConcat;
                }
            }
        }
        return str;
    }

    public final boolean c(Context context) {
        Boolean boolValueOf = this.a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.a = boolValueOf;
        }
        boolValueOf.booleanValue();
        return this.a.booleanValue();
    }
}
