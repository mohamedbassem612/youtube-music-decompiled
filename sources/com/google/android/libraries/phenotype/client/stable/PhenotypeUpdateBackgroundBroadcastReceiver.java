package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.aheo;
import defpackage.ahng;
import defpackage.ahnm;
import defpackage.ahno;
import defpackage.okx;
import defpackage.onn;
import defpackage.qkh;
import defpackage.qmn;
import defpackage.qmp;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qmn qmnVar;
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.bT(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            qkh qkhVarA = qkh.a(context);
            if (qkhVarA == null) {
                qkh.d();
                ahno.O(false);
                return;
            }
            Map mapA = qmn.a(context);
            if (mapA.isEmpty() || (qmnVar = (qmn) mapA.get(stringExtra)) == null || !qmnVar.b.equals(ahnm.FILE)) {
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final aheo aheoVar = (aheo) ahng.u(aheo.p(aheo.p(qmp.b(qkhVarA).c()).q(new onn(stringExtra, 5), qkhVarA.b())).r(new okx(qmnVar, stringExtra, qkhVarA, 17, (int[]) null), qkhVarA.b()), 25L, TimeUnit.SECONDS, qkhVarA.b());
            aheoVar.addListener(new Runnable() { // from class: qmv
                @Override // java.lang.Runnable
                public final void run() {
                    aheo aheoVar2 = aheoVar;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            ahng.v(aheoVar2);
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.ce(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, qkhVarA.b());
        }
    }
}
