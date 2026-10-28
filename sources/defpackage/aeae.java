package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeae implements View.OnClickListener {
    public String a;
    private final aeaj b;

    public aeae(aeaj aeajVar) {
        this.b = aeajVar;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aeaj aeajVar = this.b;
        if (aeajVar != null) {
            String str = this.a;
            int selectionEnd = aeajVar.d.getSelectionEnd() >= 0 ? aeajVar.d.getSelectionEnd() : aeajVar.d.getText().length();
            Editable editableText = aeajVar.d.getEditableText();
            aeiv aeivVar = aeajVar.h;
            editableText.insert(selectionEnd, aeivVar.h(str));
            aktj aktjVar = (aktj) aeivVar.a.get(str);
            if (aktjVar != null && aktjVar.g) {
                aeajVar.g = true;
                aeajVar.e(aeajVar.d.getEditableText());
                aeajVar.g = false;
            } else {
                SpannableStringBuilder spannableStringBuilder = aeajVar.c;
                spannableStringBuilder.clear();
                adry adryVar = aeajVar.b;
                adryVar.e(null, 0, null);
                adryVar.a(aeivVar.h(str), aeivVar.e(str), aeajVar.a.getResources().getDimension(R.dimen.emoji_height), str, aeajVar.d.getId(), spannableStringBuilder, null);
            }
        }
    }
}
