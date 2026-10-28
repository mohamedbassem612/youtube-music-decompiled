package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atl {
    final ComponentName a;
    boolean b;
    int c;
    public final JobInfo d;
    public final JobScheduler e;

    public atl(Context context, ComponentName componentName) {
        this.a = componentName;
        a();
        this.d = new JobInfo.Builder(1000, componentName).setOverrideDeadline(0L).build();
        this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            this.c = 1000;
        } else {
            if (this.c == 1000) {
                return;
            }
            throw new IllegalArgumentException("Given job ID 1000 is different than previous " + this.c);
        }
    }
}
