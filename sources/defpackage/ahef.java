package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ahef extends ahee {
    public final ListenableFuture b;

    protected ahef(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.b = listenableFuture;
    }

    @Override // defpackage.ahee, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.ahee
    protected final ListenableFuture ia() {
        return this.b;
    }

    @Override // defpackage.ahee
    protected final /* synthetic */ Future ib() {
        return this.b;
    }
}
