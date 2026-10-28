package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achu {
    public final alvl a;
    public final ajwo b;
    public final agke c;
    public final alve d;
    public final aopm e;
    public final aigj f;
    public final String g;
    public final String h;
    public final aigj i;
    private final awmd j;
    private final String k;

    public achu(awmd awmdVar, String str, alvl alvlVar, ajwo ajwoVar, agke agkeVar, alve alveVar, aopm aopmVar, aigj aigjVar, String str2, String str3, aigj aigjVar2) {
        this.j = awmdVar;
        this.k = str;
        this.a = alvlVar;
        this.b = ajwoVar;
        this.c = agkeVar;
        this.d = alveVar;
        this.e = aopmVar;
        this.f = aigjVar;
        this.g = str2;
        this.h = str3;
        this.i = aigjVar2;
    }

    public final boolean a() {
        return ((Boolean) this.j.io()).booleanValue();
    }

    public final boolean equals(Object obj) {
        alvl alvlVar;
        ajwo ajwoVar;
        alve alveVar;
        aopm aopmVar;
        aigj aigjVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof achu) {
            achu achuVar = (achu) obj;
            if (this.j.equals(achuVar.j) && this.k.equals(achuVar.k) && ((alvlVar = this.a) != null ? alvlVar.equals(achuVar.a) : achuVar.a == null) && ((ajwoVar = this.b) != null ? ajwoVar.equals(achuVar.b) : achuVar.b == null) && aguu.v(this.c, achuVar.c) && ((alveVar = this.d) != null ? alveVar.equals(achuVar.d) : achuVar.d == null) && ((aopmVar = this.e) != null ? aopmVar.equals(achuVar.e) : achuVar.e == null) && ((aigjVar = this.f) != null ? aigjVar.equals(achuVar.f) : achuVar.f == null) && ((str = this.g) != null ? str.equals(achuVar.g) : achuVar.g == null) && ((str2 = this.h) != null ? str2.equals(achuVar.h) : achuVar.h == null)) {
                aigj aigjVar2 = this.i;
                if (aigjVar2 == null) {
                    if (achuVar.i == null) {
                        return true;
                    }
                } else if (aigjVar2.equals(achuVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.j.hashCode() ^ 1000003) * 1000003) ^ this.k.hashCode();
        alvl alvlVar = this.a;
        int iHashCode2 = ((iHashCode * 1000003) ^ (alvlVar == null ? 0 : alvlVar.hashCode())) * 1000003;
        ajwo ajwoVar = this.b;
        int iHashCode3 = (((iHashCode2 ^ (ajwoVar == null ? 0 : ajwoVar.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        alve alveVar = this.d;
        int iHashCode4 = (iHashCode3 ^ (alveVar == null ? 0 : alveVar.hashCode())) * 1000003;
        aopm aopmVar = this.e;
        int iHashCode5 = (iHashCode4 ^ (aopmVar == null ? 0 : aopmVar.hashCode())) * 1000003;
        aigj aigjVar = this.f;
        int iHashCode6 = (iHashCode5 ^ (aigjVar == null ? 0 : aigjVar.hashCode())) * 1000003;
        String str = this.g;
        int iHashCode7 = (iHashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        aigj aigjVar2 = this.i;
        return iHashCode8 ^ (aigjVar2 != null ? aigjVar2.hashCode() : 0);
    }

    public final String toString() {
        aigj aigjVar = this.i;
        aigj aigjVar2 = this.f;
        aopm aopmVar = this.e;
        alve alveVar = this.d;
        agke agkeVar = this.c;
        ajwo ajwoVar = this.b;
        alvl alvlVar = this.a;
        return "ModularHeartbeatResponseContext{isDeadProvider=" + String.valueOf(this.j) + ", videoId=" + this.k + ", playabilityStatus=" + String.valueOf(alvlVar) + ", videoTransitionEndpoint=" + String.valueOf(ajwoVar) + ", cueRangeSets=" + String.valueOf(agkeVar) + ", heartbeatAttestationConfig=" + String.valueOf(alveVar) + ", playerAttestation=" + String.valueOf(aopmVar) + ", adBreakHeartbeatParams=" + String.valueOf(aigjVar2) + ", compositeLiveStatusToken=" + this.g + ", compositeLiveIngestionOffsetToken=" + this.h + ", heartbeatLoggingToken=" + String.valueOf(aigjVar) + '}';
    }

    public achu() {
        throw null;
    }
}
