package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class riu implements cdt {
    final /* synthetic */ riv a;

    public riu(riv rivVar) {
        this.a = rivVar;
    }

    @Override // defpackage.cdt
    public final cdp[] jA(Handler handler, cty ctyVar, cfx cfxVar, cch cchVar, cch cchVar2) {
        riv rivVar = this.a;
        rivVar.j = new ril(rivVar.d, handler, ctyVar, rivVar.A, rivVar.c, rivVar.h, rivVar.l, rivVar.o, rivVar.q, rivVar.e, rivVar, rivVar.p);
        return new cdp[]{rivVar.j};
    }

    @Override // defpackage.cdt
    public final /* synthetic */ void jB(cdp cdpVar) {
    }
}
