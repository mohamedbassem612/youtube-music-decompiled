package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class omh {
    public final oiw a;
    public final oip b;

    public omh(oiw oiwVar, oip oipVar) {
        if (oiwVar == null) {
            throw new NullPointerException("Null groupKey");
        }
        this.a = oiwVar;
        if (oipVar == null) {
            throw new NullPointerException("Null dataFileGroup");
        }
        this.b = oipVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omh) {
            omh omhVar = (omh) obj;
            if (this.a.equals(omhVar.a) && this.b.equals(omhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        oip oipVar = this.b;
        return "GroupKeyAndGroup{groupKey=" + this.a.toString() + ", dataFileGroup=" + oipVar.toString() + '}';
    }

    public omh() {
        throw null;
    }
}
