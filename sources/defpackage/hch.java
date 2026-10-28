package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hch {
    public final anuk a;
    public final String b;

    public hch(anuk anukVar, String str) {
        this.a = anukVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hch) {
            hch hchVar = (hch) obj;
            if (this.a.equals(hchVar.a)) {
                String str = this.b;
                if (str == null) {
                    if (hchVar.b == null) {
                        return true;
                    }
                } else if (str.equals(hchVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MusicPlaylistModel{playlist=" + String.valueOf(this.a) + ", firstTrackAlbumId=" + this.b + '}';
    }

    public hch() {
        throw null;
    }
}
