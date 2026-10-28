package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeai implements TextWatcher {
    final /* synthetic */ aeaj a;
    final /* synthetic */ aeaj b;
    private final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public aeai(aeaj aeajVar, aeaj aeajVar2) {
        this.a = aeajVar2;
        this.b = aeajVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        aeaj aeajVar = this.b;
        if (aeajVar.g) {
            return;
        }
        aeajVar.g = true;
        Editable editableText = this.a.d.getEditableText();
        CopyOnWriteArrayList<ImageSpan> copyOnWriteArrayList = this.c;
        for (ImageSpan imageSpan : copyOnWriteArrayList) {
            int spanStart = editableText.getSpanStart(imageSpan);
            int spanEnd = editableText.getSpanEnd(imageSpan);
            editableText.removeSpan(imageSpan);
            if (spanStart != spanEnd) {
                editableText.delete(spanStart, spanEnd);
            }
        }
        copyOnWriteArrayList.clear();
        aeajVar.e(editableText);
        aeajVar.g = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b.g || i2 <= 0) {
            return;
        }
        int i4 = i2 + i;
        Editable editableText = this.a.d.getEditableText();
        for (ImageSpan imageSpan : (ImageSpan[]) editableText.getSpans(i, i4, ImageSpan.class)) {
            int spanStart = editableText.getSpanStart(imageSpan);
            int spanEnd = editableText.getSpanEnd(imageSpan);
            if (spanStart < i4 && spanEnd > i) {
                this.c.add(imageSpan);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
