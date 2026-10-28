package androidx.autofill.inline.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awrk;
import defpackage.vm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BalancingTitleSubtitleLayout extends ViewGroup {
    public static final vm a = new vm();
    private View b;
    private TextView c;
    private TextView d;
    private View e;

    public /* synthetic */ BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet, int i, int i2, awqx awqxVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static final void a(View view, int i, int i2, awrk awrkVar, boolean z, int i3) {
        if (view.getVisibility() != 8) {
            int measuredHeight = i + ((i2 - view.getMeasuredHeight()) / 2);
            int iF = awrkVar.a + vm.f(view);
            awrkVar.a = iF;
            if (!z) {
                iF = (i3 - iF) - view.getMeasuredWidth();
            }
            view.layout(iF, measuredHeight, view.getMeasuredWidth() + iF, view.getMeasuredHeight() + measuredHeight);
            awrkVar.a += view.getMeasuredWidth() + vm.e(view);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 4) {
            throw new IllegalStateException("TitleSubtitleLayout can host up to 4 children.");
        }
        View viewFindViewById = findViewById(R.id.autofill_inline_suggestion_start_icon);
        viewFindViewById.getClass();
        this.b = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.autofill_inline_suggestion_title);
        viewFindViewById2.getClass();
        this.c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.autofill_inline_suggestion_subtitle);
        viewFindViewById3.getClass();
        this.d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.autofill_inline_suggestion_end_icon);
        viewFindViewById4.getClass();
        this.e = viewFindViewById4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        TextView textView;
        TextView textView2;
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int paddingTop2 = getPaddingTop();
        int layoutDirection = getLayoutDirection();
        awrk awrkVar = new awrk();
        awrkVar.a = getPaddingStart();
        View view2 = this.b;
        if (view2 == null) {
            awrc.b("startIcon");
            view = null;
        } else {
            view = view2;
        }
        boolean z2 = layoutDirection == 0;
        int i5 = i3 - i;
        a(view, paddingTop2, paddingTop, awrkVar, z2, i5);
        TextView textView3 = this.c;
        if (textView3 == null) {
            awrc.b("titleView");
            textView = null;
        } else {
            textView = textView3;
        }
        a(textView, paddingTop2, paddingTop, awrkVar, z2, i5);
        TextView textView4 = this.d;
        if (textView4 == null) {
            awrc.b("subtitleView");
            textView2 = null;
        } else {
            textView2 = textView4;
        }
        a(textView2, paddingTop2, paddingTop, awrkVar, z2, i5);
        View view3 = this.e;
        if (view3 == null) {
            awrc.b("endIcon");
            view3 = null;
        }
        a(view3, paddingTop2, paddingTop, awrkVar, z2, i5);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view;
        View view2;
        TextView textView;
        TextView textView2;
        int size = View.MeasureSpec.getSize(i);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        View view3 = this.b;
        TextView textView3 = null;
        if (view3 == null) {
            awrc.b("startIcon");
            view = null;
        } else {
            view = view3;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        View view4 = this.b;
        if (view4 == null) {
            awrc.b("startIcon");
            view4 = null;
        }
        int i3 = vm.i(view4);
        View view5 = this.b;
        if (view5 == null) {
            awrc.b("startIcon");
            view5 = null;
        }
        int iMax = Math.max(0, vm.g(view5));
        View view6 = this.e;
        if (view6 == null) {
            awrc.b("endIcon");
            view2 = null;
        } else {
            view2 = view6;
        }
        measureChildWithMargins(view2, i, 0, i2, 0);
        View view7 = this.e;
        if (view7 == null) {
            awrc.b("endIcon");
            view7 = null;
        }
        int i4 = i3 + vm.i(view7);
        View view8 = this.e;
        if (view8 == null) {
            awrc.b("endIcon");
            view8 = null;
        }
        int iMax2 = Math.max(iMax, vm.g(view8));
        TextView textView4 = this.c;
        if (textView4 == null) {
            awrc.b("titleView");
            textView = null;
        } else {
            textView = textView4;
        }
        measureChildWithMargins(textView, i, 0, i2, 0);
        TextView textView5 = this.d;
        if (textView5 == null) {
            awrc.b("subtitleView");
            textView2 = null;
        } else {
            textView2 = textView5;
        }
        measureChildWithMargins(textView2, i, 0, i2, 0);
        TextView textView6 = this.c;
        if (textView6 == null) {
            awrc.b("titleView");
            textView6 = null;
        }
        int i5 = vm.i(textView6);
        TextView textView7 = this.d;
        if (textView7 == null) {
            awrc.b("subtitleView");
            textView7 = null;
        }
        int i6 = paddingStart - i4;
        float f = size;
        int i7 = vm.i(textView7);
        if (i5 + i7 > i6) {
            int i8 = i6 - i5;
            int i9 = (int) (f * 0.37f);
            if (i8 >= i9) {
                i7 = i8;
            } else if (i7 <= i9) {
                i5 = i6 - i7;
            } else {
                i5 = i6 - i9;
                i7 = i9;
            }
        }
        TextView textView8 = this.c;
        if (textView8 == null) {
            awrc.b("titleView");
            textView8 = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - vm.h(textView8), 1073741824);
        TextView textView9 = this.d;
        if (textView9 == null) {
            awrc.b("subtitleView");
            textView9 = null;
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7 - vm.h(textView9), 1073741824);
        TextView textView10 = this.c;
        if (textView10 == null) {
            awrc.b("titleView");
            textView10 = null;
        }
        textView10.measure(iMakeMeasureSpec, 0);
        TextView textView11 = this.d;
        if (textView11 == null) {
            awrc.b("subtitleView");
            textView11 = null;
        }
        textView11.measure(iMakeMeasureSpec2, 0);
        TextView textView12 = this.c;
        if (textView12 == null) {
            awrc.b("titleView");
            textView12 = null;
        }
        int i10 = i4 + vm.i(textView12);
        TextView textView13 = this.d;
        if (textView13 == null) {
            awrc.b("subtitleView");
            textView13 = null;
        }
        int i11 = i10 + vm.i(textView13);
        TextView textView14 = this.c;
        if (textView14 == null) {
            awrc.b("titleView");
            textView14 = null;
        }
        int iMax3 = Math.max(iMax2, vm.g(textView14));
        TextView textView15 = this.d;
        if (textView15 == null) {
            awrc.b("subtitleView");
        } else {
            textView3 = textView15;
        }
        setMeasuredDimension(ViewGroup.resolveSize(i11 + getPaddingStart() + getPaddingEnd(), i), ViewGroup.resolveSize(Math.max(iMax3, vm.g(textView3)) + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
