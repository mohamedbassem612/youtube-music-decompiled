package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class uii extends aevy {
    public static final agrf k = agrf.h("com/google/android/libraries/youtube/creation/common/ui/bottomsheet/CreationBottomSheetDialog");
    aevq C;
    private String I;
    public View l;
    public View m;
    public YouTubeTextView n;
    View o;
    public FrameLayout p;
    public uih r;
    public Context s;
    public CharSequence t;
    public View u;
    public Boolean v;
    public boolean w;
    public boolean q = false;
    private boolean D = true;
    private boolean E = false;
    private boolean F = true;
    private boolean G = false;
    private boolean H = false;
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;
    public int A = 0;
    int B = 0;
    private boolean J = true;
    private boolean K = false;
    private final Optional L = Optional.empty();

    public static void j(BottomSheetBehavior bottomSheetBehavior, float f) {
        bottomSheetBehavior.F(false);
        bottomSheetBehavior.G(f);
        bottomSheetBehavior.I(6);
    }

    public final void i() {
        this.p.removeAllViews();
        View view = this.u;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.u.getParent()).removeView(this.u);
        }
        View view2 = this.u;
        if (view2 == null || view2.getParent() != null) {
            return;
        }
        this.p.addView(this.u);
    }

    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public Dialog iH(Bundle bundle) {
        Context context = this.s;
        if (context == null) {
            context = getContext();
        }
        aevw aevwVar = new aevw(context, this.b);
        aevwVar.getOnBackPressedDispatcher().c(this, new uid(this, aevwVar));
        if (!this.F) {
            aevwVar.getWindow().clearFlags(2);
        }
        if (this.G) {
            BottomSheetBehavior bottomSheetBehaviorA = aevwVar.a();
            float f = this.y;
            if (f <= 0.0f || f >= 1.0f) {
                float f2 = this.x;
                if (f2 <= 0.0f || f2 >= 1.0f) {
                    aevwVar.a().I(3);
                } else {
                    j(bottomSheetBehaviorA, f2);
                }
            } else {
                j(bottomSheetBehaviorA, f);
            }
        }
        aevwVar.a().E = this.J;
        if (this.H) {
            this.C = new uie(this);
            aevwVar.a().y(this.C);
        }
        if (this.r != null) {
            aevwVar.a().y(new uif(this));
        }
        aevwVar.setOnShowListener(new gxu(this, 8));
        return aevwVar;
    }

    public final void k(boolean z) {
        this.m.setVisibility(true != z ? 8 : 0);
    }

    protected void l() {
        this.L.isPresent();
        iO(0, R.style.ReelsBottomSheetDialog_NonImmersive);
    }

    public final void m() {
        this.n.setText(this.t);
    }

    public final boolean n() {
        if (getActivity() == null || getActivity().isDestroyed() || getActivity().isFinishing() || isDetached() || isRemoving() || !isAdded()) {
            return false;
        }
        return isResumed() || isVisible() || getActivity().isInMultiWindowMode();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        if (getView() == null || getView().getParent() == null) {
            return;
        }
        View view = (View) getView().getParent();
        view.setBackgroundResource(android.R.color.transparent);
        view.setFitsSystemWindows(false);
        view.setOnApplyWindowInsetsListener(new uic(0));
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        l();
        if (getArguments() != null) {
            this.D = getArguments().getBoolean("ReelsBottomSheetDialogRoundCorners", true);
            this.I = getArguments().getString("ReelsBottomSheetDialogTextureCloseButtonKey", null);
            this.F = getArguments().getBoolean("ReelsBottomSheetDialogDimBackgroundKey", true);
            this.G = getArguments().getBoolean("ReelsBottomSheetDialoginitExpandedKey", false);
            this.H = getArguments().getBoolean("ReelsBottomSheetDialogDropShadowKey", false);
            this.x = getArguments().getFloat("ReelsBottomSheetDialogMinHeightKey", 0.0f);
            this.y = getArguments().getFloat("ReelsBottomSheetDialogMaxDefaultHeightKey", 0.0f);
            this.z = getArguments().getFloat("ReelsBottomSheetDialogMaxHeightKey", 0.0f);
            this.J = getArguments().getBoolean("ReelsBottomSheetDialogDraggableKey", true);
            this.E = getArguments().getBoolean("ReelsBottomSheetDialogTopViewKey", false);
            this.K = getArguments().getBoolean("ReelsBottomSheetDialogFitToScreenKey", false);
            getArguments().getBoolean("ReelsBottomSheetDialogUseModernCloseIconKey", false);
        }
        this.A = getActivity().getResources().getDimensionPixelSize(R.dimen.reels_bottom_sheet_header_drop_shadow_elevation);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        ViewGroup.LayoutParams layoutParams;
        this.l = layoutInflater.inflate(true != this.D ? R.layout.bottom_sheet_modal_container_square_corners : R.layout.bottom_sheet_modal_container_round_corners, viewGroup, false);
        if (this.E) {
            viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_with_top_view, viewGroup, false);
            ((RelativeLayout) viewInflate.findViewById(R.id.modal_view_container)).addView(this.l);
        } else {
            viewInflate = null;
        }
        this.n = (YouTubeTextView) this.l.findViewById(R.id.bottom_sheet_title);
        this.p = (FrameLayout) this.l.findViewById(R.id.bottom_sheet_contents);
        this.m = this.l.findViewById(R.id.header_container);
        if (this.K && (layoutParams = this.p.getLayoutParams()) != null) {
            layoutParams.height = -1;
        }
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.B = point.y;
        String str = this.I;
        View view = this.l;
        if (str == null) {
            this.o = view.findViewById(R.id.bottom_sheet_close_button);
        } else {
            View viewFindViewById = view.findViewById(R.id.bottom_sheet_done_text);
            this.o = viewFindViewById;
            ((Button) viewFindViewById).setText(this.I);
        }
        this.o.setVisibility(0);
        this.o.setOnClickListener(new rnx(this, 19));
        this.q = true;
        if (this.t != null) {
            m();
        }
        if (this.u != null) {
            i();
        }
        Boolean bool = this.v;
        if (bool != null) {
            k(bool.booleanValue());
        }
        if (this.G) {
            View view2 = this.l;
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new uig(this, getClass().getSimpleName(), view2));
        }
        return !this.E ? this.l : viewInflate;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        uih uihVar = this.r;
        if (uihVar != null) {
            uihVar.h();
        }
        if (this.C != null) {
            aevw aevwVar = (aevw) this.f;
            if (aevwVar.a() != null) {
                aevwVar.a().D(this.C);
            }
        }
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        Dialog dialog = this.f;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        this.f.getWindow().setWindowAnimations(R.style.ReelsBottomSheetDialog_SlideOutOnly);
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }
}
