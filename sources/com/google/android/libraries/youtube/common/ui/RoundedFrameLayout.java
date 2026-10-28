package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.ttv;
import defpackage.twm;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RoundedFrameLayout extends FrameLayout {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/ui/RoundedFrameLayout");
    private int b;
    private RectF c;
    private float[] d;
    private Path e;

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ttv.e);
        this.c = new RectF();
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, twm.c(displayMetrics, 16));
        setWillNotDraw(false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Path path = this.e;
        if (path != null) {
            canvas.clipPath(path);
        } else {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/common/ui/RoundedFrameLayout", "draw", 72, "RoundedFrameLayout.java")).t("Rounded frame layout rectPath is null");
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        this.c.set(0.0f, 0.0f, i, i2);
        Path path = this.e;
        if (path == null) {
            this.e = new Path();
        } else {
            path.reset();
        }
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = new float[8];
            this.d = fArr;
        }
        Arrays.fill(fArr, 0, 8, this.b);
        this.e.addRoundRect(this.c, this.d, Path.Direction.CW);
        this.e.close();
    }

    public RoundedFrameLayout(Context context) {
        super(context);
    }
}
