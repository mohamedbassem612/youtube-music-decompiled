package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aikq implements Iterator, awrp {
    private final /* synthetic */ Iterator a;

    public aikq(Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
