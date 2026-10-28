package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acji {
    public static final acji a;
    public final Set b;
    public final Set c;
    private final Map d;
    private final Map e;

    static {
        awnp awnpVar = awnp.a;
        a = new acji(awnpVar, awnpVar);
    }

    public acji(Map map, Map map2) {
        this.d = map;
        this.e = map2;
        this.b = atqq.aw(map.values());
        this.c = atqq.aw(map2.values());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acji) {
            acji acjiVar = (acji) obj;
            if (awrc.c(this.d, acjiVar.d) && awrc.c(this.e, acjiVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TimelineSyncDiff(segmentsRemovedMap=" + this.d + ", segmentsAddedMap=" + this.e + ')';
    }
}
