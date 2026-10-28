package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agyq extends Spliterators.AbstractSpliterator {
    final /* synthetic */ Iterator a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyq(Iterator it) {
        super(Long.MAX_VALUE, 0);
        this.a = it;
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Iterator it = this.a;
        boolean zHasNext = it.hasNext();
        if (zHasNext) {
            consumer.accept(it.next());
        }
        return zHasNext;
    }
}
