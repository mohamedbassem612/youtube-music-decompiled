package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awtc implements Iterator, awrp {
    final /* synthetic */ awsu a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [awsx, java.lang.Object] */
    public awtc(awsu awsuVar) {
        this.a = awsuVar;
        this.b = awsuVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awqg, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.invoke(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
