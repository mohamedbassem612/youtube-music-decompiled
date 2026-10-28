package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agje extends agjd implements SortedSet {
    protected agje() {
    }

    @Override // defpackage.agjd
    protected /* bridge */ /* synthetic */ Set c() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return d().comparator();
    }

    protected abstract SortedSet d();

    @Override // java.util.SortedSet
    public final Object first() {
        return d().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return d().headSet(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return d().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return d().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return d().tailSet(obj);
    }
}
