package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxj implements abxp, abxh {
    public static final abxj a = new abxj(1.0f, Float.valueOf(1.0f));
    public final float b;
    public final Float c;
    public final float d;

    public abxj(float f, Float f2) {
        this.b = f;
        this.c = f2;
        if (f2 == null || f2.floatValue() > 0.0f) {
            this.d = f * (f2 != null ? f2.floatValue() : 1.0f);
            return;
        }
        throw new IllegalArgumentException(f2 + " must be greater than 0.0.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxj) {
            abxj abxjVar = (abxj) obj;
            if (Float.compare(this.b, abxjVar.b) == 0 && awrc.c(this.c, abxjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.b) * 31;
        Float f = this.c;
        return iFloatToIntBits + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "PlaybackRateSettingModel(rate=" + this.b + ", scalar=" + this.c + ')';
    }
}
