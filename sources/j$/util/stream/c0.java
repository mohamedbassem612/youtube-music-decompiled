package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c0 extends a implements LongStream {
    @Override // j$.util.stream.LongStream
    public final OptionalDouble average() {
        long[] jArr = (long[]) d(new l2(a4.LONG_VALUE, new j$.desugar.sun.nio.fs.h((byte) 9, new n((byte) 13)), new n((byte) 12), new n((byte) 11), (byte) 0));
        long j = jArr[0];
        return j > 0 ? new OptionalDouble(jArr[1] / j) : OptionalDouble.empty();
    }

    @Override // j$.util.stream.a
    public final t0 f(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jG >= 2147483639) {
                j$.time.g.a("Stream size exceeds max array size");
                return null;
            }
            long[] jArr = new long[(int) jG];
            new a2(spliterator, aVar, jArr).invoke();
            return new w1(jArr);
        }
        r0 r0Var = (r0) new y0(aVar, spliterator, new n((byte) 21), new n((byte) 22)).invoke();
        if (!z || r0Var.l() <= 0) {
            return r0Var;
        }
        long jCount = r0Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        long[] jArr2 = new long[(int) jCount];
        new f2(r0Var, jArr2, (byte) 0).invoke();
        return new w1(jArr2);
    }

    @Override // j$.util.stream.a
    public final boolean h(Spliterator spliterator, g3 g3Var) {
        LongConsumer yVar;
        boolean zS;
        if (!(spliterator instanceof Spliterator.OfLong)) {
            if (!c5.a) {
                throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            c5.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) spliterator;
        if (g3Var instanceof LongConsumer) {
            yVar = (LongConsumer) g3Var;
        } else {
            if (c5.a) {
                c5.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            g3Var.getClass();
            yVar = new j$.util.y(g3Var, (byte) 1);
        }
        do {
            zS = g3Var.s();
            if (zS) {
                break;
            }
        } while (ofLong.tryAdvance(yVar));
        return zS;
    }

    @Override // j$.util.stream.a
    public final a4 i() {
        return a4.LONG_VALUE;
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator<Long> iterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof Spliterator.OfLong) {
            return new j$.util.o0((Spliterator.OfLong) spliterator);
        }
        if (!c5.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        c5.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final Spliterator j(Supplier supplier) {
        return new e4(supplier);
    }

    @Override // j$.util.stream.a
    public final l0 k(long j, IntFunction intFunction) {
        return i2.A(j);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong max() {
        return (OptionalLong) d(new j2(a4.LONG_VALUE, new n((byte) 14), (byte) 1));
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong min() {
        return (OptionalLong) d(new j2(a4.LONG_VALUE, new n((byte) 16), (byte) 1));
    }

    @Override // j$.util.stream.a
    public final Spliterator r(a aVar, Supplier supplier, boolean z) {
        return new l4(aVar, supplier, z);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final Spliterator<Long> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof Spliterator.OfLong) {
            return (Spliterator.OfLong) spliterator;
        }
        if (!c5.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        c5.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return ((Long) d(new j2(a4.LONG_VALUE, new n((byte) 15), (byte) 0))).longValue();
    }
}
