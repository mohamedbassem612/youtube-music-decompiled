package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dcq {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final dcu f;
    public final String[] g;
    public final String h;
    public final String i;
    public final dcq j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public dcq(String str, String str2, long j, long j2, dcu dcuVar, String[] strArr, String str3, String str4, dcq dcqVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = dcuVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = dcqVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            bur burVar = new bur();
            burVar.d(new SpannableStringBuilder());
            map.put(str, burVar);
        }
        CharSequence charSequence = ((bur) map.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final dcq b(int i) {
        List list = this.m;
        if (list != null) {
            return (dcq) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void c(dcq dcqVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(dcqVar);
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        if (z || zEquals || ("div".equals(str) && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                dcq dcqVar = (dcq) this.m.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                dcqVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, String str, List list) {
        String str2;
        String str3 = this.h;
        boolean zEquals = "".equals(str3);
        boolean zH = h(j);
        if (true != zEquals) {
            str = str3;
        }
        if (zH && "div".equals(this.a) && (str2 = this.i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            b(i).e(j, str, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:127:0x022a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0239  */
    /* JADX WARN: Code duplicated, block: B:131:0x0253  */
    /* JADX WARN: Code duplicated, block: B:133:0x025c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0267  */
    /* JADX WARN: Code duplicated, block: B:139:0x026d  */
    public final void f(long j, Map map, Map map2, String str, Map map3) {
        dcq dcqVar;
        int i;
        dcu dcuVarB;
        int i2;
        float f;
        Iterator it;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        RelativeSizeSpan relativeSizeSpan;
        int i3;
        Map map4 = map;
        if (h(j)) {
            String str2 = this.h;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.k;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    bur burVar = (bur) map3.get(str4);
                    burVar.getClass();
                    dct dctVar = (dct) map2.get(str3);
                    dctVar.getClass();
                    dcu dcuVarB2 = dco.b(this.f, this.g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) burVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        burVar.d(spannableStringBuilder);
                    }
                    if (dcuVarB2 != null) {
                        dcq dcqVar2 = this.j;
                        if (dcuVarB2.a() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(dcuVarB2.a()), iIntValue, iIntValue2, 33);
                        }
                        if (dcuVarB2.f == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (dcuVarB2.g == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (dcuVarB2.c) {
                            if (!dcuVarB2.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            buv.a(spannableStringBuilder, new ForegroundColorSpan(dcuVarB2.b), iIntValue, iIntValue2);
                        }
                        if (dcuVarB2.e) {
                            if (!dcuVarB2.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            buv.a(spannableStringBuilder, new BackgroundColorSpan(dcuVarB2.d), iIntValue, iIntValue2);
                        }
                        if (dcuVarB2.a != null) {
                            buv.a(spannableStringBuilder, new TypefaceSpan(dcuVarB2.a), iIntValue, iIntValue2);
                        }
                        dcp dcpVar = dcuVarB2.r;
                        if (dcpVar != null) {
                            int i4 = dcpVar.f;
                            if (i4 == -1) {
                                int i5 = dctVar.j;
                                i4 = (i5 == 2 || i5 == 1) ? 3 : 1;
                                i3 = 1;
                            } else {
                                i3 = dcpVar.g;
                            }
                            int i6 = dcpVar.h;
                            if (i6 == -2) {
                                i6 = 1;
                            }
                            buv.a(spannableStringBuilder, new bux(i4, i3, i6), iIntValue, iIntValue2);
                        }
                        int i7 = dcuVarB2.m;
                        if (i7 == 2) {
                            while (true) {
                                if (dcqVar2 == null) {
                                    dcqVar2 = null;
                                    break;
                                }
                                dcu dcuVarB3 = dco.b(dcqVar2.f, dcqVar2.g, map4);
                                if (dcuVarB3 != null && dcuVarB3.m == 1) {
                                    break;
                                } else {
                                    dcqVar2 = dcqVar2.j;
                                }
                            }
                            if (dcqVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(dcqVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        dcqVar = null;
                                        break;
                                    }
                                    dcq dcqVar3 = (dcq) arrayDeque.pop();
                                    dcu dcuVarB4 = dco.b(dcqVar3.f, dcqVar3.g, map4);
                                    if (dcuVarB4 != null && dcuVarB4.m == 3) {
                                        dcqVar = dcqVar3;
                                        break;
                                    }
                                    for (int iA = dcqVar3.a() - 1; iA >= 0; iA--) {
                                        arrayDeque.push(dcqVar3.b(iA));
                                    }
                                }
                                if (dcqVar != null) {
                                    if (dcqVar.a() == 1) {
                                        i = 0;
                                        if (dcqVar.b(0).b != null) {
                                            String str5 = dcqVar.b(0).b;
                                            int i8 = bwp.a;
                                            dcu dcuVarB5 = dco.b(dcqVar.f, dcqVar.g, map4);
                                            int i9 = dcuVarB5 != null ? dcuVarB5.n : -1;
                                            if (i9 == -1 && (dcuVarB = dco.b(dcqVar2.f, dcqVar2.g, map4)) != null) {
                                                i9 = dcuVarB.n;
                                            }
                                            spannableStringBuilder.setSpan(new buw(str5, i9), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    bvx.h("Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (dcuVarB2.q == 1) {
                                buv.a(spannableStringBuilder, new buv(), iIntValue, iIntValue2);
                            }
                            i2 = dcuVarB2.j;
                            f = 100.0f;
                            if (i2 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                buv.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dcuVarB2.k, true), iIntValue, iIntValue2);
                            } else if (i2 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                buv.a(spannableStringBuilder, new RelativeSizeSpan(dcuVarB2.k), iIntValue, iIntValue2);
                            } else if (i2 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float sizeChange = dcuVarB2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                while (i < length) {
                                    float f4 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) > iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange *= relativeSizeSpan.getSizeChange();
                                    }
                                    buv.b(spannableStringBuilder, relativeSizeSpan, iIntValue, iIntValue2);
                                    i++;
                                    f = f4;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.a)) {
                                f3 = dcuVarB2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    burVar.k = (f3 * (-90.0f)) / f2;
                                }
                                alignment = dcuVarB2.o;
                                if (alignment != null) {
                                    burVar.b = alignment;
                                }
                                alignment2 = dcuVarB2.p;
                                if (alignment2 != null) {
                                    burVar.c = alignment2;
                                }
                            }
                            it2 = it;
                        } else if (i7 == 3 || i7 == 4) {
                            spannableStringBuilder.setSpan(new dco(), iIntValue, iIntValue2, 33);
                        }
                        i = 0;
                        if (dcuVarB2.q == 1) {
                            buv.a(spannableStringBuilder, new buv(), iIntValue, iIntValue2);
                        }
                        i2 = dcuVarB2.j;
                        f = 100.0f;
                        if (i2 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            buv.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dcuVarB2.k, true), iIntValue, iIntValue2);
                        } else if (i2 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            buv.a(spannableStringBuilder, new RelativeSizeSpan(dcuVarB2.k), iIntValue, iIntValue2);
                        } else if (i2 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float sizeChange2 = dcuVarB2.k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            while (i < length) {
                                float f5 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) > iIntValue) {
                                }
                                buv.b(spannableStringBuilder, relativeSizeSpan, iIntValue, iIntValue2);
                                i++;
                                f = f5;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange2), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.a)) {
                            f3 = dcuVarB2.s;
                            if (f3 != Float.MAX_VALUE) {
                                burVar.k = (f3 * (-90.0f)) / f2;
                            }
                            alignment = dcuVarB2.o;
                            if (alignment != null) {
                                burVar.b = alignment;
                            }
                            alignment2 = dcuVarB2.p;
                            if (alignment2 != null) {
                                burVar.c = alignment2;
                            }
                        }
                        it2 = it;
                    } else {
                        continue;
                    }
                }
            }
            int i10 = 0;
            while (i10 < a()) {
                b(i10).f(j, map4, map2, str3, map3);
                i10++;
                map4 = map;
            }
        }
    }

    public final void g(long j, boolean z, String str, Map map) {
        HashMap map2 = this.k;
        map2.clear();
        HashMap map3 = this.l;
        map3.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, map);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            i(str4, map).append('\n');
            return;
        }
        if (h(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((bur) entry.getValue()).a;
                charSequence.getClass();
                map2.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < a(); i++) {
                b(i).g(j, z || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str4, map);
                int length = spannableStringBuilderI2.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    if (spannableStringBuilderI2.charAt(length) != ' ') {
                        if (spannableStringBuilderI2.charAt(length) == '\n') {
                            break;
                        }
                        spannableStringBuilderI2.append('\n');
                        break;
                    }
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((bur) entry2.getValue()).a;
                charSequence2.getClass();
                map3.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final boolean h(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L) {
            if (this.e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }
}
