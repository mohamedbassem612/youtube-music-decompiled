package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eku implements ekn {
    public final String a;
    public final ekk b;
    public final ekk c;
    public final eka d;
    public final boolean e;

    public eku(String str, ekk ekkVar, ekk ekkVar2, eka ekaVar, boolean z) {
        this.a = str;
        this.b = ekkVar;
        this.c = ekkVar2;
        this.d = ekaVar;
        this.e = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eim(ehmVar, eleVar, this);
    }

    public final String toString() {
        ekk ekkVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(ekkVar) + '}';
    }
}
