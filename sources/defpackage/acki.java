package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class acki extends CharacterStyle {
    public static final /* synthetic */ int a = 0;
    private static final int b = -1996488704;
    private static final int c = -1275068417;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor() | (-16777216);
        if (color == -16777216) {
            textPaint.setColor(b);
        } else if (color == -1) {
            textPaint.setColor(c);
        }
    }
}
