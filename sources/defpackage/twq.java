package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twq {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;

    public twq(long j, long j2, long j3, long j4, double d) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        if (d < 0.99d) {
            throw new IllegalArgumentException();
        }
        this.e = d;
    }
}
