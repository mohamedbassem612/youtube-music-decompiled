package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekm implements ekn {
    public final String a;
    public final ekk b;
    public final eke c;
    public final boolean d;
    public final boolean e;

    public ekm(String str, ekk ekkVar, eke ekeVar, boolean z, boolean z2) {
        this.a = str;
        this.b = ekkVar;
        this.c = ekeVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eid(ehmVar, eleVar, this);
    }
}
