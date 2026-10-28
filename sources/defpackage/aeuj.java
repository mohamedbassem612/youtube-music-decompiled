package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeuj extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;
    public ahtv c;

    public aeuj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aeut.b);
        this.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(0, 0) == 1 ? new ahtv((char[]) null) : null;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public aeuj() {
        super(-1, -2);
        this.a = 1;
    }

    public aeuj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public aeuj(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public aeuj(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
