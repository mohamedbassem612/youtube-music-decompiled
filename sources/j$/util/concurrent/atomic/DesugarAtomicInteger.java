package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class DesugarAtomicInteger {
    public static int accumulateAndGet(AtomicInteger atomicInteger, int i, IntBinaryOperator intBinaryOperator) {
        int i2;
        int iApplyAsInt;
        do {
            i2 = atomicInteger.get();
            iApplyAsInt = intBinaryOperator.applyAsInt(i2, i);
        } while (!atomicInteger.compareAndSet(i2, iApplyAsInt));
        return iApplyAsInt;
    }

    public static int updateAndGet(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i;
        int iApplyAsInt;
        do {
            i = atomicInteger.get();
            iApplyAsInt = intUnaryOperator.applyAsInt(i);
        } while (!atomicInteger.compareAndSet(i, iApplyAsInt));
        return iApplyAsInt;
    }
}
