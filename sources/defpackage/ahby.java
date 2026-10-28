package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahby extends ahbz {
    public ahby(ListenableFuture listenableFuture, Class cls, agek agekVar) {
        super(listenableFuture, cls, agekVar);
    }

    @Override // defpackage.ahbz
    public final /* synthetic */ Object c(Object obj, Throwable th) {
        return ((agek) obj).apply(th);
    }

    @Override // defpackage.ahbz
    public final void d(Object obj) {
        set(obj);
    }
}
