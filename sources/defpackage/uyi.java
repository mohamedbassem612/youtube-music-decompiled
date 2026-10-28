package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uyi {
    public final aigj a;
    public final aigj b;

    public uyi(aigj aigjVar, aigj aigjVar2) {
        this.a = aigjVar;
        this.b = aigjVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uyi) {
            uyi uyiVar = (uyi) obj;
            if (this.a.equals(uyiVar.a) && this.b.equals(uyiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aigj aigjVar = this.b;
        return "RemoteAssetInfo{signature=" + String.valueOf(this.a) + ", certificate=" + String.valueOf(aigjVar) + '}';
    }

    public uyi() {
        throw null;
    }
}
