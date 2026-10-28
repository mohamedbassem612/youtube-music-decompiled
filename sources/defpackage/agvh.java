package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agvh {
    public int a = 0;
    public int b = -1;
    protected final Object[] c;
    public final StringBuilder d;
    public int e;
    private final agtw f;

    protected agvh(agtw agtwVar, Object[] objArr, StringBuilder sb) {
        agtwVar.getClass();
        this.f = agtwVar;
        this.e = 0;
        this.c = objArr;
        this.d = sb;
    }

    public static void c(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(agsy.b(obj));
        sb.append(']');
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x0204  */
    /* JADX WARN: Code duplicated, block: B:134:0x0208  */
    /* JADX WARN: Code duplicated, block: B:135:0x020c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0212  */
    /* JADX WARN: Code duplicated, block: B:144:0x0234  */
    /* JADX WARN: Code duplicated, block: B:146:0x023b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0243 A[LOOP:4: B:80:0x0122->B:148:0x0243, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x025b A[LOOP:2: B:45:0x00a8->B:155:0x025b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x011c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    /* JADX WARN: Code duplicated, block: B:96:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168  */
    public static void e(agsu agsuVar, StringBuilder sb) {
        String strA;
        int i;
        char cCharAt;
        int i2;
        int i3;
        char cCharAt2;
        int i4;
        boolean z;
        int i5;
        agsr agsrVar;
        int i6;
        int i7;
        char cCharAt3;
        char c;
        int i8;
        int i9;
        char cCharAt4;
        char c2;
        int i10;
        agsq agsqVar;
        int i11;
        int i12;
        agvb agvbVar;
        agvd agvcVar;
        agvd agvfVar;
        int i13;
        StringBuilder sb2;
        Object[] objArr;
        Object obj;
        if (agsuVar.n() == null) {
            Object objO = agsuVar.o();
            try {
                strA = agsy.c(objO);
            } catch (RuntimeException e) {
                strA = agsy.a(objO, e);
            }
            sb.append(strA);
            return;
        }
        agvh agvhVar = new agvh(agsuVar.n(), agsuVar.K(), sb);
        String strB = agvhVar.b();
        int i14 = 0;
        int iB = agvk.b(strB, 0);
        int i15 = -1;
        int i16 = 0;
        int i17 = -1;
        while (true) {
            int i18 = 1;
            if (iB < 0) {
                int i19 = agvhVar.a;
                if (((i19 + 1) & i19) != 0 || (agvhVar.b > 31 && i19 != -1)) {
                    throw new agvj(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i19))));
                }
                agvi agviVarA = agvhVar.a();
                String strB2 = agvhVar.b();
                int i20 = agvhVar.e;
                int length = agvhVar.b().length();
                StringBuilder sb3 = agvhVar.d;
                agviVarA.a(sb3, strB2, i20, length);
                if (agsuVar.K().length > agvhVar.b + 1) {
                    sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    return;
                }
                return;
            }
            int i21 = iB + 1;
            int i22 = i14;
            int i23 = i21;
            while (true) {
                if (i23 >= strB.length()) {
                    throw agvj.c("unterminated parameter", strB, iB);
                }
                i = i23 + 1;
                cCharAt = strB.charAt(i23);
                char c3 = (char) (cCharAt - '0');
                if (c3 < '\n') {
                    i22 = (i22 * 10) + c3;
                    if (i22 >= 1000000) {
                        throw agvj.b("index too large", strB, iB, i);
                    }
                    i23 = i;
                }
            }
            if (cCharAt != '$') {
                if (cCharAt != '<') {
                    i17 = i16;
                    i16++;
                } else {
                    if (i17 == i15) {
                        throw agvj.b("invalid relative parameter", strB, iB, i);
                    }
                    if (i == strB.length()) {
                        throw agvj.c("unterminated parameter", strB, iB);
                    }
                    i2 = i23 + 2;
                    strB.charAt(i);
                }
                i3 = i + i15;
                while (true) {
                    if (i3 < strB.length()) {
                        throw agvj.c("unterminated parameter", strB, iB);
                    }
                    if (((char) ((strB.charAt(i3) & (-33)) - 65)) < 26) {
                        break;
                    }
                    i3++;
                    i15 = -1;
                }
                cCharAt2 = strB.charAt(i3);
                i4 = cCharAt2 & ' ';
                if (i4 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                agsr agsrVar2 = agsr.a;
                if (i21 == i3 || z) {
                    if (true != z) {
                        i5 = 0;
                    } else {
                        i5 = SemanticState.Focused;
                    }
                    while (true) {
                        if (i21 == i3) {
                            agsrVar = new agsr(i5, i15, i15);
                        } else {
                            i6 = i18;
                            i7 = i21 + 1;
                            cCharAt3 = strB.charAt(i21);
                            c = '.';
                            if (cCharAt3 < ' ' && cCharAt3 <= '0') {
                                int iA = agsr.a(cCharAt3);
                                if (iA < 0) {
                                    if (cCharAt3 != '.') {
                                        throw agvj.a("invalid flag", strB, i21);
                                    }
                                    agsrVar = new agsr(i5, -1, agsr.b(strB, i7, i3));
                                    break;
                                } else {
                                    i10 = i6 << iA;
                                    if ((i5 & i10) != 0) {
                                        throw agvj.a("repeated flag", strB, i21);
                                    }
                                    i5 |= i10;
                                    i21 = i7;
                                    i18 = i6;
                                    i15 = -1;
                                }
                            } else {
                                if (cCharAt3 > '9') {
                                    throw agvj.a("invalid flag", strB, i21);
                                }
                                i8 = cCharAt3 - '0';
                                while (true) {
                                    if (i7 == i3) {
                                        agsrVar = new agsr(i5, i8, -1);
                                        break;
                                    }
                                    i9 = i7 + 1;
                                    cCharAt4 = strB.charAt(i7);
                                    if (cCharAt4 == c) {
                                        agsrVar = new agsr(i5, i8, agsr.b(strB, i9, i3));
                                        break;
                                    }
                                    c2 = (char) (cCharAt4 - '0');
                                    if (c2 >= '\n') {
                                        throw agvj.a("invalid width character", strB, i7);
                                    }
                                    i8 = (i8 * 10) + c2;
                                    if (i8 > 999999) {
                                        throw agvj.b("width too large", strB, i21, i3);
                                    }
                                    i7 = i9;
                                    c = '.';
                                }
                            }
                        }
                    }
                    agsqVar = agsq.k[(cCharAt2 | ' ') - 97];
                    if (i4 == 0 && (agsqVar == null || (agsqVar.n & SemanticState.Focused) == 0)) {
                        agsqVar = null;
                    }
                    i11 = i3 + 1;
                    if (agsqVar != null) {
                        if (!agsrVar.e(agsqVar.n, agsqVar.m.f)) {
                            throw agvj.b("invalid format specifier", strB, iB, i11);
                        }
                        Map map = agve.c;
                        if (i17 < 10 || !agsrVar.c()) {
                            agvfVar = new agve(i17, agsqVar, agsrVar);
                            agvcVar = agvfVar;
                        } else {
                            agvd[] agvdVarArr = (agve[]) agve.c.get(agsqVar);
                            agvdVarArr.getClass();
                            agvcVar = agvdVarArr[i17];
                        }
                    } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                        if (!agsrVar.e(160, false)) {
                            throw agvj.b("invalid format specification", strB, iB, i11);
                        }
                        i12 = i3 + 2;
                        if (i12 > strB.length()) {
                            throw agvj.a("truncated format specifier", strB, iB);
                        }
                        agvbVar = (agvb) agvb.F.get(Character.valueOf(strB.charAt(i11)));
                        if (agvbVar == null) {
                            throw agvj.a("illegal date/time conversion", strB, i11);
                        }
                        agvcVar = new agvc(agsrVar, i17, agvbVar);
                        i11 = i12;
                    } else {
                        if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                            throw agvj.b("invalid format specification", strB, iB, i11);
                        }
                        if (!agsrVar.e(160, false)) {
                            throw agvj.b("invalid format specification", strB, iB, i11);
                        }
                        agvfVar = new agvf(agsrVar, i17);
                        agvcVar = agvfVar;
                    }
                    i13 = agvcVar.a;
                    if (i13 < 32) {
                        agvhVar.a |= i6 << i13;
                    }
                    agvhVar.b = Math.max(agvhVar.b, i13);
                    agvi agviVarA2 = agvhVar.a();
                    String strB3 = agvhVar.b();
                    int i24 = agvhVar.e;
                    sb2 = agvhVar.d;
                    agviVarA2.a(sb2, strB3, i24, iB);
                    objArr = agvhVar.c;
                    if (i13 < objArr.length) {
                        obj = objArr[i13];
                        if (obj != null) {
                            agvcVar.a(agvhVar, obj);
                        } else {
                            sb2.append("null");
                        }
                    } else {
                        sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                    }
                    agvhVar.e = i11;
                    iB = agvk.b(strB, i11);
                    i14 = 0;
                    i15 = -1;
                } else {
                    agsrVar = agsr.a;
                }
                i6 = i18;
                agsqVar = agsq.k[(cCharAt2 | ' ') - 97];
                if (i4 == 0) {
                    agsqVar = null;
                }
                i11 = i3 + 1;
                if (agsqVar != null) {
                    if (cCharAt2 != 't') {
                    }
                    if (!agsrVar.e(160, false)) {
                        throw agvj.b("invalid format specification", strB, iB, i11);
                    }
                    i12 = i3 + 2;
                    if (i12 > strB.length()) {
                        throw agvj.a("truncated format specifier", strB, iB);
                    }
                    agvbVar = (agvb) agvb.F.get(Character.valueOf(strB.charAt(i11)));
                    if (agvbVar == null) {
                        throw agvj.a("illegal date/time conversion", strB, i11);
                    }
                    agvcVar = new agvc(agsrVar, i17, agvbVar);
                    i11 = i12;
                } else {
                    if (!agsrVar.e(agsqVar.n, agsqVar.m.f)) {
                        throw agvj.b("invalid format specifier", strB, iB, i11);
                    }
                    Map map2 = agve.c;
                    if (i17 < 10) {
                    }
                    agvfVar = new agve(i17, agsqVar, agsrVar);
                    agvcVar = agvfVar;
                }
                i13 = agvcVar.a;
                if (i13 < 32) {
                    agvhVar.a |= i6 << i13;
                }
                agvhVar.b = Math.max(agvhVar.b, i13);
                agvi agviVarA3 = agvhVar.a();
                String strB4 = agvhVar.b();
                int i25 = agvhVar.e;
                sb2 = agvhVar.d;
                agviVarA3.a(sb2, strB4, i25, iB);
                objArr = agvhVar.c;
                if (i13 < objArr.length) {
                    obj = objArr[i13];
                    if (obj != null) {
                        agvcVar.a(agvhVar, obj);
                    } else {
                        sb2.append("null");
                    }
                } else {
                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                }
                agvhVar.e = i11;
                iB = agvk.b(strB, i11);
                i14 = 0;
                i15 = -1;
            } else {
                if (i23 - i21 == 0) {
                    throw agvj.b("missing index", strB, iB, i);
                }
                if (strB.charAt(i21) == '0') {
                    throw agvj.b("index has leading zero", strB, iB, i);
                }
                int i26 = i22 - 1;
                if (i == strB.length()) {
                    throw agvj.c("unterminated parameter", strB, iB);
                }
                i2 = i23 + 2;
                strB.charAt(i);
                i17 = i26;
            }
            i21 = i;
            i = i2;
            i3 = i + i15;
            while (true) {
                if (i3 < strB.length()) {
                    throw agvj.c("unterminated parameter", strB, iB);
                }
                if (((char) ((strB.charAt(i3) & (-33)) - 65)) < 26) {
                    break;
                }
                i3++;
                i15 = -1;
            }
            cCharAt2 = strB.charAt(i3);
            i4 = cCharAt2 & ' ';
            if (i4 == 0) {
                z = true;
            } else {
                z = false;
            }
            agsr agsrVar3 = agsr.a;
            if (i21 == i3) {
                if (true != z) {
                    i5 = 0;
                } else {
                    i5 = SemanticState.Focused;
                }
                while (true) {
                    if (i21 == i3) {
                        agsrVar = new agsr(i5, i15, i15);
                        i6 = i18;
                        break;
                    }
                    i6 = i18;
                    i7 = i21 + 1;
                    cCharAt3 = strB.charAt(i21);
                    c = '.';
                    if (cCharAt3 < ' ') {
                    }
                    if (cCharAt3 > '9') {
                        throw agvj.a("invalid flag", strB, i21);
                    }
                    i8 = cCharAt3 - '0';
                    while (true) {
                        if (i7 == i3) {
                            agsrVar = new agsr(i5, i8, -1);
                            break;
                        }
                        i9 = i7 + 1;
                        cCharAt4 = strB.charAt(i7);
                        if (cCharAt4 == c) {
                            agsrVar = new agsr(i5, i8, agsr.b(strB, i9, i3));
                            break;
                        }
                        c2 = (char) (cCharAt4 - '0');
                        if (c2 >= '\n') {
                            throw agvj.a("invalid width character", strB, i7);
                        }
                        i8 = (i8 * 10) + c2;
                        if (i8 > 999999) {
                            throw agvj.b("width too large", strB, i21, i3);
                        }
                        i7 = i9;
                        c = '.';
                    }
                    i5 |= i10;
                    i21 = i7;
                    i18 = i6;
                    i15 = -1;
                }
            } else {
                if (true != z) {
                    i5 = 0;
                } else {
                    i5 = SemanticState.Focused;
                }
                while (true) {
                    if (i21 == i3) {
                        agsrVar = new agsr(i5, i15, i15);
                        i6 = i18;
                        break;
                    }
                    i6 = i18;
                    i7 = i21 + 1;
                    cCharAt3 = strB.charAt(i21);
                    c = '.';
                    if (cCharAt3 < ' ') {
                    }
                    if (cCharAt3 > '9') {
                        throw agvj.a("invalid flag", strB, i21);
                    }
                    i8 = cCharAt3 - '0';
                    while (true) {
                        if (i7 == i3) {
                            agsrVar = new agsr(i5, i8, -1);
                            break;
                        }
                        i9 = i7 + 1;
                        cCharAt4 = strB.charAt(i7);
                        if (cCharAt4 == c) {
                            agsrVar = new agsr(i5, i8, agsr.b(strB, i9, i3));
                            break;
                        }
                        c2 = (char) (cCharAt4 - '0');
                        if (c2 >= '\n') {
                            throw agvj.a("invalid width character", strB, i7);
                        }
                        i8 = (i8 * 10) + c2;
                        if (i8 > 999999) {
                            throw agvj.b("width too large", strB, i21, i3);
                        }
                        i7 = i9;
                        c = '.';
                    }
                    i5 |= i10;
                    i21 = i7;
                    i18 = i6;
                    i15 = -1;
                }
            }
            agsqVar = agsq.k[(cCharAt2 | ' ') - 97];
            if (i4 == 0) {
                agsqVar = null;
            }
            i11 = i3 + 1;
            if (agsqVar != null) {
                if (cCharAt2 != 't') {
                }
                if (!agsrVar.e(160, false)) {
                    throw agvj.b("invalid format specification", strB, iB, i11);
                }
                i12 = i3 + 2;
                if (i12 > strB.length()) {
                    throw agvj.a("truncated format specifier", strB, iB);
                }
                agvbVar = (agvb) agvb.F.get(Character.valueOf(strB.charAt(i11)));
                if (agvbVar == null) {
                    throw agvj.a("illegal date/time conversion", strB, i11);
                }
                agvcVar = new agvc(agsrVar, i17, agvbVar);
                i11 = i12;
            } else {
                if (!agsrVar.e(agsqVar.n, agsqVar.m.f)) {
                    throw agvj.b("invalid format specifier", strB, iB, i11);
                }
                Map map3 = agve.c;
                if (i17 < 10) {
                }
                agvfVar = new agve(i17, agsqVar, agsrVar);
                agvcVar = agvfVar;
            }
            i13 = agvcVar.a;
            if (i13 < 32) {
                agvhVar.a |= i6 << i13;
            }
            agvhVar.b = Math.max(agvhVar.b, i13);
            agvi agviVarA4 = agvhVar.a();
            String strB5 = agvhVar.b();
            int i27 = agvhVar.e;
            sb2 = agvhVar.d;
            agviVarA4.a(sb2, strB5, i27, iB);
            objArr = agvhVar.c;
            if (i13 < objArr.length) {
                obj = objArr[i13];
                if (obj != null) {
                    agvcVar.a(agvhVar, obj);
                } else {
                    sb2.append("null");
                }
            } else {
                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
            }
            agvhVar.e = i11;
            iB = agvk.b(strB, i11);
            i14 = 0;
            i15 = -1;
        }
    }

    public final agvi a() {
        return this.f.a;
    }

    public final String b() {
        return this.f.b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    /* JADX WARN: Code duplicated, block: B:37:0x004b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    public final void d(Object obj, agsq agsqVar, agsr agsrVar) {
        String strA;
        agsr agsrVar2;
        boolean zIsValidCodePoint;
        int iOrdinal = agsqVar.m.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                c(this.d, obj, agsqVar.o);
                return;
            }
        }
        StringBuilder sb = this.d;
        int iOrdinal2 = agsqVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (agsrVar.c()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (agsrVar.c()) {
                            agsrVar2 = agsrVar;
                        } else {
                            int i = agsrVar.b;
                            int i2 = i & SemanticState.Focused;
                            if (i2 == 0) {
                                agsrVar2 = agsr.a;
                            } else if (i2 == i && agsrVar.c == -1 && agsrVar.d == -1) {
                                agsrVar2 = agsrVar;
                            } else {
                                agsrVar2 = new agsr(i2, -1, -1);
                            }
                        }
                        if (agsrVar2.equals(agsrVar)) {
                            Number number = (Number) obj;
                            boolean zD = agsrVar.d();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                agsy.d(sb, jLongValue, zD);
                                return;
                            }
                            if (number instanceof Integer) {
                                agsy.d(sb, jLongValue & 4294967295L, zD);
                                return;
                            }
                            if (number instanceof Byte) {
                                agsy.d(sb, jLongValue & 255, zD);
                                return;
                            }
                            if (number instanceof Short) {
                                agsy.d(sb, jLongValue & 65535, zD);
                                return;
                            } else {
                                if (!(number instanceof BigInteger)) {
                                    throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(number.getClass()))));
                                }
                                String string = ((BigInteger) number).toString(16);
                                if (zD) {
                                    string = string.toUpperCase(agsy.a);
                                }
                                sb.append(string);
                                return;
                            }
                        }
                    }
                } else if (agsrVar.c()) {
                    sb.append(obj);
                    return;
                }
            } else if (agsrVar.c()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                int i3 = agsrVar.b;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & SemanticState.Focused) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, agsy.a);
                try {
                    formattable.formatTo(formatter, i4, agsrVar.c, agsrVar.d);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        formatter.out().append(agsy.a(formattable, e));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (agsrVar.c()) {
                try {
                    strA = agsy.c(obj);
                } catch (RuntimeException e2) {
                    strA = agsy.a(obj, e2);
                }
                sb.append(strA);
                return;
            }
        }
        String string2 = agsqVar.o;
        if (!agsrVar.c()) {
            int i5 = agsqVar.l;
            if (agsrVar.d()) {
                i5 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            agsrVar.f(sb2);
            sb2.append((char) i5);
            string2 = sb2.toString();
        }
        sb.append(String.format(agsy.a, string2, obj));
    }
}
