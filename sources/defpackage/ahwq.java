package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwq {
    private final ahwr a;

    public ahwq(double d, double d2, double d3) {
        this.a = new ahwr(((d % 360.0d) + 360.0d) % 360.0d, ahwo.c(d2), ahwo.c(d3), ahwo.c(1.0d));
    }

    public final double a() {
        return this.a.a;
    }

    public final double b() {
        return this.a.c;
    }

    public final double c() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahwq) {
            return this.a.equals(((ahwq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HslColor(h=" + a() + ", s=" + c() + ", l=" + b() + ", alpha=" + this.a.d + ')';
    }
}
