package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uoj {
    public final alps a;
    private final String b;

    public uoj(String str, alps alpsVar) {
        this.b = str;
        this.a = alpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uoj) {
            uoj uojVar = (uoj) obj;
            if (awrc.c(this.b, uojVar.b) && awrc.c(this.a, uojVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "GenerationResult(referenceImagePostId=" + this.b + ", response=" + this.a + ')';
    }
}
