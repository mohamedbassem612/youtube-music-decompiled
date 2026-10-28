package defpackage;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import app.rive.semantics.SemanticState;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ort implements InputFilter {
    /* JADX WARN: Code duplicated, block: B:31:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0049  */
    /* JADX WARN: Code duplicated, block: B:34:0x0050  */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder = null;
        int i5 = i;
        while (i < i2) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            int i6 = iCodePointAt / SemanticState.Obscured;
            int[] iArr = orw.a;
            if (i6 == 31) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                if (i > i5) {
                    spannableStringBuilder.append(charSequence.subSequence(i5, i));
                }
                i5 = i + iCharCount;
            } else if (i6 == 2) {
                if (Arrays.binarySearch(orw.a, iCodePointAt) >= 0) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i > i5) {
                        spannableStringBuilder.append(charSequence.subSequence(i5, i));
                    }
                    i5 = i + iCharCount;
                }
            } else if (i6 == 3) {
                if (iCodePointAt == 12336 || iCodePointAt == 12349 || iCodePointAt == 12951 || iCodePointAt == 12953) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i > i5) {
                        spannableStringBuilder.append(charSequence.subSequence(i5, i));
                    }
                    i5 = i + iCharCount;
                }
            } else if (i6 == 15) {
                if (iCodePointAt == 65039) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i > i5) {
                        spannableStringBuilder.append(charSequence.subSequence(i5, i));
                    }
                    i5 = i + iCharCount;
                }
            } else if (iCodePointAt == 169 || iCodePointAt == 174) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                if (i > i5) {
                    spannableStringBuilder.append(charSequence.subSequence(i5, i));
                }
                i5 = i + iCharCount;
            }
            i += iCharCount;
        }
        if (spannableStringBuilder == null) {
            return null;
        }
        if (i5 < i2) {
            spannableStringBuilder.append(charSequence.subSequence(i5, i2));
        }
        return spannableStringBuilder;
    }
}
