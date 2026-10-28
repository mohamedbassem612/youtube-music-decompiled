package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zrc {
    public final zqg a;
    public final zrb b;
    public final zri c;

    public zrc(zqg zqgVar, zrb zrbVar, zri zriVar) {
        this.a = zqgVar;
        this.b = zrbVar;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zrc) {
            zrc zrcVar = (zrc) obj;
            if (awrc.c(this.a, zrcVar.a) && awrc.c(this.b, zrcVar.b)) {
                zri zriVar = zrcVar.c;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "NavigationEvent(current=" + this.a + ", action=" + this.b + ", args=null)";
    }

    public /* synthetic */ zrc(zqg zqgVar, zrb zrbVar, zri zriVar, int i, awqx awqxVar) {
        this(zqgVar, zrbVar, null);
    }
}
