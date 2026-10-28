package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wff {
    public static final wff a = b().j();
    public final weh b;
    public final wej c;
    public final aijp d;

    public wff(weh wehVar, wej wejVar, aijp aijpVar) {
        this.b = wehVar;
        this.c = wejVar;
        this.d = aijpVar;
    }

    public static ahfi b() {
        ahfi ahfiVar = new ahfi(null);
        ahfiVar.l(wej.a);
        ahfiVar.k(wez.a);
        return ahfiVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, weh] */
    public final wep a() {
        Object obj;
        weh wehVar = this.b;
        if (wehVar == null) {
            return null;
        }
        wej wejVar = this.c;
        zak zakVar = new zak();
        zakVar.a(wej.a);
        zakVar.a = wehVar;
        zakVar.a(wejVar);
        ?? r3 = zakVar.a;
        if (r3 != 0 && (obj = zakVar.b) != null) {
            return new wep(r3, (wej) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (zakVar.a == null) {
            sb.append(" entity");
        }
        if (zakVar.b == null) {
            sb.append(" metadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wff) {
            wff wffVar = (wff) obj;
            weh wehVar = this.b;
            if (wehVar != null ? wehVar.equals(wffVar.b) : wffVar.b == null) {
                if (this.c.equals(wffVar.c) && this.d.equals(wffVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        weh wehVar = this.b;
        return (((((wehVar == null ? 0 : wehVar.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        aijp aijpVar = this.d;
        wej wejVar = this.c;
        return "InternalEntityWrapper{wrappedEntity=" + String.valueOf(this.b) + ", metadata=" + String.valueOf(wejVar) + ", applicability=" + String.valueOf(aijpVar) + '}';
    }

    public wff() {
        throw null;
    }
}
