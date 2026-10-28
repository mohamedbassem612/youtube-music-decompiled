package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aheo extends ahch {
    public static aheo p(ListenableFuture listenableFuture) {
        return listenableFuture instanceof aheo ? (aheo) listenableFuture : new ahed(listenableFuture);
    }

    public final aheo q(agek agekVar, Executor executor) {
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(this, agekVar);
        addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    public final aheo r(ahcy ahcyVar, Executor executor) {
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(this, ahcyVar);
        addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }
}
