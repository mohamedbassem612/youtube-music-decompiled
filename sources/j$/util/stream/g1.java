package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class g1 extends w3 implements n0, i0, DoubleConsumer {
    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        Double d = (Double) obj;
        if (c5.a) {
            c5.a(g1.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        accept(d.doubleValue());
    }

    public final void accept$j$$util$stream$SpinedBuffer$OfDouble(double d) {
        z();
        double[] dArr = (double[]) this.d;
        int i = this.a;
        this.a = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final void d(int i, Object obj) {
        super.d(i, (double[]) obj);
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            super.e((DoubleConsumer) consumer);
        } else {
            if (c5.a) {
                c5.a(g1.class, "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.g(new q3(this, 0, this.b, 0, this.a), consumer);
        }
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.q(this, j, j2);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        i2.k(this, (Double[]) objArr, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.p0(new q3(this, 0, this.b, 0, this.a));
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return i2.j(this, intFunction);
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.w3, j$.util.stream.s0
    public final Object newArray(int i) {
        return new double[i];
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

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.j0 spliterator() {
        return new q3(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.stream.w3
    public final void t(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    public final String toString() {
        double[] dArr = (double[]) super.b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", g1.class.getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", g1.class.getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.w3
    public final int v(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.w3
    public final Object[] y() {
        return new double[8][];
    }

    @Override // j$.util.stream.l0
    public final t0 build() {
        return this;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return new q3(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        accept$j$$util$stream$SpinedBuffer$OfDouble(d);
    }

    @Override // j$.util.stream.i0, j$.util.stream.l0
    public final n0 build() {
        return this;
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
