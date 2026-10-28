package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdd {
    public final tfq a;
    public final xxj[] b;
    private final byd c;
    private final zjr d;
    private final int e;
    private final int f;
    private final ywn g;

    public zdd(byd bydVar, zjr zjrVar, int i, int i2, xxj[] xxjVarArr, tfq tfqVar, ywn ywnVar) {
        this.c = bydVar;
        this.d = zjrVar;
        this.e = i;
        this.f = i2;
        this.b = xxjVarArr;
        this.a = tfqVar;
        this.g = ywnVar;
    }

    public final cpl a(cio cioVar, wgs[] wgsVarArr, int[] iArr, cqs cqsVar, int i, bzg bzgVar, wiu wiuVar, yxr yxrVar) {
        bye byeVarA = this.c.a();
        if (bzgVar != null) {
            byeVarA.e(bzgVar);
        }
        int i2 = i == 1 ? this.f : this.e;
        ywn ywnVar = this.g;
        return new zdf(cioVar, wgsVarArr, this.d, iArr, cqsVar, i, byeVarA, i2, this.b, wiuVar, this.a, ywnVar, yxrVar);
    }
}
