package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afrg {
    public static final afrg a = new afrg(false, null, null);
    public final boolean b;
    public final awmd c;
    private final afrb d;

    public afrg(boolean z, afrb afrbVar, awmd awmdVar) {
        this.b = z;
        this.d = afrbVar;
        this.c = awmdVar;
    }

    public final afrb a() {
        ahno.P(this.b, "Synclet binding must be enabled to have a SyncConfig");
        afrb afrbVar = this.d;
        afrbVar.getClass();
        return afrbVar;
    }

    public final boolean equals(Object obj) {
        afrb afrbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afrg) {
            afrg afrgVar = (afrg) obj;
            if (this.b == afrgVar.b && ((afrbVar = this.d) != null ? afrbVar.equals(afrgVar.d) : afrgVar.d == null)) {
                awmd awmdVar = this.c;
                if (awmdVar == null) {
                    if (afrgVar.c == null) {
                        return true;
                    }
                } else if (awmdVar.equals(afrgVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        afrb afrbVar = this.d;
        int iHashCode = (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (afrbVar == null ? 0 : afrbVar.hashCode());
        awmd awmdVar = this.c;
        return (iHashCode * 1000003) ^ (awmdVar != null ? awmdVar.hashCode() : 0);
    }

    public final String toString() {
        awmd awmdVar = this.c;
        return "SyncletBinding{enabled=" + this.b + ", syncConfig=" + String.valueOf(this.d) + ", syncletProvider=" + String.valueOf(awmdVar) + '}';
    }

    public afrg() {
        throw null;
    }
}
