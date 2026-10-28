package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class wis implements agfr {
    public final awmd a;
    public wiu b;
    private final ListenableFuture c;

    /* JADX WARN: Type inference failed for: r4v3, types: [awmd, java.lang.Object] */
    public wis(awmd awmdVar) {
        this.a = awmdVar;
        ListenableFuture listenableFutureC = ((qrx) ((hed) awmdVar.io()).c.io()).c();
        wvk wvkVar = new wvk(3);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, wvkVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        this.c = ahcrVar;
    }

    @Override // defpackage.agfr
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized wiu io() {
        wiu wiuVar;
        wiuVar = this.b;
        if (wiuVar == null) {
            wiu wiuVar2 = null;
            try {
                wiuVar2 = new wiu((aoqd) this.c.get());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                ((agrc) ((agrc) ((agrc) wiu.a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/model/media/PlayerConfigModel$PlayerConfigSupplier", "getPlayerConfigModelFromProtoDataStore", (char) 2204, "PlayerConfigModel.java")).t("Failed to read PlayerConfig from ProtoDataStore.");
            }
            wiuVar = wiuVar2 == null ? wiu.c : wiuVar2;
            this.b = wiuVar;
        }
        return wiuVar;
    }
}
