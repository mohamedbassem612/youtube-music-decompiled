package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amx implements and {
    private final amz a;
    private final int b;
    private final int c;

    public amx(amz amzVar, int i, int i2) {
        this.a = amzVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.amz
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.amz
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.amz
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.amz
    public final int d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.and
    public final anj e(long j) {
        int i = (int) (3 & j);
        int i2 = this.c;
        int i3 = this.b;
        if (i2 == 1) {
            amz amzVar = this.a;
            int i4 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
            return new amy(i3 == 2 ? amzVar.b(apd.a(j)) : amzVar.d(apd.a(j)), (((int) (j >> (i4 + 46))) & ((1 << (18 - i4)) + (-1))) != 0 ? apd.a(j) : 32767);
        }
        amz amzVar2 = this.a;
        return new amy((((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) + (-1))) != 0 ? apd.b(j) : 32767, i3 == 2 ? amzVar2.a(apd.b(j)) : amzVar2.c(apd.b(j)));
    }
}
