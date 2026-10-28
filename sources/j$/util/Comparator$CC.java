package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Comparator$CC {
    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        function.getClass();
        comparator.getClass();
        return new c(comparator, function, (byte) 1);
    }

    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        toIntFunction.getClass();
        return new b((byte) 0, toIntFunction);
    }

    public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
        toLongFunction.getClass();
        return new b((byte) 3, toLongFunction);
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return d.INSTANCE;
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }

    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        function.getClass();
        return new b((byte) 2, function);
    }
}
