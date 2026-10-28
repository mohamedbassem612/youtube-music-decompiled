package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class run implements rsq {
    public final tbt a;
    public Optional b;

    public run(tbt tbtVar) {
        this.a = tbtVar;
    }

    public final void a(smc smcVar, sgm sgmVar, slm slmVar) {
        this.a.c(new sen(smcVar, sgmVar, slmVar));
    }

    public final void b(slc slcVar, slm slmVar) {
        this.a.c(new sfh(slcVar, slmVar));
    }

    public final void c(slc slcVar, slm slmVar) {
        this.a.c(new sfi(slcVar, slmVar));
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar == abob.e && this.b.isPresent()) {
            xir xirVar = (xir) this.b.get();
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.b |= 2097152;
            amiuVar.s = true;
            xirVar.h((amiu) aihfVarCreateBuilder.build());
        }
    }

    public final void s() {
        this.a.c(new sfn());
        if (this.b.isPresent()) {
            xir xirVar = (xir) this.b.get();
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            amjo amjoVar = amjo.LATENCY_AD_BREAK_TYPE_PREROLL;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.z = amjoVar.e;
            amiuVar.c |= 1;
            xirVar.h((amiu) aihfVarCreateBuilder.build());
            ((xir) this.b.get()).n("ad_bl");
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
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
