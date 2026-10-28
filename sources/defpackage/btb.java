package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btb {
    public static final btb a = new btb(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    static {
        int i = bwp.a;
    }

    public btb(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            btb btbVar = (btb) obj;
            if (this.b == btbVar.b && this.c == btbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) + 527) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return bwp.K("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
