package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snt implements wny {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final vyo e;

    public snt(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, vyo vyoVar) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = vyoVar;
    }

    @Override // defpackage.wny
    public final void a(wnz wnzVar) {
        if (taq.au(this.e) && ((acfn) this.b.io()).f == 1) {
            sek sekVar = (sek) this.a.io();
            wnzVar.M = sekVar.a.d();
            wnzVar.I = sekVar.a();
            wnzVar.K = sekVar.f.a();
            aboi aboiVar = (aboi) this.c.io();
            abnc abncVar = sekVar.h;
            synchronized (aboiVar) {
                wnzVar.L = aboiVar.a();
                abncVar.c();
                wnzVar.J = abncVar.c().a.i;
            }
            tun tunVar = sekVar.c;
            if (tunVar != null) {
                if (!taq.ag(this.e)) {
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
                ruu ruuVar = (ruu) this.d.io();
                if (ruuVar != null) {
                    ruuVar.a("upt", String.format(Locale.US, "cueid.%s;lact.%d;luar.%s;cpn.%s", wnzVar.d, Long.valueOf(j3), tumVar.v, wnzVar.b));
                }
            }
        }
    }
}
