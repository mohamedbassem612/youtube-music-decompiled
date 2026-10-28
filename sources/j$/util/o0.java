package j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements Iterator, LongConsumer, v {
    public boolean a = false;
    public long b;
    public final /* synthetic */ Spliterator.OfLong c;

    public o0(Spliterator.OfLong ofLong) {
        this.c = ofLong;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // java.util.Iterator, j$.util.v
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            LongConsumer longConsumer = (LongConsumer) consumer;
            longConsumer.getClass();
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                longConsumer.accept(this.b);
            }
            return;
        }
        consumer.getClass();
        if (a1.a) {
            a1.a(o0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        y yVar = new y(consumer, (byte) 0);
        while (hasNext()) {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            yVar.accept(this.b);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a1.a) {
            a1.a(o0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return Long.valueOf(this.b);
    }
}
