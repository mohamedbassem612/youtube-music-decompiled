package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahws {
    private final ahwt a;

    public ahws(double d, double d2, double d3) {
        this.a = new ahwt(ahwo.c(d), ahwo.c(d2), ahwo.c(d3), ahwo.c(1.0d));
    }

    public final double a() {
        return this.a.c;
    }

    public final double b() {
        return this.a.b;
    }

    public final double c() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahws) {
            return this.a.equals(((ahws) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RgbColor(r=" + c() + ", g=" + b() + ", b=" + a() + ", alpha=" + this.a.d + ')';
    }
}
