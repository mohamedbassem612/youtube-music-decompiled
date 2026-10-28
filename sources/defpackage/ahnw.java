package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahnw {
    private final long a;
    private final long b;
    private final long c;

    public ahnw(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahnw) {
            ahnw ahnwVar = (ahnw) obj;
            if (this.a == ahnwVar.a && this.b == ahnwVar.b && this.c == ahnwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) ((j2 >>> 32) ^ j2);
        long j3 = (j >>> 32) ^ j;
        long j4 = this.b;
        return ((((i ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) j3);
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + '}';
    }

    public ahnw() {
        throw null;
    }
}
