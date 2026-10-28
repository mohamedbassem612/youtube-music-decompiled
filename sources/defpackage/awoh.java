package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awoh extends awnw {
    private final awog a;

    public awoh(awog awogVar) {
        this.a = awogVar;
    }

    @Override // defpackage.awnj
    public final int a() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.awnw
    public final boolean b(Map.Entry entry) {
        return this.a.i(entry);
    }

    @Override // defpackage.awnw
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        awog awogVar = this.a;
        awogVar.f();
        int iB = awogVar.b(entry.getKey());
        if (iB >= 0) {
            Object[] objArr = awogVar.c;
            objArr.getClass();
            if (awrc.c(objArr[iB], entry.getValue())) {
                awogVar.g(iB);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new awob(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
