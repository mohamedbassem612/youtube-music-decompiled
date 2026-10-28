package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i2 implements a5 {
    public static final k1 a = new k1();
    public static final i1 b = new i1();
    public static final j1 c = new j1();
    public static final h1 d = new h1();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static k0 A(long j) {
        return (j < 0 || j >= 2147483639) ? new y1() : new x1(j);
    }

    public static j$.nio.file.y B(g0 g0Var, Predicate predicate) {
        predicate.getClass();
        g0Var.getClass();
        return new j$.nio.file.y(a4.REFERENCE, g0Var, new j$.nio.file.y((Object) g0Var, (Object) predicate, (byte) 10));
    }

    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(e3 e3Var, Integer num) {
        if (c5.a) {
            c5.a(e3Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        e3Var.accept(num.intValue());
    }

    public static void g(f3 f3Var, Long l) {
        if (c5.a) {
            c5.a(f3Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        f3Var.accept(l.longValue());
    }

    public static void i() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] j(s0 s0Var, IntFunction intFunction) {
        if (c5.a) {
            c5.a(s0Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (s0Var.count() >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) s0Var.count());
        s0Var.h(objArr, 0);
        return objArr;
    }

    public static void k(n0 n0Var, Double[] dArr, int i) {
        if (c5.a) {
            c5.a(n0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) n0Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void l(p0 p0Var, Integer[] numArr, int i) {
        if (c5.a) {
            c5.a(p0Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) p0Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void m(r0 r0Var, Long[] lArr, int i) {
        if (c5.a) {
            c5.a(r0Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) r0Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void n(n0 n0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            n0Var.e((DoubleConsumer) consumer);
        } else {
            if (c5.a) {
                c5.a(n0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.c0) n0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void o(p0 p0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            p0Var.e((IntConsumer) consumer);
        } else {
            if (c5.a) {
                c5.a(p0Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) p0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(r0 r0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            r0Var.e((LongConsumer) consumer);
        } else {
            if (c5.a) {
                c5.a(r0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfLong) r0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static n0 q(n0 n0Var, long j, long j2) {
        if (j == 0 && j2 == n0Var.count()) {
            return n0Var;
        }
        long j3 = j2 - j;
        j$.util.c0 c0Var = (j$.util.c0) n0Var.spliterator();
        i0 g1Var = (j3 < 0 || j3 >= 2147483639) ? new g1() : new f1(j3);
        g1Var.p(j3);
        boolean z = false;
        for (int i = 0; i < j && c0Var.tryAdvance(new m0(z ? 1 : 0)); i++) {
        }
        if (j2 == n0Var.count()) {
            c0Var.forEachRemaining((DoubleConsumer) g1Var);
        } else {
            for (int i2 = 0; i2 < j3 && c0Var.tryAdvance((DoubleConsumer) g1Var); i2++) {
            }
        }
        g1Var.end();
        return g1Var.build();
    }

    public static p0 r(p0 p0Var, long j, long j2) {
        if (j == 0 && j2 == p0Var.count()) {
            return p0Var;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) p0Var.spliterator();
        j0 j0VarZ = z(j3);
        j0VarZ.p(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((IntConsumer) new o0((byte) 0)); i++) {
        }
        if (j2 == p0Var.count()) {
            ofInt.forEachRemaining((IntConsumer) j0VarZ);
        } else {
            for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((IntConsumer) j0VarZ); i2++) {
            }
        }
        j0VarZ.end();
        return j0VarZ.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r0 s(r0 r0Var, long j, long j2) {
        if (j == 0 && j2 == r0Var.count()) {
            return r0Var;
        }
        long j3 = j2 - j;
        Spliterator.OfLong ofLong = (Spliterator.OfLong) r0Var.spliterator();
        k0 k0VarA = A(j3);
        k0VarA.p(j3);
        Object[] objArr = 0;
        for (int i = 0; i < j && ofLong.tryAdvance(new q0(objArr == true ? 1 : 0)); i++) {
        }
        if (j2 == r0Var.count()) {
            ofLong.forEachRemaining((LongConsumer) k0VarA);
        } else {
            for (int i2 = 0; i2 < j3 && ofLong.tryAdvance((LongConsumer) k0VarA); i2++) {
            }
        }
        k0VarA.end();
        return k0VarA.build();
    }

    public static t0 t(t0 t0Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == t0Var.count()) {
            return t0Var;
        }
        Spliterator spliterator = t0Var.spliterator();
        long j3 = j2 - j;
        l0 l0VarU = u(j3, intFunction);
        l0VarU.p(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new n((byte) 17)); i++) {
        }
        if (j2 == t0Var.count()) {
            spliterator.forEachRemaining(l0VarU);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(l0VarU); i2++) {
            }
        }
        l0VarU.end();
        return l0VarU.build();
    }

    public static l0 u(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new d2() : new m1(j, intFunction);
    }

    public static t0 v(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            t0 t0Var = (t0) new y0(aVar, spliterator, new j$.desugar.sun.nio.fs.h((byte) 10, intFunction), new n((byte) 23)).invoke();
            return z ? x(t0Var, intFunction) : t0Var;
        }
        if (jG >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jG);
        new b2(spliterator, aVar, objArr).invoke();
        return new w0(objArr);
    }

    public static v0 w(a4 a4Var, t0 t0Var, t0 t0Var2) {
        int i = u0.a[a4Var.ordinal()];
        if (i == 1) {
            return new e1(t0Var, t0Var2);
        }
        if (i == 2) {
            return new b1((p0) t0Var, (p0) t0Var2);
        }
        if (i == 3) {
            return new c1((r0) t0Var, (r0) t0Var2);
        }
        if (i == 4) {
            return new a1((n0) t0Var, (n0) t0Var2);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(a4Var)));
    }

    public static t0 x(t0 t0Var, IntFunction intFunction) {
        if (t0Var.l() <= 0) {
            return t0Var;
        }
        long jCount = t0Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new g2(t0Var, objArr, (byte) 1).invoke();
        return new w0(objArr);
    }

    public static p0 y(p0 p0Var) {
        if (p0Var.l() <= 0) {
            return p0Var;
        }
        long jCount = p0Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jCount];
        new e2(p0Var, iArr, (byte) 0).invoke();
        return new n1(iArr);
    }

    public static j0 z(long j) {
        return (j < 0 || j >= 2147483639) ? new p1() : new o1(j);
    }

    public v2 C() {
        return new x2();
    }

    @Override // j$.util.stream.a5
    public Object a(a aVar, Spliterator spliterator) {
        v2 v2VarC = C();
        aVar.s(spliterator, v2VarC);
        return v2VarC.get();
    }

    @Override // j$.util.stream.a5
    public Object b(a aVar, Spliterator spliterator) {
        return ((v2) new y2(this, aVar, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.a5
    public int c() {
        return 0;
    }
}
