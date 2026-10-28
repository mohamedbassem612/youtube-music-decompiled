package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class vws {
    public final ajwo a;
    public final Map b;

    public vws(ajwo ajwoVar, Map map) {
        this.a = ajwoVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vws) {
            vws vwsVar = (vws) obj;
            if (this.a.equals(vwsVar.a)) {
                Map map = this.b;
                if (map == null) {
                    if (vwsVar.b == null) {
                        return true;
                    }
                } else if (map.equals(vwsVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Map map = this.b;
        return (iHashCode * 1000003) ^ (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        Map map = this.b;
        return "BufferedCommand{command=" + this.a.toString() + ", args=" + String.valueOf(map) + '}';
    }

    public vws() {
        throw null;
    }
}
