package j$.util.stream;

import j$.util.Comparator$CC;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class m3 extends c3 {
    public final boolean n;
    public final Comparator o;

    public m3(d3 d3Var) {
        super(d3Var, z3.q | z3.o, (byte) 0);
        this.n = true;
        this.o = Comparator$CC.naturalOrder();
    }

    @Override // j$.util.stream.a
    public final t0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (z3.SORTED.p(aVar.f) && this.n) {
            return aVar.c(spliterator, false, intFunction);
        }
        Object[] objArrK = aVar.c(spliterator, true, intFunction).k(intFunction);
        Arrays.sort(objArrK, this.o);
        return new w0(objArrK);
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        g3Var.getClass();
        if (z3.SORTED.p(i) && this.n) {
            return g3Var;
        }
        boolean zP = z3.SIZED.p(i);
        Comparator comparator = this.o;
        return zP ? new o3(g3Var, comparator) : new n3(g3Var, comparator);
    }

    public m3(d3 d3Var, Comparator comparator) {
        super(d3Var, z3.q | z3.p, (byte) 0);
        this.n = false;
        comparator.getClass();
        this.o = comparator;
    }
}
