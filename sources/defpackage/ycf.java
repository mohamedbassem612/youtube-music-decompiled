package defpackage;

import android.content.Context;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ycf extends ycj {
    private final xvp a;
    private final qcb b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ycf(xvp xvpVar, ycp ycpVar, ycp ycpVar2, amyv amyvVar, String str, int i, String str2, Context context, wjr wjrVar, ttm ttmVar, xla xlaVar, vxz vxzVar, qcb qcbVar) {
        context.getClass();
        wjrVar.getClass();
        ttmVar.getClass();
        xlaVar.getClass();
        vxzVar.getClass();
        qcbVar.getClass();
        Optional optionalOfNullable = Optional.ofNullable(str);
        xzd xzdVarCS = yno.cS(str2);
        xzdVarCS.k(6);
        xzdVarCS.i(xvpVar.c);
        xzdVarCS.g(i);
        String strF = xqz.f(xvpVar);
        strF.getClass();
        xzdVarCS.f(strF);
        super(context, ycpVar, ycpVar2, wjrVar, ttmVar, xlaVar, amyvVar, optionalOfNullable, vxzVar, xzdVarCS.a());
        this.a = xvpVar;
        this.b = qcbVar;
    }

    @Override // defpackage.ycj, defpackage.xzc
    public final void I(xyv xyvVar) {
        super.I(xyvVar);
        yaa yaaVar = new yaa((ycj) this);
        qcb qcbVar = this.b;
        ycp ycpVar = this.E;
        yam yamVarB = qcbVar.B(this.a.f, yaaVar, ycpVar, this);
        yamVarB.m(xyvVar, this.B);
        this.A = yamVarB;
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
