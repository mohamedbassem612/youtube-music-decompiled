package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsg {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    static {
        a().a();
    }

    public ahsg(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    public static ahsf a() {
        ahsf ahsfVar = new ahsf();
        ahsfVar.d(0L);
        ahsfVar.c(1);
        ahsfVar.b(0L);
        return ahsfVar;
    }

    public final boolean b() {
        return this.g == 5;
    }

    public final boolean c() {
        int i = this.g;
        return i == 2 || i == 1;
    }

    public final boolean d() {
        return this.g == 4;
    }

    public final boolean e() {
        return this.g == 3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahsg) {
            ahsg ahsgVar = (ahsg) obj;
            String str3 = this.a;
            if (str3 != null ? str3.equals(ahsgVar.a) : ahsgVar.a == null) {
                int i = this.g;
                int i2 = ahsgVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.b) != null ? str.equals(ahsgVar.b) : ahsgVar.b == null) && ((str2 = this.c) != null ? str2.equals(ahsgVar.c) : ahsgVar.c == null) && this.d == ahsgVar.d && this.e == ahsgVar.e) {
                    String str4 = this.f;
                    if (str4 == null) {
                        if (ahsgVar.f == null) {
                            return true;
                        }
                    } else if (str4.equals(ahsgVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final ahsg f() {
        ahsf ahsfVar = new ahsf(this);
        ahsfVar.d = "BAD CONFIG";
        ahsfVar.c(5);
        return ahsfVar.a();
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.g;
        a.bj(i);
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = ((iHashCode ^ 1000003) * 1000003) ^ i;
        String str3 = this.c;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.d;
        int i3 = (iHashCode3 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.e;
        int i4 = (i3 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str4 = this.f;
        return i4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        int i = this.g;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + str + ", authToken=" + this.b + ", refreshToken=" + this.c + ", expiresInSecs=" + this.d + ", tokenCreationEpochInSecs=" + this.e + ", fisError=" + this.f + '}';
    }

    public ahsg() {
        throw null;
    }
}
