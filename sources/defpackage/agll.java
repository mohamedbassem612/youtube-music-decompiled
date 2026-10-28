package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agll extends agke {
    final /* synthetic */ aglm a;

    public agll(aglm aglmVar) {
        this.a = aglmVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
