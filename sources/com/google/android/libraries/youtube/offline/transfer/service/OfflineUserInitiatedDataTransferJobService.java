package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.app.job.JobParameters;
import defpackage.aadw;
import defpackage.aanl;
import defpackage.aatd;
import defpackage.aatf;
import defpackage.aath;
import defpackage.aauk;
import defpackage.aesq;
import defpackage.awmd;
import defpackage.isi;
import defpackage.rnj;
import defpackage.teb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class OfflineUserInitiatedDataTransferJobService extends aatd {
    public awmd a;
    public aauk b;
    public awmd c;
    public aath d;
    public isi e;
    public aesq f;

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.b.j()) {
            if (this.f.a() != aatf.c) {
                this.f.b(aatf.a);
            }
            this.d.f();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Notification notificationB = ((aanl) this.a.io()).b();
        if (notificationB == null) {
            return false;
        }
        int i = 17;
        setNotification(jobParameters, 17, notificationB, 1);
        byte[] bArr = null;
        this.e.N(null, 17, notificationB);
        if (!this.b.j()) {
            return true;
        }
        this.f.b(aatf.b);
        this.d.e(new aadw(this, jobParameters, i, bArr));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.b.k()) {
            ((rnj) this.c.io()).j(teb.b);
        }
        if (this.b.j()) {
            if (this.f.a() != aatf.c) {
                this.f.b(aatf.a);
            }
            this.d.f();
        }
        return !this.b.g();
    }
}
