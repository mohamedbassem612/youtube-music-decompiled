package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcv extends AtomicInteger {
    public final mcz a;
    public final long b;
    public final AtomicReference c;
    private final ListenableFuture d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcv(long j, mcz mczVar, ListenableFuture listenableFuture) {
        super(((((int) (j >> 43)) & 63) - 21) << 2);
        mczVar.getClass();
        this.a = mczVar;
        this.d = listenableFuture;
        this.b = j & 8796093022207L;
        this.c = new AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, mcw.a(i, 0, false, true, 3)));
        if ((i & 2) != 0) {
            mcz mczVar = this.a;
            if (!mczVar.d) {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
            mczVar.e = mczVar.c;
        }
        for (mcu mcuVar = (mcu) this.c.getAndSet(mct.b); mcuVar != null; mcuVar = mcuVar.c) {
            LockSupport.unpark(mcuVar.b.a);
        }
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}
