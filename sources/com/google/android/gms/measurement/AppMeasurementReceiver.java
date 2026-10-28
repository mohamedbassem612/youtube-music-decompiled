package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.aedj;
import defpackage.bnp;
import defpackage.lcx;
import defpackage.lcz;
import defpackage.ldr;
import defpackage.lqa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends bnp {
    public static final /* synthetic */ int c = 0;
    private lqa d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lqa lqaVar = this.d;
        if (lqaVar == null) {
            lqaVar = new lqa(this);
            this.d = lqaVar;
        }
        ldr ldrVarH = ldr.h(context, null, null, null);
        lcz lczVarAT = ldrVarH.aT();
        if (intent == null) {
            lczVarAT.f.a("Receiver called with null intent");
            return;
        }
        aedj aedjVar = ldrVarH.y;
        lcx lcxVar = lczVarAT.k;
        String action = intent.getAction();
        lcxVar.b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                lczVarAT.f.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        lcxVar.a("Starting wakeful intent.");
        Object obj = lqaVar.a;
        SparseArray sparseArray = bnp.a;
        synchronized (sparseArray) {
            int i = bnp.b;
            int i2 = i + 1;
            bnp.b = i2;
            if (i2 <= 0) {
                bnp.b = 1;
            }
            className.putExtra("androidx.contentpager.content.wakelockid", i);
            className.putExtra("android.support.content.wakelockid", i);
            ComponentName componentNameStartService = context.startService(className);
            if (componentNameStartService == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i, wakeLockNewWakeLock);
        }
    }
}
