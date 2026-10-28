package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abxw {
    public final acey a;
    public final ytv b;
    public final vyo c;

    public abxw(acey aceyVar, ytv ytvVar, vyo vyoVar) {
        this.a = aceyVar;
        this.b = ytvVar;
        this.c = vyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxw) {
            abxw abxwVar = (abxw) obj;
            if (awrc.c(this.a, abxwVar.a) && awrc.c(this.b, abxwVar.b) && awrc.c(this.c, abxwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PolicyContext(director=" + this.a + ", player=" + this.b + ", hotConfigGroupSupplier=" + this.c + ')';
    }
}
