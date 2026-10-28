package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hny {
    public final String a;
    public final allp b;
    public final int c;
    public final boolean d;

    public hny(String str, allp allpVar, int i, boolean z) {
        this.a = str;
        this.b = allpVar;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hny) {
            hny hnyVar = (hny) obj;
            if (this.a.equals(hnyVar.a) && this.b.equals(hnyVar.b) && this.c == hnyVar.c && this.d == hnyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "AutoOfflinePlaylistParameters{playlistId=" + this.a + ", autoOfflinePlaylistCommandData=" + String.valueOf(this.b) + ", songLimit=" + this.c + ", isSmartDownloaded=" + this.d + '}';
    }

    public hny() {
        throw null;
    }
}
