package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jid implements LeadingMarginSpan.LeadingMarginSpan2 {
    private final int a;
    private final int b;

    public jid(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        if (z) {
            return this.a;
        }
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan.LeadingMarginSpan2
    public final int getLeadingMarginLineCount() {
        return this.b;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }
}
