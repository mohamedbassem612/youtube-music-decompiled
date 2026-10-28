package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rfh extends rei {
    final riv a;
    final rhe b;
    final rih c;
    final AtomicBoolean d;
    final /* synthetic */ rfi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfh(rfi rfiVar, riv rivVar, rgp rgpVar, rgw rgwVar, rhe rheVar, rih rihVar, AtomicBoolean atomicBoolean) {
        super(rfiVar);
        this.j = rfiVar;
        this.a = rivVar;
        this.e = Optional.of(rgwVar);
        this.b = rheVar;
        this.c = rihVar;
        this.d = atomicBoolean;
        f(rgpVar);
    }

    @Override // defpackage.rei
    public final synchronized void a(Duration duration) {
        riv rivVar = this.a;
        rivVar.E();
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.d();
        Comparable comparableE = afyd.e(Duration.ZERO, nrb.f(this.c.c(duration).minus(this.j.b.c)));
        new rbc(riv.z, rbd.a).a("seek to %d ms", Long.valueOf(((Duration) comparableE).toMillis()));
        rivVar.D(new laz(rivVar, ((Duration) comparableE).toMillis(), comparableE, 5));
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean z;
        boolean z2 = false;
        boolean z3 = true;
        if (rjgVar.b(rjf.s) || rjgVar.b(rjf.q) || rjgVar.b(rjf.b) || rjgVar.b(rjf.r)) {
            riv rivVar = this.a;
            rfi rfiVar = this.j;
            rivVar.G(rfiVar.a());
            rfi.h(this.b, rfiVar.b);
            this.c.g(rfiVar.b.b());
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z;
        boolean zB = rjgVar.b(rjf.t) | z;
        rfi rfiVar2 = this.j;
        boolean z5 = ((quz) rfiVar2.b.b).o && rjgVar.b(rjf.u);
        if (((quz) rfiVar2.b.b).q(rfiVar2.c.p().n) && rjgVar.b(rjf.j)) {
            z2 = true;
        }
        if (z5 || z2) {
            this.a.G(rfiVar2.a());
            z4 = true;
        } else {
            z3 = zB;
        }
        if (z3) {
            rih rihVar = this.c;
            synchronized (rihVar.a) {
                rihVar.e = 1L;
            }
            this.a.E();
            rgp rgpVar = this.f;
            rgpVar.getClass();
            rgpVar.d();
            rgp rgpVar2 = this.f;
            rgpVar2.getClass();
            qup qupVar = this.j.b;
            rgpVar2.l(qupVar.c, qupVar.b());
        }
        return z4;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        riv rivVar = this.a;
        rivVar.E();
        rivVar.e(null);
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.close();
        rivVar.close();
    }
}
