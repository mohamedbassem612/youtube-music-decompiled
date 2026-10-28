package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzc implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence.getClass();
        spanned.getClass();
        String string = charSequence.toString();
        if (!awrc.y(string, '\n') && !awrc.y(string, '\r')) {
            string = null;
        }
        if (string != null) {
            return awrc.C(awrc.C(string, "\n", ""), "\r", "");
        }
        return null;
    }
}
