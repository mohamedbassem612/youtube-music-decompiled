package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class weo {
    public final String a;
    public final weh b;
    public final weh c;
    public final wej d;
    public final wej e;
    public final wen f;

    public weo(String str, weh wehVar, weh wehVar2, wej wejVar, wej wejVar2, wen wenVar) {
        this.a = str;
        this.b = wehVar;
        this.c = wehVar2;
        this.d = wejVar;
        this.e = wejVar2;
        this.f = wenVar;
    }

    public final boolean equals(Object obj) {
        weh wehVar;
        weh wehVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof weo) {
            weo weoVar = (weo) obj;
            if (this.a.equals(weoVar.a) && ((wehVar = this.b) != null ? wehVar.equals(weoVar.b) : weoVar.b == null) && ((wehVar2 = this.c) != null ? wehVar2.equals(weoVar.c) : weoVar.c == null) && this.d.equals(weoVar.d) && this.e.equals(weoVar.e) && this.f.equals(weoVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        weh wehVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (wehVar == null ? 0 : wehVar.hashCode())) * 1000003;
        weh wehVar2 = this.c;
        return ((((((iHashCode2 ^ (wehVar2 != null ? wehVar2.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        wen wenVar = this.f;
        wej wejVar = this.e;
        wej wejVar2 = this.d;
        weh wehVar = this.c;
        return "EntityUpdate{entityKey=" + this.a + ", previousEntity=" + String.valueOf(this.b) + ", currentEntity=" + String.valueOf(wehVar) + ", previousMetadata=" + String.valueOf(wejVar2) + ", currentMetadata=" + String.valueOf(wejVar) + ", reason=" + String.valueOf(wenVar) + '}';
    }

    public weo() {
        throw null;
    }
}
