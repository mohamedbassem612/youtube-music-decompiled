package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sos {
    public final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final ajmb f;
    private final int g;

    public sos(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ajmb ajmbVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.a = z5;
        this.g = 1;
        this.f = ajmbVar;
    }

    public static sor b() {
        sor sorVar = new sor();
        sorVar.g(true);
        sorVar.e(false);
        sorVar.c(false);
        sorVar.d(false);
        sorVar.f(false);
        sorVar.b(1);
        sorVar.h(ajmb.a);
        return sorVar;
    }

    public final sor a() {
        sor sorVarB = b();
        sorVarB.g(this.b);
        sorVarB.e(this.c);
        sorVarB.c(this.d);
        sorVarB.d(this.e);
        sorVarB.f(this.a);
        sorVarB.b(this.g);
        sorVarB.h(this.f);
        return sorVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sos) {
            sos sosVar = (sos) obj;
            if (this.b == sosVar.b && this.c == sosVar.c && this.d == sosVar.d && this.e == sosVar.e && this.a == sosVar.a) {
                int i = this.g;
                int i2 = sosVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.f.equals(sosVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bj(this.g);
        int i = true != this.b ? 1237 : 1231;
        return ((((((((((((i ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.a ? 1231 : 1237)) * 1000003) ^ 1) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String str = this.g != 1 ? "null" : "NONE";
        boolean z = this.a;
        boolean z2 = this.e;
        boolean z3 = this.d;
        boolean z4 = this.c;
        return "BrandInteractionState{hidden=" + this.b + ", enabled=" + z4 + ", annotationEnabled=" + z3 + ", appPromoEnabled=" + z2 + ", fullscreen=" + z + ", activeButton=" + str + ", renderer=" + String.valueOf(this.f) + '}';
    }

    public sos() {
        throw null;
    }
}
