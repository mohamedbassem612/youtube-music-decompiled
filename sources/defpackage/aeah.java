package defpackage;

import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeah implements adsd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aeah(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adsd
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        int iIndexOf;
        int iIndexOf2;
        int i2 = 0;
        if (this.$cid != 0) {
            String string = spannableStringBuilder.toString();
            Object obj = this.a;
            String string2 = ((AppCompatEditText) obj).getText().toString();
            while (i2 < string2.length() && (iIndexOf2 = string2.indexOf(string, i2)) >= 0) {
                int length = string.length() + iIndexOf2;
                zoz zozVar = (zoz) obj;
                if (((ImageSpan[]) zozVar.getEditableText().getSpans(iIndexOf2, length, ImageSpan.class)).length == 0) {
                    zozVar.getEditableText().replace(iIndexOf2, length, spannableStringBuilder);
                }
                i2 = iIndexOf2 + 1;
            }
            return;
        }
        aeaj aeajVar = (aeaj) this.a;
        if (aeajVar.d != null) {
            String string3 = spannableStringBuilder.toString();
            String string4 = aeajVar.d.getText().toString();
            Editable editableText = aeajVar.d.getEditableText();
            while (i2 < string4.length() && (iIndexOf = string4.indexOf(string3, i2)) >= 0) {
                int length2 = string3.length() + iIndexOf;
                if (((ImageSpan[]) editableText.getSpans(iIndexOf, length2, ImageSpan.class)).length == 0) {
                    editableText.replace(iIndexOf, length2, spannableStringBuilder);
                }
                i2 = iIndexOf + 1;
            }
        }
    }
}
