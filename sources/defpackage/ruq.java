package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ruq implements sah, rsq {
    public final awmd a;
    public final awmd b;
    public final abmt c;
    private zzi d;
    private Optional e = Optional.empty();

    public ruq(awmd awmdVar, awmd awmdVar2, abmt abmtVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = abmtVar;
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        if (smrVar.c() == aixo.SLOT_TYPE_PLAYER_BYTES && skoVar.f(aixg.LAYOUT_TYPE_MEDIA, sjb.class)) {
            this.d = new rup(this, smrVar, skoVar);
            ((zzj) this.a.io()).c(this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zzi] */
    public final synchronized void b(sgc sgcVar) {
        Optional optional = this.e;
        rbj rbjVar = new rbj(this, 20);
        if (true == optional.isPresent()) {
            ((zzj) ((ruq) rbjVar.a).a.io()).e(optional.get());
        }
        this.e = Optional.of(sgcVar);
        ((zzj) this.a.io()).c(sgcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zzi] */
    public final synchronized void c() {
        Optional optional = this.e;
        rbj rbjVar = new rbj(this, 19);
        if (true == optional.isPresent()) {
            ((zzj) ((ruq) rbjVar.a).a.io()).e(optional.get());
        }
        this.e = Optional.empty();
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar != abob.a || this.d == null) {
            return;
        }
        ((zzj) this.a.io()).e(this.d);
        this.d = null;
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
