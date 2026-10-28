package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdf {
    public static final mdf a = new mdf(0, 0, 0);
    public final long b;
    public final long c;
    public final long d;

    public mdf(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mdf) {
            mdf mdfVar = (mdf) obj;
            if (this.b == mdfVar.b && this.c == mdfVar.c && this.d == mdfVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.b;
        int i = (int) ((j2 >>> 32) ^ j2);
        long j3 = (j >>> 32) ^ j;
        long j4 = this.c;
        return ((((i ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) j3);
    }

    public final String toString() {
        return "SchedStat{cpuTimeNs=" + this.b + ", runDelayNs=" + this.c + ", runCount=" + this.d + '}';
    }

    public mdf() {
        throw null;
    }
}
