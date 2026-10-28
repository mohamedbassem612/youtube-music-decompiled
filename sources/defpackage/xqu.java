package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.preference.Preference;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xqu implements DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xqu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        xgn xgnVar;
        switch (this.$cid) {
            case 0:
                ((xqv) this.a).i();
                break;
            case 1:
                ((bp) this.a).iQ(true, false, false);
                break;
            case 2:
                ((bp) this.a).iQ(true, false, false);
                break;
            case 3:
                Object obj = this.a;
                ajnf ajnfVar = i == -1 ? ((aatu) obj).g : i == -2 ? ((aatu) obj).h : null;
                if (ajnfVar != null) {
                    aatu aatuVar = (aatu) obj;
                    if (aatuVar.f != null) {
                        if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                            ajwo ajwoVarF = ajnfVar.r;
                            if (ajwoVarF == null) {
                                ajwoVarF = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
                            ajwoVarF.c(aihlVarCheckIsLite);
                            if (!ajwoVarF.j.n(aihlVarCheckIsLite.d) && (xgnVar = aatuVar.f) != null) {
                                ajwoVarF = xgnVar.f(ajwoVarF);
                            }
                            if (ajwoVarF != null) {
                                aatuVar.b.c(ajwoVarF, null);
                            }
                        }
                        if ((ajnfVar.b & SemanticState.Modal) != 0) {
                            vxe vxeVar = aatuVar.b;
                            ajwo ajwoVar = ajnfVar.q;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            vxeVar.c(ajwoVar, xhd.h(ajnfVar, !((ajnfVar.b & SemanticState.Obscured) != 0)));
                        }
                    }
                }
                dialogInterface.dismiss();
                break;
            case 4:
                ((aazo) this.a).d();
                break;
            case 5:
                if (i >= 0) {
                    agke agkeVar = DownloadNetworkSelectionDialogPreference.b;
                    if (i < ((agpi) agkeVar).d) {
                        Object obj2 = this.a;
                        atpr atprVar = (atpr) agkeVar.get(i);
                        Preference preference = (Preference) obj2;
                        preference.U(atprVar);
                        DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference = (DownloadNetworkSelectionDialogPreference) obj2;
                        taf.k(downloadNetworkSelectionDialogPreference.d, downloadNetworkSelectionDialogPreference.f.g.t(atprVar), new aata(2), taf.c);
                        preference.n(downloadNetworkSelectionDialogPreference.c.getResources().getStringArray(R.array.download_network_preference_summaries)[i]);
                        dialogInterface.dismiss();
                    }
                }
                break;
            case 6:
                ((DownloadNetworkSelectionDialogPreference) this.a).k();
                break;
            case 7:
                ((DownloadNetworkSelectionDialogPreference) this.a).k();
                break;
            case 8:
                ((acmk) this.a).e(xhb.b(192411));
                break;
            case 9:
                adyc adycVar = (adyc) this.a;
                aokc aokcVarA = ((adol) adycVar.a).a();
                boolean zIsChecked = ((adog) adycVar.e).e.isChecked();
                if (aokcVarA != null) {
                    Object obj3 = adycVar.b;
                    adycVar.d(false);
                    HashMap map = new HashMap();
                    map.put("com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", Boolean.valueOf(zIsChecked));
                    ahhp ahhpVar = (ahhp) obj3;
                    Object obj4 = ahhpVar.b;
                    if (obj4 != null) {
                        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj4);
                    }
                    Object obj5 = ahhpVar.a;
                    xgj xgjVar = new xgj(aokcVarA.i, (amud) null);
                    adof adofVar = (adof) obj5;
                    xgn xgnVar2 = adofVar.c;
                    xgnVar2.w(xgjVar, null);
                    aoke aokeVar = aokcVarA.e;
                    if (aokeVar == null) {
                        aokeVar = aoke.a;
                    }
                    if ((aokeVar.b & 1) == 0 || zIsChecked) {
                        adofVar.a(aokcVarA, map);
                    } else {
                        aoke aokeVar2 = aokcVarA.e;
                        if (aokeVar2 == null) {
                            aokeVar2 = aoke.a;
                        }
                        akdd akddVar = aokeVar2.c;
                        if (akddVar == null) {
                            akddVar = akdd.a;
                        }
                        akdd akddVar2 = akddVar;
                        acwl.i(adofVar.a, akddVar2, adofVar.b, xgnVar2, adofVar.h, true, true, new adod(adofVar, akddVar2, aokcVarA, map), obj4, null, null, adofVar.g, false);
                    }
                    adofVar.e.kk(Boolean.TRUE);
                }
                break;
            case 10:
                cf activity = ((cc) this.a).getActivity();
                int i2 = aebx.f;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                break;
            case 11:
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
                intent2.setPackage("com.android.vending");
                try {
                    ((Context) this.a).startActivity(intent2);
                } catch (ActivityNotFoundException unused) {
                    Log.e(auiw.a, "Google Play Services is not installed, unable to download VrCore.");
                    return;
                }
                break;
            default:
                ((Context) this.a).startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
                break;
        }
    }

    public xqu(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
