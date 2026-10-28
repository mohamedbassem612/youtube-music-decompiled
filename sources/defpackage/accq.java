package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accq extends CharacterStyle implements UpdateAppearance {
    private final /* synthetic */ int $cid;
    private final int a;

    public accq(int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.$cid != 0) {
            textPaint.getClass();
            textPaint.setAlpha(this.a);
        } else {
            textPaint.getClass();
            float textSize = textPaint.getTextSize() * 0.0625f;
            textPaint.setShadowLayer(textSize, textSize, textSize, this.a);
        }
    }

    public accq(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }
}
