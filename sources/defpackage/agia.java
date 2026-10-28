package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agia extends AbstractSet {
    final /* synthetic */ agif a;

    public agia(agif agifVar) {
        this.a = agifVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        if (mapJ != null) {
            return mapJ.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iD = agifVar.d(entry.getKey());
            if (iD != -1 && Objects.equals(agifVar.h(iD), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC;
        int iZ;
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        if (mapJ != null) {
            return mapJ.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!agifVar.o() && (iZ = aguu.Z(entry.getKey(), entry.getValue(), (iC = agifVar.c()), agifVar.g(), agifVar.p(), agifVar.q(), agifVar.r())) != -1) {
                agifVar.m(iZ, iC);
                agifVar.f--;
                agifVar.k();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
