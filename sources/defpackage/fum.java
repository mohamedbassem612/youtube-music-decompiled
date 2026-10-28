package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fum implements TextWatcher {
    public EditText a;
    private int b;
    private int c;
    private final nry d;
    private final nsl e;
    private final boolean f;
    private final omj g;

    public fum(omj omjVar, nry nryVar, nsl nslVar, boolean z) {
        this.g = omjVar;
        this.d = nryVar;
        this.e = nslVar;
        this.f = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        if (editable.subSequence(this.b, this.c).toString().contains("\n")) {
            int i = this.c;
            if (!editable.subSequence(i - 1, i).toString().equals("\n") || (editText = this.a) == null) {
                return;
            }
            this.d.a(this.g.x(), mkh.b(editText, this.f, this.e.x, 21)).D();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = i;
        this.c = i + i3;
    }

    public fum() {
        throw null;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
