package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agkb extends agke {
    private final transient agke a;

    public agkb(agke agkeVar) {
        this.a = agkeVar;
    }

    @Override // defpackage.agke
    public final agke a() {
        return this.a;
    }

    @Override // defpackage.agke
    /* JADX INFO: renamed from: c */
    public final agke subList(int i, int i2) {
        ahno.N(i, i2, size());
        return this.a.subList(size() - i2, size() - i).a();
    }

    @Override // defpackage.agke, defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ahno.W(i, size());
        return this.a.get((size() - 1) - i);
    }

    @Override // defpackage.agke, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.agke, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return (size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.agke, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
