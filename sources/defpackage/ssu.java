package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ssu implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ ssv b;

    public ssu(ssv ssvVar, EditText editText) {
        this.a = editText;
        this.b = ssvVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ssv ssvVar = this.b;
        ssvVar.c(ssvVar.l());
        EditText editText = this.a;
        float lineSpacingExtra = editText.getLineSpacingExtra();
        float lineSpacingMultiplier = editText.getLineSpacingMultiplier();
        editText.setLineSpacing(0.0f, 1.0f);
        editText.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
