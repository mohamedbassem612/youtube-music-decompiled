package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class roh extends rnq {
    public roj k;
    public rof l;
    public xgm m;
    public roq n;
    public swe o;
    public abzo p;
    public tld q;
    private FrameLayout r;
    private admh s;
    private boolean t = true;
    private boolean u;

    public final void k() {
        this.t = false;
        super.iQ(false, false, false);
    }

    public final void l() {
        if (this.r.getChildCount() > 0) {
            View childAt = this.r.getChildAt(0);
            this.r.removeAllViews();
            this.s.e(childAt);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [adma, java.lang.Object] */
    public final void m(Object obj) {
        agev agevVarF = adul.f(this.s, obj, this.r);
        if (agevVarF.g()) {
            ?? C = agevVarF.c();
            adly adlyVarB = adul.b(C.a());
            adlyVarB.a(this.m.hB());
            C.hU(adlyVarB, obj);
            this.r.addView(C.a());
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        adlg adlgVar = new adlg();
        adlgVar.d(aoma.class, new rle(this, 2));
        adlgVar.d(akyy.class, new rle(this, 3));
        adlgVar.d(akza.class, new rle(this, 4));
        adlgVar.d(aomb.class, new rle(this, 5));
        adlgVar.d(roq.class, new rle(this, 6));
        this.s = adlgVar;
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = this.r;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getActivity());
            this.r = frameLayout2;
            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else if (frameLayout.getParent() != null) {
            ((ViewGroup) this.r.getParent()).removeView(this.r);
        }
        return this.r;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        Dialog dialog;
        if (this.u && (dialog = this.f) != null) {
            dialog.setOnDismissListener(null);
            this.u = false;
        }
        super.onDestroyView();
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        roj rojVar;
        super.onDismiss(dialogInterface);
        if (!this.t || (rojVar = this.k) == null) {
            return;
        }
        rojVar.j(5);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        this.u = true;
    }
}
