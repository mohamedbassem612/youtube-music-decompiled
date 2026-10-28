package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class e1 extends v0 {
    @Override // j$.util.stream.t0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.t0
    public final t0 g(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.g(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 <= jCount) {
            return this.a.g(j, j2, intFunction);
        }
        return i2.w(a4.REFERENCE, this.a.g(j, jCount, intFunction), this.b.g(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.t0
    public final void h(Object[] objArr, int i) {
        objArr.getClass();
        t0 t0Var = this.a;
        t0Var.h(objArr, i);
        this.b.h(objArr, i + ((int) t0Var.count()));
    }

    @Override // j$.util.stream.t0
    public final Object[] k(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return new u1(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
