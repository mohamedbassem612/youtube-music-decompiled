package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xtn extends azs {
    final /* synthetic */ xto a;

    public xtn(xto xtoVar) {
        this.a = xtoVar;
    }

    @Override // defpackage.azs
    public final void A(dii diiVar, int i) {
        xto xtoVar = this.a;
        xsj xsjVar = xtoVar.b;
        xsjVar.l(false);
        xtoVar.m(diiVar);
        xsjVar.m(xtoVar.k());
    }

    @Override // defpackage.azs
    public final void x(dii diiVar) {
        xto xtoVar = this.a;
        xsj xsjVar = xtoVar.b;
        List listK = xtoVar.k();
        if (xsjVar.N.l(164, 45673420L, false) && xrx.j(diiVar)) {
            afha afhaVarO = xvq.o();
            afhaVarO.g(diiVar);
            xsjVar.g(afhaVarO.d(), listK);
        } else {
            if (!xsjVar.n()) {
                xsjVar.m(listK);
                return;
            }
            afha afhaVarO2 = xvq.o();
            afhaVarO2.g(diiVar);
            xsjVar.f(afhaVarO2.d(), listK);
        }
    }

    @Override // defpackage.azs
    public final void y(dii diiVar) {
        xto xtoVar = this.a;
        xsj xsjVar = xtoVar.b;
        if ((xsjVar.s() || xsjVar.t()) && !xrx.j(diiVar)) {
            return;
        }
        afha afhaVarO = xvq.o();
        afhaVarO.g(diiVar);
        xsjVar.g(afhaVarO.d(), xtoVar.k());
    }

    @Override // defpackage.azs
    public final void z(dii diiVar) {
        xto xtoVar = this.a;
        xsj xsjVar = xtoVar.b;
        List listK = xtoVar.k();
        if (!xsjVar.n()) {
            xsjVar.m(listK);
            return;
        }
        afha afhaVarO = xvq.o();
        afhaVarO.g(diiVar);
        afhaVarO.f(false);
        xsjVar.u(afhaVarO.d());
    }
}
