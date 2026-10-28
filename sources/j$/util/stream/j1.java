package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class j1 extends l1 implements r0 {
    @Override // j$.util.stream.l1, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.s0
    public final Object b() {
        return i2.f;
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void forEach(Consumer consumer) {
        i2.p(this, consumer);
    }

    @Override // j$.util.stream.l1, j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.s(this, j, j2);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        i2.m(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.t0
    public final j$.util.j0 spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.l1, j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }
}
