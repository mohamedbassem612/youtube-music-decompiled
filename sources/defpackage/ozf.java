package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozf {
    public final ozg a;
    public final int b;

    public ozf(ozg ozgVar, int i) {
        this.a = ozgVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozf) {
            ozf ozfVar = (ozf) obj;
            if (this.a.equals(ozfVar.a)) {
                int i = this.b;
                int i2 = ozfVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.bj(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.b;
        String strValueOf = String.valueOf(this.a);
        if (i == 1) {
            str = "UNKNOWN_PREFERENCE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "NOTIFY";
        } else {
            str = "DROP";
        }
        return a.ch((byte) 125, str, strValueOf, "PreferenceEntry{preferenceKey=", ", preference=");
    }

    public ozf() {
        throw null;
    }
}
