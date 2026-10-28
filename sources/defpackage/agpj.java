package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agpj extends agke {
    final /* synthetic */ agpk a;

    public agpj(agpk agpkVar) {
        this.a = agpkVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        agpk agpkVar = this.a;
        ahno.W(i, agpkVar.c);
        Object[] objArr = agpkVar.a;
        int i2 = i << 1;
        int i3 = agpkVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
