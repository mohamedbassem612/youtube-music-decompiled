package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhq extends lfo {
    private final AlarmManager a;
    private lbw b;
    private Integer c;

    public lhq(lfv lfvVar) {
        super(lfvVar);
        this.a = (AlarmManager) aS().getSystemService("alarm");
    }

    private final void g() {
        JobScheduler jobScheduler = (JobScheduler) aS().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(a());
        }
    }

    public final int a() {
        Integer numValueOf = this.c;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("measurement".concat(String.valueOf(aS().getPackageName())).hashCode());
            this.c = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // defpackage.lfo
    protected final void b() {
        AlarmManager alarmManager = this.a;
        if (alarmManager != null) {
            alarmManager.cancel(c());
        }
        g();
    }

    final PendingIntent c() {
        Context contextAS = aS();
        Intent action = new Intent().setClassName(contextAS, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD");
        int i = kyg.a;
        return kyg.b(contextAS, action, 67108864);
    }

    public final lbw d() {
        if (this.b == null) {
            this.b = new lhp(this, this.l.j);
        }
        return this.b;
    }

    public final void e() {
        w();
        aT().k.a("Unscheduling upload");
        AlarmManager alarmManager = this.a;
        if (alarmManager != null) {
            alarmManager.cancel(c());
        }
        d().a();
        g();
    }
}
