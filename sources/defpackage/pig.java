package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pig {
    public final plx a;
    public final plb b;
    public final boolean c;
    public final int d;
    public final Map e;
    public final Map f;

    public pig(plx plxVar, plb plbVar, boolean z, int i, Map map, Map map2) {
        plbVar.getClass();
        this.a = plxVar;
        this.b = plbVar;
        this.c = z;
        this.d = i;
        this.e = map;
        this.f = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pig) {
            pig pigVar = (pig) obj;
            if (awrc.c(this.a, pigVar.a) && awrc.c(this.b, pigVar.b) && this.c == pigVar.c && this.d == pigVar.d && awrc.c(this.e, pigVar.e) && awrc.c(this.f, pigVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        plx plxVar = this.a;
        return ((((((((((plxVar == null ? 0 : plxVar.hashCode()) * 31) + this.b.hashCode()) * 31) + a.aj(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "DownloadContext(account=" + this.a + ", safeTimeout=" + this.b + ", shouldRetryDownload=" + this.c + ", iconSize=" + this.d + ", inFlightBitmaps=" + this.e + ", inFlightFiles=" + this.f + ')';
    }
}
