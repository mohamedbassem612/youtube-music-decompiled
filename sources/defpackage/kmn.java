package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class kmn extends bp {
    public Dialog k;
    public DialogInterface.OnCancelListener l;
    private Dialog m;

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialog = this.k;
        if (dialog != null) {
            return dialog;
        }
        this.d = false;
        if (this.m == null) {
            Context context = getContext();
            kro.l(context);
            this.m = new AlertDialog.Builder(context).create();
        }
        return this.m;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
