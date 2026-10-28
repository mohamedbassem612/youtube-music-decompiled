package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v0 implements t0 {
    public final t0 a;
    public final t0 b;
    public final long c;

    public v0(t0 t0Var, t0 t0Var2) {
        this.a = t0Var;
        this.b = t0Var2;
        this.c = t0Var2.count() + t0Var.count();
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 2;
    }

    @Override // j$.util.stream.t0
    public final /* bridge */ /* synthetic */ s0 a(int i) {
        return (s0) a(i);
    }
}
