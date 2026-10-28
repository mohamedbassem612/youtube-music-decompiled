package defpackage;

import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fui implements Comparator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public fui(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    private final int a(Object obj) {
        Integer num = (Integer) ((aha) ((ahgb) this.a).e).get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private final int b(Object obj) {
        Integer num = (Integer) ((HashMap) ((xsc) this.a).c).get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.text.Spanned, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.text.Spanned, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.text.Spanned, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.text.Spanned, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.text.Editable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v30, types: [avcc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v4, types: [clz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        switch (this.$cid) {
            case 0:
                ?? r4 = this.a;
                int spanStart = r4.getSpanStart(obj);
                int spanEnd = r4.getSpanEnd(obj) - spanStart;
                int spanStart2 = r4.getSpanStart(obj2);
                int spanEnd2 = r4.getSpanEnd(obj2) - spanStart2;
                return spanEnd != spanEnd2 ? Integer.compare(spanEnd2, spanEnd) : Integer.compare(spanStart, spanStart2);
            case 1:
                int i = cma.a;
                ?? r5 = this.a;
                iA = r5.a(obj2);
                iA2 = r5.a(obj);
                return iA - iA2;
            case 2:
                iA3 = a(obj);
                iA4 = a(obj2);
                return iA4 - iA3;
            case 3:
                hcg hcgVar = (hcg) obj;
                hcg hcgVar2 = (hcg) obj2;
                agrf agrfVar = hur.a;
                if (!hcgVar.f.equals("LM")) {
                    if (hcgVar2.f.equals("LM")) {
                        return 1;
                    }
                    return this.a.compare(hcgVar, hcgVar2);
                }
                return -1;
            case 4:
                return ((Collator) this.a).compare((String) obj, (String) obj2);
            case 5:
                ?? r6 = this.a;
                int i2 = owt.c;
                return rpi.l(r6, (CharacterStyle) obj, (CharacterStyle) obj2);
            case 6:
                ?? r7 = this.a;
                String[] strArr = oxh.c;
                return rpi.l(r7, (CharacterStyle) obj, (CharacterStyle) obj2);
            case 7:
                ?? r8 = this.a;
                String[] strArr2 = oxh.c;
                return rpi.l(r8, (CharacterStyle) obj, (CharacterStyle) obj2);
            case 8:
                ?? r9 = this.a;
                return r9.getSpanStart((ImageSpan) obj) - r9.getSpanStart((ImageSpan) obj2);
            case 9:
                iA3 = b(obj);
                iA4 = b(obj2);
                return iA4 - iA3;
            case 10:
                String strD = ((aamo) obj).d();
                ?? r10 = this.a;
                return Long.compare(((Long) r10.apply(((aamo) obj2).d())).longValue(), ((Long) r10.apply(strD)).longValue());
            case 11:
                int iCompare = this.a.compare(obj, obj2);
                return iCompare == 0 ? atqq.f(Integer.valueOf(((admv) obj).b), Integer.valueOf(((admv) obj2).b)) : iCompare;
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Comparator comparator = aglh.b;
                entry.getClass();
                entry2.getClass();
                return this.a.compare(entry.getKey(), entry2.getKey());
            case 13:
                ?? r11 = this.a;
                iA = ((agow) r11.get((ahwp) obj2)).size();
                iA2 = ((agow) r11.get((ahwp) obj)).size();
                return iA - iA2;
            case 14:
                ?? r12 = this.a;
                int iA5 = r12.a(obj) - r12.a(obj2);
                return iA5 == 0 ? obj.getClass().getName().compareTo(obj2.getClass().getName()) : iA5;
            default:
                if (obj == null) {
                    return obj2 == null ? 0 : 1;
                }
                if (obj2 != null) {
                    return this.a.compare(obj, obj2);
                }
                return -1;
        }
    }

    public /* synthetic */ fui(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
