package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyv {
    public final String a;
    public final String b;
    public final String c;

    public vyv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vyv) {
            vyv vyvVar = (vyv) obj;
            if (awrc.c(this.a, vyvVar.a) && awrc.c(this.b, vyvVar.b) && awrc.c(this.c, vyvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AccountConfigHashes(staticHash=" + this.a + ", dynamicHash=" + this.b + ", activeStaticConfigData=" + this.c + ')';
    }
}
