package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cib implements cia {
    private final cuz a;
    private final long b;

    public cib(cuz cuzVar, long j) {
        this.a = cuzVar;
        this.b = j;
    }

    @Override // defpackage.cia
    public final long a(long j, long j2) {
        return this.a.a;
    }

    @Override // defpackage.cia
    public final long b(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // defpackage.cia
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.cia
    public final long d() {
        return 0L;
    }

    @Override // defpackage.cia
    public final long e(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.cia
    public final long f(long j) {
        return this.a.a;
    }

    @Override // defpackage.cia
    public final long g(long j, long j2) {
        return this.a.e(j + this.b);
    }

    @Override // defpackage.cia
    public final long h(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // defpackage.cia
    public final civ i(long j) {
        cuz cuzVar = this.a;
        int i = (int) j;
        return new civ(null, cuzVar.c[i], cuzVar.b[i]);
    }

    @Override // defpackage.cia
    public final boolean j() {
        return true;
    }
}
