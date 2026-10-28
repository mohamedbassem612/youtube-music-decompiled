package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends h {
    public final boolean g;

    public f(j$.time.temporal.a aVar) {
        this(aVar, 0, 9, true, 0);
        Objects.a(aVar, "field");
        j$.time.temporal.q qVar = aVar.b;
        if (qVar.a == qVar.b && qVar.c == qVar.d) {
            return;
        }
        j$.time.g.a("Field must have a fixed set of values: ".concat(String.valueOf(aVar)));
        throw null;
    }

    @Override // j$.time.format.h
    public final boolean a(r rVar) {
        return rVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.h
    public final h b() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.h
    public final h c(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.h, j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = tVar.a(nVar);
        if (lA == null) {
            return false;
        }
        tVar.b.getClass();
        int i = v.a;
        long jLongValue = lA.longValue();
        j$.time.temporal.q qVarRange = nVar.range();
        qVarRange.b(jLongValue, nVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(qVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(qVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        byte b = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), (int) b), (int) this.c), roundingMode).toPlainString().substring(2);
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
        } else if (b > 0) {
            if (z) {
                sb.append('.');
            }
            for (int i2 = 0; i2 < b; i2++) {
                sb.append('0');
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r4 < r0) goto L35;
     */
    @Override // j$.time.format.h, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(j$.time.format.r r12, java.lang.CharSequence r13, int r14) {
        /*
            r11 = this;
            boolean r0 = r12.c
            r1 = 0
            if (r0 != 0) goto Ld
            boolean r0 = r11.a(r12)
            if (r0 != 0) goto Ld
            r0 = r1
            goto Lf
        Ld:
            byte r0 = r11.b
        Lf:
            boolean r2 = r12.c
            r3 = 9
            if (r2 != 0) goto L1d
            boolean r2 = r11.a(r12)
            if (r2 != 0) goto L1d
            r2 = r3
            goto L1f
        L1d:
            byte r2 = r11.c
        L1f:
            int r4 = r13.length()
            if (r14 != r4) goto L28
            if (r0 <= 0) goto La1
            goto L38
        L28:
            boolean r5 = r11.g
            if (r5 == 0) goto L3c
            char r5 = r13.charAt(r14)
            int r6 = j$.time.format.v.a
            r6 = 46
            if (r5 == r6) goto L3a
            if (r0 <= 0) goto La1
        L38:
            int r14 = ~r14
            goto La1
        L3a:
            int r14 = r14 + 1
        L3c:
            r9 = r14
            int r0 = r0 + r9
            if (r0 > r4) goto L5c
            int r2 = r2 + r9
            int r14 = java.lang.Math.min(r2, r4)
            r2 = r1
            r10 = r9
        L47:
            if (r10 >= r14) goto L63
            int r4 = r10 + 1
            char r5 = r13.charAt(r10)
            int r6 = j$.time.format.v.a
            int r5 = r5 + (-48)
            if (r5 < 0) goto L57
            if (r5 <= r3) goto L58
        L57:
            r5 = -1
        L58:
            if (r5 >= 0) goto L5e
            if (r4 >= r0) goto L63
        L5c:
            int r14 = ~r9
            goto La1
        L5e:
            int r2 = r2 * 10
            int r2 = r2 + r5
            r10 = r4
            goto L47
        L63:
            java.math.BigDecimal r13 = new java.math.BigDecimal
            r13.<init>(r2)
            int r14 = r10 - r9
            java.math.BigDecimal r13 = r13.movePointLeft(r14)
            j$.time.temporal.n r6 = r11.a
            j$.time.temporal.q r11 = r6.range()
            long r2 = r11.a
            java.math.BigDecimal r14 = java.math.BigDecimal.valueOf(r2)
            long r2 = r11.d
            java.math.BigDecimal r11 = java.math.BigDecimal.valueOf(r2)
            java.math.BigDecimal r11 = r11.subtract(r14)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r11 = r11.add(r0)
            java.math.BigDecimal r11 = r13.multiply(r11)
            java.math.RoundingMode r13 = java.math.RoundingMode.FLOOR
            java.math.BigDecimal r11 = r11.setScale(r1, r13)
            java.math.BigDecimal r11 = r11.add(r14)
            long r7 = r11.longValueExact()
            r5 = r12
            int r14 = r5.f(r6, r7, r9, r10)
        La1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.f.k(j$.time.format.r, java.lang.CharSequence, int):int");
    }

    @Override // j$.time.format.h
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + ((int) this.b) + "," + ((int) this.c) + str + ")";
    }

    public f(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, y.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
