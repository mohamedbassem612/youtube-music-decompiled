package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvt implements cvz {
    public long a;
    private final zh b;
    private final zh c;

    public cvt(long[] jArr, long[] jArr2, long j) {
        zh zhVar;
        zh zhVar2;
        int length = jArr.length;
        int length2 = jArr2.length;
        ahno.F(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            zhVar = new zh(length2);
            this.b = zhVar;
            zhVar2 = new zh(length2);
            this.c = zhVar2;
        } else {
            int i = length2 + 1;
            zhVar = new zh(i);
            this.b = zhVar;
            zhVar2 = new zh(i);
            this.c = zhVar2;
            zhVar.b(0L);
            zhVar2.b(0L);
        }
        zhVar.c(jArr);
        zhVar2.c(jArr2);
        this.a = j;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        zh zhVar = this.c;
        if (zhVar.a == 0) {
            cwa cwaVar = cwa.a;
            return new cvx(cwaVar, cwaVar);
        }
        int iAt = bwp.at(zhVar, j);
        long jA = zhVar.a(iAt);
        zh zhVar2 = this.b;
        cwa cwaVar2 = new cwa(jA, zhVar2.a(iAt));
        if (cwaVar2.b == j || iAt == zhVar.a - 1) {
            return new cvx(cwaVar2, cwaVar2);
        }
        int i = iAt + 1;
        return new cvx(cwaVar2, new cwa(zhVar.a(i), zhVar2.a(i)));
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return this.c.a > 0;
    }

    public final long e(long j) {
        zh zhVar = this.c;
        if (zhVar.a == 0) {
            return -9223372036854775807L;
        }
        return zhVar.a(bwp.at(this.b, j));
    }

    public final void f(long j, long j2) {
        zh zhVar = this.c;
        if (zhVar.a == 0 && j > 0) {
            this.b.b(0L);
            zhVar.b(0L);
        }
        this.b.b(j2);
        zhVar.b(j);
    }

    public final boolean g(long j) {
        zh zhVar = this.c;
        int i = zhVar.a;
        return i != 0 && j - zhVar.a(i + (-1)) < 100000;
    }
}
