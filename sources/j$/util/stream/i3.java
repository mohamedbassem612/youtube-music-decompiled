package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class i3 extends c3 {
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(d3 d3Var, int i, long j) {
        super(d3Var, i, (byte) 0);
        this.n = j;
    }

    @Override // j$.util.stream.a
    public final t0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        Spliterator q4Var;
        long jG = aVar.g(spliterator);
        long j = this.n;
        if (jG <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (z3.ORDERED.p(aVar.f)) {
                return (t0) new k3(this, aVar, spliterator, intFunction, this.n).invoke();
            }
            Spliterator spliteratorU = aVar.u(spliterator);
            if (0 <= jG) {
                if (j >= 0) {
                    jG = Math.min(j, jG);
                }
                j = jG;
            }
            return i2.v(this, new s4(spliteratorU, j), true, intFunction);
        }
        a aVar2 = aVar;
        while (aVar2.e > 0) {
            aVar2 = aVar2.b;
        }
        a4 a4VarI = aVar2.i();
        if (j < 0) {
            j = Long.MAX_VALUE;
        }
        long j2 = j >= 0 ? j : Long.MAX_VALUE;
        int i = j3.a[a4VarI.ordinal()];
        if (i == 1) {
            q4Var = new q4(spliterator, j2);
        } else if (i == 2) {
            q4Var = new n4((Spliterator.OfInt) spliterator, j2);
        } else if (i == 3) {
            q4Var = new o4((Spliterator.OfLong) spliterator, j2);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape ".concat(String.valueOf(a4VarI)));
            }
            q4Var = new m4((j$.util.c0) spliterator, j2);
        }
        return i2.v(aVar, q4Var, true, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator m(a aVar, Spliterator spliterator) {
        long jG = aVar.g(spliterator);
        long j = this.n;
        if (jG > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorU = aVar.u(spliterator);
            if (j < 0) {
                j = Long.MAX_VALUE;
            }
            return new q4(spliteratorU, j >= 0 ? j : Long.MAX_VALUE);
        }
        if (z3.ORDERED.p(aVar.f)) {
            return ((t0) new k3(this, aVar, spliterator, new n((byte) 18), this.n).invoke()).spliterator();
        }
        Spliterator spliteratorU2 = aVar.u(spliterator);
        if (0 <= jG) {
            if (j >= 0) {
                jG = Math.min(j, jG);
            }
            j = jG;
        }
        return new s4(spliteratorU2, j);
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        h3 h3Var = new h3(g3Var);
        h3Var.b = 0L;
        long j = this.n;
        if (j < 0) {
            j = Long.MAX_VALUE;
        }
        h3Var.c = j;
        return h3Var;
    }
}
