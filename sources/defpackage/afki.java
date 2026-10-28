package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class afki {
    protected abstract void a(ListenableFuture listenableFuture, Object obj, afkj afkjVar);

    public abstract void b(afkj afkjVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void c(ahub ahubVar, afkj afkjVar) {
        a(ahubVar.a, null, afkjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void d(ahub ahubVar, ahub ahubVar2, afkj afkjVar) {
        a(ahubVar.a, ahubVar2.a, afkjVar);
    }

    public abstract void e(ahub ahubVar, ahub ahubVar2, afkj afkjVar);
}
