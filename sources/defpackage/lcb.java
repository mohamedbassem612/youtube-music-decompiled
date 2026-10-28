package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lcb implements Iterator {
    final Iterator a;
    final /* synthetic */ lcc b;

    public lcb(lcc lccVar) {
        this.b = lccVar;
        this.a = lccVar.a.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
