package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agtn extends AbstractSet {
    final /* synthetic */ agtp a;

    public agtn(agtp agtpVar) {
        this.a = agtpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new agtm(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
