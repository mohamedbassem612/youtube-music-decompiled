package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpn {
    public final String a;
    public final int b;
    public final String c;

    public adpn(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adpn) {
            adpn adpnVar = (adpn) obj;
            if (awrc.c(this.a, adpnVar.a) && this.b == adpnVar.b && awrc.c(this.c, adpnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ListItemPropertyKey(listPath=" + this.a + ", index=" + this.b + ", propertyPath=" + this.c + ')';
    }
}
