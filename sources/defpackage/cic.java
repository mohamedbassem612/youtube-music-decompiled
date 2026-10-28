package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cic {
    public final ciy a;
    public final cim b;
    public final cia c;
    public final long d;
    public final long e;
    final cpf f;

    public cic(long j, ciy ciyVar, cim cimVar, cpf cpfVar, long j2, cia ciaVar) {
        this.d = j;
        this.a = ciyVar;
        this.b = cimVar;
        this.e = j2;
        this.f = cpfVar;
        this.c = ciaVar;
    }

    public final long a(long j) {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.c(this.d, j) + this.e;
    }

    public final long b() {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.d() + this.e;
    }

    public final long c(long j) {
        cia ciaVar = this.c;
        long jA = a(j);
        ciaVar.getClass();
        return (jA + ciaVar.a(this.d, j)) - 1;
    }

    public final long d() {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.f(this.d);
    }

    public final long e(long j) {
        cia ciaVar = this.c;
        long jG = g(j);
        ciaVar.getClass();
        return jG + ciaVar.b(j - this.e, this.d);
    }

    public final long f(long j) {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.g(j, this.d) + this.e;
    }

    public final long g(long j) {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.h(j - this.e);
    }

    public final civ h(long j) {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.i(j - this.e);
    }

    public final boolean i(long j, long j2) {
        cia ciaVar = this.c;
        ciaVar.getClass();
        return ciaVar.j() || j2 == -9223372036854775807L || e(j) <= j2;
    }
}
