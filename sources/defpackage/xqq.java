package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watch.WatchFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class xqq extends bp {
    boolean k = false;
    public igp l;

    public final /* synthetic */ void i() {
        ((WatchFragment) this.l.a).e.a(vxh.a("SPunlimited"));
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        boolean z = this.k;
        return new AlertDialog.Builder(getActivity()).setTitle(true != z ? R.string.mdx_audio_cast_not_castable_dialog_title : R.string.mdx_audio_cast_not_castable_songs_dialog_title).setMessage(true != z ? R.string.mdx_audio_cast_not_castable_dialog_message : R.string.mdx_audio_cast_not_castable_songs_dialog_message).setNegativeButton(R.string.mdx_audio_cast_not_castable_dialog_negative_button, new dkh(this, 17, null)).setPositiveButton(R.string.mdx_audio_cast_not_castable_dialog_positive_button, new dkh(this, 18, null)).create();
    }
}
