package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fym implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;

    public fym(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.a;
        if (it.hasNext()) {
            return new fzb(((Integer) it.next()).toString());
        }
        Iterator it2 = this.b;
        if (it2.hasNext()) {
            return new fzb((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
