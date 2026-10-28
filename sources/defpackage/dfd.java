package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfd implements cvz {
    public final long a;
    private final dfb b;
    private final int c;
    private final long d;
    private final long e;

    public dfd(dfb dfbVar, int i, long j, long j2) {
        this.b = dfbVar;
        this.c = i;
        this.d = j;
        long j3 = (j2 - j) / ((long) dfbVar.d);
        this.e = j3;
        this.a = e(j3);
    }

    private final long e(long j) {
        return bwp.C(((long) this.c) * j, 1000000L, this.b.c);
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        long j2 = this.c;
        long j3 = this.e;
        dfb dfbVar = this.b;
        long j4 = j3 - 1;
        long jT = bwp.t((((long) dfbVar.c) * j) / (j2 * 1000000), 0L, j4);
        long j5 = dfbVar.d;
        long jE = e(jT);
        long j6 = this.d;
        cwa cwaVar = new cwa(jE, (jT * j5) + j6);
        if (jE >= j || jT == j4) {
            return new cvx(cwaVar, cwaVar);
        }
        long j7 = jT + 1;
        return new cvx(cwaVar, new cwa(e(j7), j6 + (j5 * j7)));
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }
}
