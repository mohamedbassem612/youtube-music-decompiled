package j$.util.stream;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface Collector<T, A, R> {

    /* JADX INFO: renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        public static <T, A, R> Collector<T, A, R> of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Characteristics... characteristicsArr) {
            supplier.getClass();
            biConsumer.getClass();
            binaryOperator.getClass();
            function.getClass();
            characteristicsArr.getClass();
            Set setUnmodifiableSet = Collectors.c;
            if (characteristicsArr.length > 0) {
                EnumSet enumSetNoneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(enumSetNoneOf, characteristicsArr);
                setUnmodifiableSet = DesugarCollections.unmodifiableSet(enumSetNoneOf);
            }
            return new i(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public static final class Characteristics {
        public static final Characteristics CONCURRENT;
        public static final Characteristics IDENTITY_FINISH;
        public static final Characteristics UNORDERED;
        public static final /* synthetic */ Characteristics[] a;

        static {
            Characteristics characteristics = new Characteristics("CONCURRENT", 0);
            CONCURRENT = characteristics;
            Characteristics characteristics2 = new Characteristics("UNORDERED", 1);
            UNORDERED = characteristics2;
            Characteristics characteristics3 = new Characteristics("IDENTITY_FINISH", 2);
            IDENTITY_FINISH = characteristics3;
            a = new Characteristics[]{characteristics, characteristics2, characteristics3};
        }

        public static Characteristics valueOf(String str) {
            return (Characteristics) Enum.valueOf(Characteristics.class, str);
        }

        public static Characteristics[] values() {
            return (Characteristics[]) a.clone();
        }
    }

    BiConsumer accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function finisher();

    Supplier supplier();
}
