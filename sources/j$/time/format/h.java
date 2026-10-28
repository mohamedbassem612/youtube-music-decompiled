package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class h implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.n a;
    public final byte b;
    public final byte c;
    public final y d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(j$.time.temporal.n nVar, int i, int i2, y yVar) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = yVar;
        this.e = 0;
    }

    public boolean a(r rVar) {
        int i = this.e;
        return i == -1 || (i > 0 && this.b == this.c && this.d == y.NOT_NEGATIVE);
    }

    public h b() {
        if (this.e == -1) {
            return this;
        }
        return new h(this.a, this.b, this.c, this.d, -1);
    }

    public h c(int i) {
        return new h(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean h(t tVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = tVar.a(nVar);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        tVar.b.getClass();
        int i = v.a;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        byte b = this.c;
        if (length > b) {
            throw new j$.time.b("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + ((int) b));
        }
        byte b2 = this.b;
        y yVar = this.d;
        if (jLongValue >= 0) {
            int i2 = b.a[yVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    sb.append('+');
                }
            } else if (b2 < 19 && jLongValue >= f[b2]) {
                sb.append('+');
            }
        } else {
            int i3 = b.a[yVar.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                sb.append('-');
            } else if (i3 == 4) {
                throw new j$.time.b("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i4 = 0; i4 < b2 - string.length(); i4++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0157  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e  */
    /* JADX WARN: Code duplicated, block: B:110:0x010b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0148, code lost:
    
        if (r3 > r9) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0142, code lost:
    
        if (r3 <= r9) goto L98;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k(j$.time.format.r r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.h.k(j$.time.format.r, java.lang.CharSequence, int):int");
    }

    public String toString() {
        j$.time.temporal.n nVar = this.a;
        y yVar = this.d;
        byte b = this.c;
        byte b2 = this.b;
        if (b2 == 1 && b == 19 && yVar == y.NORMAL) {
            return j$.desugar.sun.nio.fs.i.a("Value(", String.valueOf(nVar), ")");
        }
        if (b2 == b && yVar == y.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(nVar) + "," + ((int) b2) + ")";
        }
        return "Value(" + String.valueOf(nVar) + "," + ((int) b2) + "," + ((int) b) + "," + String.valueOf(yVar) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(j$.time.temporal.n nVar, int i, int i2, y yVar, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = yVar;
        this.e = i3;
    }
}
