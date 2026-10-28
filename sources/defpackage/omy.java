package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class omy {
    public final ahap a;
    public final ahai b;

    public omy(ahap ahapVar, ahai ahaiVar) {
        if (ahapVar == null) {
            throw new NullPointerException("Null fileGroupStatus");
        }
        this.a = ahapVar;
        if (ahaiVar == null) {
            throw new NullPointerException("Null fileGroupDetails");
        }
        this.b = ahaiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omy) {
            omy omyVar = (omy) obj;
            if (this.a.equals(omyVar.a) && this.b.equals(omyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ahai ahaiVar = this.b;
        return "FileGroupStatusWithDetails{fileGroupStatus=" + this.a.toString() + ", fileGroupDetails=" + ahaiVar.toString() + '}';
    }

    public omy() {
        throw null;
    }
}
