package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d1 extends v0 implements s0 {
    @Override // j$.util.stream.s0
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) j);
        d(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.s0
    public final void d(int i, Object obj) {
        t0 t0Var = this.a;
        ((s0) t0Var).d(i, obj);
        ((s0) this.b).d(i + ((int) ((s0) t0Var).count()), obj);
    }

    @Override // j$.util.stream.s0
    public final void e(Object obj) {
        ((s0) this.a).e(obj);
        ((s0) this.b).e(obj);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return i2.j(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
