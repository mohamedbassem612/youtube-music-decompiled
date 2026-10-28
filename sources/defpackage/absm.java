package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class absm {
    public static final absm a = new absm(null);
    public final alvl b;

    public absm(alvl alvlVar) {
        this.b = alvlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof absm) {
            absm absmVar = (absm) obj;
            alvl alvlVar = this.b;
            if (alvlVar != null) {
                return alvlVar.equals(absmVar.b);
            }
            if (absmVar.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        alvl alvlVar = this.b;
        return (alvlVar == null ? 0 : alvlVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "PlayerInterstitialData{playabilityStatus=" + String.valueOf(this.b) + '}';
    }

    public absm() {
        throw null;
    }
}
