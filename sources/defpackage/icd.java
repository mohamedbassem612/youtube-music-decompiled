package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class icd extends icc {
    final /* synthetic */ icj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icd(icj icjVar, Optional optional) {
        super(icjVar, optional);
        this.a = icjVar;
    }

    @Override // defpackage.icc, defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) icj.a.b()).j(th)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$PlaylistRefreshListener", "onFailure", (char) 1822, "MusicPlaybackQueue.java")).t("Playlist refresh failed.");
        super.a(th);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [hyz, java.lang.Object] */
    @Override // defpackage.icc
    public final void c(wgi wgiVar, aouj aoujVar, aae aaeVar) {
        Optional optional = this.b;
        icj icjVar = this.a;
        Optional optionalG = icjVar.g();
        String strT = optional.isPresent() ? optional.get().t() : "";
        String strT2 = optionalG.isPresent() ? optionalG.get().t() : "";
        String strS = optional.isPresent() ? optional.get().s() : "";
        String strS2 = optionalG.isPresent() ? optionalG.get().s() : "";
        if (!Objects.equals(strT, strT2) || !Objects.equals(strS, strS2)) {
            ((agrc) ((agrc) icj.a.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$PlaylistRefreshListener", "onNext", 1833, "MusicPlaybackQueue.java")).t("Currently playing item changed during refresh, discarding response.");
            return;
        }
        icjVar.u(wgiVar, null);
        if (icjVar.A.l()) {
            ((awku) icjVar.i.io()).kk(wgiVar.a);
        }
    }
}
