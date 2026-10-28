package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aebs extends bp {
    public qcb k;

    public static aebs i(int i) {
        aebs aebsVar = new aebs();
        Bundle bundle = new Bundle();
        bundle.putInt("messageId", i);
        aebsVar.setArguments(bundle);
        return aebsVar;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getClass();
        int i = arguments.getInt("messageId");
        ahno.O(i != 0);
        fu fuVar = new fu(getActivity());
        fuVar.d(i);
        fuVar.setPositiveButton(R.string.permission_open_settings_button, new xqu(this, 10, null));
        fuVar.setNegativeButton(R.string.permissions_not_now, null);
        return fuVar.create();
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        qcb qcbVar = this.k;
        if (qcbVar != null) {
            Object obj = qcbVar.a;
            ((jlo) obj).e.p(jlo.d, null);
        }
    }
}
