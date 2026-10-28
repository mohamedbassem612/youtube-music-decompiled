package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.ahno;
import defpackage.ahst;
import defpackage.cte;
import defpackage.kkr;
import defpackage.kkv;
import defpackage.mda;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends kkv {
    @Override // defpackage.kkv
    public final int a(Context context, kkr kkrVar) {
        try {
            return ((Integer) mda.n(ahst.b(kkrVar.a, context, new cte(15)))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.kkv
    protected final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (ahno.l(intentPutExtras)) {
            ahno.j("_nd", intentPutExtras.getExtras());
        }
    }
}
