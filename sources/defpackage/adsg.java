package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adsg implements TextWatcher {
    private final EditText a;
    private final float b;
    private final int c;

    public adsg(EditText editText, float f, int i) {
        this.a = editText;
        this.b = f;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.isInEditMode() || i3 <= 0 || !(charSequence instanceof Spannable)) {
            return;
        }
        adsj.a(charSequence, i, i3 + i, this.b, this.c);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
