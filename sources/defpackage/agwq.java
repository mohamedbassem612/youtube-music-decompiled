package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwq extends agqr {
    final /* synthetic */ Iterator a;
    final /* synthetic */ agwr b;

    public agwq(agwr agwrVar, Iterator it) {
        this.a = it;
        this.b = agwrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b.a.b = entry;
        return entry.getKey();
    }
}
