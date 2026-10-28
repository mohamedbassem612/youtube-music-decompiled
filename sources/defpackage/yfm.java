package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yfm {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public yfm(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfm) {
            yfm yfmVar = (yfm) obj;
            if (this.a == yfmVar.a && this.b == yfmVar.b && this.c == yfmVar.c && this.d == yfmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        int i = (int) ((j2 >>> 32) ^ j2);
        long j3 = (j >>> 32) ^ j;
        long j4 = this.c;
        long j5 = (j4 >>> 32) ^ j4;
        long j6 = this.b;
        return ((((((i ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ ((int) j5)) * 1000003) ^ ((int) j3);
    }

    public final String toString() {
        return "DeviceStorageStats{totalSpace=" + this.a + ", usableSpace=" + this.b + ", freeSpace=" + this.c + ", creationTimeInMs=" + this.d + '}';
    }

    public yfm() {
        throw null;
    }
}
