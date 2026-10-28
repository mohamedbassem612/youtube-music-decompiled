package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rnl implements DialogInterface.OnClickListener {
    final /* synthetic */ rnm a;

    public rnl(rnm rnmVar) {
        this.a = rnmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        rnm rnmVar = this.a;
        intent.setData(Uri.fromParts("package", rnmVar.getActivity().getPackageName(), null));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        rnmVar.startActivity(intent);
    }
}
