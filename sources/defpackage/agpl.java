package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpl extends agkz {
    public final transient agke a;
    private final transient agkj b;

    public agpl(agkj agkjVar, agke agkeVar) {
        this.b = agkjVar;
        this.a = agkeVar;
    }

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        return this.a.b(objArr, i);
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.get(obj) != null;
    }

    @Override // defpackage.agkz, defpackage.agjw
    public final agke g() {
        return this.a;
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return this.a.listIterator(0);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
