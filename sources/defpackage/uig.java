package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uig extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ uii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uig(uii uiiVar, String str, View view) {
        super(str);
        this.a = view;
        this.b = uiiVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        View view2 = this.a;
        view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int measuredHeight = view2.getMeasuredHeight();
        uii uiiVar = this.b;
        float f = uiiVar.B;
        float f2 = uiiVar.x * f;
        float f3 = uiiVar.y * f;
        float f4 = f * uiiVar.z;
        BottomSheetBehavior bottomSheetBehaviorA = ((aevw) uiiVar.f).a();
        float f5 = uiiVar.z;
        if (f5 > 0.0f && f5 <= 1.0f) {
            int i3 = (int) f4;
            bottomSheetBehaviorA.l = i3;
            Object parent = view2.getParent();
            if ((parent instanceof View) && (layoutParams2 = (view = (View) parent).getLayoutParams()) != null && layoutParams2.height != i3) {
                layoutParams2.height = i3;
                view.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null && layoutParams3.height != i3) {
                layoutParams3.height = i3;
                view2.setLayoutParams(layoutParams3);
            }
            FrameLayout frameLayout = uiiVar.p;
            if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                layoutParams.height = -1;
                uiiVar.p.setLayoutParams(layoutParams);
            }
        }
        float f6 = uiiVar.y;
        if (f6 <= 0.0f || f6 >= 1.0f || measuredHeight <= (i2 = (int) f3)) {
            float f7 = uiiVar.x;
            if (f7 > 0.0f && f7 < 1.0f && (measuredHeight < (i = (int) f2) || uiiVar.z > 0.0f)) {
                uii.j(bottomSheetBehaviorA, f7);
                bottomSheetBehaviorA.Q(i);
            }
        } else {
            uii.j(bottomSheetBehaviorA, f6);
            bottomSheetBehaviorA.Q(i2);
        }
        view2.setVisibility(0);
    }
}
