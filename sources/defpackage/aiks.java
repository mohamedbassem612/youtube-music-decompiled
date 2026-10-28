package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiks implements Iterator, awrp {
    final /* synthetic */ Iterator a;
    private final /* synthetic */ Iterator b;

    public aiks(Iterator it) {
        this.a = it;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new aiku((Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
