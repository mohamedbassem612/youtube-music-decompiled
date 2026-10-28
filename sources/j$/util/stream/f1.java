package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class f1 implements i0, n0 {
    public final double[] a;
    public int b;

    public f1(long j) {
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            throw null;
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            j$.time.g.d("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(dArr.length)});
        } else {
            this.b = i + 1;
            dArr[i] = d;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.s0
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length != i ? Arrays.copyOf(dArr, i) : dArr;
    }

    @Override // j$.util.stream.i0, j$.util.stream.l0
    public final n0 build() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return this;
        }
        j$.time.g.d("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(dArr.length)});
        return null;
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.s0
    public final void d(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.s0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.g3
    public final void end() {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            j$.time.g.d("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(dArr.length)});
        }
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void forEach(Consumer consumer) {
        i2.n(this, consumer);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.q(this, j, j2);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        i2.k(this, (Double[]) objArr, i);
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
        double[] dArr = this.a;
        if (j == dArr.length) {
            this.b = 0;
        } else {
            j$.time.g.d("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(dArr.length)});
        }
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final j$.util.j0 spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.s0(dArr, 0, i, 1040);
    }

    public final String toString() {
        double[] dArr = this.a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.s0(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        Double d = (Double) obj;
        if (!c5.a) {
            accept(d.doubleValue());
        } else {
            c5.a(f1.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    @Override // j$.util.stream.l0
    public final /* bridge */ /* synthetic */ t0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }
}
