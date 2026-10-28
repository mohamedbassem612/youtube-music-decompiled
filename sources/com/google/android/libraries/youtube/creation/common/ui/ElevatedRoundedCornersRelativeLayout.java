package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.uhx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ElevatedRoundedCornersRelativeLayout extends RelativeLayout {
    public final Paint a;
    private final Path b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private CornerPathEffect h;

    public ElevatedRoundedCornersRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Path();
        getBackground().getClass();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_radius);
        this.c = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_x_offset);
        this.d = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_y_offset);
        this.e = dimensionPixelSize3;
        this.f = resources.getColor(R.color.dynamic_sticker_shadow_color);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uhx.c, 0, 0);
        try {
            paint.setColor(((ColorDrawable) getBackground()).getColor());
            setBackgroundColor(0);
            setPadding((getPaddingLeft() + dimensionPixelSize) - dimensionPixelSize2, (getPaddingTop() + dimensionPixelSize) - dimensionPixelSize3, getPaddingRight() + dimensionPixelSize + dimensionPixelSize2, getPaddingBottom() + dimensionPixelSize + dimensionPixelSize3);
            float dimension = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            if (dimension > 0.0f) {
                this.h = new CornerPathEffect(dimension);
            }
            this.g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        CornerPathEffect cornerPathEffect = this.h;
        Paint paint = this.a;
        if (cornerPathEffect != null) {
            paint.setPathEffect(cornerPathEffect);
            paint.setAntiAlias(true);
        } else {
            paint.setAntiAlias(false);
        }
        boolean z = this.g;
        Paint paint2 = this.a;
        if (z) {
            paint2.setShadowLayer(this.c, this.d, this.e, this.f);
        } else {
            paint2.clearShadowLayer();
        }
        int i = this.c;
        int i2 = this.d;
        int width = getWidth() - i;
        int i3 = this.e;
        int height = getHeight() - i;
        Path path = this.b;
        path.reset();
        int i4 = i - i3;
        float f = i - i2;
        float f2 = i4;
        path.moveTo(f, f2);
        float f3 = width - i2;
        path.lineTo(f3, f2);
        float f4 = height - i3;
        path.lineTo(f3, f4);
        path.lineTo(f, f4);
        path.close();
        canvas.drawPath(path, this.a);
    }

    public ElevatedRoundedCornersRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ElevatedRoundedCornersRelativeLayout(Context context) {
        this(context, null);
    }
}
