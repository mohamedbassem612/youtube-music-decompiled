package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekv implements ekn {
    public final String a;
    public final eka b;
    public final eka c;
    public final ekj d;
    public final boolean e;

    public ekv(String str, eka ekaVar, eka ekaVar2, ekj ekjVar, boolean z) {
        this.a = str;
        this.b = ekaVar;
        this.c = ekaVar2;
        this.d = ekjVar;
        this.e = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new ein(ehmVar, eleVar, this);
    }
}
