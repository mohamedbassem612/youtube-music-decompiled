package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class hty implements htt, awqy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ hub a;

    public hty(hub hubVar, int i) {
        this.$cid = i;
        this.a = hubVar;
    }

    @Override // defpackage.htt
    public final Object a(hth hthVar, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            Object objI = this.a.i(hthVar, awoqVar);
            return objI != awox.a ? awmy.a : objI;
        }
        hub hubVar = this.a;
        if (i != 1) {
            Object objJ = hubVar.j(hthVar, awoqVar);
            return objJ != awox.a ? awmy.a : objJ;
        }
        Object objI2 = hubVar.i(hthVar, awoqVar);
        return objI2 != awox.a ? awmy.a : objI2;
    }

    public final boolean equals(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if ((obj instanceof htt) && (obj instanceof awqy)) {
                return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i != 1) {
            if ((obj instanceof htt) && (obj instanceof awqy)) {
                return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
            }
            return false;
        }
        if ((obj instanceof htt) && (obj instanceof awqy)) {
            return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.awqy
    public final awmf getFunctionDelegate() {
        int i = this.$cid;
        if (i == 0) {
            return new awrb(2, this.a, hub.class, "notifyTrackCompletedOrError", "notifyTrackCompletedOrError(Lcom/google/android/apps/youtube/music/offline/models/OfflinePlaybackDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
        hub hubVar = this.a;
        return i != 1 ? new awrb(2, hubVar, hub.class, "notifyTrackProgress", "notifyTrackProgress(Lcom/google/android/apps/youtube/music/offline/models/OfflinePlaybackDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new awrb(2, hubVar, hub.class, "notifyTrackCompletedOrError", "notifyTrackCompletedOrError(Lcom/google/android/apps/youtube/music/offline/models/OfflinePlaybackDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
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
