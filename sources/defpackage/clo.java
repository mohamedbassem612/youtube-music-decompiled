package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clo {
    public static final agfr a = aguu.al(new cln(0));
    public final String b;
    public final String c;
    public final String d;
    public final MediaCodecInfo.CodecCapabilities e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private final boolean m;
    private int n;
    private int o;
    private float p;

    public clo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = codecCapabilities;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.l = z7;
        this.m = bsy.n(str2);
        this.p = -3.4028235E38f;
        this.n = -1;
        this.o = -1;
    }

    private static Point l(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = bwp.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void m(String str) {
        bvx.g("NoSupport [" + str + "] [" + this.b + ", " + this.c + "] [" + bwp.d + ']');
    }

    private static boolean n(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointL = l(videoCapabilities, i, i2);
        int i3 = pointL.x;
        int i4 = pointL.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public final float a(int i, int i2) {
        if (!this.m) {
            return -3.4028235E38f;
        }
        float f = this.p;
        if (f != -3.4028235E38f && this.n == i && this.o == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!j(i, i2, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zJ = j(i, i2, f5);
                if (true == zJ) {
                    f3 = f5;
                }
                if (true != zJ) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.p = f2;
        this.n = i;
        this.o = i2;
        return f2;
    }

    public final Point b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return l(videoCapabilities, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015b  */
    /* JADX WARN: Code duplicated, block: B:102:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x014f  */
    public final caz c(bse bseVar, bse bseVar2) {
        bse bseVar3;
        bse bseVar4;
        caz cazVar;
        String str;
        int i;
        String str2 = bseVar.q;
        String str3 = bseVar2.q;
        int i2 = true != Objects.equals(str2, str3) ? 8 : 0;
        if (!this.m) {
            bseVar3 = bseVar;
            bseVar4 = bseVar2;
            if (bseVar3.I != bseVar4.I) {
                i2 |= SemanticState.Obscured;
            }
            if (bseVar3.K != bseVar4.K) {
                i2 |= SemanticState.Multiline;
            }
            if (bseVar3.L != bseVar4.L) {
                i2 |= 16384;
            }
            if (i2 == 0) {
                String str4 = this.c;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairA = bvf.a(bseVar3);
                    Pair pairA2 = bvf.a(bseVar4);
                    if (pairA != null && pairA2 != null) {
                        int iIntValue = ((Integer) pairA.first).intValue();
                        int iIntValue2 = ((Integer) pairA2.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            cazVar = new caz(this.b, bseVar3, bseVar4, 3, 0);
                        } else if (str4.equals("audio/ac4") && pairA.equals(pairA2)) {
                            cazVar = new caz(this.b, bseVar3, bseVar4, 3, 0);
                        } else if (i2 == 0) {
                            str = this.c;
                            if (str.equals("audio/eac3-joc")) {
                            }
                            cazVar = new caz(this.b, bseVar3, bseVar4, 3, 0);
                        } else {
                            if (!bseVar3.d(bseVar4)) {
                                i2 |= 32;
                            }
                            if ("audio/opus".equals(this.c)) {
                                i2 |= 2;
                            }
                            if (i2 == 0) {
                                cazVar = new caz(this.b, bseVar3, bseVar4, 1, 0);
                            }
                        }
                    } else if (i2 == 0) {
                        str = this.c;
                        if (!str.equals("audio/eac3-joc") || str.equals("audio/eac3")) {
                            cazVar = new caz(this.b, bseVar3, bseVar4, 3, 0);
                        } else {
                            if (!bseVar3.d(bseVar4)) {
                                i2 |= 32;
                            }
                            if ("audio/opus".equals(this.c)) {
                                i2 |= 2;
                            }
                            if (i2 == 0) {
                                cazVar = new caz(this.b, bseVar3, bseVar4, 1, 0);
                            }
                        }
                    } else {
                        if (!bseVar3.d(bseVar4)) {
                            i2 |= 32;
                        }
                        if ("audio/opus".equals(this.c)) {
                            i2 |= 2;
                        }
                        if (i2 == 0) {
                            cazVar = new caz(this.b, bseVar3, bseVar4, 1, 0);
                        }
                    }
                } else if (i2 == 0) {
                    str = this.c;
                    if (str.equals("audio/eac3-joc")) {
                    }
                    cazVar = new caz(this.b, bseVar3, bseVar4, 3, 0);
                } else {
                    if (!bseVar3.d(bseVar4)) {
                        i2 |= 32;
                    }
                    if ("audio/opus".equals(this.c)) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        cazVar = new caz(this.b, bseVar3, bseVar4, 1, 0);
                    }
                }
            } else if (i2 == 0) {
                str = this.c;
                if (str.equals("audio/eac3-joc")) {
                }
                cazVar = new caz(this.b, bseVar3, bseVar4, 3, 0);
            } else {
                if (!bseVar3.d(bseVar4)) {
                    i2 |= 32;
                }
                if ("audio/opus".equals(this.c)) {
                    i2 |= 2;
                }
                if (i2 == 0) {
                    cazVar = new caz(this.b, bseVar3, bseVar4, 1, 0);
                }
            }
            return cazVar;
        }
        if (bseVar.B != bseVar2.B) {
            i2 |= SemanticState.ReadOnly;
        }
        boolean z = (bseVar.w == bseVar2.w && bseVar.x == bseVar2.x) ? false : true;
        if (!this.f && z) {
            i2 |= SemanticState.LiveRegion;
        }
        bru bruVar = bseVar.G;
        if ((!bru.h(bruVar) || !bru.h(bseVar2.G)) && !Objects.equals(bruVar, bseVar2.G)) {
            i2 |= SemanticState.Modal;
        }
        String str5 = this.b;
        int i3 = bst.a;
        if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str5) && !bseVar.d(bseVar2)) {
            i2 |= 2;
        }
        int i4 = bseVar.y;
        if (i4 != -1 && (i = bseVar.z) != -1 && i4 == bseVar2.y && i == bseVar2.z && z) {
            i2 |= 2;
        }
        if (i2 == 0 && Objects.equals(str3, "video/dolby-vision")) {
            Pair pairA3 = bvf.a(bseVar);
            Pair pairA4 = bvf.a(bseVar2);
            if (pairA3 == null || pairA4 == null || !((Integer) pairA3.first).equals(pairA4.first)) {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return new caz(str5, bseVar, bseVar2, true == bseVar.d(bseVar2) ? 3 : 2, 0);
        }
        bseVar3 = bseVar;
        bseVar4 = bseVar2;
        cazVar = new caz(this.b, bseVar3, bseVar4, 0, i2);
        return cazVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r3.equals("video/hevc") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r3.equals("video/av01") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.content.Context r18, defpackage.bse r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clo.d(android.content.Context, bse, boolean):boolean");
    }

    public final boolean e(bse bseVar) {
        return (Objects.equals(bseVar.q, "audio/flac") && bseVar.L == 22 && Build.VERSION.SDK_INT < 34 && this.b.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean f(Context context, bse bseVar) {
        int i;
        int i2;
        if (!h(bseVar) || !d(context, bseVar, true) || !e(bseVar)) {
            return false;
        }
        if (this.m) {
            int i3 = bseVar.w;
            if (i3 > 0 && (i2 = bseVar.x) > 0) {
                return j(i3, i2, bseVar.A);
            }
        } else {
            int i4 = bseVar.K;
            if (i4 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
                if (codecCapabilities == null) {
                    m("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m(a.bR(i4, "sampleRate.support, "));
                    return false;
                }
            }
            int i5 = bseVar.I;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.e;
                if (codecCapabilities2 == null) {
                    m("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m("channelCount.aCaps");
                    return false;
                }
                String str = this.b;
                String str2 = this.c;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    bvx.e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + ']');
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m(a.bR(i5, "channelCount.support, "));
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean g() {
        if (Build.VERSION.SDK_INT < 29 || !"video/x-vnd.on2.vp9".equals(this.c)) {
            return false;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : k()) {
            if (codecProfileLevel.profile == 16384) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(bse bseVar) {
        String str = this.c;
        return str.equals(bseVar.q) || str.equals(cma.b(bseVar));
    }

    public final boolean i(bse bseVar) {
        if (this.m) {
            return this.f;
        }
        bve bveVarC = bvf.c(bseVar);
        return bveVarC != null && bveVarC.b && bveVarC.b() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    public final boolean j(int i, int i2, double d) {
        String str;
        int iF;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            m("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (Build.VERSION.SDK_INT < 29 || (((bool = avd.a) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                iF = 0;
            } else {
                iF = avd.f(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
                if (iF == 1 && avd.a == null) {
                    if (Build.VERSION.SDK_INT < 37) {
                        int iE = avd.e(true);
                        if (Build.VERSION.SDK_INT < 35 ? avd.e(false) != 2 || iE == 1 : iE == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    avd.a = Boolean.valueOf(z);
                    if (avd.a.booleanValue()) {
                        iF = 0;
                    }
                }
            }
            if (iF != 2) {
                if (iF == 1) {
                    m("sizeAndRate.cover, " + i + 'x' + i2 + '@' + d);
                    return false;
                }
                if (!n(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.b;
                        int i3 = bst.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            bvx.g("AssumedSupport [" + ("sizeAndRate.rotated, " + i + 'x' + i2 + '@' + d) + "] [" + str + ", " + this.c + "] [" + bwp.d + ']');
                        } else {
                            bvx.g("AssumedSupport [" + ("sizeAndRate.rotated, " + i + 'x' + i2 + '@' + d) + "] [" + str + ", " + this.c + "] [" + bwp.d + ']');
                        }
                    }
                    m("sizeAndRate.support, " + i + 'x' + i2 + '@' + d);
                    return false;
                }
            }
        } else if (!n(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.b;
                int i4 = bst.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && n(videoCapabilities, i2, i, d)) {
                    bvx.g("AssumedSupport [" + ("sizeAndRate.rotated, " + i + 'x' + i2 + '@' + d) + "] [" + str + ", " + this.c + "] [" + bwp.d + ']');
                }
            }
            m("sizeAndRate.support, " + i + 'x' + i2 + '@' + d);
            return false;
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] k() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final String toString() {
        return this.b;
    }
}
