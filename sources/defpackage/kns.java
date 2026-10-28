package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kns extends kno {
    public final kow b;

    public kns(kow kowVar, kjc kjcVar) {
        super(4, kjcVar);
        this.b = kowVar;
    }

    @Override // defpackage.knn
    public final int a(kol kolVar) {
        hed hedVar = (hed) kolVar.e.get(this.b);
        if (hedVar != null) {
            return ((kpc) hedVar.b).d;
        }
        return -1;
    }

    @Override // defpackage.knn
    public final boolean c(kol kolVar) {
        hed hedVar = (hed) kolVar.e.get(this.b);
        return hedVar != null && ((kpc) hedVar.b).c;
    }

    @Override // defpackage.knn
    public final klq[] d(kol kolVar) {
        hed hedVar = (hed) kolVar.e.get(this.b);
        if (hedVar == null) {
            return null;
        }
        return ((kpc) hedVar.b).b;
    }

    @Override // defpackage.kno
    public final void e(kol kolVar) {
        hed hedVar = (hed) kolVar.e.remove(this.b);
        if (hedVar == null) {
            this.a.x(Boolean.FALSE);
            return;
        }
        ((kpd) ((hhc) hedVar.c).a).b.a(kolVar.b, this.a);
        ((kpc) hedVar.b).a.b = null;
    }

    @Override // defpackage.kno, defpackage.knt
    public final /* bridge */ /* synthetic */ void i(khn khnVar, boolean z) {
    }
}
