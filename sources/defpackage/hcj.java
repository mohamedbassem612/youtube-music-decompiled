package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcj {
    public final anuk a;
    public final List b;

    public hcj(anuk anukVar, List list) {
        this.a = anukVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcj) {
            hcj hcjVar = (hcj) obj;
            if (this.a.equals(hcjVar.a) && this.b.equals(hcjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        List list = this.b;
        return "PlaylistAddToOptionModel{playlistEntity=" + String.valueOf(this.a) + ", contentUrisToAdd=" + String.valueOf(list) + '}';
    }

    public hcj() {
        throw null;
    }
}
