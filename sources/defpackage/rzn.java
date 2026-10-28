package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzn implements rsq {
    public final awmd a;
    public final awmd b;
    private final awmd c;

    public rzn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = awmdVar;
        this.c = awmdVar2;
        this.b = awmdVar3;
    }

    @Override // defpackage.rsq
    public final void n(wgi wgiVar, String str, wjf wjfVar) {
        if (wgiVar != null) {
            amae amaeVar = wgiVar.a;
            if ((amaeVar.b & 32768) == 0 && amaeVar.i.size() == 0) {
                return;
            }
            if ((amaeVar.b & 32768) != 0) {
                ((roq) this.c.io()).f(16, skh.a(str, wjfVar), new mly(this, wgiVar, str, 3));
            } else if (amaeVar.i.size() > 0) {
                ((roq) this.c.io()).f(16, skh.a(str, wjfVar), new mly(this, wgiVar, str, 4));
            }
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
