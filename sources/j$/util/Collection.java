package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface Collection<E> extends j$.lang.a {

    /* JADX INFO: renamed from: j$.util.Collection$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        public static Stream $default$parallelStream(java.util.Collection collection) {
            return StreamSupport.stream(EL.c(collection), true);
        }

        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            predicate.getClass();
            Iterator<E> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public static Spliterator $default$spliterator(java.util.Collection collection) {
            return Spliterators.spliterator(collection, 0);
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return StreamSupport.stream(EL.c(collection), false);
        }
    }

    /* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class EL {
        public static void a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            consumer.getClass();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }

        public static /* synthetic */ Stream b(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).parallelStream() : CC.$default$parallelStream(collection);
        }

        public static Spliterator c(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (collection instanceof java.util.SortedSet) {
                java.util.SortedSet sortedSet = (java.util.SortedSet) collection;
                return new z(sortedSet, sortedSet);
            }
            if (collection instanceof java.util.Set) {
                return Spliterators.spliterator((java.util.Set) collection, 1);
            }
            return collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : CC.$default$spliterator(collection);
        }

        public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
            return collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : CC.$default$removeIf(collection, predicate);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }
    }

    @Override // j$.util.Collection, j$.lang.a
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);
}
