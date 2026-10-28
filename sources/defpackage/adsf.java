package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adsf implements InputFilter {
    private final TextView a;
    private final float b;
    private final int c;

    public adsf(TextView textView, float f, int i) {
        this.a = textView;
        this.b = f;
        this.c = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode() || charSequence == null || i == i2) {
            return null;
        }
        if (i != 0) {
            charSequence = charSequence.subSequence(i, i2);
        } else if (i2 != charSequence.length()) {
            i = 0;
            charSequence = charSequence.subSequence(i, i2);
        }
        return adsj.a(charSequence, 0, charSequence.length(), this.b, this.c);
    }
}
