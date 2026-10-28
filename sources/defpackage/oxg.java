package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oxg extends oya {
    private final ClickableSpan a;

    public oxg(ClickableSpan clickableSpan) {
        this.a = clickableSpan;
    }

    @Override // defpackage.oya
    public final boolean a(View view) {
        throw null;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
