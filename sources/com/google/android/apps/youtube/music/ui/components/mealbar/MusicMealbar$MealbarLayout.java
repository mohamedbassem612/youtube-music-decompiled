package com.google.android.apps.youtube.music.ui.components.mealbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.afct;
import defpackage.bac;
import defpackage.iyk;
import defpackage.qcb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MusicMealbar$MealbarLayout extends LinearLayout {
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public ImageView f;
    public qcb g;
    private final int h;

    public MusicMealbar$MealbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afct.a);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            int i = bac.a;
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.text);
        this.c = (TextView) findViewById(R.id.primary_action);
        this.d = (TextView) findViewById(R.id.secondary_action);
        this.e = (ImageView) findViewById(R.id.icon);
        this.f = (ImageView) findViewById(R.id.logo);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qcb qcbVar;
        super.onLayout(z, i, i2, i3, i4);
        if (!z || (qcbVar = this.g) == null) {
            return;
        }
        iyk iykVar = (iyk) qcbVar.a;
        iykVar.b();
        iykVar.d.g = null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.h;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            super.onMeasure(i, i2);
        }
        if (getOrientation() != 1) {
            setOrientation(1);
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public MusicMealbar$MealbarLayout(Context context) {
        this(context, null);
    }
}
