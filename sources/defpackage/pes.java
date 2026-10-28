package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pes {
    public final aiff a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public pes(aiff aiffVar, String str, int i, int i2, int i3, long j, int i4) {
        this.a = aiffVar;
        this.b = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.c = j;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pes) {
            pes pesVar = (pes) obj;
            if (awrc.c(this.a, pesVar.a) && awrc.c(this.b, pesVar.b) && this.d == pesVar.d && this.e == pesVar.e && this.f == pesVar.f && this.c == pesVar.c && this.g == pesVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + a.ak(this.c)) * 31) + this.g;
    }

    public final String toString() {
        return "SdkBatchUpdateKey(threadStateUpdate=" + this.a + ", actionId=" + this.b + ", eventSource=" + ((Object) Integer.toString(this.d - 1)) + ", updateThreadReason=" + ((Object) Integer.toString(this.e - 1)) + ", eventSourceTarget=" + ((Object) Integer.toString(this.f - 2)) + ", eventTimestampUsec=" + this.c + ", dropReason=" + ((Object) Integer.toString(this.g - 1)) + ')';
    }
}
