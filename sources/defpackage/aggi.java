package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aggi implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ aggj c;

    public aggi(aggj aggjVar) {
        this.c = aggjVar;
        this.a = aggjVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahno.P(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
