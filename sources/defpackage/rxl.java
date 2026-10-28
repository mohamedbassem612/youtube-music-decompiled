package defpackage;

import android.text.Spanned;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR, b = aixo.SLOT_TYPE_LOCKSCREEN, d = {shn.class, shq.class, shx.class, sid.class, sjm.class, sjz.class})
public final class rxl implements rxj, rsq {
    public final ListenableFuture a;
    private final Executor b;
    private final sgv c;
    private final rsr d;
    private final smr e;
    private final sko f;
    private final smk g;
    private final sgn h;
    private final wjf i;
    private final sgs j;
    private final slm k;
    private final sol l;
    private final vyo m;
    private boolean n;
    private final rsk o;
    private final snv p;

    public rxl(rsk rskVar, Executor executor, sgv sgvVar, rsr rsrVar, snv snvVar, smr smrVar, sko skoVar, vyo vyoVar) {
        rskVar.getClass();
        this.o = rskVar;
        executor.getClass();
        this.b = executor;
        sgvVar.getClass();
        this.c = sgvVar;
        rsrVar.getClass();
        this.d = rsrVar;
        snvVar.getClass();
        this.p = snvVar;
        this.e = smrVar;
        skoVar.getClass();
        this.f = skoVar;
        this.g = (smk) smrVar.d(sjm.class);
        this.h = (sgn) smrVar.d(shn.class);
        this.i = (wjf) smrVar.d(sid.class);
        this.j = (sgs) smrVar.d(shq.class);
        this.k = (slm) smrVar.d(shx.class);
        this.a = (ListenableFuture) smrVar.d(sjz.class);
        this.l = som.a();
        this.m = vyoVar;
    }

    @Override // defpackage.rxj
    public final void M() {
        this.d.e(this);
        boolean z = false;
        int iE = taq.aZ(this.m) ? nsf.e(0) : nsf.f(this.i.f());
        sol solVar = this.l;
        sgv sgvVar = this.c;
        smk smkVar = this.g;
        sgn sgnVar = this.h;
        wjf wjfVar = this.i;
        slm slmVar = this.k;
        apzz apzzVarH = smkVar.H();
        amud amudVarG = smkVar.G();
        boolean z2 = smkVar.b;
        int i = smkVar.c;
        wjf wjfVar2 = smkVar.r;
        if (wjfVar2 != null && (wjfVar2.u().b & 536870912) != 0) {
            z = true;
        }
        nrk.d(solVar, sgvVar, apzzVarH, amudVarG, sgnVar, wjfVar, slmVar, z2, i, iE, z, false);
        snv snvVar = this.p;
        snvVar.d(wjfVar2);
        snvVar.b(this.j, solVar.f().d);
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture.isDone()) {
            s(listenableFuture);
        } else {
            listenableFuture.addListener(new rno(this, 18), this.b);
        }
        this.o.b(this.e, this.f);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.n = true;
        this.d.h(this);
        snv snvVar = this.p;
        snvVar.b(sgs.d, 3);
        snvVar.c();
        this.o.d(this.e, this.f, i);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.d.h(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        int iE = taq.aZ(this.m) ? nsf.e(0) : nsf.f(this.i.f());
        sol solVar = this.l;
        wjf wjfVar = this.i;
        smk smkVar = this.g;
        wjfVar.f();
        if (nrk.h(solVar, smkVar.c, (int) j, iE)) {
            this.p.b(this.j, 1);
        }
    }

    public final void s(ListenableFuture listenableFuture) {
        aiuv aiuvVar;
        alay alayVar;
        alay alayVar2;
        if (this.n) {
            return;
        }
        try {
            wgi wgiVar = (wgi) listenableFuture.get();
            if (wgiVar != null) {
                amae amaeVar = wgiVar.a;
                alzo alzoVar = amaeVar.h;
                if (alzoVar == null) {
                    alzoVar = alzo.a;
                }
                aqmh aqmhVar = null;
                if (alzoVar.b == 62960614) {
                    alzo alzoVar2 = amaeVar.h;
                    if (alzoVar2 == null) {
                        alzoVar2 = alzo.a;
                    }
                    aiuvVar = alzoVar2.b == 62960614 ? (aiuv) alzoVar2.c : aiuv.a;
                } else {
                    aiuvVar = null;
                }
                if (aiuvVar != null) {
                    if ((aiuvVar.b & 1) != 0) {
                        alayVar = aiuvVar.c;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    Spanned spannedK = ackj.k(null, alayVar, null, false);
                    if ((aiuvVar.b & 2) != 0) {
                        alayVar2 = aiuvVar.d;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                    } else {
                        alayVar2 = null;
                    }
                    Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
                    if ((aiuvVar.b & 32) != 0 && (aqmhVar = aiuvVar.g) == null) {
                        aqmhVar = aqmh.a;
                    }
                    this.p.a(new sok(spannedK, spannedK2, aqmhVar));
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rxj
    public final void b() {
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
