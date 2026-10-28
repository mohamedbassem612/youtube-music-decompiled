package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqh implements zrb, zqv {
    public final zqg a;
    public final boolean b;

    public zqh(zqg zqgVar, boolean z) {
        this.a = zqgVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqh) {
            zqh zqhVar = (zqh) obj;
            if (awrc.c(this.a, zqhVar.a) && this.b == zqhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.aj(this.b);
    }

    public final String toString() {
        return "Cleared(from=" + this.a + ", clearingActive=" + this.b + ')';
    }
}
