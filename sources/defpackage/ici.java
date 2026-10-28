package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ici extends icc {
    final /* synthetic */ icj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(icj icjVar, Optional optional) {
        super(icjVar, optional);
        this.a = icjVar;
    }

    @Override // defpackage.icc, defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) icj.a.b()).j(th)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$UnshuffleUpdateListener", "onFailure", (char) 1798, "MusicPlaybackQueue.java")).t("QueueUpdate error");
        super.a(th);
        this.a.m.d("UNSHUFFLE", true);
    }

    @Override // defpackage.icc
    public final void c(wgi wgiVar, aouj aoujVar, aae aaeVar) {
        icj icjVar = this.a;
        icjVar.x(wgiVar);
        icjVar.m.d("UNSHUFFLE", false);
    }
}
