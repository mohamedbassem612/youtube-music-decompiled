package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mbp extends ahef implements ahew {
    public volatile ahew a;

    public mbp(ListenableFuture listenableFuture, ahew ahewVar) {
        super(listenableFuture);
        this.a = ahewVar;
        listenableFuture.addListener(new mbo(this, 0), MoreExecutors.directExecutor());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
