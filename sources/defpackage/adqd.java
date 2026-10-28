package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqd {
    public final String a;
    public final int b;
    public final String c;

    public adqd(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adqd) {
            adqd adqdVar = (adqd) obj;
            if (awrc.c(this.a, adqdVar.a) && this.b == adqdVar.b && awrc.c(this.c, adqdVar.c)) {
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
