package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bln implements blk {
    public static final ThreadLocal a = new ThreadLocal();
    public final TextPaint b;

    public bln() {
        TextPaint textPaint = new TextPaint();
        this.b = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
