package defpackage;

import android.graphics.Color;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.LruCache;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accm implements zwz {
    public final List a;
    public final List b;
    public final List c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private LruCache g;

    public accm(boolean z, boolean z2, boolean z3, int i) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        if (i > 0) {
            this.g = new LruCache(i);
        }
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    static CharSequence c(String str) {
        String strSubstring;
        boolean z;
        int iIndexOf;
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = null;
        int i2 = 0;
        while (i2 < str.length()) {
            int iIndexOf2 = str.indexOf(60, i2);
            if (iIndexOf2 == -1) {
                spannableStringBuilder.append((CharSequence) str.substring(i2));
                break;
            }
            spannableStringBuilder.append((CharSequence) str.substring(i2, iIndexOf2));
            int iIndexOf3 = str.indexOf(62, iIndexOf2);
            if (iIndexOf3 == -1) {
                spannableStringBuilder.append((CharSequence) str.substring(iIndexOf2));
                break;
            }
            String strSubstring2 = str.substring(iIndexOf2 + 1, iIndexOf3);
            i2 = iIndexOf3 + 1;
            if (strSubstring2.equalsIgnoreCase("br/") || strSubstring2.equalsIgnoreCase("br")) {
                spannableStringBuilder.append('\n');
            } else {
                if (strSubstring2.startsWith("/")) {
                    z = true;
                    strSubstring = strSubstring2.substring(1);
                } else {
                    int iIndexOf4 = strSubstring2.indexOf(32);
                    if (iIndexOf4 == -1) {
                        z = false;
                        strSubstring = strSubstring2;
                    } else {
                        strSubstring = strSubstring2.substring(0, iIndexOf4);
                        z = false;
                    }
                }
                String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                if (!lowerCase.equals("b") && !lowerCase.equals("i") && !lowerCase.equals("u") && !lowerCase.equals("font")) {
                    spannableStringBuilder.append((CharSequence) str.substring(iIndexOf2, i2));
                } else if (!z) {
                    accl acclVar = new accl(lowerCase, spannableStringBuilder.length());
                    if (lowerCase.equals("font")) {
                        int iIndexOf5 = strSubstring2.indexOf(32);
                        String lowerCase2 = iIndexOf5 != -1 ? strSubstring2.substring(iIndexOf5 + 1).toLowerCase(Locale.ROOT) : null;
                        if (lowerCase2 != null && (iIndexOf = lowerCase2.indexOf("color=")) != -1 && (i = iIndexOf + 6) < lowerCase2.length()) {
                            int i3 = lowerCase2.charAt(i) == '\"' ? 34 : 32;
                            if (i3 == 34) {
                                i = iIndexOf + 7;
                            }
                            int iIndexOf6 = lowerCase2.indexOf(i3, i);
                            try {
                                acclVar.c = Integer.valueOf(Color.parseColor(iIndexOf6 != -1 ? lowerCase2.substring(i, iIndexOf6) : lowerCase2.substring(i)));
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    if (arrayDeque == null) {
                        arrayDeque = new ArrayDeque(4);
                    }
                    arrayDeque.push(acclVar);
                } else if (arrayDeque != null) {
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        accl acclVar2 = (accl) it.next();
                        if (acclVar2.a.equals(lowerCase)) {
                            g(spannableStringBuilder, acclVar2, spannableStringBuilder.length());
                            it.remove();
                            break;
                        }
                    }
                } else {
                    arrayDeque = null;
                }
            }
        }
        while (arrayDeque != null && !arrayDeque.isEmpty()) {
            g(spannableStringBuilder, (accl) arrayDeque.pop(), spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r2 == 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.acck f(java.lang.Object r2) {
        /*
            boolean r0 = r2 instanceof android.text.style.StyleSpan
            if (r0 == 0) goto L11
            android.text.style.StyleSpan r2 = (android.text.style.StyleSpan) r2
            int r2 = r2.getStyle()
            r0 = 1
            if (r2 == r0) goto L16
            r0 = 2
            if (r2 != r0) goto L2f
            goto L16
        L11:
            boolean r0 = r2 instanceof android.text.style.UnderlineSpan
            if (r0 == 0) goto L1d
            r0 = 3
        L16:
            acck r2 = new acck
            r1 = 0
            r2.<init>(r0, r1)
            goto L30
        L1d:
            boolean r0 = r2 instanceof android.text.style.ForegroundColorSpan
            if (r0 == 0) goto L2f
            android.text.style.ForegroundColorSpan r2 = (android.text.style.ForegroundColorSpan) r2
            acck r0 = new acck
            r1 = 4
            int r2 = r2.getForegroundColor()
            r0.<init>(r1, r2)
            r2 = r0
            goto L30
        L2f:
            r2 = 0
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.accm.f(java.lang.Object):acck");
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, accl acclVar, int i) {
        String str = acclVar.a;
        int iHashCode = str.hashCode();
        Object styleSpan = null;
        if (iHashCode != 98) {
            if (iHashCode != 105) {
                if (iHashCode != 117) {
                    if (iHashCode == 3148879 && str.equals("font") && acclVar.c != null) {
                        styleSpan = new ForegroundColorSpan(acclVar.c.intValue());
                    }
                } else if (str.equals("u")) {
                    styleSpan = new UnderlineSpan();
                }
            } else if (str.equals("i")) {
                styleSpan = new StyleSpan(2);
            }
        } else if (str.equals("b")) {
            styleSpan = new StyleSpan(1);
        }
        if (styleSpan != null) {
            spannableStringBuilder.setSpan(styleSpan, acclVar.b, i, 33);
        }
    }

    @Override // defpackage.zwz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acco a() {
        int[] iArr;
        ArrayList arrayList;
        int i;
        int[] iArr2;
        ArrayList arrayList2;
        int size;
        acck acckVarF;
        List<CharSequence> list = this.c;
        ArrayList arrayList3 = new ArrayList(list.size());
        for (CharSequence acbwVar : list) {
            if (!(acbwVar instanceof SpannableStringBuilder)) {
                boolean z = this.e;
                boolean z2 = this.d;
                acbwVar = z ? new acbw(acbwVar, z2) : z2 ? c(acbwVar.toString()) : Html.fromHtml(acbwVar.toString());
            }
            arrayList3.add(acbwVar);
        }
        if (!this.f) {
            return new acco(this.a, this.b, arrayList3, this.g);
        }
        int size2 = arrayList3.size();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        int[] iArr3 = new int[size2];
        int[] iArr4 = new int[size2];
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            CharSequence charSequence = (CharSequence) arrayList3.get(i2);
            iArr3[i2] = arrayList6.size();
            if (charSequence instanceof acbw) {
                map4.put(Integer.valueOf(i2), charSequence);
                iArr4[i2] = arrayList6.size();
                iArr = iArr4;
                arrayList = arrayList3;
                map4 = map4;
                i = i2;
                iArr2 = iArr3;
            } else {
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    int length = spanned.length();
                    Class<Object> cls = Object.class;
                    iArr = iArr4;
                    i = i2;
                    Object[] spans = spanned.getSpans(0, length, cls);
                    int length2 = spans.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            TreeSet treeSet = new TreeSet();
                            treeSet.add(0);
                            treeSet.add(Integer.valueOf(length));
                            Object[] spans2 = spanned.getSpans(0, length, cls);
                            int i4 = 0;
                            for (int length3 = spans2.length; i4 < length3; length3 = length3) {
                                int i5 = i4;
                                Object obj = spans2[i5];
                                treeSet.add(Integer.valueOf(spanned.getSpanStart(obj)));
                                treeSet.add(Integer.valueOf(spanned.getSpanEnd(obj)));
                                i4 = i5 + 1;
                            }
                            ArrayList arrayList7 = new ArrayList(treeSet);
                            int i6 = 0;
                            while (i6 < arrayList7.size() - 1) {
                                int iIntValue = ((Integer) arrayList7.get(i6)).intValue();
                                int i7 = i6 + 1;
                                int iIntValue2 = ((Integer) arrayList7.get(i7)).intValue();
                                if (iIntValue == iIntValue2) {
                                    arrayList2 = arrayList3;
                                } else {
                                    String string = spanned.subSequence(iIntValue, iIntValue2).toString();
                                    ArrayList<acck> arrayList8 = new ArrayList();
                                    Object[] spans3 = spanned.getSpans(iIntValue, iIntValue2, cls);
                                    int length4 = spans3.length;
                                    int i8 = 0;
                                    while (i8 < length4) {
                                        int i9 = length4;
                                        Object obj2 = spans3[i8];
                                        int i10 = i8;
                                        int spanStart = spanned.getSpanStart(obj2);
                                        ArrayList arrayList9 = arrayList3;
                                        int spanEnd = spanned.getSpanEnd(obj2);
                                        if (spanStart <= iIntValue && spanEnd >= iIntValue2 && (acckVarF = f(obj2)) != null) {
                                            arrayList8.add(acckVarF);
                                        }
                                        i8 = i10 + 1;
                                        length4 = i9;
                                        arrayList3 = arrayList9;
                                    }
                                    arrayList2 = arrayList3;
                                    if (arrayList8.isEmpty()) {
                                        size = -1;
                                    } else {
                                        Collections.sort(arrayList8, new rit(14));
                                        Integer num = (Integer) map2.get(arrayList8);
                                        if (num != null) {
                                            size = num.intValue();
                                        } else {
                                            size = arrayList4.size();
                                            arrayList4.add(Integer.valueOf(arrayList8.size()));
                                            for (acck acckVar : arrayList8) {
                                                arrayList4.add(Integer.valueOf(acckVar.a));
                                                arrayList4.add(Integer.valueOf(acckVar.b));
                                            }
                                            map2.put(arrayList8, Integer.valueOf(size));
                                        }
                                    }
                                    int iU = aawr.u(string, sb, map);
                                    arrayList6.add(Integer.valueOf(aawr.t(iU, string.length() + iU, size, arrayList5, map3)));
                                }
                                arrayList7 = arrayList7;
                                i6 = i7;
                                iArr3 = iArr3;
                                cls = cls;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            break;
                        }
                        if (f(spans[i3]) == null) {
                            map4.put(Integer.valueOf(i), spanned);
                            arrayList = arrayList3;
                            break;
                        }
                        i3++;
                    }
                    iArr2 = iArr3;
                } else {
                    iArr = iArr4;
                    arrayList = arrayList3;
                    map4 = map4;
                    i = i2;
                    iArr2 = iArr3;
                    String string2 = charSequence.toString();
                    if (!string2.isEmpty()) {
                        int iU2 = aawr.u(string2, sb, map);
                        arrayList6.add(Integer.valueOf(aawr.t(iU2, string2.length() + iU2, -1, arrayList5, map3)));
                    }
                }
                iArr[i] = arrayList6.size();
            }
            i2 = i + 1;
            iArr4 = iArr;
            map4 = map4;
            iArr3 = iArr2;
            arrayList3 = arrayList;
        }
        int[] iArr5 = iArr4;
        HashMap map5 = map4;
        int[] iArr6 = iArr3;
        List list2 = this.a;
        List list3 = this.b;
        String string3 = sb.toString();
        int size3 = arrayList4.size();
        int[] iArr7 = new int[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            iArr7[i11] = ((Integer) arrayList4.get(i11)).intValue();
        }
        int size4 = arrayList5.size();
        int[] iArr8 = new int[size4];
        for (int i12 = 0; i12 < size4; i12++) {
            iArr8[i12] = ((Integer) arrayList5.get(i12)).intValue();
        }
        int size5 = arrayList6.size();
        int[] iArr9 = new int[size5];
        for (int i13 = 0; i13 < size5; i13++) {
            iArr9[i13] = ((Integer) arrayList6.get(i13)).intValue();
        }
        return new acco(list2, list3, new accn(string3, iArr7, iArr8, iArr9, iArr6, iArr5, map5), this.g);
    }

    public final void d(String str, long j, long j2) {
        if (j2 == j) {
            List list = this.b;
            if (!list.isEmpty()) {
                j2 = ((Long) aguu.K(list)).longValue();
            }
        }
        List list2 = this.c;
        if (list2.isEmpty()) {
            e(new StringBuilder(str), j, j2);
            return;
        }
        CharSequence charSequence = (CharSequence) aguu.K(list2);
        if (j != ((Long) aguu.L(this.a, -1L)).longValue() || j2 != ((Long) aguu.L(this.b, -1L)).longValue()) {
            if (this.e) {
                e(new acbo(charSequence, str), j, j2);
                return;
            }
            StringBuilder sb = new StringBuilder(charSequence);
            sb.append(str);
            e(sb, j, j2);
            return;
        }
        if (charSequence instanceof StringBuilder) {
            ((StringBuilder) charSequence).append(str);
            return;
        }
        int size = list2.size() - 1;
        StringBuilder sb2 = new StringBuilder(charSequence);
        sb2.append(str);
        list2.set(size, sb2);
    }

    public final void e(CharSequence charSequence, long j, long j2) {
        List list = this.a;
        if (!list.isEmpty() && j < ((Long) aguu.K(list)).longValue()) {
            ((agrc) ((agrc) acco.a.c()).k("com/google/android/libraries/youtube/player/subtitles/model/SubtitleWindowTextTimeline$Builder", "addLine", 318, "SubtitleWindowTextTimeline.java")).t("subtitles are not given in non-decreasing start time order");
        }
        list.add(Long.valueOf(j));
        this.b.add(Long.valueOf(j2));
        this.c.add(charSequence);
    }
}
