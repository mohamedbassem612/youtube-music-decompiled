package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aekg;
import defpackage.ohm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityIndicatorFrameLayout extends FrameLayout {
    public final ohm a;
    public boolean b;
    private final ColorDrawable c;

    public ActivityIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aekg.a, i, R.style.ActivityIndicatorLinearLayout);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        ohm ohmVar = new ohm(dimensionPixelSize, color, f);
        this.a = ohmVar;
        ohmVar.setCallback(this);
        ohmVar.setState(getDrawableState());
        this.c = new ColorDrawable(color2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.b) {
            canvas.save();
            ohm ohmVar = this.a;
            canvas.clipRect(ohmVar.getBounds());
            ohmVar.draw(canvas);
            canvas.restore();
            this.c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setState(getDrawableState());
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ohm ohmVar = this.a;
        if (drawable == ohmVar) {
            invalidate(ohmVar.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.jumpToCurrentState();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ohm ohmVar = this.a;
        int i5 = ohmVar.a;
        ohmVar.setBounds(0, 0, i, i5);
        this.c.setBounds(0, i5, i, i2);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }

    public ActivityIndicatorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityIndicatorFrameLayout(Context context) {
        this(context, null);
    }
}
