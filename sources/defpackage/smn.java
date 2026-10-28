package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smn {
    public final agke a;
    public final aiui b;

    public smn(agke agkeVar, aiui aiuiVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null adSlotRenderers");
        }
        this.a = agkeVar;
        this.b = aiuiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smn) {
            smn smnVar = (smn) obj;
            if (aguu.v(this.a, smnVar.a)) {
                aiui aiuiVar = this.b;
                if (aiuiVar == null) {
                    if (smnVar.b == null) {
                        return true;
                    }
                } else if (aiuiVar.equals(smnVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        aiui aiuiVar = this.b;
        return (iHashCode * 1000003) ^ (aiuiVar == null ? 0 : aiuiVar.hashCode());
    }

    public final String toString() {
        aiui aiuiVar = this.b;
        return "SelectionResult{adSlotRenderers=" + this.a.toString() + ", passthroughData=" + String.valueOf(aiuiVar) + '}';
    }

    public smn() {
        throw null;
    }
}
