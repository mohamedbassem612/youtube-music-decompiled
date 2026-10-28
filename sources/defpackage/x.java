package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Serializable {
    public static final x a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final p i;
    private static final v j;
    private static final long serialVersionUID = 1;
    public final w h;

    static {
        m mVar = new m();
        i = mVar;
        v vVar = new v("other", mVar, null, null);
        j = vVar;
        w wVar = new w();
        wVar.a(vVar);
        a = new x(wVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    public x(w wVar) {
        this.h = wVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = wVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((v) it.next()).a);
        }
        DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:102:0x0185  */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x019f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x020a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0216  */
    /* JADX WARN: Code duplicated, block: B:142:0x0223  */
    /* JADX WARN: Code duplicated, block: B:144:0x022b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0237  */
    /* JADX WARN: Code duplicated, block: B:149:0x023f  */
    /* JADX WARN: Code duplicated, block: B:152:0x024b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0271  */
    /* JADX WARN: Code duplicated, block: B:163:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0291  */
    /* JADX WARN: Code duplicated, block: B:170:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:186:0x0304  */
    /* JADX WARN: Code duplicated, block: B:190:0x0310  */
    /* JADX WARN: Code duplicated, block: B:193:0x0319  */
    /* JADX WARN: Code duplicated, block: B:195:0x031f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0328  */
    /* JADX WARN: Code duplicated, block: B:202:0x0332  */
    /* JADX WARN: Code duplicated, block: B:204:0x0338  */
    /* JADX WARN: Code duplicated, block: B:212:0x037a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0382  */
    /* JADX WARN: Code duplicated, block: B:215:0x0385  */
    /* JADX WARN: Code duplicated, block: B:217:0x038f A[LOOP:5: B:216:0x038d->B:217:0x038f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x03a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x03c0 A[LOOP:4: B:176:0x02bf->B:228:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:233:0x0401  */
    /* JADX WARN: Code duplicated, block: B:234:0x0403  */
    /* JADX WARN: Code duplicated, block: B:242:0x043d  */
    /* JADX WARN: Code duplicated, block: B:243:0x043f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0467  */
    /* JADX WARN: Code duplicated, block: B:257:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0420 A[EDGE_INSN: B:260:0x0420->B:236:0x0420 BREAK  A[LOOP:1: B:44:0x00cc->B:244:0x0447, LOOP_LABEL: LOOP:1: B:44:0x00cc->B:244:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0420 A[EDGE_INSN: B:261:0x0420->B:236:0x0420 BREAK  A[LOOP:1: B:44:0x00cc->B:244:0x0447, LOOP_LABEL: LOOP:1: B:44:0x00cc->B:244:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0420 A[EDGE_INSN: B:262:0x0420->B:236:0x0420 BREAK  A[LOOP:1: B:44:0x00cc->B:244:0x0447, LOOP_LABEL: LOOP:1: B:44:0x00cc->B:244:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0420 A[EDGE_INSN: B:263:0x0420->B:236:0x0420 BREAK  A[LOOP:1: B:44:0x00cc->B:244:0x0447, LOOP_LABEL: LOOP:1: B:44:0x00cc->B:244:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0420 A[EDGE_INSN: B:264:0x0420->B:236:0x0420 BREAK  A[LOOP:1: B:44:0x00cc->B:244:0x0447, LOOP_LABEL: LOOP:1: B:44:0x00cc->B:244:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0420 A[EDGE_INSN: B:265:0x0420->B:236:0x0420 BREAK  A[LOOP:1: B:44:0x00cc->B:244:0x0447, LOOP_LABEL: LOOP:1: B:44:0x00cc->B:244:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:94:0x0175  */
    /* JADX WARN: Code duplicated, block: B:96:0x0179  */
    /* JADX WARN: Code duplicated, block: B:98:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v24 */
    public static v a(String str) throws ParseException {
        s sVarA;
        s sVarA2;
        boolean zEquals;
        boolean z;
        String[] strArrSplit;
        int i2;
        p tVar;
        p pVar;
        String[] strArrSplit2;
        int i3;
        p nVar;
        p pVar2;
        p pVar3;
        p uVar;
        String strTrim;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        String[] strArr;
        String[] strArr2;
        String str2;
        int iHashCode;
        int i7;
        p pVar4;
        s sVar;
        int i8;
        p pVar5;
        int i9;
        String strD;
        int i10;
        int i11;
        int i12;
        int i13;
        String strD2;
        boolean zEquals2;
        int i14;
        ?? r7;
        String strD3;
        boolean z2;
        ?? r23;
        ArrayList arrayList2;
        String strD4;
        double d2;
        double dMin;
        long j2;
        int length;
        String str3;
        long j3;
        double dMax;
        String str4;
        int size;
        long[] jArr;
        int i15;
        long[] jArr2;
        int i16;
        String strD5;
        int i17;
        int i18;
        String strD6;
        String strD7;
        int i19;
        String strD8;
        int i20;
        String strD9;
        int i21;
        char cCharAt;
        if (str.length() == 0) {
            return j;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int iIndexOf = lowerCase.indexOf(58);
        int i22 = 0;
        if (iIndexOf == -1) {
            throw new ParseException(a.bU((byte) 39, lowerCase, "missing ':' in rule description '"), 0);
        }
        String strTrim2 = lowerCase.substring(0, iIndexOf).trim();
        for (int i23 = 0; i23 < strTrim2.length(); i23++) {
            char cCharAt2 = strTrim2.charAt(i23);
            if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                throw new ParseException(a.bT(strTrim2, "keyword '", " is not valid"), 0);
            }
        }
        String strTrim3 = lowerCase.substring(iIndexOf + 1).trim();
        String[] strArrSplit3 = b.split(strTrim3);
        int length2 = strArrSplit3.length;
        int i24 = 2;
        if (length2 != 1) {
            if (length2 == 2) {
                sVarA = s.a(strArrSplit3[1]);
                if (sVarA.c == 2) {
                    sVarA2 = sVarA;
                    sVarA = null;
                }
            } else {
                if (length2 != 3) {
                    throw new IllegalArgumentException("Too many samples in ".concat(String.valueOf(strTrim3)));
                }
                sVarA = s.a(strArrSplit3[1]);
                sVarA2 = s.a(strArrSplit3[2]);
                if (sVarA.c != 1 || sVarA2.c != 2) {
                    throw new IllegalArgumentException("Must have @integer then @decimal in ".concat(String.valueOf(strTrim3)));
                }
            }
            zEquals = strTrim2.equals("other");
            if (strArrSplit3[0].length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (zEquals == z) {
                throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
            }
            if (zEquals) {
                strArrSplit = c.split(strArrSplit3[0]);
                i2 = 0;
                tVar = null;
                loop1: while (true) {
                    if (i2 < strArrSplit.length) {
                        strArrSplit2 = d.split(strArrSplit[i2]);
                        i3 = i22;
                        nVar = null;
                        while (i3 < strArrSplit2.length) {
                            uVar = i;
                            strTrim = strArrSplit2[i3].trim();
                            arrayList = new ArrayList();
                            i4 = i22;
                            i5 = i24;
                            i6 = -1;
                            while (i22 < strTrim.length()) {
                                int i25 = i22 + 1;
                                cCharAt = strTrim.charAt(i22);
                                String[] strArr3 = strArrSplit;
                                if (cCharAt <= ' ' || !(cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == '\r')) {
                                    if (cCharAt > '=' && cCharAt >= '!' && (cCharAt == '!' || cCharAt == '%' || cCharAt == ',' || cCharAt == '.' || cCharAt == '=')) {
                                        if (i6 >= 0) {
                                            arrayList.add(strTrim.substring(i6, i22));
                                        }
                                        arrayList.add(strTrim.substring(i22, i25));
                                        i6 = -1;
                                    } else if (i6 < 0) {
                                        i6 = i22;
                                    }
                                } else if (i6 >= 0) {
                                    arrayList.add(strTrim.substring(i6, i22));
                                    i6 = -1;
                                }
                                i22 = i25;
                                strArrSplit = strArr3;
                            }
                            strArr = strArrSplit;
                            if (i6 >= 0) {
                                arrayList.add(strTrim.substring(i6));
                            }
                            strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            str2 = strArr2[i4];
                            try {
                                iHashCode = str2.hashCode();
                                if (iHashCode != 102) {
                                    if (str2.equals("f")) {
                                        break loop1;
                                    }
                                    i7 = 3;
                                    if (strArr2.length > 1) {
                                        strD = strArr2[1];
                                        if ("mod".equals(strD)) {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        } else {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        }
                                        if ("not".equals(strD)) {
                                            i20 = i11 + 1;
                                            strD9 = d(strArr2, i11, strTrim);
                                            if (!"=".equals(strD9)) {
                                                throw e(strD9, strTrim);
                                            }
                                            i11 = i20;
                                            strD = strD9;
                                        } else {
                                            if ("!".equals(strD)) {
                                                i13 = i11 + 1;
                                                strD2 = d(strArr2, i11, strTrim);
                                                if ("=".equals(strD2)) {
                                                    throw e(strD2, strTrim);
                                                }
                                                i11 = i13;
                                                strD = strD2;
                                            } else {
                                                i12 = 1;
                                            }
                                            if ("is".equals(strD)) {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            } else {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            }
                                            if (!"not".equals(strD3)) {
                                                if (r7 != 0) {
                                                }
                                                r23 = i12 ^ 1;
                                                strD3 = d(strArr2, i14, strTrim);
                                                i14++;
                                            } else {
                                                r23 = i12;
                                            }
                                            arrayList2 = new ArrayList();
                                            strD4 = strD3;
                                            d2 = -9.223372036854776E18d;
                                            ?? r21 = r7;
                                            dMin = 9.223372036854776E18d;
                                            while (true) {
                                                j2 = Long.parseLong(strD4);
                                                i8 = i3;
                                                length = strArr2.length;
                                                str3 = strD4;
                                                if (i14 < length) {
                                                    sVar = sVarA2;
                                                    i16 = i14 + 1;
                                                    pVar4 = tVar;
                                                    strD5 = d(strArr2, i14, strTrim);
                                                    i17 = i14;
                                                    if (strD5.equals(".")) {
                                                        i18 = i17 + 2;
                                                        strD6 = d(strArr2, i16, strTrim);
                                                        if (strD6.equals(".")) {
                                                            throw e(strD6, strTrim);
                                                        }
                                                        i14 = i17 + 3;
                                                        strD7 = d(strArr2, i18, strTrim);
                                                        long j4 = Long.parseLong(strD7);
                                                        if (i14 < length) {
                                                            i19 = i17 + 4;
                                                            strD8 = d(strArr2, i14, strTrim);
                                                            if (strD8.equals(",")) {
                                                                throw e(strD8, strTrim);
                                                            }
                                                            str3 = strD8;
                                                            i14 = i19;
                                                        } else {
                                                            str3 = strD7;
                                                        }
                                                        j3 = j4;
                                                    } else {
                                                        if (strD5.equals(",")) {
                                                            throw e(strD5, strTrim);
                                                        }
                                                        str3 = strD5;
                                                        i14 = i16;
                                                    }
                                                    if (j2 <= j3) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(j2);
                                                        sb.append('~');
                                                        sb.append(j3);
                                                        throw e(sb.toString(), strTrim);
                                                    }
                                                    pVar5 = nVar;
                                                    if (i10 == 0) {
                                                    }
                                                    arrayList2.add(Long.valueOf(j2));
                                                    arrayList2.add(Long.valueOf(j3));
                                                    dMin = Math.min(dMin, j2);
                                                    dMax = Math.max(d2, j3);
                                                    if (i14 >= length) {
                                                        str4 = str3;
                                                        if (str4.equals(",")) {
                                                            i9 = i5;
                                                            if (arrayList2.size() == i9) {
                                                                jArr2 = null;
                                                            } else {
                                                                size = arrayList2.size();
                                                                jArr = new long[size];
                                                                for (i15 = i4; i15 < size; i15++) {
                                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                                }
                                                                jArr2 = jArr;
                                                            }
                                                            if (dMin != dMax) {
                                                            }
                                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                            break;
                                                        }
                                                        throw e(str4, strTrim);
                                                    }
                                                    strD4 = d(strArr2, i14, strTrim);
                                                    i14++;
                                                    strArr2 = strArr2;
                                                    d2 = dMax;
                                                    i3 = i8;
                                                    sVarA2 = sVar;
                                                    tVar = pVar4;
                                                    nVar = pVar5;
                                                } else {
                                                    pVar4 = tVar;
                                                    sVar = sVarA2;
                                                }
                                                strArr2 = strArr2;
                                                j3 = j2;
                                                if (j2 <= j3) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(j2);
                                                    sb2.append('~');
                                                    sb2.append(j3);
                                                    throw e(sb2.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            }
                                        }
                                        i12 = i4;
                                        if ("is".equals(strD)) {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        } else {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        }
                                        if (!"not".equals(strD3)) {
                                            if (r7 != 0) {
                                            }
                                            r23 = i12 ^ 1;
                                            strD3 = d(strArr2, i14, strTrim);
                                            i14++;
                                        } else {
                                            r23 = i12;
                                        }
                                        arrayList2 = new ArrayList();
                                        strD4 = strD3;
                                        d2 = -9.223372036854776E18d;
                                        ?? r22 = r7;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            j2 = Long.parseLong(strD4);
                                            i8 = i3;
                                            length = strArr2.length;
                                            str3 = strD4;
                                            if (i14 < length) {
                                                sVar = sVarA2;
                                                i16 = i14 + 1;
                                                pVar4 = tVar;
                                                strD5 = d(strArr2, i14, strTrim);
                                                i17 = i14;
                                                if (strD5.equals(".")) {
                                                    i18 = i17 + 2;
                                                    strD6 = d(strArr2, i16, strTrim);
                                                    if (strD6.equals(".")) {
                                                        throw e(strD6, strTrim);
                                                    }
                                                    i14 = i17 + 3;
                                                    strD7 = d(strArr2, i18, strTrim);
                                                    long j5 = Long.parseLong(strD7);
                                                    if (i14 < length) {
                                                        i19 = i17 + 4;
                                                        strD8 = d(strArr2, i14, strTrim);
                                                        if (strD8.equals(",")) {
                                                            throw e(strD8, strTrim);
                                                        }
                                                        str3 = strD8;
                                                        i14 = i19;
                                                    } else {
                                                        str3 = strD7;
                                                    }
                                                    j3 = j5;
                                                } else {
                                                    if (strD5.equals(",")) {
                                                        throw e(strD5, strTrim);
                                                    }
                                                    str3 = strD5;
                                                    i14 = i16;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(j2);
                                                    sb3.append('~');
                                                    sb3.append(j3);
                                                    throw e(sb3.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            } else {
                                                pVar4 = tVar;
                                                sVar = sVarA2;
                                            }
                                            strArr2 = strArr2;
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(j2);
                                                sb4.append('~');
                                                sb4.append(j3);
                                                throw e(sb4.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        }
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                        i8 = i3;
                                        pVar5 = nVar;
                                        i9 = i5;
                                    }
                                    if (pVar5 == null) {
                                        nVar = uVar;
                                    } else {
                                        nVar = new n(pVar5, uVar);
                                    }
                                    i3 = i8 + 1;
                                    i24 = i9;
                                    i22 = i4;
                                    strArrSplit = strArr;
                                    i2 = i2;
                                    strArrSplit2 = strArrSplit2;
                                    strTrim2 = strTrim2;
                                    sVarA = sVarA;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                } else if (iHashCode != 110) {
                                    if (str2.equals("n")) {
                                        break loop1;
                                    }
                                    i7 = 1;
                                    if (strArr2.length > 1) {
                                        strD = strArr2[1];
                                        if ("mod".equals(strD)) {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        } else {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        }
                                        if ("not".equals(strD)) {
                                            i20 = i11 + 1;
                                            strD9 = d(strArr2, i11, strTrim);
                                            if (!"=".equals(strD9)) {
                                                throw e(strD9, strTrim);
                                            }
                                            i11 = i20;
                                            strD = strD9;
                                        } else {
                                            if ("!".equals(strD)) {
                                                i13 = i11 + 1;
                                                strD2 = d(strArr2, i11, strTrim);
                                                if ("=".equals(strD2)) {
                                                    throw e(strD2, strTrim);
                                                }
                                                i11 = i13;
                                                strD = strD2;
                                            } else {
                                                i12 = 1;
                                            }
                                            if ("is".equals(strD)) {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            } else {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            }
                                            if (!"not".equals(strD3)) {
                                                if (r7 != 0) {
                                                }
                                                r23 = i12 ^ 1;
                                                strD3 = d(strArr2, i14, strTrim);
                                                i14++;
                                            } else {
                                                r23 = i12;
                                            }
                                            arrayList2 = new ArrayList();
                                            strD4 = strD3;
                                            d2 = -9.223372036854776E18d;
                                            ?? r24 = r7;
                                            dMin = 9.223372036854776E18d;
                                            while (true) {
                                                j2 = Long.parseLong(strD4);
                                                i8 = i3;
                                                length = strArr2.length;
                                                str3 = strD4;
                                                if (i14 < length) {
                                                    sVar = sVarA2;
                                                    i16 = i14 + 1;
                                                    pVar4 = tVar;
                                                    strD5 = d(strArr2, i14, strTrim);
                                                    i17 = i14;
                                                    if (strD5.equals(".")) {
                                                        i18 = i17 + 2;
                                                        strD6 = d(strArr2, i16, strTrim);
                                                        if (strD6.equals(".")) {
                                                            throw e(strD6, strTrim);
                                                        }
                                                        i14 = i17 + 3;
                                                        strD7 = d(strArr2, i18, strTrim);
                                                        long j6 = Long.parseLong(strD7);
                                                        if (i14 < length) {
                                                            i19 = i17 + 4;
                                                            strD8 = d(strArr2, i14, strTrim);
                                                            if (strD8.equals(",")) {
                                                                throw e(strD8, strTrim);
                                                            }
                                                            str3 = strD8;
                                                            i14 = i19;
                                                        } else {
                                                            str3 = strD7;
                                                        }
                                                        j3 = j6;
                                                    } else {
                                                        if (strD5.equals(",")) {
                                                            throw e(strD5, strTrim);
                                                        }
                                                        str3 = strD5;
                                                        i14 = i16;
                                                    }
                                                    if (j2 <= j3) {
                                                        StringBuilder sb5 = new StringBuilder();
                                                        sb5.append(j2);
                                                        sb5.append('~');
                                                        sb5.append(j3);
                                                        throw e(sb5.toString(), strTrim);
                                                    }
                                                    pVar5 = nVar;
                                                    if (i10 == 0) {
                                                    }
                                                    arrayList2.add(Long.valueOf(j2));
                                                    arrayList2.add(Long.valueOf(j3));
                                                    dMin = Math.min(dMin, j2);
                                                    dMax = Math.max(d2, j3);
                                                    if (i14 >= length) {
                                                        str4 = str3;
                                                        if (str4.equals(",")) {
                                                            throw e(str4, strTrim);
                                                        }
                                                        i9 = i5;
                                                        if (arrayList2.size() == i9) {
                                                            jArr2 = null;
                                                        } else {
                                                            size = arrayList2.size();
                                                            jArr = new long[size];
                                                            while (i15 < size) {
                                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                            }
                                                            jArr2 = jArr;
                                                        }
                                                        if (dMin != dMax) {
                                                        }
                                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                        break;
                                                    }
                                                    strD4 = d(strArr2, i14, strTrim);
                                                    i14++;
                                                    strArr2 = strArr2;
                                                    d2 = dMax;
                                                    i3 = i8;
                                                    sVarA2 = sVar;
                                                    tVar = pVar4;
                                                    nVar = pVar5;
                                                } else {
                                                    pVar4 = tVar;
                                                    sVar = sVarA2;
                                                }
                                                strArr2 = strArr2;
                                                j3 = j2;
                                                if (j2 <= j3) {
                                                    StringBuilder sb6 = new StringBuilder();
                                                    sb6.append(j2);
                                                    sb6.append('~');
                                                    sb6.append(j3);
                                                    throw e(sb6.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            }
                                        }
                                        i12 = i4;
                                        if ("is".equals(strD)) {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        } else {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        }
                                        if (!"not".equals(strD3)) {
                                            if (r7 != 0) {
                                            }
                                            r23 = i12 ^ 1;
                                            strD3 = d(strArr2, i14, strTrim);
                                            i14++;
                                        } else {
                                            r23 = i12;
                                        }
                                        arrayList2 = new ArrayList();
                                        strD4 = strD3;
                                        d2 = -9.223372036854776E18d;
                                        ?? r25 = r7;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            j2 = Long.parseLong(strD4);
                                            i8 = i3;
                                            length = strArr2.length;
                                            str3 = strD4;
                                            if (i14 < length) {
                                                sVar = sVarA2;
                                                i16 = i14 + 1;
                                                pVar4 = tVar;
                                                strD5 = d(strArr2, i14, strTrim);
                                                i17 = i14;
                                                if (strD5.equals(".")) {
                                                    i18 = i17 + 2;
                                                    strD6 = d(strArr2, i16, strTrim);
                                                    if (strD6.equals(".")) {
                                                        throw e(strD6, strTrim);
                                                    }
                                                    i14 = i17 + 3;
                                                    strD7 = d(strArr2, i18, strTrim);
                                                    long j7 = Long.parseLong(strD7);
                                                    if (i14 < length) {
                                                        i19 = i17 + 4;
                                                        strD8 = d(strArr2, i14, strTrim);
                                                        if (strD8.equals(",")) {
                                                            throw e(strD8, strTrim);
                                                        }
                                                        str3 = strD8;
                                                        i14 = i19;
                                                    } else {
                                                        str3 = strD7;
                                                    }
                                                    j3 = j7;
                                                } else {
                                                    if (strD5.equals(",")) {
                                                        throw e(strD5, strTrim);
                                                    }
                                                    str3 = strD5;
                                                    i14 = i16;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb7 = new StringBuilder();
                                                    sb7.append(j2);
                                                    sb7.append('~');
                                                    sb7.append(j3);
                                                    throw e(sb7.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            } else {
                                                pVar4 = tVar;
                                                sVar = sVarA2;
                                            }
                                            strArr2 = strArr2;
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb8 = new StringBuilder();
                                                sb8.append(j2);
                                                sb8.append('~');
                                                sb8.append(j3);
                                                throw e(sb8.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        }
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                        i8 = i3;
                                        pVar5 = nVar;
                                        i9 = i5;
                                    }
                                    if (pVar5 == null) {
                                        nVar = uVar;
                                    } else {
                                        nVar = new n(pVar5, uVar);
                                    }
                                    i3 = i8 + 1;
                                    i24 = i9;
                                    i22 = i4;
                                    strArrSplit = strArr;
                                    i2 = i2;
                                    strArrSplit2 = strArrSplit2;
                                    strTrim2 = strTrim2;
                                    sVarA = sVarA;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                } else if (iHashCode != 116) {
                                    if (str2.equals("t")) {
                                        break loop1;
                                    }
                                    i7 = 4;
                                    if (strArr2.length > 1) {
                                        strD = strArr2[1];
                                        if ("mod".equals(strD)) {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        } else {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        }
                                        if ("not".equals(strD)) {
                                            i20 = i11 + 1;
                                            strD9 = d(strArr2, i11, strTrim);
                                            if (!"=".equals(strD9)) {
                                                throw e(strD9, strTrim);
                                            }
                                            i11 = i20;
                                            strD = strD9;
                                        } else {
                                            if ("!".equals(strD)) {
                                                i13 = i11 + 1;
                                                strD2 = d(strArr2, i11, strTrim);
                                                if ("=".equals(strD2)) {
                                                    throw e(strD2, strTrim);
                                                }
                                                i11 = i13;
                                                strD = strD2;
                                            } else {
                                                i12 = 1;
                                            }
                                            if ("is".equals(strD)) {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            } else {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            }
                                            if (!"not".equals(strD3)) {
                                                if (r7 != 0) {
                                                }
                                                r23 = i12 ^ 1;
                                                strD3 = d(strArr2, i14, strTrim);
                                                i14++;
                                            } else {
                                                r23 = i12;
                                            }
                                            arrayList2 = new ArrayList();
                                            strD4 = strD3;
                                            d2 = -9.223372036854776E18d;
                                            ?? r26 = r7;
                                            dMin = 9.223372036854776E18d;
                                            while (true) {
                                                j2 = Long.parseLong(strD4);
                                                i8 = i3;
                                                length = strArr2.length;
                                                str3 = strD4;
                                                if (i14 < length) {
                                                    sVar = sVarA2;
                                                    i16 = i14 + 1;
                                                    pVar4 = tVar;
                                                    strD5 = d(strArr2, i14, strTrim);
                                                    i17 = i14;
                                                    if (strD5.equals(".")) {
                                                        i18 = i17 + 2;
                                                        strD6 = d(strArr2, i16, strTrim);
                                                        if (strD6.equals(".")) {
                                                            throw e(strD6, strTrim);
                                                        }
                                                        i14 = i17 + 3;
                                                        strD7 = d(strArr2, i18, strTrim);
                                                        long j8 = Long.parseLong(strD7);
                                                        if (i14 < length) {
                                                            i19 = i17 + 4;
                                                            strD8 = d(strArr2, i14, strTrim);
                                                            if (strD8.equals(",")) {
                                                                throw e(strD8, strTrim);
                                                            }
                                                            str3 = strD8;
                                                            i14 = i19;
                                                        } else {
                                                            str3 = strD7;
                                                        }
                                                        j3 = j8;
                                                    } else {
                                                        if (strD5.equals(",")) {
                                                            throw e(strD5, strTrim);
                                                        }
                                                        str3 = strD5;
                                                        i14 = i16;
                                                    }
                                                    if (j2 <= j3) {
                                                        StringBuilder sb9 = new StringBuilder();
                                                        sb9.append(j2);
                                                        sb9.append('~');
                                                        sb9.append(j3);
                                                        throw e(sb9.toString(), strTrim);
                                                    }
                                                    pVar5 = nVar;
                                                    if (i10 == 0) {
                                                    }
                                                    arrayList2.add(Long.valueOf(j2));
                                                    arrayList2.add(Long.valueOf(j3));
                                                    dMin = Math.min(dMin, j2);
                                                    dMax = Math.max(d2, j3);
                                                    if (i14 >= length) {
                                                        str4 = str3;
                                                        if (str4.equals(",")) {
                                                            throw e(str4, strTrim);
                                                        }
                                                        i9 = i5;
                                                        if (arrayList2.size() == i9) {
                                                            jArr2 = null;
                                                        } else {
                                                            size = arrayList2.size();
                                                            jArr = new long[size];
                                                            while (i15 < size) {
                                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                            }
                                                            jArr2 = jArr;
                                                        }
                                                        if (dMin != dMax) {
                                                        }
                                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                        break;
                                                    }
                                                    strD4 = d(strArr2, i14, strTrim);
                                                    i14++;
                                                    strArr2 = strArr2;
                                                    d2 = dMax;
                                                    i3 = i8;
                                                    sVarA2 = sVar;
                                                    tVar = pVar4;
                                                    nVar = pVar5;
                                                } else {
                                                    pVar4 = tVar;
                                                    sVar = sVarA2;
                                                }
                                                strArr2 = strArr2;
                                                j3 = j2;
                                                if (j2 <= j3) {
                                                    StringBuilder sb10 = new StringBuilder();
                                                    sb10.append(j2);
                                                    sb10.append('~');
                                                    sb10.append(j3);
                                                    throw e(sb10.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            }
                                        }
                                        i12 = i4;
                                        if ("is".equals(strD)) {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        } else {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        }
                                        if (!"not".equals(strD3)) {
                                            if (r7 != 0) {
                                            }
                                            r23 = i12 ^ 1;
                                            strD3 = d(strArr2, i14, strTrim);
                                            i14++;
                                        } else {
                                            r23 = i12;
                                        }
                                        arrayList2 = new ArrayList();
                                        strD4 = strD3;
                                        d2 = -9.223372036854776E18d;
                                        ?? r27 = r7;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            j2 = Long.parseLong(strD4);
                                            i8 = i3;
                                            length = strArr2.length;
                                            str3 = strD4;
                                            if (i14 < length) {
                                                sVar = sVarA2;
                                                i16 = i14 + 1;
                                                pVar4 = tVar;
                                                strD5 = d(strArr2, i14, strTrim);
                                                i17 = i14;
                                                if (strD5.equals(".")) {
                                                    i18 = i17 + 2;
                                                    strD6 = d(strArr2, i16, strTrim);
                                                    if (strD6.equals(".")) {
                                                        throw e(strD6, strTrim);
                                                    }
                                                    i14 = i17 + 3;
                                                    strD7 = d(strArr2, i18, strTrim);
                                                    long j9 = Long.parseLong(strD7);
                                                    if (i14 < length) {
                                                        i19 = i17 + 4;
                                                        strD8 = d(strArr2, i14, strTrim);
                                                        if (strD8.equals(",")) {
                                                            throw e(strD8, strTrim);
                                                        }
                                                        str3 = strD8;
                                                        i14 = i19;
                                                    } else {
                                                        str3 = strD7;
                                                    }
                                                    j3 = j9;
                                                } else {
                                                    if (strD5.equals(",")) {
                                                        throw e(strD5, strTrim);
                                                    }
                                                    str3 = strD5;
                                                    i14 = i16;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb11 = new StringBuilder();
                                                    sb11.append(j2);
                                                    sb11.append('~');
                                                    sb11.append(j3);
                                                    throw e(sb11.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            } else {
                                                pVar4 = tVar;
                                                sVar = sVarA2;
                                            }
                                            strArr2 = strArr2;
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb12 = new StringBuilder();
                                                sb12.append(j2);
                                                sb12.append('~');
                                                sb12.append(j3);
                                                throw e(sb12.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        }
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                        i8 = i3;
                                        pVar5 = nVar;
                                        i9 = i5;
                                    }
                                    if (pVar5 == null) {
                                        nVar = uVar;
                                    } else {
                                        nVar = new n(pVar5, uVar);
                                    }
                                    i3 = i8 + 1;
                                    i24 = i9;
                                    i22 = i4;
                                    strArrSplit = strArr;
                                    i2 = i2;
                                    strArrSplit2 = strArrSplit2;
                                    strTrim2 = strTrim2;
                                    sVarA = sVarA;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                } else if (iHashCode != 105) {
                                    if (str2.equals("i")) {
                                        break loop1;
                                    }
                                    i7 = i5;
                                    if (strArr2.length > 1) {
                                        strD = strArr2[1];
                                        if ("mod".equals(strD)) {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        } else {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        }
                                        if ("not".equals(strD)) {
                                            i20 = i11 + 1;
                                            strD9 = d(strArr2, i11, strTrim);
                                            if (!"=".equals(strD9)) {
                                                throw e(strD9, strTrim);
                                            }
                                            i11 = i20;
                                            strD = strD9;
                                        } else {
                                            if ("!".equals(strD)) {
                                                i13 = i11 + 1;
                                                strD2 = d(strArr2, i11, strTrim);
                                                if ("=".equals(strD2)) {
                                                    throw e(strD2, strTrim);
                                                }
                                                i11 = i13;
                                                strD = strD2;
                                            } else {
                                                i12 = 1;
                                            }
                                            if ("is".equals(strD)) {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            } else {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2) {
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            }
                                            if (!"not".equals(strD3)) {
                                                if (r7 != 0) {
                                                }
                                                r23 = i12 ^ 1;
                                                strD3 = d(strArr2, i14, strTrim);
                                                i14++;
                                            } else {
                                                r23 = i12;
                                            }
                                            arrayList2 = new ArrayList();
                                            strD4 = strD3;
                                            d2 = -9.223372036854776E18d;
                                            ?? r28 = r7;
                                            dMin = 9.223372036854776E18d;
                                            while (true) {
                                                j2 = Long.parseLong(strD4);
                                                i8 = i3;
                                                length = strArr2.length;
                                                str3 = strD4;
                                                if (i14 < length) {
                                                    sVar = sVarA2;
                                                    i16 = i14 + 1;
                                                    pVar4 = tVar;
                                                    strD5 = d(strArr2, i14, strTrim);
                                                    i17 = i14;
                                                    if (strD5.equals(".")) {
                                                        i18 = i17 + 2;
                                                        strD6 = d(strArr2, i16, strTrim);
                                                        if (strD6.equals(".")) {
                                                            throw e(strD6, strTrim);
                                                        }
                                                        i14 = i17 + 3;
                                                        strD7 = d(strArr2, i18, strTrim);
                                                        long j10 = Long.parseLong(strD7);
                                                        if (i14 < length) {
                                                            i19 = i17 + 4;
                                                            strD8 = d(strArr2, i14, strTrim);
                                                            if (strD8.equals(",")) {
                                                                throw e(strD8, strTrim);
                                                            }
                                                            str3 = strD8;
                                                            i14 = i19;
                                                        } else {
                                                            str3 = strD7;
                                                        }
                                                        j3 = j10;
                                                    } else {
                                                        if (strD5.equals(",")) {
                                                            throw e(strD5, strTrim);
                                                        }
                                                        str3 = strD5;
                                                        i14 = i16;
                                                    }
                                                    if (j2 <= j3) {
                                                        StringBuilder sb13 = new StringBuilder();
                                                        sb13.append(j2);
                                                        sb13.append('~');
                                                        sb13.append(j3);
                                                        throw e(sb13.toString(), strTrim);
                                                    }
                                                    pVar5 = nVar;
                                                    if (i10 == 0) {
                                                    }
                                                    arrayList2.add(Long.valueOf(j2));
                                                    arrayList2.add(Long.valueOf(j3));
                                                    dMin = Math.min(dMin, j2);
                                                    dMax = Math.max(d2, j3);
                                                    if (i14 >= length) {
                                                        str4 = str3;
                                                        if (str4.equals(",")) {
                                                            throw e(str4, strTrim);
                                                        }
                                                        i9 = i5;
                                                        if (arrayList2.size() == i9) {
                                                            jArr2 = null;
                                                        } else {
                                                            size = arrayList2.size();
                                                            jArr = new long[size];
                                                            while (i15 < size) {
                                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                            }
                                                            jArr2 = jArr;
                                                        }
                                                        if (dMin != dMax) {
                                                        }
                                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                        break;
                                                    }
                                                    strD4 = d(strArr2, i14, strTrim);
                                                    i14++;
                                                    strArr2 = strArr2;
                                                    d2 = dMax;
                                                    i3 = i8;
                                                    sVarA2 = sVar;
                                                    tVar = pVar4;
                                                    nVar = pVar5;
                                                } else {
                                                    pVar4 = tVar;
                                                    sVar = sVarA2;
                                                }
                                                strArr2 = strArr2;
                                                j3 = j2;
                                                if (j2 <= j3) {
                                                    StringBuilder sb14 = new StringBuilder();
                                                    sb14.append(j2);
                                                    sb14.append('~');
                                                    sb14.append(j3);
                                                    throw e(sb14.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            }
                                        }
                                        i12 = i4;
                                        if ("is".equals(strD)) {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        } else {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        }
                                        if (!"not".equals(strD3)) {
                                            if (r7 != 0) {
                                            }
                                            r23 = i12 ^ 1;
                                            strD3 = d(strArr2, i14, strTrim);
                                            i14++;
                                        } else {
                                            r23 = i12;
                                        }
                                        arrayList2 = new ArrayList();
                                        strD4 = strD3;
                                        d2 = -9.223372036854776E18d;
                                        ?? r29 = r7;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            j2 = Long.parseLong(strD4);
                                            i8 = i3;
                                            length = strArr2.length;
                                            str3 = strD4;
                                            if (i14 < length) {
                                                sVar = sVarA2;
                                                i16 = i14 + 1;
                                                pVar4 = tVar;
                                                strD5 = d(strArr2, i14, strTrim);
                                                i17 = i14;
                                                if (strD5.equals(".")) {
                                                    i18 = i17 + 2;
                                                    strD6 = d(strArr2, i16, strTrim);
                                                    if (strD6.equals(".")) {
                                                        throw e(strD6, strTrim);
                                                    }
                                                    i14 = i17 + 3;
                                                    strD7 = d(strArr2, i18, strTrim);
                                                    long j11 = Long.parseLong(strD7);
                                                    if (i14 < length) {
                                                        i19 = i17 + 4;
                                                        strD8 = d(strArr2, i14, strTrim);
                                                        if (strD8.equals(",")) {
                                                            throw e(strD8, strTrim);
                                                        }
                                                        str3 = strD8;
                                                        i14 = i19;
                                                    } else {
                                                        str3 = strD7;
                                                    }
                                                    j3 = j11;
                                                } else {
                                                    if (strD5.equals(",")) {
                                                        throw e(strD5, strTrim);
                                                    }
                                                    str3 = strD5;
                                                    i14 = i16;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb15 = new StringBuilder();
                                                    sb15.append(j2);
                                                    sb15.append('~');
                                                    sb15.append(j3);
                                                    throw e(sb15.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            } else {
                                                pVar4 = tVar;
                                                sVar = sVarA2;
                                            }
                                            strArr2 = strArr2;
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb16 = new StringBuilder();
                                                sb16.append(j2);
                                                sb16.append('~');
                                                sb16.append(j3);
                                                throw e(sb16.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        }
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                        i8 = i3;
                                        pVar5 = nVar;
                                        i9 = i5;
                                    }
                                    if (pVar5 == null) {
                                        nVar = uVar;
                                    } else {
                                        nVar = new n(pVar5, uVar);
                                    }
                                    i3 = i8 + 1;
                                    i24 = i9;
                                    i22 = i4;
                                    strArrSplit = strArr;
                                    i2 = i2;
                                    strArrSplit2 = strArrSplit2;
                                    strTrim2 = strTrim2;
                                    sVarA = sVarA;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                } else {
                                    if (iHashCode == 106) {
                                        if (str2.equals("j")) {
                                            break loop1;
                                        }
                                        i21 = 7;
                                        i7 = i21;
                                    } else if (iHashCode == 118) {
                                        if (str2.equals("v")) {
                                            break loop1;
                                        }
                                        i21 = 5;
                                        i7 = i21;
                                    } else {
                                        if (iHashCode == 119 || !str2.equals("w")) {
                                            break loop1;
                                        }
                                        i21 = 6;
                                        i7 = i21;
                                    }
                                    if (strArr2.length > 1) {
                                        strD = strArr2[1];
                                        if ("mod".equals(strD) || "%".equals(strD)) {
                                            i10 = Integer.parseInt(strArr2[i5]);
                                            strD = d(strArr2, 3, strTrim);
                                            i11 = 4;
                                        } else {
                                            i10 = i4;
                                            i11 = i5;
                                        }
                                        if ("not".equals(strD)) {
                                            i20 = i11 + 1;
                                            strD9 = d(strArr2, i11, strTrim);
                                            if (!"=".equals(strD9)) {
                                                throw e(strD9, strTrim);
                                            }
                                            i11 = i20;
                                            strD = strD9;
                                        } else {
                                            if ("!".equals(strD)) {
                                                i13 = i11 + 1;
                                                strD2 = d(strArr2, i11, strTrim);
                                                if ("=".equals(strD2)) {
                                                    throw e(strD2, strTrim);
                                                }
                                                i11 = i13;
                                                strD = strD2;
                                            } else {
                                                i12 = 1;
                                            }
                                            if ("is".equals(strD) || "in".equals(strD) || "=".equals(strD)) {
                                                zEquals2 = "is".equals(strD);
                                                if (!zEquals2 && i12 == 0) {
                                                    throw e(strD, strTrim);
                                                }
                                                i14 = i11 + 1;
                                                r7 = zEquals2;
                                                strD3 = d(strArr2, i11, strTrim);
                                                z2 = true;
                                            } else {
                                                if (!"within".equals(strD)) {
                                                    throw e(strD, strTrim);
                                                }
                                                i14 = i11 + 1;
                                                strD3 = d(strArr2, i11, strTrim);
                                                int i26 = i4;
                                                z2 = i26 == true ? 1 : 0;
                                                r7 = i26;
                                            }
                                            if (!"not".equals(strD3)) {
                                                r23 = i12;
                                            } else {
                                                if (r7 != 0 && i12 == 0) {
                                                    throw e(strD3, strTrim);
                                                }
                                                r23 = i12 ^ 1;
                                                strD3 = d(strArr2, i14, strTrim);
                                                i14++;
                                            }
                                            arrayList2 = new ArrayList();
                                            strD4 = strD3;
                                            d2 = -9.223372036854776E18d;
                                            ?? r210 = r7;
                                            dMin = 9.223372036854776E18d;
                                            while (true) {
                                                j2 = Long.parseLong(strD4);
                                                i8 = i3;
                                                length = strArr2.length;
                                                str3 = strD4;
                                                if (i14 < length) {
                                                    sVar = sVarA2;
                                                    i16 = i14 + 1;
                                                    pVar4 = tVar;
                                                    strD5 = d(strArr2, i14, strTrim);
                                                    i17 = i14;
                                                    if (strD5.equals(".")) {
                                                        i18 = i17 + 2;
                                                        strD6 = d(strArr2, i16, strTrim);
                                                        if (strD6.equals(".")) {
                                                            throw e(strD6, strTrim);
                                                        }
                                                        i14 = i17 + 3;
                                                        strD7 = d(strArr2, i18, strTrim);
                                                        long j12 = Long.parseLong(strD7);
                                                        if (i14 < length) {
                                                            i19 = i17 + 4;
                                                            strD8 = d(strArr2, i14, strTrim);
                                                            if (strD8.equals(",")) {
                                                                throw e(strD8, strTrim);
                                                            }
                                                            str3 = strD8;
                                                            i14 = i19;
                                                        } else {
                                                            str3 = strD7;
                                                        }
                                                        j3 = j12;
                                                    } else {
                                                        if (strD5.equals(",")) {
                                                            throw e(strD5, strTrim);
                                                        }
                                                        str3 = strD5;
                                                        i14 = i16;
                                                    }
                                                    if (j2 <= j3) {
                                                        StringBuilder sb17 = new StringBuilder();
                                                        sb17.append(j2);
                                                        sb17.append('~');
                                                        sb17.append(j3);
                                                        throw e(sb17.toString(), strTrim);
                                                    }
                                                    pVar5 = nVar;
                                                    if (i10 == 0 && j3 >= i10) {
                                                        throw e(j3 + ">mod=" + i10, strTrim);
                                                    }
                                                    arrayList2.add(Long.valueOf(j2));
                                                    arrayList2.add(Long.valueOf(j3));
                                                    dMin = Math.min(dMin, j2);
                                                    dMax = Math.max(d2, j3);
                                                    if (i14 >= length) {
                                                        str4 = str3;
                                                        if (str4.equals(",")) {
                                                            throw e(str4, strTrim);
                                                        }
                                                        i9 = i5;
                                                        if (arrayList2.size() == i9) {
                                                            jArr2 = null;
                                                        } else {
                                                            size = arrayList2.size();
                                                            jArr = new long[size];
                                                            while (i15 < size) {
                                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                            }
                                                            jArr2 = jArr;
                                                        }
                                                        if (dMin != dMax || r210 == 0 || r23 != 0) {
                                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                            break;
                                                        }
                                                        throw e("is not <range>", strTrim);
                                                    }
                                                    strD4 = d(strArr2, i14, strTrim);
                                                    i14++;
                                                    strArr2 = strArr2;
                                                    d2 = dMax;
                                                    i3 = i8;
                                                    sVarA2 = sVar;
                                                    tVar = pVar4;
                                                    nVar = pVar5;
                                                } else {
                                                    pVar4 = tVar;
                                                    sVar = sVarA2;
                                                }
                                                strArr2 = strArr2;
                                                j3 = j2;
                                                if (j2 <= j3) {
                                                    StringBuilder sb18 = new StringBuilder();
                                                    sb18.append(j2);
                                                    sb18.append('~');
                                                    sb18.append(j3);
                                                    throw e(sb18.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            }
                                        }
                                        i12 = i4;
                                        if ("is".equals(strD)) {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        } else {
                                            zEquals2 = "is".equals(strD);
                                            if (!zEquals2) {
                                            }
                                            i14 = i11 + 1;
                                            r7 = zEquals2;
                                            strD3 = d(strArr2, i11, strTrim);
                                            z2 = true;
                                        }
                                        if (!"not".equals(strD3)) {
                                            if (r7 != 0) {
                                            }
                                            r23 = i12 ^ 1;
                                            strD3 = d(strArr2, i14, strTrim);
                                            i14++;
                                        } else {
                                            r23 = i12;
                                        }
                                        arrayList2 = new ArrayList();
                                        strD4 = strD3;
                                        d2 = -9.223372036854776E18d;
                                        ?? r211 = r7;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            j2 = Long.parseLong(strD4);
                                            i8 = i3;
                                            length = strArr2.length;
                                            str3 = strD4;
                                            if (i14 < length) {
                                                sVar = sVarA2;
                                                i16 = i14 + 1;
                                                pVar4 = tVar;
                                                strD5 = d(strArr2, i14, strTrim);
                                                i17 = i14;
                                                if (strD5.equals(".")) {
                                                    i18 = i17 + 2;
                                                    strD6 = d(strArr2, i16, strTrim);
                                                    if (strD6.equals(".")) {
                                                        throw e(strD6, strTrim);
                                                    }
                                                    i14 = i17 + 3;
                                                    strD7 = d(strArr2, i18, strTrim);
                                                    long j13 = Long.parseLong(strD7);
                                                    if (i14 < length) {
                                                        i19 = i17 + 4;
                                                        strD8 = d(strArr2, i14, strTrim);
                                                        if (strD8.equals(",")) {
                                                            throw e(strD8, strTrim);
                                                        }
                                                        str3 = strD8;
                                                        i14 = i19;
                                                    } else {
                                                        str3 = strD7;
                                                    }
                                                    j3 = j13;
                                                } else {
                                                    if (strD5.equals(",")) {
                                                        throw e(strD5, strTrim);
                                                    }
                                                    str3 = strD5;
                                                    i14 = i16;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb19 = new StringBuilder();
                                                    sb19.append(j2);
                                                    sb19.append('~');
                                                    sb19.append(j3);
                                                    throw e(sb19.toString(), strTrim);
                                                }
                                                pVar5 = nVar;
                                                if (i10 == 0) {
                                                }
                                                arrayList2.add(Long.valueOf(j2));
                                                arrayList2.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(d2, j3);
                                                if (i14 >= length) {
                                                    str4 = str3;
                                                    if (str4.equals(",")) {
                                                        throw e(str4, strTrim);
                                                    }
                                                    i9 = i5;
                                                    if (arrayList2.size() == i9) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList2.size();
                                                        jArr = new long[size];
                                                        while (i15 < size) {
                                                            jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin != dMax) {
                                                    }
                                                    uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                    break;
                                                }
                                                strD4 = d(strArr2, i14, strTrim);
                                                i14++;
                                                strArr2 = strArr2;
                                                d2 = dMax;
                                                i3 = i8;
                                                sVarA2 = sVar;
                                                tVar = pVar4;
                                                nVar = pVar5;
                                            } else {
                                                pVar4 = tVar;
                                                sVar = sVarA2;
                                            }
                                            strArr2 = strArr2;
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb110 = new StringBuilder();
                                                sb110.append(j2);
                                                sb110.append('~');
                                                sb110.append(j3);
                                                throw e(sb110.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        }
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                        i8 = i3;
                                        pVar5 = nVar;
                                        i9 = i5;
                                    }
                                    if (pVar5 == null) {
                                        nVar = uVar;
                                    } else {
                                        nVar = new n(pVar5, uVar);
                                    }
                                    i3 = i8 + 1;
                                    i24 = i9;
                                    i22 = i4;
                                    strArrSplit = strArr;
                                    i2 = i2;
                                    strArrSplit2 = strArrSplit2;
                                    strTrim2 = strTrim2;
                                    sVarA = sVarA;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                }
                            } catch (Exception unused) {
                                throw e(str2, strTrim);
                            }
                        }
                        String[] strArr4 = strArrSplit;
                        pVar2 = tVar;
                        int i27 = i22;
                        String str5 = strTrim2;
                        s sVar2 = sVarA;
                        s sVar3 = sVarA2;
                        int i28 = i2;
                        pVar3 = nVar;
                        int i29 = i24;
                        if (pVar2 == null) {
                            tVar = pVar3;
                        } else {
                            tVar = new t(pVar2, pVar3);
                        }
                        i24 = i29;
                        i22 = i27;
                        strTrim2 = str5;
                        sVarA = sVar2;
                        sVarA2 = sVar3;
                        i2 = i28 + 1;
                        strArrSplit = strArr4;
                    } else {
                        pVar = tVar;
                    }
                }
                throw new IllegalArgumentException();
            }
            pVar = i;
            return new v(strTrim2, pVar, sVarA, sVarA2);
        }
        sVarA = null;
        sVarA2 = null;
        zEquals = strTrim2.equals("other");
        if (strArrSplit3[0].length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (zEquals == z) {
            throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
        }
        if (zEquals) {
            strArrSplit = c.split(strArrSplit3[0]);
            i2 = 0;
            tVar = null;
            loop1: while (true) {
                if (i2 < strArrSplit.length) {
                    strArrSplit2 = d.split(strArrSplit[i2]);
                    i3 = i22;
                    nVar = null;
                    while (i3 < strArrSplit2.length) {
                        uVar = i;
                        strTrim = strArrSplit2[i3].trim();
                        arrayList = new ArrayList();
                        i4 = i22;
                        i5 = i24;
                        i6 = -1;
                        while (i22 < strTrim.length()) {
                            int i210 = i22 + 1;
                            cCharAt = strTrim.charAt(i22);
                            String[] strArr5 = strArrSplit;
                            if (cCharAt <= ' ') {
                                if (cCharAt > '=') {
                                }
                                if (i6 < 0) {
                                    i6 = i22;
                                }
                            } else {
                                if (cCharAt > '=') {
                                }
                                if (i6 < 0) {
                                    i6 = i22;
                                }
                            }
                            i22 = i210;
                            strArrSplit = strArr5;
                        }
                        strArr = strArrSplit;
                        if (i6 >= 0) {
                            arrayList.add(strTrim.substring(i6));
                        }
                        strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        str2 = strArr2[i4];
                        iHashCode = str2.hashCode();
                        if (iHashCode != 102) {
                            if (str2.equals("f")) {
                                break loop1;
                                break loop1;
                            }
                            i7 = 3;
                            if (strArr2.length > 1) {
                                strD = strArr2[1];
                                if ("mod".equals(strD)) {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                } else {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                }
                                if ("not".equals(strD)) {
                                    i20 = i11 + 1;
                                    strD9 = d(strArr2, i11, strTrim);
                                    if (!"=".equals(strD9)) {
                                        throw e(strD9, strTrim);
                                    }
                                    i11 = i20;
                                    strD = strD9;
                                } else {
                                    if ("!".equals(strD)) {
                                        i13 = i11 + 1;
                                        strD2 = d(strArr2, i11, strTrim);
                                        if ("=".equals(strD2)) {
                                            throw e(strD2, strTrim);
                                        }
                                        i11 = i13;
                                        strD = strD2;
                                    } else {
                                        i12 = 1;
                                    }
                                    if ("is".equals(strD)) {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    } else {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    }
                                    if (!"not".equals(strD3)) {
                                        if (r7 != 0) {
                                        }
                                        r23 = i12 ^ 1;
                                        strD3 = d(strArr2, i14, strTrim);
                                        i14++;
                                    } else {
                                        r23 = i12;
                                    }
                                    arrayList2 = new ArrayList();
                                    strD4 = strD3;
                                    d2 = -9.223372036854776E18d;
                                    ?? r212 = r7;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        j2 = Long.parseLong(strD4);
                                        i8 = i3;
                                        length = strArr2.length;
                                        str3 = strD4;
                                        if (i14 < length) {
                                            sVar = sVarA2;
                                            i16 = i14 + 1;
                                            pVar4 = tVar;
                                            strD5 = d(strArr2, i14, strTrim);
                                            i17 = i14;
                                            if (strD5.equals(".")) {
                                                i18 = i17 + 2;
                                                strD6 = d(strArr2, i16, strTrim);
                                                if (strD6.equals(".")) {
                                                    throw e(strD6, strTrim);
                                                }
                                                i14 = i17 + 3;
                                                strD7 = d(strArr2, i18, strTrim);
                                                long j14 = Long.parseLong(strD7);
                                                if (i14 < length) {
                                                    i19 = i17 + 4;
                                                    strD8 = d(strArr2, i14, strTrim);
                                                    if (strD8.equals(",")) {
                                                        throw e(strD8, strTrim);
                                                    }
                                                    str3 = strD8;
                                                    i14 = i19;
                                                } else {
                                                    str3 = strD7;
                                                }
                                                j3 = j14;
                                            } else {
                                                if (strD5.equals(",")) {
                                                    throw e(strD5, strTrim);
                                                }
                                                str3 = strD5;
                                                i14 = i16;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb111 = new StringBuilder();
                                                sb111.append(j2);
                                                sb111.append('~');
                                                sb111.append(j3);
                                                throw e(sb111.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        } else {
                                            pVar4 = tVar;
                                            sVar = sVarA2;
                                        }
                                        strArr2 = strArr2;
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb112 = new StringBuilder();
                                            sb112.append(j2);
                                            sb112.append('~');
                                            sb112.append(j3);
                                            throw e(sb112.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    }
                                }
                                i12 = i4;
                                if ("is".equals(strD)) {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                } else {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                }
                                if (!"not".equals(strD3)) {
                                    if (r7 != 0) {
                                    }
                                    r23 = i12 ^ 1;
                                    strD3 = d(strArr2, i14, strTrim);
                                    i14++;
                                } else {
                                    r23 = i12;
                                }
                                arrayList2 = new ArrayList();
                                strD4 = strD3;
                                d2 = -9.223372036854776E18d;
                                ?? r213 = r7;
                                dMin = 9.223372036854776E18d;
                                while (true) {
                                    j2 = Long.parseLong(strD4);
                                    i8 = i3;
                                    length = strArr2.length;
                                    str3 = strD4;
                                    if (i14 < length) {
                                        sVar = sVarA2;
                                        i16 = i14 + 1;
                                        pVar4 = tVar;
                                        strD5 = d(strArr2, i14, strTrim);
                                        i17 = i14;
                                        if (strD5.equals(".")) {
                                            i18 = i17 + 2;
                                            strD6 = d(strArr2, i16, strTrim);
                                            if (strD6.equals(".")) {
                                                throw e(strD6, strTrim);
                                            }
                                            i14 = i17 + 3;
                                            strD7 = d(strArr2, i18, strTrim);
                                            long j15 = Long.parseLong(strD7);
                                            if (i14 < length) {
                                                i19 = i17 + 4;
                                                strD8 = d(strArr2, i14, strTrim);
                                                if (strD8.equals(",")) {
                                                    throw e(strD8, strTrim);
                                                }
                                                str3 = strD8;
                                                i14 = i19;
                                            } else {
                                                str3 = strD7;
                                            }
                                            j3 = j15;
                                        } else {
                                            if (strD5.equals(",")) {
                                                throw e(strD5, strTrim);
                                            }
                                            str3 = strD5;
                                            i14 = i16;
                                        }
                                        if (j2 <= j3) {
                                            StringBuilder sb113 = new StringBuilder();
                                            sb113.append(j2);
                                            sb113.append('~');
                                            sb113.append(j3);
                                            throw e(sb113.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                    }
                                    strArr2 = strArr2;
                                    j3 = j2;
                                    if (j2 <= j3) {
                                        StringBuilder sb114 = new StringBuilder();
                                        sb114.append(j2);
                                        sb114.append('~');
                                        sb114.append(j3);
                                        throw e(sb114.toString(), strTrim);
                                    }
                                    pVar5 = nVar;
                                    if (i10 == 0) {
                                    }
                                    arrayList2.add(Long.valueOf(j2));
                                    arrayList2.add(Long.valueOf(j3));
                                    dMin = Math.min(dMin, j2);
                                    dMax = Math.max(d2, j3);
                                    if (i14 >= length) {
                                        str4 = str3;
                                        if (str4.equals(",")) {
                                            throw e(str4, strTrim);
                                        }
                                        i9 = i5;
                                        if (arrayList2.size() == i9) {
                                            jArr2 = null;
                                        } else {
                                            size = arrayList2.size();
                                            jArr = new long[size];
                                            while (i15 < size) {
                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                            }
                                            jArr2 = jArr;
                                        }
                                        if (dMin != dMax) {
                                        }
                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                        break;
                                    }
                                    strD4 = d(strArr2, i14, strTrim);
                                    i14++;
                                    strArr2 = strArr2;
                                    d2 = dMax;
                                    i3 = i8;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                    nVar = pVar5;
                                }
                            } else {
                                pVar4 = tVar;
                                sVar = sVarA2;
                                i8 = i3;
                                pVar5 = nVar;
                                i9 = i5;
                            }
                            if (pVar5 == null) {
                                nVar = uVar;
                            } else {
                                nVar = new n(pVar5, uVar);
                            }
                            i3 = i8 + 1;
                            i24 = i9;
                            i22 = i4;
                            strArrSplit = strArr;
                            i2 = i2;
                            strArrSplit2 = strArrSplit2;
                            strTrim2 = strTrim2;
                            sVarA = sVarA;
                            sVarA2 = sVar;
                            tVar = pVar4;
                        } else if (iHashCode != 110) {
                            if (str2.equals("n")) {
                                break loop1;
                                break loop1;
                            }
                            i7 = 1;
                            if (strArr2.length > 1) {
                                strD = strArr2[1];
                                if ("mod".equals(strD)) {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                } else {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                }
                                if ("not".equals(strD)) {
                                    i20 = i11 + 1;
                                    strD9 = d(strArr2, i11, strTrim);
                                    if (!"=".equals(strD9)) {
                                        throw e(strD9, strTrim);
                                    }
                                    i11 = i20;
                                    strD = strD9;
                                } else {
                                    if ("!".equals(strD)) {
                                        i13 = i11 + 1;
                                        strD2 = d(strArr2, i11, strTrim);
                                        if ("=".equals(strD2)) {
                                            throw e(strD2, strTrim);
                                        }
                                        i11 = i13;
                                        strD = strD2;
                                    } else {
                                        i12 = 1;
                                    }
                                    if ("is".equals(strD)) {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    } else {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    }
                                    if (!"not".equals(strD3)) {
                                        if (r7 != 0) {
                                        }
                                        r23 = i12 ^ 1;
                                        strD3 = d(strArr2, i14, strTrim);
                                        i14++;
                                    } else {
                                        r23 = i12;
                                    }
                                    arrayList2 = new ArrayList();
                                    strD4 = strD3;
                                    d2 = -9.223372036854776E18d;
                                    ?? r214 = r7;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        j2 = Long.parseLong(strD4);
                                        i8 = i3;
                                        length = strArr2.length;
                                        str3 = strD4;
                                        if (i14 < length) {
                                            sVar = sVarA2;
                                            i16 = i14 + 1;
                                            pVar4 = tVar;
                                            strD5 = d(strArr2, i14, strTrim);
                                            i17 = i14;
                                            if (strD5.equals(".")) {
                                                i18 = i17 + 2;
                                                strD6 = d(strArr2, i16, strTrim);
                                                if (strD6.equals(".")) {
                                                    throw e(strD6, strTrim);
                                                }
                                                i14 = i17 + 3;
                                                strD7 = d(strArr2, i18, strTrim);
                                                long j16 = Long.parseLong(strD7);
                                                if (i14 < length) {
                                                    i19 = i17 + 4;
                                                    strD8 = d(strArr2, i14, strTrim);
                                                    if (strD8.equals(",")) {
                                                        throw e(strD8, strTrim);
                                                    }
                                                    str3 = strD8;
                                                    i14 = i19;
                                                } else {
                                                    str3 = strD7;
                                                }
                                                j3 = j16;
                                            } else {
                                                if (strD5.equals(",")) {
                                                    throw e(strD5, strTrim);
                                                }
                                                str3 = strD5;
                                                i14 = i16;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb115 = new StringBuilder();
                                                sb115.append(j2);
                                                sb115.append('~');
                                                sb115.append(j3);
                                                throw e(sb115.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        } else {
                                            pVar4 = tVar;
                                            sVar = sVarA2;
                                        }
                                        strArr2 = strArr2;
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb116 = new StringBuilder();
                                            sb116.append(j2);
                                            sb116.append('~');
                                            sb116.append(j3);
                                            throw e(sb116.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    }
                                }
                                i12 = i4;
                                if ("is".equals(strD)) {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                } else {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                }
                                if (!"not".equals(strD3)) {
                                    if (r7 != 0) {
                                    }
                                    r23 = i12 ^ 1;
                                    strD3 = d(strArr2, i14, strTrim);
                                    i14++;
                                } else {
                                    r23 = i12;
                                }
                                arrayList2 = new ArrayList();
                                strD4 = strD3;
                                d2 = -9.223372036854776E18d;
                                ?? r215 = r7;
                                dMin = 9.223372036854776E18d;
                                while (true) {
                                    j2 = Long.parseLong(strD4);
                                    i8 = i3;
                                    length = strArr2.length;
                                    str3 = strD4;
                                    if (i14 < length) {
                                        sVar = sVarA2;
                                        i16 = i14 + 1;
                                        pVar4 = tVar;
                                        strD5 = d(strArr2, i14, strTrim);
                                        i17 = i14;
                                        if (strD5.equals(".")) {
                                            i18 = i17 + 2;
                                            strD6 = d(strArr2, i16, strTrim);
                                            if (strD6.equals(".")) {
                                                throw e(strD6, strTrim);
                                            }
                                            i14 = i17 + 3;
                                            strD7 = d(strArr2, i18, strTrim);
                                            long j17 = Long.parseLong(strD7);
                                            if (i14 < length) {
                                                i19 = i17 + 4;
                                                strD8 = d(strArr2, i14, strTrim);
                                                if (strD8.equals(",")) {
                                                    throw e(strD8, strTrim);
                                                }
                                                str3 = strD8;
                                                i14 = i19;
                                            } else {
                                                str3 = strD7;
                                            }
                                            j3 = j17;
                                        } else {
                                            if (strD5.equals(",")) {
                                                throw e(strD5, strTrim);
                                            }
                                            str3 = strD5;
                                            i14 = i16;
                                        }
                                        if (j2 <= j3) {
                                            StringBuilder sb117 = new StringBuilder();
                                            sb117.append(j2);
                                            sb117.append('~');
                                            sb117.append(j3);
                                            throw e(sb117.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                    }
                                    strArr2 = strArr2;
                                    j3 = j2;
                                    if (j2 <= j3) {
                                        StringBuilder sb118 = new StringBuilder();
                                        sb118.append(j2);
                                        sb118.append('~');
                                        sb118.append(j3);
                                        throw e(sb118.toString(), strTrim);
                                    }
                                    pVar5 = nVar;
                                    if (i10 == 0) {
                                    }
                                    arrayList2.add(Long.valueOf(j2));
                                    arrayList2.add(Long.valueOf(j3));
                                    dMin = Math.min(dMin, j2);
                                    dMax = Math.max(d2, j3);
                                    if (i14 >= length) {
                                        str4 = str3;
                                        if (str4.equals(",")) {
                                            throw e(str4, strTrim);
                                        }
                                        i9 = i5;
                                        if (arrayList2.size() == i9) {
                                            jArr2 = null;
                                        } else {
                                            size = arrayList2.size();
                                            jArr = new long[size];
                                            while (i15 < size) {
                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                            }
                                            jArr2 = jArr;
                                        }
                                        if (dMin != dMax) {
                                        }
                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                        break;
                                    }
                                    strD4 = d(strArr2, i14, strTrim);
                                    i14++;
                                    strArr2 = strArr2;
                                    d2 = dMax;
                                    i3 = i8;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                    nVar = pVar5;
                                }
                            } else {
                                pVar4 = tVar;
                                sVar = sVarA2;
                                i8 = i3;
                                pVar5 = nVar;
                                i9 = i5;
                            }
                            if (pVar5 == null) {
                                nVar = uVar;
                            } else {
                                nVar = new n(pVar5, uVar);
                            }
                            i3 = i8 + 1;
                            i24 = i9;
                            i22 = i4;
                            strArrSplit = strArr;
                            i2 = i2;
                            strArrSplit2 = strArrSplit2;
                            strTrim2 = strTrim2;
                            sVarA = sVarA;
                            sVarA2 = sVar;
                            tVar = pVar4;
                        } else if (iHashCode != 116) {
                            if (str2.equals("t")) {
                                break loop1;
                                break loop1;
                            }
                            i7 = 4;
                            if (strArr2.length > 1) {
                                strD = strArr2[1];
                                if ("mod".equals(strD)) {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                } else {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                }
                                if ("not".equals(strD)) {
                                    i20 = i11 + 1;
                                    strD9 = d(strArr2, i11, strTrim);
                                    if (!"=".equals(strD9)) {
                                        throw e(strD9, strTrim);
                                    }
                                    i11 = i20;
                                    strD = strD9;
                                } else {
                                    if ("!".equals(strD)) {
                                        i13 = i11 + 1;
                                        strD2 = d(strArr2, i11, strTrim);
                                        if ("=".equals(strD2)) {
                                            throw e(strD2, strTrim);
                                        }
                                        i11 = i13;
                                        strD = strD2;
                                    } else {
                                        i12 = 1;
                                    }
                                    if ("is".equals(strD)) {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    } else {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    }
                                    if (!"not".equals(strD3)) {
                                        if (r7 != 0) {
                                        }
                                        r23 = i12 ^ 1;
                                        strD3 = d(strArr2, i14, strTrim);
                                        i14++;
                                    } else {
                                        r23 = i12;
                                    }
                                    arrayList2 = new ArrayList();
                                    strD4 = strD3;
                                    d2 = -9.223372036854776E18d;
                                    ?? r216 = r7;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        j2 = Long.parseLong(strD4);
                                        i8 = i3;
                                        length = strArr2.length;
                                        str3 = strD4;
                                        if (i14 < length) {
                                            sVar = sVarA2;
                                            i16 = i14 + 1;
                                            pVar4 = tVar;
                                            strD5 = d(strArr2, i14, strTrim);
                                            i17 = i14;
                                            if (strD5.equals(".")) {
                                                i18 = i17 + 2;
                                                strD6 = d(strArr2, i16, strTrim);
                                                if (strD6.equals(".")) {
                                                    throw e(strD6, strTrim);
                                                }
                                                i14 = i17 + 3;
                                                strD7 = d(strArr2, i18, strTrim);
                                                long j18 = Long.parseLong(strD7);
                                                if (i14 < length) {
                                                    i19 = i17 + 4;
                                                    strD8 = d(strArr2, i14, strTrim);
                                                    if (strD8.equals(",")) {
                                                        throw e(strD8, strTrim);
                                                    }
                                                    str3 = strD8;
                                                    i14 = i19;
                                                } else {
                                                    str3 = strD7;
                                                }
                                                j3 = j18;
                                            } else {
                                                if (strD5.equals(",")) {
                                                    throw e(strD5, strTrim);
                                                }
                                                str3 = strD5;
                                                i14 = i16;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb119 = new StringBuilder();
                                                sb119.append(j2);
                                                sb119.append('~');
                                                sb119.append(j3);
                                                throw e(sb119.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        } else {
                                            pVar4 = tVar;
                                            sVar = sVarA2;
                                        }
                                        strArr2 = strArr2;
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb1110 = new StringBuilder();
                                            sb1110.append(j2);
                                            sb1110.append('~');
                                            sb1110.append(j3);
                                            throw e(sb1110.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    }
                                }
                                i12 = i4;
                                if ("is".equals(strD)) {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                } else {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                }
                                if (!"not".equals(strD3)) {
                                    if (r7 != 0) {
                                    }
                                    r23 = i12 ^ 1;
                                    strD3 = d(strArr2, i14, strTrim);
                                    i14++;
                                } else {
                                    r23 = i12;
                                }
                                arrayList2 = new ArrayList();
                                strD4 = strD3;
                                d2 = -9.223372036854776E18d;
                                ?? r217 = r7;
                                dMin = 9.223372036854776E18d;
                                while (true) {
                                    j2 = Long.parseLong(strD4);
                                    i8 = i3;
                                    length = strArr2.length;
                                    str3 = strD4;
                                    if (i14 < length) {
                                        sVar = sVarA2;
                                        i16 = i14 + 1;
                                        pVar4 = tVar;
                                        strD5 = d(strArr2, i14, strTrim);
                                        i17 = i14;
                                        if (strD5.equals(".")) {
                                            i18 = i17 + 2;
                                            strD6 = d(strArr2, i16, strTrim);
                                            if (strD6.equals(".")) {
                                                throw e(strD6, strTrim);
                                            }
                                            i14 = i17 + 3;
                                            strD7 = d(strArr2, i18, strTrim);
                                            long j19 = Long.parseLong(strD7);
                                            if (i14 < length) {
                                                i19 = i17 + 4;
                                                strD8 = d(strArr2, i14, strTrim);
                                                if (strD8.equals(",")) {
                                                    throw e(strD8, strTrim);
                                                }
                                                str3 = strD8;
                                                i14 = i19;
                                            } else {
                                                str3 = strD7;
                                            }
                                            j3 = j19;
                                        } else {
                                            if (strD5.equals(",")) {
                                                throw e(strD5, strTrim);
                                            }
                                            str3 = strD5;
                                            i14 = i16;
                                        }
                                        if (j2 <= j3) {
                                            StringBuilder sb1111 = new StringBuilder();
                                            sb1111.append(j2);
                                            sb1111.append('~');
                                            sb1111.append(j3);
                                            throw e(sb1111.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                    }
                                    strArr2 = strArr2;
                                    j3 = j2;
                                    if (j2 <= j3) {
                                        StringBuilder sb1112 = new StringBuilder();
                                        sb1112.append(j2);
                                        sb1112.append('~');
                                        sb1112.append(j3);
                                        throw e(sb1112.toString(), strTrim);
                                    }
                                    pVar5 = nVar;
                                    if (i10 == 0) {
                                    }
                                    arrayList2.add(Long.valueOf(j2));
                                    arrayList2.add(Long.valueOf(j3));
                                    dMin = Math.min(dMin, j2);
                                    dMax = Math.max(d2, j3);
                                    if (i14 >= length) {
                                        str4 = str3;
                                        if (str4.equals(",")) {
                                            throw e(str4, strTrim);
                                        }
                                        i9 = i5;
                                        if (arrayList2.size() == i9) {
                                            jArr2 = null;
                                        } else {
                                            size = arrayList2.size();
                                            jArr = new long[size];
                                            while (i15 < size) {
                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                            }
                                            jArr2 = jArr;
                                        }
                                        if (dMin != dMax) {
                                        }
                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                        break;
                                    }
                                    strD4 = d(strArr2, i14, strTrim);
                                    i14++;
                                    strArr2 = strArr2;
                                    d2 = dMax;
                                    i3 = i8;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                    nVar = pVar5;
                                }
                            } else {
                                pVar4 = tVar;
                                sVar = sVarA2;
                                i8 = i3;
                                pVar5 = nVar;
                                i9 = i5;
                            }
                            if (pVar5 == null) {
                                nVar = uVar;
                            } else {
                                nVar = new n(pVar5, uVar);
                            }
                            i3 = i8 + 1;
                            i24 = i9;
                            i22 = i4;
                            strArrSplit = strArr;
                            i2 = i2;
                            strArrSplit2 = strArrSplit2;
                            strTrim2 = strTrim2;
                            sVarA = sVarA;
                            sVarA2 = sVar;
                            tVar = pVar4;
                        } else if (iHashCode != 105) {
                            if (str2.equals("i")) {
                                break loop1;
                                break loop1;
                            }
                            i7 = i5;
                            if (strArr2.length > 1) {
                                strD = strArr2[1];
                                if ("mod".equals(strD)) {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                } else {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                }
                                if ("not".equals(strD)) {
                                    i20 = i11 + 1;
                                    strD9 = d(strArr2, i11, strTrim);
                                    if (!"=".equals(strD9)) {
                                        throw e(strD9, strTrim);
                                    }
                                    i11 = i20;
                                    strD = strD9;
                                } else {
                                    if ("!".equals(strD)) {
                                        i13 = i11 + 1;
                                        strD2 = d(strArr2, i11, strTrim);
                                        if ("=".equals(strD2)) {
                                            throw e(strD2, strTrim);
                                        }
                                        i11 = i13;
                                        strD = strD2;
                                    } else {
                                        i12 = 1;
                                    }
                                    if ("is".equals(strD)) {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    } else {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    }
                                    if (!"not".equals(strD3)) {
                                        if (r7 != 0) {
                                        }
                                        r23 = i12 ^ 1;
                                        strD3 = d(strArr2, i14, strTrim);
                                        i14++;
                                    } else {
                                        r23 = i12;
                                    }
                                    arrayList2 = new ArrayList();
                                    strD4 = strD3;
                                    d2 = -9.223372036854776E18d;
                                    ?? r218 = r7;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        j2 = Long.parseLong(strD4);
                                        i8 = i3;
                                        length = strArr2.length;
                                        str3 = strD4;
                                        if (i14 < length) {
                                            sVar = sVarA2;
                                            i16 = i14 + 1;
                                            pVar4 = tVar;
                                            strD5 = d(strArr2, i14, strTrim);
                                            i17 = i14;
                                            if (strD5.equals(".")) {
                                                i18 = i17 + 2;
                                                strD6 = d(strArr2, i16, strTrim);
                                                if (strD6.equals(".")) {
                                                    throw e(strD6, strTrim);
                                                }
                                                i14 = i17 + 3;
                                                strD7 = d(strArr2, i18, strTrim);
                                                long j110 = Long.parseLong(strD7);
                                                if (i14 < length) {
                                                    i19 = i17 + 4;
                                                    strD8 = d(strArr2, i14, strTrim);
                                                    if (strD8.equals(",")) {
                                                        throw e(strD8, strTrim);
                                                    }
                                                    str3 = strD8;
                                                    i14 = i19;
                                                } else {
                                                    str3 = strD7;
                                                }
                                                j3 = j110;
                                            } else {
                                                if (strD5.equals(",")) {
                                                    throw e(strD5, strTrim);
                                                }
                                                str3 = strD5;
                                                i14 = i16;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb1113 = new StringBuilder();
                                                sb1113.append(j2);
                                                sb1113.append('~');
                                                sb1113.append(j3);
                                                throw e(sb1113.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        } else {
                                            pVar4 = tVar;
                                            sVar = sVarA2;
                                        }
                                        strArr2 = strArr2;
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb1114 = new StringBuilder();
                                            sb1114.append(j2);
                                            sb1114.append('~');
                                            sb1114.append(j3);
                                            throw e(sb1114.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    }
                                }
                                i12 = i4;
                                if ("is".equals(strD)) {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                } else {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                }
                                if (!"not".equals(strD3)) {
                                    if (r7 != 0) {
                                    }
                                    r23 = i12 ^ 1;
                                    strD3 = d(strArr2, i14, strTrim);
                                    i14++;
                                } else {
                                    r23 = i12;
                                }
                                arrayList2 = new ArrayList();
                                strD4 = strD3;
                                d2 = -9.223372036854776E18d;
                                ?? r219 = r7;
                                dMin = 9.223372036854776E18d;
                                while (true) {
                                    j2 = Long.parseLong(strD4);
                                    i8 = i3;
                                    length = strArr2.length;
                                    str3 = strD4;
                                    if (i14 < length) {
                                        sVar = sVarA2;
                                        i16 = i14 + 1;
                                        pVar4 = tVar;
                                        strD5 = d(strArr2, i14, strTrim);
                                        i17 = i14;
                                        if (strD5.equals(".")) {
                                            i18 = i17 + 2;
                                            strD6 = d(strArr2, i16, strTrim);
                                            if (strD6.equals(".")) {
                                                throw e(strD6, strTrim);
                                            }
                                            i14 = i17 + 3;
                                            strD7 = d(strArr2, i18, strTrim);
                                            long j111 = Long.parseLong(strD7);
                                            if (i14 < length) {
                                                i19 = i17 + 4;
                                                strD8 = d(strArr2, i14, strTrim);
                                                if (strD8.equals(",")) {
                                                    throw e(strD8, strTrim);
                                                }
                                                str3 = strD8;
                                                i14 = i19;
                                            } else {
                                                str3 = strD7;
                                            }
                                            j3 = j111;
                                        } else {
                                            if (strD5.equals(",")) {
                                                throw e(strD5, strTrim);
                                            }
                                            str3 = strD5;
                                            i14 = i16;
                                        }
                                        if (j2 <= j3) {
                                            StringBuilder sb1115 = new StringBuilder();
                                            sb1115.append(j2);
                                            sb1115.append('~');
                                            sb1115.append(j3);
                                            throw e(sb1115.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                    }
                                    strArr2 = strArr2;
                                    j3 = j2;
                                    if (j2 <= j3) {
                                        StringBuilder sb1116 = new StringBuilder();
                                        sb1116.append(j2);
                                        sb1116.append('~');
                                        sb1116.append(j3);
                                        throw e(sb1116.toString(), strTrim);
                                    }
                                    pVar5 = nVar;
                                    if (i10 == 0) {
                                    }
                                    arrayList2.add(Long.valueOf(j2));
                                    arrayList2.add(Long.valueOf(j3));
                                    dMin = Math.min(dMin, j2);
                                    dMax = Math.max(d2, j3);
                                    if (i14 >= length) {
                                        str4 = str3;
                                        if (str4.equals(",")) {
                                            throw e(str4, strTrim);
                                        }
                                        i9 = i5;
                                        if (arrayList2.size() == i9) {
                                            jArr2 = null;
                                        } else {
                                            size = arrayList2.size();
                                            jArr = new long[size];
                                            while (i15 < size) {
                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                            }
                                            jArr2 = jArr;
                                        }
                                        if (dMin != dMax) {
                                        }
                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                        break;
                                    }
                                    strD4 = d(strArr2, i14, strTrim);
                                    i14++;
                                    strArr2 = strArr2;
                                    d2 = dMax;
                                    i3 = i8;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                    nVar = pVar5;
                                }
                            } else {
                                pVar4 = tVar;
                                sVar = sVarA2;
                                i8 = i3;
                                pVar5 = nVar;
                                i9 = i5;
                            }
                            if (pVar5 == null) {
                                nVar = uVar;
                            } else {
                                nVar = new n(pVar5, uVar);
                            }
                            i3 = i8 + 1;
                            i24 = i9;
                            i22 = i4;
                            strArrSplit = strArr;
                            i2 = i2;
                            strArrSplit2 = strArrSplit2;
                            strTrim2 = strTrim2;
                            sVarA = sVarA;
                            sVarA2 = sVar;
                            tVar = pVar4;
                        } else {
                            if (iHashCode == 106) {
                                if (iHashCode == 118) {
                                    if (iHashCode == 119) {
                                        break loop1;
                                        break loop1;
                                    }
                                } else {
                                    if (str2.equals("v")) {
                                        break loop1;
                                        break loop1;
                                    }
                                    i21 = 5;
                                    i7 = i21;
                                }
                            } else {
                                if (str2.equals("j")) {
                                    break loop1;
                                    break loop1;
                                }
                                i21 = 7;
                                i7 = i21;
                            }
                            if (strArr2.length > 1) {
                                strD = strArr2[1];
                                if ("mod".equals(strD)) {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                } else {
                                    i10 = Integer.parseInt(strArr2[i5]);
                                    strD = d(strArr2, 3, strTrim);
                                    i11 = 4;
                                }
                                if ("not".equals(strD)) {
                                    i20 = i11 + 1;
                                    strD9 = d(strArr2, i11, strTrim);
                                    if (!"=".equals(strD9)) {
                                        throw e(strD9, strTrim);
                                    }
                                    i11 = i20;
                                    strD = strD9;
                                } else {
                                    if ("!".equals(strD)) {
                                        i13 = i11 + 1;
                                        strD2 = d(strArr2, i11, strTrim);
                                        if ("=".equals(strD2)) {
                                            throw e(strD2, strTrim);
                                        }
                                        i11 = i13;
                                        strD = strD2;
                                    } else {
                                        i12 = 1;
                                    }
                                    if ("is".equals(strD)) {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    } else {
                                        zEquals2 = "is".equals(strD);
                                        if (!zEquals2) {
                                        }
                                        i14 = i11 + 1;
                                        r7 = zEquals2;
                                        strD3 = d(strArr2, i11, strTrim);
                                        z2 = true;
                                    }
                                    if (!"not".equals(strD3)) {
                                        if (r7 != 0) {
                                        }
                                        r23 = i12 ^ 1;
                                        strD3 = d(strArr2, i14, strTrim);
                                        i14++;
                                    } else {
                                        r23 = i12;
                                    }
                                    arrayList2 = new ArrayList();
                                    strD4 = strD3;
                                    d2 = -9.223372036854776E18d;
                                    ?? r2110 = r7;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        j2 = Long.parseLong(strD4);
                                        i8 = i3;
                                        length = strArr2.length;
                                        str3 = strD4;
                                        if (i14 < length) {
                                            sVar = sVarA2;
                                            i16 = i14 + 1;
                                            pVar4 = tVar;
                                            strD5 = d(strArr2, i14, strTrim);
                                            i17 = i14;
                                            if (strD5.equals(".")) {
                                                i18 = i17 + 2;
                                                strD6 = d(strArr2, i16, strTrim);
                                                if (strD6.equals(".")) {
                                                    throw e(strD6, strTrim);
                                                }
                                                i14 = i17 + 3;
                                                strD7 = d(strArr2, i18, strTrim);
                                                long j112 = Long.parseLong(strD7);
                                                if (i14 < length) {
                                                    i19 = i17 + 4;
                                                    strD8 = d(strArr2, i14, strTrim);
                                                    if (strD8.equals(",")) {
                                                        throw e(strD8, strTrim);
                                                    }
                                                    str3 = strD8;
                                                    i14 = i19;
                                                } else {
                                                    str3 = strD7;
                                                }
                                                j3 = j112;
                                            } else {
                                                if (strD5.equals(",")) {
                                                    throw e(strD5, strTrim);
                                                }
                                                str3 = strD5;
                                                i14 = i16;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb1117 = new StringBuilder();
                                                sb1117.append(j2);
                                                sb1117.append('~');
                                                sb1117.append(j3);
                                                throw e(sb1117.toString(), strTrim);
                                            }
                                            pVar5 = nVar;
                                            if (i10 == 0) {
                                            }
                                            arrayList2.add(Long.valueOf(j2));
                                            arrayList2.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(d2, j3);
                                            if (i14 >= length) {
                                                str4 = str3;
                                                if (str4.equals(",")) {
                                                    throw e(str4, strTrim);
                                                }
                                                i9 = i5;
                                                if (arrayList2.size() == i9) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList2.size();
                                                    jArr = new long[size];
                                                    while (i15 < size) {
                                                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin != dMax) {
                                                }
                                                uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                                break;
                                            }
                                            strD4 = d(strArr2, i14, strTrim);
                                            i14++;
                                            strArr2 = strArr2;
                                            d2 = dMax;
                                            i3 = i8;
                                            sVarA2 = sVar;
                                            tVar = pVar4;
                                            nVar = pVar5;
                                        } else {
                                            pVar4 = tVar;
                                            sVar = sVarA2;
                                        }
                                        strArr2 = strArr2;
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb1118 = new StringBuilder();
                                            sb1118.append(j2);
                                            sb1118.append('~');
                                            sb1118.append(j3);
                                            throw e(sb1118.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    }
                                }
                                i12 = i4;
                                if ("is".equals(strD)) {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                } else {
                                    zEquals2 = "is".equals(strD);
                                    if (!zEquals2) {
                                    }
                                    i14 = i11 + 1;
                                    r7 = zEquals2;
                                    strD3 = d(strArr2, i11, strTrim);
                                    z2 = true;
                                }
                                if (!"not".equals(strD3)) {
                                    if (r7 != 0) {
                                    }
                                    r23 = i12 ^ 1;
                                    strD3 = d(strArr2, i14, strTrim);
                                    i14++;
                                } else {
                                    r23 = i12;
                                }
                                arrayList2 = new ArrayList();
                                strD4 = strD3;
                                d2 = -9.223372036854776E18d;
                                ?? r2111 = r7;
                                dMin = 9.223372036854776E18d;
                                while (true) {
                                    j2 = Long.parseLong(strD4);
                                    i8 = i3;
                                    length = strArr2.length;
                                    str3 = strD4;
                                    if (i14 < length) {
                                        sVar = sVarA2;
                                        i16 = i14 + 1;
                                        pVar4 = tVar;
                                        strD5 = d(strArr2, i14, strTrim);
                                        i17 = i14;
                                        if (strD5.equals(".")) {
                                            i18 = i17 + 2;
                                            strD6 = d(strArr2, i16, strTrim);
                                            if (strD6.equals(".")) {
                                                throw e(strD6, strTrim);
                                            }
                                            i14 = i17 + 3;
                                            strD7 = d(strArr2, i18, strTrim);
                                            long j113 = Long.parseLong(strD7);
                                            if (i14 < length) {
                                                i19 = i17 + 4;
                                                strD8 = d(strArr2, i14, strTrim);
                                                if (strD8.equals(",")) {
                                                    throw e(strD8, strTrim);
                                                }
                                                str3 = strD8;
                                                i14 = i19;
                                            } else {
                                                str3 = strD7;
                                            }
                                            j3 = j113;
                                        } else {
                                            if (strD5.equals(",")) {
                                                throw e(strD5, strTrim);
                                            }
                                            str3 = strD5;
                                            i14 = i16;
                                        }
                                        if (j2 <= j3) {
                                            StringBuilder sb1119 = new StringBuilder();
                                            sb1119.append(j2);
                                            sb1119.append('~');
                                            sb1119.append(j3);
                                            throw e(sb1119.toString(), strTrim);
                                        }
                                        pVar5 = nVar;
                                        if (i10 == 0) {
                                        }
                                        arrayList2.add(Long.valueOf(j2));
                                        arrayList2.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(d2, j3);
                                        if (i14 >= length) {
                                            str4 = str3;
                                            if (str4.equals(",")) {
                                                throw e(str4, strTrim);
                                            }
                                            i9 = i5;
                                            if (arrayList2.size() == i9) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList2.size();
                                                jArr = new long[size];
                                                while (i15 < size) {
                                                    jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin != dMax) {
                                            }
                                            uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                            break;
                                        }
                                        strD4 = d(strArr2, i14, strTrim);
                                        i14++;
                                        strArr2 = strArr2;
                                        d2 = dMax;
                                        i3 = i8;
                                        sVarA2 = sVar;
                                        tVar = pVar4;
                                        nVar = pVar5;
                                    } else {
                                        pVar4 = tVar;
                                        sVar = sVarA2;
                                    }
                                    strArr2 = strArr2;
                                    j3 = j2;
                                    if (j2 <= j3) {
                                        StringBuilder sb11110 = new StringBuilder();
                                        sb11110.append(j2);
                                        sb11110.append('~');
                                        sb11110.append(j3);
                                        throw e(sb11110.toString(), strTrim);
                                    }
                                    pVar5 = nVar;
                                    if (i10 == 0) {
                                    }
                                    arrayList2.add(Long.valueOf(j2));
                                    arrayList2.add(Long.valueOf(j3));
                                    dMin = Math.min(dMin, j2);
                                    dMax = Math.max(d2, j3);
                                    if (i14 >= length) {
                                        str4 = str3;
                                        if (str4.equals(",")) {
                                            throw e(str4, strTrim);
                                        }
                                        i9 = i5;
                                        if (arrayList2.size() == i9) {
                                            jArr2 = null;
                                        } else {
                                            size = arrayList2.size();
                                            jArr = new long[size];
                                            while (i15 < size) {
                                                jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                                            }
                                            jArr2 = jArr;
                                        }
                                        if (dMin != dMax) {
                                        }
                                        uVar = new u(i10, r23, i7, z2, dMin, dMax, jArr2);
                                        break;
                                    }
                                    strD4 = d(strArr2, i14, strTrim);
                                    i14++;
                                    strArr2 = strArr2;
                                    d2 = dMax;
                                    i3 = i8;
                                    sVarA2 = sVar;
                                    tVar = pVar4;
                                    nVar = pVar5;
                                }
                            } else {
                                pVar4 = tVar;
                                sVar = sVarA2;
                                i8 = i3;
                                pVar5 = nVar;
                                i9 = i5;
                            }
                            if (pVar5 == null) {
                                nVar = uVar;
                            } else {
                                nVar = new n(pVar5, uVar);
                            }
                            i3 = i8 + 1;
                            i24 = i9;
                            i22 = i4;
                            strArrSplit = strArr;
                            i2 = i2;
                            strArrSplit2 = strArrSplit2;
                            strTrim2 = strTrim2;
                            sVarA = sVarA;
                            sVarA2 = sVar;
                            tVar = pVar4;
                        }
                    }
                    String[] strArr6 = strArrSplit;
                    pVar2 = tVar;
                    int i211 = i22;
                    String str6 = strTrim2;
                    s sVar4 = sVarA;
                    s sVar5 = sVarA2;
                    int i212 = i2;
                    pVar3 = nVar;
                    int i213 = i24;
                    if (pVar2 == null) {
                        tVar = pVar3;
                    } else {
                        tVar = new t(pVar2, pVar3);
                    }
                    i24 = i213;
                    i22 = i211;
                    strTrim2 = str6;
                    sVarA = sVar4;
                    sVarA2 = sVar5;
                    i2 = i212 + 1;
                    strArrSplit = strArr6;
                } else {
                    pVar = tVar;
                }
            }
            throw new IllegalArgumentException();
        }
        pVar = i;
        return new v(strTrim2, pVar, sVarA, sVarA2);
    }

    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(',');
        }
        if (d2 == d3) {
            sb.append(c(d2));
            return;
        }
        sb.append(c(d2) + ".." + c(d3));
    }

    private static String c(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String d(String[] strArr, int i2, String str) throws ParseException {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(a.bU((byte) 39, str, "missing token at end of '"), -1);
    }

    private static ParseException e(String str, String str2) {
        return new ParseException("unexpected token '" + str + "' in '" + str2 + '\'', -1);
    }

    public final boolean equals(Object obj) {
        x xVar;
        return (obj instanceof x) && (xVar = (x) obj) != null && toString().equals(xVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
