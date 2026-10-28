package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvy implements cvz, czk {
    private final long a;
    private final cvx b;

    public cvy(long j, long j2) {
        this.a = j;
        cwa cwaVar = j2 == 0 ? cwa.a : new cwa(0L, j2);
        this.b = new cvx(cwaVar, cwaVar);
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        return this.b;
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return false;
    }

    @Override // defpackage.czk
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.czk
    public final long f() {
        return -1L;
    }

    @Override // defpackage.czk
    public final long g() {
        return 0L;
    }

    @Override // defpackage.czk
    public final long h(long j) {
        return 0L;
    }
}
