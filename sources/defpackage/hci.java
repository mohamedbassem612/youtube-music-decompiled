package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hci {
    public final anyx a;
    public final String b;

    public hci(anyx anyxVar, String str) {
        this.a = anyxVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hci) {
            hci hciVar = (hci) obj;
            if (this.a.equals(hciVar.a) && this.b.equals(hciVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MusicPlaylistTrackModel{track=" + String.valueOf(this.a) + ", memberId=" + this.b + '}';
    }

    public hci() {
        throw null;
    }
}
