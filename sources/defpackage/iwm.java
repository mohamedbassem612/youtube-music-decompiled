package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwm {
    private final vxz h;
    private final vxz i;
    private static final agrf g = agrf.h("com/google/android/apps/youtube/music/ui/colorsampling/LightsourcePaletteExtractor");
    public static final auiu a = new auiu(-10066330, -10921639, -11776948, -12632257, -1, -1710619, -1, -5592406, -5592406, -12671233);
    public static final auiu b = new auiu(-14145496, -14474461, -14869219, -15527149, -1, -3355444, -1, -7303024, -10461088, -12671233);
    public static final auiu c = new auiu(-15527149, -14474461, -14869219, -16777216, -1, -3355444, -1, -7303024, -10461088, -12671233);
    public static final auiu d = new auiu(-15527149, -14474461, -14606047, -16777216, -1, -3355444, -1, -7303024, -10461088, -12671233);
    public static final auiu e = new auiu(-16579837, -15790321, -15198184, -14606047, -1, -3355444, -1, -7303024, -10461088, -12671233);
    public static final auiu f = new auiu(-14474461, -14606047, -15790321, -16579837, -1, -3355444, -1, -7303024, -10461088, -12671233);

    public iwm(vxz vxzVar, vxz vxzVar2) {
        this.h = vxzVar;
        this.i = vxzVar2;
    }

    public final iwl a(Bitmap bitmap) {
        taq.c();
        Optional optionalB = b(bitmap);
        return optionalB.isPresent() ? new iwl(atqo.x((ahwp) optionalB.get()), atqo.w((ahwp) optionalB.get())) : new iwl(a, b);
    }

    public final Optional b(Bitmap bitmap) {
        List listQ;
        double d2;
        ahws ahwsVar;
        ahwq ahwqVar;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapCopy;
        if (bitmap == null || bitmap.isRecycled()) {
            ((agrc) ((agrc) g.c()).k("com/google/android/apps/youtube/music/ui/colorsampling/LightsourcePaletteExtractor", "getPixelsFromImage", 214, "LightsourcePaletteExtractor.java")).t("Bitmap is recycled, failed to extract color scheme.");
            listQ = agpi.a;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int iMin = Math.min(width, height);
            if (iMin > 100) {
                float f2 = 100.0f / iMin;
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, Math.round(width * f2)), Math.max(1, Math.round(height * f2)), true);
            } else {
                bitmapCreateScaledBitmap = bitmap;
            }
            if (this.h.l(48, 45412893L, false) && bitmapCreateScaledBitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapCreateScaledBitmap.copy(Bitmap.Config.ARGB_8888, false);
                if (bitmapCopy == null) {
                    ((agrc) ((agrc) g.c()).k("com/google/android/apps/youtube/music/ui/colorsampling/LightsourcePaletteExtractor", "getPixelsFromImage", 240, "LightsourcePaletteExtractor.java")).t("Failed to copy hardware bitmap to software bitmap.");
                    listQ = agpi.a;
                }
            } else {
                bitmapCopy = bitmapCreateScaledBitmap;
            }
            int[] iArr = new int[bitmapCopy.getWidth() * bitmapCopy.getHeight()];
            bitmapCopy.getPixels(iArr, 0, bitmapCopy.getWidth(), 0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
            if (this.i.l(51, 45836067L, false)) {
                if (bitmapCopy != bitmap && bitmapCopy != bitmapCreateScaledBitmap) {
                    bitmapCopy.recycle();
                }
                if (bitmapCreateScaledBitmap != bitmap) {
                    bitmapCreateScaledBitmap.recycle();
                }
            }
            listQ = ahng.Q(iArr);
        }
        if (listQ.isEmpty()) {
            return Optional.empty();
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = listQ.iterator();
        while (true) {
            d2 = 360.0d;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Integer) it.next()).intValue();
            ahwp ahwpVarA = ahwo.a(new ahws(((double) ((iIntValue >> 16) & 255)) / 255.0d, ((double) ((iIntValue >> 8) & 255)) / 255.0d, ((double) (iIntValue & 255)) / 255.0d));
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    agjq agjqVar = new agjq();
                    agjqVar.f(ahwpVarA, 1);
                    map.put(ahwpVarA, agjqVar);
                    arrayList.add(ahwpVarA);
                    break;
                }
                ahwp ahwpVar = (ahwp) arrayList.get(i);
                double dAbs = Math.abs(ahwpVarA.a - ahwpVar.a);
                i++;
                if (Math.min(360.0d - dAbs, dAbs) < 26.0d && Math.abs(ahwpVarA.b - ahwpVar.b) < 0.3d && Math.abs(ahwpVarA.c - ahwpVar.c) < 0.3d) {
                    ((agow) map.get(ahwpVar)).add(ahwpVarA);
                    break;
                }
            }
        }
        Collections.sort(arrayList, new fui(map, 13, null));
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            ahwp ahwpVar2 = (ahwp) arrayList.get(i2);
            agow<ahwp> agowVar = (agow) map.get(ahwpVar2);
            int i3 = i2;
            double d3 = ahwpVar2.a;
            boolean z = d3 < 26.0d || d3 > 334.0d;
            double d4 = 0.0d;
            double d5 = 0.0d;
            double d6 = 0.0d;
            for (ahwp ahwpVar3 : agowVar) {
                double d7 = d2;
                if (z && ahwpVar3.a < 52.0d) {
                    d4 += d7;
                }
                d4 += ahwpVar3.a;
                d5 += ahwpVar3.b;
                d6 += ahwpVar3.c;
                d2 = d7;
            }
            arrayList2.add(ahwo.b(new ahwp((d4 / ((double) agowVar.size())) % d2, d5 / ((double) agowVar.size()), d6 / ((double) agowVar.size()))));
            i2 = i3 + 1;
        }
        double d8 = d2;
        agke<ahws> agkeVarN = agke.n(arrayList2);
        ahws ahwsVar2 = null;
        for (ahws ahwsVar3 : agkeVarN) {
            ahwp ahwpVarA2 = ahwo.a(ahwsVar3);
            double d9 = ahwpVarA2.b;
            if ((d9 > 0.3d && ahwpVarA2.c > 0.8d) || (d9 > 0.6d && ahwpVarA2.c > 0.5d)) {
                double d10 = ahwpVarA2.a;
                if (d10 < 14.0d || d10 > 37.0d || (d9 >= 0.6d && ahwpVarA2.c >= 0.75d)) {
                    ahwsVar2 = ahwsVar3;
                    break;
                }
            }
            if (ahwsVar2 == null) {
                double dC = ahwsVar3.c();
                double dB = ahwsVar3.b();
                double dA = ahwsVar3.a();
                double dMax = Math.max(dC, Math.max(dB, dA));
                ahwsVar = ahwsVar2;
                double dMin = Math.min(dC, Math.min(dB, dA));
                double d11 = dMin + dMax;
                double d12 = d11 / 2.0d;
                if (Math.abs(dMin - dMax) < 1.0E-10d) {
                    ahwqVar = new ahwq(0.0d, 0.0d, Math.min(Math.max(d12, 0.0d), 1.0d));
                } else {
                    double d13 = dMax - dMin;
                    double d14 = d12 < 0.5d ? d13 / d11 : d13 / ((2.0d - dMax) - dMin);
                    double d15 = (Math.abs(dC - dMax) < 1.0E-10d ? (dB - dA) / d13 : Math.abs(dB - dMax) < 1.0E-10d ? ((dA - dC) / d13) + 2.0d : ((dC - dB) / d13) + 4.0d) * 60.0d;
                    ahwqVar = new ahwq(d15 < 0.0d ? d15 + d8 : d15 % d8, Math.min(Math.max(d14, 0.0d), 1.0d), Math.min(Math.max(d12, 0.0d), 1.0d));
                }
                if (ahwqVar.b() <= 0.88d && ((ahwqVar.c() >= 0.18d || ahwqVar.b() <= 0.69d) && ahwqVar.b() >= 0.09d && ((ahwqVar.c() >= 0.12d || ahwqVar.b() >= 0.24d) && (ahwqVar.a() < 14.0d || ahwqVar.a() >= 66.0d || (ahwqVar.b() > 0.11d && atqo.y(ahwsVar3, ahwo.a) <= 3.1d))))) {
                    ahwsVar2 = ahwsVar3;
                }
            } else {
                ahwsVar = ahwsVar2;
            }
            ahwsVar2 = ahwsVar;
        }
        Optional optionalJ = agev.h(ahwsVar2).j();
        if (true == optionalJ.isPresent()) {
            optionalJ = Optional.ofNullable(ahwo.a((ahws) optionalJ.get()));
        }
        return Optional.of((ahwp) (true != optionalJ.isPresent() ? ahwo.a((ahws) ((agke) new hly(agkeVarN, 5).a).get(0)) : optionalJ.get()));
    }
}
