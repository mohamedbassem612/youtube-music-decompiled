package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bma implements TextWatcher {
    private final EditText b;
    private ato e;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    private int c = 0;
    private int d = 0;

    public bma(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.b;
        if (editText.isInEditMode()) {
            return;
        }
        int i = this.c;
        int i2 = this.d;
        if (i2 > 0) {
            int iA = bll.b().a();
            if (iA != 0) {
                if (iA == 1) {
                    bll.b().f(editable, i, i2 + i, this.a);
                    return;
                } else if (iA != 3) {
                    return;
                }
            }
            bll bllVarB = bll.b();
            if (this.e == null) {
                this.e = new blz(editText, 0);
            }
            bllVarB.h(this.e);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c = i;
        if (i2 > i3) {
            i3 = 0;
        }
        this.d = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
