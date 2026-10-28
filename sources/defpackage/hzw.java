package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hzw {
    public final long a;
    public final long b;

    public hzw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzw) {
            hzw hzwVar = (hzw) obj;
            if (this.a == hzwVar.a && this.b == hzwVar.b) {
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
        return "VideoLengthAndLastPlaybackPosition{videoLengthSeconds=" + this.a + ", lastPlaybackPositionSeconds=" + this.b + '}';
    }

    public hzw() {
        throw null;
    }
}
