package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvp {
    public final String a;
    public final double b;

    public acvp(String str, double d) {
        if (str == null) {
            throw new NullPointerException("Null smartScaleMode");
        }
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acvp) {
            acvp acvpVar = (acvp) obj;
            if (this.a.equals(acvpVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(acvpVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        double d = this.b;
        return (iHashCode * 1000003) ^ ((int) ((Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d)));
    }

    public final String toString() {
        return "SmartScaleState{smartScaleMode=" + this.a + ", smartScaleWasteRate=" + this.b + '}';
    }

    public acvp() {
        throw null;
    }
}
