package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fuk extends frp {
    private final ClickableSpan a;

    public fuk(ClickableSpan clickableSpan) {
        this.a = clickableSpan;
    }

    @Override // defpackage.frp
    public final boolean a() {
        ClickableSpan clickableSpan = this.a;
        if (clickableSpan instanceof frp) {
            return ((frp) clickableSpan).a();
        }
        return true;
    }

    @Override // defpackage.frp
    public final boolean b() {
        ClickableSpan clickableSpan = this.a;
        if (clickableSpan instanceof frp) {
            return ((frp) clickableSpan).b();
        }
        return false;
    }

    @Override // defpackage.frp
    public final boolean c(View view) {
        ClickableSpan clickableSpan = this.a;
        if (clickableSpan instanceof frp) {
            return ((frp) clickableSpan).c(view);
        }
        return false;
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
