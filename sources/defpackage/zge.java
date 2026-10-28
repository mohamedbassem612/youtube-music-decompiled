package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zge {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;

    public zge(long j, long j2, long j3, long j4, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zge) {
            zge zgeVar = (zge) obj;
            if (this.a == zgeVar.a && this.b == zgeVar.b && this.c == zgeVar.c && this.d == zgeVar.d && this.e.equals(zgeVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        int i = (int) ((j2 >>> 32) ^ j2);
        String str = this.e;
        long j3 = (j >>> 32) ^ j;
        long j4 = this.c;
        long j5 = (j4 >>> 32) ^ j4;
        long j6 = this.b;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ ((int) j5)) * 1000003) ^ ((int) j3)) * 1000003) ^ str.hashCode();
    }

    public final String toString() {
        return "CacheMetrics{currentSizeBytes=" + this.a + ", maxSizeBytes=" + this.b + ", freeDiskSpace=" + this.c + ", totalDiskSpace=" + this.d + ", details=" + this.e + '}';
    }

    public zge() {
        throw null;
    }
}
