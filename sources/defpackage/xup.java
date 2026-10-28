package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xup extends bp {
    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setMessage(R.string.mdx_sideloaded_dialog_error_message).setPositiveButton(R.string.mdx_sideloaded_dialog_confirm_button, new xqu(this, 2)).create();
    }
}
