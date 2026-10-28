package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsy {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int a(String str, String str2) {
        ys ysVarO;
        switch (str.hashCode()) {
            case -2123537834:
                return str.equals("audio/eac3-joc") ? 18 : 0;
            case -1365340241:
                return str.equals("audio/vnd.dts.hd;profile=lbr") ? 8 : 0;
            case -1095064472:
                return str.equals("audio/vnd.dts") ? 7 : 0;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (ysVarO = o(str2)) == null) {
                    return 0;
                }
                return ysVarO.a();
            case 187078296:
                return str.equals("audio/ac3") ? 5 : 0;
            case 187078297:
                return str.equals("audio/ac4") ? 17 : 0;
            case 187081724:
                return str.equals("audio/dsd") ? 31 : 0;
            case 550520934:
                return str.equals("audio/vnd.dts.uhd;profile=p2") ? 30 : 0;
            case 1504578661:
                return str.equals("audio/eac3") ? 6 : 0;
            case 1504831518:
                return str.equals("audio/mpeg") ? 9 : 0;
            case 1504891608:
                return str.equals("audio/opus") ? 20 : 0;
            case 1505942594:
                return str.equals("audio/vnd.dts.hd") ? 8 : 0;
            case 1556697186:
                return str.equals("audio/true-hd") ? 14 : 0;
            default:
                return 0;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (n(str)) {
            return 2;
        }
        if (m(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str) || "application/x-mp4-mebx".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aae aaeVar = (aae) arrayList.get(i);
            Object obj = aaeVar.c;
            if (str.equals(null)) {
                int i2 = aaeVar.a;
                return 0;
            }
        }
        return -1;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : bwp.aj(str)) {
            String strD = d(str2);
            if (strD != null && i(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String d(String str) {
        ys ysVarO;
        String strE = null;
        if (str == null) {
            return null;
        }
        String strAe = ahno.ae(str.trim());
        if (strAe.startsWith("avc1") || strAe.startsWith("avc3")) {
            return "video/avc";
        }
        if (strAe.startsWith("hev1") || strAe.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strAe.startsWith("vvc1") || strAe.startsWith("vvi1")) {
            return "video/vvc";
        }
        if (strAe.startsWith("dvav") || strAe.startsWith("dva1") || strAe.startsWith("dvhe") || strAe.startsWith("dvh1") || strAe.startsWith("dav1")) {
            return "video/dolby-vision";
        }
        if (strAe.startsWith("av01")) {
            return "video/av01";
        }
        if (strAe.startsWith("vp9") || strAe.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strAe.startsWith("vp8") || strAe.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strAe.startsWith("mp4a")) {
            if (strAe.startsWith("mp4a.") && (ysVarO = o(strAe)) != null) {
                strE = e(ysVarO.a);
            }
            return strE == null ? "audio/mp4a-latm" : strE;
        }
        if (strAe.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strAe.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strAe.startsWith("ac-3") || strAe.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strAe.startsWith("ec-3") || strAe.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strAe.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strAe.startsWith("ac-4") || strAe.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strAe.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strAe.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strAe.startsWith("dtsh") || strAe.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strAe.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strAe.startsWith("opus")) {
            return "audio/opus";
        }
        if (strAe.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strAe.startsWith("flac")) {
            return "audio/flac";
        }
        if (strAe.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strAe.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strAe.contains("cea708")) {
            return "application/cea-708";
        }
        if (strAe.contains("eia608") || strAe.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aae aaeVar = (aae) arrayList.get(i);
            Object obj = aaeVar.b;
            if (strAe.startsWith(null)) {
                Object obj2 = aaeVar.c;
                return null;
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 221) {
                return "audio/vorbis";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                case 108:
                    return "image/jpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : bwp.aj(str)) {
            String strD = d(str2);
            if (strD != null && n(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        String strAe = ahno.ae(str);
        switch (strAe.hashCode()) {
            case -1833600100:
                return strAe.equals("video/x-mvhevc") ? "video/mv-hevc" : strAe;
            case -1007807498:
                return strAe.equals("audio/x-flac") ? "audio/flac" : strAe;
            case -979095690:
                return strAe.equals("application/x-mpegurl") ? "application/x-mpegURL" : strAe;
            case -586683234:
                return strAe.equals("audio/x-wav") ? "audio/wav" : strAe;
            case -432836268:
                return strAe.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strAe;
            case -432836267:
                return strAe.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strAe;
            case 187090231:
                return strAe.equals("audio/mp3") ? "audio/mpeg" : strAe;
            default:
                return strAe;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean h(String str, String str2) {
        ys ysVarO;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals("audio/eac3-joc")) {
                    return false;
                }
                break;
            case -1743838946:
                if (!str.equals("application/x-mp4-mebx")) {
                    return false;
                }
                break;
            case -1354451219:
                if (!str.equals("application/vnd.dvb.ait")) {
                    return false;
                }
                break;
            case -1348231605:
                if (!str.equals("application/x-icy")) {
                    return false;
                }
                break;
            case -1265048566:
                if (!str.equals("application/x-camera-motion")) {
                    return false;
                }
                break;
            case -1248341703:
                if (!str.equals("application/id3")) {
                    return false;
                }
                break;
            case -432837260:
                if (!str.equals("audio/mpeg-L1")) {
                    return false;
                }
                break;
            case -432837259:
                if (!str.equals("audio/mpeg-L2")) {
                    return false;
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (ysVarO = o(str2)) == null || (iA = ysVarO.a()) == 0 || iA == 16) {
                    return false;
                }
                break;
            case -43764892:
                if (!str.equals("application/meta")) {
                    return false;
                }
                break;
            case 187078296:
                if (!str.equals("audio/ac3")) {
                    return false;
                }
                break;
            case 187094639:
                if (!str.equals("audio/raw")) {
                    return false;
                }
                break;
            case 469933706:
                if (!str.equals("application/x-media3-cues")) {
                    return false;
                }
                break;
            case 1054472807:
                if (!str.equals("application/x-itut-t35")) {
                    return false;
                }
                break;
            case 1154383568:
                if (!str.equals("application/x-emsg")) {
                    return false;
                }
                break;
            case 1331836563:
                if (!str.equals("video/apv")) {
                    return false;
                }
                break;
            case 1504578661:
                if (!str.equals("audio/eac3")) {
                    return false;
                }
                break;
            case 1504619009:
                if (!str.equals("audio/flac")) {
                    return false;
                }
                break;
            case 1504831518:
                if (!str.equals("audio/mpeg")) {
                    return false;
                }
                break;
            case 1652648887:
                if (!str.equals("application/x-scte35")) {
                    return false;
                }
                break;
            case 1903231877:
                if (!str.equals("audio/g711-alaw")) {
                    return false;
                }
                break;
            case 1903589369:
                if (!str.equals("audio/g711-mlaw")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public static boolean i(String str) {
        return "audio".equals(p(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (!str.startsWith("dvhe") && !str.startsWith("dvh1") && !str.startsWith("dav1")) {
            if (str2 == null) {
                return false;
            }
            if ((!str2.startsWith("dvhe") || !str.startsWith("hev1")) && ((!str2.startsWith("dvh1") || !str.startsWith("hvc1")) && ((!str2.startsWith("dvav") || !str.startsWith("avc3")) && ((!str2.startsWith("dva1") || !str.startsWith("avc1")) && (!str2.startsWith("dav1") || !str.startsWith("av01")))))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(String str) {
        return "image".equals(p(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        if (str != null) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
        }
        return false;
    }

    public static boolean m(String str) {
        return "text".equals(p(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean n(String str) {
        return "video".equals(p(str));
    }

    static ys o(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            try {
                return new ys(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static String p(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
