package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahwr {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public ahwr(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahwr) {
            ahwr ahwrVar = (ahwr) obj;
            if (Math.abs(ahwrVar.a - this.a) < 1.0E-13d && Math.abs(ahwrVar.b - this.b) < 1.0E-13d && Math.abs(ahwrVar.c - this.c) < 1.0E-13d && Math.abs(ahwrVar.d - this.d) < 1.0E-13d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(Math.round((this.a / 360.0d) * 1.0E16d)), Long.valueOf(Math.round(this.b * 1.0E16d)), Long.valueOf(Math.round(this.c * 1.0E16d)), Long.valueOf(Math.round(this.d * 1.0E16d)));
    }

    public final String toString() {
        return "HslColorInternal(h=" + this.a + ", s=" + this.b + ", l=" + this.c + ", alpha=" + this.d + ')';
    }
}
