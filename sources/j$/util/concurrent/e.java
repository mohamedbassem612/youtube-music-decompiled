package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends n implements Spliterator {
    public final ConcurrentHashMap i;
    public long j;

    public e(j[] jVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(jVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            j jVarA = a();
            if (jVarA == null) {
                return;
            } else {
                consumer.accept(new i(jVarA.b, jVarA.c, this.i));
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
        consumer.getClass();
        j jVarA = a();
        if (jVarA == null) {
            return false;
        }
        consumer.accept(new i(jVarA.b, jVarA.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        j[] jVarArr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new e(jVarArr, this.h, i3, i2, j, this.i);
    }
}
