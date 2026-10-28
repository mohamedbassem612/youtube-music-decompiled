package defpackage;

import android.content.DialogInterface;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xyo implements DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xyo(int i) {
        this.$cid = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            dialogInterface.dismiss();
            return;
        }
        if (i2 == 2) {
            agrf agrfVar = DownloadNetworkSelectionDialogPreference.a;
            dialogInterface.dismiss();
        } else if (i2 == 3) {
            agrf agrfVar2 = DownloadNetworkSelectionDialogPreference.a;
            dialogInterface.dismiss();
        }
    }
}
