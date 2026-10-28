package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhm extends lbc {
    public JobScheduler a;
    private lbw b;

    @Override // defpackage.lbc
    protected final void d() {
        this.a = (JobScheduler) aS().getSystemService("jobscheduler");
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return true;
    }

    public final int s() {
        return "measurement-client".concat(String.valueOf(aS().getPackageName())).hashCode();
    }

    public final lbw t() {
        if (this.b == null) {
            this.b = new lhl(this, this.t);
        }
        return this.b;
    }

    public final liv u() {
        a();
        o();
        if (this.a == null) {
            return liv.MISSING_JOB_SCHEDULER;
        }
        if (!G().t()) {
            return liv.NOT_ENABLED_IN_MANIFEST;
        }
        if (h().b < 119000) {
            return liv.SDK_TOO_OLD;
        }
        if (lga.au(aS())) {
            return !j().T() ? liv.NON_PLAY_MODE : liv.CLIENT_UPLOAD_ELIGIBLE;
        }
        return liv.MEASUREMENT_SERVICE_NOT_ENABLED;
    }

    public final void v(long j) {
        a();
        o();
        if (!G().F(null, lcl.L)) {
            JobScheduler jobScheduler = this.a;
            if (jobScheduler != null && jobScheduler.getPendingJob(s()) != null) {
                aT().k.a("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
            liv livVarU = u();
            if (livVarU != liv.CLIENT_UPLOAD_ELIGIBLE) {
                aT().k.b("[sgtm] Not eligible for Scion upload", livVarU.name());
                return;
            }
            if (G().F(null, lcl.K) && j < lbt.z() && !t().d()) {
                t().c(j);
            }
            aT().k.c("[sgtm] Scheduling Scion upload: delay millis, jobId", Long.valueOf(j), Integer.valueOf(s()));
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
            JobInfo jobInfoBuild = new JobInfo.Builder(s(), new ComponentName(aS(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            JobScheduler jobScheduler2 = this.a;
            kro.l(jobScheduler2);
            aT().k.b("[sgtm] Scion upload job scheduled with result", jobScheduler2.schedule(jobInfoBuild) != 1 ? "FAILURE" : "SUCCESS");
            return;
        }
        a();
        o();
        liv livVarU2 = u();
        if (livVarU2 != liv.CLIENT_UPLOAD_ELIGIBLE) {
            aT().k.b("[sgtm] Not eligible for Scion upload", livVarU2.name());
            return;
        }
        if (j < lbt.z() && !t().d() && K().a()) {
            t().c(j);
        }
        JobScheduler jobScheduler3 = this.a;
        if (jobScheduler3 != null && jobScheduler3.getPendingJob(s()) != null) {
            aT().k.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        aT().k.c("[sgtm] Scheduling Scion upload: delay millis, jobId", Long.valueOf(j), Integer.valueOf(s()));
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild2 = new JobInfo.Builder(s(), new ComponentName(aS(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle2).build();
        JobScheduler jobScheduler4 = this.a;
        kro.l(jobScheduler4);
        aT().k.b("[sgtm] Scion upload job scheduled with result", jobScheduler4.schedule(jobInfoBuild2) != 1 ? "FAILURE" : "SUCCESS");
    }
}
