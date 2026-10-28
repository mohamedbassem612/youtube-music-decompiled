package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwc extends AbstractSet {
    final /* synthetic */ agwh a;

    public agwc(agwh agwhVar) {
        this.a = agwhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return agwh.d(this.a.b.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        agwh agwhVar = this.a;
        List list = agwhVar.c;
        return list == null ? new agwa(agwhVar.b.entrySet().iterator()) : new agwb(list.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.e;
    }
}
