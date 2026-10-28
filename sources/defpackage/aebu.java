package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aebu implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aebv a;

    public aebu(aebv aebvVar, int i) {
        this.$cid = i;
        this.a = aebvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$cid;
        aebv aebvVar = this.a;
        if (i == 0) {
            aebvVar.getActivity().onBackPressed();
        } else {
            if (!aebvVar.c) {
                aebvVar.requestPermissions(aebvVar.b, 1);
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", aebvVar.getActivity().getPackageName(), null));
            aebvVar.getActivity().startActivity(intent);
        }
    }
}
