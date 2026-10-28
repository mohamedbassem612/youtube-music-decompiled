package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class omi {
    public final oip a;
    public final oip b;

    public omi(oip oipVar, oip oipVar2) {
        this.a = oipVar;
        this.b = oipVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omi) {
            omi omiVar = (omi) obj;
            oip oipVar = this.a;
            if (oipVar != null ? oipVar.equals(omiVar.a) : omiVar.a == null) {
                oip oipVar2 = this.b;
                if (oipVar2 == null) {
                    if (omiVar.b == null) {
                        return true;
                    }
                } else if (oipVar2.equals(omiVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        oip oipVar = this.a;
        int iHashCode = oipVar == null ? 0 : oipVar.hashCode();
        oip oipVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (oipVar2 != null ? oipVar2.hashCode() : 0);
    }

    public final String toString() {
        oip oipVar = this.b;
        return "GroupPair{pendingGroup=" + String.valueOf(this.a) + ", downloadedGroup=" + String.valueOf(oipVar) + '}';
    }

    public omi() {
        throw null;
    }
}
