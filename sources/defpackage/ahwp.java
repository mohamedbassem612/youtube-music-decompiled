package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwp {
    public final double a;
    public final double b;
    public final double c;

    public ahwp(double d, double d2, double d3) {
        if (d < 0.0d || d > 360.0d) {
            throw new IllegalArgumentException("Invalid hue value " + d);
        }
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new IllegalArgumentException("Invalid saturation value " + d2);
        }
        if (d3 < 0.0d || d3 > 1.0d) {
            throw new IllegalArgumentException("Invalid brightness value " + d3);
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahwp) {
            ahwp ahwpVar = (ahwp) obj;
            if (Math.abs(ahwpVar.a - this.a) < 1.0E-10d && Math.abs(ahwpVar.b - this.b) < 1.0E-10d && Math.abs(ahwpVar.c - this.c) < 1.0E-10d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(Math.round((this.a / 1.0E-10d) / 100.0d)), Long.valueOf(Math.round((this.b / 1.0E-10d) / 100.0d)), Long.valueOf(Math.round((this.c / 1.0E-10d) / 100.0d)));
    }

    public final String toString() {
        return "HsbColor (h=" + this.a + ", s=" + this.b + ", b=" + this.c + ')';
    }
}
