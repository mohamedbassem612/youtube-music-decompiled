package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.bnz;
import defpackage.dov;
import defpackage.dzf;
import defpackage.eaa;
import defpackage.eam;
import defpackage.ear;
import defpackage.eas;
import defpackage.ebm;
import defpackage.eby;
import defpackage.eek;
import defpackage.qv;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements eaa {
    private static final String a = dzf.a("SystemJobService");
    private ebm b;
    private final Map c = new HashMap();
    private final ear d = new eas();
    private qv e;

    private static eek b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new eek(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.bT(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.eaa
    public final void a(eek eekVar, boolean z) {
        c("onExecuted");
        JobParameters jobParameters = (JobParameters) this.c.remove(eekVar);
        this.d.b(eekVar);
        if (jobParameters != null) {
            dzf.b();
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            ebm ebmVarJ = ebm.j(getApplicationContext());
            this.b = ebmVarJ;
            eam eamVar = ebmVarJ.f;
            this.e = new qv(eamVar, ebmVarJ.k);
            eamVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            dzf.b();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ebm ebmVar = this.b;
        if (ebmVar != null) {
            ebmVar.f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        c("onStartJob");
        if (this.b == null) {
            dzf.b();
            jobFinished(jobParameters, true);
        } else {
            eek eekVarB = b(jobParameters);
            if (eekVarB == null) {
                dzf.b();
                Log.e(a, "WorkSpec id not found!");
            } else {
                eam eamVar = this.b.f;
                synchronized (eamVar.l) {
                    eby ebyVar = (eby) eamVar.f.get(eekVarB.a);
                    z = ebyVar != null && ebyVar.a().equals(eekVarB);
                }
                if (z) {
                    dzf.b();
                    Objects.toString(eekVarB);
                    eekVarB.toString();
                    jobFinished(jobParameters, true);
                } else {
                    Map map = this.c;
                    if (!map.containsKey(eekVarB)) {
                        dzf.b();
                        Objects.toString(eekVarB);
                        eekVarB.toString();
                        map.put(eekVarB, jobParameters);
                        bnz bnzVar = new bnz(null);
                        if (jobParameters.getTriggeredContentUris() != null) {
                            Arrays.asList(jobParameters.getTriggeredContentUris());
                        }
                        if (jobParameters.getTriggeredContentAuthorities() != null) {
                            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            jobParameters.getNetwork();
                        }
                        this.e.k(this.d.c(eekVarB), bnzVar);
                        return true;
                    }
                    dzf.b();
                    Objects.toString(eekVarB);
                    eekVarB.toString();
                }
            }
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            dzf.b();
            return true;
        }
        eek eekVarB = b(jobParameters);
        if (eekVarB == null) {
            dzf.b();
            Log.e(a, "WorkSpec id not found!");
        } else {
            dzf.b();
            Objects.toString(eekVarB);
            eekVarB.toString();
            this.c.remove(eekVarB);
            dov dovVarB = this.d.b(eekVarB);
            if (dovVarB != null) {
                int i = -512;
                if (Build.VERSION.SDK_INT >= 31) {
                    int stopReason = jobParameters.getStopReason();
                    switch (stopReason) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i = stopReason;
                            break;
                    }
                }
                this.e.l(dovVarB, i);
            }
            eam eamVar = this.b.f;
            String str = eekVarB.a;
            synchronized (eamVar.l) {
                zContains = eamVar.i.contains(str);
            }
            if (!zContains) {
                return true;
            }
        }
        return false;
    }
}
