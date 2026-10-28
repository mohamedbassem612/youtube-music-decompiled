package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrn {
    private final aobj a;
    private final int b;

    public rrn(aobj aobjVar, int i) {
        this.a = aobjVar;
        this.b = i;
    }

    public static rrm a() {
        rrm rrmVar = new rrm();
        rrmVar.b(aobj.EFFECTIVE_CONNECTION_TYPE_UNKNOWN);
        rrmVar.a = 1;
        return rrmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrn) {
            rrn rrnVar = (rrn) obj;
            if (this.a.equals(rrnVar.a)) {
                int i = this.b;
                int i2 = rrnVar.b;
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
            str = "OTHER";
        } else if (i != 2) {
            str = i != 3 ? "null" : "WIFI";
        } else {
            str = "CELLULAR";
        }
        return a.ch((byte) 125, str, strValueOf, "NetworkSignalsResult{effectiveConnectionType=", ", networkTransportType=");
    }

    public rrn() {
        throw null;
    }
}
