package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class DesugarAtomicLong {
    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long jApplyAsLong;
        do {
            j = atomicLong.get();
            jApplyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, jApplyAsLong));
        return jApplyAsLong;
    }
}
