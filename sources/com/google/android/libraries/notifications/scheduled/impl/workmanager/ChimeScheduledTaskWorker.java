package com.google.android.libraries.notifications.scheduled.impl.workmanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.agsj;
import defpackage.agsn;
import defpackage.ahvd;
import defpackage.ahve;
import defpackage.bbl;
import defpackage.dyp;
import defpackage.dzb;
import defpackage.dzc;
import defpackage.dzd;
import defpackage.pky;
import defpackage.pnv;
import defpackage.pnw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ChimeScheduledTaskWorker extends Worker {
    private static final agsn d = agsn.h("GnpSdk");
    private final Context e;

    public ChimeScheduledTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = context;
    }

    @Override // androidx.work.Worker
    public final bbl c() {
        pnw pnwVarA;
        byte[] bArrC;
        Bundle bundle;
        int length;
        try {
            pnwVarA = pnv.a(this.e);
        } catch (IllegalStateException e) {
            ((agsj) ((agsj) ((agsj) d.c()).j(e)).k("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "getGnpComponent", 88, "ChimeScheduledTaskWorker.java")).t("Failed to get GnpComponent for ChimeScheduledTaskWorker");
            pnwVarA = null;
        }
        if (pnwVarA == null) {
            return new dzb();
        }
        pnwVarA.N().a(this.e);
        dyp dypVarF = f();
        String strA = dypVarF.a("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
        if (dypVarF == null || (bArrC = dypVarF.c("notifications.scheduled.impl.workmanager.extraskey")) == null || (length = bArrC.length) == 0) {
            bundle = new Bundle();
        } else {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrC, 0, length);
            parcelObtain.setDataPosition(0);
            bundle = new Bundle();
            bundle.readFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        bundle.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
        pky pkyVarA = pnwVarA.A().a(strA, bundle);
        if (pkyVarA.j()) {
            ((agsj) ((agsj) ((agsj) d.c()).j(pkyVarA.f())).k("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "doWork", 62, "ChimeScheduledTaskWorker.java")).w("Work finished with TRANSIENT_FAILURE. Job key: '%s'", new ahve(ahvd.a, strA));
            return new dzc();
        }
        if (!pkyVarA.h()) {
            return pkyVarA.i() ? new dzd() : new dzd();
        }
        ((agsj) ((agsj) ((agsj) d.c()).j(pkyVarA.f())).k("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "doWork", 69, "ChimeScheduledTaskWorker.java")).w("Work finished with PERMANENT_FAILURE. Job key: '%s'", new ahve(ahvd.a, strA));
        return new dzb();
    }
}
