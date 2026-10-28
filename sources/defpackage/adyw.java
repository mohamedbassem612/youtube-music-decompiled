package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.cardboard.sdk.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class adyw extends aevy {
    public int K;
    public View L;
    public View M;
    public View N;
    public Dialog O;
    public ViewGroup P;
    protected RelativeLayout Q;
    public adzm R;
    public vxz S;
    private final List yW = new ArrayList();
    boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public assl J = assl.DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_UNKNOWN;

    public static final int C(Activity activity) {
        return (int) (((double) twm.g(activity)) * 0.6d);
    }

    public static View w(View view) {
        if (view != null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getParent() instanceof CoordinatorLayout) {
                    return (View) view2.getParent();
                }
            }
        }
        return null;
    }

    public final void A(boolean z) {
        Dialog dialog = this.O;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(z);
        }
    }

    final boolean B() {
        vxz vxzVar = this.S;
        return vxzVar != null && vxzVar.l(R.styleable.AppCompatTheme_windowNoTitle, 45744701L, false);
    }

    protected Context iG() {
        return requireActivity();
    }

    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public Dialog iH(Bundle bundle) {
        View decorView;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        cf cfVarRequireActivity = requireActivity();
        adzm adzmVar = this.R;
        if (adzmVar == null) {
            return super.iH(bundle);
        }
        adyw adywVar = adzmVar.a;
        cf cfVarRequireActivity2 = adywVar.requireActivity();
        int navigationBarColor = cfVarRequireActivity2.getWindow().getNavigationBarColor();
        aevw aevwVar = new aevw(cfVarRequireActivity2, com.google.android.apps.youtube.music.R.style.Theme_YouTube_New_BaseBottomSheetDialog);
        Window window = aevwVar.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 29) {
                window.setNavigationBarColor(navigationBarColor);
            }
            if (!adywVar.B() && Build.VERSION.SDK_INT >= 30 && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(android.R.id.content)) != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()) != null) {
                decorView.setWindowInsetsAnimationCallback(new adzu(adywVar, marginLayoutParams.bottomMargin, viewFindViewById, decorView, marginLayoutParams));
                decorView.setOnApplyWindowInsetsListener(new adzt(adywVar, marginLayoutParams, viewFindViewById, 0));
            }
        }
        this.O = aevwVar;
        aevwVar.setOnShowListener(new sut(this, cfVarRequireActivity, 5, null));
        BottomSheetBehavior bottomSheetBehaviorA = aevwVar.a();
        bottomSheetBehaviorA.D = this.I;
        y(bottomSheetBehaviorA, cfVarRequireActivity);
        return aevwVar;
    }

    protected int l() {
        return 0;
    }

    protected abstract Optional n();

    protected abstract Optional o();

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        adzm adzmVar = this.R;
        if (adzmVar != null) {
            View view = adzmVar.a.getView();
            if (true != (view instanceof View)) {
                view = null;
            }
            if (view != null && (view.getParent() instanceof View)) {
                Object parent = view.getParent();
                parent.getClass();
                ((View) parent).setBackgroundResource(android.R.color.transparent);
            }
        }
        vxz vxzVar = this.S;
        if (vxzVar == null || !vxzVar.l(96, 45701236L, false) || getView() == null) {
            return;
        }
        View viewRequireView = requireView();
        Object parent2 = viewRequireView.getParent();
        if (parent2 instanceof View) {
            ((View) parent2).setImportantForAccessibility(2);
        }
        bac.r(viewRequireView, getString(com.google.android.apps.youtube.music.R.string.bottom_sheet_accessibility_pane_title));
        cf activity = getActivity();
        if (activity == null || !twb.e(activity)) {
            return;
        }
        bac.n(viewRequireView, bby.g, null, new adzg(this, 1));
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.yW.iterator();
        while (it.hasNext()) {
            ((adzr) it.next()).a();
        }
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog;
        super.onConfigurationChanged(configuration);
        vxz vxzVar = this.S;
        if (vxzVar == null || !vxzVar.l(76, 45650321L, false)) {
            int iOrdinal = this.J.ordinal();
            if (iOrdinal == 1 ? configuration.orientation == 1 : !(iOrdinal == 2 ? configuration.orientation != 2 : iOrdinal != 3)) {
                dismiss();
                return;
            }
            adzm adzmVar = this.R;
            if (adzmVar != null) {
                configuration.getClass();
                adyw adywVar = adzmVar.a;
                cf cfVarRequireActivity = adywVar.requireActivity();
                if (adywVar.B()) {
                    Dialog dialog2 = adywVar.O;
                    dialog = true == (dialog2 instanceof aevw) ? dialog2 : null;
                    if (dialog != null) {
                        adywVar.y(((aevw) dialog).a(), cfVarRequireActivity);
                        return;
                    }
                    return;
                }
                adzj adzjVar = adzmVar.d;
                if (adzjVar != null) {
                    adzjVar.c();
                }
                Dialog dialog3 = adywVar.O;
                dialog = true == (dialog3 instanceof aevw) ? dialog3 : null;
                if (dialog != null) {
                    BottomSheetBehavior bottomSheetBehaviorA = ((aevw) dialog).a();
                    bottomSheetBehaviorA.getClass();
                    bottomSheetBehaviorA.l = -1;
                    adywVar.y(bottomSheetBehaviorA, cfVarRequireActivity);
                }
                adzi adziVar = adzmVar.e;
                if (adziVar != null) {
                    int iC = C(cfVarRequireActivity);
                    int iV = adywVar.v(cfVarRequireActivity);
                    adziVar.a = iC;
                    adziVar.b = iV;
                }
            }
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.H = bundle.getBoolean("BaseBottomSheetDialogFragment.peekHeightEnabled");
            this.I = bundle.getBoolean("BaseBottomSheetDialogFragment.shouldSkipCollapsed");
            this.K = bundle.getInt("BaseBottomSheetDialogFragment.largeFormWidthDp");
            adyv adyvVar = (adyv) new bpn(this).a(adyv.class);
            List list = this.yW;
            HashSet hashSet = adyvVar.a;
            list.addAll(hashSet);
            hashSet.clear();
        }
        if (this.R == null) {
            this.R = new adzm(this);
        }
        Iterator it = this.yW.iterator();
        while (it.hasNext()) {
            ((adzr) it.next()).b();
        }
    }

    @Override // defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cf cfVarRequireActivity = requireActivity();
        View view = (View) q().orElse(null);
        this.N = view;
        if (view != null) {
            view.setId(View.generateViewId());
        }
        this.M = (View) p().orElse(null);
        this.L = (View) n().orElse(null);
        FrameLayout frameLayout = new FrameLayout(cfVarRequireActivity);
        if (B()) {
            adzm adzmVar = this.R;
            if (adzmVar != null) {
                bcs bcsVar = new bcs(adzmVar, 8);
                int i = bac.a;
                azs.c(frameLayout, bcsVar);
            }
        } else {
            frameLayout.setOnApplyWindowInsetsListener(new uic(2));
        }
        adzm adzmVar2 = this.R;
        if (adzmVar2 != null) {
            frameLayout.addView(adzmVar2.a(cfVarRequireActivity));
        }
        Optional optionalO = o();
        adyu adyuVar = new adyu(frameLayout, 0);
        if (true == optionalO.isPresent()) {
            ((adxl) optionalO.get()).a((View) adyuVar.a);
        }
        this.P = frameLayout;
        return frameLayout;
    }

    @Override // defpackage.cc
    public void onDestroy() {
        super.onDestroy();
        Iterator it = this.yW.iterator();
        while (it.hasNext()) {
            ((adzr) it.next()).c();
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public void onDestroyView() {
        super.onDestroyView();
        adzm adzmVar = this.R;
        if (adzmVar != null) {
            adzmVar.c();
        }
        this.Q = null;
        this.O = null;
        this.P = null;
    }

    @Override // defpackage.cc
    public void onPause() {
        Dialog dialog;
        Window window;
        View currentFocus;
        InputMethodManager inputMethodManager;
        super.onPause();
        if (!B() || (dialog = this.f) == null || (window = dialog.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null || (inputMethodManager = (InputMethodManager) requireContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putBoolean("BaseBottomSheetDialogFragment.peekHeightEnabled", this.H);
        bundle.putBoolean("BaseBottomSheetDialogFragment.shouldSkipCollapsed", this.I);
        bundle.putInt("BaseBottomSheetDialogFragment.largeFormWidthDp", this.K);
        ((adyv) new bpn(this).a(adyv.class)).a.addAll(this.yW);
    }

    protected abstract Optional p();

    protected abstract Optional q();

    public final int v(Activity activity) {
        int iG = twm.g(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.bottom_sheet_top_margin);
        if (B()) {
            View decorView = activity.getWindow().getDecorView();
            int i = bac.a;
            bbn bbnVarA = azt.a(decorView);
            if (bbnVarA != null) {
                dimensionPixelSize = bbnVarA.f(519).c;
            }
        }
        return iG - dimensionPixelSize;
    }

    public final void x(adzr adzrVar) {
        this.yW.add(adzrVar);
    }

    final void y(BottomSheetBehavior bottomSheetBehavior, Activity activity) {
        int iH = twm.h(activity);
        if (this.K > 0 && iH >= 600) {
            bottomSheetBehavior.k = twm.c(activity.getResources().getDisplayMetrics(), Math.min(this.K, iH));
        } else if (this.R != null) {
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.k = iH >= 600 ? activity.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.bottom_sheet_default_max_width) : -1;
        }
    }

    public final void z() {
        ViewGroup viewGroup = this.P;
        if (viewGroup == null) {
            iN();
        } else {
            viewGroup.post(new acqu(this, 13));
        }
    }
}
