package defpackage;

import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mkf implements InputFilter {
    public EditText a;
    private final mke b;

    public mkf(mke mkeVar) {
        this.b = mkeVar;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        EditText editText;
        Layout layout;
        int lineCount;
        mke mkeVar = this.b;
        synchronized (mkeVar) {
            mkeVar.e = spanned.toString();
            mkeVar.c = i3;
            mkeVar.d = i4;
        }
        if ((i3 != 0 || i4 != 0) && !TextUtils.isEmpty(charSequence) && (editText = this.a) != null && (layout = editText.getLayout()) != null && (lineCount = layout.getLineCount()) > 0) {
            char cCharAt = charSequence.charAt(i2 - 1);
            String str = mkh.a;
            if (cCharAt == ' ' || cCharAt == 12288) {
                float lineWidth = layout.getLineWidth(lineCount - 1);
                float width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
                if (width > 0.0f && lineWidth >= width - 10.0f) {
                    return "";
                }
            }
        }
        return null;
    }
}
