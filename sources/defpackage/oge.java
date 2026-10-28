package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oge {
    private long a = 0;
    private long b;
    private long c;
    private long d;

    final synchronized long a() {
        long j;
        j = this.d;
        this.d = 0L;
        return j;
    }

    public final synchronized long b(int i) {
        long j;
        try {
            if (i != 1) {
                j = i != 2 ? this.c : this.b;
            } else {
                j = this.a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized long c() {
        return this.d;
    }

    public final synchronized void d(long j) {
        this.a += j;
        this.d += j;
        long j2 = 0;
        if (j > 0) {
            j2 = this.b + j;
            this.b = j2;
        } else {
            this.b = 0L;
        }
        this.c = Math.max(this.c, j2);
    }

    public final synchronized void e() {
        this.b = 0L;
    }

    public final synchronized void f() {
        this.d = 0L;
    }
}
