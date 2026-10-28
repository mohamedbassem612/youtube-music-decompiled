package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeos {
    public final Object a;
    public final int b;

    public aeos(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeos) {
            aeos aeosVar = (aeos) obj;
            if (this.a.equals(aeosVar.a) && this.b == aeosVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        int i = this.b;
        String string = this.a.toString();
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "INVALID" : "STALE";
        } else {
            str = "VALID";
        }
        return a.ch((byte) 125, str, string, "CacheEntry{value=", ", state=");
    }

    public aeos() {
        throw null;
    }
}
