package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdv {
    public static final cdv a;
    public static final cdv b;
    public static final cdv c;
    public final long d;
    public final long e;

    static {
        cdv cdvVar = new cdv(0L, 0L);
        a = cdvVar;
        new cdv(Long.MAX_VALUE, Long.MAX_VALUE);
        b = new cdv(Long.MAX_VALUE, 0L);
        new cdv(0L, Long.MAX_VALUE);
        c = cdvVar;
    }

    public cdv(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (java.lang.Math.abs(r13 - r11) <= java.lang.Math.abs(r15 - r11)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r11, long r13, long r15) {
        /*
            r10 = this;
            long r0 = r10.d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r4 = r10.e
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L7c
        Le:
            int r4 = defpackage.bwp.a
            long r4 = r11 - r0
            long r0 = r0 ^ r11
            long r6 = r11 ^ r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r6 = r6 ^ (-1)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = r0 ^ (-1)
            r0 = r0 | r6
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 >= 0) goto L27
            r6 = r4
            goto L2f
        L27:
            r0 = 63
            long r6 = r4 >>> r0
            r8 = 1
            long r6 = r6 ^ r8
            long r6 = r6 + r1
        L2f:
            r8 = -9223372036854775808
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L3a
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L42
            r4 = r8
        L3a:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L45
        L42:
            r1 = r8
            goto L45
        L44:
            r1 = r6
        L45:
            long r3 = r10.e
            long r3 = defpackage.bwp.ak(r11, r3)
            int r10 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r0 = 1
            r5 = 0
            if (r10 > 0) goto L57
            int r10 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r10 > 0) goto L57
            r10 = r0
            goto L58
        L57:
            r10 = r5
        L58:
            int r6 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r6 > 0) goto L60
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r3 <= 0) goto L61
        L60:
            r0 = r5
        L61:
            if (r10 == 0) goto L77
            if (r0 == 0) goto L75
            long r0 = r13 - r11
            long r11 = r15 - r11
            long r0 = java.lang.Math.abs(r0)
            long r10 = java.lang.Math.abs(r11)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 > 0) goto L79
        L75:
            r11 = r13
            goto L7c
        L77:
            if (r0 == 0) goto L7b
        L79:
            r11 = r15
            goto L7c
        L7b:
            r11 = r1
        L7c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdv.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cdv cdvVar = (cdv) obj;
            if (this.d == cdvVar.d && this.e == cdvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.d) * 31) + ((int) this.e);
    }
}
