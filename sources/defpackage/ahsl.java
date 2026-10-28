package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahsl {
    public final String a;
    public final long b;
    public final int c;

    public ahsl(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static ahsk a() {
        ahsk ahskVar = new ahsk();
        ahskVar.b(0L);
        return ahskVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahsl) {
            ahsl ahslVar = (ahsl) obj;
            String str = this.a;
            if (str != null ? str.equals(ahslVar.a) : ahslVar.a == null) {
                if (this.b == ahslVar.b) {
                    int i = this.c;
                    if (i == 0) {
                        if (ahslVar.c == 0) {
                            return true;
                        }
                    } else if (i == ahslVar.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = this.c;
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ (i != 0 ? i : 0);
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + '}';
    }

    public ahsl() {
        throw null;
    }
}
