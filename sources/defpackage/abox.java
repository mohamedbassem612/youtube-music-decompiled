package defpackage;

import android.util.Pair;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abox implements avnn {
    final /* synthetic */ abnl a;
    final /* synthetic */ String b;
    final /* synthetic */ abpd c;

    public abox(abpd abpdVar, abnl abnlVar, String str) {
        this.a = abnlVar;
        this.b = str;
        this.c = abpdVar;
    }

    @Override // defpackage.avnn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        agfr agfrVar = (agfr) obj;
        abri abriVar = (abri) agfrVar.io();
        abpd abpdVar = this.c;
        Pair pairC = abpdVar.c(abriVar, false);
        if (pairC != null && abpdVar.p(pairC)) {
            return avlr.J((wjf) pairC.first);
        }
        vyo vyoVar = abpdVar.h;
        abnl abnlVar = this.a;
        String str = this.b;
        Optional optionalL = abnlVar.l();
        Duration durationJ = abnlVar.j();
        byte[] bArrR = abnlVar.R();
        arie arieVar = abnlVar.i().c;
        if (arieVar == null) {
            arieVar = arie.a;
        }
        yrr yrrVarG = yrr.g(vyoVar, optionalL, str, durationJ, null, bArrR, null, null, arieVar, null, abnlVar.C(), abpdVar.o());
        if (yrrVarG == null) {
            throw new IllegalArgumentException("Unexpected null onesieRequest.");
        }
        yrrVarG.x = 2;
        yrrVarG.b(abnlVar.w());
        String strW = abnlVar.w();
        abri abriVar2 = (abri) agfrVar.io();
        abriVar2.getClass();
        return (abpdVar.r() ? tzk.c(abpdVar.b.c(abriVar2, str, yrrVarG, null)).k().K(new mkc(abpdVar, abriVar2, yrrVarG, 9)) : abpdVar.b.h(abriVar2, new abpc(abpdVar, abriVar2, strW, null), yrrVarG, true, null)).x(new xuk(17));
    }
}
