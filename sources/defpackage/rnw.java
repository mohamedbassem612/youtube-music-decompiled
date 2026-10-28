package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class rnw extends cc implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    boolean a = true;
    boolean b = true;
    int c = -1;
    Dialog d;
    boolean e;
    boolean f;

    final void c(boolean z) {
        if (this.f) {
            return;
        }
        this.f = true;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.dismiss();
            this.d = null;
        }
        this.e = true;
        if (this.c >= 0) {
            getParentFragmentManager().ak(this.c, false);
            this.c = -1;
            return;
        }
        av avVar = new av(getParentFragmentManager());
        avVar.l(this);
        if (z) {
            avVar.a(true, true);
        } else {
            avVar.a(false, true);
        }
    }

    public final Dialog d() {
        return new Dialog(getActivity(), 0);
    }

    @Override // defpackage.cc
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("DialogFragment:");
        printWriter.print(str);
        printWriter.print("  cancelable=");
        printWriter.print(this.a);
        printWriter.print(" showsDialog=");
        printWriter.print(this.b);
        printWriter.print(" backStackId=");
        printWriter.println(this.c);
        printWriter.print(str);
        printWriter.print("  dialog=");
        printWriter.println(this.d);
        printWriter.print(str);
        printWriter.print("  viewDestroyed=");
        printWriter.print(this.e);
        printWriter.print(" dismissed=");
        printWriter.print(this.f);
        printWriter.print(" shownByMe=");
        printWriter.println(false);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        Bundle bundle2;
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        if (this.b) {
            if (this.d == null) {
                Dialog dialogD = d();
                this.d = dialogD;
                dialogD.requestWindowFeature(1);
            }
            View view = getView();
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.d.setContentView(view);
            }
            cf activity = getActivity();
            if (activity != null) {
                this.d.setOwnerActivity(activity);
            }
            this.d.setCancelable(this.a);
            this.d.setOnDismissListener(this);
            this.d.setOnCancelListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.d.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.cc
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f = false;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.b = true;
        if (bundle != null) {
            this.a = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.c = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.cc
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.e = true;
            dialog.dismiss();
            this.d = null;
        }
    }

    @Override // defpackage.cc
    public final void onDetach() {
        super.onDetach();
        if (this.f) {
            return;
        }
        this.f = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.e) {
            return;
        }
        c(true);
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.b) {
            return super.onGetLayoutInflater(bundle);
        }
        Dialog dialogD = d();
        this.d = dialogD;
        dialogD.requestWindowFeature(1);
        Dialog dialog = this.d;
        return dialog != null ? (LayoutInflater) dialog.getContext().getSystemService("layout_inflater") : (LayoutInflater) getActivity().getSystemService("layout_inflater");
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        Dialog dialog = this.d;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        if (!this.a) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i = this.c;
        if (i != -1) {
            bundle.putInt("android:backStackId", i);
        }
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.e = false;
            dialog.show();
        }
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }
}
