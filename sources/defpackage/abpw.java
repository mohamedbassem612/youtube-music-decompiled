package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abpw {
    public final abnl a;
    public final abnp b;
    public final String c;
    public final boolean d;

    public abpw(abnl abnlVar, abnp abnpVar, String str, boolean z) {
        this.a = abnlVar;
        if (abnpVar == null) {
            throw new NullPointerException("Null playbackStartParameters");
        }
        this.b = abnpVar;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof abpw) {
            abpw abpwVar = (abpw) obj;
            if (this.a.equals(abpwVar.a) && this.b.equals(abpwVar.b) && ((str = this.c) != null ? str.equals(abpwVar.c) : abpwVar.c == null) && this.d == abpwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        return ((~(((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        abnp abnpVar = this.b;
        return "PlayerFetcherDescriptor{playbackStartDescriptor=" + this.a.toString() + ", playbackStartParameters=" + abnpVar.toString() + ", cpn=" + this.c + ", dataExpiredForSeconds=-1, synchronousRequestCreation=" + this.d + '}';
    }

    public abpw() {
        throw null;
    }
}
