package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utc {
    public final Float a;
    public final Boolean b;
    private final long c;

    public utc(long j, Float f, Boolean bool) {
        this.c = j;
        this.a = f;
        this.b = bool;
    }

    public static /* synthetic */ utc a(utc utcVar, Float f, Boolean bool, int i) {
        long j = (i & 1) != 0 ? utcVar.c : 0L;
        if ((i & 2) != 0) {
            f = utcVar.a;
        }
        if ((i & 4) != 0) {
            bool = utcVar.b;
        }
        return new utc(j, f, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof utc) {
            utc utcVar = (utc) obj;
            if (this.c == utcVar.c && awrc.c(this.a, utcVar.a) && awrc.c(this.b, utcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        long j = this.c;
        Boolean bool = this.b;
        return (((a.ak(j) * 31) + iHashCode) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TransientSegmentDecoration(segmentId=" + this.c + ", overrideOpacity=" + this.a + ", overrideLooping=" + this.b + ')';
    }
}
