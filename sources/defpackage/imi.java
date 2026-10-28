package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class imi {
    public final String a;
    public final Optional b;
    public final String c;
    public final int d;

    public imi(int i, String str, Optional optional, String str2) {
        this.d = i;
        this.a = str;
        this.b = optional;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imi) {
            imi imiVar = (imi) obj;
            int i = this.d;
            int i2 = imiVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a.equals(imiVar.a) && this.b.equals(imiVar.b)) {
                String str = this.c;
                if (str == null) {
                    if (imiVar.c == null) {
                        return true;
                    }
                } else if (str.equals(imiVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bj(i);
        int iHashCode = ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i == 1) {
            str = "ALBUM_DETAIL_PAGE";
        } else if (i == 2) {
            str = "PLAYLIST_DETAIL_PAGE";
        } else if (i == 3) {
            str = "ARTIST_DETAIL_PAGE";
        } else if (i != 4) {
            str = i != 5 ? "null" : "MIXED_ENTITY_LIST";
        } else {
            str = "TRACK_LIST";
        }
        String str2 = this.a;
        Optional optional = this.b;
        String str3 = this.c;
        return "ContainerContext{containerType=" + str + ", containerId=" + str2 + ", downloadedTracksCount=" + String.valueOf(optional) + ", containerMemberId=" + str3 + '}';
    }

    public imi() {
        throw null;
    }
}
