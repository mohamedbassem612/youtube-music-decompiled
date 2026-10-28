package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wee {
    public final avlb a;
    public final avlb b;

    public wee(avlb avlbVar, avlb avlbVar2) {
        this.a = avlbVar;
        this.b = avlbVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wee) {
            wee weeVar = (wee) obj;
            if (this.a.equals(weeVar.a) && this.b.equals(weeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        avlb avlbVar = this.b;
        return "ProcessingResults{inMemory=" + String.valueOf(this.a) + ", persistent=" + String.valueOf(avlbVar) + '}';
    }

    public wee() {
        throw null;
    }
}
