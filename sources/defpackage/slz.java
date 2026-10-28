package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class slz {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public slz(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (str == null) {
            throw new NullPointerException("Null contentCpn");
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slz) {
            slz slzVar = (slz) obj;
            if (this.a.equals(slzVar.a) && this.b == slzVar.b && this.c == slzVar.c && this.d == slzVar.d && this.e == slzVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "OrganicPlaybackContextModel{contentCpn=" + this.a + ", isLivePlayback=" + this.b + ", isDaiContent=" + this.c + ", isOfflinePlayback=" + this.d + ", isMdxPlayback=" + this.e + '}';
    }

    public slz() {
        throw null;
    }
}
