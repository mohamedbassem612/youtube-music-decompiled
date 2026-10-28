package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fmo {
    public final fmp a;
    public final float b;

    public fmo(fmp fmpVar, float f) {
        this.a = fmpVar;
        this.b = f;
    }

    public final flq a() {
        return this.a.a;
    }

    public final fmh b() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fmo fmoVar = (fmo) obj;
            if (Float.compare(fmoVar.b, this.b) == 0 && this.a.equals(fmoVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        float f = this.b;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        return "PropertyAnimation{ PropertyHandle=" + this.a.toString() + ", TargetValue=" + this.b + '}';
    }
}
