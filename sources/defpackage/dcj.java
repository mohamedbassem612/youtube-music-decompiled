package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import app.rive.runtime.kotlin.fonts.Fonts;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcj implements dbn {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final dci c;
    private Map e;
    private float f = -3.4028235E38f;
    private float g = -3.4028235E38f;
    private final bwb d = new bwb();

    public dcj(List list) {
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String strL = bwp.L((byte[]) list.get(0));
        ahno.F(strL.startsWith("Format:"));
        dci dciVarA = dci.a(strL);
        dciVarA.getClass();
        this.c = dciVarA;
        h(new bwb((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static float e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int f(long j, List list, List list2) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                size = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() != j) {
                if (((Long) list.get(size)).longValue() < j) {
                    size++;
                    break;
                }
            }
            return size;
        }
        list.add(size, Long.valueOf(j));
        list2.add(size, size == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(size - 1)));
        return size;
    }

    private static long g(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = bwp.a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x027e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void h(bwb bwbVar, Charset charset) {
        dcm dcmVar;
        int i;
        while (true) {
            String strA = bwbVar.A(charset);
            if (strA == null) {
                return;
            }
            int i2 = 91;
            char c = 2;
            if ("[Script Info]".equalsIgnoreCase(strA)) {
                while (true) {
                    String strA2 = bwbVar.A(charset);
                    if (strA2 == null || (bwbVar.d() != 0 && bwbVar.f(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strA2.split(":");
                    if (strArrSplit.length == 2) {
                        String strAe = ahno.ae(strArrSplit[0].trim());
                        switch (strAe.hashCode()) {
                            case 1879649548:
                                if (strAe.equals("playresx")) {
                                    this.f = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strAe.equals("playresy")) {
                                    try {
                                        this.g = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strA)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    dck dckVar = null;
                    while (true) {
                        String strA3 = bwbVar.A(charset);
                        if (strA3 != null && (bwbVar.d() == 0 || bwbVar.f(charset) != i2)) {
                            if (strA3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strA3.substring(7), ",");
                                int i3 = 0;
                                int i4 = -1;
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                while (true) {
                                    int length = strArrSplit2.length;
                                    if (i3 < length) {
                                        String strAe2 = ahno.ae(strArrSplit2[i3].trim());
                                        switch (strAe2.hashCode()) {
                                            case -1178781136:
                                                if (strAe2.equals(Fonts.Font.STYLE_ITALIC)) {
                                                    i10 = i3;
                                                }
                                                break;
                                            case -1026963764:
                                                if (strAe2.equals("underline")) {
                                                    i11 = i3;
                                                }
                                                break;
                                            case -192095652:
                                                if (strAe2.equals("strikeout")) {
                                                    i12 = i3;
                                                }
                                                break;
                                            case -70925746:
                                                if (strAe2.equals("primarycolour")) {
                                                    i6 = i3;
                                                }
                                                break;
                                            case 3029637:
                                                if (strAe2.equals("bold")) {
                                                    i9 = i3;
                                                }
                                                break;
                                            case 3373707:
                                                if (strAe2.equals("name")) {
                                                    i4 = i3;
                                                }
                                                break;
                                            case 366554320:
                                                if (strAe2.equals("fontsize")) {
                                                    i8 = i3;
                                                }
                                                break;
                                            case 767321349:
                                                if (strAe2.equals("borderstyle")) {
                                                    i13 = i3;
                                                }
                                                break;
                                            case 1767875043:
                                                if (strAe2.equals("alignment")) {
                                                    i5 = i3;
                                                }
                                                break;
                                            case 1988365454:
                                                if (strAe2.equals("outlinecolour")) {
                                                    i7 = i3;
                                                }
                                                break;
                                        }
                                        i3++;
                                    } else if (i4 != -1) {
                                        dckVar = new dck(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, length);
                                    }
                                }
                            } else {
                                if (strA3.startsWith("Style:")) {
                                    if (dckVar == null) {
                                        bvx.e("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strA3));
                                    } else {
                                        ahno.F(strA3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strA3.substring(6), ",");
                                        int length2 = strArrSplit3.length;
                                        int i14 = dckVar.k;
                                        if (length2 != i14) {
                                            Integer numValueOf = Integer.valueOf(i14);
                                            Integer numValueOf2 = Integer.valueOf(length2);
                                            Object[] objArr = new Object[3];
                                            objArr[0] = numValueOf;
                                            objArr[1] = numValueOf2;
                                            objArr[c] = strA3;
                                            bvx.e("SsaStyle", bwp.K("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[dckVar.a].trim();
                                                int i15 = dckVar.b;
                                                int iA = i15 != -1 ? dcm.a(strArrSplit3[i15].trim()) : -1;
                                                int i16 = dckVar.c;
                                                Integer numB = i16 != -1 ? dcm.b(strArrSplit3[i16].trim()) : null;
                                                int i17 = dckVar.d;
                                                Integer numB2 = i17 != -1 ? dcm.b(strArrSplit3[i17].trim()) : null;
                                                int i18 = dckVar.e;
                                                float f = -3.4028235E38f;
                                                if (i18 != -1) {
                                                    String strTrim2 = strArrSplit3[i18].trim();
                                                    try {
                                                        f = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        bvx.f("SsaStyle", a.bU((byte) 39, strTrim2, "Failed to parse font size: '"), e);
                                                    }
                                                }
                                                int i19 = dckVar.f;
                                                boolean z = i19 != -1 && dcm.c(strArrSplit3[i19].trim());
                                                int i20 = dckVar.g;
                                                boolean z2 = i20 != -1 && dcm.c(strArrSplit3[i20].trim());
                                                int i21 = dckVar.h;
                                                boolean z3 = i21 != -1 && dcm.c(strArrSplit3[i21].trim());
                                                int i22 = dckVar.i;
                                                boolean z4 = i22 != -1 && dcm.c(strArrSplit3[i22].trim());
                                                int i23 = dckVar.j;
                                                if (i23 != -1) {
                                                    String strTrim3 = strArrSplit3[i23].trim();
                                                    try {
                                                        int i24 = Integer.parseInt(strTrim3.trim());
                                                        if (i24 == 1 || i24 == 3) {
                                                            i = i24;
                                                        } else {
                                                            bvx.e("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                                                            i = -1;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                } else {
                                                    i = -1;
                                                }
                                                dcmVar = new dcm(strTrim, iA, numB, numB2, f, z, z2, z3, z4, i);
                                            } catch (RuntimeException e2) {
                                                bvx.f("SsaStyle", a.bU((byte) 39, strA3, "Skipping malformed 'Style:' line: '"), e2);
                                                dcmVar = null;
                                            }
                                            if (dcmVar != null) {
                                                linkedHashMap.put(dcmVar.a, dcmVar);
                                            }
                                        }
                                        dcmVar = null;
                                        if (dcmVar != null) {
                                            linkedHashMap.put(dcmVar.a, dcmVar);
                                        }
                                    }
                                }
                                i2 = 91;
                                c = 2;
                            }
                        }
                    }
                }
                this.e = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strA)) {
                bvx.h("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strA)) {
                return;
            }
        }
    }

    @Override // defpackage.dbn
    public final int a() {
        return 1;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x025f  */
    /* JADX WARN: Code duplicated, block: B:106:0x026f  */
    /* JADX WARN: Code duplicated, block: B:108:0x027d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0287  */
    /* JADX WARN: Code duplicated, block: B:113:0x028a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0290  */
    /* JADX WARN: Code duplicated, block: B:117:0x0297 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:118:0x0299  */
    /* JADX WARN: Code duplicated, block: B:119:0x029c  */
    /* JADX WARN: Code duplicated, block: B:120:0x029f  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02af A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:125:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:132:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x0302 A[LOOP:2: B:144:0x0300->B:145:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x035f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0388  */
    /* JADX WARN: Code duplicated, block: B:202:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0121 A[Catch: RuntimeException -> 0x0179, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0179, blocks: (B:49:0x010f, B:52:0x0121), top: B:187:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150 A[Catch: RuntimeException -> 0x0180, TryCatch #2 {RuntimeException -> 0x0180, blocks: (B:54:0x0128, B:56:0x013f, B:60:0x0158, B:59:0x0150), top: B:185:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c A[Catch: RuntimeException -> 0x01a4, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01a4, blocks: (B:67:0x0180, B:69:0x018c), top: B:181:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0227  */
    /* JADX WARN: Code duplicated, block: B:96:0x022b  */
    /* JADX WARN: Code duplicated, block: B:97:0x023a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        dci dciVarA;
        abnx abnxVar;
        Charset charset;
        int i3;
        dcm dcmVar;
        Matcher matcher;
        int i4;
        PointF pointF;
        float f;
        SpannableString spannableString;
        bur burVar;
        float f2;
        int i5;
        Layout.Alignment alignment;
        int i6;
        int i7;
        bus busVarA;
        int iF;
        int iF2;
        Integer num;
        float f3;
        int i8;
        Integer num2;
        String strGroup;
        long j;
        Matcher matcher2;
        int iA;
        Matcher matcher3;
        Matcher matcher4;
        boolean zFind;
        boolean zFind2;
        PointF pointF2;
        String strGroup2;
        String strGroup3;
        dcj dcjVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bwb bwbVar = dcjVar.d;
        bwbVar.N(bArr, i + i2);
        bwbVar.P(i);
        Charset charsetE = bwbVar.E();
        if (charsetE == null) {
            charsetE = StandardCharsets.UTF_8;
        }
        if (dcjVar.b) {
            dciVarA = dcjVar.c;
        } else {
            dcjVar.h(bwbVar, charsetE);
            dciVarA = null;
        }
        while (true) {
            String strA = bwbVar.A(charsetE);
            if (strA == null) {
                long j2 = dbmVar.b;
                ArrayList arrayList3 = (j2 == -9223372036854775807L || !dbmVar.c) ? null : new ArrayList();
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    List list = (List) arrayList.get(i9);
                    if (!list.isEmpty()) {
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i9)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i9 + 1)).longValue();
                        abnxVar = new abnx(list, jLongValue, jLongValue2 - jLongValue);
                        if (j2 != -9223372036854775807L || jLongValue2 >= j2) {
                            bvhVar.a(abnxVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(abnxVar);
                        }
                    } else if (i9 == 0) {
                        i9 = 0;
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue3 = ((Long) arrayList2.get(i9)).longValue();
                        long jLongValue4 = ((Long) arrayList2.get(i9 + 1)).longValue();
                        abnxVar = new abnx(list, jLongValue3, jLongValue4 - jLongValue3);
                        if (j2 != -9223372036854775807L) {
                            bvhVar.a(abnxVar);
                        } else {
                            bvhVar.a(abnxVar);
                        }
                    } else {
                        continue;
                    }
                    i9++;
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        bvhVar.a((abnx) arrayList3.get(i10));
                    }
                    return;
                }
                return;
            }
            if (strA.startsWith("Format:")) {
                dciVarA = dci.a(strA);
            } else {
                if (strA.startsWith("Dialogue:")) {
                    if (dciVarA == null) {
                        bvx.e("SsaParser", "Skipping dialogue line before complete format: ".concat(strA));
                    } else {
                        ahno.F(strA.startsWith("Dialogue:"));
                        String strSubstring = strA.substring(9);
                        int i11 = dciVarA.f;
                        String[] strArrSplit = strSubstring.split(",", i11);
                        if (strArrSplit.length != i11) {
                            bvx.e("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strA));
                        } else {
                            int i12 = dciVarA.a;
                            if (i12 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i12].trim());
                                } catch (RuntimeException unused) {
                                    bvx.e("SsaParser", "Fail to parse layer: ".concat(String.valueOf(strArrSplit[dciVarA.a])));
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jG = g(strArrSplit[dciVarA.b]);
                            if (jG == -9223372036854775807L) {
                                bvx.e("SsaParser", "Skipping invalid timing: ".concat(strA));
                            } else {
                                long jG2 = g(strArrSplit[dciVarA.c]);
                                if (jG2 == -9223372036854775807L || jG2 <= jG) {
                                    charset = charsetE;
                                    bvx.e("SsaParser", "Skipping invalid timing: ".concat(strA));
                                } else {
                                    Map map = dcjVar.e;
                                    if (map != null) {
                                        int i13 = dciVarA.d;
                                        charset = charsetE;
                                        dcmVar = i13 != -1 ? (dcm) map.get(strArrSplit[i13].trim()) : null;
                                        String str = strArrSplit[dciVarA.e];
                                        matcher = dcl.a.matcher(str);
                                        i4 = -1;
                                        pointF = null;
                                        while (matcher.find()) {
                                            strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            try {
                                                try {
                                                    matcher3 = dcl.b.matcher(strGroup);
                                                    matcher = matcher;
                                                    try {
                                                        matcher4 = dcl.c.matcher(strGroup);
                                                        zFind = matcher3.find();
                                                        zFind2 = matcher4.find();
                                                        if (zFind) {
                                                            if (zFind2) {
                                                                StringBuilder sb = new StringBuilder();
                                                                j = jG2;
                                                                try {
                                                                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                                    sb.append(strGroup);
                                                                    sb.append('\'');
                                                                    bvx.h(sb.toString());
                                                                } catch (RuntimeException unused2) {
                                                                }
                                                            } else {
                                                                j = jG2;
                                                            }
                                                            strGroup2 = matcher3.group(1);
                                                            strGroup3 = matcher3.group(2);
                                                        } else {
                                                            j = jG2;
                                                            if (zFind2) {
                                                                strGroup2 = matcher4.group(1);
                                                                strGroup3 = matcher4.group(2);
                                                            } else {
                                                                pointF2 = null;
                                                            }
                                                            if (pointF2 != null) {
                                                                pointF = pointF2;
                                                            }
                                                            matcher2 = dcl.d.matcher(strGroup);
                                                            if (matcher2.find()) {
                                                                String strGroup4 = matcher2.group(1);
                                                                strGroup4.getClass();
                                                                iA = dcm.a(strGroup4);
                                                            } else {
                                                                iA = -1;
                                                            }
                                                            if (iA != -1) {
                                                                i4 = iA;
                                                            }
                                                            jG2 = j;
                                                        }
                                                        strGroup2.getClass();
                                                        float f4 = Float.parseFloat(strGroup2.trim());
                                                        strGroup3.getClass();
                                                        pointF2 = new PointF(f4, Float.parseFloat(strGroup3.trim()));
                                                        if (pointF2 != null) {
                                                            pointF = pointF2;
                                                        }
                                                    } catch (RuntimeException unused3) {
                                                        j = jG2;
                                                    }
                                                } catch (RuntimeException unused4) {
                                                    j = jG2;
                                                    matcher = matcher;
                                                }
                                                matcher2 = dcl.d.matcher(strGroup);
                                                if (matcher2.find()) {
                                                    String strGroup5 = matcher2.group(1);
                                                    strGroup5.getClass();
                                                    iA = dcm.a(strGroup5);
                                                } else {
                                                    iA = -1;
                                                }
                                                if (iA != -1) {
                                                    i4 = iA;
                                                }
                                            } catch (RuntimeException unused5) {
                                            }
                                            jG2 = j;
                                        }
                                        long j3 = jG2;
                                        String strReplace = dcl.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f5 = dcjVar.f;
                                        f = dcjVar.g;
                                        spannableString = new SpannableString(strReplace);
                                        burVar = new bur();
                                        burVar.d(spannableString);
                                        burVar.l = i3;
                                        if (dcmVar != null) {
                                            num = dcmVar.c;
                                            f2 = -3.4028235E38f;
                                            if (num != null) {
                                                spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            if (dcmVar.j == 3 && (num2 = dcmVar.d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            }
                                            f3 = dcmVar.e;
                                            if (f3 != -3.4028235E38f && f != -3.4028235E38f) {
                                                burVar.e(f3 / f, 1);
                                            }
                                            if (dcmVar.f) {
                                                i8 = 0;
                                                if (dcmVar.g) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            } else if (dcmVar.g) {
                                                i8 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i8 = 0;
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            }
                                            if (dcmVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), 33);
                                            }
                                            if (dcmVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), 33);
                                            }
                                        } else {
                                            f2 = -3.4028235E38f;
                                        }
                                        if (i4 != -1) {
                                            i5 = i4;
                                        } else if (dcmVar != null) {
                                            i5 = dcmVar.b;
                                        } else {
                                            i5 = -1;
                                        }
                                        switch (i5) {
                                            case 0:
                                            default:
                                                bvx.e("SsaParser", a.bR(i5, "Unknown alignment: "));
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        burVar.b = alignment;
                                        switch (i5) {
                                            case 0:
                                            default:
                                                bvx.e("SsaParser", a.bR(i5, "Unknown alignment: "));
                                            case -1:
                                                i6 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i6 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i6 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i6 = 2;
                                                break;
                                        }
                                        burVar.f = i6;
                                        switch (i5) {
                                            case 0:
                                            default:
                                                bvx.e("SsaParser", a.bR(i5, "Unknown alignment: "));
                                            case -1:
                                                i7 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i7 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i7 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i7 = 0;
                                                break;
                                        }
                                        burVar.d = i7;
                                        if (pointF != null || f == f2 || f5 == f2) {
                                            burVar.e = e(burVar.f);
                                            burVar.c(e(i7), 0);
                                        } else {
                                            burVar.e = pointF.x / f5;
                                            burVar.c(pointF.y / f, 0);
                                        }
                                        busVarA = burVar.a();
                                        iF2 = f(j3, arrayList2, arrayList);
                                        for (iF = f(jG, arrayList2, arrayList); iF < iF2; iF++) {
                                            ((List) arrayList.get(iF)).add(busVarA);
                                        }
                                    } else {
                                        charset = charsetE;
                                    }
                                    String str2 = strArrSplit[dciVarA.e];
                                    matcher = dcl.a.matcher(str2);
                                    i4 = -1;
                                    pointF = null;
                                    while (matcher.find()) {
                                        strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        matcher3 = dcl.b.matcher(strGroup);
                                        matcher = matcher;
                                        matcher4 = dcl.c.matcher(strGroup);
                                        zFind = matcher3.find();
                                        zFind2 = matcher4.find();
                                        if (zFind) {
                                            if (zFind2) {
                                                StringBuilder sb2 = new StringBuilder();
                                                j = jG2;
                                                sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                sb2.append(strGroup);
                                                sb2.append('\'');
                                                bvx.h(sb2.toString());
                                            } else {
                                                j = jG2;
                                            }
                                            strGroup2 = matcher3.group(1);
                                            strGroup3 = matcher3.group(2);
                                        } else {
                                            j = jG2;
                                            if (zFind2) {
                                                strGroup2 = matcher4.group(1);
                                                strGroup3 = matcher4.group(2);
                                            } else {
                                                pointF2 = null;
                                            }
                                            if (pointF2 != null) {
                                                pointF = pointF2;
                                            }
                                            matcher2 = dcl.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup6 = matcher2.group(1);
                                                strGroup6.getClass();
                                                iA = dcm.a(strGroup6);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i4 = iA;
                                            }
                                            jG2 = j;
                                        }
                                        strGroup2.getClass();
                                        float f6 = Float.parseFloat(strGroup2.trim());
                                        strGroup3.getClass();
                                        pointF2 = new PointF(f6, Float.parseFloat(strGroup3.trim()));
                                        if (pointF2 != null) {
                                            pointF = pointF2;
                                        }
                                        matcher2 = dcl.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup7 = matcher2.group(1);
                                            strGroup7.getClass();
                                            iA = dcm.a(strGroup7);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i4 = iA;
                                        }
                                        jG2 = j;
                                    }
                                    long j4 = jG2;
                                    String strReplace2 = dcl.a.matcher(str2).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = dcjVar.f;
                                    f = dcjVar.g;
                                    spannableString = new SpannableString(strReplace2);
                                    burVar = new bur();
                                    burVar.d(spannableString);
                                    burVar.l = i3;
                                    if (dcmVar != null) {
                                        num = dcmVar.c;
                                        f2 = -3.4028235E38f;
                                        if (num != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (dcmVar.j == 3) {
                                            spannableString.setSpan(new BackgroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        f3 = dcmVar.e;
                                        if (f3 != -3.4028235E38f) {
                                            burVar.e(f3 / f, 1);
                                        }
                                        if (dcmVar.f) {
                                            i8 = 0;
                                            if (dcmVar.g) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (dcmVar.g) {
                                            i8 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i8 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (dcmVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), 33);
                                        }
                                        if (dcmVar.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), 33);
                                        }
                                    } else {
                                        f2 = -3.4028235E38f;
                                    }
                                    if (i4 != -1) {
                                        i5 = i4;
                                    } else if (dcmVar != null) {
                                        i5 = dcmVar.b;
                                    } else {
                                        i5 = -1;
                                    }
                                    switch (i5) {
                                        case 0:
                                        default:
                                            bvx.e("SsaParser", a.bR(i5, "Unknown alignment: "));
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    burVar.b = alignment;
                                    switch (i5) {
                                        case 0:
                                        default:
                                            bvx.e("SsaParser", a.bR(i5, "Unknown alignment: "));
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    burVar.f = i6;
                                    switch (i5) {
                                        case 0:
                                        default:
                                            bvx.e("SsaParser", a.bR(i5, "Unknown alignment: "));
                                        case -1:
                                            i7 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i7 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i7 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i7 = 0;
                                            break;
                                    }
                                    burVar.d = i7;
                                    if (pointF != null) {
                                        burVar.e = e(burVar.f);
                                        burVar.c(e(i7), 0);
                                    } else {
                                        burVar.e = e(burVar.f);
                                        burVar.c(e(i7), 0);
                                    }
                                    busVarA = burVar.a();
                                    iF2 = f(j4, arrayList2, arrayList);
                                    while (iF < iF2) {
                                        ((List) arrayList.get(iF)).add(busVarA);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetE;
                } else {
                    charset = charsetE;
                }
                dcjVar = this;
                dciVarA = dciVarA;
                charsetE = charset;
                bwbVar = bwbVar;
            }
        }
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
