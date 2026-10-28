package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fno extends fnp implements fnm {
    private final long e;
    private long f = Long.MIN_VALUE;
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;

    public fno(int i) {
        this.e = i;
    }

    @Override // defpackage.fnp
    public final float a(long j) {
        if (this.h == Long.MIN_VALUE) {
            this.f = j;
            this.h = j;
            this.g = j + (this.e * 1000000);
            return 0.0f;
        }
        long j2 = this.g;
        this.h = j;
        if (j >= j2) {
            return 1.0f;
        }
        long j3 = this.f;
        return (j - j3) / (j2 - j3);
    }

    @Override // defpackage.fnm
    public final boolean b() {
        return this.h >= this.g;
    }
}
