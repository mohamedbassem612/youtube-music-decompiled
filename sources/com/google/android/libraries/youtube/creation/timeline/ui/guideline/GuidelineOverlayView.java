package com.google.android.libraries.youtube.creation.timeline.ui.guideline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.awqx;
import defpackage.yno;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class GuidelineOverlayView extends View {
    private final float[] a;
    private final DashPathEffect b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidelineOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        yno.fm(context, 1.0f);
        float fFm = yno.fm(context, 4.0f);
        float[] fArr = {fFm, fFm};
        this.a = fArr;
        this.b = new DashPathEffect(fArr, 0.0f);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuidelineOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuidelineOverlayView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GuidelineOverlayView(Context context, AttributeSet attributeSet, int i, int i2, awqx awqxVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
