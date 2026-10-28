package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agie extends AbstractCollection {
    final /* synthetic */ agif a;

    public agie(agif agifVar) {
        this.a = agifVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        return mapJ != null ? mapJ.values().iterator() : new aghz(agifVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
