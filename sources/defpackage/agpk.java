package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpk extends agkz {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient agkj d;

    public agpk(agkj agkjVar, Object[] objArr, int i, int i2) {
        this.d = agkjVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        return g().b(objArr, i);
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // defpackage.agkz
    public final agke h() {
        return new agpj(this);
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
