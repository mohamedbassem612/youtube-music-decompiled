package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class bmt {
    public final long a;
    public final long b;

    public bmt(long j, long j2) {
        this.a = j2 == 0 ? 0L : j;
        this.b = j2 == 0 ? 1L : j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        return sb.toString();
    }
}
