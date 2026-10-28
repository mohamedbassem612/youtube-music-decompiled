package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvc extends xvi {
    public final xwc a;
    private final String b;
    private final xvv c;
    private final xvz d;

    public xvc(String str, xvv xvvVar, xvz xvzVar, xwc xwcVar) {
        this.b = str;
        this.c = xvvVar;
        this.d = xvzVar;
        this.a = xwcVar;
    }

    @Override // defpackage.xvi
    public final xvv a() {
        return this.c;
    }

    @Override // defpackage.xvi, defpackage.xvr
    public final xvz b() {
        return this.d;
    }

    @Override // defpackage.xvi, defpackage.xvr
    public final String c() {
        return this.b;
    }

    @Override // defpackage.xvi, defpackage.xvr
    public final xwc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xvi) {
            xvi xviVar = (xvi) obj;
            if (this.b.equals(xviVar.c()) && this.c.equals(xviVar.a()) && this.d.equals(xviVar.b()) && this.a.equals(xviVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.b) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "MdxAutoconnectScreen{friendlyName=" + this.b + ", pairingInfo=" + this.c.toString() + ", screenId=" + this.d.b + ", deviceId=" + this.a.b + '}';
    }
}
