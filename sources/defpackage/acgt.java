package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acgt {
    public final areu a;
    public final wjf b;
    public final acgv c;
    public final ahbw d;
    public final int e;

    public acgt(areu areuVar, wjf wjfVar, int i, acgv acgvVar, ahbw ahbwVar) {
        this.a = areuVar;
        this.b = wjfVar;
        this.e = i;
        this.c = acgvVar;
        this.d = ahbwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acgt) {
            acgt acgtVar = (acgt) obj;
            if (awrc.c(this.a, acgtVar.a) && awrc.c(this.b, acgtVar.b) && this.e == acgtVar.e && awrc.c(this.c, acgtVar.c) && awrc.c(this.d, acgtVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        areu areuVar = this.a;
        int iHashCode = areuVar == null ? 0 : areuVar.hashCode();
        wjf wjfVar = this.b;
        int iHashCode2 = wjfVar == null ? 0 : wjfVar.hashCode();
        int i = iHashCode * 31;
        int i2 = this.e;
        acgv acgvVar = this.c;
        return ((((((i + iHashCode2) * 31) + i2) * 31) + (acgvVar != null ? acgvVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "StartPositionContext(videoPlaybackPositionEntity=" + this.a + ", playerResponseModel=" + this.b + ", selectedSource=" + ((Object) Integer.toString(this.e - 1)) + ", restoredPlaybackInfo=" + this.c + ", timeSource=" + this.d + ')';
    }
}
