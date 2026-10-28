package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aiic extends AbstractSet {
    final /* synthetic */ aiid a;
    private final Set b;

    public aiic(aiid aiidVar, Set set) {
        this.a = aiidVar;
        this.b = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aiib(this.a, this.b.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
