package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xqv extends bp {
    public xrc k;

    public final /* synthetic */ void i() {
        this.k.a();
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.mdx_logged_out_watch_history_dialog_title).setMessage(R.string.mdx_logged_out_watch_history_dialog_message).setNegativeButton(android.R.string.cancel, new xqu(this, 1)).setPositiveButton(R.string.mdx_logged_out_watch_history_dialog_confirm_button, new xqu(this, 0)).create();
    }
}
