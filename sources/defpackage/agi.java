package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agi {
    public long[] a;
    public long[] b;
    public int c;
    public int d;

    public agi(byte[] bArr) {
        long[] jArr = agv.a;
        this.a = jArr;
        this.b = agj.a;
        this.c = 0;
        this.a = jArr;
        jArr[0] = (jArr[0] & (-256)) | 255;
        this.b = new long[0];
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agi) {
            agi agiVar = (agi) obj;
            int i = agiVar.d;
            long[] jArr2 = this.b;
            long[] jArr3 = this.a;
            int length = jArr3.length;
            long j = (~jArr3[0]) & (-9187201950435737472L);
            while (j != 0) {
                long j2 = jArr2[Long.numberOfTrailingZeros(j) >>> 3];
                int iAk = a.ak(j2);
                int i2 = agiVar.c;
                while (true) {
                    long[] jArr4 = agiVar.a;
                    jArr = jArr2;
                    long j3 = jArr4[0];
                    long j4 = jArr4[1];
                    int i3 = ((iAk >>> 16) ^ iAk) * (-862048943);
                    long j5 = (((long) ((i3 ^ (i3 >>> 16)) & 127)) * 72340172838076673L) ^ j3;
                    long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                    while (true) {
                        if (j6 != 0) {
                            if (agiVar.b[0] == j2) {
                                break;
                            }
                            j6 &= j6 - 1;
                        } else if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) == 0) {
                            jArr2 = jArr;
                        }
                    }
                }
                j &= j - 1;
                jArr2 = jArr;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length;
        int iAk = 0;
        long j = ~jArr2[0];
        long j2 = -9187201950435737472L;
        while (true) {
            j &= j2;
            if (j == 0) {
                return iAk;
            }
            iAk += a.ak(jArr[Long.numberOfTrailingZeros(j) >>> 3]);
            j2 = (-1) + j;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length;
        int i = 0;
        long j = ~jArr2[0];
        long j2 = -9187201950435737472L;
        while (true) {
            j &= j2;
            if (j == 0) {
                break;
            }
            long j3 = jArr[Long.numberOfTrailingZeros(j) >>> 3];
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j3);
            i++;
            j2 = (-1) + j;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public agi() {
        this.a = agv.a;
        this.b = agj.a;
    }
}
