package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.AsyncTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ati extends AsyncTask {
    final /* synthetic */ atm a;

    public ati(atm atmVar) {
        this.a = atmVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:17:0x003d, B:19:0x0041, B:20:0x0044), top: B:31:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x004a A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        atj atjVar;
        JobWorkItem jobWorkItem;
        atk atkVar;
        JobParameters jobParameters;
        while (true) {
            atm atmVar = this.a;
            atk atkVar2 = atmVar.d;
            atkVar2.getClass();
            synchronized (atkVar2.b) {
                JobParameters jobParameters2 = atkVar2.c;
                if (jobParameters2 != null) {
                    JobWorkItem jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                    if (jobWorkItemDequeueWork != null) {
                        jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(atkVar2.a.getClassLoader());
                        atjVar = new atj(atkVar2, jobWorkItemDequeueWork);
                    }
                    if (atjVar != null) {
                        return null;
                    }
                    jobWorkItem = atjVar.a;
                    jobWorkItem.getIntent();
                    atmVar.a();
                    atkVar = atjVar.b;
                    synchronized (atkVar.b) {
                        jobParameters = atkVar.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(jobWorkItem);
                        }
                    }
                }
            }
            atjVar = null;
            if (atjVar != null) {
                return null;
            }
            jobWorkItem = atjVar.a;
            jobWorkItem.getIntent();
            atmVar.a();
            atkVar = atjVar.b;
            synchronized (atkVar.b) {
                jobParameters = atkVar.c;
                if (jobParameters != null) {
                    jobParameters.completeWork(jobWorkItem);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }
}
