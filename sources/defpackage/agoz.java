package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agoz extends agqg {
    final /* synthetic */ aghi a;

    public agoz(aghi aghiVar) {
        this.a = aghiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof agox)) {
            return false;
        }
        agox agoxVar = (agox) obj;
        return agoxVar.a() > 0 && this.a.a(agoxVar.a) == agoxVar.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof agox) {
            agox agoxVar = (agox) obj;
            Object obj2 = agoxVar.a;
            int iA = agoxVar.a();
            if (iA != 0) {
                return this.a.h(obj2, iA);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }
}
