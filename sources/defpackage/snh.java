package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class snh {
    public final long a;
    public final long b;

    public snh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a(long j) {
        return this.a <= j && this.b >= j;
    }

    public final String toString() {
        return "[" + this.a + ", " + this.b + ']';
    }
}
