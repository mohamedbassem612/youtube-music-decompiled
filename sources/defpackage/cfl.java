package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cfl {
    public static final cfl a = new cfk().a();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public cfl(cfk cfkVar) {
        this.b = cfkVar.a;
        this.c = cfkVar.b;
        this.d = cfkVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cfl cflVar = (cfl) obj;
            if (this.b == cflVar.b && this.c == cflVar.c && this.d == cflVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ? 1 : 0) << 2) + ((this.c ? 1 : 0) << 1) + (this.d ? 1 : 0);
    }
}
