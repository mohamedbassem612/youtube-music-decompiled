package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agyw extends Spliterators.AbstractSpliterator {
    final /* synthetic */ BiFunction a;
    final /* synthetic */ agyx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyw(agyx agyxVar, long j, BiFunction biFunction) {
        super(j, 16);
        this.a = biFunction;
        this.b = agyxVar;
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
        agyx agyxVar = this.b;
        if (!agyxVar.a()) {
            return false;
        }
        consumer.accept(this.a.apply(agyxVar.a.a, agyxVar.b.a));
        return true;
    }
}
