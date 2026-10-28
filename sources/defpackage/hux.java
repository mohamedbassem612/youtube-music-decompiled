package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hux {
    public final Optional a;

    public hux(Optional optional) {
        this.a = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hux) {
            return this.a.equals(((hux) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "PlaylistSyncResult{maxCheckInSecondsForPlaylists=" + this.a.toString() + '}';
    }

    public hux() {
        throw null;
    }
}
