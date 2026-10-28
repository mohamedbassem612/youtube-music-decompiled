package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class StreamSupport {
    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        return new b3(spliterator, z3.l(spliterator), z);
    }

    public static <T> Stream<T> stream(Supplier<? extends Spliterator<T>> supplier, int i, boolean z) {
        supplier.getClass();
        return new b3(supplier, i & z3.f, z);
    }
}
