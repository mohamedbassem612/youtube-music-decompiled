package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahcr extends ahcs {
    public ahcr(ListenableFuture listenableFuture, agek agekVar) {
        super(listenableFuture, agekVar);
    }

    @Override // defpackage.ahcs
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        return ((agek) obj).apply(obj2);
    }

    @Override // defpackage.ahcs
    public final void d(Object obj) {
        set(obj);
    }
}
