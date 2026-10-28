package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agvr extends AbstractSet {
    final /* synthetic */ agvs a;

    public agvr(agvs agvsVar) {
        this.a = agvsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof agwk)) {
            return false;
        }
        agwk agwkVar = (agwk) obj;
        agvs agvsVar = this.a;
        Object obj2 = agwkVar.a;
        return agvsVar.e().contains(obj2) && agvsVar.f(obj2).contains(agwkVar.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new agwl(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ahng.P(this.a.a());
    }
}
