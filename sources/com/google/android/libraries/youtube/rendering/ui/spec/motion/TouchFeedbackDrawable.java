package com.google.android.libraries.youtube.rendering.ui.spec.motion;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.adey;
import defpackage.aedd;
import defpackage.aede;
import defpackage.aedh;
import defpackage.aedi;
import defpackage.ahud;
import defpackage.twm;
import defpackage.tzk;
import defpackage.vgm;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class TouchFeedbackDrawable extends Drawable {
    public aedh a;
    private final Drawable b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ahud f;

    private TouchFeedbackDrawable(int i, int i2, int i3, Drawable drawable) {
        this(drawable);
        this.a = new aedh(i, i2, i3);
        this.c = i3 == -2;
        b();
    }

    private static int a(Resources resources, Resources.Theme theme) {
        return tzk.o(resources, theme, R.attr.ytTouchResponse).orElse(0);
    }

    private final void b() {
        this.f = new ahud((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.e = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        aedh aedhVar = this.a;
        int iA = a(theme.getResources(), theme);
        aedhVar.a.setColor(iA);
        aedhVar.b.setColor(iA);
        aedhVar.setAlpha(0);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, aede.a, 0, 0) : resources.obtainAttributes(attributeSet, aede.a);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
        this.d = !zHasValue;
        int color = (zHasValue || theme == null) ? typedArrayObtainStyledAttributes.getColor(0, 0) : a(resources, theme);
        int iC = twm.c(resources.getDisplayMetrics(), 1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (typedArrayObtainStyledAttributes.getInt(2, 0) == 1) {
            this.a = new aedh(color, iC, -1);
        } else {
            this.a = new aedh(color, iC, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.b;
        boolean zOnStateChange = super.onStateChange(iArr);
        if (drawable != null && drawable.isStateful()) {
            zOnStateChange = zOnStateChange || drawable.setState(iArr);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842919) {
                z2 = true;
            }
        }
        boolean z3 = z && z2;
        if (this.e != z3) {
            this.e = z3;
            int i2 = 5;
            if (z3) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 26);
                valueAnimatorOfInt.addUpdateListener(new adey(this, 6));
                valueAnimatorOfInt.setInterpolator(aedd.a);
                valueAnimatorOfInt.setDuration(100L);
                valueAnimatorOfInt.addListener(new vgm(this, 5));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(valueAnimatorOfInt);
                this.f.Z(animatorSet);
            } else {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(26, 0);
                valueAnimatorOfInt2.addUpdateListener(new adey(this, 4));
                valueAnimatorOfInt2.setInterpolator(aedd.a);
                valueAnimatorOfInt2.setDuration(400L);
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(26, 0);
                valueAnimatorOfInt3.addUpdateListener(new adey(this, i2));
                valueAnimatorOfInt3.setInterpolator(aedd.b);
                valueAnimatorOfInt3.setDuration(400L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt3);
                this.f.aa(animatorSet2);
            }
        }
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.a.setBounds(rect);
    }

    public TouchFeedbackDrawable() {
        this(null);
        b();
    }

    private TouchFeedbackDrawable(Drawable drawable) {
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(getCallback());
        }
    }

    public /* synthetic */ TouchFeedbackDrawable(int i, int i2, int i3, Drawable drawable, aedi aediVar) {
        this(i, i2, i3, drawable);
    }
}
