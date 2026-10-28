package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ich extends icc {
    final /* synthetic */ icj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ich(icj icjVar, Optional optional) {
        super(icjVar, optional);
        this.a = icjVar;
    }

    @Override // defpackage.icc, defpackage.aheh
    public final void a(Throwable th) {
        agrf agrfVar = icj.a;
        ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$ShuffleUpdateListener", "onFailure", (char) 1853, "MusicPlaybackQueue.java")).t("QueueUpdate error");
        super.a(th);
        ((agrc) ((agrc) agrfVar.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$ShuffleUpdateListener", "onFailure", 1855, "MusicPlaybackQueue.java")).t("Server shuffle failed, falling back to client shuffle.");
        icj icjVar = this.a;
        icjVar.y(true);
        icjVar.m.d("SHUFFLE", true);
        icjVar.B.g(abkh.h);
    }

    @Override // defpackage.icc
    public final void c(wgi wgiVar, aouj aoujVar, aae aaeVar) {
        icj icjVar = this.a;
        icjVar.x(wgiVar);
        icjVar.m.d("SHUFFLE", false);
        icjVar.B.k();
    }
}
