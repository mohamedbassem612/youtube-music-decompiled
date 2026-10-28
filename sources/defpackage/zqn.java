package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqn {
    public final zqg a;
    public final zqg b;
    public final zqy c;
    private final zri d = null;

    public zqn(zqg zqgVar, zqg zqgVar2, zqy zqyVar) {
        this.a = zqgVar;
        this.b = zqgVar2;
        this.c = zqyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqn) {
            zqn zqnVar = (zqn) obj;
            if (awrc.c(this.a, zqnVar.a) && awrc.c(this.b, zqnVar.b) && awrc.c(this.c, zqnVar.c)) {
                zri zriVar = zqnVar.d;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "Metadata(source=" + this.a + ", destination=" + this.b + ", action=" + this.c + ", args=null)";
    }
}
