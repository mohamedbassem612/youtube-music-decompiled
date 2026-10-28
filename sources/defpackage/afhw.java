package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhw {
    public static final agrf a = agrf.h("com/google/apps/tiktok/account/data/AccountInvalidator");
    public final afid b;

    public afhw(afid afidVar) {
        this.b = afidVar;
    }

    public final ListenableFuture a() {
        afid afidVar = this.b;
        ListenableFuture listenableFutureB = afidVar.b();
        thc thcVar = new thc(this, 17);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), thcVar, 1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahbz.d;
        ahbx ahbxVar = new ahbx(listenableFutureB, Throwable.class, ahdbVar);
        listenableFutureB.addListener(ahbxVar, MoreExecutors.c(executorDirectExecutor, ahbxVar));
        afidVar.e(ahbxVar);
        return ahbxVar;
    }
}
