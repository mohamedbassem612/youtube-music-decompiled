package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txh {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public txh(long j, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof txh) {
            txh txhVar = (txh) obj;
            if (this.a == txhVar.a && this.b == txhVar.b && this.c == txhVar.c && this.d == txhVar.d && this.e == txhVar.e && this.f == txhVar.f && this.g == txhVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        return "NewFileConfig{epochMillis=" + this.a + ", itemStateBits=" + this.b + ", itemSizeBits=" + this.c + ", itemTimeStampBits=" + this.d + ", itemCheckSumBits=" + this.e + ", firstItemOffset=" + this.f + ", userVersion=" + this.g + '}';
    }

    public txh() {
        throw null;
    }
}
