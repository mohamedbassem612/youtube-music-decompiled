package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpo extends aglm {
    final /* synthetic */ agpq a;

    public agpo(agpq agpqVar) {
        this.a = agpqVar;
    }

    @Override // defpackage.aglm
    public final Object a(int i) {
        return this.a.b.g(i);
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }

    @Override // defpackage.aglm, defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
