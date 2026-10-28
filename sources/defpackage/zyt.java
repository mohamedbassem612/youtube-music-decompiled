package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zyt implements tgg {
    public final ahey a;
    public final vxz b;
    private final tgg c;
    private final Executor d;
    private final Executor e;
    private final Executor f;
    private final abxv g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public zyt(ahey aheyVar, vxz vxzVar, abxv abxvVar, tgg tggVar, Optional optional, Optional optional2, Executor executor) {
        this.g = abxvVar;
        this.a = aheyVar;
        this.c = tggVar;
        this.b = vxzVar;
        this.d = optional.isPresent() ? optional.get() : executor;
        this.e = optional2.isPresent() ? optional2.get() : executor;
        this.f = executor;
    }

    @Override // defpackage.tgg
    public final tgz a(tns tnsVar, tha thaVar) {
        return this.c.a(tnsVar, thaVar);
    }

    @Override // defpackage.tgg
    public final tns b(tns tnsVar) {
        if (tnsVar.n().isEmpty()) {
            return this.c.b(tnsVar);
        }
        Executor executor = this.f;
        if (tnsVar.C()) {
            executor = tnsVar.af() == tnr.d ? this.d : this.e;
        }
        ListenableFuture listenableFutureC = c(tnsVar);
        wuy wuyVar = new wuy(tnsVar, 11);
        yqj yqjVar = new yqj(tnsVar, 4);
        Executor executor2 = taf.a;
        taa taaVar = new taa(yqjVar, null, wuyVar);
        long j = afwl.a;
        listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar, 0)), executor);
        return tnsVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.tgg
    public final ListenableFuture c(tns tnsVar) {
        aczl aczlVar;
        if (tnsVar.n().isEmpty()) {
            return this.c.c(tnsVar);
        }
        if (this.b.l(56, 45416561L, false)) {
            abxv abxvVar = this.g;
            ahey aheyVar = (ahey) abxvVar.a.io();
            aheyVar.getClass();
            elr elrVar = (elr) abxvVar.c.io();
            elrVar.getClass();
            mbc mbcVar = (mbc) abxvVar.d.io();
            mbcVar.getClass();
            aczlVar = new aczl(aheyVar, elrVar, mbcVar, tnsVar);
        } else {
            ascs ascsVar = (ascs) tnsVar.n().orElse(ascs.a);
            aqrv aqrvVarM = tnsVar.m();
            abxv abxvVar2 = this.g;
            String strS = tnsVar.s();
            ahey aheyVar2 = (ahey) abxvVar2.a.io();
            aheyVar2.getClass();
            elr elrVar2 = (elr) abxvVar2.b.io();
            elrVar2.getClass();
            mbc mbcVar2 = (mbc) abxvVar2.d.io();
            mbcVar2.getClass();
            ascsVar.getClass();
            aqrvVarM.getClass();
            strS.getClass();
            aczlVar = new aczl(aheyVar2, elrVar2, mbcVar2, ascsVar, aqrvVarM, strS);
        }
        return e(tnsVar, aczlVar);
    }

    @Override // defpackage.tgg
    public final void d() {
        this.c.d();
    }

    public final ListenableFuture e(tns tnsVar, aczl aczlVar) {
        return ahno.an(this.c.c(tnsVar), toe.class, new qmw(this, aczlVar, this.b.l(56, 45416561L, false) ? aguu.al(new zaz(tnsVar, 14)) : aguu.al(new zaz(tnsVar, 13)), tnsVar, 4), this.a);
    }
}
