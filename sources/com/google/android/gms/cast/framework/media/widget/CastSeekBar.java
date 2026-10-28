package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.kcn;
import defpackage.kgb;
import defpackage.kgc;
import defpackage.kgd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CastSeekBar extends View {
    public kgc a;
    public List b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final Paint g;
    private final int h;
    private final int i;
    private final int j;

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        setAccessibilityDelegate(new kgd(this));
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.d = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.e = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        this.f = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        kgc kgcVar = new kgc();
        this.a = kgcVar;
        kgcVar.b = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, kcn.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.h = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.i = context.getResources().getColor(resourceId3);
        this.j = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        Paint paint = this.g;
        paint.setColor(i5);
        float f = i3;
        float f2 = i2 / f;
        float f3 = i / f;
        float f4 = i4;
        float f5 = this.e;
        canvas.drawRect(f3 * f4, -f5, f2 * f4, f5, paint);
    }

    public final void a() {
        int i = this.a.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        a();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        kgc kgcVar = this.a;
        boolean z = kgcVar.f;
        int i = kgcVar.c;
        if (this.a.b > 0) {
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.b(canvas2, 0, 1, 1, measuredWidth, this.i);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave2);
        List list = castSeekBar.b;
        if (list != null && !list.isEmpty()) {
            Paint paint = castSeekBar.g;
            paint.setColor(castSeekBar.j);
            int measuredWidth2 = (castSeekBar.getMeasuredWidth() - castSeekBar.getPaddingLeft()) - castSeekBar.getPaddingRight();
            int measuredHeight2 = (castSeekBar.getMeasuredHeight() - castSeekBar.getPaddingTop()) - castSeekBar.getPaddingBottom();
            int iSave3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((kgb) it.next()) != null) {
                    int iMin = Math.min(0, castSeekBar.a.b);
                    float f = measuredWidth2;
                    float f2 = castSeekBar.a.b;
                    float f3 = castSeekBar.f;
                    float f4 = ((iMin + 1) * f) / f2;
                    float f5 = (iMin * f) / f2;
                    if (f4 - f5 < f3) {
                        f4 = f5 + f3;
                    }
                    if (f4 <= f) {
                        f = f4;
                    }
                    if (f - f5 < f3) {
                        f5 = f - f3;
                    }
                    float f6 = castSeekBar.e;
                    canvas2.drawRect(f5, -f6, f, f6, paint);
                }
            }
            canvas2.restoreToCount(iSave3);
        }
        if (castSeekBar.isEnabled()) {
            boolean z2 = castSeekBar.a.f;
        }
        canvas2.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(resolveSizeAndState((int) (this.c + paddingLeft + getPaddingRight()), i, 0), resolveSizeAndState((int) (this.d + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        boolean z = this.a.f;
        return false;
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context) {
        this(context, null);
    }
}
