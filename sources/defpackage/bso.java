package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bso {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i = bwp.a;
    }

    public bso(bsn bsnVar) {
        long j = bsnVar.a;
        long j2 = bsnVar.b;
        long j3 = bsnVar.c;
        float f = bsnVar.d;
        float f2 = bsnVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bso) {
            bso bsoVar = (bso) obj;
            if (this.a == bsoVar.a && this.b == bsoVar.b && this.c == bsoVar.c && this.d == bsoVar.d && this.e == bsoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f = this.d;
        int iFloatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        float f2 = this.e;
        return (((((((a.ak(j) * 31) + a.ak(j2)) * 31) + a.ak(j3)) * 31) + iFloatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
