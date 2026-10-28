package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class m0 implements Iterator, Consumer {
    public boolean a = false;
    public Object b;
    public final /* synthetic */ Spliterator c;

    public m0(Spliterator spliterator) {
        this.c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = true;
        this.b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
