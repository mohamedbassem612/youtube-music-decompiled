package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtj extends wnn {
    public static final agrf c = agrf.h("com/google/android/libraries/youtube/innertube/services/resolveurl/ResolveUrlService");
    public final zwb d;
    public final wti e;
    public final tbt f;
    public final aunn g;
    public final Executor h;
    public final vxz i;

    public wtj(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, tbt tbtVar, hed hedVar, vxz vxzVar, aunn aunnVar, Executor executor) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.e = new wti(wlpVar, tggVar, hedVar);
        this.f = tbtVar;
        this.i = vxzVar;
        this.g = aunnVar;
        this.h = executor;
    }
}
