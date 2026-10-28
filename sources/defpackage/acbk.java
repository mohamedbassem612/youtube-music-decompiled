package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbk {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public acbk(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public static acbj a() {
        acbj acbjVar = new acbj();
        acbjVar.c(0.0d);
        acbjVar.d(0.0d);
        acbjVar.e(1.0d);
        acbjVar.b(1.0d);
        return acbjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acbk) {
            acbk acbkVar = (acbk) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(acbkVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(acbkVar.b)) {
                    if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(acbkVar.c)) {
                        if (Double.doubleToLongBits(this.d) == Double.doubleToLongBits(acbkVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.a;
        long jDoubleToLongBits = (Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d);
        double d2 = this.b;
        long jDoubleToLongBits2 = (Double.doubleToLongBits(d2) >>> 32) ^ Double.doubleToLongBits(d2);
        double d3 = this.c;
        long jDoubleToLongBits3 = (Double.doubleToLongBits(d3) >>> 32) ^ Double.doubleToLongBits(d3);
        double d4 = this.d;
        return ((((((((int) jDoubleToLongBits) ^ 1000003) * 1000003) ^ ((int) jDoubleToLongBits2)) * 1000003) ^ ((int) jDoubleToLongBits3)) * 1000003) ^ ((int) ((Double.doubleToLongBits(d4) >>> 32) ^ Double.doubleToLongBits(d4)));
    }

    public final String toString() {
        return "CaptionContainerOverlayInstruction{containerTopLeftCornerXRatio=" + this.a + ", containerTopLeftCornerYRatio=" + this.b + ", containerWidthRatio=" + this.c + ", containerHeightRatio=" + this.d + '}';
    }

    public acbk() {
        throw null;
    }
}
