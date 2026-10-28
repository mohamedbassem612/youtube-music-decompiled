package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqv {
    public final int a;
    public final coy[] b;
    public final int[] c;
    public final int[][][] d;
    public final coy e;
    private final int[] f;

    public cqv(int[] iArr, coy[] coyVarArr, int[] iArr2, int[][][] iArr3, coy coyVar) {
        this.f = iArr;
        this.b = coyVarArr;
        this.d = iArr3;
        this.c = iArr2;
        this.e = coyVar;
        this.a = iArr.length;
    }

    public final int a(int i) {
        return this.f[i];
    }

    public final int b(int i, int i2, int i3) {
        return this.d[i][i2][i3] & 7;
    }

    public final coy c(int i) {
        return this.b[i];
    }
}
