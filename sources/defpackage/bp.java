package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bp extends cc implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Dialog f;
    public boolean g;
    public boolean h;
    public boolean i;
    private boolean o;
    private Handler yR;
    private final Runnable l = new bq(this, 1, null);
    private final DialogInterface.OnCancelListener m = new bl(this);
    public final DialogInterface.OnDismissListener a = new bm(this);
    private int n = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public int e = -1;
    private final boq yV = new bn(this);
    public boolean j = false;

    @Override // defpackage.cc
    public final ch createFragmentContainer() {
        return new bo(this, super.createFragmentContainer());
    }

    public void dismiss() {
        iQ(false, false, false);
    }

    public void gT(dd ddVar, String str) {
        this.h = false;
        this.i = true;
        av avVar = new av(ddVar);
        avVar.r();
        avVar.g(0, this, str, 1);
        avVar.a(false, true);
    }

    public void h(dd ddVar, String str) {
        this.h = false;
        this.i = true;
        av avVar = new av(ddVar);
        avVar.r();
        avVar.g(0, this, str, 1);
        avVar.e();
    }

    public Dialog iH(Bundle bundle) {
        if (dd.aa(3)) {
            toString();
        }
        return new qg(requireContext(), this.b);
    }

    public void iN() {
        iQ(true, false, false);
    }

    public final void iO(int i, int i2) {
        if (dd.aa(2)) {
            toString();
        }
        this.n = i;
        if (i == 2) {
            this.b = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.b = i2;
        }
    }

    public final void iQ(boolean z, boolean z2, boolean z3) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.i = false;
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.yR.getLooper()) {
                    onDismiss(this.f);
                } else {
                    this.yR.post(this.l);
                }
            }
        }
        this.g = true;
        if (this.e >= 0) {
            if (z3) {
                dd parentFragmentManager = getParentFragmentManager();
                int i = this.e;
                if (i < 0) {
                    throw new IllegalArgumentException(a.bR(i, "Bad id: "));
                }
                parentFragmentManager.ae(null, i, 1);
            } else {
                getParentFragmentManager().ak(this.e, z);
            }
            this.e = -1;
            return;
        }
        av avVar = new av(getParentFragmentManager());
        avVar.r();
        avVar.l(this);
        if (z3) {
            avVar.e();
        } else if (z) {
            avVar.a(true, true);
        } else {
            avVar.a(false, true);
        }
    }

    public void iR(boolean z) {
        this.c = z;
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void iS(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().d(this.yV);
        if (this.i) {
            return;
        }
        this.h = false;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.yR = new Handler();
        this.d = this.mContainerId == 0;
        if (bundle != null) {
            this.n = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.c = bundle.getBoolean("android:cancelable", true);
            this.d = bundle.getBoolean("android:showsDialog", this.d);
            this.e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.cc
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f;
        if (dialog != null) {
            this.g = true;
            dialog.setOnDismissListener(null);
            this.f.dismiss();
            if (!this.h) {
                onDismiss(this.f);
            }
            this.f = null;
            this.j = false;
        }
    }

    @Override // defpackage.cc
    public void onDetach() {
        super.onDetach();
        if (!this.i && !this.h) {
            this.h = true;
        }
        getViewLifecycleOwnerLiveData().g(this.yV);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.g) {
            return;
        }
        if (dd.aa(3)) {
            toString();
        }
        iQ(true, true, false);
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.d || this.o) {
            if (!dd.aa(2)) {
                return layoutInflaterOnGetLayoutInflater;
            }
            toString();
            return layoutInflaterOnGetLayoutInflater;
        }
        if (!this.j) {
            try {
                this.o = true;
                Dialog dialogIH = iH(bundle);
                this.f = dialogIH;
                if (this.d) {
                    iS(dialogIH, this.n);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f.setOwnerActivity((Activity) context);
                    }
                    this.f.setCancelable(this.c);
                    this.f.setOnCancelListener(this.m);
                    this.f.setOnDismissListener(this.a);
                    this.j = true;
                } else {
                    this.f = null;
                }
                this.o = false;
            } catch (Throwable th) {
                this.o = false;
                throw th;
            }
        }
        if (dd.aa(2)) {
            toString();
        }
        Dialog dialog = this.f;
        return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        Dialog dialog = this.f;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.n;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.c) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.d) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.e;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.cc
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog != null) {
            this.g = false;
            dialog.show();
            View decorView = this.f.getWindow().getDecorView();
            bou.d(decorView, this);
            decorView.getClass();
            decorView.setTag(com.google.android.apps.youtube.music.R.id.view_tree_view_model_store_owner, this);
            api.g(decorView, this);
        }
    }

    @Override // defpackage.cc
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onViewStateRestored */
    public void m674lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        Bundle bundle2;
        super.m674lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        if (this.f == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.cc
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
