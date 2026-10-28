package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabr {
    public final String a;
    public final int b;
    public final String c;

    public aabr(String str, int i, String str2) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.a = str;
        this.b = i;
        if (str2 == null) {
            throw new NullPointerException("Null clientId");
        }
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aabr) {
            aabr aabrVar = (aabr) obj;
            if (this.a.equals(aabrVar.a) && this.b == aabrVar.b && this.c.equals(aabrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "NotificationTag{tag=" + this.a + ", id=" + this.b + ", clientId=" + this.c + '}';
    }

    public aabr() {
        throw null;
    }
}
