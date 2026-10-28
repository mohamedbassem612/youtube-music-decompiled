package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekt implements ekn {
    public final String a;
    public final eka b;
    public final ekk c;
    public final eka d;
    public final eka e;
    public final eka f;
    public final eka g;
    public final eka h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public ekt(String str, int i, eka ekaVar, ekk ekkVar, eka ekaVar2, eka ekaVar3, eka ekaVar4, eka ekaVar5, eka ekaVar6, boolean z, boolean z2) {
        this.a = str;
        this.k = i;
        this.b = ekaVar;
        this.c = ekkVar;
        this.d = ekaVar2;
        this.e = ekaVar3;
        this.f = ekaVar4;
        this.g = ekaVar5;
        this.h = ekaVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eil(ehmVar, eleVar, this);
    }
}
