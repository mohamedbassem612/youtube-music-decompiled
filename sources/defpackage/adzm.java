package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzm {
    public final adyw a;
    public boolean b;
    public boolean c = true;
    public adzj d;
    public adzi e;
    public adzh f;
    public int g;

    public adzm(adyw adywVar) {
        this.a = adywVar;
    }

    public final ViewGroup a(Context context) {
        LinearLayout.LayoutParams layoutParams;
        View view;
        adzk adzkVar = new adzk(context);
        adzkVar.setOrientation(1);
        adzkVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_rounded_corners);
        adyw adywVar = this.a;
        vxz vxzVar = adywVar.S;
        if (vxzVar == null || !vxzVar.l(96, 45701236L, false)) {
            View view2 = new View(adywVar.iG());
            view2.setBackgroundResource(R.drawable.sheet_handle);
            layoutParams = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
            view = view2;
        } else {
            AppCompatImageView appCompatImageView = new AppCompatImageView(adywVar.iG());
            appCompatImageView.setImageResource(R.drawable.sheet_handle);
            appCompatImageView.setClickable(true);
            appCompatImageView.setContentDescription(adywVar.getResources().getString(R.string.bottomsheet_drag_handle_content_description));
            bac.n(appCompatImageView, bby.a, adywVar.getResources().getString(R.string.bottom_sheet_accessibility_hint_dismiss), new adzg(this, 0));
            layoutParams = new LinearLayout.LayoutParams(-2, dimensionPixelSize);
            layoutParams.gravity = 17;
            view = appCompatImageView;
        }
        layoutParams.setMargins(0, 0, 0, -dimensionPixelSize);
        adzkVar.addView(view, 0, layoutParams);
        View view3 = adywVar.N;
        if (view3 != null) {
            adzkVar.addView(view3);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, dimensionPixelSize, 0, -adywVar.l());
            view3.setLayoutParams(layoutParams2);
        }
        View view4 = adywVar.L;
        if (view4 != null) {
            adzkVar.addView(view4);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
            int dimensionPixelSize2 = adzkVar.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_padding);
            if (adywVar.N != null) {
                view4.setPadding(0, adywVar.l() + dimensionPixelSize2, 0, dimensionPixelSize2);
            } else {
                int i = dimensionPixelSize + dimensionPixelSize2;
                if (view4 instanceof RecyclerView) {
                    view4.setPadding(0, i, 0, dimensionPixelSize2);
                } else {
                    layoutParams3.setMargins(0, i, 0, dimensionPixelSize2);
                }
            }
            view4.setLayoutParams(layoutParams3);
        }
        if (adywVar.M != null) {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams4.gravity = 80;
            relativeLayout.setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
            View view5 = adywVar.M;
            if (view5 != null) {
                ViewParent parent = view5.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view5);
                }
                view5.setLayoutParams(layoutParams5);
                relativeLayout.addView(view5);
            }
            relativeLayout.setBackgroundColor(tzk.i(context, R.attr.ytRaisedBackground));
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            adzkVar.addView(relativeLayout);
        }
        if (adywVar.M == null && adywVar.N == null && adywVar.L == null) {
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams6.addRule(14);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.addView(new ProgressBar(context), layoutParams6);
            relativeLayout2.setPadding(0, dimensionPixelSize << 1, 0, dimensionPixelSize);
            adywVar.Q = relativeLayout2;
            adzkVar.addView(relativeLayout2);
        }
        adzkVar.setOutlineProvider(new adzl(dimensionPixelSize));
        adzkVar.setClipToOutline(true);
        adzkVar.setBackgroundColor(tzk.i(context, R.attr.ytRaisedBackground));
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_margins);
        tym.h(adzkVar, new tyk(dimensionPixelSize3, 0, dimensionPixelSize3, dimensionPixelSize3), ViewGroup.MarginLayoutParams.class);
        return adzkVar;
    }

    public final void b(Activity activity) {
        adzm adzmVar;
        adyw adywVar = this.a;
        if (adywVar.L == null && adywVar.Q == null) {
            return;
        }
        int iC = adyw.C(activity);
        int iV = adywVar.v(activity);
        View viewW = adyw.w(adywVar.P);
        if (viewW == null) {
            adzmVar = this;
        } else {
            if (adywVar.B()) {
                Dialog dialog = adywVar.O;
                if (dialog instanceof aevw) {
                    dialog.getClass();
                    int i = this.g;
                    if (i > 0) {
                        iV = i;
                    }
                    this.g = iV;
                    BottomSheetBehavior bottomSheetBehaviorA = ((aevw) dialog).a();
                    bottomSheetBehaviorA.getClass();
                    adzmVar = this;
                    adzh adzhVar = new adzh(adzmVar, viewW, bottomSheetBehaviorA, iC, this.g);
                    adzmVar.f = adzhVar;
                    adzhVar.b.y(adzhVar);
                    adzhVar.a.addOnLayoutChangeListener(adzhVar);
                } else {
                    adzmVar = this;
                }
            } else {
                adzmVar = this;
                adzi adziVar = new adzi(adzmVar, iC, iV);
                adzmVar.e = adziVar;
                viewW.addOnLayoutChangeListener(adziVar);
            }
            viewW.requestLayout();
        }
        Dialog dialog2 = adywVar.O;
        if (true != (dialog2 instanceof aevw)) {
            dialog2 = null;
        }
        if (dialog2 != null) {
            BottomSheetBehavior bottomSheetBehaviorA2 = ((aevw) dialog2).a();
            bottomSheetBehaviorA2.getClass();
            adzj adzjVar = adzmVar.d;
            if (adzjVar != null) {
                bottomSheetBehaviorA2.D(adzjVar);
            }
            ViewGroup viewGroup = adywVar.P;
            if (viewGroup != null) {
                adzj adzjVar2 = new adzj(viewGroup);
                adzmVar.d = adzjVar2;
                bottomSheetBehaviorA2.y(adzjVar2);
            }
        }
    }

    public final void c() {
        adyw adywVar = this.a;
        if (adywVar.B()) {
            Dialog dialog = adywVar.O;
            if (true != (dialog instanceof aevw)) {
                dialog = null;
            }
            if (dialog != null) {
                BottomSheetBehavior bottomSheetBehaviorA = ((aevw) dialog).a();
                bottomSheetBehaviorA.getClass();
                adzj adzjVar = this.d;
                if (adzjVar != null) {
                    bottomSheetBehaviorA.D(adzjVar);
                }
            }
            this.d = null;
            adzh adzhVar = this.f;
            if (adzhVar != null) {
                adzhVar.b.D(adzhVar);
                adzhVar.a.removeOnLayoutChangeListener(adzhVar);
            }
            this.f = null;
        }
    }

    public final boolean d() {
        boolean z;
        adyw adywVar = this.a;
        if (adywVar.B()) {
            z = adywVar.H && !this.b;
        } else {
            z = adywVar.H;
        }
        cf activity = adywVar.getActivity();
        if (activity == null || twm.f(activity) >= 600) {
            return z;
        }
        return false;
    }
}
