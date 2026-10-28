package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class jme extends URLSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
