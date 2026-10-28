package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sop {
    public final boolean a;
    private final ajnf b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public sop(ajnf ajnfVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = ajnfVar;
        this.c = z;
        this.a = z2;
        this.d = z3;
        this.e = z4;
    }

    public static xpd b() {
        xpd xpdVar = new xpd();
        xpdVar.k(ajnf.a);
        xpdVar.i(false);
        xpdVar.j(false);
        xpdVar.g(false);
        xpdVar.h(false);
        return xpdVar;
    }

    public final xpd a() {
        xpd xpdVarB = b();
        xpdVarB.k(this.b);
        xpdVarB.i(this.c);
        xpdVarB.j(this.a);
        xpdVarB.g(this.d);
        xpdVarB.h(this.e);
        return xpdVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sop) {
            sop sopVar = (sop) obj;
            if (this.b.equals(sopVar.b) && this.c == sopVar.c && this.a == sopVar.a && this.d == sopVar.d && this.e == sopVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "AdReEngagementState{renderer=" + String.valueOf(this.b) + ", enabled=" + this.c + ", fullscreen=" + this.a + ", annotationEnabled=" + this.d + ", appPromoEnabled=" + this.e + '}';
    }

    public sop() {
        throw null;
    }
}
