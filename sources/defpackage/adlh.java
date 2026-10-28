package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adlh {
    private static final adlh f = new adlh(0, 1, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public adlh(int i, int i2, int i3, int i4, int i5) {
        ahno.F((i ^ (-1)) >>> 31);
        ahno.F(i2 > i);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static int a(int i, int i2, int i3) {
        long j = i2;
        return (int) ((((((long) i) << 1) * ((long) i3)) + j) / (j << 1));
    }

    public static int b(int i, int i2, int i3) {
        if (i == i2 - 1) {
            return 0;
        }
        return (int) ((((i2 - i) - 1) / i2) * i3);
    }

    public static int c(int i, int i2, int i3) {
        return (int) ((i / i2) * i3);
    }

    public static final adlh d(adly adlyVar) {
        Object objC = adlyVar.c("rowData");
        return objC instanceof adlh ? (adlh) objC : f;
    }
}
