package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class g4 implements Spliterator {
    public final Supplier a;
    public Spliterator b;

    public g4(Supplier supplier) {
        this.a = supplier;
    }

    public final Spliterator a() {
        Spliterator spliterator = this.b;
        if (spliterator != null) {
            return spliterator;
        }
        Spliterator spliterator2 = (Spliterator) this.a.get();
        this.b = spliterator2;
        return spliterator2;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return a().characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a().estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        a().forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return a().getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return a().getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.i.b(getClass().getName(), "[", String.valueOf(a()), "]");
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        return a().tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        return a().trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.j0 trySplit() {
        return (j$.util.j0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }
}
