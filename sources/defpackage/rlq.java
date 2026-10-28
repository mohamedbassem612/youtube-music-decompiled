package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlq extends rls implements rqh, acwn {
    public afip A;
    public abfv B;
    public axlj C;
    public lqa D;
    public ci E;
    public xsc F;
    public qcb G;
    private xgx H;
    private rqq I;
    private boolean J = false;
    private boolean K;
    public ttm l;
    public wnw m;
    public rlw n;
    public awmd o;
    public tbt p;
    public zwb q;
    public xgn r;
    public adhv s;
    public rre t;
    public aduv u;
    public aeda v;
    public afvq w;
    public xeu x;
    public rqa y;
    public vxz z;

    public static rlq j(ajwo ajwoVar) {
        Bundle bundle = new Bundle();
        if (ajwoVar != null) {
            bundle.putByteArray("endpoint", ajwoVar.toByteArray());
        }
        rlq rlqVar = new rlq();
        rlqVar.setArguments(bundle);
        return rlqVar;
    }

    private final void n() {
        dd parentFragmentManager = getParentFragmentManager();
        if (this.z.m(79, 45831937L)) {
            for (cc ccVar : getParentFragmentManager().k()) {
                if (ccVar != null && ccVar != this) {
                    if (ccVar instanceof bp) {
                        bp bpVar = (bp) ccVar;
                        if (!bpVar.isAdded() || bpVar.isHidden() || bpVar.isRemoving()) {
                        }
                    } else if (!"INLINE_AUTH_FRAGMENT_TAG".equals(ccVar.getTag()) || !ccVar.isVisible()) {
                    }
                }
            }
            av avVar = new av(parentFragmentManager);
            avVar.l(this);
            avVar.g(0, j(this.k), "fusion-sign-in-flow-fragment", 1);
            avVar.a(false, true);
        } else {
            cc ccVarG = parentFragmentManager.g("INLINE_AUTH_FRAGMENT_TAG");
            if (ccVarG == null || !ccVarG.isVisible()) {
                av avVar2 = new av(parentFragmentManager);
                avVar2.l(this);
                avVar2.g(0, j(this.k), "fusion-sign-in-flow-fragment", 1);
                avVar2.a(false, true);
            }
        }
        this.J = false;
    }

    @Override // defpackage.acwn
    public final void a() {
        super.iQ(false, false, false);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        super.iQ(true, false, false);
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        this.K = false;
        super.iQ(true, false, false);
    }

    @Override // defpackage.rkj
    public final void i(ajwo ajwoVar) {
        this.k = ajwoVar;
        this.r.b(xhb.a(14586), ajwoVar, null);
        xgx xgxVar = new xgx(this.r.g(null, xhb.b(299895)));
        this.H = xgxVar;
        this.r.l(xgxVar);
    }

    @Override // defpackage.rqh
    public final void k(rqg rqgVar) {
        if (rqgVar.a == rqf.c) {
            super.iQ(true, false, false);
        }
        this.p.c(rqgVar);
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        xgx xgxVar = this.H;
        apzh apzhVar = null;
        if (xgxVar != null) {
            this.r.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgxVar, null);
        }
        ajwo ajwoVar = this.k;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (apzhVar == null || (apzhVar.b & SemanticState.Focused) == 0) {
            return;
        }
        vxe vxeVar = (vxe) this.o.io();
        ajwo ajwoVar2 = apzhVar.f;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        vxeVar.a(ajwoVar2);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.K = bundle.getBoolean("inProgress", false);
        iO(1, R.style.Theme_YouTube_Fusion_SignInFlowFragment);
        if (bundle.containsKey("endpoint")) {
            try {
                i((ajwo) aihn.parseFrom(ajwo.a, bundle.getByteArray("endpoint"), ExtensionRegistryLite.getGeneratedRegistry()));
            } catch (aiik unused) {
            }
        }
        iR(true);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apzh apzhVar;
        View viewFindViewById;
        ajwo ajwoVar = this.k;
        ajwo ajwoVar2 = null;
        if (ajwoVar == null) {
            apzhVar = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (apzhVar != null && (apzhVar.b & 2) != 0 && (ajwoVar2 = apzhVar.c) == null) {
            ajwoVar2 = ajwo.a;
        }
        rlr rlrVar = new rlr(getActivity(), this.l, this.r, this.s, this.E, this.F, this.o, this.u, this.C, this.A, this.v, this.D, this.w, this.z);
        rqq rqqVar = new rqq(rlrVar, getActivity(), this.t, this.m, this.n, this.y, this.q, this, this.G, this.F, ajwoVar2, (vxe) this.o.io(), this.K, this.x);
        this.I = rqqVar;
        rlrVar.i = rqqVar;
        if (this.z.m(56, 45750297L) && (viewFindViewById = rlrVar.a.findViewById(R.id.close_button)) != null) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new jjc(this, 20));
        }
        return rlrVar.a;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        this.I.b();
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        super.onDestroyView();
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.I.a();
    }

    @Override // defpackage.cc
    public final void onPause() {
        this.p.l(this);
        this.J = true;
        super.onPause();
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        if (this.J) {
            n();
        }
        this.K = true;
        this.p.f(this);
        this.I.d();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        ajwo ajwoVar = this.k;
        if (ajwoVar != null) {
            bundle.putByteArray("endpoint", ajwoVar.toByteArray());
        }
        bundle.putBoolean("inProgress", this.I.c);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        Dialog dialog;
        Window window;
        super.onStart();
        this.B.m(this, "");
        if (!this.z.m(56, 45750297L) || twm.v(getContext()) || (dialog = this.f) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.clearFlags(2);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.B.o(this, "");
    }
}
