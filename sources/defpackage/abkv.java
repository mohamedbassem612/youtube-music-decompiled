package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abkv {
    public final float a;
    public final float b;
    public final Duration c;

    public abkv(float f, float f2, Duration duration) {
        this.a = f;
        this.b = f2;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.c = duration;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public static abkv a(float f, float f2, Duration duration) {
        boolean z = f >= 0.0f && f <= 1.0f;
        Float fValueOf = Float.valueOf(f);
        ahno.K(z, "input is not a valid opacity: %s", fValueOf);
        ahno.K(f2 >= 0.0f && f2 <= 1.0f, "input is not a valid opacity: %s", fValueOf);
        ahno.K(((duration.toMillis() > 0L ? 1 : (duration.toMillis() == 0L ? 0 : -1)) ^ (-1)) >>> 31, "duration is negative: %s", duration);
        return new abkv(f, f2, duration);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abkv) {
            abkv abkvVar = (abkv) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(abkvVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(abkvVar.b) && this.c.equals(abkvVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AlphaAnimationStep{startAlpha=" + this.a + ", endAlpha=" + this.b + ", duration=" + this.c.toString() + '}';
    }

    public abkv() {
        throw null;
    }
}
