package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzw {
    public final String a;
    public final String b;
    public final aldh c;

    public uzw(String str, String str2, aldh aldhVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = aldhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uzw) {
            uzw uzwVar = (uzw) obj;
            if (awrc.c(this.a, uzwVar.a) && awrc.c(this.b, uzwVar.b) && this.c == uzwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        aldh aldhVar = this.c;
        return iHashCode2 + (aldhVar != null ? aldhVar.hashCode() : 0);
    }

    public final String toString() {
        return "EffectConflictInfo(assetId=" + this.a + ", scopeKey=" + this.b + ", layer=" + this.c + ')';
    }
}
