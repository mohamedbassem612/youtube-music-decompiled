package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rz {
    private final String c;
    public String a = "";
    private int d = 2;
    public boolean b = false;

    public rz(String str) {
        azs.l(str);
        this.c = str;
    }

    public final sa a() {
        String str = this.a;
        int i = this.d;
        boolean z = this.b;
        str.getClass();
        return new sa(new vg(this.c, 4, i, null, null, null, null, null, str, null, z));
    }

    public final void b(int i) {
        azs.i(i, 1, 3, "cardinality");
        this.d = i;
    }
}
