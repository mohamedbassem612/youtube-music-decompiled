package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyb {
    public final float a;
    public final boolean b;

    public tyb(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyb) {
            tyb tybVar = (tyb) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(tybVar.a) && this.b == tybVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "UpdatedBatteryStatus{batteryLevel=" + this.a + ", isPluggedIn=" + this.b + '}';
    }

    public tyb() {
        throw null;
    }
}
