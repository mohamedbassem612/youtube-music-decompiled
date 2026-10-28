package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agle extends agke {
    final /* synthetic */ aglf a;

    public agle(aglf aglfVar) {
        this.a = aglfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        aglh aglhVar = this.a.a;
        return new AbstractMap.SimpleImmutableEntry(aglhVar.c.d.get(i), aglhVar.d.get(i));
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
