package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyl {
    private final xym a;
    private final Map b;

    public xyl(xym xymVar, Map map) {
        this.a = xymVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xyl) {
            xyl xylVar = (xyl) obj;
            if (this.a == xylVar.a && awrc.c(this.b, xylVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FeatureSpecificMessage(method=" + this.a + ", params=" + this.b + ')';
    }
}
