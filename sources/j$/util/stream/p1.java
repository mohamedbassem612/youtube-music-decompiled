package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p1 extends s3 implements p0, j0 {
    @Override // j$.util.stream.s3
    /* JADX INFO: renamed from: C */
    public final Spliterator.OfInt spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final void d(int i, Object obj) {
        super.d(i, (int[]) obj);
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.r(this, j, j2);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        i2.l(this, (Integer[]) objArr, i);
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

    @Override // j$.util.stream.e3
    public final /* synthetic */ void r(Integer num) {
        i2.e(this, num);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.s3, java.lang.Iterable, j$.lang.a, j$.util.Collection
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
        r((Integer) obj);
    }

    @Override // j$.util.stream.s3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.j0, j$.util.stream.l0
    public final p0 build() {
        return this;
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
