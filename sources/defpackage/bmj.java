package defpackage;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bmj extends InputConnectionWrapper {
    private final TextView a;

    public bmj(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = textView;
        bme bmeVar = bme.b;
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return aja.m(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return aja.m(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
