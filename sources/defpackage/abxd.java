package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxd {
    public final abyd a;
    private final String b;

    public abxd(String str, abyd abydVar) {
        this.b = str;
        this.a = abydVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxd) {
            abxd abxdVar = (abxd) obj;
            if (awrc.c(this.b, abxdVar.b) && awrc.c(this.a, abxdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "ActiveConfigurationChangedEvent(cpn=" + this.b + ", configuration=" + this.a + ')';
    }
}
