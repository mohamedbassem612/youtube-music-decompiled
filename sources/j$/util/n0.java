package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n0 implements PrimitiveIterator$OfInt, IntConsumer, v {
    public boolean a = false;
    public int b;
    public final /* synthetic */ Spliterator.OfInt c;

    public n0(Spliterator.OfInt ofInt) {
        this.c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.PrimitiveIterator$OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return PrimitiveIterator$OfInt.CC.$default$next((PrimitiveIterator$OfInt) this);
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.PrimitiveIterator$OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        PrimitiveIterator$OfInt.CC.$default$forEachRemaining((PrimitiveIterator$OfInt) this, consumer);
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        PrimitiveIterator$OfInt.CC.$default$forEachRemaining((PrimitiveIterator$OfInt) this, intConsumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
