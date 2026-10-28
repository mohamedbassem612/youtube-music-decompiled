package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import defpackage.twm;
import defpackage.wyt;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RoundedCornerImageView extends AppCompatImageView {
    private final Path a;
    private final RectF b;
    private int c;
    private float[] d;

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Path();
        this.b = new RectF();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wyt.a);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, twm.c(displayMetrics, 4));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, i, i2);
        Path path = this.a;
        path.reset();
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = new float[8];
            this.d = fArr;
        }
        Arrays.fill(fArr, 0, 8, this.c);
        path.addRoundRect(rectF, this.d, Path.Direction.CW);
        path.close();
    }

    public RoundedCornerImageView(Context context) {
        super(context);
        this.a = new Path();
        this.b = new RectF();
    }
}
