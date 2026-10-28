package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddg {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", -1);
        map.put("lime", -16711936);
        map.put("cyan", -16711681);
        map.put("red", -65536);
        map.put("yellow", -256);
        map.put("magenta", -65281);
        map.put("blue", -16776961);
        map.put("black", -16777216);
        c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", -1);
        map2.put("bg_lime", -16711936);
        map2.put("bg_cyan", -16711681);
        map2.put("bg_red", -65536);
        map2.put("bg_yellow", -256);
        map2.put("bg_magenta", -65281);
        map2.put("bg_blue", -16776961);
        map2.put("bg_black", -16777216);
        d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x020c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3 A[EDGE_INSN: B:135:0x01a3->B:92:0x01a3 BREAK  A[LOOP:1: B:73:0x0125->B:137:?]] */
    static SpannedString a(String str, String str2, List list) {
        int i;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String strTrim = "";
            if (i5 >= str2.length()) {
                break;
            }
            int i6 = i5 + 1;
            char cCharAt = str2.charAt(i5);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i6);
                int iIndexOf2 = str2.indexOf(32, i6);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i6, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    bvx.e("WebvttCueParser", a.bT(strSubstring, "ignoring unsupported entity: '&", ";'"));
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                bvx.e("WebvttCueParser", a.bT(strSubstring, "ignoring unsupported entity: '&", ";'"));
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            bvx.e("WebvttCueParser", a.bT(strSubstring, "ignoring unsupported entity: '&", ";'"));
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        bvx.e("WebvttCueParser", a.bT(strSubstring, "ignoring unsupported entity: '&", ";'"));
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i5 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i4 = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i6 < str2.length()) {
                char cCharAt2 = str2.charAt(i6);
                int iIndexOf3 = str2.indexOf(62, i6);
                int length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i7 = length - 2;
                if (str2.charAt(i7) == '/') {
                    i2 = i4;
                    i = 1;
                } else {
                    i = i4;
                    i2 = i;
                }
                int i8 = i5 + (cCharAt2 == '/' ? 2 : 1);
                if (i == 0) {
                    i7 = length - 1;
                }
                String strSubstring2 = str2.substring(i8, i7);
                if (strSubstring2.trim().isEmpty()) {
                    i3 = i2;
                } else {
                    String strTrim2 = strSubstring2.trim();
                    ahno.F(!strTrim2.isEmpty());
                    int i9 = bwp.a;
                    String str3 = strTrim2.split("[ \\.]", 2)[i2];
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 98 ? !str3.equals("b") : iHashCode2 == 99 ? !str3.equals("c") : iHashCode2 == 105 ? !str3.equals("i") : iHashCode2 == 3650 ? !str3.equals("rt") : iHashCode2 == 3314158 ? !str3.equals("lang") : iHashCode2 == 3511770 ? !str3.equals("ruby") : iHashCode2 == 117 ? !str3.equals("u") : !(iHashCode2 == 118 && str3.equals("v"))) {
                        i3 = i2;
                    } else {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                yvh yvhVar = (yvh) arrayDeque.pop();
                                f(str, yvhVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new ddd(yvhVar, spannableStringBuilder.length()));
                                }
                                if (((String) yvhVar.b).equals(str3)) {
                                    break;
                                }
                            }
                        } else if (i == 0) {
                            int length2 = spannableStringBuilder.length();
                            String strTrim3 = strSubstring2.trim();
                            ahno.F(!strTrim3.isEmpty());
                            int iIndexOf4 = strTrim3.indexOf(" ");
                            if (iIndexOf4 == -1) {
                                i3 = i2;
                            } else {
                                strTrim = strTrim3.substring(iIndexOf4).trim();
                                i3 = i2;
                                strTrim3 = strTrim3.substring(i3, iIndexOf4);
                            }
                            String[] strArrSplit = strTrim3.split("\\.", -1);
                            String str4 = strArrSplit[i3];
                            HashSet hashSet = new HashSet();
                            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                                hashSet.add(strArrSplit[i10]);
                            }
                            arrayDeque.push(new yvh(str4, length2, strTrim, hashSet));
                        }
                        i3 = i2;
                    }
                }
                i5 = length;
                i4 = i3;
            }
            i5 = i6;
            i4 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            f(str, (yvh) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        f(str, new yvh("", i4, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0142 A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183 A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r16, defpackage.ddf r17) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddg.b(java.lang.String, ddf):void");
    }

    public static aawx c(bwb bwbVar, List list) {
        String strZ = bwbVar.z();
        if (strZ == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(strZ);
        if (matcher.matches()) {
            return g(null, matcher, bwbVar, list);
        }
        String strZ2 = bwbVar.z();
        if (strZ2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strZ2);
        if (matcher2.matches()) {
            return g(strZ.trim(), matcher2, bwbVar, list);
        }
        return null;
    }

    private static int d(List list, String str, yvh yvhVar) {
        List listE = e(list, str, yvhVar);
        for (int i = 0; i < listE.size(); i++) {
            int i2 = ((dde) listE.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    private static List e(List list, String str, yvh yvhVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ddb ddbVar = (ddb) list.get(i);
            ?? r4 = yvhVar.b;
            ?? r5 = yvhVar.d;
            Object obj = yvhVar.c;
            if (!ddbVar.a.isEmpty() || !ddbVar.b.isEmpty() || !ddbVar.c.isEmpty() || !ddbVar.d.isEmpty()) {
                int iB = ddb.b(ddb.b(ddb.b(0, ddbVar.a, str, 1073741824), ddbVar.b, (String) r4, 2), ddbVar.d, (String) obj, 4);
                if (iB == -1 || !r5.containsAll(ddbVar.c)) {
                    size = 0;
                } else {
                    size = iB + (ddbVar.c.size() << 2);
                }
            } else if (TextUtils.isEmpty(r4)) {
                size = 1;
            } else {
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new dde(size, ddbVar));
            }
        }
        j$.util.List.EL.sort(arrayList, null);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Set] */
    private static void f(String str, yvh yvhVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = yvhVar.a;
        int length = spannableStringBuilder.length();
        String str2 = (String) yvhVar.b;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iD = d(list2, str, yvhVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        j$.util.List.EL.sort(arrayList, ddd.a);
                        int i3 = i;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((ddd) arrayList.get(i4)).c.b)) {
                                ddd dddVar = (ddd) arrayList.get(i4);
                                yvh yvhVar2 = dddVar.c;
                                int iD2 = d(list2, str, yvhVar2);
                                if (iD2 == i2) {
                                    iD2 = iD != i2 ? iD : 1;
                                }
                                int i5 = yvhVar2.a - length2;
                                int i6 = dddVar.b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                                spannableStringBuilder.delete(i5, i6);
                                spannableStringBuilder.setSpan(new buw(charSequenceSubSequence.toString(), iD2), i3, i5, 33);
                                length2 += charSequenceSubSequence.length();
                                i3 = i5;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : yvhVar.d) {
                                Map map = c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new buy((String) yvhVar.c), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listE = e(list2, str, yvhVar);
        for (int i7 = 0; i7 < listE.size(); i7++) {
            ddb ddbVar = ((dde) listE.get(i7)).b;
            if (ddbVar != null) {
                if (ddbVar.a() != -1) {
                    buv.a(spannableStringBuilder, new StyleSpan(ddbVar.a()), i, length);
                }
                if (ddbVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (ddbVar.g) {
                    if (!ddbVar.g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    buv.a(spannableStringBuilder, new ForegroundColorSpan(ddbVar.f), i, length);
                }
                if (ddbVar.i) {
                    if (!ddbVar.i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    buv.a(spannableStringBuilder, new BackgroundColorSpan(ddbVar.h), i, length);
                }
                if (ddbVar.e != null) {
                    buv.a(spannableStringBuilder, new TypefaceSpan(ddbVar.e), i, length);
                }
                int i8 = ddbVar.m;
                if (i8 == 1) {
                    buv.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ddbVar.n, true), i, length);
                } else if (i8 == 2) {
                    buv.a(spannableStringBuilder, new RelativeSizeSpan(ddbVar.n), i, length);
                } else if (i8 == 3) {
                    buv.a(spannableStringBuilder, new RelativeSizeSpan(ddbVar.n / 100.0f), i, length);
                }
                if (ddbVar.p) {
                    spannableStringBuilder.setSpan(new buv(), i, length, 33);
                }
            }
        }
    }

    private static aawx g(String str, Matcher matcher, bwb bwbVar, List list) {
        ddf ddfVar = new ddf();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            ddfVar.a = ddi.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            ddfVar.b = ddi.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            b(strGroup3, ddfVar);
            StringBuilder sb = new StringBuilder();
            String strZ = bwbVar.z();
            while (!TextUtils.isEmpty(strZ)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(strZ.trim());
                strZ = bwbVar.z();
            }
            ddfVar.c = a(str, sb.toString(), list);
            return new aawx(ddfVar.a().a(), ddfVar.a, ddfVar.b);
        } catch (IllegalArgumentException unused) {
            bvx.e("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }
}
