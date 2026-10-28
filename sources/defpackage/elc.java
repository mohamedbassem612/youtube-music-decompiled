package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elc implements ekn {
    public final eka a;
    public final eka b;
    public final eka c;
    public final boolean d;
    public final int e;

    public elc(int i, eka ekaVar, eka ekaVar2, eka ekaVar3, boolean z) {
        this.e = i;
        this.a = ekaVar;
        this.b = ekaVar2;
        this.c = ekaVar3;
        this.d = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eir(eleVar, this);
    }

    public final String toString() {
        eka ekaVar = this.c;
        eka ekaVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(ekaVar2) + ", offset: " + String.valueOf(ekaVar) + '}';
    }
}
