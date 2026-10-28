package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrb extends wnn implements wnf {
    public final zwb c;
    public final wlp d;
    public final wnh e;
    public final wnh f;
    public final wnh g;
    public final Set h;
    private final wqz i;
    private final wnh j;

    public wrb(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, Set set) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = wlpVar;
        this.h = set;
        this.i = new wqz(wlpVar, tggVar);
        int i = 17;
        int i2 = 19;
        this.e = f(alxx.a, wlpVar, new wpa(i), new wph(i2));
        int i3 = 20;
        this.j = f(alrq.a, wlpVar, new wqy(4), new wph(i3));
        int i4 = 18;
        this.f = f(alrt.a, wlpVar, new wpa(i4), new wph(12));
        f(also.a, wlpVar, new wpa(i2), new wph(13));
        f(alro.a, wlpVar, new wpa(i3), new wph(14));
        f(alrx.a, wlpVar, new wqy(0), new wph(16));
        this.g = f(alrz.a, wlpVar, new wqy(2), new wph(i));
        f(alrv.a, wlpVar, new wqy(3), new wph(i4));
    }

    @Override // defpackage.wnf
    public final /* bridge */ /* synthetic */ wlu a(acjx acjxVar) {
        wqu wquVar = new wqu(this.b, this.c.e(), this.h, false);
        wquVar.q(acjxVar);
        return wquVar;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        this.i.k((wqu) wluVar, wneVar, zzaVar, null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final wqq g(ajwo ajwoVar) {
        wqq wqqVar = new wqq(this.b, this.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amoq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        wqqVar.a = ((amoq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if ((ajwoVar.b & 1) != 0) {
            wqqVar.n(ajwoVar.c);
        } else {
            wqqVar.m();
        }
        return wqqVar;
    }

    public final void h(wqq wqqVar, zza zzaVar) {
        this.j.d(wqqVar, zzaVar);
    }
}
