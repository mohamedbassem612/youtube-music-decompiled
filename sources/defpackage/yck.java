package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yck {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorage");
    private final tpq b;

    public yck(tpq tpqVar) {
        this.b = tpqVar;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureA = this.b.a();
        wvk wvkVar = new wvk(7);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), wvkVar);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureA, afwiVar);
        listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public final void b() {
        taf.j(this.b.b(new xwx(6)), new xwk(7));
    }

    public final void e(xze xzeVar) {
        taf.j(this.b.b(new xwd(xzeVar, 4)), new xwk(6));
    }
}
