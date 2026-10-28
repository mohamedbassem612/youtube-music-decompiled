package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wsg extends wnn implements wnf {
    public final zwb c;
    public final Executor d;
    public final wnh e;
    public final wnh f;
    public final wnh g;
    private final wnh h;
    private final wsf i;

    public wsg(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, Executor executor) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = executor;
        this.h = f(alwi.a, wlpVar, new wqy(16), new wrj(11));
        this.e = f(alwk.a, wlpVar, new wqy(17), new wrj(12));
        this.f = f(alwm.a, wlpVar, new wqy(18), new wrj(13));
        this.g = f(alwp.a, wlpVar, new wqy(19), new wrj(14));
        f(alqy.a, wlpVar, new wqy(20), new wrj(15));
        this.i = new wsf(wlpVar, tggVar);
    }

    @Override // defpackage.wnf
    public final /* bridge */ /* synthetic */ wlu a(acjx acjxVar) {
        wse wseVar = new wse(this.b, this.c.e());
        wseVar.q(acjxVar);
        wseVar.m();
        return wseVar;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        this.i.k((wse) wluVar, wneVar, zzaVar, null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final wsa g() {
        return new wsa(this.b, this.c.e());
    }

    public final wsc h() {
        return new wsc(this.b, this.c.e());
    }

    public final void i(wsa wsaVar, zza zzaVar) {
        this.h.d(wsaVar, zzaVar);
    }
}
