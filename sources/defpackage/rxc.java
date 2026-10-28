package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = aixo.SLOT_TYPE_IN_PLAYER, c = {sig.class})
public final class rxc implements rxj, rsq {
    soi a = soi.a;
    private final rsr b;
    private final smr c;
    private final sko d;
    private final apji e;
    private final rsk f;
    private final abnc g;
    private final rpi h;

    public rxc(rsk rskVar, rsr rsrVar, rpi rpiVar, abnc abncVar, smr smrVar, sko skoVar) {
        this.f = rskVar;
        this.b = rsrVar;
        this.h = rpiVar;
        this.g = abncVar;
        this.c = smrVar;
        this.d = skoVar;
        this.e = (apji) skoVar.d(sig.class);
    }

    private final void s() {
        if (rww.f(this.a)) {
            new xgj(this.a.d, (amud) null);
            rmp.n(null, "No interactionLogger available for logShown");
            this.a = rww.e(this.a);
        }
    }

    @Override // defpackage.rxj
    public final void M() {
        if (!this.a.b.g()) {
            this.f.u(this.c, this.d, new sas("Null CTA renderer for discovery InPlayer", 37), 10);
            return;
        }
        this.a.b.c();
        this.b.e(this);
        this.f.b(this.c, this.d);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        soi soiVar = this.a;
        int i2 = rww.a;
        agev agevVar = soiVar.c;
        this.b.h(this);
        this.f.d(this.c, this.d, i);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        soi soiVarD = rww.d(this.a, abnrVar);
        this.a = soiVarD;
        if (soiVarD.j) {
            int i3 = soiVarD.l;
            boolean z = soiVarD.g;
            s();
        }
    }

    @Override // defpackage.rxj
    public final void b() {
        this.a = rww.b(this.g.e(), this.e);
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        soi soiVarC = rww.c(this.a, j);
        this.a = soiVarC;
        if (soiVarC.j) {
            int i = soiVarC.l;
            boolean z2 = soiVarC.g;
            s();
        }
    }

    @Override // defpackage.rxj
    public final void S() {
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
