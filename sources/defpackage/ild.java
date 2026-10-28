package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ild {
    public final String a;
    public final List b;
    public final String c;
    public final int d;
    public final boolean e;

    public ild(String str, List list, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ild) {
            ild ildVar = (ild) obj;
            if (awrc.c(this.a, ildVar.a) && awrc.c(this.b, ildVar.b) && awrc.c(this.c, ildVar.c) && this.d == ildVar.d && this.e == ildVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + a.aj(this.e);
    }

    public final String toString() {
        return "PlaylistFilterSearchParams(query=" + this.a + ", tokenizedQuery=" + this.b + ", playlistId=" + this.c + ", pageNumber=" + this.d + ", metadataFetched=" + this.e + ')';
    }
}
