package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afep implements TextWatcher {
    int a;
    final /* synthetic */ EditText b;
    final /* synthetic */ TextInputLayout c;

    public afep(TextInputLayout textInputLayout, EditText editText) {
        this.b = editText;
        this.c = textInputLayout;
        this.a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.c;
        textInputLayout.F(!textInputLayout.s, false);
        if (textInputLayout.e) {
            textInputLayout.C(editable);
        }
        if (textInputLayout.j) {
            textInputLayout.G(editable);
        }
        EditText editText = this.b;
        int lineCount = editText.getLineCount();
        int i = this.a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.o;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
