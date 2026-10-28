package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snr implements wny {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final vyo d;

    public snr(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, vyo vyoVar) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = vyoVar;
    }

    @Override // defpackage.wny
    public final void a(wnz wnzVar) {
        if (taq.au(this.d) && ((acfn) this.b.io()).f == 1) {
            return;
        }
        sek sekVar = (sek) this.a.io();
        wnzVar.M = sekVar.a.d();
        wnzVar.I = sekVar.a();
        wnzVar.K = sekVar.f.a();
        aboi aboiVar = sekVar.g;
        abnc abncVar = sekVar.h;
        synchronized (aboiVar) {
            wnzVar.L = aboiVar.a();
            abncVar.c();
            wnzVar.J = abncVar.c().a.i;
        }
        tun tunVar = sekVar.c;
        if (tunVar != null) {
            if (!taq.ag(this.d)) {
                long jB = tunVar.c.b();
                long j = tunVar.a;
                wnzVar.H = j != -1 ? jB - j : -1L;
                return;
            }
            long jB2 = tunVar.c.b();
            long j2 = tunVar.a;
            long j3 = j2 != -1 ? jB2 - j2 : -1L;
            tum tumVar = tunVar.b;
            wnzVar.H = j3;
            ruu ruuVar = (ruu) this.c.io();
            if (ruuVar != null) {
                ruuVar.a("upt", String.format(Locale.US, "cueid.%s;lact.%d;luar.%s;cpn.%s", wnzVar.d, Long.valueOf(j3), tumVar.v, wnzVar.b));
            }
        }
    }
}
