package defpackage;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlg extends EnvironmentDataSource {
    private final avlr e;
    private final AtomicLong b = new AtomicLong(1);
    private final Object c = new Object();
    private final LongSparseArray d = new LongSparseArray();
    public volatile byte[] a = nty.a;

    public mlg(avlr avlrVar) {
        this.e = avlrVar.x(new jqi(this, 5)).ap().d();
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final byte[] getEnvironmentData() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final long subscribeToEnvironmentData(EnvironmentDataObserver environmentDataObserver) {
        if (environmentDataObserver == null) {
            return 0L;
        }
        AtomicLong atomicLong = this.b;
        Object obj = this.c;
        long andIncrement = atomicLong.getAndIncrement();
        synchronized (obj) {
            this.d.put(andIncrement, this.e.af(new jqi(environmentDataObserver, 6)));
        }
        return andIncrement;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final void unsubscribeFromEnvironmentData(long j) {
        synchronized (this.c) {
            LongSparseArray longSparseArray = this.d;
            avmn avmnVar = (avmn) longSparseArray.get(j);
            if (avmnVar != null) {
                avmnVar.dispose();
            }
            longSparseArray.remove(j);
        }
    }
}
