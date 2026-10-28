package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sj {
    private final String c;
    public String a = "";
    private int d = 2;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    public int b = 0;

    public sj(String str) {
        azs.l(str);
        this.c = str;
    }

    public final sk a() {
        int i = this.f;
        int i2 = this.e;
        if (i == 0) {
            azs.h(i2 == 0, "Cannot set TOKENIZER_TYPE_NONE with an indexing type other than INDEXING_TYPE_NONE.");
        } else {
            azs.h(i2 != 0, "Cannot set TOKENIZER_TYPE_PLAIN with INDEXING_TYPE_NONE.");
        }
        if (this.b != 0) {
            azs.h(1 == this.g, "Cannot set delete propagation without setting JOINABLE_VALUE_TYPE_QUALIFIED_ID.");
        }
        vf vfVar = new vf(this.e, this.f);
        ve veVar = new ve(this.g, this.b);
        String str = this.c;
        String str2 = this.a;
        int i3 = this.d;
        str2.getClass();
        return new sk(new vg(str, 1, i3, null, vfVar, null, null, veVar, str2, null, false));
    }

    public final void b(int i) {
        azs.i(i, 1, 3, "cardinality");
        this.d = i;
    }

    public final void c(int i) {
        azs.i(i, 0, 2, "indexingType");
        this.e = i;
    }

    public final void d(int i) {
        azs.i(i, 0, 1, "joinableValueType");
        this.g = i;
    }

    public final void e(int i) {
        azs.i(i, 0, 3, "tokenizerType");
        this.f = i;
    }
}
