package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.agsj;
import defpackage.agsn;
import defpackage.awmd;
import defpackage.awoq;
import defpackage.awrc;
import defpackage.dyp;
import defpackage.dzb;
import defpackage.elr;
import defpackage.ght;
import defpackage.pmc;
import defpackage.pnv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GnpWorker extends CoroutineWorker {
    private static final agsn e = agsn.h("GnpSdk");
    public pmc d;
    private final WorkerParameters f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(awoq awoqVar) {
        awmd awmdVar = (awmd) pnv.a(this.a).cS().get(GnpWorker.class);
        if (awmdVar == null) {
            ((agsj) e.c()).t("Failed to inject dependencies.");
            return new dzb();
        }
        Object objIo = awmdVar.io();
        objIo.getClass();
        pmc pmcVar = (pmc) ((ght) ((elr) objIo).a).a.gY.io();
        this.d = pmcVar;
        if (pmcVar == null) {
            awrc.b("gnpWorkerHandler");
            pmcVar = null;
        }
        WorkerParameters workerParameters = this.f;
        dyp dypVar = workerParameters.b;
        dypVar.getClass();
        return pmcVar.a(dypVar, workerParameters.d, awoqVar);
    }
}
