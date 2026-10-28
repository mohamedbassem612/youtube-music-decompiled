package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class huu {
    public final String a;
    public final Optional b;

    public huu(String str, Optional optional) {
        this.a = str;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huu) {
            huu huuVar = (huu) obj;
            if (this.a.equals(huuVar.a) && this.b.equals(huuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PlaylistSyncPlaylistConfig{playlistId=" + this.a + ", maxSize=" + this.b.toString() + '}';
    }

    public huu() {
        throw null;
    }
}
