package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjz {
    public final anaf a;
    public final hjy b;
    public final awqg c;
    public final int d;

    public hjz(int i, anaf anafVar, hjy hjyVar, awqg awqgVar) {
        anafVar.getClass();
        hjyVar.getClass();
        this.d = i;
        this.a = anafVar;
        this.b = hjyVar;
        this.c = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hjz) {
            hjz hjzVar = (hjz) obj;
            if (this.d == hjzVar.d && awrc.c(this.a, hjzVar.a) && awrc.c(this.b, hjzVar.b) && awrc.c(this.c, hjzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.d * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        awqg awqgVar = this.c;
        return (iHashCode * 31) + (awqgVar == null ? 0 : awqgVar.hashCode());
    }

    public final String toString() {
        return "MediaPlaybackEventInfo(mediaBrowserPlaybackType=" + ((Object) Integer.toString(this.d - 1)) + ", mediaSessionResult=" + this.a + ", mediaClientInfo=" + this.b + ", clientPlaybackNonceCallback=" + this.c + ')';
    }
}
