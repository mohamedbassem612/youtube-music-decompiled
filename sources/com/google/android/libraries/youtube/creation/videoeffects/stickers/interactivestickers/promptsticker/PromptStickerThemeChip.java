package com.google.android.libraries.youtube.creation.videoeffects.stickers.interactivestickers.promptsticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.vjb;
import defpackage.vjs;
import defpackage.yno;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PromptStickerThemeChip extends View implements vjb {
    int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    private final Context j;
    private final int k;
    private final Paint l;

    public PromptStickerThemeChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new Paint();
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, vjs.a, 0, 0);
        try {
            this.b = typedArrayObtainStyledAttributes.getColor(6, d(R.color.sticker_text_color_white));
            this.c = typedArrayObtainStyledAttributes.getColor(8, d(R.color.sticker_text_hint_color_white));
            this.d = typedArrayObtainStyledAttributes.getColor(7, d(R.color.sticker_text_cursor_color_white));
            this.e = typedArrayObtainStyledAttributes.getColor(0, d(R.color.prompt_sticker_background_color_white));
            this.f = typedArrayObtainStyledAttributes.getColor(4, d(R.color.prompt_sticker_icon_color_white));
            this.g = typedArrayObtainStyledAttributes.getColor(3, d(R.color.prompt_sticker_icon_background_color_white));
            this.h = typedArrayObtainStyledAttributes.getColor(2, d(R.color.prompt_sticker_button_text_color_white));
            this.i = typedArrayObtainStyledAttributes.getColor(1, d(R.color.prompt_sticker_button_background_color_white));
            this.a = typedArrayObtainStyledAttributes.getColor(5, d(R.color.sticker_picker_color_white));
            this.k = d(R.color.text_color_chip_stroke_color);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final int d(int i) {
        return this.j.getResources().getColor(i);
    }

    @Override // defpackage.vjb
    public final float a() {
        return this.j.getResources().getDimension(R.dimen.text_color_chip_stroke_width);
    }

    @Override // defpackage.vjb
    public final int b() {
        return this.a;
    }

    @Override // defpackage.vjb
    public final int c() {
        return this.k;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yno.fg(this, canvas, this.l);
    }

    public PromptStickerThemeChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromptStickerThemeChip(Context context) {
        this(context, null);
    }
}
