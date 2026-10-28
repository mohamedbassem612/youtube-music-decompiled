package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b0 extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        g0 g0Var = g0.ALL;
        intPredicate.getClass();
        g0Var.getClass();
        return ((Boolean) d(new j$.nio.file.y(a4.INT_VALUE, g0Var, new j$.nio.file.y((Object) g0Var, (Object) intPredicate, (byte) 9)))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new y(this, 0, new n((byte) 10), (byte) 0);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        intPredicate.getClass();
        return new z(this, z3.t, intPredicate, (byte) 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) d(q.c);
    }

    @Override // j$.util.stream.a
    public final boolean h(Spliterator spliterator, g3 g3Var) {
        IntConsumer xVar;
        boolean zS;
        if (!(spliterator instanceof Spliterator.OfInt)) {
            if (!c5.a) {
                throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
            }
            c5.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) spliterator;
        if (g3Var instanceof IntConsumer) {
            xVar = (IntConsumer) g3Var;
        } else {
            if (c5.a) {
                c5.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            g3Var.getClass();
            xVar = new j$.util.x(g3Var, (byte) 1);
        }
        do {
            zS = g3Var.s();
            if (zS) {
                break;
            }
        } while (ofInt.tryAdvance(xVar));
        return zS;
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator<Integer> iterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof Spliterator.OfInt) {
            return new j$.util.n0((Spliterator.OfInt) spliterator);
        }
        if (!c5.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        c5.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new y(this, z3.p | z3.n, intFunction, (byte) 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return (OptionalInt) d(new j2(a4.INT_VALUE, new n((byte) 9), (byte) 4));
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final Spliterator<Integer> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (!c5.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        c5.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return ((Integer) d(new j2(a4.INT_VALUE, new n((byte) 8), (byte) 3))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) i2.y((p0) e(new n((byte) 7))).b();
    }
}
