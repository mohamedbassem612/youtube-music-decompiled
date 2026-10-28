package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rnm extends rnc {
    public rmy k;
    public abfv l;

    private final boolean k() {
        cf activity = getActivity();
        if (activity != null) {
            return activity.getPackageName().contains("com.google.android.apps.youtube.creator");
        }
        return false;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        ArrayList<String> stringArrayList;
        int i = true != k() ? R.string.camera_permission_description : R.string.camera_permission_description_v1;
        int i2 = true != k() ? R.string.camera_permission_positive_button : R.string.camera_permission_positive_button_v1;
        acws acwsVarG = this.l.g(getActivity());
        Bundle arguments = getArguments();
        if (arguments == null || (stringArrayList = arguments.getStringArrayList("permissions")) == null || !stringArrayList.contains("android.permission.CAMERA")) {
            i = R.string.files_permission_description;
        }
        AlertDialog alertDialogCreate = acwsVarG.setMessage(i).setPositiveButton(i2, new rnl(this)).create();
        if (k()) {
            alertDialogCreate.setOnShowListener(new gxu(alertDialogCreate, 4));
        }
        return alertDialogCreate;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.k.d();
    }
}
