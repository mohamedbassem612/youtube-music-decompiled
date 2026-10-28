package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acdi extends ViewGroup {
    private final avmm a;
    public final Rect aa;
    public Runnable ab;
    public View ac;
    private tth b;

    public acdi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.a = new avmm();
        setFocusable(true);
        setDescendantFocusability(262144);
        this.aa = new Rect();
    }

    protected static final boolean U(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return false;
        }
        if (layoutParams instanceof acdh) {
            return ((acdh) layoutParams).a;
        }
        return true;
    }

    private static int a(int i) {
        return (int) (i / 1.777f);
    }

    private static int b(int i) {
        return (int) (i * 1.777f);
    }

    public final void S(acdg... acdgVarArr) {
        acdg acdgVar = acdgVarArr[0];
        View viewJM = acdgVar.jM();
        if (viewJM == null) {
            throw new IllegalArgumentException(enb.b(acdgVar, "Overlay ", " does not provide a View and LayoutParams"));
        }
        d(acdgVar, viewJM);
    }

    public final void T(tth tthVar) {
        tthVar.getClass();
        this.b = tthVar;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof acdh;
    }

    protected void d(acdg acdgVar, View view) {
        addView(view, acdgVar.b());
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new acdh(-2, -2, true);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new acdh(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        avmm avmmVar = this.a;
        avmmVar.b();
        ArrayList arrayList = new ArrayList();
        tth tthVar = this.b;
        if (tthVar != null) {
            arrayList.add(tthVar.a.ak(new acae(this, 4)));
        }
        if (!arrayList.isEmpty()) {
            avmmVar.e((avmn[]) arrayList.toArray(new avmn[arrayList.size()]));
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.a.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (z || childAt.getVisibility() != 8) {
                Rect rect = this.aa;
                int i8 = i3 - i;
                int i9 = i4 - i2;
                int i10 = (i8 - rect.left) - rect.right;
                int i11 = (i9 - rect.top) - rect.bottom;
                boolean zU = U(childAt.getLayoutParams());
                if (true == zU) {
                    i8 = i10;
                }
                if (true == zU) {
                    i9 = i11;
                }
                int iMin = Math.min(childAt.getMeasuredWidth(), i8);
                int iMin2 = Math.min(childAt.getMeasuredHeight(), i9);
                if (zU) {
                    i6 = rect.left;
                    i5 = rect.top;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int i12 = i6 + ((i8 - iMin) / 2);
                int i13 = i5 + ((i9 - iMin2) / 2);
                childAt.layout(i12, i13, iMin + i12, iMin2 + i13);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (mode != 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = a(size);
            } else if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                size = b(size2);
            } else if (mode != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
                size = 0;
                size2 = 0;
            } else if (size2 < size / 1.777f) {
                size = b(size2);
            } else {
                size2 = a(size);
            }
        } else if (mode2 != 1073741824) {
            mode = 1073741824;
            if (mode != 1073741824) {
                size2 = a(size);
            } else {
                size2 = a(size);
            }
        }
        int iResolveSize = resolveSize(size, i);
        int iResolveSize2 = resolveSize(size2, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            Rect rect = this.aa;
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i4 = rect.left + rect.right;
                int i5 = rect.top + rect.bottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iResolveSize, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iResolveSize2, 1073741824);
                boolean zU = U(layoutParams);
                if (true != zU) {
                    i4 = 0;
                }
                int childMeasureSpec = getChildMeasureSpec(iMakeMeasureSpec, i4, layoutParams.width);
                if (true != zU) {
                    i5 = 0;
                }
                childAt.measure(childMeasureSpec, getChildMeasureSpec(iMakeMeasureSpec2, i5, layoutParams.height));
            }
        }
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable = this.ab;
        if (runnable != null) {
            runnable.run();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new acdh(layoutParams);
    }

    public acdi(Context context) {
        this(context, null);
    }
}
