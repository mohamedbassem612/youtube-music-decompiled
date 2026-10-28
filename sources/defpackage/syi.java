package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class syi {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/backgroundtask/BackgroundTaskController");
    private final awmd b;
    private final awmd c;
    private final mbc d;
    private final vxz e;

    public syi(awmd awmdVar, awmd awmdVar2, vxz vxzVar, mbc mbcVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.e = vxzVar;
        this.d = mbcVar;
    }

    private final void b(String str, syk sykVar, int i, Bundle bundle, long j, long j2) {
        int i2 = 0;
        if (!this.e.l(234, 45779797L, false)) {
            ((abxv) this.c.io()).F(str, sykVar, i, j, false, 0L, 0L, 0);
            return;
        }
        long j3 = 0;
        if (bundle != null) {
            j3 = bundle.getLong("sched_time", 0L);
            i2 = bundle.getInt("start_cnt", 0);
        }
        ((abxv) this.c.io()).F(str, sykVar, i, j, true, j3, j2, i2);
    }

    public final int a(String str, Bundle bundle) {
        int iA;
        int i = typ.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
        mbc mbcVar = this.d;
        long millis = mbcVar.e().toMillis();
        long epochMilli = mbcVar.f().toEpochMilli();
        syk sykVarAr = ((dov) this.b.io()).ar(str);
        if (sykVarAr != null) {
            try {
                iA = sykVarAr.a(bundle);
            } catch (RuntimeException e) {
                if (!this.e.l(273, 45822177L, false)) {
                    throw e;
                }
                long millis2 = this.d.e().minusMillis(millis).toMillis();
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/common/backgroundtask/BackgroundTaskController", "runTask", '<', "BackgroundTaskController.java")).w("Task %s threw RuntimeException", str);
                b(str, sykVarAr, 3, bundle, millis2, epochMilli);
                throw e;
            }
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/backgroundtask/BackgroundTaskController", "runTask", 67, "BackgroundTaskController.java")).w("Unknown task tag %s; aborting...", str);
            iA = 1;
        }
        int i2 = iA;
        b(str, sykVarAr, i2, bundle, this.d.e().toMillis() - millis, epochMilli);
        return i2;
    }
}
