package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = aixo.SLOT_TYPE_IN_PLAYER, d = {sjh.class, sif.class, sic.class, sjn.class, shm.class})
public final class rxf implements rxj, rsq {
    public soi a;
    public final rpi b;
    private final rsr c;
    private final Executor d;
    private final smr e;
    private final sko f;
    private final String g;
    private final rsk h;
    private final abnc i;

    public rxf(rsk rskVar, rpi rpiVar, Executor executor, abnc abncVar, rsr rsrVar, smr smrVar, sko skoVar) {
        this.h = rskVar;
        this.c = rsrVar;
        this.b = rpiVar;
        this.d = executor;
        this.i = abncVar;
        this.e = smrVar;
        this.f = skoVar;
        this.g = (String) smrVar.d(sic.class);
        som.a();
        this.a = soi.a;
    }

    private final void s() {
        if (this.a.j) {
            this.d.execute(afwl.i(new rno(this, 12)));
        }
    }

    @Override // defpackage.rxj
    public final void M() {
        this.c.e(this);
        this.h.b(this.e, this.f);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        soi soiVar = this.a;
        int i2 = rww.a;
        agev agevVar = soiVar.c;
        this.c.h(this);
        this.h.d(this.e, this.f, i);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.c.h(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        this.a = rww.d(this.a, abnrVar);
        s();
    }

    @Override // defpackage.rxj
    public final void b() {
        soi soiVarA;
        smr smrVar = this.e;
        abnr abnrVarE = this.i.e();
        alkd alkdVar = (alkd) smrVar.d(sif.class);
        int i = rww.a;
        int i2 = alkdVar.b;
        if (i2 == 156617590) {
            ajvx ajvxVar = i2 == 156617590 ? (ajvx) alkdVar.c : ajvx.a;
            soh sohVarB = soi.b();
            sohVarB.f(agev.i(ajvxVar));
            sohVarB.h(ajvxVar.f);
            sohVarB.k(agke.n(ajvxVar.h));
            sohVarB.d(abnrVarE == abnr.FULLSCREEN);
            soiVarA = sohVarB.a();
        } else {
            soiVarA = soi.a;
        }
        this.a = soiVarA;
        if (soiVarA.b.g()) {
            this.a.b.c();
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        if (str.equals(this.g)) {
            this.a = rww.c(this.a, j);
            s();
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
