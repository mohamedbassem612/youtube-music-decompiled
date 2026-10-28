package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ste extends sti implements acwn {
    public aunn k;
    public aefv l;
    mel m;
    public xgn n;
    alhq o;
    String p;
    boolean q;
    public vxz r;
    public vxz s;
    public acfd t;
    public afip u;
    public abfv v;

    @Override // defpackage.acwn
    public final void a() {
        bob bobVarA = getLifecycle().a();
        if (!this.s.l(10, 45693223L, false) || bobVarA.a(bob.c)) {
            iN();
        }
    }

    @Override // defpackage.aevy, defpackage.bp
    public final void dismiss() {
        bob bobVarA = getLifecycle().a();
        if (!this.s.l(10, 45693223L, false) || bobVarA.a(bob.c)) {
            super.dismiss();
        }
    }

    public final void i() {
        if (this.o != null) {
            ArrayList arrayList = new ArrayList();
            String str = this.p;
            if (str != null) {
                this.m.findViewsWithText(arrayList, str, 2);
            }
            if (!arrayList.isEmpty()) {
            }
            this.l.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        ste steVar;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        cf activity = getActivity();
        activity.getClass();
        aevw aevwVar = new aevw(activity, R.style.Theme_YouTube_ElementsBottomSheetDialog);
        Window window = aevwVar.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 30) {
                Bundle arguments = getArguments();
                if (arguments == null || !arguments.getBoolean("animateWithKeyboard")) {
                    steVar = this;
                    decorView.setWindowInsetsAnimationCallback(new std(steVar));
                } else {
                    acfd acfdVar = this.t;
                    if (Build.VERSION.SDK_INT < 30 || decorView == null || (viewFindViewById = decorView.findViewById(android.R.id.content)) == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()) == null) {
                        steVar = this;
                    } else {
                        steVar = this;
                        decorView.setWindowInsetsAnimationCallback(new stg(acfdVar, decorView, steVar, marginLayoutParams.bottomMargin, viewFindViewById, marginLayoutParams));
                        decorView.setOnApplyWindowInsetsListener(new adzt(acfdVar, marginLayoutParams, viewFindViewById, 1));
                    }
                }
            } else {
                steVar = this;
                decorView.setOnApplyWindowInsetsListener(new jmb(steVar, 2));
            }
        } else {
            steVar = this;
        }
        BottomSheetBehavior bottomSheetBehaviorA = aevwVar.a();
        bottomSheetBehaviorA.I(3);
        bottomSheetBehaviorA.E = false;
        bottomSheetBehaviorA.H(steVar.s.l(5, 45674521L, false));
        return aevwVar;
    }

    @Override // defpackage.aevy, defpackage.bp
    public final void iN() {
        bob bobVarA = getLifecycle().a();
        if (!this.s.l(10, 45693223L, false) || bobVarA.a(bob.c)) {
            super.iN();
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cf activity = getActivity();
        activity.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("element")) {
            throw new IllegalStateException("No valid element provided.");
        }
        if (arguments.containsKey("hintRenderer")) {
            try {
                this.o = (alhq) ahng.aA(arguments, "hintRenderer", alhq.a, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik e) {
                throw new IllegalStateException("Failed to merge HintRenderer proto", e);
            }
        }
        if (arguments.containsKey("hintLabel")) {
            this.p = arguments.getString("hintLabel");
        }
        if (arguments.containsKey("element")) {
            try {
                asmv asmvVar = (asmv) ahng.aA(arguments, "element", asmv.a, ExtensionRegistryLite.getGeneratedRegistry());
                ntw ntwVarA = ntx.a(((mlo) this.k.io()).a);
                ntwVarA.c(false);
                xgn xgnVar = this.n;
                ntwVarA.i = xgnVar != null ? this.u.e(xgnVar) : null;
                mel melVar = new mel(activity, ntwVarA.a());
                xgn xgnVar2 = this.n;
                if (xgnVar2 != null) {
                    melVar.b = new adat(xgnVar2);
                }
                melVar.a(asmvVar.toByteArray(), null);
                this.m = melVar;
            } catch (aiik e2) {
                throw new IllegalStateException("Error decoding Element", e2);
            }
        }
        this.q = arguments.getBoolean("enableTransparentBackground", false);
        this.l.h(this.m);
        if (!this.r.l(13, 45419882L, false)) {
            return this.m;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setId(R.id.interstitials_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        this.m.setElevation(4.0f);
        frameLayout.addView(this.m, layoutParams);
        return frameLayout;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDetach() {
        super.onDetach();
        mel melVar = this.m;
        if (melVar != null) {
            melVar.onDetachedFromWindow();
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        View viewFindViewById;
        super.onStart();
        this.v.m(this, "");
        if (this.q) {
            Dialog dialog = this.f;
            if (!(dialog instanceof aevw) || (viewFindViewById = ((aevw) dialog).findViewById(R.id.design_bottom_sheet)) == null) {
                return;
            }
            viewFindViewById.setBackground(null);
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.v.o(this, "");
    }
}
