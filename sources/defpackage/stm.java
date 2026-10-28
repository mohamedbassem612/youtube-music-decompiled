package defpackage;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class stm implements SpanWatcher {
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int spanStart;
        int spanEnd;
        if (obj == Selection.SELECTION_END) {
            int selectionStart = Selection.getSelectionStart(spannable);
            int selectionEnd = Selection.getSelectionEnd(spannable);
            if (selectionStart == -1 || selectionStart != selectionEnd || i4 <= 0 || i4 >= spannable.length()) {
                return;
            }
            if (i4 > i2) {
                adta[] adtaVarArr = (adta[]) spannable.getSpans(i4 - 1, i4, adta.class);
                if (adtaVarArr == null || adtaVarArr.length <= 0 || (spanEnd = spannable.getSpanEnd(adtaVarArr[0])) < 0) {
                    return;
                }
                Selection.setSelection(spannable, spanEnd);
                return;
            }
            adta[] adtaVarArr2 = (adta[]) spannable.getSpans(i4, i4 + 1, adta.class);
            if (adtaVarArr2 == null || adtaVarArr2.length <= 0 || (spanStart = spannable.getSpanStart(adtaVarArr2[0])) < 0) {
                return;
            }
            Selection.setSelection(spannable, spanStart);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }
}
