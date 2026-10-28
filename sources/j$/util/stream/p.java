package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p implements a5 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public p(boolean z, a4 a4Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = z3.u | (z ? 0 : z3.r);
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.a5
    public final Object a(a aVar, Spliterator spliterator) {
        b5 b5Var = (b5) this.d.get();
        aVar.s(spliterator, b5Var);
        Object obj = b5Var.get();
        return obj == null ? this.b : obj;
    }

    @Override // j$.util.stream.a5
    public final Object b(a aVar, Spliterator spliterator) {
        return new t(this, z3.ORDERED.p(aVar.f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.a5
    public final int c() {
        return this.a;
    }
}
