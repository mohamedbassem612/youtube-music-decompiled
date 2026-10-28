package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aedx implements nxl {
    private final aunn a;
    private final Context b;
    private final vxz c;

    public aedx(aunn aunnVar, Context context, vxz vxzVar) {
        this.a = aunnVar;
        this.b = context;
        this.c = vxzVar;
    }

    private static boolean e(String str) {
        return str.startsWith("YouTubeSans") || str.startsWith("YTSans");
    }

    private final boolean f() {
        return this.c.l(165, 45794508L, false);
    }

    private static boolean g(int i) {
        return (i & 1) != 0;
    }

    private final Typeface h(Context context, int i, boolean z) {
        int i2 = 1;
        if (i < 600) {
            i2 = true != z ? 0 : 2;
        } else if (true == z) {
            i2 = 3;
        }
        return ((acks) this.a.io()).a(context, 4, i, i2);
    }

    private final Typeface i(Context context, int i, boolean z) {
        aedw aedwVar;
        if (f()) {
            return ((acks) this.a.io()).a(context, 2, i, true == z ? 2 : 0);
        }
        aedw[] aedwVarArr = aedw.h;
        int length = aedwVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aedwVar = null;
                break;
            }
            aedwVar = aedwVarArr[i2];
            if (i == aedwVar.i) {
                break;
            }
            i2++;
        }
        if (aedwVar == null) {
            aedwVar = aedw.BOLD;
        }
        switch (aedwVar) {
            case LIGHT:
                return ackm.YOUTUBE_SANS_LIGHT.c(context, 0);
            case REGULAR:
                return ackm.YOUTUBE_SANS_REGULAR.c(context, 0);
            case MEDIUM:
                return ackm.YOUTUBE_SANS_MEDIUM.c(context, 0);
            case SEMIBOLD:
                return ackm.YOUTUBE_SANS_SEMIBOLD.c(context, 0);
            case BOLD:
                return ackm.YOUTUBE_SANS_BOLD.c(context, 0);
            case EXTRABOLD:
                return ackm.YOUTUBE_SANS_EXTRABOLD.c(context, 0);
            case BLACK:
                return ackm.YOUTUBE_SANS_BLACK.c(context, 0);
            default:
                throw new RuntimeException(null, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0219  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0234  */
    /* JADX WARN: Code duplicated, block: B:165:0x023e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0249  */
    /* JADX WARN: Code duplicated, block: B:171:0x0253  */
    /* JADX WARN: Code duplicated, block: B:174:0x025d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0272  */
    /* JADX WARN: Code duplicated, block: B:183:0x027d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x0150  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0166  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.nxl
    public final Typeface a(Context context, String str) {
        int i;
        boolean zContains;
        int i2;
        boolean zContains2;
        int i3;
        int i4 = 1401;
        if (!e(str)) {
            if (!str.startsWith("YouTubeMarquee")) {
                ackp.c(context);
                return null;
            }
            switch (str) {
                case "YouTubeMarquee-SemiBold":
                    i = 1200;
                    break;
                case "YouTubeMarquee-Bold-Italic":
                    i = 1401;
                    break;
                case "YouTubeMarquee-BlackItalic":
                    i = 1801;
                    break;
                case "YouTubeMarquee-ExtraBold":
                    i = 1600;
                    break;
                case "YouTubeMarquee-Bold":
                    i = 1400;
                    break;
                case "YouTubeMarquee-SemiBold-Italic":
                    i = 1201;
                    break;
                case "YouTubeMarquee-Regular-Italic":
                    i = 801;
                    break;
                case "YouTubeMarquee-ExtraBold-Italic":
                    i = 1601;
                    break;
                case "YouTubeMarquee-Light-Italic":
                    i = 601;
                    break;
                case "YouTubeMarquee":
                    i = 1400;
                    break;
                case "YouTubeMarquee-SemiBoldItalic":
                    i = 1201;
                    break;
                case "YouTubeMarquee-Medium-Italic":
                    i = 1001;
                    break;
                case "YouTubeMarquee-Regular":
                    i = 800;
                    break;
                case "YouTubeMarquee-Black":
                    i = 1800;
                    break;
                case "YouTubeMarquee-RegularItalic":
                    i = 801;
                    break;
                case "YouTubeMarquee-ExtraBoldItalic":
                    i = 1601;
                    break;
                case "YouTubeMarquee-MediumItalic":
                    i = 1001;
                    break;
                case "YouTubeMarquee-Light":
                    i = 600;
                    break;
                case "YouTubeMarquee-LightItalic":
                    i = 601;
                    break;
                case "YouTubeMarquee-Italic":
                    i = 801;
                    break;
                case "YouTubeMarquee-Medium":
                    i = 1000;
                    break;
                case "YouTubeMarquee-BoldItalic":
                    i = 1401;
                    break;
                case "YouTubeMarquee-Black-Italic":
                    i = 1801;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                i2 = i >>> 1;
                zContains = g(i);
            } else {
                aedw aedwVarA = aedw.a(str, "YouTubeMarquee");
                int i5 = aedwVarA != null ? aedwVarA.i : 700;
                zContains = str.contains("Italic");
                i2 = i5;
            }
            return h(context, i2, zContains);
        }
        switch (str.hashCode()) {
            case -2134337812:
                if (!str.equals("YouTubeSans-Medium")) {
                    i4 = -1;
                } else {
                    i4 = 1000;
                }
                break;
            case -1891640410:
                if (!str.equals("YTSans-ExtraBoldItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1601;
                }
                break;
            case -1666827698:
                if (!str.equals("YTSans")) {
                    i4 = -1;
                } else {
                    i4 = 800;
                }
                break;
            case -1604879456:
                if (!str.equals("YTSans-Black")) {
                    i4 = -1;
                } else {
                    i4 = 1800;
                }
                break;
            case -1595727689:
                if (!str.equals("YTSans-Light")) {
                    i4 = -1;
                } else {
                    i4 = 600;
                }
                break;
            case -1594292475:
                if (!str.equals("YouTubeSans-Regular")) {
                    i4 = -1;
                } else {
                    i4 = 800;
                }
                break;
            case -1394508846:
                if (!str.equals("YTSans-SemiBold")) {
                    i4 = -1;
                } else {
                    i4 = 1200;
                }
                break;
            case -1271811140:
                if (!str.equals("YouTubeSans-Bold")) {
                    i4 = -1;
                } else {
                    i4 = 1400;
                }
                break;
            case -771539544:
                if (!str.equals("YouTubeSans-Black")) {
                    i4 = -1;
                } else {
                    i4 = 1800;
                }
                break;
            case -762387777:
                if (!str.equals("YouTubeSans-Light")) {
                    i4 = -1;
                } else {
                    i4 = 600;
                }
                break;
            case -605956412:
                if (!str.equals("YTSans-Bold")) {
                    i4 = -1;
                } else {
                    i4 = 1400;
                }
                break;
            case -574180434:
                if (!str.equals("YouTubeSans-ExtraBoldItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1601;
                }
                break;
            case -276161334:
                if (!str.equals("YouTubeSans-SemiBold")) {
                    i4 = -1;
                } else {
                    i4 = 1200;
                }
                break;
            case -191469072:
                if (!str.equals("YTSans-BlackItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1801;
                }
                break;
            case -119481284:
                if (!str.equals("YouTubeSans-MediumItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1001;
                }
                break;
            case 210628054:
                if (!str.equals("YTSans-ExtraBold")) {
                    i4 = -1;
                } else {
                    i4 = 1600;
                }
                break;
            case 257033114:
                if (!str.equals("YouTubeSans-SemiBoldItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1201;
                }
                break;
            case 437945848:
                if (!str.equals("YouTubeSans-BlackItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1801;
                }
                break;
            case 519662558:
                if (!str.equals("YouTubeSans-ExtraBold")) {
                    i4 = -1;
                } else {
                    i4 = 1600;
                }
                break;
            case 672193044:
                if (!str.equals("YTSans-BoldItalic")) {
                    i4 = -1;
                }
                break;
            case 724936445:
                if (!str.equals("YTSans-Regular")) {
                    i4 = -1;
                } else {
                    i4 = 800;
                }
                break;
            case 1170317767:
                if (!str.equals("YTSans-LightItalic")) {
                    i4 = -1;
                } else {
                    i4 = 601;
                }
                break;
            case 1184365730:
                if (!str.equals("YTSans-SemiBoldItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1201;
                }
                break;
            case 1194559015:
                if (!str.equals("YTSans-ExtraBold-Italic")) {
                    i4 = -1;
                } else {
                    i4 = 1601;
                }
                break;
            case 1655579222:
                if (!str.equals("YouTubeSans")) {
                    i4 = -1;
                } else {
                    i4 = 800;
                }
                break;
            case 1662328076:
                if (!str.equals("YouTubeSans-BoldItalic")) {
                    i4 = -1;
                }
                break;
            case 1799732687:
                if (!str.equals("YouTubeSans-LightItalic")) {
                    i4 = -1;
                } else {
                    i4 = 601;
                }
                break;
            case 1843492676:
                if (!str.equals("YTSans-MediumItalic")) {
                    i4 = -1;
                } else {
                    i4 = 1001;
                }
                break;
            case 1996145327:
                if (!str.equals("YTSans-Italic")) {
                    i4 = -1;
                } else {
                    i4 = 801;
                }
                break;
            case 2059878823:
                if (!str.equals("YouTubeSans-Italic")) {
                    i4 = -1;
                } else {
                    i4 = 801;
                }
                break;
            case 2096895988:
                if (!str.equals("YTSans-Medium")) {
                    i4 = -1;
                } else {
                    i4 = 1000;
                }
                break;
            default:
                i4 = -1;
                break;
        }
        if (i4 != -1) {
            i3 = i4 >>> 1;
            zContains2 = g(i4);
        } else {
            aedw aedwVarA2 = aedw.a(str, true == str.startsWith("YouTubeSans") ? "YouTubeSans" : "YTSans");
            int i6 = aedwVarA2 != null ? aedwVarA2.i : 700;
            zContains2 = str.contains("Italic");
            i3 = i6;
        }
        return i(context, i3, zContains2);
    }

    @Override // defpackage.nxl
    public final Typeface b(Context context, String str, int i, boolean z) {
        return c(context, str, i, z, null);
    }

    @Override // defpackage.nxl
    public final Typeface c(Context context, String str, int i, boolean z, String str2) {
        if (e(str)) {
            return i(context, i, z);
        }
        if (str.startsWith("YouTubeMarquee")) {
            return h(context, i, z);
        }
        ackp.c(context);
        return null;
    }

    @Override // defpackage.nxl
    public final int d(String str) {
        int i;
        if (e(str) && f()) {
            i = 2;
        } else {
            i = str.startsWith("YouTubeMarquee") ? 4 : 0;
        }
        if (i == 0) {
            return 1;
        }
        ((acks) this.a.io()).b(this.b, i);
        return 1;
    }
}
