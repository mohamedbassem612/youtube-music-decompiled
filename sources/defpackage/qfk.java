package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfk {
    public final long a;
    private final long b;

    public qfk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qfk) {
            qfk qfkVar = (qfk) obj;
            if (this.a == qfkVar.a && this.b == qfkVar.b) {
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
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + '}';
    }

    public qfk() {
        throw null;
    }
}
