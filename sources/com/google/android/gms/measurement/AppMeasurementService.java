package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.aedj;
import defpackage.bnp;
import defpackage.ikm;
import defpackage.lcn;
import defpackage.lcx;
import defpackage.lcz;
import defpackage.ldr;
import defpackage.lfi;
import defpackage.lfv;
import defpackage.lqa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements lfi {
    private lqa a;

    private final lqa d() {
        lqa lqaVar = this.a;
        if (lqaVar != null) {
            return lqaVar;
        }
        lqa lqaVar2 = new lqa((Object) this);
        this.a = lqaVar2;
        return lqaVar2;
    }

    @Override // defpackage.lfi
    public final void a(Intent intent) {
        int i = AppMeasurementReceiver.c;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0 && (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) == 0) {
            return;
        }
        SparseArray sparseArray = bnp.a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    @Override // defpackage.lfi
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.lfi
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        lqa lqaVarD = d();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new lcn(lfv.p((Context) lqaVarD.a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().s();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().t();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        lqa.u(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        lqa lqaVarD = d();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = (Context) lqaVarD.a;
        ldr ldrVarH = ldr.h(context, null, null, null);
        lcz lczVarAT = ldrVarH.aT();
        aedj aedjVar = ldrVarH.y;
        lcx lcxVar = lczVarAT.k;
        String action = intent.getAction();
        lcxVar.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        lqa.w(lfv.p(context), new ikm(lqaVarD, i2, lczVarAT, intent, 4));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        lqa.v(intent);
        return true;
    }
}
