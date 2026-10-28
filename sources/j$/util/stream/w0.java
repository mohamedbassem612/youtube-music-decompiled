package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class w0 implements t0 {
    public final Object[] a;
    public int b;

    public w0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            throw null;
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.t0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.r(this.a[i]);
        }
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.t(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.t0
    public final void h(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.t0
    public final Object[] k(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return Spliterators.b(this.a, 0, this.b, 1040);
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    public w0(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
