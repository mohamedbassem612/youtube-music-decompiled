package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p4 extends r4 implements j$.util.j0 {
    public p4(j$.util.j0 j0Var, long j) {
        super(j0Var, 0L, j, 0L, Math.min(j0Var.estimateSize(), j));
    }

    public Object b() {
        return new m0((byte) 1);
    }

    @Override // j$.util.j0
    public final void forEachRemaining(Object obj) {
        obj.getClass();
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            long j3 = this.d;
            if (j3 < j) {
                if (j3 >= j2 && ((j$.util.j0) this.c).estimateSize() + j3 <= this.b) {
                    ((j$.util.j0) this.c).forEachRemaining(obj);
                    this.d = this.e;
                    return;
                }
                while (j2 > this.d) {
                    ((j$.util.j0) this.c).tryAdvance(b());
                    this.d++;
                }
                while (this.d < this.e) {
                    ((j$.util.j0) this.c).tryAdvance(obj);
                    this.d++;
                }
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

    @Override // j$.util.j0
    public final boolean tryAdvance(Object obj) {
        long j;
        obj.getClass();
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            ((j$.util.j0) this.c).tryAdvance(b());
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return ((j$.util.j0) this.c).tryAdvance(obj);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
