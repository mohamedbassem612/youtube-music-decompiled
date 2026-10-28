package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xeo extends xeu {
    public final xfg a;
    private final zus c;
    private final Executor d;
    private volatile boolean g;

    public xeo(zus zusVar, Executor executor, ztf ztfVar, xet xetVar, xfg xfgVar) {
        super(ztfVar, xetVar);
        this.c = zusVar;
        this.d = executor;
        this.a = xfgVar;
    }

    @Override // defpackage.xeu
    public final xff a(Object obj, alot alotVar) {
        zup zupVar;
        int i = alotVar.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        return new xff(obj, alotVar, zupVar, this);
    }

    @Override // defpackage.xeu
    public final boolean b(alou alouVar) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        ztf ztfVar = xffVar.k.e;
        xffVar.l = ztfVar.a();
        ztfVar.k(xffVar);
        return true;
    }

    @Override // defpackage.xeu
    public final boolean c(alou alouVar, long j) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        xffVar.h = j;
        ztf ztfVar = xffVar.k.e;
        xffVar.l = ztfVar.a();
        ztfVar.k(xffVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, zwa] */
    @Override // defpackage.xeu
    public final void d(alou alouVar, xel xelVar) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        Optional optional = xelVar.c;
        if (optional.isPresent()) {
            zvh zvhVar = (zvh) optional.get();
            xffVar.o = zvhVar.a;
            xffVar.p = zvhVar.b;
        }
        Optional optional2 = xelVar.b;
        if (optional2.isPresent()) {
            xffVar.n = optional2.get().k();
        }
        long j = xelVar.a;
        if (j > 0) {
            xffVar.h = j;
        }
        if (xelVar.d) {
            xffVar.i = 2;
        }
        ztf ztfVar = xffVar.k.e;
        xffVar.l = ztfVar.a();
        ztfVar.k(xffVar);
    }

    @Override // defpackage.xeu
    public final void e(alou alouVar) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        ztf ztfVar = xffVar.k.e;
        xffVar.l = ztfVar.a();
        ztfVar.l(xffVar);
    }

    @Override // defpackage.xeu
    public final void f(final Function function) {
        final long jB = ((xet) this.f).b(this.c.a());
        this.d.execute(new Runnable() { // from class: xem
            @Override // java.lang.Runnable
            public final void run() {
                zup zupVar;
                alos alosVar = (alos) function.apply((alos) alou.a.createBuilder());
                alot alotVarA = alot.a(((alou) alosVar.instance).c);
                int i = alotVarA.jH;
                xeo xeoVar = this.a;
                xfg xfgVar = xeoVar.a;
                if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
                    zupVar = xfgVar.f;
                }
                long j = jB;
                xff xffVar = new xff(alosVar, alotVarA, zupVar, xeoVar);
                xffVar.g = j;
                ztf ztfVar = xffVar.k.e;
                xffVar.l = ztfVar.a();
                ztfVar.k(xffVar);
            }
        });
    }

    @Override // defpackage.xeu
    public final void g(final Function function, final xel xelVar) {
        final long jB = ((xet) this.f).b(this.c.a());
        this.d.execute(new Runnable() { // from class: xen
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, zwa] */
            @Override // java.lang.Runnable
            public final void run() {
                zup zupVar;
                alos alosVar = (alos) function.apply((alos) alou.a.createBuilder());
                alot alotVarA = alot.a(((alou) alosVar.instance).c);
                int i = alotVarA.jH;
                xeo xeoVar = this.a;
                xfg xfgVar = xeoVar.a;
                if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
                    zupVar = xfgVar.f;
                }
                xel xelVar2 = xelVar;
                xff xffVar = new xff(alosVar, alotVarA, zupVar, xeoVar);
                Optional optional = xelVar2.c;
                if (optional.isPresent()) {
                    zvh zvhVar = (zvh) optional.get();
                    xffVar.o = zvhVar.a;
                    xffVar.p = zvhVar.b;
                }
                Optional optional2 = xelVar2.b;
                if (optional2.isPresent()) {
                    xffVar.n = optional2.get().k();
                }
                long j = xelVar2.a;
                if (j > 0) {
                    xffVar.h = j;
                }
                if (xelVar2.d) {
                    xffVar.i = 2;
                }
                xffVar.g = jB;
                ztf ztfVar = xffVar.k.e;
                xffVar.l = ztfVar.a();
                ztfVar.k(xffVar);
            }
        });
    }

    @Override // defpackage.xeu
    public final void h(alou alouVar, akku akkuVar) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        int iA = zvb.a(akkuVar);
        xffVar.q = iA;
        ztf ztfVar = xffVar.k.e;
        zvb zvbVarC = ztfVar.c();
        if (zvbVarC != null) {
            xffVar.a = zvbVarC.b(iA);
        }
        xffVar.l = ztfVar.a();
        ztfVar.k(xffVar);
    }

    @Override // defpackage.xeu
    public final void i(alou alouVar, zwa zwaVar) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        xffVar.n = zwaVar.k();
        ztf ztfVar = xffVar.k.e;
        xffVar.l = ztfVar.a();
        ztfVar.k(xffVar);
    }

    @Override // defpackage.xeu
    public final void j(alou alouVar, zwa zwaVar, long j, zvh zvhVar) {
        zup zupVar;
        alot alotVarA = alot.a(alouVar.c);
        int i = alotVarA.jH;
        xfg xfgVar = this.a;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        xff xffVar = new xff(alouVar, alotVarA, zupVar, this);
        if (zvhVar != null) {
            xffVar.o = zvhVar.a;
            xffVar.p = zvhVar.b;
        }
        if (zwaVar != null) {
            xffVar.n = zwaVar.k();
        }
        xffVar.h = j;
        ztf ztfVar = xffVar.k.e;
        xffVar.l = ztfVar.a();
        ztfVar.l(xffVar);
    }

    @Override // defpackage.xeu
    public final synchronized void k() {
        if (!this.g) {
            this.a.b();
            this.g = true;
        }
    }
}
