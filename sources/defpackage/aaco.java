package defpackage;

import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaco implements aaps {
    public static final long a;
    static final long b;
    public static final long c;
    public final awmd d;
    public final awmd e;
    private final AtomicLong f = new AtomicLong();
    private final ScheduledExecutorService g;
    private final tbt h;
    private final aany i;
    private final agev j;
    private final mbc k;
    private final aauk l;
    private final aaqg m;
    private final vxz n;
    private final syn o;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 300L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        b = 900000L;
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        c = 14400L;
    }

    public aaco(awmd awmdVar, ScheduledExecutorService scheduledExecutorService, awmd awmdVar2, syn synVar, aaqg aaqgVar, tbt tbtVar, aany aanyVar, agev agevVar, mbc mbcVar, aauk aaukVar, vxz vxzVar) {
        this.d = awmdVar;
        this.g = scheduledExecutorService;
        this.e = awmdVar2;
        this.m = aaqgVar;
        this.o = synVar;
        this.h = tbtVar;
        this.i = aanyVar;
        this.j = agevVar;
        this.l = aaukVar;
        this.k = mbcVar;
        this.n = vxzVar;
    }

    private final void i(String str, long j, boolean z) {
        long j2 = c;
        long j3 = (j << 1) + j2;
        syj syjVar = aacr.b;
        Bundle bundle = new Bundle();
        bundle.putString("identityId", str);
        syn synVar = this.o;
        syj syjVar2 = aacr.b;
        synVar.c("offline_r_charging", j3, j + j2, z, 1, true, bundle, syjVar2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("identityId", str);
        synVar.c("offline_r", j3, j2, z, 1, false, bundle2, syjVar2);
    }

    @Override // defpackage.aaps
    public final void a(String str) {
        g();
        this.m.z(str, 0L);
    }

    @Override // defpackage.aaps
    public final void b(String str) {
        long jQ = this.m.q(str);
        if (jQ > 0) {
            i(str, jQ, false);
        }
    }

    @Override // defpackage.aaps
    public final void c(String str) {
        aaqn aaqnVarB;
        aauk aaukVar = this.l;
        long j = b;
        if (!aaukVar.J()) {
            syn synVar = this.o;
            synVar.b("offline_r_charging");
            long j2 = a;
            syj syjVar = aacr.b;
            Bundle bundle = new Bundle();
            bundle.putString("identityId", str);
            synVar.d("offline_r", j2, 2, 1, false, bundle, aacr.b, false);
            this.g.execute(new zgc((Object) this, str, 20));
            this.h.c(new aaij());
            return;
        }
        long epochMilli = this.k.f().toEpochMilli();
        vxz vxzVar = this.n;
        if ((vxzVar.l(184, 45717660L, false) || this.f.get() + j <= epochMilli) && (aaqnVarB = aacv.b((aanb) this.d.io(), str)) != null) {
            aacv.c(this.i, aaqnVarB, ((Integer) ((agfa) this.j).a).intValue(), this.g, vxzVar);
            this.f.set(epochMilli);
        }
    }

    @Override // defpackage.aaps
    public final void d(String str) {
        this.o.d("offline_r_inc", a, 2, 1, false, aacr.a(str), aacr.b, false);
        this.g.execute(new aadi(this, str, 1));
    }

    @Override // defpackage.aaps
    public final void e(String str, long j) {
        this.o.d("offline_r_inc", j, 2, 1, false, aacr.a(str), aacr.b, false);
    }

    @Override // defpackage.aaps
    public final void f(String str, long j) {
        i(str, j, true);
        this.m.z(str, j);
    }

    @Override // defpackage.aaps
    public final void g() {
        syn synVar = this.o;
        synVar.b("offline_r");
        synVar.b("offline_r_charging");
        synVar.b("offline_r_inc");
    }

    @Override // defpackage.aaps
    public final void h() {
        this.o.b("offline_r_inc");
    }
}
