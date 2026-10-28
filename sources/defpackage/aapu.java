package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aapu {
    public final String a;
    public final long b;

    public aapu(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aapu) {
            aapu aapuVar = (aapu) obj;
            if (this.a.equals(aapuVar.a) && this.b == aapuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "VideoLastUpdatedPair{videoId=" + this.a + ", lastUpdatedTimestampMs=" + this.b + '}';
    }

    public aapu() {
        throw null;
    }
}
