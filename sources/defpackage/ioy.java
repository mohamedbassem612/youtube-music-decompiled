package defpackage;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ioy implements dko {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ioy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.dko
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            cf activity = ((ioz) this.a).a.getActivity();
            if (activity != null) {
                afwl.m(activity, new Intent(activity, (Class<?>) LicenseMenuActivity.class));
                return;
            }
            return;
        }
        if (i == 1) {
            cf activity2 = ((ioz) this.a).a.getActivity();
            if (activity2 != null) {
                afwl.m(activity2, sxy.a(Uri.parse(activity2.getString(R.string.uri_youtube_terms))));
                return;
            }
            return;
        }
        Object obj = this.a;
        int i2 = 2;
        if (i != 2) {
            DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference = (DownloadNetworkSelectionDialogPreference) obj;
            int iIndexOf = DownloadNetworkSelectionDialogPreference.b.indexOf(downloadNetworkSelectionDialogPreference.f.s());
            int i3 = 5;
            if (!downloadNetworkSelectionDialogPreference.e) {
                new AlertDialog.Builder(downloadNetworkSelectionDialogPreference.c).setTitle(R.string.download_network_preference_title).setSingleChoiceItems(R.array.download_network_preference_entries, iIndexOf, new xqu(obj, i3)).setNegativeButton(R.string.download_network_preference_learn_more, new xqu(obj, 7)).setPositiveButton(R.string.cancel, new xyo(3)).create().show();
                return;
            }
            fu fuVar = new fu(downloadNetworkSelectionDialogPreference.c);
            fuVar.i(R.string.download_network_preference_title);
            xqu xquVar = new xqu(obj, i3);
            fq fqVar = fuVar.a;
            fqVar.n = fqVar.a.getResources().getTextArray(R.array.download_network_preference_entries);
            fqVar.p = xquVar;
            fqVar.v = iIndexOf;
            fqVar.u = true;
            fuVar.setNegativeButton(R.string.download_network_preference_learn_more, new xqu(obj, 6));
            fuVar.setPositiveButton(R.string.cancel, new xyo(i2));
            fuVar.create().show();
            return;
        }
        ipz ipzVar = (ipz) obj;
        vxz vxzVar = ipzVar.e;
        vxz vxzVar2 = ipzVar.d;
        omj omjVar = ipzVar.f;
        zwb zwbVar = ipzVar.c;
        Context context = ipzVar.a.getContext();
        try {
            Account accountM = omjVar.M(zwbVar.e());
            if (accountM != null) {
                qbw qbwVarB = ParentToolsActivity.b(context);
                qbwVarB.d = accountM.name;
                qbwVarB.b = qbz.b;
                qbwVarB.m = vxzVar2.l(217, 45750588L, false);
                qbwVarB.c = txz.b(context);
                qbwVarB.l = vxzVar.l(25, 45751271L, false);
                qbwVarB.n = vxzVar.l(33, 45800990L, false);
                qbwVarB.e = "dark";
                afwl.m(context, qbwVarB.a());
            }
        } catch (RemoteException | kmj | kmk e) {
            ((agrc) ((agrc) ((agrc) irb.a.b()).j(e)).k("com/google/android/apps/youtube/music/settings/utils/ParentToolsUtil", "startParentTools", '7', "ParentToolsUtil.java")).t("Couldn't start parent tools!");
        }
    }
}
