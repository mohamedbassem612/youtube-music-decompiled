package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xwa {
    public final String a;
    public final String b;
    public final String c;
    public final agkz d;
    private final String e;

    public xwa(String str, String str2, String str3, String str4, agkz agkzVar) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null id");
        }
        this.b = str2;
        this.e = str3;
        this.c = str4;
        if (agkzVar == null) {
            throw new NullPointerException("Null capabilities");
        }
        this.d = agkzVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xwa) {
            xwa xwaVar = (xwa) obj;
            if (this.a.equals(xwaVar.a) && this.b.equals(xwaVar.b) && ((str = this.e) != null ? str.equals(xwaVar.e) : xwaVar.e == null) && this.c.equals(xwaVar.c) && this.d.equals(xwaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.e;
        return (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "SessionMemberInternal{type=" + this.a + ", id=" + this.b + ", encryptionKey=" + this.e + ", receiverIdentityMatchStatus=" + this.c + ", capabilities=" + this.d.toString() + '}';
    }

    public xwa() {
        throw null;
    }
}
