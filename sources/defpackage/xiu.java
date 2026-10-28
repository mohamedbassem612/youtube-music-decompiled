package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xiu {
    public final Optional a;
    public final Optional b;
    public final xie c;

    public xiu(Optional optional, Optional optional2, xie xieVar) {
        this.a = optional;
        this.b = optional2;
        this.c = xieVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xiu) {
            xiu xiuVar = (xiu) obj;
            if (this.a.equals(xiuVar.a) && this.b.equals(xiuVar.b) && this.c.equals(xiuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        xie xieVar = this.c;
        Optional optional = this.b;
        return "DeferredLog{tickName=" + String.valueOf(this.a) + ", latencyActionInfo=" + String.valueOf(optional) + ", eventContext=" + String.valueOf(xieVar) + '}';
    }

    public xiu() {
        throw null;
    }
}
