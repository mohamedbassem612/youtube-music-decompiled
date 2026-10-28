package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isx {
    public final String a;
    public final agke b;

    public isx(String str, agke agkeVar) {
        this.a = str;
        this.b = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isx) {
            isx isxVar = (isx) obj;
            if (this.a.equals(isxVar.a) && aguu.v(this.b, isxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PlaylistFileMetadata{playlistName=" + this.a + ", trackList=" + String.valueOf(this.b) + '}';
    }

    public isx() {
        throw null;
    }
}
