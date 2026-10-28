package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdh {
    public final String a;
    public final Exception b;

    public vdh(String str, Exception exc) {
        this.a = str;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdh) {
            vdh vdhVar = (vdh) obj;
            if (awrc.c(this.a, vdhVar.a) && awrc.c(this.b, vdhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Exception exc = this.b;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public final String toString() {
        return "Failure(message=" + this.a + ", exception=" + this.b + ')';
    }
}
