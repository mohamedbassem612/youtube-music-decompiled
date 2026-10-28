package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.content.Context;
import defpackage.awmd;
import defpackage.plz;
import defpackage.pma;
import defpackage.pmb;
import defpackage.pnv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SystemTrayBroadcastReceiver extends plz {
    @Override // defpackage.plz
    public final pma a(Context context) {
        awmd awmdVar = (awmd) pnv.a(context).cQ().get("systemtray");
        pma pmaVar = awmdVar != null ? (pma) awmdVar.io() : null;
        if (pmaVar != null) {
            return pmaVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.plz
    public final pmb b(Context context) {
        awmd awmdVar = (awmd) pnv.a(context).cR().get("systemtray");
        pmb pmbVar = awmdVar != null ? (pmb) awmdVar.io() : null;
        if (pmbVar != null) {
            return pmbVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.plz
    public final String c() {
        return "systemtray";
    }
}
