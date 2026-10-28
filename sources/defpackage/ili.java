package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ili extends hmy {
    public final List a;
    public final boolean b;
    public final boolean c;

    public ili(List list, boolean z, boolean z2) {
        super(null, null, null);
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ili) {
            ili iliVar = (ili) obj;
            if (awrc.c(this.a, iliVar.a) && this.b == iliVar.b && this.c == iliVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.aj(this.b)) * 31) + a.aj(this.c);
    }

    public final String toString() {
        return "Success(items=" + this.a + ", isNewSearch=" + this.b + ", hasMore=" + this.c + ')';
    }
}
