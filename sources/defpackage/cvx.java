package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvx {
    public final cwa a;
    public final cwa b;

    public cvx(cwa cwaVar, cwa cwaVar2) {
        this.a = cwaVar;
        this.b = cwaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cvx cvxVar = (cvx) obj;
            if (this.a.equals(cvxVar.a) && this.b.equals(cvxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        cwa cwaVar = this.a;
        cwa cwaVar2 = this.b;
        return "[" + cwaVar.toString() + (cwaVar.equals(cwaVar2) ? "" : ", ".concat(cwaVar2.toString())) + ']';
    }
}
