package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acgv {
    public final String a;
    public final long b;
    public final long c;

    public acgv(String str, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acgv) {
            acgv acgvVar = (acgv) obj;
            if (awrc.c(this.a, acgvVar.a) && this.b == acgvVar.b && this.c == acgvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.ak(this.b)) * 31) + a.ak(this.c);
    }

    public final String toString() {
        return "PdsRestoredPlaybackInfo(videoId=" + this.a + ", startPositionSeconds=" + this.b + ", lastUpdatedClientTimestampMs=" + this.c + ')';
    }
}
