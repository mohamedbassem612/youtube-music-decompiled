package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaus {
    public static final Comparator a = new cru(11);
    public static final Comparator b = new cru(12);
    public static final Map c;
    private static final Map d;
    private static final Map e;

    static {
        HashMap map = new HashMap();
        c = map;
        HashMap map2 = new HashMap();
        d = map2;
        HashMap map3 = new HashMap();
        e = map3;
        map.put(aohx.AUDIO_ONLY, 0);
        map.put(aohx.LD, 144);
        map.put(aohx.LD_240, 240);
        map.put(aohx.SD, 360);
        map.put(aohx.SD_480, 480);
        map.put(aohx.HD, 720);
        map.put(aohx.HD_1080, 1080);
        map.put(aohx.HD_1440, 1440);
        map.put(aohx.HD_2160, 2160);
        map.put(aohx.HD_4320, 4320);
        map2.put(0, aohx.AUDIO_ONLY);
        map2.put(144, aohx.LD);
        map2.put(240, aohx.LD_240);
        map2.put(360, aohx.SD);
        map2.put(480, aohx.SD_480);
        map2.put(720, aohx.HD);
        map2.put(1080, aohx.HD_1080);
        map2.put(1440, aohx.HD_1440);
        map2.put(2160, aohx.HD_2160);
        map2.put(4320, aohx.HD_4320);
        map3.put(aohx.AUDIO_ONLY, Integer.valueOf(R.string.offline_video_quality_audio_only));
        map3.put(aohx.LD, Integer.valueOf(R.string.offline_video_quality_144p));
        map3.put(aohx.SD, Integer.valueOf(R.string.offline_video_quality_360p));
        map3.put(aohx.SD_480, Integer.valueOf(R.string.offline_video_quality_480p));
        map3.put(aohx.HD, Integer.valueOf(R.string.offline_video_quality_720p));
        map3.put(aohx.HD_1080, Integer.valueOf(R.string.offline_video_quality_1080p));
    }

    public static int a(aohx aohxVar, int i) {
        if (!d()) {
            Map map = c;
            return map.containsKey(aohxVar) ? ((Integer) map.get(aohxVar)).intValue() : i;
        }
        if (aohxVar == null) {
            return i;
        }
        switch (aohxVar.ordinal()) {
            case 1:
                return 144;
            case 2:
                return 360;
            case 3:
                return 720;
            case 4:
                return 0;
            case 5:
                return 240;
            case 6:
                return 480;
            case 7:
                return 1080;
            case 8:
                return 1440;
            case 9:
                return 2160;
            case 10:
                return 4320;
            default:
                return i;
        }
    }

    public static final int b(aohx aohxVar) {
        if (!d()) {
            Map map = e;
            if (map.containsKey(aohxVar)) {
                return ((Integer) map.get(aohxVar)).intValue();
            }
            return -1;
        }
        if (aohxVar == null) {
            return -1;
        }
        int iOrdinal = aohxVar.ordinal();
        if (iOrdinal == 1) {
            return R.string.offline_video_quality_144p;
        }
        if (iOrdinal == 2) {
            return R.string.offline_video_quality_360p;
        }
        if (iOrdinal == 3) {
            return R.string.offline_video_quality_720p;
        }
        if (iOrdinal == 4) {
            return R.string.offline_video_quality_audio_only;
        }
        if (iOrdinal == 6) {
            return R.string.offline_video_quality_480p;
        }
        if (iOrdinal == 7) {
            return R.string.offline_video_quality_1080p;
        }
        return -1;
    }

    public static aohx c(int i) {
        if (!d()) {
            aohx aohxVar = (aohx) d.get(Integer.valueOf(i));
            return aohxVar == null ? aohx.UNKNOWN_FORMAT_TYPE : aohxVar;
        }
        if (i == 0) {
            return aohx.AUDIO_ONLY;
        }
        if (i == 144) {
            return aohx.LD;
        }
        if (i == 240) {
            return aohx.LD_240;
        }
        if (i == 360) {
            return aohx.SD;
        }
        if (i == 480) {
            return aohx.SD_480;
        }
        if (i == 720) {
            return aohx.HD;
        }
        if (i == 1080) {
            return aohx.HD_1080;
        }
        if (i == 1440) {
            return aohx.HD_1440;
        }
        if (i != 2160) {
            return i != 4320 ? aohx.UNKNOWN_FORMAT_TYPE : aohx.HD_4320;
        }
        return aohx.HD_2160;
    }

    private static boolean d() {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830436)) {
                return true;
            }
        }
        return false;
    }
}
