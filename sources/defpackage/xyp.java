package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyp extends bp {
    public static xyp i(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("status_code", i);
        bundle.putString("device_name", str);
        xyp xypVar = new xyp();
        xypVar.setArguments(bundle);
        return xypVar;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        String string;
        int i;
        String string2;
        String string3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("status_code");
            string = arguments.getString("device_name");
        } else {
            string = "";
            i = 0;
        }
        agkz agkzVar = xmo.a;
        Integer numValueOf = Integer.valueOf(i);
        if (agkzVar.contains(numValueOf)) {
            string2 = getString(R.string.cast_auth_error_message_title);
            string3 = getString(R.string.cast_auth_error_message_desc, string);
        } else if (i == 401) {
            string2 = getString(R.string.dial_connect_error_header_needs_permission);
            string3 = getString(R.string.dial_connect_error_message_needs_permission);
        } else if (i == 404) {
            string2 = getString(R.string.dial_connect_error_header_ytb_not_installed);
            string3 = getString(R.string.dial_connect_error_message_ytb_not_installed);
        } else {
            string2 = getString(R.string.dial_connect_error_header_generic);
            string3 = getString(R.string.dial_connect_error_message_generic, numValueOf);
        }
        return new AlertDialog.Builder(getActivity()).setTitle(string2).setMessage(string3).setPositiveButton(R.string.dial_connect_error_dialog_close, new xyo(0)).setCancelable(false).create();
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog != null) {
            Button button = (Button) dialog.findViewById(android.R.id.button1);
            button.setTextColor(tzk.n(getActivity(), R.attr.ytCallToAction).orElse(button.getTextColors().getDefaultColor()));
        }
    }
}
