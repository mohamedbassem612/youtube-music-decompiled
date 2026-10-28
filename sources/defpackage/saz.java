package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_PLAYER_BYTES, d = {shx.class, sjy.class, sid.class, sih.class})
public final class saz extends say implements rsq {
    private final rsr b;
    private final mbc c;
    private boolean d;
    private long e;
    private final tld f;

    public saz(rsk rskVar, vyo vyoVar, acm acmVar, sbr sbrVar, smr smrVar, tbt tbtVar, Executor executor, sbj sbjVar, tld tldVar, mbc mbcVar, rmp rmpVar, rsr rsrVar, awmd awmdVar, Context context, abvn abvnVar) {
        super(rskVar, vyoVar, acmVar, sbrVar, smrVar, tbtVar, executor, sbjVar, awmdVar, context, abvnVar);
        this.f = tldVar;
        this.c = mbcVar;
        this.b = rsrVar;
        this.d = false;
        this.e = 0L;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [acey, java.lang.Object] */
    @Override // defpackage.say, defpackage.sba
    public final void a(shh shhVar) {
        super.a(shhVar);
        this.b.e(this);
        abvk abvkVar = (abvk) this.f.b;
        acfw acfwVarH = abvkVar.h();
        ?? r5 = abvkVar.o.d;
        if (acfwVarH != null && r5 != 0 && acfwVarH.b() - r5.f() <= 15000) {
            this.d = true;
        }
        this.e = this.c.f().toEpochMilli();
    }

    @Override // defpackage.say, defpackage.sba
    public final void b() {
        super.b();
        if (this.e == 0) {
            rmp.j(this.a, "exit() was called without an enter() before it");
        }
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar == abob.a) {
            this.b.h(this);
        }
        if (abobVar == abob.i) {
            boolean z = this.d;
            tld tldVar = this.f;
            if (z) {
                ((abvk) tldVar.b).af(((vxz) tldVar.a).c(9, 45382718L, 0L));
            } else {
                ((abvk) tldVar.b).ae(this.c.f().toEpochMilli() - this.e, appa.SEEK_SOURCE_UNKNOWN);
            }
            this.b.h(this);
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
