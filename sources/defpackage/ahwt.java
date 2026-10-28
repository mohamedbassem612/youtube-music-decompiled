package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahwt {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public ahwt(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahwt) {
            ahwt ahwtVar = (ahwt) obj;
            if (Math.abs(ahwtVar.a - this.a) < 1.0E-13d && Math.abs(ahwtVar.b - this.b) < 1.0E-13d && Math.abs(ahwtVar.c - this.c) < 1.0E-13d && Math.abs(ahwtVar.d - this.d) < 1.0E-13d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(Math.round(this.a * 1.0E16d)), Long.valueOf(Math.round(this.b * 1.0E16d)), Long.valueOf(Math.round(this.c * 1.0E16d)), Long.valueOf(Math.round(this.d * 1.0E16d)));
    }

    public final String toString() {
        return "RgbColorInternal(r=" + this.a + ", g=" + this.b + ", b=" + this.c + ", alpha=" + this.d + ')';
    }
}
