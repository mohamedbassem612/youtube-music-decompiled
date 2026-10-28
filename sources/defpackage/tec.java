package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tec {
    public final long a;
    public final double b;

    public tec(long j, double d) {
        this.a = j;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tec) {
            tec tecVar = (tec) obj;
            if (this.a == tecVar.a && Double.compare(this.b, tecVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (a.ak(this.a) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "HeapPollingConfig(jvmHeapPollingIntervalMs=" + this.a + ", jvmHeapThreshold=" + this.b + ')';
    }
}
