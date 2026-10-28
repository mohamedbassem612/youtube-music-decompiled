package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aiib implements Iterator {
    final /* synthetic */ aiid a;
    private final Iterator b;

    public aiib(aiid aiidVar, Iterator it) {
        this.a = aiidVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new aiia(this.a, (Map.Entry) this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
