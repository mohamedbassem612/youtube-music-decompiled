package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.agsj;
import defpackage.agsn;
import defpackage.pnv;
import defpackage.pnw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ScheduledTaskService extends JobService {
    private static final agsn a = agsn.h("GnpSdk");

    private final pnw a() {
        try {
            return pnv.a(getApplicationContext());
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.c()).j(e)).k("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskService", "getGnpComponent", 51, "ScheduledTaskService.java")).t("Failed to get GnpComponent for ScheduledTaskService");
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        pnw pnwVarA = a();
        if (pnwVarA == null) {
            return false;
        }
        pnwVarA.N().a(getApplicationContext());
        return pnwVarA.z().a(jobParameters, this);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        pnw pnwVarA = a();
        if (pnwVarA == null) {
            return false;
        }
        pnwVarA.z().b(jobParameters);
        return true;
    }
}
