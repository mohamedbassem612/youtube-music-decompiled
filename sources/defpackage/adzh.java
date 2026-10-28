package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzh extends aevq implements View.OnLayoutChangeListener {
    public final View a;
    public final BottomSheetBehavior b;
    public int c;
    public int d;
    public boolean e = true;
    private final adzm f;

    public adzh(adzm adzmVar, View view, BottomSheetBehavior bottomSheetBehavior, int i, int i2) {
        this.f = adzmVar;
        this.a = view;
        this.b = bottomSheetBehavior;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        if (this.e) {
            if (i == 3 || i == 4) {
                this.a.requestLayout();
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup;
        view.getClass();
        if (this.e) {
            BottomSheetBehavior bottomSheetBehavior = this.b;
            int i9 = bottomSheetBehavior.F;
            if (i9 != 3) {
                if (i9 != 4) {
                    return;
                } else {
                    i9 = 4;
                }
            }
            this.e = false;
            adzm adzmVar = this.f;
            adzj adzjVar = adzmVar.d;
            if (adzjVar != null && adzmVar.d()) {
                int i10 = this.c;
                int i11 = this.d;
                View view2 = adzjVar.a;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int iMax = Math.max(0, Math.min(view2.getMeasuredHeight() + marginLayoutParams.bottomMargin, i11) - i10);
                    adzjVar.c = iMax;
                    tym.h(view2, new tyi(i9 == 4 ? iMax : 0, 1), ViewGroup.MarginLayoutParams.class);
                }
            }
            adyw adywVar = adzmVar.a;
            cf activity = adywVar.getActivity();
            if (activity == null || (viewGroup = adywVar.P) == null) {
                return;
            }
            int measuredHeight = viewGroup.getMeasuredHeight();
            int iC = adyw.C(activity);
            int iMin = Math.min(measuredHeight, adzmVar.g);
            if (!adzmVar.d()) {
                bottomSheetBehavior.Q(iMin);
                return;
            }
            bottomSheetBehavior.Q(Math.min(iC, iMin));
            if (iMin > iC) {
                bottomSheetBehavior.l = iMin;
            }
        }
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
    }
}
