package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class blx implements InputFilter {
    private final TextView a;
    private ato b;

    public blx(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iA = bll.b().a();
        if (iA != 0) {
            if (iA == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0) {
                    charSequence = charSequence.subSequence(i, i2);
                } else if (i2 != charSequence.length()) {
                    i = 0;
                    charSequence = charSequence.subSequence(i, i2);
                }
                return bll.b().f(charSequence, 0, charSequence.length(), Alert.DURATION_SHOW_INDEFINITELY);
            }
            if (iA != 3) {
                return charSequence;
            }
        }
        bll bllVarB = bll.b();
        if (this.b == null) {
            this.b = new blz(textView, 1);
        }
        bllVarB.h(this.b);
        return charSequence;
    }
}
