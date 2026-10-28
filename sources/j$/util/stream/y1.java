package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y1 extends u3 implements r0, k0 {
    @Override // j$.util.stream.f3
    public final /* synthetic */ void B(Long l) {
        i2.g(this, l);
    }

    @Override // j$.util.stream.u3
    /* JADX INFO: renamed from: C */
    public final Spliterator.OfLong spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final void d(int i, Object obj) {
        super.d(i, (long[]) obj);
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final void e(Object obj) {
        super.e((LongConsumer) obj);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.s(this, j, j2);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        i2.m(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return i2.j(this, intFunction);
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        clear();
        x(j);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.u3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.j0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.l0
    public final t0 build() {
        return this;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        B((Long) obj);
    }

    @Override // j$.util.stream.u3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.k0, j$.util.stream.l0
    public final r0 build() {
        return this;
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
