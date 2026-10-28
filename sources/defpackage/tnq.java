package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tnq {
    public final tnx a;
    public final List b;
    public final List c;
    public final boolean d;

    public tnq(tnx tnxVar, List list, List list2, boolean z) {
        list2.getClass();
        this.a = tnxVar;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tnq) {
            tnq tnqVar = (tnq) obj;
            if (awrc.c(this.a, tnqVar.a) && awrc.c(this.b, tnqVar.b) && awrc.c(this.c, tnqVar.c) && this.d == tnqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.aj(this.d);
    }

    public final String toString() {
        return "ProcessingResult(response=" + this.a + ", inlined=" + this.b + ", promises=" + this.c + ", isIgnored=" + this.d + ')';
    }

    public /* synthetic */ tnq(tnx tnxVar, List list, List list2, int i) {
        this(tnxVar, list, (i & 4) != 0 ? awno.a : list2, false);
    }
}
