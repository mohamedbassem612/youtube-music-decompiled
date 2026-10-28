package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iuz {
    public final long a;
    public final long b;
    public final long c;
    private final int d;

    public iuz(long j, long j2, long j3, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iuz) {
            iuz iuzVar = (iuz) obj;
            if (this.a == iuzVar.a && this.b == iuzVar.b && this.c == iuzVar.c && this.d == iuzVar.d) {
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
        return ((((((i ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) j3)) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "SideloadedPlaylistTrack{playlistTrackId=" + this.a + ", playlistId=" + this.b + ", trackId=" + this.c + ", position=" + this.d + '}';
    }

    public iuz() {
        throw null;
    }
}
