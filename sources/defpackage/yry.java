package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yry implements yse {
    public final Object a = new Object();
    public boolean b;
    final /* synthetic */ ysf c;
    private yqs d;

    public yry(ysf ysfVar) {
        this.c = ysfVar;
    }

    @Override // defpackage.yse
    public final void a() {
        ysf ysfVar = this.c;
        synchronized (this.a) {
            this.b = true;
            awuz awuzVar = ysfVar.g;
            if (awuzVar != null) {
                awuzVar.p(null);
            }
            Object obj = ysfVar.h;
            if (obj != null) {
                avnr.b((AtomicReference) obj);
            }
            yqs yqsVar = this.d;
            if (yqsVar != null) {
                yqsVar.c();
            }
            yqs yqsVar2 = this.d;
            if (yqsVar2 != null) {
                yqsVar2.a().cancel(false);
            }
        }
    }

    @Override // defpackage.yse
    public final void b(tjk tjkVar) {
        avlr avlrVarA;
        tjk tjkVar2;
        boolean z;
        try {
            ysf ysfVar = this.c;
            avlrVarA = ysfVar.c(ysfVar.a, ysfVar.b, ysfVar.d.U());
        } catch (Throwable th) {
            avlrVarA = avlr.A(th);
        }
        avlr avlrVar = avlrVarA;
        Object obj = this.a;
        ysf ysfVar2 = this.c;
        synchronized (obj) {
            if (this.b) {
                z = true;
                tjkVar2 = tjkVar;
            } else {
                if (ysfVar2.e.eh()) {
                    ysfVar2.h = ysfVar2.e(avlrVar, tjkVar);
                    tjkVar2 = tjkVar;
                } else {
                    tjkVar2 = tjkVar;
                    ysfVar2.g = awro.r(ysfVar2.c.H(ysfVar2.a), awov.a, 1, new aehp(this, ysfVar2, avlrVar, tjkVar2, (awoq) null, 1));
                }
                z = false;
            }
        }
        if (z) {
            tjkVar2.b(new CancellationException("Cancelled before run"));
        }
    }

    @Override // defpackage.yse
    public final void c(tjk tjkVar) {
        boolean z;
        try {
            ysf ysfVar = this.c;
            yqs yqsVarB = ysfVar.b(ysfVar.a, ysfVar.b, ysfVar.d.U());
            Object obj = this.a;
            ysf ysfVar2 = this.c;
            synchronized (obj) {
                z = false;
                if (this.b) {
                    yqsVarB.a().cancel(false);
                    yqsVarB.c();
                    z = true;
                } else {
                    this.d = yqsVarB;
                    awuz awuzVarR = awro.r(ysfVar2.c.H(ysfVar2.a), awov.a, 1, new qbj(yqsVarB, tjkVar, (awoq) null, 19));
                    awuzVarR.kJ(new hgo(ysfVar2, yqsVarB, tjkVar, 11));
                    ysfVar2.g = awuzVarR;
                }
            }
            if (z) {
                tjkVar.b(new CancellationException("Cancelled before run"));
            }
        } catch (Throwable th) {
            this.c.f(th, tjkVar);
        }
    }

    @Override // defpackage.yse
    public final boolean d(yqs yqsVar) {
        boolean z;
        synchronized (this.a) {
            if (this.b) {
                yqsVar.c();
                z = false;
            } else {
                this.d = yqsVar;
                z = true;
            }
        }
        return z;
    }
}
