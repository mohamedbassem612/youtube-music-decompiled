package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wpp implements wps {
    public static final long a;
    public static final long b;
    public static final long c;
    private final awmd d;
    private final vxu e;
    private final syn f;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 72000L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        b = 14400L;
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        c = 86400L;
    }

    public wpp(awmd awmdVar, syn synVar, vxu vxuVar) {
        this.d = awmdVar;
        this.f = synVar;
        this.e = vxuVar;
    }

    private final void d(int i, boolean z) {
        long j = a;
        long j2 = b;
        this.f.c("innertube_config_fetch_charging", ((long) i) + j + j2, j + j2, z, 1, true, null, null);
    }

    private final void e(int i, boolean z, long j) {
        this.f.c("innertube_config_fetch", b + ((long) i) + a, j, z, 1, false, null, null);
    }

    @Override // defpackage.wps
    public final void a() {
        b(Optional.empty());
    }

    public final void b(Optional optional) {
        taq.c();
        aend aendVar = (aend) this.d.io();
        wpr wprVarH = aendVar.h();
        wprVarH.m();
        optional.isPresent();
        aendVar.i(wprVarH);
        anhb anhbVar = this.e.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        aphd aphdVar = anhbVar.d;
        if (aphdVar == null) {
            aphdVar = aphd.a;
        }
        int i = aphdVar.b;
        if (i <= 0) {
            i = 86400;
        }
        try {
            d(i, true);
            e(i, true, b);
        } catch (UnsupportedOperationException unused) {
            e(i, true, c);
        }
    }

    @Override // defpackage.wps
    public final void c() {
        anhb anhbVar = this.e.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        aphd aphdVar = anhbVar.d;
        if (aphdVar == null) {
            aphdVar = aphd.a;
        }
        int i = aphdVar.b;
        if (i <= 0) {
            i = 86400;
        }
        try {
            d(i, false);
            e(i, false, b);
        } catch (UnsupportedOperationException unused) {
            e(i, false, c);
        }
    }
}
