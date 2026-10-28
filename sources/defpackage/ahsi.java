package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahsi {
    public final String a;
    public final String b;
    public final ahsl c;
    public final int d;
    private final String e;

    public ahsi(String str, String str2, String str3, ahsl ahslVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = ahslVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahsi) {
            ahsi ahsiVar = (ahsi) obj;
            String str = this.e;
            if (str != null ? str.equals(ahsiVar.e) : ahsiVar.e == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(ahsiVar.a) : ahsiVar.a == null) {
                    String str3 = this.b;
                    if (str3 != null ? str3.equals(ahsiVar.b) : ahsiVar.b == null) {
                        ahsl ahslVar = this.c;
                        if (ahslVar != null ? ahslVar.equals(ahsiVar.c) : ahsiVar.c == null) {
                            int i = this.d;
                            if (i == 0) {
                                if (ahsiVar.d == 0) {
                                    return true;
                                }
                            } else if (i == ahsiVar.d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.b;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ahsl ahslVar = this.c;
        int iHashCode4 = (iHashCode3 ^ (ahslVar == null ? 0 : ahslVar.hashCode())) * 1000003;
        int i2 = this.d;
        return iHashCode4 ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        String str;
        int i = this.d;
        String strValueOf = String.valueOf(this.c);
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        String str2 = this.b;
        String str3 = this.a;
        return "InstallationResponse{uri=" + this.e + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + strValueOf + ", responseCode=" + str + '}';
    }

    public ahsi() {
        throw null;
    }
}
