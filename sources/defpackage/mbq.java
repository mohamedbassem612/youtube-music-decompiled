package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mbq extends ahef implements ahew {
    private final long a;

    public mbq(ListenableFuture listenableFuture, long j) {
        super(listenableFuture);
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (delayed2 == this) {
            return 0;
        }
        return Long.compare(getDelay(TimeUnit.NANOSECONDS), delayed2.getDelay(TimeUnit.NANOSECONDS));
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
