package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class n1 implements p0 {
    public final int[] a;
    public int b;

    public n1(long j) {
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            throw null;
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.s0
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length != i ? Arrays.copyOf(iArr, i) : iArr;
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.s0
    public final void d(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.s0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

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

    @Override // j$.util.stream.t0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return i2.j(this, intFunction);
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final j$.util.j0 spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public n1(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
