package com.google.android.libraries.youtube.creation.videoeffects.stickers.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.vjb;
import defpackage.vks;
import defpackage.yno;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ColorChip extends View implements vjb {
    public int a;
    public int b;
    public int c;
    public int d;
    private final Context e;
    private final int f;
    private final Paint g;

    public ColorChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Paint();
        this.e = context;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, vks.a, 0, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getColor(0, d(R.color.text_color_white));
            this.b = typedArrayObtainStyledAttributes.getColor(1, 0);
            this.c = typedArrayObtainStyledAttributes.getColor(2, this.a);
            this.d = typedArrayObtainStyledAttributes.getColor(3, this.b);
            this.f = d(R.color.text_color_chip_stroke_color);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final int d(int i) {
        return this.e.getResources().getColor(i);
    }

    @Override // defpackage.vjb
    public final float a() {
        return this.e.getResources().getDimension(R.dimen.text_color_chip_stroke_width);
    }

    @Override // defpackage.vjb
    public final int b() {
        return this.a;
    }

    @Override // defpackage.vjb
    public final int c() {
        return this.f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yno.fg(this, canvas, this.g);
    }

    public ColorChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorChip(Context context) {
        this(context, null);
    }
}
