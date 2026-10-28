package defpackage;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.interfaces.ClientDataObservable;
import com.google.android.libraries.elements.interfaces.ClientDataObserver;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nxt extends ClientDataObservable {
    private final avlr e;
    private final AtomicLong b = new AtomicLong(1);
    private final Object c = new Object();
    public volatile byte[] a = nty.a;
    private final LongSparseArray d = new LongSparseArray();

    public nxt(avlr avlrVar) {
        this.e = avlrVar.K(new rtq(1)).x(new jgq(this, 19)).ap().d();
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientDataObservable
    public final byte[] getClientData() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientDataObservable
    public final long subscribe(ClientDataObserver clientDataObserver) {
        if (clientDataObserver == null) {
            return -1L;
        }
        AtomicLong atomicLong = this.b;
        Object obj = this.c;
        long andIncrement = atomicLong.getAndIncrement();
        synchronized (obj) {
            this.d.put(andIncrement, this.e.af(new jgq(clientDataObserver, 20)));
        }
        return andIncrement;
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientDataObservable
    public final void unsubscribe(long j) {
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
