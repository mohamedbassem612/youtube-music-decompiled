package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class xqr extends bp {
    public xrc k;
    boolean l = false;

    public final /* synthetic */ void i() {
        this.k.a();
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        boolean z = this.l;
        return new AlertDialog.Builder(getActivity()).setTitle(true != z ? R.string.mdx_audio_cast_partly_castable_dialog_title : R.string.mdx_audio_cast_partly_castable_play_dialog_title).setMessage(true != z ? R.string.mdx_audio_cast_partly_castable_dialog_message : R.string.mdx_audio_cast_partly_castable_play_dialog_message).setNegativeButton(R.string.mdx_audio_cast_partly_castable_dialog_negative_button, new dkh(this, 19, null)).setPositiveButton(R.string.mdx_audio_cast_partly_castable_dialog_positive_button, new dkh(this, 20, null)).create();
    }
}
