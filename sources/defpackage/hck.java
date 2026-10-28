package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hck {
    public final agke a;
    public final annx b;

    public hck(agke agkeVar, annx annxVar) {
        this.a = agkeVar;
        this.b = annxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hck) {
            hck hckVar = (hck) obj;
            if (aguu.v(this.a, hckVar.a)) {
                annx annxVar = this.b;
                if (annxVar == null) {
                    if (hckVar.b == null) {
                        return true;
                    }
                } else if (annxVar.equals(hckVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        annx annxVar = this.b;
        return (iHashCode * 1000003) ^ (annxVar == null ? 0 : annxVar.hashCode());
    }

    public final String toString() {
        annx annxVar = this.b;
        return "PlaylistEditResponseModel{commandList=" + String.valueOf(this.a) + ", headerRenderer=" + String.valueOf(annxVar) + '}';
    }

    public hck() {
        throw null;
    }
}
