package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmx extends BroadcastReceiver {
    public static volatile hhc a;
    private static volatile hhc b;

    public static void a(Context context, hhc hhcVar, hhc hhcVar2) {
        if (a == null) {
            synchronized (qmx.class) {
                if (a == null) {
                    if (hhcVar != null && !Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (a.aM()) {
                            context.registerReceiver(new qmx(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new qmx(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                        b = hhcVar;
                    }
                    a = hhcVar2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhUpdateBroadcastRecv", a.bT(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            hhc hhcVar = b;
            if (hhcVar == null) {
                Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                return;
            }
            omj omjVar = (omj) ((ruk) hhcVar.a).a.get(stringExtra);
            if (omjVar != null) {
                omjVar.Y(new qmg(1));
            }
        }
    }
}
