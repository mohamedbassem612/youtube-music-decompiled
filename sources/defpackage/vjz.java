package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vjz implements TextWatcher {
    private final EditText a;
    private final EditText b;
    private final String c;
    private final int d;
    private String e;
    private int f = -1;

    public vjz(EditText editText, EditText editText2, String str, int i) {
        this.a = editText;
        this.b = editText2;
        this.c = str + '_' + vjz.class.getName();
        this.d = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.b;
        if (editText == null) {
            Log.e(this.c, "Why is afterTextChanged() called with editText not initialized");
            return;
        }
        EditText editText2 = this.a;
        if (editText2 == null) {
            Log.e(this.c, "lineCountEditText is unexpected to be null");
            return;
        }
        if (this.e == null || this.f == -1) {
            Log.e(this.c, "afterTextChanges is called before beforeTextChanged()? beforeTextChangedText or beforeTextChangeCursorPosition is not initialized");
            return;
        }
        if (!editText.isCursorVisible() && editable.length() > 0) {
            editText.setCursorVisible(true);
        } else if (editText.isCursorVisible() && editable.length() == 0) {
            editText.setCursorVisible(false);
        }
        editText.removeTextChangedListener(this);
        try {
            if (editText2.getLineCount() > this.d) {
                editText.setText(this.e);
                editText.setSelection(this.f);
            }
        } finally {
            this.b.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.e = charSequence.toString();
        this.f = i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.b;
        EditText editText2 = this.a;
        if (editText == editText2 || editText2 == null) {
            return;
        }
        editText2.setText(charSequence);
    }
}
