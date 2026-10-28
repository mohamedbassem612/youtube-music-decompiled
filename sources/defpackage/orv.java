package defpackage;

import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class orv implements InputFilter {
    final /* synthetic */ orw a;

    public orv(orw orwVar) {
        this.a = orwVar;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Layout layout;
        int lineCount;
        char cCharAt;
        orw orwVar = this.a;
        orwVar.p = spanned.toString();
        orwVar.n = i3;
        orwVar.o = i4;
        if ((i3 != 0 || i4 != 0) && !TextUtils.isEmpty(charSequence) && (layout = orwVar.getLayout()) != null && (lineCount = layout.getLineCount()) > 0 && ((cCharAt = charSequence.charAt(i2 - 1)) == ' ' || cCharAt == 12288)) {
            float lineWidth = layout.getLineWidth(lineCount - 1);
            float width = (orwVar.getWidth() - orwVar.getPaddingLeft()) - orwVar.getPaddingRight();
            if (width > 0.0f && lineWidth >= width - 10.0f) {
                return "";
            }
        }
        return null;
    }
}
