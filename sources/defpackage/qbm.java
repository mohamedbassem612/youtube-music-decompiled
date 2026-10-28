package defpackage;

import android.content.Context;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.libraries.notifications.scheduled.impl.workmanager.ChimeScheduledTaskWorker;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qbm implements qbi {
    public static final agsn a = agsn.h("GnpSdk");
    public final Context b;
    public final pls c;
    public final pwf d;
    public final mbc e;
    private final kjc f;

    public qbm(Context context, pls plsVar, kjc kjcVar, pwf pwfVar, mbc mbcVar) {
        this.b = context;
        this.c = plsVar;
        this.f = kjcVar;
        this.d = pwfVar;
        this.e = mbcVar;
    }

    private final void e(plx plxVar, int i, qbh qbhVar, Bundle bundle, long j) {
        byte[] bArrMarshall;
        dzk dzkVarH;
        dov dovVar = new dov((byte[]) null);
        dovVar.k("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", qbhVar.d());
        if (bundle == null || bundle.isEmpty()) {
            bArrMarshall = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            bundle.writeToParcel(parcelObtain, 0);
            bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
        }
        if (bArrMarshall != null) {
            dovVar.j("notifications.scheduled.impl.workmanager.extraskey", bArrMarshall);
        }
        foc focVar = new foc();
        if (a.aO()) {
            focVar.e(new NetworkRequest.Builder().addCapability(12).addCapability(16).build(), 2);
        } else {
            focVar.f(2);
        }
        dyn dynVarD = focVar.d();
        String strD = d(plxVar != null ? Long.valueOf(plxVar.a) : null, i);
        mbc mbcVar = this.e;
        boolean zE = qbhVar.e();
        long jB = mbcVar.b();
        if (zE) {
            dyp dypVarG = dovVar.g();
            dzo dzoVar = new dzo(ChimeScheduledTaskWorker.class, qbhVar.a(), TimeUnit.MILLISECONDS);
            dzoVar.f(dypVarG);
            dzoVar.d(dynVarD);
            dzkVarH = bnz.i(this.b).g(strD, 1, dzoVar.g());
        } else {
            dyp dypVarG2 = dovVar.g();
            dzg dzgVar = new dzg(ChimeScheduledTaskWorker.class);
            dzgVar.f(dypVarG2);
            dzgVar.d(dynVarD);
            if (j != 0) {
                dzgVar.e(j, TimeUnit.MILLISECONDS);
            }
            this.c.l.getClass();
            dzkVarH = bnz.i(this.b).h(strD, 1, dzgVar.g());
        }
        ahng.x(((dzl) dzkVarH).c, new qbl(this, jB, plxVar, i), MoreExecutors.directExecutor());
    }

    @Override // defpackage.qbi
    public final void a(plx plxVar, int i) {
        String strD = d(plxVar == null ? null : Long.valueOf(plxVar.a), i);
        Context context = this.b;
        context.getApplicationContext().getPackageName();
        bnz.i(context).a(strD);
    }

    @Override // defpackage.qbi
    public final void b(plx plxVar, int i, qbh qbhVar, Bundle bundle) {
        e(plxVar, i, qbhVar, bundle, 0L);
    }

    @Override // defpackage.qbi
    public final void c(plx plxVar, int i, qbh qbhVar, Bundle bundle, long j) {
        ahno.J(j > 0, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        e(plxVar, i, qbhVar, bundle, j);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    public final String d(Long l, int i) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
            ahno.J(((jLongValue > 0L ? 1 : (jLongValue == 0L ? 0 : -1)) ^ (-1)) >>> 31, "accountId must be >= 0, got: %s.", jLongValue);
            ahno.J(jLongValue <= 998, "accountId must be <= 998, got: %s.", jLongValue);
        } else {
            jLongValue = 999;
        }
        kjc kjcVar = this.f;
        ahno.I((i ^ (-1)) >>> 31, "jobType must be >= 0, got: %s.", i);
        ahno.I(i <= 999, "jobType must be <= 999, got: %s.", i);
        Integer num = ((pls) kjcVar.a).g;
        num.getClass();
        num.intValue();
        return Integer.toString((i * 1000) + 999000000 + ((int) jLongValue));
    }
}
