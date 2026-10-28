package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csw {
    public long a;
    private boolean d;
    private int f;
    private final csu i;
    private csv b = new csv();
    private csv c = new csv();
    private long e = -9223372036854775807L;
    private float g = -1.0f;
    private float h = -1.0f;

    public csw(csu csuVar) {
        this.i = csuVar;
    }

    private final void d() {
        boolean zE = this.b.e();
        float fB = zE ? (float) (1.0E9d / this.b.b()) : this.g;
        float f = this.h;
        if (fB != f) {
            if (fB != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (zE && this.b.b >= 5000000000L) {
                    f2 = 0.1f;
                }
                if (Math.abs(fB - f) < f2) {
                    return;
                }
            } else if (fB == -1.0f && this.f < 30) {
                return;
            }
            this.h = fB;
            this.i.a(fB);
        }
    }

    public final long a() {
        if (this.b.e()) {
            return this.b.b();
        }
        return -9223372036854775807L;
    }

    public final void b(float f) {
        this.g = f;
        this.b.d();
        this.c.d();
        this.d = false;
        this.e = -9223372036854775807L;
        this.f = 0;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    public final void c(long j) {
        if (j != this.e) {
            this.a++;
            this.b.c(j);
            if (this.b.e()) {
                this.d = false;
            } else if (this.e != -9223372036854775807L) {
                if (this.d) {
                    csv csvVar = this.c;
                    long j2 = csvVar.a;
                    if (j2 != 0 && csvVar.c[csv.a(j2 - 1)]) {
                        this.c.d();
                        this.c.c(this.e);
                    }
                } else {
                    this.c.d();
                    this.c.c(this.e);
                }
                this.d = true;
                this.c.c(j);
            }
            if (this.d && this.c.e()) {
                csv csvVar2 = this.b;
                this.b = this.c;
                this.c = csvVar2;
                this.d = false;
            }
            this.e = j;
            this.f = this.b.e() ? 0 : this.f + 1;
            d();
        }
    }
}
