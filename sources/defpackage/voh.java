package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class voh {
    public final agke a;
    public final agke b;
    public final apji c;

    public voh(agke agkeVar, agke agkeVar2, apji apjiVar) {
        this.a = agkeVar;
        this.b = agkeVar2;
        this.c = apjiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof voh) {
            voh vohVar = (voh) obj;
            agke agkeVar = this.a;
            if (agkeVar != null ? aguu.v(agkeVar, vohVar.a) : vohVar.a == null) {
                agke agkeVar2 = this.b;
                if (agkeVar2 != null ? aguu.v(agkeVar2, vohVar.b) : vohVar.b == null) {
                    apji apjiVar = this.c;
                    if (apjiVar == null) {
                        if (vohVar.c == null) {
                            return true;
                        }
                    } else if (apjiVar.equals(vohVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        agke agkeVar = this.a;
        int iHashCode = agkeVar == null ? 0 : agkeVar.hashCode();
        agke agkeVar2 = this.b;
        int iHashCode2 = agkeVar2 == null ? 0 : agkeVar2.hashCode();
        int i = iHashCode ^ 1000003;
        apji apjiVar = this.c;
        return (((i * 1000003) ^ iHashCode2) * 1000003) ^ (apjiVar != null ? apjiVar.hashCode() : 0);
    }

    public final String toString() {
        apji apjiVar = this.c;
        agke agkeVar = this.b;
        return "EngagementPanelModel{engagementPanelsList=" + String.valueOf(this.a) + ", adEngagementPanelsList=" + String.valueOf(agkeVar) + ", belowPlayerImmersiveLayout=" + String.valueOf(apjiVar) + '}';
    }

    public voh() {
        throw null;
    }
}
