package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahvv {
    public final long a;
    public final long b;

    public ahvv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvv) {
            ahvv ahvvVar = (ahvv) obj;
            if (this.a == ahvvVar.a && this.b == ahvvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "LogReport{timestampMillis=" + this.a + ", size=" + this.b + '}';
    }

    public ahvv() {
        throw null;
    }
}
