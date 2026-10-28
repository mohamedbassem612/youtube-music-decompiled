package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wsl extends wnn {
    public static final agrf c = agrf.h("com/google/android/libraries/youtube/innertube/services/playlistedit/PlaylistEditService");
    public final tbt d;
    public final wbz e;
    public final vxz f;
    public final vxz g;
    private final zwb h;
    private final wsk i;
    private final Optional j;

    public wsl(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, tbt tbtVar, wbz wbzVar, Optional optional, vxz vxzVar, vxz vxzVar2) {
        super(abxvVar, tggVar);
        this.h = zwbVar;
        this.d = tbtVar;
        this.e = wbzVar;
        this.j = optional;
        this.i = new wsk(this, wlpVar);
        this.f = vxzVar;
        this.g = vxzVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aunn, java.lang.Object] */
    public final wsi a() {
        Optional optional = this.j;
        zwa zwaVarE = this.h.e();
        optional.isPresent();
        xpl xplVar = (xpl) optional.get();
        ?? r3 = xplVar.b;
        return new wsi(this.b, zwaVarE, (((vxz) r3.io()).l(79, 45418013L, false) || ((vxz) r3.io()).l(81, 45418016L, false)) ? Optional.of(((xmw) xplVar.a.io()).l) : Optional.empty());
    }

    public final ListenableFuture b(wsi wsiVar, Executor executor) {
        return this.i.f(wsiVar, executor);
    }

    @Deprecated
    public final void c(wlu wluVar, zza zzaVar) {
        this.i.i(wluVar, zzaVar);
    }
}
