package j$.util.stream;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;
    public static final Set c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        DesugarCollections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        DesugarCollections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = DesugarCollections.unmodifiableSet(EnumSet.of(characteristics3));
        b = DesugarCollections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        c = Collections.EMPTY_SET;
        DesugarCollections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set setCharacteristics = collector.characteristics();
        Collector.Characteristics characteristics = Collector.Characteristics.IDENTITY_FINISH;
        if (setCharacteristics.contains(characteristics)) {
            if (setCharacteristics.size() == 1) {
                setCharacteristics = c;
            } else {
                EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setCharacteristics);
                enumSetCopyOf.remove(characteristics);
                setCharacteristics = DesugarCollections.unmodifiableSet(enumSetCopyOf);
            }
        }
        return new i(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo840andThen(function), setCharacteristics);
    }

    public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> function, Supplier<M> supplier, Collector<? super T, A, D> collector) {
        byte b2 = 1;
        f fVar = new f(function, collector.supplier(), collector.accumulator(), b2);
        g gVar = new g(collector.combiner(), b2);
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? new i(supplier, fVar, gVar, a) : new i(supplier, fVar, gVar, new e(collector.finisher()), c);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new i(new f(charSequence, charSequence2, charSequence3, (byte) 2), new j$.desugar.sun.nio.fs.o((byte) 24), new j$.desugar.sun.nio.fs.o((byte) 25), new j$.desugar.sun.nio.fs.o((byte) 26), c);
    }

    public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> function, Collector<? super U, A, R> collector) {
        return new i(collector.supplier(), new j$.nio.file.y((Object) collector.accumulator(), (Object) function, (byte) 6), collector.combiner(), collector.finisher(), collector.characteristics());
    }

    public static <T, D, A> Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate, Collector<? super T, A, D> collector) {
        j$.nio.file.y yVar = new j$.nio.file.y((Object) collector.accumulator(), (Object) predicate, (byte) 7);
        g gVar = new g(collector.combiner(), (byte) 0);
        h hVar = new h(collector);
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? new i(hVar, yVar, gVar, a) : new i(hVar, yVar, gVar, new h(collector), c);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new i(supplier, new j$.desugar.sun.nio.fs.o((byte) 14), new j$.desugar.sun.nio.fs.o((byte) 15), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new i(new j$.desugar.sun.nio.fs.o((byte) 16), new j$.desugar.sun.nio.fs.o((byte) 17), new j$.desugar.sun.nio.fs.o((byte) 22), a);
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new i(supplier, new f(function, function2, binaryOperator, (byte) 0), new g(binaryOperator, (byte) 1), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new i(new j$.desugar.sun.nio.fs.o((byte) 20), new j$.desugar.sun.nio.fs.o((byte) 21), new j$.desugar.sun.nio.fs.o((byte) 27), b);
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator) {
        return toMap(function, function2, binaryOperator, new j$.desugar.sun.nio.fs.o((byte) 28));
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> function) {
        return groupingBy(function, new j$.desugar.sun.nio.fs.o((byte) 28), toList());
    }
}
