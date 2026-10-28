package defpackage;

import android.graphics.Matrix;
import android.util.Size;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class res implements reo {
    public static final /* synthetic */ int h = 0;
    private static final rbm i = new rbm("res");
    private Size a;
    public qup b;
    public final req c;
    protected final rjm d;
    public final int e;
    public Runnable f;
    public rei g;

    public res(qup qupVar, req reqVar, rjm rjmVar, int i2) {
        this.b = qupVar;
        this.c = reqVar;
        this.d = rjmVar;
        this.a = reqVar.n();
        this.e = Math.min(i2, reqVar.p().f);
    }

    private final ren h() {
        rei reiVar = this.g;
        reiVar.getClass();
        if (!reiVar.d().isDone()) {
            return ren.a;
        }
        try {
            rei reiVar2 = this.g;
            reiVar2.getClass();
            ahng.v(reiVar2.d());
            return null;
        } catch (ExecutionException e) {
            rbc rbcVar = new rbc(i, rbd.c);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("LiveRenderer failed to start up.", new Object[0]);
            req reqVar = this.c;
            tge tgeVarA = quk.a();
            tgeVarA.b = e;
            tgeVarA.c = new quh(this.b.a, 1);
            reqVar.a(tgeVarA.e());
            return ren.c;
        }
    }

    private final Duration l() {
        return this.c.p().e ? e() : Duration.ZERO;
    }

    private final void q(Duration duration) {
        rei reiVar = this.g;
        reiVar.getClass();
        reiVar.g = duration;
        if (h() != null) {
            if (reiVar.h == null) {
                reiVar.h = this.c.s().d(reiVar.d(), new onn(reiVar, 15));
            }
        } else {
            rgp rgpVar = reiVar.f;
            if (rgpVar == null || !rgpVar.f(duration)) {
                reiVar.a(duration);
            }
        }
    }

    private final int r(Duration duration) {
        int i2;
        if (this.b.it()) {
            Duration durationMinus = this.b.c.minus(l());
            Duration durationB = this.b.b();
            Duration durationPlus = durationB.plus(l());
            req reqVar = this.c;
            if (!reqVar.p().a.x) {
                durationPlus = durationPlus.plus(reqVar.w());
            }
            if (duration.compareTo(durationMinus) < 0) {
                i2 = 1;
            } else if (duration.compareTo(this.b.c) < 0) {
                i2 = 2;
            } else if (duration.compareTo(durationB) < 0) {
                i2 = 3;
            } else {
                i2 = duration.compareTo(durationPlus) < 0 ? 4 : 5;
            }
        } else {
            i2 = 6;
        }
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            rei reiVar = this.g;
            if (reiVar != null) {
                try {
                    reiVar.close();
                } catch (Exception e) {
                    rbc rbcVar = new rbc(i, rbd.e);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Failed to close the LiveRenderer.", new Object[0]);
                }
                this.g = null;
            }
        } else if (this.g == null) {
            try {
                new rbc(i, rbd.a).a("Renderer going live at %s", duration);
                rei reiVarF = f();
                this.g = reiVarF;
                Runnable runnable = this.f;
                if (runnable != null) {
                    reiVarF.e(runnable);
                }
            } catch (Exception e2) {
                rbc rbcVar2 = new rbc(i, rbd.e);
                rbcVar2.a = e2;
                rbcVar2.c();
                rbcVar2.a("Failed to create the LiveRenderer.", new Object[0]);
                return 6;
            }
        }
        return i2;
    }

    protected void c(rfs rfsVar) {
        rfsVar.y(((quu) this.b.b).a);
        rfsVar.v(this.b.a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        rei reiVar = this.g;
        if (reiVar != null) {
            reiVar.close();
            this.g = null;
        }
    }

    public synchronized boolean d(qup qupVar, Duration duration) {
        qup qupVar2 = this.b;
        this.b = qupVar;
        rjg rjgVarA = this.d.a(qupVar2, qupVar);
        rei reiVar = this.g;
        boolean zI = i(rjgVarA);
        boolean z = false;
        boolean z2 = reiVar != null;
        if (zI && z2) {
            try {
                rei reiVar2 = this.g;
                reiVar2.getClass();
                reiVar2.close();
                this.g = null;
                if (r(duration) == 3) {
                    z = true;
                }
            } catch (Exception e) {
                rbc rbcVar = new rbc(i, rbd.e);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Failed to close the LiveRenderer.", new Object[0]);
            }
            return z;
        }
        boolean z3 = (rjgVarA.b(rjf.a) || rjgVarA.b(rjf.b)) && (r(duration) == 3 || z2);
        Size size = this.a;
        req reqVar = this.c;
        if (!size.equals(reqVar.n())) {
            this.a = reqVar.n();
            rjgVarA.a(rjf.v);
        }
        if (rjgVarA.b(rjf.h) || rjgVarA.b(rjf.v) || rjgVarA.b(rjf.i) || rjgVarA.b(rjf.k)) {
            z3 = true;
        }
        rei reiVar3 = this.g;
        if (reiVar3 == null || !z2) {
            return z3;
        }
        if (reiVar3.e.isPresent()) {
            boolean z4 = ((rgw) reiVar3.e.get()).j(k()).a;
            if (z4) {
                rjgVarA.a(rjf.t);
            }
            z3 |= z4;
        }
        return reiVar3.b(rjgVarA) || z3;
    }

    protected abstract Duration e();

    protected abstract rei f();

    protected boolean i(rjg rjgVar) {
        return false;
    }

    @Override // defpackage.rer
    public final /* synthetic */ rep iw(Duration duration) {
        return g(duration);
    }

    @Override // defpackage.reo
    public final synchronized Duration ix() {
        qup qupVar;
        qupVar = this.b;
        return qupVar.c.plus(qupVar.d);
    }

    @Override // defpackage.reo
    public final synchronized Duration iy() {
        return this.b.c;
    }

    @Override // defpackage.reo
    public final synchronized void iz(Duration duration) {
        int iR = r(duration) - 1;
        if (iR == 1) {
            q(this.b.c);
        } else {
            if (iR != 2) {
                return;
            }
            q(duration);
        }
    }

    public final int j(Duration duration) {
        req reqVar = this.c;
        if (!reqVar.p().d) {
            return 0;
        }
        reqVar.p();
        return ((int) Math.ceil((ahbt.a(reqVar.w()) * ((long) (reqVar.p().c - 1))) / ahbt.a(duration))) + 1;
    }

    protected List k() {
        return this.b.is();
    }

    protected void m(Duration duration) {
        rbc rbcVar = new rbc(i, rbd.c);
        rbcVar.c();
        rbcVar.a("Recreating live renderer at %s", duration);
        try {
            rei reiVar = this.g;
            if (reiVar != null) {
                reiVar.close();
                this.g = null;
            }
        } catch (Exception e) {
            rbc rbcVar2 = new rbc(i, rbd.e);
            rbcVar2.a = e;
            rbcVar2.c();
            rbcVar2.a("Failed to close the LiveRenderer.", new Object[0]);
        }
        iz(duration);
    }

    public final void n(rfs rfsVar, rjp rjpVar, Duration duration) {
        req reqVar = this.c;
        Size sizeN = reqVar.n();
        Matrix matrixR = nra.r(rjpVar.l(), rjpVar.n(duration), rjpVar.e(duration), rjpVar.k(duration), rfsVar.k().isPresent() ? ((Size) rfsVar.k().get()).getWidth() : rfsVar.getWidth(), rfsVar.k().isPresent() ? ((Size) rfsVar.k().get()).getHeight() : rfsVar.getHeight(), sizeN.getWidth(), sizeN.getHeight(), rjpVar.o());
        rfsVar.w(matrixR);
        if (rfsVar.k().isEmpty()) {
            rfsVar.c.c = nra.m(rjpVar.l());
        }
        rfsVar.x(nra.p(matrixR, reqVar.n()));
        rfsVar.t(rjpVar.g(duration));
        rfsVar.y(rjpVar.i());
    }

    protected boolean o() {
        return false;
    }

    @Override // defpackage.rer
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final synchronized ren g(Duration duration) {
        int iR = r(duration) - 1;
        if (iR != 2) {
            if (iR == 3 || iR == 4) {
                return ren.b;
            }
            return ren.c;
        }
        ren renVarH = h();
        if (renVarH == null) {
            rei reiVar = this.g;
            reiVar.getClass();
            renVarH = reiVar.c(duration);
            int iOrdinal = renVarH.d.ordinal();
            if (iOrdinal == 0) {
                c(renVarH.a());
            } else if (iOrdinal == 2 && o()) {
                m(duration);
            }
        }
        return renVarH;
    }

    protected res(qup qupVar, req reqVar, int i2) {
        this(qupVar, reqVar, rjm.a, i2);
    }

    protected res(qup qupVar, req reqVar) {
        this(qupVar, reqVar, rjm.a, 0);
    }
}
