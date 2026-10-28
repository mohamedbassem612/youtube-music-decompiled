package defpackage;

import android.text.TextUtils;
import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddh implements dbn {
    private final bwb a = new bwb();
    private final dda b = new dda();

    @Override // defpackage.dbn
    public final int a() {
        return 1;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0215  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0228  */
    /* JADX WARN: Code duplicated, block: B:121:0x0230  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:124:0x023c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0244  */
    /* JADX WARN: Code duplicated, block: B:127:0x0249  */
    /* JADX WARN: Code duplicated, block: B:129:0x0251  */
    /* JADX WARN: Code duplicated, block: B:134:0x0263  */
    /* JADX WARN: Code duplicated, block: B:136:0x0268  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Code duplicated, block: B:140:0x0278  */
    /* JADX WARN: Code duplicated, block: B:141:0x027d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0285  */
    /* JADX WARN: Code duplicated, block: B:144:0x028d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0295  */
    /* JADX WARN: Code duplicated, block: B:148:0x029d  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x0302  */
    /* JADX WARN: Code duplicated, block: B:170:0x030a  */
    /* JADX WARN: Code duplicated, block: B:172:0x030f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0317  */
    /* JADX WARN: Code duplicated, block: B:206:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        String strSubstring;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        int i3;
        boolean z;
        ddh ddhVar = this;
        bwb bwbVar = ddhVar.a;
        bwbVar.N(bArr, i + i2);
        bwbVar.P(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i4 = ddi.a;
            int i5 = bwbVar.c;
            String strZ = bwbVar.z();
            int i6 = 1;
            if (strZ == null || !strZ.startsWith("WEBVTT")) {
                bwbVar.P(i5);
                throw new bsz("Expected WEBVTT. Got ".concat(String.valueOf(bwbVar.z())), null, true, 1);
            }
            while (!TextUtils.isEmpty(bwbVar.z())) {
                ddhVar = this;
            }
            ArrayList arrayList2 = new ArrayList();
            int i7 = -1;
            int i8 = 0;
            while (true) {
                int i9 = i7;
                int i10 = i8;
                while (true) {
                    if (i9 == i7) {
                        i10 = bwbVar.c;
                        String strZ2 = bwbVar.z();
                        if (strZ2 == null) {
                            i9 = i8;
                        } else if ("STYLE".equals(strZ2)) {
                            i9 = 2;
                        } else {
                            i9 = strZ2.startsWith("NOTE") ? i6 : 3;
                        }
                    } else {
                        bwbVar.P(i10);
                        if (i9 == 0) {
                            om.f(new ddj(arrayList2), dbmVar, bvhVar);
                            return;
                        }
                        if (i9 == i6) {
                            break;
                        }
                        if (i9 != 2) {
                            aawx aawxVarC = ddg.c(bwbVar, arrayList);
                            if (aawxVarC != null) {
                                arrayList2.add(aawxVarC);
                            }
                        } else {
                            if (!arrayList2.isEmpty()) {
                                throw new IllegalArgumentException("A style block was found after the first cue.");
                            }
                            bwbVar.z();
                            dda ddaVar = ddhVar.b;
                            StringBuilder sb = ddaVar.d;
                            sb.setLength(i8);
                            int i11 = bwbVar.c;
                            while (!TextUtils.isEmpty(bwbVar.z())) {
                                i6 = 1;
                            }
                            bwb bwbVar2 = ddaVar.c;
                            bwbVar2.N(bwbVar.b, bwbVar.c);
                            bwbVar2.P(i11);
                            ArrayList arrayList3 = new ArrayList();
                            while (true) {
                                dda.c(bwbVar2);
                                if (bwbVar2.d() < 5 || !"::cue".equals(bwbVar2.C(5))) {
                                    strSubstring = null;
                                } else {
                                    int i12 = bwbVar2.c;
                                    String strB = dda.b(bwbVar2, sb);
                                    if (strB == null) {
                                        strSubstring = null;
                                    } else if ("{".equals(strB)) {
                                        bwbVar2.P(i12);
                                        strSubstring = "";
                                    } else {
                                        if ("(".equals(strB)) {
                                            int i13 = bwbVar2.c;
                                            int i14 = bwbVar2.d;
                                            int i15 = i8;
                                            while (i13 < i14 && i15 == 0) {
                                                int i16 = i13 + 1;
                                                int i17 = ((char) bwbVar2.b[i13]) == ')' ? i6 : i8;
                                                i13 = i16;
                                                i15 = i17;
                                            }
                                            strSubstring = bwbVar2.C((i13 - 1) - bwbVar2.c).trim();
                                        } else {
                                            strSubstring = null;
                                        }
                                        if (!")".equals(dda.b(bwbVar2, sb))) {
                                            strSubstring = null;
                                        }
                                    }
                                }
                                if (strSubstring == null || !"{".equals(dda.b(bwbVar2, sb))) {
                                    break;
                                }
                                ddb ddbVar = new ddb();
                                if (!strSubstring.isEmpty()) {
                                    int iIndexOf = strSubstring.indexOf(91);
                                    if (iIndexOf != i7) {
                                        Matcher matcher2 = dda.a.matcher(strSubstring.substring(iIndexOf));
                                        if (matcher2.matches()) {
                                            String strGroup2 = matcher2.group(i6);
                                            strGroup2.getClass();
                                            ddbVar.d = strGroup2;
                                        }
                                        strSubstring = strSubstring.substring(i8, iIndexOf);
                                    }
                                    int i18 = bwp.a;
                                    String[] strArrSplit = strSubstring.split("\\.", i7);
                                    String str = strArrSplit[i8];
                                    int iIndexOf2 = str.indexOf(35);
                                    if (iIndexOf2 != i7) {
                                        ddbVar.b = str.substring(i8, iIndexOf2);
                                        ddbVar.a = str.substring(iIndexOf2 + 1);
                                    } else {
                                        ddbVar.b = str;
                                    }
                                    int length = strArrSplit.length;
                                    if (length > i6) {
                                        ddbVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i6, length)));
                                    }
                                }
                                int i19 = i8;
                                String strB2 = null;
                                while (i19 == 0) {
                                    int i20 = bwbVar2.c;
                                    strB2 = dda.b(bwbVar2, sb);
                                    int i21 = (strB2 == null || "}".equals(strB2)) ? i6 : i8;
                                    if (i21 == 0) {
                                        bwbVar2.P(i20);
                                        dda.c(bwbVar2);
                                        String strA = dda.a(bwbVar2, sb);
                                        if (!strA.isEmpty() && ":".equals(dda.b(bwbVar2, sb))) {
                                            dda.c(bwbVar2);
                                            StringBuilder sb2 = new StringBuilder();
                                            boolean z2 = false;
                                            while (true) {
                                                if (z2) {
                                                    string = sb2.toString();
                                                    break;
                                                }
                                                int i22 = bwbVar2.c;
                                                String strB3 = dda.b(bwbVar2, sb);
                                                if (strB3 == null) {
                                                    string = null;
                                                    break;
                                                } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                    bwbVar2.P(i22);
                                                    z2 = true;
                                                } else {
                                                    sb2.append(strB3);
                                                }
                                            }
                                            if (string != null && !string.isEmpty()) {
                                                int i23 = bwbVar2.c;
                                                String strB4 = dda.b(bwbVar2, sb);
                                                if (";".equals(strB4)) {
                                                    if ("color".equals(strA)) {
                                                        ddbVar.f = bvg.a(string, true);
                                                        ddbVar.g = true;
                                                    } else if ("background-color".equals(strA)) {
                                                        ddbVar.h = bvg.a(string, true);
                                                        ddbVar.i = true;
                                                    } else if ("ruby-position".equals(strA)) {
                                                        if ("over".equals(string)) {
                                                            ddbVar.o = 1;
                                                        } else if ("under".equals(string)) {
                                                            ddbVar.o = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strA)) {
                                                        if (!"all".equals(string) || string.startsWith("digits")) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        ddbVar.p = z;
                                                    } else if ("text-decoration".equals(strA)) {
                                                        if ("underline".equals(string)) {
                                                            ddbVar.j = 1;
                                                        }
                                                    } else if ("font-family".equals(strA)) {
                                                        ddbVar.e = ahno.ae(string);
                                                    } else if ("font-weight".equals(strA)) {
                                                        if ("bold".equals(string)) {
                                                            ddbVar.k = 1;
                                                        }
                                                    } else if ("font-style".equals(strA)) {
                                                        if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                            ddbVar.l = 1;
                                                        }
                                                    } else if ("font-size".equals(strA)) {
                                                        matcher = dda.b.matcher(ahno.ae(string));
                                                        if (matcher.matches()) {
                                                            strGroup = matcher.group(2);
                                                            strGroup.getClass();
                                                            iHashCode = strGroup.hashCode();
                                                            if (iHashCode != 37) {
                                                                if (iHashCode != 3240) {
                                                                    if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                        ddbVar.m = 1;
                                                                        i3 = 1;
                                                                    }
                                                                } else if (strGroup.equals("em")) {
                                                                    ddbVar.m = 2;
                                                                    i3 = 1;
                                                                }
                                                                throw new IllegalStateException();
                                                            }
                                                            if (strGroup.equals("%")) {
                                                                throw new IllegalStateException();
                                                            }
                                                            ddbVar.m = 3;
                                                            i3 = 1;
                                                            String strGroup3 = matcher.group(i3);
                                                            strGroup3.getClass();
                                                            ddbVar.n = Float.parseFloat(strGroup3);
                                                        } else {
                                                            bvx.e("WebvttCssParser", a.bT(string, "Invalid font-size: '", "'."));
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else if ("}".equals(strB4)) {
                                                    bwbVar2.P(i23);
                                                    if ("color".equals(strA)) {
                                                        ddbVar.f = bvg.a(string, true);
                                                        ddbVar.g = true;
                                                    } else if ("background-color".equals(strA)) {
                                                        ddbVar.h = bvg.a(string, true);
                                                        ddbVar.i = true;
                                                    } else if ("ruby-position".equals(strA)) {
                                                        if ("over".equals(string)) {
                                                            ddbVar.o = 1;
                                                        } else if ("under".equals(string)) {
                                                            ddbVar.o = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strA)) {
                                                        if ("all".equals(string)) {
                                                            z = true;
                                                        } else {
                                                            z = true;
                                                        }
                                                        ddbVar.p = z;
                                                    } else if ("text-decoration".equals(strA)) {
                                                        if ("underline".equals(string)) {
                                                            ddbVar.j = 1;
                                                        }
                                                    } else if ("font-family".equals(strA)) {
                                                        ddbVar.e = ahno.ae(string);
                                                    } else if ("font-weight".equals(strA)) {
                                                        if ("bold".equals(string)) {
                                                            ddbVar.k = 1;
                                                        }
                                                    } else if ("font-style".equals(strA)) {
                                                        if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                            ddbVar.l = 1;
                                                        }
                                                    } else if ("font-size".equals(strA)) {
                                                        matcher = dda.b.matcher(ahno.ae(string));
                                                        if (matcher.matches()) {
                                                            bvx.e("WebvttCssParser", a.bT(string, "Invalid font-size: '", "'."));
                                                        } else {
                                                            strGroup = matcher.group(2);
                                                            strGroup.getClass();
                                                            iHashCode = strGroup.hashCode();
                                                            if (iHashCode != 37) {
                                                                if (iHashCode != 3240) {
                                                                    if (iHashCode != 3592) {
                                                                    }
                                                                } else if (strGroup.equals("em")) {
                                                                    ddbVar.m = 2;
                                                                    i3 = 1;
                                                                }
                                                                throw new IllegalStateException();
                                                            }
                                                            if (strGroup.equals("%")) {
                                                                throw new IllegalStateException();
                                                            }
                                                            ddbVar.m = 3;
                                                            i3 = 1;
                                                            String strGroup4 = matcher.group(i3);
                                                            strGroup4.getClass();
                                                            ddbVar.n = Float.parseFloat(strGroup4);
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    i19 = i21;
                                    i6 = 1;
                                    i8 = 0;
                                }
                                if ("}".equals(strB2)) {
                                    arrayList3.add(ddbVar);
                                }
                                i7 = -1;
                                i6 = 1;
                                i8 = 0;
                            }
                            arrayList.addAll(arrayList3);
                        }
                        ddhVar = this;
                        i7 = -1;
                        i6 = 1;
                        i8 = 0;
                        i9 = -1;
                        i10 = 0;
                    }
                }
                while (!TextUtils.isEmpty(bwbVar.z())) {
                }
            }
        } catch (bsz e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
