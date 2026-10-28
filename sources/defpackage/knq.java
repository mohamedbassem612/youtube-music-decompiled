package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knq extends kno {
    public final hed b;

    public knq(hed hedVar, kjc kjcVar) {
        super(3, kjcVar);
        this.b = hedVar;
    }

    @Override // defpackage.knn
    public final int a(kol kolVar) {
        return ((kpc) this.b.b).d;
    }

    @Override // defpackage.knn
    public final boolean c(kol kolVar) {
        return ((kpc) this.b.b).c;
    }

    @Override // defpackage.knn
    public final klq[] d(kol kolVar) {
        return ((kpc) this.b.b).b;
    }

    @Override // defpackage.kno
    public final void e(kol kolVar) {
        hed hedVar = this.b;
        kpc kpcVar = (kpc) hedVar.b;
        kpcVar.b(kolVar.b, this.a);
        kow kowVarA = kpcVar.a();
        if (kowVarA != null) {
            kolVar.e.put(kowVarA, hedVar);
        }
    }

    @Override // defpackage.kno, defpackage.knt
    public final /* bridge */ /* synthetic */ void i(khn khnVar, boolean z) {
    }
}
