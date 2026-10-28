package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nrl {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "AD_INTRO";
            case 2:
                return "LOCAL_VIDEO_AD";
            case 3:
                return "REMOTE_VIDEO_AD";
            case 4:
                return "AD_VIDEO_END";
            case 5:
                return "SURVEY_AD";
            case 6:
                return "SURVEY_INTERSTITIAL_AD";
            case 7:
                return "FORECASTING_AD";
            case 8:
                return "THROTTLED_AD";
            case 9:
                return "VIDEO_TRACKING_AD";
            default:
                return "INSTREAM_AD_PLAYER_OVERLAY_RENDERER";
        }
    }

    public static sml b(skz skzVar) {
        skzVar.getClass();
        return new sgz(skzVar);
    }

    public static sml c(sna snaVar) {
        snaVar.getClass();
        return new sha(snaVar);
    }

    public static ajdz d(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajdv ajdvVar = (ajdv) it.next();
            if (ajdvVar != null && (i = ajdvVar.b) == 49483894) {
                if (i != 49483894) {
                    break;
                }
                return (ajdz) ajdvVar.c;
            }
        }
        return null;
    }
}
