package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpt extends bp {
    public xxj k;

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setMessage(Html.fromHtml(getString(R.string.mdx_pref_delete_tv_codes_remove_confirmation, getArguments().getString("screenName"))).toString()).setPositiveButton(R.string.mdx_pref_delete_tv_codes_remove_tv, new dkh(this, 16, null)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }
}
