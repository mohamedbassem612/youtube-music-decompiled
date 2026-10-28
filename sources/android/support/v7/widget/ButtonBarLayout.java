package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.bac;
import defpackage.he;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ButtonBarLayout extends LinearLayout {
    private final boolean a;
    private boolean b;
    private int c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        int[] iArr = he.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        bac.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.a = z;
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            b(z);
        }
    }

    private final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void b(boolean z) {
        if (this.b != z) {
            if (!z || this.a) {
                this.b = z;
                setOrientation(z ? 1 : 0);
                setGravity(true != z ? 80 : 8388613);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(true != z ? 4 : 8);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iA;
        int paddingTop;
        int paddingBottom;
        int iA2;
        int size = View.MeasureSpec.getSize(i);
        boolean z2 = this.a;
        if (z2) {
            if (size > this.c && this.b) {
                b(false);
            }
            this.c = size;
        }
        if (this.b || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (!z2 || this.b || (getMeasuredWidthAndState() & (-16777216)) != 16777216) {
            if (z) {
            }
            iA = a(0);
            if (iA >= 0) {
                View childAt = getChildAt(iA);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                if (this.b) {
                    iA2 = a(iA + 1);
                    if (iA2 >= 0) {
                        paddingBottom = getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                    }
                } else {
                    paddingBottom = getPaddingBottom();
                }
                paddingTop += paddingBottom;
            } else {
                paddingTop = 0;
            }
            int i3 = bac.a;
            if (getMinimumHeight() != paddingTop) {
                setMinimumHeight(paddingTop);
                if (i2 == 0) {
                    super.onMeasure(i, 0);
                }
            }
        }
        b(true);
        super.onMeasure(i, i2);
        iA = a(0);
        if (iA >= 0) {
            View childAt2 = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            paddingTop = getPaddingTop() + childAt2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            if (this.b) {
                iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingBottom = getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            paddingTop += paddingBottom;
        } else {
            paddingTop = 0;
        }
        int i4 = bac.a;
        if (getMinimumHeight() != paddingTop) {
            setMinimumHeight(paddingTop);
            if (i2 == 0) {
                super.onMeasure(i, 0);
            }
        }
    }
}
