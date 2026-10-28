package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.Comparator$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Comparator$EL {
    public static Comparator reversed(Comparator comparator) {
        return comparator instanceof d ? Comparator$CC.reverseOrder() : Collections.reverseOrder(comparator);
    }

    public static Comparator thenComparing(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof d) {
            comparator2.getClass();
            return new c((d) comparator, comparator2, (byte) 0);
        }
        comparator2.getClass();
        return new c(comparator, comparator2, (byte) 0);
    }

    public static Comparator thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        return comparator instanceof d ? thenComparing((d) comparator, Comparator$CC.comparingInt(toIntFunction)) : thenComparing(comparator, Comparator$CC.comparingInt(toIntFunction));
    }

    public static Comparator thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return comparator instanceof d ? thenComparing((d) comparator, Comparator$CC.comparingLong(toLongFunction)) : thenComparing(comparator, Comparator$CC.comparingLong(toLongFunction));
    }

    public static Comparator thenComparing(Comparator comparator, Function function) {
        if (comparator instanceof d) {
            return thenComparing((d) comparator, Comparator$CC.comparing(function));
        }
        return thenComparing(comparator, Comparator$CC.comparing(function));
    }
}
