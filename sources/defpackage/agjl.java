package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjl extends agjn {
    final /* synthetic */ agjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjl(agjo agjoVar) {
        super(agjoVar);
        this.a = agjoVar;
    }

    @Override // defpackage.agjn
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iX = aguu.X(obj);
        agjo agjoVar = this.a;
        int iF = agjoVar.f(obj, iX);
        if (iF == -1) {
            return false;
        }
        agjoVar.j(iF, iX);
        return true;
    }
}
