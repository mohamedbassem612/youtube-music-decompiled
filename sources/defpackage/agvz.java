package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agvz extends AbstractSet {
    final /* synthetic */ agwh a;

    public agvz(agwh agwhVar) {
        this.a = agwhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return agwh.c(this.a.b.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        agwh agwhVar = this.a;
        List list = agwhVar.c;
        return list == null ? new agvx(agwhVar.b.entrySet().iterator()) : new agvy(list.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.d;
    }
}
