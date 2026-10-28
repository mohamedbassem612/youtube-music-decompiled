package defpackage;

import android.content.Context;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzy extends ycj {
    private final xvi a;
    private final qcb b;

    /* JADX WARN: Illegal instructions before constructor call */
    public xzy(xvi xviVar, qcb qcbVar, Context context, ycp ycpVar, ycp ycpVar2, ttm ttmVar, wjr wjrVar, int i, String str, xla xlaVar, amyv amyvVar, vxz vxzVar) {
        Optional optionalEmpty = Optional.empty();
        xzd xzdVarCS = yno.cS(str);
        xzdVarCS.k(4);
        xzdVarCS.i(xviVar.c());
        xzdVarCS.g(i);
        xzdVarCS.e(amyvVar);
        xzdVarCS.f(xqz.f(xviVar));
        super(context, ycpVar, ycpVar2, wjrVar, ttmVar, xlaVar, amyvVar, optionalEmpty, vxzVar, xzdVarCS.a());
        this.a = xviVar;
        this.b = qcbVar;
    }

    @Override // defpackage.ycj, defpackage.xzc
    public final void I(xyv xyvVar) {
        xyv xyvVar2 = xyv.a;
        super.I(xyvVar2);
        int i = xve.i;
        xvb xvbVar = new xvb();
        xvi xviVar = this.a;
        xvbVar.g(xviVar.c());
        xvbVar.e(xviVar.a());
        xvbVar.b(new xvg(xviVar.d().b));
        xvbVar.f(xviVar.b());
        xve xveVarA = xvbVar.a();
        yaa yaaVar = new yaa((ycj) this);
        ycp ycpVar = this.E;
        yam yamVarB = this.b.B(xveVarA, yaaVar, ycpVar, this);
        this.A = yamVarB;
        yamVarB.l(xyvVar2);
        ycpVar.l(10);
    }

    @Override // defpackage.xzc
    public final xvr j() {
        return this.a;
    }

    @Override // defpackage.yco
    public final void aA() {
    }

    @Override // defpackage.yco
    public final void aB(boolean z) {
    }
}
