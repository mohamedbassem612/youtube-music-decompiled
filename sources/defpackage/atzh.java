package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class atzh implements atzb {
    private final atzb a;
    private final long b;
    private final long c;
    private long d;

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    public atzh(atzb atzbVar, int i) {
        ahno.G(i > 0, "Chunk granularity must be greater than 0.");
        long j = i;
        ahno.G((j > atzbVar.c() ? 1 : (j == atzbVar.c() ? 0 : -1)) >>> 31, "Chunk granularity must be smaller than the read ahead limit.");
        long jD = atzbVar.d();
        long jE = atzbVar.e();
        if (jE < 0) {
            while (atzbVar.i() && atzbVar.d() - atzbVar.b() < atzbVar.c()) {
                atzbVar.f(atzbVar.c());
            }
            jE = atzbVar.d();
            atzbVar.h();
            atzbVar.f(jD - atzbVar.b());
        } else {
            long jB = atzbVar.b() + atzbVar.c();
            if (jB > 0 && jB < jE) {
                jE = jB;
            }
        }
        long j2 = ((jE - jD) / j) * j;
        ahno.F(j2 <= atzbVar.c() - (atzbVar.d() - atzbVar.b()));
        this.a = atzbVar;
        this.b = atzbVar.d();
        this.c = j2;
    }

    @Override // defpackage.atzb
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int iA;
        ahno.G(65536 - i >= i2, "Cannot read into a buffer smaller than given length");
        int iMin = (int) Math.min(i2, this.c - this.d);
        long j = this.b;
        long j2 = this.d + j;
        atzb atzbVar = this.a;
        if (j2 != atzbVar.d()) {
            atzbVar.h();
            for (long jB = (j - atzbVar.b()) + this.d; jB > 0; jB -= atzbVar.f(jB)) {
            }
        }
        iA = atzbVar.a(bArr, i, iMin);
        this.d += (long) iA;
        return iA;
    }

    @Override // defpackage.atzb
    public final synchronized long b() {
        throw null;
    }

    @Override // defpackage.atzb
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.atzb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.atzb
    public final synchronized long d() {
        return this.d;
    }

    @Override // defpackage.atzb
    public final synchronized long e() {
        return this.c;
    }

    @Override // defpackage.atzb
    public final synchronized long f(long j) {
        throw null;
    }

    @Override // defpackage.atzb
    public final synchronized void g() {
    }

    @Override // defpackage.atzb
    public final synchronized void h() {
        throw null;
    }

    @Override // defpackage.atzb
    public final synchronized boolean i() {
        return this.d < this.c;
    }
}
