package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class icn implements zza {
    public final abnl a;
    final /* synthetic */ ico b;
    public final qcb c;

    public icn(ico icoVar, abnl abnlVar, qcb qcbVar) {
        this.b = icoVar;
        this.a = abnlVar;
        this.c = qcbVar;
    }

    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        aouj aoujVarAb;
        wgi wgiVar = (wgi) obj;
        if (wgiVar == null || (aoujVarAb = fhz.ab(wgiVar.a)) == null || aoujVarAb.g.isEmpty()) {
            ((agrc) ((agrc) ico.a.c().i(agso.a, "PlaybackQueueOpsManager")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager$SeamlessRadioTransitionCallback", "onResponse", 839, "MusicPlaybackQueueOperationsManager.java")).w("Radio response is null (%s) or empty.", Boolean.valueOf(wgiVar == null));
            if (this.b.k.l(49, 45694858L, false)) {
                this.c.l();
                return;
            }
            return;
        }
        ico icoVar = this.b;
        if (icoVar.g(this.a)) {
            this.c.m();
            icoVar.c.z(wgiVar, false, null);
        } else if (icoVar.k.l(49, 45694858L, false)) {
            agrx agrxVar = agso.a;
            this.c.m();
            icoVar.c.z(wgiVar, true, null);
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        ((agrc) ((agrc) ((agrc) ico.a.c().i(agso.a, "PlaybackQueueOpsManager")).j(toeVar)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager$SeamlessRadioTransitionCallback", "onErrorResponse", (char) 829, "MusicPlaybackQueueOperationsManager.java")).t("Failed to transition to radio.");
        if (this.b.k.l(49, 45694858L, false)) {
            this.c.l();
        }
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
