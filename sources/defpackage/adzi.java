package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzi implements View.OnLayoutChangeListener {
    public int a;
    public int b;
    private final adzm c;
    private int d;

    public adzi(adzm adzmVar, int i, int i2) {
        this.c = adzmVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iMax;
        int measuredHeight;
        boolean z;
        vxz vxzVar;
        view.getClass();
        int i9 = i4 - i2;
        if (i9 != this.d) {
            this.d = i9;
            adzm adzmVar = this.c;
            adyw adywVar = adzmVar.a;
            cf activity = adywVar.getActivity();
            if (activity != null) {
                Dialog dialog = adywVar.f;
                int i10 = this.a;
                int i11 = this.b;
                if (dialog instanceof aevw) {
                    BottomSheetBehavior bottomSheetBehaviorA = ((aevw) dialog).a();
                    bottomSheetBehaviorA.getClass();
                    ViewGroup viewGroup = adywVar.P;
                    if (viewGroup != null) {
                        measuredHeight = viewGroup.getMeasuredHeight();
                        if (i11 != -1) {
                            z = i11 < measuredHeight;
                            measuredHeight = Math.min(measuredHeight, i11);
                        } else {
                            z = false;
                        }
                    } else {
                        measuredHeight = 0;
                        z = false;
                    }
                    boolean z2 = (!twb.a(activity).isEnabled() || (vxzVar = adywVar.S) == null || vxzVar.l(122, 45735557L, false)) ? false : true;
                    if (!adzmVar.d() || z2) {
                        bottomSheetBehaviorA.Q(measuredHeight);
                        bottomSheetBehaviorA.l = true == z ? measuredHeight : -1;
                        bottomSheetBehaviorA.I(3);
                    } else {
                        bottomSheetBehaviorA.Q(Math.min(i10, measuredHeight));
                        bottomSheetBehaviorA.I(4);
                        if (measuredHeight > i10) {
                            bottomSheetBehaviorA.l = measuredHeight;
                        }
                    }
                }
                adzj adzjVar = adzmVar.d;
                if (adzjVar != null && adzmVar.d()) {
                    int i12 = this.a;
                    int i13 = this.b;
                    View view2 = adzjVar.a;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null && (iMax = Math.max(0, Math.min(view2.getMeasuredHeight() + marginLayoutParams.bottomMargin, i13) - i12)) != adzjVar.c) {
                        adzjVar.c = iMax;
                        tym.h(view2, new tyi(iMax, 1), ViewGroup.MarginLayoutParams.class);
                    }
                }
                View viewW = adyw.w(adywVar.P);
                adzi adziVar = adzmVar.e;
                if (adziVar == null || viewW == null) {
                    return;
                }
                viewW.removeOnLayoutChangeListener(adziVar);
            }
        }
    }
}
