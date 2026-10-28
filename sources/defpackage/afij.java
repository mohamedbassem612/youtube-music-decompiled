package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afij extends ahee {
    final /* synthetic */ abhh a;
    private final ListenableFuture b;

    public afij(abhh abhhVar, ListenableFuture listenableFuture) {
        this.a = abhhVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.ahee, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.ahee, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        if (isDone()) {
            this.b.addListener(runnable, executor);
        }
        this.b.addListener(runnable, new afik(this.a, executor, 1));
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
