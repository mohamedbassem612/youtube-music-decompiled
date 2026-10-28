package j$.util;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Comparator {
    public static final d INSTANCE;
    public static final /* synthetic */ d[] a;

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        a = new d[]{dVar};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Comparator$CC.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        comparator.getClass();
        return new c(this, comparator, (byte) 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return Comparator$EL.thenComparing(this, new b((byte) 1, toDoubleFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$EL.thenComparing(this, Comparator$CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator$EL.thenComparing(this, Comparator$CC.comparingLong(toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator$EL.thenComparing(this, Comparator$CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        return Comparator$EL.thenComparing(this, Comparator$CC.comparing(function));
    }
}
