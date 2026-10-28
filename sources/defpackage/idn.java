package defpackage;

import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class idn implements agex {
    private final /* synthetic */ int $cid;

    public /* synthetic */ idn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agex
    public final boolean a(Object obj) {
        boolean zAa;
        switch (this.$cid) {
            case 0:
                hyz hyzVar = (hyz) obj;
                agrf agrfVar = idr.a;
                if (hyzVar != null && hyzVar.n() != null) {
                    if (!idr.x(hyzVar)) {
                        zAa = ahno.aa(hyzVar.t());
                    } else if (!idr.x(hyzVar) || hyzVar.n() == null || hyzVar.n().b == null) {
                        zAa = false;
                    } else {
                        ajwo ajwoVar = hyzVar.n().b;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.a);
                        ajwoVar.c(aihlVarCheckIsLite);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                        zAa = ((apzf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d.isEmpty();
                    }
                    if (!zAa && !gzj.aa(hyzVar.n())) {
                        return true;
                    }
                }
                break;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    String strAe = ahno.ae(str);
                    if (!TextUtils.isEmpty(strAe) && ((!strAe.contains("text") || strAe.contains("text/vtt")) && !strAe.contains("html") && !strAe.contains("xml"))) {
                        return true;
                    }
                }
                break;
            case 2:
                return true;
            case 3:
                return mpy.a.contains(((nvr) obj).getClass());
            case 4:
                return taq.B((toe) obj);
            case 5:
                String str2 = (String) obj;
                if ("exo_cache_size_bytes_used".equals(str2) || str2.startsWith("av1_supported") || str2.startsWith("h264_main_profile_supported") || str2.startsWith("vp9_profile_2_hdr_10_plus_supported") || str2.startsWith("vp9_profile_2_supported") || str2.startsWith("vp9_secure_profile_2_supported") || str2.startsWith("vp9_secure_supported") || str2.startsWith("vp9_supported") || str2.startsWith("opus_supported") || str2.endsWith("last_manual_video_quality_selection_max") || str2.endsWith("last_manual_video_quality_selection_direction") || str2.endsWith("last_manual_video_quality_selection_timestamp") || str2.endsWith("last_playback_start_timestamp") || str2.equals("limit_mobile_data_usage") || str2.equals("dcip3_supported") || "media_persisted_bandwidth_samples".equals(str2)) {
                    return true;
                }
                break;
            case 6:
                return true;
            case 7:
                String str3 = (String) obj;
                if (str3.startsWith("com.google.android.libraries.youtube.notification.badgecount.badgecount") || str3.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_importance") || str3.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled")) {
                    return true;
                }
                break;
            case 8:
                String str4 = (String) obj;
                if ((!TextUtils.isEmpty(str4) && str4.startsWith("playability_adult_confirmation_time_stamp:")) || absl.d(str4)) {
                    return true;
                }
                break;
            case 9:
                Float f = (Float) obj;
                agke agkeVar = adce.k;
                if (f.floatValue() >= 0.0f && f.floatValue() <= 1.0f) {
                    return true;
                }
                break;
            case 10:
                if (!((afhm) obj).a) {
                    return true;
                }
                break;
            default:
                if (((Pair) obj).second != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
