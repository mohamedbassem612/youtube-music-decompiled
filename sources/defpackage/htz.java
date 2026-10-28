package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class htz implements htr, awqy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ hub a;

    public htz(hub hubVar, int i) {
        this.$cid = i;
        this.a = hubVar;
    }

    @Override // defpackage.htr
    public final Object a(hcg hcgVar, hte hteVar, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            Object objF = this.a.f(hcgVar, hteVar, awoqVar);
            return objF != awox.a ? awmy.a : objF;
        }
        hub hubVar = this.a;
        if (i != 1) {
            Object objH = hubVar.h(hcgVar, hteVar, awoqVar);
            return objH != awox.a ? awmy.a : objH;
        }
        Object objF2 = hubVar.f(hcgVar, hteVar, awoqVar);
        return objF2 != awox.a ? awmy.a : objF2;
    }

    public final boolean equals(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if ((obj instanceof htr) && (obj instanceof awqy)) {
                return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i != 1) {
            if ((obj instanceof htr) && (obj instanceof awqy)) {
                return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
            }
            return false;
        }
        if ((obj instanceof htr) && (obj instanceof awqy)) {
            return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.awqy
    public final awmf getFunctionDelegate() {
        int i = this.$cid;
        if (i == 0) {
            return new awrb(3, this.a, hub.class, "notifyContainerCompletedOrError", "notifyContainerCompletedOrError(Lcom/google/android/apps/youtube/music/entities/model/MusicContainerTracksModel;Lcom/google/android/apps/youtube/music/offline/models/MusicContainerDownloadStatusModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
        hub hubVar = this.a;
        return i != 1 ? new awrb(3, hubVar, hub.class, "notifyContainerProgress", "notifyContainerProgress(Lcom/google/android/apps/youtube/music/entities/model/MusicContainerTracksModel;Lcom/google/android/apps/youtube/music/offline/models/MusicContainerDownloadStatusModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new awrb(3, hubVar, hub.class, "notifyContainerCompletedOrError", "notifyContainerCompletedOrError(Lcom/google/android/apps/youtube/music/entities/model/MusicContainerTracksModel;Lcom/google/android/apps/youtube/music/offline/models/MusicContainerDownloadStatusModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        if (i == 0) {
            return getFunctionDelegate().hashCode();
        }
        awmf functionDelegate = getFunctionDelegate();
        return i != 1 ? functionDelegate.hashCode() : functionDelegate.hashCode();
    }
}
