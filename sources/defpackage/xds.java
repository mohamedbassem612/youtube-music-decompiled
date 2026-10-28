package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xds extends sye {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final tqj f;
    private final awmd g;

    public xds(tqj tqjVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        this.f = tqjVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.g = awmdVar6;
    }

    @Override // defpackage.sye
    protected final void c() {
        if (!((ztn) this.g.io()).a()) {
            ((ztf) this.a.io()).e(this.b);
        }
        tqj tqjVar = this.f;
        int i = tqr.a;
        if (tqjVar.k(1073814375)) {
            final xdy xdyVar = (xdy) this.d.io();
            xdyVar.b(new kig() { // from class: xdv
                @Override // defpackage.kig
                public final kih a(kih kihVar) {
                    if (kihVar != null) {
                        if (xdy.a.contains(kihVar.h)) {
                            return kihVar;
                        }
                        xdyVar.g.add(kihVar);
                    }
                    return null;
                }
            });
        }
        if (tqjVar.k(1073829084)) {
            ((xkq) this.e.io()).c();
        }
    }

    @Override // defpackage.sye
    protected final void d() {
        if (((ztn) this.g.io()).a()) {
            ((xeu) this.c.io()).k();
        }
    }

    @Override // defpackage.sye
    protected final void e() {
        xdy xdyVar = (xdy) this.d.io();
        int i = 0;
        if (xdyVar.h.l(163, 45803431L, false)) {
            xdyVar.c.c(new xdx(i)).O((avmb) xdyVar.i.x().c).af(new xbo(xdyVar, 6));
        } else {
            xdyVar.c.c(new xee(1)).af(new jbq(xdyVar, (Executor) xdyVar.d.io(), 8));
        }
    }
}
