package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahbx extends ahbz {
    public ahbx(ListenableFuture listenableFuture, Class cls, ahcy ahcyVar) {
        super(listenableFuture, cls, ahcyVar);
    }

    @Override // defpackage.ahbz
    public final /* bridge */ /* synthetic */ Object c(Object obj, Throwable th) {
        ListenableFuture listenableFutureA = ((ahcy) obj).a(th);
        listenableFutureA.getClass();
        return listenableFutureA;
    }

    @Override // defpackage.ahbz
    public final /* synthetic */ void d(Object obj) {
        setFuture((ListenableFuture) obj);
    }
}
