package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class icg extends icc {
    final /* synthetic */ icj a;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icg(icj icjVar, int i) {
        super(icjVar, Optional.empty());
        this.a = icjVar;
        this.d = i;
    }

    @Override // defpackage.icc, defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) icj.a.b()).j(th)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$QueueUpdateListener", "onFailure", (char) 1889, "MusicPlaybackQueue.java")).t("QueueUpdate error");
        super.a(th);
        if (this.d == 3) {
            icj icjVar = this.a;
            icjVar.q.kk(new idf(ide.d));
        }
    }

    @Override // defpackage.icc
    public final void c(wgi wgiVar, aouj aoujVar, aae aaeVar) {
        icj icjVar = this.a;
        icjVar.D.k(wgiVar);
        int i = this.d;
        if (i != 3) {
            icjVar.p = i == 2;
            icjVar.L(aoujVar, aaeVar);
        } else {
            icjVar.u(wgiVar, null);
            if (icjVar.A.l()) {
                ((awku) icjVar.i.io()).kk(wgiVar.a);
            }
            icjVar.q.kk(new idf(ide.c));
        }
    }
}
