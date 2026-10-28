package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y4 implements Spliterator.OfInt {
    public int a;
    public final int b;
    public boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public y4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (((long) this.b) - ((long) this.a)) + (this.c ? 1L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    @Override // j$.util.j0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.a;
        ?? r1 = this.c;
        int i2 = this.b;
        this.a = i2;
        this.c = false;
        while (i < i2) {
            intConsumer.accept(i);
            i++;
        }
        if (r1 > 0) {
            intConsumer.accept(i);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // j$.util.j0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            intConsumer.accept(i);
            return true;
        }
        if (this.c <= 0) {
            return false;
        }
        this.c = false;
        intConsumer.accept(i);
        return true;
    }

    @Override // j$.util.j0, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.a = i2;
        return new y4(i, i2, 0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }
}
