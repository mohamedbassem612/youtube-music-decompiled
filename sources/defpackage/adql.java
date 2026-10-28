package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adql {
    public final String a;
    private final String b;

    public adql(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adql) {
            adql adqlVar = (adql) obj;
            if (awrc.c(this.a, adqlVar.a) && awrc.c(this.b, adqlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SessionKey(componentKey=" + this.a + ", sourceCacheKey=" + this.b + ')';
    }
}
