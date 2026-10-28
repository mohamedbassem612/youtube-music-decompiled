package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class k3 extends b {
    public final i3 j;
    public final IntFunction k;
    public final long l;
    public long m;
    public volatile boolean n;

    public k3(k3 k3Var, Spliterator spliterator) {
        super(k3Var, spliterator);
        this.j = k3Var.j;
        this.k = k3Var.k;
        this.l = k3Var.l;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (!d()) {
            i3 i3Var = this.j;
            IntFunction intFunction = this.k;
            i3Var.getClass();
            l0 l0VarU = i2.u(-1L, intFunction);
            g3 g3VarO = this.j.o(this.a.f, l0VarU);
            a aVar = this.a;
            aVar.b(this.b, aVar.t(g3VarO));
            t0 t0VarBuild = l0VarU.build();
            this.m = t0VarBuild.count();
            this.n = true;
            this.b = null;
            return t0VarBuild;
        }
        z3 z3Var = z3.SIZED;
        i3 i3Var2 = this.j;
        int i = i3Var2.c;
        int i2 = z3Var.e;
        long jG = (i & i2) == i2 ? i3Var2.g(this.b) : -1L;
        i3 i3Var3 = this.j;
        IntFunction intFunction2 = this.k;
        i3Var3.getClass();
        l0 l0VarU2 = i2.u(jG, intFunction2);
        g3 g3VarO2 = this.j.o(this.a.f, l0VarU2);
        a aVar2 = this.a;
        aVar2.b(this.b, aVar2.t(g3VarO2));
        return l0VarU2.build();
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new k3(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void h() {
        this.i = true;
        if (this.n) {
            f(j());
        }
    }

    public final long l(long j) {
        if (this.n) {
            return this.m;
        }
        k3 k3Var = (k3) this.d;
        k3 k3Var2 = (k3) this.e;
        if (k3Var == null || k3Var2 == null) {
            return this.m;
        }
        long jL = k3Var.l(j);
        return jL >= j ? jL : k3Var2.l(j) + jL;
    }

    @Override // j$.util.stream.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final l1 j() {
        this.j.getClass();
        a4 a4Var = a4.REFERENCE;
        int i = u0.a[a4Var.ordinal()];
        if (i == 1) {
            return i2.a;
        }
        if (i == 2) {
            return i2.b;
        }
        if (i == 3) {
            return i2.c;
        }
        if (i == 4) {
            return i2.d;
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(a4Var)));
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        k3 k3Var;
        t0 t0VarW;
        d dVar = this.d;
        int i = 1;
        if (dVar != null) {
            this.m = ((k3) dVar).m + ((k3) this.e).m;
            if (this.i) {
                this.m = 0L;
                t0VarW = j();
            } else if (this.m == 0) {
                t0VarW = j();
            } else if (((k3) this.d).m == 0) {
                t0VarW = (t0) ((k3) this.e).k();
            } else {
                this.j.getClass();
                t0VarW = i2.w(a4.REFERENCE, (t0) ((k3) this.d).k(), (t0) ((k3) this.e).k());
            }
            t0 t0VarG = t0VarW;
            if (d()) {
                t0VarG = t0VarG.g(0L, this.l >= 0 ? Math.min(t0VarG.count(), this.l) : this.m, this.k);
            }
            f(t0VarG);
            this.n = true;
        }
        if (this.l >= 0 && !d()) {
            long j = this.l;
            long jL = this.n ? this.m : l(j);
            if (jL < j) {
                k3 k3Var2 = (k3) b();
                Object obj = this;
                while (true) {
                    if (k3Var2 == null) {
                        i = ((jL > j ? 1 : (jL == j ? 0 : -1)) ^ (-1)) >>> 31;
                        break;
                    }
                    if (obj == k3Var2.e && (k3Var = (k3) k3Var2.d) != null) {
                        long jL2 = k3Var.l(j) + jL;
                        if (jL2 >= j) {
                            break;
                        } else {
                            jL = jL2;
                        }
                    }
                    obj = k3Var2;
                    k3Var2 = (k3) k3Var2.b();
                }
            }
            if (i != 0) {
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public k3(i3 i3Var, a aVar, Spliterator spliterator, IntFunction intFunction, long j) {
        super(aVar, spliterator);
        this.j = i3Var;
        this.k = intFunction;
        this.l = j;
    }
}
