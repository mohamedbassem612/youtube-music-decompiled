package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgi {
    public final xgz a;
    public final boolean b;

    public xgi(xgz xgzVar, boolean z) {
        this.a = xgzVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgi) {
            xgi xgiVar = (xgi) obj;
            if (this.a.equals(xgiVar.a) && this.b == xgiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * (-721379959)) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "VisualElementContainerViewBinding{veContainer=" + this.a.toString() + ", clientData=null, enableRecursiveViewMonitoring=" + this.b + '}';
    }

    public xgi() {
        throw null;
    }
}
