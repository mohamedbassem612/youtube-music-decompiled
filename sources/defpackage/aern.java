package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aern {
    public static final aern a = new aern(0.0f, 0);
    public final float b;
    public final int c;

    public aern(float f, int i) {
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aern) {
            aern aernVar = (aern) obj;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(aernVar.b) && this.c == aernVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) ^ 1000003) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "PollingTime{pollingWeight=" + this.b + ", pollingTimeMs=" + this.c + '}';
    }

    public aern() {
        throw null;
    }
}
