package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzq {
    private final long a;
    private final long b;

    public dzq(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && awrc.c(getClass(), obj.getClass())) {
            dzq dzqVar = (dzq) obj;
            if (dzqVar.a == this.a && dzqVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.ak(this.a) * 31) + a.ak(this.b);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
