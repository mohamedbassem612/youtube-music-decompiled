package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usr {
    public final aufd a;
    public final qvc b;

    public usr(aufd aufdVar, qvc qvcVar) {
        if (aufdVar == null) {
            throw new NullPointerException("Null proto");
        }
        this.a = aufdVar;
        this.b = qvcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof usr) {
            usr usrVar = (usr) obj;
            if (this.a.equals(usrVar.a) && this.b.equals(usrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        qvc qvcVar = this.b;
        return "ResolvedCreationEffect{proto=" + this.a.toString() + ", effect=" + qvcVar.toString() + '}';
    }

    public usr() {
        throw null;
    }
}
