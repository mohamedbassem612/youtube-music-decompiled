package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agkm extends agqr {
    final Iterator a;
    Object b = null;
    Iterator c = aglu.a;
    final /* synthetic */ agkp d;

    public agkm(agkp agkpVar) {
        this.d = agkpVar;
        this.a = agkpVar.map.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((agjw) entry.getValue()).iterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, this.c.next());
    }
}
