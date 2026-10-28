package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class b1 extends d1 implements p0 {
    @Override // j$.util.stream.t0
    public final /* synthetic */ void forEach(Consumer consumer) {
        i2.o(this, consumer);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.r(this, j, j2);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        i2.l(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.s0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.t0
    public final j$.util.j0 spliterator() {
        return new r1(this);
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return new r1(this);
    }
}
