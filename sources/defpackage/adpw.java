package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpw {
    public final String a;
    public final int b;
    public final String c;
    public final adpv d;

    public adpw(String str, int i, String str2, adpv adpvVar) {
        adpvVar.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = adpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adpw) {
            adpw adpwVar = (adpw) obj;
            if (awrc.c(this.a, adpwVar.a) && this.b == adpwVar.b && awrc.c(this.c, adpwVar.c) && awrc.c(this.d, adpwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RiveListItemImageProperty(listPath=" + this.a + ", index=" + this.b + ", propertyPath=" + this.c + ", value=" + this.d + ')';
    }
}
