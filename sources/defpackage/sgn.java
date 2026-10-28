package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sgn {
    public static final sgn a;
    public final int b;
    public final int c;
    public final int d;
    public final agev e;
    public final agev f;
    public final agev g;
    private final boolean h;

    static {
        agdf agdfVar = agdf.a;
        a = new sgn(0, 0, 0, false, agdfVar, agdfVar, agdfVar);
    }

    public sgn(int i, int i2, int i3, boolean z, agev agevVar, agev agevVar2, agev agevVar3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.h = z;
        this.e = agevVar;
        this.f = agevVar2;
        this.g = agevVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sgn) {
            sgn sgnVar = (sgn) obj;
            if (this.b == sgnVar.b && this.c == sgnVar.c && this.d == sgnVar.d && this.h == sgnVar.h && this.e.equals(sgnVar.e) && this.f.equals(sgnVar.f) && this.g.equals(sgnVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.h ? 1237 : 1231;
        int i2 = this.b;
        return ((((((((((((i2 ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "AdCountMetadata[" + this.b + ", " + this.c + ", " + this.d + ']';
    }

    public sgn() {
        throw null;
    }
}
