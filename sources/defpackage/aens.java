package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aens {
    public final aeno a;
    public final aent b;

    public aens(aeno aenoVar, aent aentVar) {
        aenoVar.getClass();
        this.a = aenoVar;
        this.b = aentVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aens) {
            aens aensVar = (aens) obj;
            if (awrc.c(this.a, aensVar.a) && this.b == aensVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PageContextInfo(navigationInfo=" + this.a + ", pageEvent=" + this.b + ')';
    }
}
