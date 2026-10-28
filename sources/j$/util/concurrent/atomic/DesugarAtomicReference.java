package j$.util.concurrent.atomic;

import j$.desugar.sun.nio.fs.g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class DesugarAtomicReference {
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        do {
            v = atomicReference.get();
        } while (!g.E(atomicReference, v, unaryOperator.apply(v)));
        return v;
    }

    public static <V> V updateAndGet(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        V v2;
        do {
            v = atomicReference.get();
            v2 = (V) unaryOperator.apply(v);
        } while (!g.E(atomicReference, v, v2));
        return v2;
    }
}
