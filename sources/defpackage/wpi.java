package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpi extends wnn implements wnf {
    public final zwb c;
    public final wnh d;
    public final wnh e;
    public final wnh f;
    public final wnh g;
    public final wnh h;
    private final wlp i;

    public wpi(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        wlpVar.getClass();
        this.i = wlpVar;
        int i = 3;
        f(alnp.a, wlpVar, new wpa(i), new wph(1));
        this.e = f(alnj.a, wlpVar, new wpa(6), new wph(0));
        this.d = f(alnu.a, wlpVar, new wpa(7), new wph(2));
        this.f = f(alnr.a, wlpVar, new wpa(8), new wph(i));
        this.g = f(aloc.a, wlpVar, new wpa(4), new hep(19));
        this.h = f(alnz.a, wlpVar, new wpa(5), new hep(20));
    }

    @Override // defpackage.wnf
    public final /* bridge */ /* synthetic */ wlu a(acjx acjxVar) {
        wpm wpmVar = new wpm(this.b, this.c.e());
        wpmVar.q(acjxVar);
        return wpmVar;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        gml gmlVar = new gml(wneVar, zzaVar, 8);
        wpm wpmVar = (wpm) wluVar;
        e().b(this.i.a(wpmVar, alnp.a, gmlVar, new wpa(3), new wph(1)));
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }
}
