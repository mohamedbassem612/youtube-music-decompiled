package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xhr {
    public final xgt a;
    public final xhs b;
    public final boolean c;

    public xhr(xgt xgtVar, xhs xhsVar, boolean z) {
        this.a = xgtVar;
        this.b = xhsVar;
        this.c = z;
    }

    public static /* synthetic */ xhr a(xhr xhrVar, boolean z, int i) {
        xgt xgtVar = (i & 1) != 0 ? xhrVar.a : null;
        xhs xhsVar = (i & 2) != 0 ? xhrVar.b : null;
        if ((i & 4) != 0) {
            z = xhrVar.c;
        }
        xhsVar.getClass();
        return new xhr(xgtVar, xhsVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xhr) {
            xhr xhrVar = (xhr) obj;
            if (awrc.c(this.a, xhrVar.a) && awrc.c(this.b, xhrVar.b) && this.c == xhrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        xgt xgtVar = this.a;
        return ((((xgtVar == null ? 0 : xgtVar.hashCode()) * 31) + this.b.hashCode()) * 31) + a.aj(this.c);
    }

    public final String toString() {
        return "ScreenEntry(screen=" + this.a + ", metadata=" + this.b + ", isDestroyed=" + this.c + ')';
    }
}
