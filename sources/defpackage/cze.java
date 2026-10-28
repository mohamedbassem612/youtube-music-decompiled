package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cze extends cva implements czk {
    public final long f;
    private final long g;

    public cze(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, i, i2, z, z2);
        this.f = j3;
        this.g = j == -1 ? -1L : j;
    }

    @Override // defpackage.cva, defpackage.cvz
    public final long a() {
        long j = this.f;
        return j == -9223372036854775807L ? this.d : j;
    }

    @Override // defpackage.cva, defpackage.cvz
    public final cvx b(long j) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.g;
            if (j3 != -1) {
                long j4 = this.a;
                long j5 = this.b;
                long j6 = j3 - j5;
                cwa cwaVar = new cwa(Math.max(0L, j2 - j(j5 + j4)), Math.max(j4, j6));
                return new cvx(cwaVar, cwaVar);
            }
        }
        return super.b(j);
    }

    @Override // defpackage.czk
    public final int e() {
        return this.c;
    }

    @Override // defpackage.czk
    public final long f() {
        return this.g;
    }

    @Override // defpackage.czk
    public final long g() {
        return this.a;
    }

    @Override // defpackage.czk
    public final long h(long j) {
        return j(j);
    }
}
