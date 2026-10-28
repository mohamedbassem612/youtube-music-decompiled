package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agqj extends agkz {
    final transient Object a;

    public agqj(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.agkz, defpackage.agjw
    public final agke g() {
        Object[] objArr = {this.a};
        aguu.j(objArr, 1);
        return new agpi(objArr, 1);
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return new agly(this.a);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + ']';
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
