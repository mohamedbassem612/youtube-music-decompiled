package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.gp;
import defpackage.hhb;
import defpackage.iq;
import defpackage.ln;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public hhb i;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hhb hhbVar = this.i;
        if (hhbVar != null) {
            Object obj = hhbVar.a;
            gp gpVar = (gp) obj;
            ln lnVar = gpVar.o;
            if (lnVar != null) {
                lnVar.a();
            }
            if (gpVar.r != null) {
                gpVar.k.getDecorView().removeCallbacks(gpVar.s);
                if (gpVar.r.isShowing()) {
                    try {
                        ((gp) obj).r.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                gpVar.r = null;
            }
            gpVar.N();
            iq iqVar = gpVar.Y(0).h;
            if (iqVar != null) {
                iqVar.i(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        float fraction;
        int i4;
        float fraction2;
        int i5;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        boolean z3 = i6 < i7;
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.e : this.d;
            if (typedValue == null || typedValue.type == 0) {
                z = false;
            } else {
                if (typedValue.type == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (typedValue.type == 6) {
                        fraction3 = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                    } else {
                        i5 = 0;
                    }
                    if (i5 > 0) {
                        Rect rect = this.h;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i5 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i5 = (int) fraction3;
                if (i5 > 0) {
                    Rect rect2 = this.h;
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i5 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f : this.g;
            if (typedValue2 != null && typedValue2.type != 0) {
                if (typedValue2.type == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (typedValue2.type == 6) {
                        fraction2 = typedValue2.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        Rect rect3 = this.h;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i4 = (int) fraction2;
                if (i4 > 0) {
                    Rect rect4 = this.h;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.c : this.b;
            if (typedValue3 == null || typedValue3.type == 0) {
                z2 = false;
            } else {
                if (typedValue3.type == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (typedValue3.type == 6) {
                        fraction = typedValue3.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 0) {
                        Rect rect5 = this.h;
                        i3 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i3) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i3 = (int) fraction;
                if (i3 > 0) {
                    Rect rect6 = this.h;
                    i3 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i3) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
