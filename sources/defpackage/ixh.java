package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixh {
    public final agke a;
    public final agke b;

    public ixh(agke agkeVar, agke agkeVar2) {
        this.a = agkeVar;
        this.b = agkeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ixh) {
            ixh ixhVar = (ixh) obj;
            if (aguu.v(this.a, ixhVar.a) && aguu.v(this.b, ixhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "ChipsReplacedData{oldChips=" + String.valueOf(this.a) + ", newChips=" + String.valueOf(agkeVar) + '}';
    }

    public ixh() {
        throw null;
    }
}
