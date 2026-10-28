package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xnw {
    public final xnu a;
    private final boolean b = true;

    public xnw(xnu xnuVar) {
        this.a = xnuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xnw) {
            xnw xnwVar = (xnw) obj;
            if (awrc.c(this.a, xnwVar.a)) {
                boolean z = xnwVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "DialRequest(callback=" + this.a + ", reportCached=true)";
    }
}
