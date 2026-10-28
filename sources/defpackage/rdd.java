package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdd {
    public final boolean a;
    public final long b;
    public final int c;
    public final int d;

    public rdd(boolean z, long j, int i, int i2) {
        this.a = z;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public static rdc a() {
        rdc rdcVar = new rdc();
        rdcVar.b(false);
        rdcVar.e(1L);
        rdcVar.d(1);
        rdcVar.c(0);
        return rdcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdd) {
            rdd rddVar = (rdd) obj;
            if (this.a == rddVar.a && this.b == rddVar.b && this.c == rddVar.c && this.d == rddVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ ((int) this.b)) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "FrameDroppingConfig{canDropFrames=" + this.a + ", minFramesToProcess=" + this.b + ", maxDropFrames=" + this.c + ", dropFramesTolerance=" + this.d + '}';
    }

    public rdd() {
        throw null;
    }
}
