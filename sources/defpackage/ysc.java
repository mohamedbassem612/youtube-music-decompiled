package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ysc implements yse {
    final /* synthetic */ ysf a;

    public ysc(ysf ysfVar) {
        this.a = ysfVar;
    }

    @Override // defpackage.yse
    public final void a() {
        ysf ysfVar = this.a;
        awuz awuzVar = ysfVar.g;
        if (awuzVar != null) {
            awuzVar.p(null);
        }
        Object obj = ysfVar.h;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
    }

    @Override // defpackage.yse
    public final void b(tjk tjkVar) {
        avlr avlrVarA;
        try {
            ysf ysfVar = this.a;
            avlrVarA = ysfVar.c(ysfVar.a, ysfVar.b, ysfVar.d.U());
        } catch (Throwable th) {
            avlrVarA = avlr.A(th);
        }
        avlr avlrVar = avlrVarA;
        ysf ysfVar2 = this.a;
        if (ysfVar2.e.eh()) {
            ysfVar2.h = ysfVar2.e(avlrVar, tjkVar);
        } else {
            ysfVar2.g = awro.r(ysfVar2.c.H(ysfVar2.a), awov.a, 1, new ysb(ysfVar2, avlrVar, tjkVar, (awoq) null, 0));
        }
    }

    @Override // defpackage.yse
    public final void c(tjk tjkVar) {
        tjk tjkVar2;
        try {
            ysf ysfVar = this.a;
            tns tnsVar = ysfVar.a;
            yqs yqsVarB = ysfVar.b(tnsVar, ysfVar.b, ysfVar.d.U());
            tjkVar2 = tjkVar;
            try {
                awuz awuzVarR = awro.r(ysfVar.c.H(tnsVar), awov.a, 1, new qbj(yqsVarB, tjkVar2, (awoq) null, 20, (byte[]) null));
                awuzVarR.kJ(new hgo(ysfVar, yqsVarB, tjkVar2, 12));
                ysfVar.g = awuzVarR;
            } catch (Throwable th) {
                th = th;
                this.a.f(th, tjkVar2);
            }
        } catch (Throwable th2) {
            th = th2;
            tjkVar2 = tjkVar;
        }
    }

    @Override // defpackage.yse
    public final boolean d(yqs yqsVar) {
        return true;
    }
}
