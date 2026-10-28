package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igk {
    public final awmd a;
    public final abvc b;
    public final ycp f;
    public final vxz g;
    public final hfn h;
    private final avmb i;
    private final avmb j;
    private final ahbw l;
    private avmn m;
    public boolean c = false;
    private Optional n = Optional.empty();
    public final ibu d = new igj(this, 0);
    public final xzf e = new xtm(this, 1);
    private final awku k = new awku(igi.a);

    public igk(avmb avmbVar, avmb avmbVar2, awmd awmdVar, abvc abvcVar, hfn hfnVar, ahbw ahbwVar, ycp ycpVar, vxz vxzVar) {
        this.i = avmbVar;
        this.j = avmbVar2;
        this.a = awmdVar;
        this.b = abvcVar;
        this.h = hfnVar;
        this.l = ahbwVar;
        this.f = ycpVar;
        this.g = vxzVar;
    }

    public final igi a() {
        igi igiVar = (igi) this.k.aD();
        return igiVar == null ? igi.a : igiVar;
    }

    public final avlh b() {
        return this.k.N();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final Duration c() {
        igi igiVarA = a();
        if (igiVarA != igi.b) {
            if (igiVarA != igi.c) {
                return Duration.ZERO;
            }
            awmd awmdVar = this.a;
            return Duration.ofMillis((long) ((acfz.a(((abvk) awmdVar.io()).h()) - (((abvk) awmdVar.io()).i() == null ? 0L : ((abvk) awmdVar.io()).i().a())) / ((abvk) awmdVar.io()).a()));
        }
        if (this.n.isEmpty()) {
            return Duration.ZERO;
        }
        Instant instantA = this.l.a();
        ?? r4 = this.n.get();
        return ((Instant) r4).isBefore(instantA) ? Duration.ZERO : Duration.between(instantA, r4);
    }

    public final void d() {
        if (a() == igi.c) {
            h();
        }
    }

    public final void e() {
        this.n = Optional.empty();
        avmn avmnVar = this.m;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.m);
        }
        this.h.p(this.d);
        if (this.g.l(115, 45819408L, false)) {
            this.f.d(this.e);
        }
    }

    public final void f(igi igiVar) {
        awku awkuVar = this.k;
        if (awkuVar.aD() != igiVar) {
            awkuVar.kk(igiVar);
        }
    }

    public final void g(Duration duration) {
        e();
        f(igi.b);
        this.n = Optional.of(this.l.a().plus(duration));
        this.m = avlr.ac(c().toMillis(), TimeUnit.MILLISECONDS, this.i).O(this.j).ag(new ifo(this, 5), new ido(2));
    }

    public final void h() {
        e();
        f(igi.a);
    }

    public final boolean i() {
        return this.f.e == null || !this.g.l(115, 45819408L, false);
    }
}
