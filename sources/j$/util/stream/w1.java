package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class w1 implements r0 {
    public final long[] a;
    public int b;

    public w1(long j) {
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            throw null;
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final s0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.s0
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length != i ? Arrays.copyOf(jArr, i) : jArr;
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.s0
    public final void d(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.s0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ void forEach(Consumer consumer) {
        i2.p(this, consumer);
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

    @Override // j$.util.stream.s0, j$.util.stream.t0
    public final j$.util.j0 spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public w1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
