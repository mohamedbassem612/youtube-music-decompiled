package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hsa {
    public final agkj a;
    public final long b;

    public hsa(agkj agkjVar, long j) {
        this.a = agkjVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsa) {
            hsa hsaVar = (hsa) obj;
            if (aguu.q(this.a, hsaVar.a) && this.b == hsaVar.b) {
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
        return "PlaylistRefreshResultsAndParameters{results=" + String.valueOf(this.a) + ", nextPlaylistAutoSyncIntervalSecs=" + this.b + '}';
    }

    public hsa() {
        throw null;
    }
}
