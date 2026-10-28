package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahos {
    public final ahpd a;
    public final int b;
    private final int c;

    public ahos(Class cls, int i, int i2) {
        this(new ahpd(ahpc.class, cls), i, i2);
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahos)) {
            return false;
        }
        ahos ahosVar = (ahos) obj;
        return this.a.equals(ahosVar.a) && this.b == ahosVar.b && this.c == ahosVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append('}');
        return sb.toString();
    }

    public ahos(ahpd ahpdVar, int i, int i2) {
        this.a = ahpdVar;
        this.b = i;
        this.c = i2;
    }
}
