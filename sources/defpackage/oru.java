package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oru implements TextWatcher {
    private final /* synthetic */ int $cid;
    final /* synthetic */ EditText a;
    private int b;
    private int c;

    public oru(EditText editText, int i) {
        this.$cid = i;
        this.a = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            if (editable.subSequence(i2, this.c).toString().contains("\n")) {
                int i3 = this.c;
                if (editable.subSequence(i3 - 1, i3).toString().equals("\n")) {
                    ((mji) this.a).b();
                    return;
                }
                return;
            }
            return;
        }
        if (editable.subSequence(i2, this.c).toString().contains("\n")) {
            int i4 = this.c;
            if (editable.subSequence(i4 - 1, i4).toString().equals("\n")) {
                ((orw) this.a).b();
            }
        }
        orw orwVar = (orw) this.a;
        int lineCount = orwVar.getLineCount();
        if (orwVar.i != lineCount) {
            orwVar.measure(orwVar.j, orwVar.k);
            ((NodeViewInterface) orwVar.getParent()).z(new ory(orwVar.getText().toString(), orwVar.getMeasuredWidth(), orwVar.getMeasuredHeight()));
            orwVar.i = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.$cid;
        this.b = i;
        this.c = i + i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
