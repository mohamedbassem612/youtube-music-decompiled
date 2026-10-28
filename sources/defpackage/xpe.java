package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xpe {
    public final boolean a;
    public final algp b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public xpe(boolean z, boolean z2, boolean z3, boolean z4, algp algpVar) {
        this.a = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.b = algpVar;
    }

    public static xpd a() {
        xpd xpdVar = new xpd();
        xpdVar.b(false);
        xpdVar.c(false);
        xpdVar.e(false);
        xpdVar.d(false);
        xpdVar.a = algp.HANDOFF_FEATURE_TYPE_UNKNOWN;
        return xpdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xpe) {
            xpe xpeVar = (xpe) obj;
            if (this.a == xpeVar.a && this.c == xpeVar.c && this.d == xpeVar.d && this.e == xpeVar.e && this.b.equals(xpeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((i ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AutoconnectEnablement{isEnabled=" + this.a + ", shouldDisplayPrompt=" + this.c + ", shouldLogCounterfactualVes=" + this.d + ", shouldUseProximityConnection=" + this.e + ", featureType=" + String.valueOf(this.b) + '}';
    }

    public xpe() {
        throw null;
    }
}
