package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ybt {
    public final amyh a;
    public final String b;

    public ybt(amyh amyhVar, String str) {
        amyhVar.getClass();
        this.a = amyhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ybt) {
            ybt ybtVar = (ybt) obj;
            if (this.a == ybtVar.a && awrc.c(this.b, ybtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PollingArgs(frequency=" + this.a + ", discoveryParams=" + this.b + ')';
    }
}
