package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public interface Builder<T> extends Consumer<T> {
        Builder<T> add(T t);

        Stream<T> build();
    }

    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream<T> distinct();

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findAny();

    Optional<T> findFirst();

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer<? super T> consumer);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    Optional<T> max(Comparator<? super T> comparator);

    Optional<T> min(Comparator<? super T> comparator);

    boolean noneMatch(Predicate<? super T> predicate);

    Stream<T> sorted();

    Stream<T> sorted(Comparator<? super T> comparator);

    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> intFunction);

    List<T> toList();

    /* JADX INFO: renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        public static <T> Builder<T> builder() {
            return new z4();
        }

        public static <T> Stream<T> concat(Stream<? extends T> stream, Stream<? extends T> stream2) {
            stream.getClass();
            stream2.getClass();
            return StreamSupport.stream(new x4(stream.spliterator(), stream2.spliterator()), stream.isParallel() || stream2.isParallel()).onClose(new v4(stream, stream2, (byte) 1));
        }

        public static <T> Stream<T> empty() {
            return StreamSupport.stream(Spliterators.a, false);
        }

        public static <T> Stream<T> of(T t) {
            return StreamSupport.stream(new z4(t), false);
        }

        public static <T> Stream<T> ofNullable(T t) {
            return t == null ? empty() : StreamSupport.stream(new z4(t), false);
        }

        public static <T> Stream<T> of(T... tArr) {
            return DesugarArrays.stream(tArr);
        }
    }
}
