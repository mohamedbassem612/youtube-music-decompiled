package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aadl implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aadl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        if (this.$cid != 0) {
            a((Throwable) obj);
        } else {
            a((Throwable) obj);
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        if (this.$cid != 0) {
            ((agrc) ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$ParallelQueueRestorationCallable", "onFailure", (char) 1009, "QueueRestorationController.java")).t("Parallel server queue restoration failed.");
            ((iea) this.a).a(null, null, th instanceof CancellationException, false);
            return;
        }
        ((agrc) ((agrc) ((agrc) aado.a.b()).j(th)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineStore", "initialize", (char) 323, "DefaultOfflineStore.java")).t("[Offline] Error initializing offline store.");
        zvj zvjVarA = zvk.a();
        zvjVarA.j = 30;
        zvjVarA.d("Error initializing offline store.");
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.f(th);
        ((zvl) ((aado) this.a).v.io()).a(zvjVarA.a());
    }
}
