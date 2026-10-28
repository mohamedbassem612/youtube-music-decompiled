package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements BaseStream {
    public final a a;
    public final a b;
    public final int c;
    public final a d;
    public int e;
    public int f;
    public Spliterator g;
    public Supplier h;
    public boolean i;
    public final boolean j;
    public Runnable k;
    public boolean l;

    public a(a aVar, int i) {
        if (aVar.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.i = true;
        aVar.d = this;
        this.b = aVar;
        this.c = z3.h & i;
        this.f = z3.h(i, aVar.f);
        a aVar2 = aVar.a;
        this.a = aVar2;
        if (n()) {
            aVar2.j = true;
        }
        this.e = aVar.e + 1;
    }

    public final void a(Spliterator spliterator, g3 g3Var) {
        g3Var.getClass();
        if (z3.SHORT_CIRCUIT.p(this.f)) {
            b(spliterator, g3Var);
            return;
        }
        g3Var.p(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(g3Var);
        g3Var.end();
    }

    public final void b(Spliterator spliterator, g3 g3Var) {
        while (this.e > 0) {
            this = this.b;
        }
        g3Var.p(spliterator.getExactSizeIfKnown());
        this.h(spliterator, g3Var);
        g3Var.end();
    }

    public final t0 c(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.l) {
            return f(this, spliterator, z, intFunction);
        }
        l0 l0VarK = k(g(spliterator), intFunction);
        s(spliterator, l0VarK);
        return l0VarK.build();
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.h = null;
        this.g = null;
        a aVar = this.a;
        Runnable runnable = aVar.k;
        if (runnable != null) {
            aVar.k = null;
            runnable.run();
        }
    }

    public final Object d(a5 a5Var) {
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        return this.a.l ? a5Var.b(this, p(a5Var.c())) : a5Var.a(this, p(a5Var.c()));
    }

    public final t0 e(IntFunction intFunction) {
        a aVar;
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        if (!this.a.l || (aVar = this.b) == null || !n()) {
            return c(p(0), true, intFunction);
        }
        this.e = 0;
        return l(aVar, aVar.p(0), intFunction);
    }

    public t0 f(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            p0 p0Var = (p0) new y0(aVar, spliterator, new n((byte) 19), new n((byte) 20)).invoke();
            return z ? i2.y(p0Var) : p0Var;
        }
        if (jG >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jG];
        new z1(spliterator, aVar, iArr).invoke();
        return new n1(iArr);
    }

    public final long g(Spliterator spliterator) {
        if (z3.SIZED.p(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public boolean h(Spliterator spliterator, g3 g3Var) {
        boolean zS;
        do {
            zS = g3Var.s();
            if (zS) {
                break;
            }
        } while (spliterator.tryAdvance(g3Var));
        return zS;
    }

    public a4 i() {
        return a4.INT_VALUE;
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.l;
    }

    public Spliterator j(Supplier supplier) {
        return new d4(supplier);
    }

    public l0 k(long j, IntFunction intFunction) {
        return i2.z(j);
    }

    public t0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator m(a aVar, Spliterator spliterator) {
        return l(aVar, spliterator, new j$.desugar.sun.nio.fs.o((byte) 13)).spliterator();
    }

    public boolean n() {
        return false;
    }

    public g3 o(int i, g3 g3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        a aVar = this.a;
        Runnable runnable2 = aVar.k;
        if (runnable2 != null) {
            runnable = new v4(runnable2, runnable, (byte) 0);
        }
        aVar.k = runnable;
        return this;
    }

    public final Spliterator p(int i) {
        int i2;
        int i3;
        a aVar = this.a;
        Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
        } else {
            Supplier supplier = aVar.h;
            if (supplier == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            spliterator = (Spliterator) supplier.get();
            aVar.h = null;
        }
        if (aVar.l && aVar.j) {
            int i4 = 1;
            Spliterator spliteratorM = spliterator;
            a aVar2 = aVar;
            while (true) {
                aVar2 = aVar2.d;
                if (aVar == this) {
                    break;
                }
                int i5 = aVar2.c;
                if (aVar2.n()) {
                    if (z3.SHORT_CIRCUIT.p(i5)) {
                        i5 &= ~z3.u;
                    }
                    spliteratorM = aVar2.m(aVar, spliteratorM);
                    if (spliteratorM.hasCharacteristics(64)) {
                        i2 = i5 & (~z3.t);
                        i3 = z3.s;
                    } else {
                        i2 = i5 & (~z3.s);
                        i3 = z3.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                aVar2.e = i4;
                aVar2.f = z3.h(i5, aVar.f);
                aVar = aVar2;
                i4++;
            }
            spliterator = spliteratorM;
        }
        if (i != 0) {
            this.f = z3.h(i, this.f);
        }
        return spliterator;
    }

    public final Spliterator q() {
        a aVar = this.a;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
            return spliterator;
        }
        Supplier supplier = aVar.h;
        if (supplier == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        Spliterator spliterator2 = (Spliterator) supplier.get();
        aVar.h = null;
        return spliterator2;
    }

    public Spliterator r(a aVar, Supplier supplier, boolean z) {
        return new j4(aVar, supplier, z);
    }

    public final void s(Spliterator spliterator, g3 g3Var) {
        g3Var.getClass();
        a(spliterator, t(g3Var));
    }

    @Override // j$.util.stream.BaseStream
    public final a sequential() {
        this.a.l = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        a aVar = this.a;
        if (this != aVar) {
            return r(this, new j$.desugar.sun.nio.fs.h((byte) 6, this), aVar.l);
        }
        Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
            return spliterator;
        }
        Supplier supplier = aVar.h;
        if (supplier == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.h = null;
        return j(supplier);
    }

    public final g3 t(g3 g3Var) {
        g3Var.getClass();
        while (true) {
            int i = this.e;
            a aVar = this.b;
            if (i <= 0) {
                return g3Var;
            }
            g3Var = this.o(aVar.f, g3Var);
            this = aVar;
        }
    }

    public final Spliterator u(Spliterator spliterator) {
        return this.e != 0 ? r(this, new j$.desugar.sun.nio.fs.h((byte) 7, spliterator), this.a.l) : spliterator;
    }

    public a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = i & z3.g;
        this.c = i2;
        this.f = (~(i2 << 1)) & z3.l;
        this.e = 0;
        this.l = z;
    }

    public a(Supplier supplier, int i, boolean z) {
        this.b = null;
        this.h = supplier;
        this.a = this;
        int i2 = i & z3.g;
        this.c = i2;
        this.f = (~(i2 << 1)) & z3.l;
        this.e = 0;
        this.l = z;
    }
}
