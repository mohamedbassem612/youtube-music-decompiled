package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achx implements achv {
    public final awmd a;
    private final Executor b;
    private final abmt c;
    private final xeu d;

    public achx(Executor executor, awmd awmdVar, abmt abmtVar, xeu xeuVar) {
        this.b = executor;
        this.a = awmdVar;
        this.c = abmtVar;
        this.d = xeuVar;
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        return 0;
    }

    @Override // defpackage.achv
    public final int c(achu achuVar) {
        if (achuVar.b == null) {
            return 0;
        }
        this.b.execute(afwl.i(new abwl(this, achuVar, 20)));
        acfz.y(6, 2, achuVar.a, this.d);
        return 1;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe d(alvl alvlVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe e(wno wnoVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ achs f() {
        return null;
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        if (achqVar == null) {
            return false;
        }
        abmt abmtVar = this.c;
        return (achqVar.j || abmtVar.bk() || (abmtVar.bL() && achqVar.k)) && achqVar.e != null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void i(aazj aazjVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void j(aazk aazkVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void k(aazn aaznVar) {
    }
}
