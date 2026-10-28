package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agko extends agjw {
    private static final long serialVersionUID = 0;
    final agkp a;

    public agko(agkp agkpVar) {
        this.a = agkpVar;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.v(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return new agkm(this.a);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
