package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aglm extends agkz {
    public abstract Object a(int i);

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        return g().b(objArr, i);
    }

    @Override // defpackage.agkz
    public final agke h() {
        return new agll(this);
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
