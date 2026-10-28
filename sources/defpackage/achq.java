package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achq {
    public final String a;
    public final byte[] b;
    public final alvl c;
    public final wja d;
    public final alvf e;
    public final aigj f;
    public final aopm g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final aigj m;

    public achq(String str, byte[] bArr, alvl alvlVar, wja wjaVar, alvf alvfVar, aigj aigjVar, aopm aopmVar, String str2, String str3, boolean z, boolean z2, String str4, aigj aigjVar2) {
        this.a = str;
        this.b = bArr;
        this.c = alvlVar;
        this.d = wjaVar;
        this.e = alvfVar;
        this.f = aigjVar;
        this.g = aopmVar;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.k = z2;
        this.l = str4;
        this.m = aigjVar2;
    }

    public final boolean equals(Object obj) {
        wja wjaVar;
        alvf alvfVar;
        aigj aigjVar;
        aopm aopmVar;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof achq) {
            achq achqVar = (achq) obj;
            if (this.a.equals(achqVar.a)) {
                if (Arrays.equals(this.b, achqVar instanceof achq ? achqVar.b : achqVar.b) && this.c.equals(achqVar.c) && ((wjaVar = this.d) != null ? wjaVar.equals(achqVar.d) : achqVar.d == null) && ((alvfVar = this.e) != null ? alvfVar.equals(achqVar.e) : achqVar.e == null) && ((aigjVar = this.f) != null ? aigjVar.equals(achqVar.f) : achqVar.f == null) && ((aopmVar = this.g) != null ? aopmVar.equals(achqVar.g) : achqVar.g == null) && ((str = this.h) != null ? str.equals(achqVar.h) : achqVar.h == null) && ((str2 = this.i) != null ? str2.equals(achqVar.i) : achqVar.i == null) && this.j == achqVar.j && this.k == achqVar.k && ((str3 = this.l) != null ? str3.equals(achqVar.l) : achqVar.l == null)) {
                    aigj aigjVar2 = this.m;
                    if (aigjVar2 == null) {
                        if (achqVar.m == null) {
                            return true;
                        }
                    } else if (aigjVar2.equals(achqVar.m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
        wja wjaVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (wjaVar == null ? 0 : wjaVar.hashCode())) * 1000003;
        alvf alvfVar = this.e;
        int iHashCode3 = (iHashCode2 ^ (alvfVar == null ? 0 : alvfVar.hashCode())) * 1000003;
        aigj aigjVar = this.f;
        int iHashCode4 = (iHashCode3 ^ (aigjVar == null ? 0 : aigjVar.hashCode())) * 1000003;
        aopm aopmVar = this.g;
        int iHashCode5 = (iHashCode4 ^ (aopmVar == null ? 0 : aopmVar.hashCode())) * 1000003;
        String str = this.h;
        int iHashCode6 = (iHashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.i;
        int iHashCode7 = (((((iHashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true == this.k ? 1231 : 1237)) * 1000003;
        String str3 = this.l;
        int iHashCode8 = (iHashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        aigj aigjVar2 = this.m;
        return iHashCode8 ^ (aigjVar2 != null ? aigjVar2.hashCode() : 0);
    }

    public final String toString() {
        aigj aigjVar = this.m;
        aopm aopmVar = this.g;
        aigj aigjVar2 = this.f;
        alvf alvfVar = this.e;
        wja wjaVar = this.d;
        alvl alvlVar = this.c;
        return "PlayerResponseHeartbeatInfo{currentVideoId=" + this.a + ", trackingParams=" + Arrays.toString(this.b) + ", initialPlayabilityStatus=" + String.valueOf(alvlVar) + ", videoStreamingData=" + String.valueOf(wjaVar) + ", heartbeatParams=" + String.valueOf(alvfVar) + ", heartbeatServerData=" + String.valueOf(aigjVar2) + ", playerAttestation=" + String.valueOf(aopmVar) + ", compositeLiveStatusToken=" + this.h + ", compositeLiveIngestionOffsetToken=" + this.i + ", enablePremiereTrailerCodepath=" + this.j + ", live=" + this.k + ", cpn=" + this.l + ", heartbeatLoggingToken=" + String.valueOf(aigjVar) + '}';
    }

    public achq() {
        throw null;
    }
}
