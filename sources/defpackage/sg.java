package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sg {
    private final String c;
    public String a = "";
    private int d = 2;
    private int e = 0;
    public boolean b = false;

    public sg(String str) {
        azs.l(str);
        this.c = str;
    }

    public final sh a() {
        String str = this.a;
        int i = this.d;
        int i2 = this.e;
        boolean z = this.b;
        vd vdVar = new vd(i2);
        str.getClass();
        return new sh(new vg(this.c, 2, i, null, null, null, vdVar, null, str, null, z));
    }

    public final void b(int i) {
        azs.i(i, 1, 3, "cardinality");
        this.d = i;
    }

    public final void c(int i) {
        azs.i(i, 0, 1, "indexingType");
        this.e = i;
    }
}
