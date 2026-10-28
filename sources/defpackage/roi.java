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
public final class roi extends rnr {
    public rog g;
    public rof h;
    public xgm i;
    public roq j;
    public abzo k;
    public tld l;
    private FrameLayout m;
    private admh n;
    private boolean o = true;
    private boolean p;

    public final void e() {
        this.o = false;
        c(false);
    }

    public final void f() {
        if (this.m.getChildCount() > 0) {
            View childAt = this.m.getChildAt(0);
            this.m.removeAllViews();
            this.n.e(childAt);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [adma, java.lang.Object] */
    public final void g(Object obj) {
        agev agevVarF = adul.f(this.n, obj, this.m);
        if (agevVarF.g()) {
            ?? C = agevVarF.c();
            adly adlyVarB = adul.b(C.a());
            adlyVarB.a(this.i.hB());
            C.hU(adlyVarB, obj);
            this.m.addView(C.a());
        }
    }

    @Override // defpackage.rnw, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        adlg adlgVar = new adlg();
        adlgVar.d(aoma.class, new rle(this, 7));
        adlgVar.d(akyy.class, new rle(this, 8));
        adlgVar.d(akza.class, new rle(this, 9));
        adlgVar.d(roq.class, new rle(this, 10));
        this.n = adlgVar;
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = this.m;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(getActivity());
            this.m = frameLayout2;
            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else if (frameLayout.getParent() != null) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        return this.m;
    }

    @Override // defpackage.rnw, defpackage.cc
    public final void onDestroyView() {
        Dialog dialog;
        if (this.p && (dialog = this.d) != null) {
            dialog.setOnDismissListener(null);
            this.p = false;
        }
        super.onDestroyView();
    }

    @Override // defpackage.rnw, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        rog rogVar;
        super.onDismiss(dialogInterface);
        if (!this.o || (rogVar = this.g) == null) {
            return;
        }
        rogVar.j(5);
    }

    @Override // defpackage.rnw, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        this.p = true;
    }
}
