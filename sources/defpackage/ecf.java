package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecf {
    private final ComponentName a;

    static {
        dzf.a("SystemJobInfoConverter");
    }

    public ecf(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public final JobInfo a(ees eesVar, int i, long j) {
        int i2;
        String str;
        dyn dynVar = eesVar.l;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", eesVar.c);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", eesVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", eesVar.e());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.a).setRequiresCharging(dynVar.c);
        boolean z = dynVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = dynVar.a();
        if (Build.VERSION.SDK_INT < 28 || networkRequestA == null) {
            int i3 = dynVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 == 1) {
                    i2 = 1;
                } else if (i4 != 2) {
                    i2 = 3;
                    if (i4 != 3) {
                        i2 = 4;
                        if (i4 != 4) {
                            dzf.b();
                            bbl.e(i3);
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z) {
            extras.setBackoffCriteria(eesVar.n, eesVar.A == 2 ? 0 : 1);
        }
        if (Build.VERSION.SDK_INT <= 28 || j > 0) {
            extras.setMinimumLatency(j);
        } else if (!eesVar.r) {
            extras.setImportantWhileForeground(true);
        }
        if (dynVar.b()) {
            for (dym dymVar : dynVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dymVar.a, dymVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dynVar.g);
            extras.setTriggerContentMaxDelay(dynVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(dynVar.e);
        extras.setRequiresStorageNotLow(dynVar.f);
        int i5 = eesVar.m;
        if (Build.VERSION.SDK_INT >= 31 && eesVar.r && i5 <= 0 && j <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = eesVar.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
