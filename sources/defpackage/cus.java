package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cus implements cvz {
    public final cuv a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public cus(cuv cuvVar, long j, long j2, long j3, long j4, long j5) {
        this.a = cuvVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        cwa cwaVar = new cwa(j, cuu.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new cvx(cwaVar, cwaVar);
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
