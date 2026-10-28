package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s4 implements Spliterator, Consumer {
    public final Spliterator a;
    public final boolean b;
    public final long c;
    public final AtomicLong d;
    public Object e;

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    public s4(Spliterator spliterator, long j) {
        this.a = spliterator;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        this.b = i >>> 31;
        this.c = i >= 0 ? j : 0L;
        this.d = new AtomicLong(i < 0 ? 0L : j);
    }

    public final long a(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.d;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        c4 c4Var = null;
        while (true) {
            t4 t4Var = this.d.get() > 0 ? t4.MAYBE_MORE : this.b ? t4.UNLIMITED : t4.NO_MORE;
            if (t4Var == t4.NO_MORE) {
                return;
            }
            t4 t4Var2 = t4.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (t4Var != t4Var2) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (c4Var == null) {
                c4Var = new c4();
            } else {
                c4Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c4Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i = 0; i < jA; i++) {
                consumer.accept(c4Var.b[i]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        t4 t4Var;
        consumer.getClass();
        do {
            if (this.d.get() > 0) {
                t4Var = t4.MAYBE_MORE;
            } else {
                t4Var = this.b ? t4.UNLIMITED : t4.NO_MORE;
            }
            if (t4Var == t4.NO_MORE || !this.a.tryAdvance(this)) {
                return false;
            }
        } while (a(1L) != 1);
        consumer.accept(this.e);
        this.e = null;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.d.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return new s4(spliteratorTrySplit, this);
    }

    public s4(Spliterator spliterator, s4 s4Var) {
        this.a = spliterator;
        this.b = s4Var.b;
        this.d = s4Var.d;
        this.c = s4Var.c;
    }
}
