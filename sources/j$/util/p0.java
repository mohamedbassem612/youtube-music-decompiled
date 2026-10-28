package j$.util;

import j$.util.stream.q3;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 implements DoubleConsumer, v, Iterator {
    public boolean a = false;
    public double b;
    public final /* synthetic */ q3 c;

    public p0(q3 q3Var) {
        this.c = q3Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.v
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            DoubleConsumer doubleConsumer = (DoubleConsumer) consumer;
            doubleConsumer.getClass();
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                doubleConsumer.accept(this.b);
            }
            return;
        }
        consumer.getClass();
        if (a1.a) {
            a1.a(p0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        w wVar = new w(consumer);
        while (hasNext()) {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            wVar.accept(this.b);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((Object) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a1.a) {
            a1.a(p0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return Double.valueOf(this.b);
    }
}
