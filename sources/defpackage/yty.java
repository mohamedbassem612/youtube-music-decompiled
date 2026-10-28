package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yty {
    public final boolean a;
    public final agke b;
    public final Integer c;
    public final String d;

    public yty(boolean z, agke agkeVar, Integer num, String str) {
        this.a = z;
        this.b = agkeVar;
        this.c = num;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yty) {
            yty ytyVar = (yty) obj;
            if (this.a == ytyVar.a && awrc.c(this.b, ytyVar.b) && awrc.c(this.c, ytyVar.c) && awrc.c(this.d, ytyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAj = (a.aj(this.a) * 31) + this.b.hashCode();
        Integer num = this.c;
        int iHashCode = ((iAj * 31) + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DiffResult(isQueueIncompatible=" + this.a + ", videosToQueue=" + this.b + ", indexOfOptimisticAppendMismatch=" + this.c + ", reasonForOptimisticAppendMismatch=" + this.d + ')';
    }
}
