package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kiz {
    public static final kiz a = c(1, Double.valueOf(0.0d));
    public static final kiz b = c(3, null);
    public static final kiz c = c(4, null);
    public static final kiz d = c(5, null);
    public static final kiz e = c(2, Double.valueOf(1.0d));
    public final double f;
    private final int g;

    public kiz(int i, double d2) {
        this.g = i;
        this.f = d2;
    }

    public static kiz a(boolean z, double d2) {
        return c(true == z ? 2 : 1, Double.valueOf(d2));
    }

    static kiz c(int i, Double d2) {
        if (d2 == null) {
            d2 = Double.valueOf(0.0d);
        }
        return new kiz(i, d2.doubleValue());
    }

    public final boolean b() {
        return this.g != 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kiz) {
            kiz kizVar = (kiz) obj;
            if (this.g == kizVar.g) {
                if (Double.doubleToLongBits(this.f) == Double.doubleToLongBits(kizVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.f;
        return ((this.g ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(d2) >>> 32) ^ Double.doubleToLongBits(d2)));
    }

    public final String toString() {
        String str;
        int i = this.g;
        if (i == 1) {
            str = "NO_UPLOAD";
        } else if (i == 2) {
            str = "UPLOAD";
        } else if (i != 3) {
            str = i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT";
        } else {
            str = "ALWAYS_UPLOAD_DUE_TO_ERROR";
        }
        return "LogSamplerResult{samplingDecision=" + str + ", overallEffectiveSamplingRate=" + this.f + '}';
    }

    public kiz() {
        throw null;
    }
}
