package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahcq extends ahcs {
    public ahcq(ListenableFuture listenableFuture, ahcy ahcyVar) {
        super(listenableFuture, ahcyVar);
    }

    @Override // defpackage.ahcs
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2) {
        ListenableFuture listenableFutureA = ((ahcy) obj).a(obj2);
        listenableFutureA.getClass();
        return listenableFutureA;
    }

    @Override // defpackage.ahcs
    public final /* synthetic */ void d(Object obj) {
        setFuture((ListenableFuture) obj);
    }
}
