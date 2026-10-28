package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rci extends rfi {
    private rck a;

    public rci(rck rckVar, req reqVar) {
        super(rckVar, reqVar, (rckVar.k().size() > 1 ? reqVar.p().a.K : 0) + 5);
        this.a = rckVar;
    }

    @Override // defpackage.rfi
    protected final agke a() {
        return this.a.k();
    }

    @Override // defpackage.rfi
    protected final Duration b(Duration duration) {
        return this.a.i(duration).b();
    }

    @Override // defpackage.res
    protected final void c(rfs rfsVar) {
        Duration durationJ = rfsVar.j();
        qup qupVarI = this.a.i(durationJ);
        Cloneable cloneable = qupVarI.b;
        n(rfsVar, (rjp) cloneable, durationJ.minus(qupVarI.c));
        rfsVar.v(qupVarI.a);
        rfsVar.y(((quu) ((quz) cloneable)).a);
    }

    @Override // defpackage.res
    public final synchronized boolean d(qup qupVar, Duration duration) {
        this.a = (rck) qupVar;
        return super.d(qupVar, duration);
    }
}
