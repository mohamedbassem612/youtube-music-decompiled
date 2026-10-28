package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface PrimitiveIterator$OfInt extends Iterator {
    /* synthetic */ void forEachRemaining(Object obj);

    @Override // java.util.Iterator
    void forEachRemaining(Consumer<? super Integer> consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();

    /* JADX INFO: renamed from: j$.util.PrimitiveIterator$OfInt$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        public static void $default$forEachRemaining(PrimitiveIterator$OfInt primitiveIterator$OfInt, Consumer consumer) {
            if (consumer instanceof IntConsumer) {
                primitiveIterator$OfInt.forEachRemaining((IntConsumer) consumer);
                return;
            }
            consumer.getClass();
            if (a1.a) {
                a1.a(primitiveIterator$OfInt.getClass(), "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
                throw null;
            }
            primitiveIterator$OfInt.forEachRemaining((IntConsumer) new x(consumer, (byte) 0));
        }

        public static Integer $default$next(PrimitiveIterator$OfInt primitiveIterator$OfInt) {
            if (!a1.a) {
                return Integer.valueOf(primitiveIterator$OfInt.nextInt());
            }
            a1.a(primitiveIterator$OfInt.getClass(), "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }

        public static void $default$forEachRemaining(PrimitiveIterator$OfInt primitiveIterator$OfInt, IntConsumer intConsumer) {
            intConsumer.getClass();
            while (primitiveIterator$OfInt.hasNext()) {
                intConsumer.accept(primitiveIterator$OfInt.nextInt());
            }
        }
    }
}
