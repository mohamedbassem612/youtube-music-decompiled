package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class blz extends ato implements Runnable {
    private final /* synthetic */ int $cid;
    private final Reference a;

    public blz(TextView textView, int i) {
        this.$cid = i;
        this.a = new WeakReference(textView);
    }

    @Override // defpackage.ato
    public final void h() {
        Handler handler;
        Handler handler2;
        int i = this.$cid;
        Reference reference = this.a;
        if (i != 0) {
            TextView textView = (TextView) reference.get();
            if (textView == null || (handler2 = textView.getHandler()) == null) {
                return;
            }
            handler2.post(this);
            return;
        }
        EditText editText = (EditText) reference.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        Reference reference = this.a;
        if (i == 0) {
            EditText editText = (EditText) reference.get();
            if (editText == null || !editText.isAttachedToWindow()) {
                return;
            }
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            bll.b().c(editableText);
            hmy.g(editableText, selectionStart, selectionEnd);
            return;
        }
        TextView textView = (TextView) reference.get();
        if (textView == null || !textView.isAttachedToWindow()) {
            return;
        }
        CharSequence charSequenceC = bll.b().c(textView.getText());
        int selectionStart2 = Selection.getSelectionStart(charSequenceC);
        int selectionEnd2 = Selection.getSelectionEnd(charSequenceC);
        textView.setText(charSequenceC);
        if (charSequenceC instanceof Spannable) {
            hmy.g((Spannable) charSequenceC, selectionStart2, selectionEnd2);
        }
    }

    public blz(EditText editText, int i) {
        this.$cid = i;
        this.a = new WeakReference(editText);
    }
}
