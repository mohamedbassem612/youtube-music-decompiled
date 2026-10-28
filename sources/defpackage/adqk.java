package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqk {
    public final String a;
    public final adrj b;
    public final awqg c;

    public adqk(String str, adrj adrjVar, awqg awqgVar) {
        this.a = str;
        this.b = adrjVar;
        this.c = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adqk) {
            adqk adqkVar = (adqk) obj;
            if (awrc.c(this.a, adqkVar.a) && awrc.c(this.b, adqkVar.b) && awrc.c(this.c, adqkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PendingMountConfig(componentKey=" + this.a + ", source=" + this.b + ", defaultsProvider=" + this.c + ')';
    }
}
