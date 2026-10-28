package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyg extends cxp {
    public static final bcy a = new bcy();
    private final bcy b;

    public cyg(bcy bcyVar) {
        this.b = bcyVar;
    }

    public static boolean d(int i) {
        return i >= 2 && i <= 4;
    }

    private static int e(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int f(byte[] bArr, int i, int i2) {
        int iG = g(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iG;
        }
        while (true) {
            int length = bArr.length;
            if (iG >= length - 1) {
                return length;
            }
            int i3 = iG + 1;
            if ((iG - i) % 2 == 0 && bArr[i3] == 0) {
                return iG;
            }
            iG = g(bArr, i3);
        }
    }

    private static int g(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int h(bwb bwbVar, int i) {
        byte[] bArr = bwbVar.b;
        int i2 = bwbVar.c;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    private static agke i(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return agke.q("");
        }
        agjz agjzVar = new agjz(4);
        int iF = f(bArr, i2, i);
        while (i2 < iF) {
            agjzVar.h(new String(bArr, i2, iF - i2, l(i)));
            i2 = e(i) + iF;
            iF = f(bArr, i2, i);
        }
        agke agkeVarG = agjzVar.g();
        return agkeVarG.isEmpty() ? agke.q("") : agkeVarG;
    }

    private static String j(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String k(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset l(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:24:0x0068, B:35:0x0083, B:36:0x0085, B:38:0x008a, B:41:0x0095, B:26:0x0072, B:30:0x0079, B:8:0x0020), top: B:48:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:24:0x0068, B:35:0x0083, B:36:0x0085, B:38:0x008a, B:41:0x0095, B:26:0x0072, B:30:0x0079, B:8:0x0020), top: B:48:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0006, B:7:0x0013, B:17:0x0039, B:19:0x0041, B:21:0x0063, B:24:0x0068, B:35:0x0083, B:36:0x0085, B:38:0x008a, B:41:0x0095, B:26:0x0072, B:30:0x0079, B:8:0x0020), top: B:48:0x0006 }] */
    private static boolean m(bwb bwbVar, int i, int i2, boolean z) {
        boolean z2;
        int iP;
        long jP;
        int iS;
        int i3;
        int i4 = bwbVar.c;
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                if (bwbVar.d() >= i2) {
                    if (i >= 3) {
                        iP = bwbVar.i();
                        jP = bwbVar.w();
                        iS = bwbVar.s();
                    } else {
                        iP = bwbVar.p();
                        jP = bwbVar.p();
                        iS = 0;
                    }
                    if (iP != 0 || jP != 0 || iS != 0) {
                        if (i != 4 || z) {
                            if (i == 4) {
                                i5 = iS & 1;
                                i3 = (iS & 64) == 0 ? 0 : 1;
                            } else if (i == 3) {
                                if ((iS & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iS & SemanticState.Focused) == 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jP < i3 && bwbVar.d() >= jP) {
                                bwbVar.Q((int) jP);
                            }
                        } else if ((8421504 & jP) == 0) {
                            jP = ((jP >> 24) << 21) | (jP & 255) | (((jP >> 8) & 255) << 7) | (((jP >> 16) & 255) << 14);
                            if (i == 4) {
                                i5 = iS & 1;
                                i3 = (iS & 64) == 0 ? 0 : 1;
                            } else if (i == 3) {
                                if ((iS & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iS & SemanticState.Focused) == 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jP < i3) {
                            }
                        }
                        z2 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                bwbVar.P(i4);
                throw th;
            }
        }
        bwbVar.P(i4);
        return z2;
    }

    private static byte[] n(byte[] bArr, int i, int i2) {
        return i2 <= i ? bwp.e : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x025b  */
    /* JADX WARN: Code duplicated, block: B:138:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0262  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x027e A[Catch: Exception -> 0x02ec, OutOfMemoryError -> 0x02ef, all -> 0x04d3, TryCatch #0 {all -> 0x04d3, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03c9, B:205:0x03ee, B:207:0x03f9, B:208:0x0428, B:209:0x0435, B:211:0x0439, B:213:0x0440, B:214:0x0444, B:218:0x045a, B:227:0x046f, B:229:0x0486, B:231:0x049c, B:232:0x04ab, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:149:0x029c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a0 A[Catch: Exception -> 0x02ec, OutOfMemoryError -> 0x02ef, all -> 0x04d3, TryCatch #0 {all -> 0x04d3, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03c9, B:205:0x03ee, B:207:0x03f9, B:208:0x0428, B:209:0x0435, B:211:0x0439, B:213:0x0440, B:214:0x0444, B:218:0x045a, B:227:0x046f, B:229:0x0486, B:231:0x049c, B:232:0x04ab, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b8 A[Catch: Exception -> 0x02ec, OutOfMemoryError -> 0x02ef, all -> 0x04d3, TryCatch #0 {all -> 0x04d3, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03c9, B:205:0x03ee, B:207:0x03f9, B:208:0x0428, B:209:0x0435, B:211:0x0439, B:213:0x0440, B:214:0x0444, B:218:0x045a, B:227:0x046f, B:229:0x0486, B:231:0x049c, B:232:0x04ab, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x033f  */
    /* JADX WARN: Code duplicated, block: B:195:0x03bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:221:0x0463  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bd A[Catch: all -> 0x04d3, Exception -> 0x04d8, OutOfMemoryError -> 0x04da, TRY_LEAVE, TryCatch #0 {all -> 0x04d3, blocks: (B:78:0x00fa, B:80:0x0126, B:82:0x012c, B:94:0x015d, B:98:0x0191, B:106:0x01bc, B:124:0x01fc, B:126:0x0213, B:145:0x026c, B:147:0x027e, B:154:0x02c2, B:156:0x02d8, B:151:0x02a0, B:153:0x02b8, B:171:0x0306, B:178:0x0349, B:181:0x036d, B:184:0x037c, B:187:0x038d, B:188:0x0395, B:190:0x0399, B:192:0x03a0, B:194:0x03a5, B:201:0x03c9, B:205:0x03ee, B:207:0x03f9, B:208:0x0428, B:209:0x0435, B:211:0x0439, B:213:0x0440, B:214:0x0444, B:218:0x045a, B:227:0x046f, B:229:0x0486, B:231:0x049c, B:232:0x04ab, B:237:0x04bd), top: B:253:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:248:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:252:0x0515 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:248:0x04e2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3, types: [cyh] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    private static cyh o(int i, bwb bwbVar, boolean z, int i2, bcy bcyVar) {
        int iQ;
        cyh cyhVar;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ?? r13;
        Throwable th;
        int i5;
        Object cyaVar;
        Object cycVar;
        Object cyeVar;
        byte[] bArr;
        int iG;
        String strAe;
        Object cymVar;
        Object cylVar;
        int iN = bwbVar.n();
        int iN2 = bwbVar.n();
        int iN3 = bwbVar.n();
        int i6 = 0;
        int iN4 = i >= 3 ? bwbVar.n() : 0;
        if (i == 4) {
            iQ = bwbVar.q();
            if (!z) {
                iQ = ((iQ >> 24) << 21) | (iQ & 255) | (((iQ >> 8) & 255) << 7) | (((iQ >> 16) & 255) << 14);
            }
        } else {
            iQ = i == 3 ? bwbVar.q() : bwbVar.p();
        }
        int iS = i >= 3 ? bwbVar.s() : 0;
        if (iN == 0 && iN2 == 0 && iN3 == 0 && iN4 == 0 && iQ == 0 && iS == 0) {
            bwbVar.P(bwbVar.d);
            return null;
        }
        int i7 = bwbVar.c + iQ;
        String str = "Id3Decoder";
        if (i7 > bwbVar.d) {
            bvx.e("Id3Decoder", "Frame size exceeds remaining tag data");
            bwbVar.P(bwbVar.d);
            return null;
        }
        if (bcyVar == null) {
            if (i == 3) {
                int i8 = iS & 64;
                i3 = (iS & SemanticState.Focused) != 0 ? 1 : 0;
                iN = 0;
                z3 = i8 != 0;
                z2 = (iS & 32) != 0;
                i4 = i3;
            } else if (i == 4) {
                boolean z4 = (iS & 64) != 0;
                int i9 = (iS & 8) != 0 ? 1 : 0;
                boolean z5 = (iS & 4) != 0;
                iN = (iS & 2) != 0 ? 1 : 0;
                i4 = iS & 1;
                int i10 = i9;
                z2 = z4;
                i3 = i10;
                z3 = z5;
            } else {
                i3 = 0;
                i4 = 0;
                z2 = false;
                z3 = false;
                iN = 0;
            }
            if (i3 == 0 && !z3) {
                if (z2) {
                    bwbVar.Q(1);
                    iQ--;
                }
                if (i4 != 0) {
                    bwbVar.Q(4);
                    iQ -= 4;
                }
                if (iN != 0) {
                    iQ = h(bwbVar, iQ);
                }
                ?? r15 = 2;
                try {
                    try {
                        if (iN == 84 && iN2 == 88 && iN3 == 88 && (i == 2 || iN4 == 88)) {
                            if (iQ > 0) {
                                int iN5 = bwbVar.n();
                                int i11 = iQ - 1;
                                byte[] bArr2 = new byte[i11];
                                bwbVar.K(bArr2, 0, i11);
                                int iF = f(bArr2, 0, iN5);
                                cylVar = new cym("TXXX", new String(bArr2, 0, iF, l(iN5)), i(bArr2, iN5, iF + e(iN5)));
                                cymVar = cylVar;
                                str = "Id3Decoder";
                                cyeVar = cymVar;
                                th = null;
                                cyaVar = cyeVar;
                            }
                            iN = iN;
                            str = "Id3Decoder";
                            cyeVar = null;
                            th = null;
                            cyaVar = cyeVar;
                        } else {
                            if (iN == 84) {
                                String strK = k(i, 84, iN2, iN3, iN4);
                                if (iQ > 0) {
                                    int iN6 = bwbVar.n();
                                    int i12 = iQ - 1;
                                    byte[] bArr3 = new byte[i12];
                                    bwbVar.K(bArr3, 0, i12);
                                    cymVar = new cym(strK, null, i(bArr3, iN6, 0));
                                    str = "Id3Decoder";
                                    cyeVar = cymVar;
                                    th = null;
                                    cyaVar = cyeVar;
                                }
                            } else {
                                if (iN == 87) {
                                    if (iN2 != 88 || iN3 != 88 || (i != 2 && iN4 != 88)) {
                                        i5 = 87;
                                    } else if (iQ > 0) {
                                        int iN7 = bwbVar.n();
                                        int i13 = iQ - 1;
                                        byte[] bArr4 = new byte[i13];
                                        bwbVar.K(bArr4, 0, i13);
                                        int iF2 = f(bArr4, 0, iN7);
                                        String str2 = new String(bArr4, 0, iF2, l(iN7));
                                        int iE = iF2 + e(iN7);
                                        cylVar = new cyn("WXXX", str2, j(bArr4, iE, g(bArr4, iE), StandardCharsets.ISO_8859_1));
                                    }
                                    cymVar = cylVar;
                                    str = "Id3Decoder";
                                    cyeVar = cymVar;
                                    th = null;
                                    cyaVar = cyeVar;
                                } else {
                                    i5 = iN;
                                }
                                if (i5 == 87) {
                                    String strK2 = k(i, 87, iN2, iN3, iN4);
                                    byte[] bArr5 = new byte[iQ];
                                    bwbVar.K(bArr5, 0, iQ);
                                    cylVar = new cyn(strK2, null, new String(bArr5, 0, g(bArr5, 0), StandardCharsets.ISO_8859_1));
                                } else {
                                    if (i5 == 80) {
                                        if (iN2 == 82 && iN3 == 73 && iN4 == 86) {
                                            byte[] bArr6 = new byte[iQ];
                                            bwbVar.K(bArr6, 0, iQ);
                                            int iG2 = g(bArr6, 0);
                                            cylVar = new cyl(new String(bArr6, 0, iG2, StandardCharsets.ISO_8859_1), n(bArr6, iG2 + 1, iQ));
                                        } else {
                                            i5 = 80;
                                        }
                                    }
                                    try {
                                        if (i5 != 71) {
                                            try {
                                                if (i == 2) {
                                                    if (i5 == 80) {
                                                        r15 = 73;
                                                        r15 = 73;
                                                        if (iN2 != 73 && iN3 == 67) {
                                                            int iN8 = bwbVar.n();
                                                            Charset charsetL = l(iN8);
                                                            int i14 = iQ - 1;
                                                            bArr = new byte[i14];
                                                            bwbVar.K(bArr, 0, i14);
                                                            if (i == 2) {
                                                                strAe = "image/".concat(String.valueOf(ahno.ae(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                                if ("image/jpg".equals(strAe)) {
                                                                    strAe = "image/jpeg";
                                                                }
                                                                iG = 2;
                                                            } else {
                                                                iG = g(bArr, 0);
                                                                strAe = ahno.ae(new String(bArr, 0, iG, StandardCharsets.ISO_8859_1));
                                                                if (strAe.indexOf(47) == -1) {
                                                                    strAe = "image/".concat(String.valueOf(strAe));
                                                                }
                                                            }
                                                            int i15 = bArr[iG + 1] & 255;
                                                            int i16 = iG + 2;
                                                            int iF3 = f(bArr, i16, iN8);
                                                            iN = iN;
                                                            cyeVar = new cxz(strAe, new String(bArr, i16, iF3 - i16, charsetL), i15, n(bArr, iF3 + e(iN8), i14));
                                                        }
                                                    }
                                                    iN = iN;
                                                    if (i5 == 67 || iN2 != 79 || iN3 != 77 || (iN4 != 77 && i != 2)) {
                                                        if (i5 != 67 && iN2 == 72 && iN3 == 65 && iN4 == 80) {
                                                            int i17 = bwbVar.c;
                                                            int iG3 = g(bwbVar.b, i17);
                                                            String str3 = new String(bwbVar.b, i17, iG3 - i17, StandardCharsets.ISO_8859_1);
                                                            bwbVar.P(iG3 + 1);
                                                            int i18 = bwbVar.i();
                                                            int i19 = bwbVar.i();
                                                            if (i18 > i19) {
                                                                cyeVar = null;
                                                            } else {
                                                                long jW = bwbVar.w();
                                                                if (jW == 4294967295L) {
                                                                    jW = -1;
                                                                }
                                                                long j = jW;
                                                                long jW2 = bwbVar.w();
                                                                if (jW2 == 4294967295L) {
                                                                    jW2 = -1;
                                                                }
                                                                long j2 = jW2;
                                                                ArrayList arrayList = new ArrayList();
                                                                int i20 = i17 + iQ;
                                                                while (bwbVar.c < i20) {
                                                                    cyh cyhVarO = o(i, bwbVar, z, i2, null);
                                                                    if (cyhVarO != null) {
                                                                        arrayList.add(cyhVarO);
                                                                    }
                                                                    i6 = 0;
                                                                }
                                                                cycVar = new cyb(str3, i18, i19, j, j2, (cyh[]) arrayList.toArray(new cyh[i6]));
                                                            }
                                                        } else if (i5 != 67 && iN2 == 84 && iN3 == 79 && iN4 == 67) {
                                                            int i21 = bwbVar.c;
                                                            int iG4 = g(bwbVar.b, i21);
                                                            String str4 = new String(bwbVar.b, i21, iG4 - i21, StandardCharsets.ISO_8859_1);
                                                            bwbVar.P(iG4 + 1);
                                                            int iN9 = bwbVar.n();
                                                            boolean z6 = (iN9 & 2) != 0;
                                                            int i22 = iN9 & 1;
                                                            int iN10 = bwbVar.n();
                                                            String[] strArr = new String[iN10];
                                                            int i23 = 0;
                                                            while (i23 < iN10) {
                                                                int i24 = bwbVar.c;
                                                                int i25 = i21;
                                                                int iG5 = g(bwbVar.b, i24);
                                                                String[] strArr2 = strArr;
                                                                strArr2[i23] = new String(bwbVar.b, i24, iG5 - i24, StandardCharsets.ISO_8859_1);
                                                                bwbVar.P(iG5 + 1);
                                                                i23++;
                                                                i21 = i25;
                                                                iN10 = iN10;
                                                                str4 = str4;
                                                                strArr = strArr2;
                                                            }
                                                            int i26 = i21;
                                                            String str5 = str4;
                                                            String[] strArr3 = strArr;
                                                            ArrayList arrayList2 = new ArrayList();
                                                            int i27 = i26 + iQ;
                                                            while (bwbVar.c < i27) {
                                                                cyh cyhVarO2 = o(i, bwbVar, z, i2, null);
                                                                if (cyhVarO2 != null) {
                                                                    arrayList2.add(cyhVarO2);
                                                                }
                                                            }
                                                            cycVar = new cyc(str5, z6, 1 == i22, strArr3, (cyh[]) arrayList2.toArray(new cyh[0]));
                                                        } else {
                                                            try {
                                                                if (i5 != 77 && iN2 == 76 && iN3 == 76 && iN4 == 84) {
                                                                    int iS2 = bwbVar.s();
                                                                    int iP = bwbVar.p();
                                                                    int iP2 = bwbVar.p();
                                                                    int iN11 = bwbVar.n();
                                                                    int iN12 = bwbVar.n();
                                                                    th = null;
                                                                    dqp dqpVar = new dqp((byte[]) null);
                                                                    dqpVar.n(bwbVar);
                                                                    int i28 = ((iQ - 10) << 3) / (iN11 + iN12);
                                                                    int[] iArr = new int[i28];
                                                                    int[] iArr2 = new int[i28];
                                                                    for (int i29 = 0; i29 < i28; i29++) {
                                                                        int i30 = dqpVar.i(iN11);
                                                                        int i31 = dqpVar.i(iN12);
                                                                        iArr[i29] = i30;
                                                                        iArr2[i29] = i31;
                                                                    }
                                                                    cyaVar = new cyk(iS2, iP, iP2, iArr, iArr2);
                                                                } else {
                                                                    th = null;
                                                                    String strK3 = k(i, i5, iN2, iN3, iN4);
                                                                    byte[] bArr7 = new byte[iQ];
                                                                    bwbVar.K(bArr7, 0, iQ);
                                                                    cyaVar = new cya(strK3, bArr7);
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                bwbVar.P(i7);
                                                                r13 = r15;
                                                                th = e;
                                                            } catch (OutOfMemoryError e2) {
                                                                e = e2;
                                                                bwbVar.P(i7);
                                                                r13 = r15;
                                                                th = e;
                                                            }
                                                        }
                                                        cyeVar = cycVar;
                                                    } else if (iQ >= 4) {
                                                        int iN13 = bwbVar.n();
                                                        Charset charsetL2 = l(iN13);
                                                        byte[] bArr8 = new byte[3];
                                                        bwbVar.K(bArr8, 0, 3);
                                                        String str6 = new String(bArr8, 0, 3);
                                                        int i32 = iQ - 4;
                                                        byte[] bArr9 = new byte[i32];
                                                        bwbVar.K(bArr9, 0, i32);
                                                        int iF4 = f(bArr9, 0, iN13);
                                                        String str7 = new String(bArr9, 0, iF4, charsetL2);
                                                        int iE2 = iF4 + e(iN13);
                                                        cyeVar = new cyd(str6, str7, j(bArr9, iE2, f(bArr9, iE2, iN13), charsetL2));
                                                    } else {
                                                        cyeVar = null;
                                                    }
                                                } else {
                                                    r15 = 73;
                                                    r15 = 73;
                                                    r15 = 73;
                                                    r15 = 73;
                                                    if (i5 != 65 && iN2 == 80 && iN3 == 73 && iN4 == 67) {
                                                        int iN14 = bwbVar.n();
                                                        Charset charsetL3 = l(iN14);
                                                        int i110 = iQ - 1;
                                                        bArr = new byte[i110];
                                                        bwbVar.K(bArr, 0, i110);
                                                        if (i == 2) {
                                                            strAe = "image/".concat(String.valueOf(ahno.ae(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                            if ("image/jpg".equals(strAe)) {
                                                                strAe = "image/jpeg";
                                                            }
                                                            iG = 2;
                                                        } else {
                                                            iG = g(bArr, 0);
                                                            strAe = ahno.ae(new String(bArr, 0, iG, StandardCharsets.ISO_8859_1));
                                                            if (strAe.indexOf(47) == -1) {
                                                                strAe = "image/".concat(String.valueOf(strAe));
                                                            }
                                                        }
                                                        int i111 = bArr[iG + 1] & 255;
                                                        int i112 = iG + 2;
                                                        int iF5 = f(bArr, i112, iN14);
                                                        iN = iN;
                                                        cyeVar = new cxz(strAe, new String(bArr, i112, iF5 - i112, charsetL3), i111, n(bArr, iF5 + e(iN14), i110));
                                                    } else {
                                                        iN = iN;
                                                        if (i5 == 67) {
                                                            if (i5 != 67) {
                                                                if (i5 != 67) {
                                                                }
                                                                if (i5 != 77) {
                                                                    th = null;
                                                                    String strK4 = k(i, i5, iN2, iN3, iN4);
                                                                    byte[] bArr10 = new byte[iQ];
                                                                    bwbVar.K(bArr10, 0, iQ);
                                                                    cyaVar = new cya(strK4, bArr10);
                                                                } else {
                                                                    th = null;
                                                                    String strK5 = k(i, i5, iN2, iN3, iN4);
                                                                    byte[] bArr11 = new byte[iQ];
                                                                    bwbVar.K(bArr11, 0, iQ);
                                                                    cyaVar = new cya(strK5, bArr11);
                                                                }
                                                            } else {
                                                                if (i5 != 67) {
                                                                }
                                                                if (i5 != 77) {
                                                                    th = null;
                                                                    String strK6 = k(i, i5, iN2, iN3, iN4);
                                                                    byte[] bArr12 = new byte[iQ];
                                                                    bwbVar.K(bArr12, 0, iQ);
                                                                    cyaVar = new cya(strK6, bArr12);
                                                                } else {
                                                                    th = null;
                                                                    String strK7 = k(i, i5, iN2, iN3, iN4);
                                                                    byte[] bArr13 = new byte[iQ];
                                                                    bwbVar.K(bArr13, 0, iQ);
                                                                    cyaVar = new cya(strK7, bArr13);
                                                                }
                                                            }
                                                        } else if (i5 != 67) {
                                                            if (i5 != 67) {
                                                            }
                                                            if (i5 != 77) {
                                                                th = null;
                                                                String strK8 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr14 = new byte[iQ];
                                                                bwbVar.K(bArr14, 0, iQ);
                                                                cyaVar = new cya(strK8, bArr14);
                                                            } else {
                                                                th = null;
                                                                String strK9 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr15 = new byte[iQ];
                                                                bwbVar.K(bArr15, 0, iQ);
                                                                cyaVar = new cya(strK9, bArr15);
                                                            }
                                                        } else {
                                                            if (i5 != 67) {
                                                            }
                                                            if (i5 != 77) {
                                                                th = null;
                                                                String strK10 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr16 = new byte[iQ];
                                                                bwbVar.K(bArr16, 0, iQ);
                                                                cyaVar = new cya(strK10, bArr16);
                                                            } else {
                                                                th = null;
                                                                String strK11 = k(i, i5, iN2, iN3, iN4);
                                                                byte[] bArr17 = new byte[iQ];
                                                                bwbVar.K(bArr17, 0, iQ);
                                                                cyaVar = new cya(strK11, bArr17);
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r15 = 0;
                                                bwbVar.P(i7);
                                                r13 = r15;
                                                th = e;
                                                if (r13 == 0) {
                                                    return r13;
                                                }
                                                bvx.f(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                                return r13;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r15 = 0;
                                                bwbVar.P(i7);
                                                r13 = r15;
                                                th = e;
                                                if (r13 == 0) {
                                                    return r13;
                                                }
                                                bvx.f(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                                return r13;
                                            }
                                            if (r13 == 0) {
                                                return r13;
                                            }
                                            bvx.f(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                            return r13;
                                        }
                                        if (iN2 != 69 || iN3 != 79) {
                                            i5 = 71;
                                            if (i == 2) {
                                                if (i5 == 80) {
                                                    r15 = 73;
                                                    r15 = 73;
                                                    if (iN2 != 73) {
                                                    }
                                                }
                                                iN = iN;
                                                if (i5 == 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK12 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr18 = new byte[iQ];
                                                            bwbVar.K(bArr18, 0, iQ);
                                                            cyaVar = new cya(strK12, bArr18);
                                                        } else {
                                                            th = null;
                                                            String strK13 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr19 = new byte[iQ];
                                                            bwbVar.K(bArr19, 0, iQ);
                                                            cyaVar = new cya(strK13, bArr19);
                                                        }
                                                    } else {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK14 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr110 = new byte[iQ];
                                                            bwbVar.K(bArr110, 0, iQ);
                                                            cyaVar = new cya(strK14, bArr110);
                                                        } else {
                                                            th = null;
                                                            String strK15 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr111 = new byte[iQ];
                                                            bwbVar.K(bArr111, 0, iQ);
                                                            cyaVar = new cya(strK15, bArr111);
                                                        }
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK16 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr112 = new byte[iQ];
                                                        bwbVar.K(bArr112, 0, iQ);
                                                        cyaVar = new cya(strK16, bArr112);
                                                    } else {
                                                        th = null;
                                                        String strK17 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr113 = new byte[iQ];
                                                        bwbVar.K(bArr113, 0, iQ);
                                                        cyaVar = new cya(strK17, bArr113);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK18 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr114 = new byte[iQ];
                                                        bwbVar.K(bArr114, 0, iQ);
                                                        cyaVar = new cya(strK18, bArr114);
                                                    } else {
                                                        th = null;
                                                        String strK19 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr115 = new byte[iQ];
                                                        bwbVar.K(bArr115, 0, iQ);
                                                        cyaVar = new cya(strK19, bArr115);
                                                    }
                                                }
                                            } else {
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                if (i5 != 65) {
                                                }
                                                iN = iN;
                                                if (i5 == 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK110 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr116 = new byte[iQ];
                                                            bwbVar.K(bArr116, 0, iQ);
                                                            cyaVar = new cya(strK110, bArr116);
                                                        } else {
                                                            th = null;
                                                            String strK111 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr117 = new byte[iQ];
                                                            bwbVar.K(bArr117, 0, iQ);
                                                            cyaVar = new cya(strK111, bArr117);
                                                        }
                                                    } else {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK112 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr118 = new byte[iQ];
                                                            bwbVar.K(bArr118, 0, iQ);
                                                            cyaVar = new cya(strK112, bArr118);
                                                        } else {
                                                            th = null;
                                                            String strK113 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr119 = new byte[iQ];
                                                            bwbVar.K(bArr119, 0, iQ);
                                                            cyaVar = new cya(strK113, bArr119);
                                                        }
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK114 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr1110 = new byte[iQ];
                                                        bwbVar.K(bArr1110, 0, iQ);
                                                        cyaVar = new cya(strK114, bArr1110);
                                                    } else {
                                                        th = null;
                                                        String strK115 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr1111 = new byte[iQ];
                                                        bwbVar.K(bArr1111, 0, iQ);
                                                        cyaVar = new cya(strK115, bArr1111);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK116 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr1112 = new byte[iQ];
                                                        bwbVar.K(bArr1112, 0, iQ);
                                                        cyaVar = new cya(strK116, bArr1112);
                                                    } else {
                                                        th = null;
                                                        String strK117 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr1113 = new byte[iQ];
                                                        bwbVar.K(bArr1113, 0, iQ);
                                                        cyaVar = new cya(strK117, bArr1113);
                                                    }
                                                }
                                            }
                                            if (r13 == 0) {
                                                return r13;
                                            }
                                            bvx.f(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                            return r13;
                                        }
                                        if (iN4 != 66 && i != 2) {
                                            i5 = 71;
                                            if (i == 2) {
                                                if (i5 == 80) {
                                                    r15 = 73;
                                                    r15 = 73;
                                                    if (iN2 != 73) {
                                                    }
                                                }
                                                iN = iN;
                                                if (i5 == 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK118 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr1114 = new byte[iQ];
                                                            bwbVar.K(bArr1114, 0, iQ);
                                                            cyaVar = new cya(strK118, bArr1114);
                                                        } else {
                                                            th = null;
                                                            String strK119 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr1115 = new byte[iQ];
                                                            bwbVar.K(bArr1115, 0, iQ);
                                                            cyaVar = new cya(strK119, bArr1115);
                                                        }
                                                    } else {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK1110 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr1116 = new byte[iQ];
                                                            bwbVar.K(bArr1116, 0, iQ);
                                                            cyaVar = new cya(strK1110, bArr1116);
                                                        } else {
                                                            th = null;
                                                            String strK1111 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr1117 = new byte[iQ];
                                                            bwbVar.K(bArr1117, 0, iQ);
                                                            cyaVar = new cya(strK1111, bArr1117);
                                                        }
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK1112 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr1118 = new byte[iQ];
                                                        bwbVar.K(bArr1118, 0, iQ);
                                                        cyaVar = new cya(strK1112, bArr1118);
                                                    } else {
                                                        th = null;
                                                        String strK1113 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr1119 = new byte[iQ];
                                                        bwbVar.K(bArr1119, 0, iQ);
                                                        cyaVar = new cya(strK1113, bArr1119);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK1114 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr11110 = new byte[iQ];
                                                        bwbVar.K(bArr11110, 0, iQ);
                                                        cyaVar = new cya(strK1114, bArr11110);
                                                    } else {
                                                        th = null;
                                                        String strK1115 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr11111 = new byte[iQ];
                                                        bwbVar.K(bArr11111, 0, iQ);
                                                        cyaVar = new cya(strK1115, bArr11111);
                                                    }
                                                }
                                            } else {
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                r15 = 73;
                                                if (i5 != 65) {
                                                }
                                                iN = iN;
                                                if (i5 == 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK1116 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr11112 = new byte[iQ];
                                                            bwbVar.K(bArr11112, 0, iQ);
                                                            cyaVar = new cya(strK1116, bArr11112);
                                                        } else {
                                                            th = null;
                                                            String strK1117 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr11113 = new byte[iQ];
                                                            bwbVar.K(bArr11113, 0, iQ);
                                                            cyaVar = new cya(strK1117, bArr11113);
                                                        }
                                                    } else {
                                                        if (i5 != 67) {
                                                        }
                                                        if (i5 != 77) {
                                                            th = null;
                                                            String strK1118 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr11114 = new byte[iQ];
                                                            bwbVar.K(bArr11114, 0, iQ);
                                                            cyaVar = new cya(strK1118, bArr11114);
                                                        } else {
                                                            th = null;
                                                            String strK1119 = k(i, i5, iN2, iN3, iN4);
                                                            byte[] bArr11115 = new byte[iQ];
                                                            bwbVar.K(bArr11115, 0, iQ);
                                                            cyaVar = new cya(strK1119, bArr11115);
                                                        }
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK11110 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr11116 = new byte[iQ];
                                                        bwbVar.K(bArr11116, 0, iQ);
                                                        cyaVar = new cya(strK11110, bArr11116);
                                                    } else {
                                                        th = null;
                                                        String strK11111 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr11117 = new byte[iQ];
                                                        bwbVar.K(bArr11117, 0, iQ);
                                                        cyaVar = new cya(strK11111, bArr11117);
                                                    }
                                                } else {
                                                    if (i5 != 67) {
                                                    }
                                                    if (i5 != 77) {
                                                        th = null;
                                                        String strK11112 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr11118 = new byte[iQ];
                                                        bwbVar.K(bArr11118, 0, iQ);
                                                        cyaVar = new cya(strK11112, bArr11118);
                                                    } else {
                                                        th = null;
                                                        String strK11113 = k(i, i5, iN2, iN3, iN4);
                                                        byte[] bArr11119 = new byte[iQ];
                                                        bwbVar.K(bArr11119, 0, iQ);
                                                        cyaVar = new cya(strK11113, bArr11119);
                                                    }
                                                }
                                            }
                                            if (r13 == 0) {
                                                return r13;
                                            }
                                            bvx.f(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                                            return r13;
                                        }
                                        try {
                                            int iN15 = bwbVar.n();
                                            Charset charsetL4 = l(iN15);
                                            int i33 = iQ - 1;
                                            byte[] bArr20 = new byte[i33];
                                            bwbVar.K(bArr20, 0, i33);
                                            int iG6 = g(bArr20, 0);
                                            str = "Id3Decoder";
                                            String strG = bsy.g(new String(bArr20, 0, iG6, StandardCharsets.ISO_8859_1));
                                            int i34 = iG6 + 1;
                                            int iF6 = f(bArr20, i34, iN15);
                                            String strJ = j(bArr20, i34, iF6, charsetL4);
                                            int iE3 = iF6 + e(iN15);
                                            int iF7 = f(bArr20, iE3, iN15);
                                            iN = iN;
                                            cyeVar = new cye(strG, strJ, j(bArr20, iE3, iF7, charsetL4), n(bArr20, iF7 + e(iN15), i33));
                                        } catch (Exception e5) {
                                            e = e5;
                                            str = "Id3Decoder";
                                            iN = iN;
                                            r15 = 0;
                                            bwbVar.P(i7);
                                            r13 = r15;
                                            th = e;
                                        } catch (OutOfMemoryError e6) {
                                            e = e6;
                                            str = "Id3Decoder";
                                            iN = iN;
                                            r15 = 0;
                                            bwbVar.P(i7);
                                            r13 = r15;
                                            th = e;
                                        }
                                        th = null;
                                        cyaVar = cyeVar;
                                    } catch (Exception e7) {
                                        e = e7;
                                    } catch (OutOfMemoryError e8) {
                                        e = e8;
                                    }
                                }
                                cymVar = cylVar;
                                str = "Id3Decoder";
                                cyeVar = cymVar;
                                th = null;
                                cyaVar = cyeVar;
                            }
                            iN = iN;
                            str = "Id3Decoder";
                            cyeVar = null;
                            th = null;
                            cyaVar = cyeVar;
                        }
                        bwbVar.P(i7);
                        r13 = cyaVar;
                    } catch (Throwable th2) {
                        bwbVar.P(i7);
                        throw th2;
                    }
                } catch (Exception | OutOfMemoryError e9) {
                    e = e9;
                    iN = iN;
                    str = "Id3Decoder";
                }
                if (r13 == 0) {
                    return r13;
                }
                bvx.f(str, "Failed to decode frame: id=" + k(i, iN, iN2, iN3, iN4) + ", frameSize=" + iQ, th);
                return r13;
            }
            cyhVar = null;
            bvx.e("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            bwbVar.P(i7);
        } else {
            cyhVar = null;
            bwbVar.P(i7);
        }
        return cyhVar;
    }

    @Override // defpackage.cxp
    protected final bsx b(cxn cxnVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final bsx c(byte[] bArr, int i) {
        cyf cyfVar;
        int i2;
        int i3;
        boolean z;
        int iH;
        boolean z2;
        cyh cyhVarO;
        ArrayList arrayList = new ArrayList();
        bwb bwbVar = new bwb(bArr, i);
        int i4 = 4;
        if (bwbVar.d() < 10) {
            bvx.e("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iP = bwbVar.p();
            if (iP != 4801587) {
                bvx.e("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(iP)))));
            } else {
                int iN = bwbVar.n();
                if (d(iN)) {
                    bwbVar.Q(1);
                    int iN2 = bwbVar.n();
                    int iM = bwbVar.m();
                    if (iN == 2) {
                        if ((iN2 & 64) != 0) {
                            bvx.e("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        }
                        if (cyfVar == null) {
                            return null;
                        }
                        int i5 = bwbVar.c;
                        i2 = cyfVar.a;
                        i3 = i2 == 2 ? 6 : 10;
                        z = cyfVar.b;
                        iH = cyfVar.c;
                        if (z) {
                            iH = h(bwbVar, iH);
                        }
                        bwbVar.O(i5 + iH);
                        if (!m(bwbVar, i2, i3, false)) {
                            if (i2 == 4) {
                                z2 = m(bwbVar, 4, i3, true);
                            } else {
                                i4 = i2;
                            }
                            bvx.e("Id3Decoder", a.bR(i4, "Failed to validate ID3 tag with majorVersion="));
                            return null;
                        }
                        while (bwbVar.d() >= i3) {
                            cyhVarO = o(i2, bwbVar, z2, i3, this.b);
                            if (cyhVarO != null) {
                                arrayList.add(cyhVarO);
                            }
                        }
                        return new bsx(arrayList);
                    }
                    if (iN == 3) {
                        if ((iN2 & 64) != 0) {
                            int i6 = bwbVar.i();
                            bwbVar.Q(i6);
                            iM -= i6 + 4;
                        }
                    } else if (iN == 4) {
                        if ((iN2 & 64) != 0) {
                            int iM2 = bwbVar.m();
                            bwbVar.Q(iM2 - 4);
                            iM -= iM2;
                        }
                        if ((iN2 & 16) != 0) {
                            iM -= 10;
                        }
                        iN = 4;
                    }
                    cyfVar = new cyf(iN, iN < 4 && (iN2 & SemanticState.Focused) != 0, iM);
                    if (cyfVar == null) {
                        return null;
                    }
                    int i7 = bwbVar.c;
                    i2 = cyfVar.a;
                    if (i2 == 2) {
                    }
                    z = cyfVar.b;
                    iH = cyfVar.c;
                    if (z) {
                        iH = h(bwbVar, iH);
                    }
                    bwbVar.O(i7 + iH);
                    if (!m(bwbVar, i2, i3, false)) {
                        if (i2 == 4) {
                            i4 = i2;
                        } else if (m(bwbVar, 4, i3, true)) {
                        }
                        bvx.e("Id3Decoder", a.bR(i4, "Failed to validate ID3 tag with majorVersion="));
                        return null;
                    }
                    while (bwbVar.d() >= i3) {
                        cyhVarO = o(i2, bwbVar, z2, i3, this.b);
                        if (cyhVarO != null) {
                            arrayList.add(cyhVarO);
                        }
                    }
                    return new bsx(arrayList);
                }
                bvx.e("Id3Decoder", a.bR(iN, "Skipped ID3 tag with unsupported majorVersion="));
            }
        }
        cyfVar = null;
        if (cyfVar == null) {
            return null;
        }
        int i8 = bwbVar.c;
        i2 = cyfVar.a;
        if (i2 == 2) {
        }
        z = cyfVar.b;
        iH = cyfVar.c;
        if (z) {
            iH = h(bwbVar, iH);
        }
        bwbVar.O(i8 + iH);
        if (!m(bwbVar, i2, i3, false)) {
            if (i2 == 4) {
                i4 = i2;
            } else if (m(bwbVar, 4, i3, true)) {
            }
            bvx.e("Id3Decoder", a.bR(i4, "Failed to validate ID3 tag with majorVersion="));
            return null;
        }
        while (bwbVar.d() >= i3) {
            cyhVarO = o(i2, bwbVar, z2, i3, this.b);
            if (cyhVarO != null) {
                arrayList.add(cyhVarO);
            }
        }
        return new bsx(arrayList);
    }
}
