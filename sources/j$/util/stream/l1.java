package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l1 implements t0 {
    @Override // j$.util.stream.t0
    public t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.t0
    public /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.t(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.t0
    public final Object[] k(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 0;
    }

    public final void e(Object obj) {
    }

    public final void d(int i, Object obj) {
    }
}
