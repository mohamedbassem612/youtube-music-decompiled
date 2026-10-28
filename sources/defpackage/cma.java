package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cma {
    public static final /* synthetic */ int a = 0;
    private static final HashMap b = new HashMap();

    public static MediaCodecInfo.CodecProfileLevel a(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String b(bse bseVar) {
        bve bveVarC;
        String str = bseVar.q;
        if ("audio/eac3-joc".equals(str)) {
            if (!Objects.equals(Build.MANUFACTURER, "Google")) {
                return "audio/eac3";
            }
        } else {
            if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
                return "audio/vnd.dts";
            }
            if ("video/dolby-vision".equals(str) && (bveVarC = bvf.c(bseVar)) != null && bveVarC.b) {
                int iB = bveVarC.b();
                if (iB != 16 && iB != 256) {
                    if (iB == 512) {
                        return "video/avc";
                    }
                    if (iB == 1024) {
                        bru bruVar = bseVar.G;
                        if (bruVar == null || bruVar.d != 6 || bruVar.c != 1) {
                            return "video/av01";
                        }
                    }
                }
                return "video/hevc";
            }
            if ("video/mv-hevc".equals(str)) {
                return "video/hevc";
            }
        }
        return null;
    }

    public static List c(clu cluVar, bse bseVar, boolean z, boolean z2) {
        String strB = b(bseVar);
        return strB == null ? agpi.a : cluVar.a(strB, z, z2);
    }

    public static List d(Context context, clu cluVar, bse bseVar, boolean z, boolean z2) {
        String strB = b(bseVar);
        return strB == null ? agpi.a : l(context, cluVar.a(strB, z, z2), bseVar);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$1(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static synchronized java.util.List e(java.lang.String r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cma.e(java.lang.String, boolean, boolean):java.util.List");
    }

    public static List f(clu cluVar, bse bseVar, boolean z, boolean z2) {
        List listA = cluVar.a(bseVar.q, z, z2);
        List listC = c(cluVar, bseVar, z, z2);
        agjz agjzVar = new agjz(4);
        agjzVar.j(listA);
        agjzVar.j(listC);
        return agjzVar.g();
    }

    public static List g(Context context, clu cluVar, bse bseVar, boolean z, boolean z2) {
        List listA = cluVar.a(bseVar.q, z, z2);
        agjz agjzVar = new agjz(4);
        agjzVar.j(l(context, listA, bseVar));
        agjzVar.j(d(context, cluVar, bseVar, z, z2));
        agke agkeVarG = agjzVar.g();
        return agkeVarG.isEmpty() ? f(cluVar, bseVar, z, z2) : agkeVarG;
    }

    public static List h(final Context context, List list, final bse bseVar) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new clz() { // from class: clv
            @Override // defpackage.clz
            public final int a(Object obj) {
                clo cloVar = (clo) obj;
                int i = cma.a;
                bse bseVar2 = bseVar;
                return (cloVar.h(bseVar2) && cloVar.d(context, bseVar2, false) && cloVar.e(bseVar2)) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static void i(List list, clz clzVar) {
        j$.util.List.EL.sort(list, new fui(clzVar, 1, null));
    }

    public static clo j() {
        List listE = e("audio/raw", false, false);
        if (listE.isEmpty()) {
            return null;
        }
        return (clo) listE.get(0);
    }

    public static void k(String str) {
        try {
            e(str, false, false);
        } catch (cly e) {
            bvx.d("MediaCodecUtil", "Codec warming failed", e);
        }
    }

    private static agke l(Context context, List list, bse bseVar) {
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            clo cloVar = (clo) it.next();
            if (cloVar.f(context, bseVar)) {
                agjzVar.h(cloVar);
            }
        }
        return agjzVar.g();
    }

    private static boolean m(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!bsy.i(str)) {
            String strAe = ahno.ae(mediaCodecInfo.getName());
            if (strAe.startsWith("arc.") || (!strAe.startsWith("omx.google.") && !strAe.startsWith("omx.ffmpeg.") && ((!strAe.startsWith("omx.sec.") || !strAe.contains(".sw.")) && !strAe.equals("omx.qcom.video.decoder.hevcswvdec") && !strAe.startsWith("c2.android.") && !strAe.startsWith("c2.google.") && (strAe.startsWith("omx.") || strAe.startsWith("c2."))))) {
                return false;
            }
        }
        return true;
    }
}
