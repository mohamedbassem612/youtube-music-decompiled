package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tuc extends ClickableSpan {
    public int b;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.bgColor = this.b;
    }
}
