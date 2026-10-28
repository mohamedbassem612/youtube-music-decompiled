package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgp extends ahgo {
    private final long[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgp(ahtv ahtvVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        axlj axljVar = (axlj) ahtvVar.a;
        ahgv.f(jArr2, (long[]) axljVar.b, (long[]) axljVar.c);
        long[] jArr3 = this.b;
        axlj axljVar2 = (axlj) ahtvVar.a;
        ahgv.e(jArr3, (long[]) axljVar2.b, (long[]) axljVar2.c);
        System.arraycopy(((axlj) ahtvVar.a).a, 0, jArr, 0, 10);
        ahgv.a(this.c, (long[]) ahtvVar.b, ahgs.b);
    }

    @Override // defpackage.ahgo
    public final void b(long[] jArr, long[] jArr2) {
        ahgv.a(jArr, jArr2, this.d);
    }
}
