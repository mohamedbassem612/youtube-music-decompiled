package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxq {
    public long a;
    public int b;

    public yxq() {
        this.a = -1L;
        this.b = -1;
    }

    public final void a(long j) {
        boolean z = true;
        if (j < 0 && j != -1) {
            z = false;
        }
        zkf.a(z);
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public final void b(int i) {
        zkf.a((i ^ (-1)) >>> 31);
        zkf.a(((this.a > 0L ? 1 : (this.a == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        this.b = (int) (((this.a / 1000000.0d) * ((double) i)) / 8.0d);
    }

    public final yvt c() {
        return new yvt(this.a, this.b);
    }

    public yxq(long j) {
        this.a = j;
        this.b = 0;
    }
}
