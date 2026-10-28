package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.LruCache;
import java.util.AbstractList;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class accn extends AbstractList implements RandomAccess {
    private final String a;
    private final int[] b;
    private final int[] c;
    private final int[] d;
    private final int[] e;
    private final int[] f;
    private final Map g;
    private final LruCache h = new LruCache(5);

    public accn(String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, Map map) {
        this.a = str;
        this.b = iArr;
        this.c = iArr2;
        this.d = iArr3;
        this.e = iArr4;
        this.f = iArr5;
        this.g = map;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Object styleSpan;
        Map map = this.g;
        Integer numValueOf = Integer.valueOf(i);
        CharSequence charSequence = (CharSequence) map.get(numValueOf);
        if (charSequence != null) {
            return charSequence;
        }
        LruCache lruCache = this.h;
        CharSequence charSequence2 = (CharSequence) lruCache.get(numValueOf);
        if (charSequence2 != null) {
            return charSequence2;
        }
        int i2 = this.f[i];
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = this.e[i]; i3 < i2; i3++) {
            int i4 = this.d[i3] * 3;
            int[] iArr = this.c;
            String str = this.a;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            String strSubstring = str.substring(i5, i6);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) strSubstring);
            if (i7 != -1) {
                int[] iArr2 = this.b;
                int i8 = i7 + 1;
                int i9 = iArr2[i7];
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = i8 + 1;
                    int i12 = iArr2[i8];
                    i8 += 2;
                    int i13 = iArr2[i11];
                    if (i12 == 1) {
                        styleSpan = new StyleSpan(1);
                    } else if (i12 == 2) {
                        styleSpan = new StyleSpan(2);
                    } else if (i12 != 3) {
                        styleSpan = i12 != 4 ? null : new ForegroundColorSpan(i13);
                    } else {
                        styleSpan = new UnderlineSpan();
                    }
                    if (styleSpan != null) {
                        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 33);
                    }
                }
            }
        }
        SpannableString spannableString = new SpannableString(spannableStringBuilder);
        lruCache.put(Integer.valueOf(i), spannableString);
        return spannableString;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.length;
    }
}
