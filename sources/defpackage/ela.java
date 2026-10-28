package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ela implements ekn {
    public final String a;
    public final ekg b;
    public final boolean c;
    private final int d;

    public ela(String str, int i, ekg ekgVar, boolean z) {
        this.a = str;
        this.d = i;
        this.b = ekgVar;
        this.c = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eip(ehmVar, eleVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.d + '}';
    }
}
