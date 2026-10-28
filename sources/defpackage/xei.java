package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xei extends xeu {
    public final awmd a;
    private final awmd c;
    private final Executor d;

    public xei(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Executor executor) {
        super((ztf) awmdVar.io(), (zsz) awmdVar2.io());
        this.c = awmdVar3;
        this.a = awmdVar4;
        this.d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zwa] */
    private final xie l(xel xelVar) {
        xek xekVarA = xel.a();
        if (xelVar != null) {
            xekVarA.d(xelVar.a);
            Optional optional = xelVar.b;
            if (optional.isPresent()) {
                xekVarA.b(optional.get());
            }
            Optional optional2 = xelVar.c;
            if (optional2.isPresent()) {
                xekVarA.e((zvh) optional2.get());
            }
        }
        xej xejVar = (xej) this.c.io();
        xekVarA.c(false);
        return xejVar.b(xekVarA.a());
    }

    private final xie m(long j, zwa zwaVar, zvh zvhVar) {
        xek xekVarA = xel.a();
        if (j != Long.MIN_VALUE) {
            xekVarA.d(j);
        }
        if (zwaVar != null) {
            xekVarA.b(zwaVar);
        }
        if (zvhVar != null) {
            xekVarA.e(zvhVar);
        }
        xej xejVar = (xej) this.c.io();
        xekVarA.c(false);
        return xejVar.b(xekVarA.a());
    }

    @Override // defpackage.xeu
    public final xff a(Object obj, alot alotVar) {
        xff xffVar = new xff(obj, alotVar, zvb.a, this);
        xffVar.i = 3;
        return xffVar;
    }

    @Override // defpackage.xeu
    public final boolean b(alou alouVar) {
        this.d.execute(new vwh(this, alouVar, l(null), 9, (short[]) null));
        return true;
    }

    @Override // defpackage.xeu
    public final boolean c(alou alouVar, long j) {
        this.d.execute(new vwh(this, alouVar, m(j, null, null), 10, (short[]) null));
        return true;
    }

    @Override // defpackage.xeu
    public final void d(alou alouVar, xel xelVar) {
        this.d.execute(new vwh(this, alouVar, l(xelVar), 11, (short[]) null));
    }

    @Override // defpackage.xeu
    public final void e(alou alouVar) {
        ((wjr) this.a.io()).B((alos) alouVar.toBuilder(), l(null));
    }

    @Override // defpackage.xeu
    public final void f(final Function function) {
        final xie xieVarL = l(null);
        this.d.execute(new Runnable() { // from class: xeg
            @Override // java.lang.Runnable
            public final void run() {
                ((wjr) this.a.a.io()).C(function, xieVarL);
            }
        });
    }

    @Override // defpackage.xeu
    public final void g(final Function function, xel xelVar) {
        final xie xieVarL = l(xelVar);
        this.d.execute(new Runnable() { // from class: xeh
            @Override // java.lang.Runnable
            public final void run() {
                ((wjr) this.a.a.io()).C(function, xieVarL);
            }
        });
    }

    @Override // defpackage.xeu
    public final void h(alou alouVar, akku akkuVar) {
        xej xejVar = (xej) this.c.io();
        xel xelVarB = xel.b(false);
        xid xidVarA = xie.a();
        xidVarA.d = Optional.of(akkuVar);
        this.d.execute(new vwh(this, alouVar, xejVar.c(xidVarA, xelVarB), 8, (short[]) null));
    }

    @Override // defpackage.xeu
    public final void i(alou alouVar, zwa zwaVar) {
        this.d.execute(new vwh(this, alouVar, m(Long.MIN_VALUE, zwaVar, null), 12, (short[]) null));
    }

    @Override // defpackage.xeu
    public final void j(alou alouVar, zwa zwaVar, long j, zvh zvhVar) {
        ((wjr) this.a.io()).B((alos) alouVar.toBuilder(), m(j, zwaVar, zvhVar));
    }
}
