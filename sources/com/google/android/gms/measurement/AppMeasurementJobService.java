package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import defpackage.kro;
import defpackage.laf;
import defpackage.lay;
import defpackage.lcz;
import defpackage.lez;
import defpackage.lfa;
import defpackage.lfi;
import defpackage.lfv;
import defpackage.lqa;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements lfi {
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
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lfi
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        lqa lqaVarD = d();
        String string = jobParameters.getExtras().getString("action");
        String.format("onStartJob (jobId: %d) received action: %s", Integer.valueOf(jobParameters.getJobId()), string);
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            kro.l(string);
            lfv lfvVarP = lfv.p((Context) lqaVarD.a);
            lcz lczVarAT = lfvVarP.aT();
            lfvVarP.aW();
            lczVarAT.k.b("Local AppMeasurementJobService called. action", string);
            jobParameters2 = jobParameters;
            lqa.w(lfvVarP, new lez(lqaVarD, lczVarAT, jobParameters2, 2, (boolean[]) null));
        } else {
            jobParameters2 = jobParameters;
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            kro.l(string);
            lay layVarC = lay.c((Context) lqaVarD.a, null);
            layVarC.i(new laf(layVarC, new lfa(lqaVarD, jobParameters2, 6, (char[]) null)));
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        lqa.v(intent);
        return true;
    }

    @Override // defpackage.lfi
    public final void a(Intent intent) {
    }
}
