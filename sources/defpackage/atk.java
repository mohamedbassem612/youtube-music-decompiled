package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class atk extends JobServiceEngine {
    final atm a;
    final Object b;
    JobParameters c;

    public atk(atm atmVar) {
        super(atmVar);
        this.b = new Object();
        this.a = atmVar;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        atm atmVar = this.a;
        if (atmVar.c != null) {
            return true;
        }
        atmVar.c = new ati(atmVar);
        atmVar.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        ati atiVar = this.a.c;
        if (atiVar != null) {
            atiVar.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
