package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class h0 extends b {
    public final j$.nio.file.y j;

    public h0(h0 h0Var, Spliterator spliterator) {
        super(h0Var, spliterator);
        this.j = h0Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        f0 f0Var = (f0) ((Supplier) this.j.c).get();
        aVar.s(this.b, f0Var);
        boolean z = f0Var.b;
        if (z == ((g0) this.j.b).b) {
            j$.desugar.sun.nio.fs.g.E(this.h, null, Boolean.valueOf(z));
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new h0(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return Boolean.valueOf(!((g0) this.j.b).b);
    }

    public h0(j$.nio.file.y yVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = yVar;
    }
}
