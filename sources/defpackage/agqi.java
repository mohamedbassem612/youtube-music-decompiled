package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agqi extends agje implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet a;
    private final SortedSet b;
    private transient agqi c;

    public agqi(NavigableSet navigableSet) {
        navigableSet.getClass();
        this.a = navigableSet;
        this.b = DesugarCollections.unmodifiableSortedSet(navigableSet);
    }

    @Override // defpackage.agiy, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.agjd, defpackage.agiy
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.agje, defpackage.agjd
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ Set a() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // defpackage.agje
    protected final SortedSet d() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return aguu.z(this.a.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        agqi agqiVar = this.c;
        if (agqiVar != null) {
            return agqiVar;
        }
        agqi agqiVar2 = new agqi(this.a.descendingSet());
        this.c = agqiVar2;
        agqiVar2.c = this;
        return agqiVar2;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ahng.ah(this.a.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ahng.ah(this.a.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ahng.ah(this.a.tailSet(obj, z));
    }
}
