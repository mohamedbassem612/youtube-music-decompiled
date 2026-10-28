package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjk extends agjn {
    final /* synthetic */ agjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjk(agjo agjoVar) {
        super(agjoVar);
        this.a = agjoVar;
    }

    @Override // defpackage.agjn
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iX = aguu.X(obj);
        agjo agjoVar = this.a;
        int iD = agjoVar.d(obj, iX);
        if (iD == -1) {
            return false;
        }
        agjoVar.i(iD, iX);
        return true;
    }
}
