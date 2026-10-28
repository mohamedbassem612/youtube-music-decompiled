package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface t0 {
    t0 a(int i);

    long count();

    void forEach(Consumer consumer);

    t0 g(long j, long j2, IntFunction intFunction);

    void h(Object[] objArr, int i);

    Object[] k(IntFunction intFunction);

    int l();

    Spliterator spliterator();
}
