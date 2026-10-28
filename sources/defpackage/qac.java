package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qac {
    public final boolean a;
    public final qab b;

    public qac(boolean z, qab qabVar) {
        this.a = z;
        this.b = qabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qac) {
            qac qacVar = (qac) obj;
            if (this.a == qacVar.a && this.b == qacVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        qab qabVar = this.b;
        return (a.aj(this.a) * 31) + (qabVar == null ? 0 : qabVar.hashCode());
    }

    public final String toString() {
        return "InterceptionResult(isIntercepted=" + this.a + ", dropReason=" + this.b + ')';
    }
}
