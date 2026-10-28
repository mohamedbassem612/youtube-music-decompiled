package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agpz extends agqh {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public agpz(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.agqh
    public final int a() {
        return Math.min(d(this.a), d(this.b));
    }

    @Override // defpackage.agqh
    public final int b() {
        return 0;
    }

    @Override // defpackage.agqh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final agqr iterator() {
        return new agpy(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
