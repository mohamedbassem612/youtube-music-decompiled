package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwy {
    public final List a;
    private final Set b;

    public /* synthetic */ dwy(List list) {
        this(list, atqq.aS(new dwx[]{dwx.a, dwx.b}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dwy) {
            dwy dwyVar = (dwy) obj;
            if (awrc.c(this.a, dwyVar.a) && awrc.c(this.b, dwyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WindowLayoutInfo{ DisplayFeatures[" + atqq.aD(this.a, null, null, null, null, 63) + "], engagementModes=" + this.b + " }";
    }

    public dwy(List list, Set set) {
        this.a = list;
        this.b = set;
    }
}
