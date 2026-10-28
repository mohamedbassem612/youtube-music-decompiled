package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yos {
    public final yoq b;
    private final zkk c;
    private final zjr d;
    private final zkd e;
    private final tfq f;
    private static final asx g = new asx(6);
    public static final agkz a = agpr.a;

    public yos(yoq yoqVar, zkk zkkVar, tfq tfqVar, zjr zjrVar, zkd zkdVar) {
        zkf.d(yoqVar);
        this.b = yoqVar;
        zkf.d(zkkVar);
        this.c = zkkVar;
        zkf.d(tfqVar);
        this.f = tfqVar;
        zkf.d(zjrVar);
        this.d = zjrVar;
        this.e = zkdVar;
    }

    public static boolean b(long j, int i, yog yogVar, wiu wiuVar, int i2) {
        return yogVar.e() || !wiuVar.U().contains(Integer.valueOf(i2)) || j + ((long) i) <= wiuVar.z();
    }

    public static boolean c(int i, int i2, int i3, int i4, float f) {
        if (i3 <= 0 || i * f <= i3) {
            return i4 <= 0 || ((float) i2) * f <= ((float) i4);
        }
        return false;
    }

    public static wgo[] d(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            String strV = wgsVar.v();
            String strU = wgsVar.u();
            boolean zJ = wgsVar.J();
            if (!TextUtils.isEmpty(strV) && !TextUtils.isEmpty(strU) && !map.containsKey(strV)) {
                map.put(strV, new wgo(strV, strU, zJ, false));
            }
        }
        wgo[] wgoVarArr = (wgo[]) map.values().toArray(new wgo[0]);
        Arrays.sort(wgoVarArr);
        return wgoVarArr;
    }

    public static wgs e(List list, yog yogVar, tfq tfqVar, wiu wiuVar, zjr zjrVar, int i, int i2, int i3, float f, float f2, int i4, arfb arfbVar) {
        int length;
        int i5;
        if (list.isEmpty()) {
            return null;
        }
        float f3 = arfbVar != arfb.VIDEO_QUALITY_SETTING_HIGHER_QUALITY ? f : f2;
        wgs[] wgsVarArr = (wgs[]) list.toArray(new wgs[0]);
        Arrays.sort(wgsVarArr, g);
        int iMin = yogVar.b;
        if (arfb.VIDEO_QUALITY_SETTING_DATA_SAVER.equals(arfbVar)) {
            iMin = Math.min(iMin, zjrVar.f());
        }
        int length2 = wgsVarArr.length - 1;
        int i6 = 0;
        while (true) {
            length = wgsVarArr.length;
            if (i6 >= length) {
                break;
            }
            if (wgsVarArr[i6].d() <= iMin) {
                length2 = i6;
                break;
            }
            i6++;
        }
        int i7 = yogVar.c;
        while (true) {
            length--;
            if (length < 0) {
                i5 = 0;
                break;
            }
            if (wgsVarArr[length].d() >= i7) {
                i5 = length;
                break;
            }
        }
        if (length2 >= i5) {
            return wgsVarArr[length2];
        }
        for (int i8 = length2; i8 <= i5; i8++) {
            wgs wgsVar = wgsVarArr[i8];
            if (c(wgsVar.i(), wgsVar.d(), i2, i3, f3) && b(wgsVar.g, i, yogVar, wiuVar, i4) && !f(wgsVar.d(), tfqVar, zjrVar.eQ())) {
                return wgsVar;
            }
        }
        return wgsVarArr[i5];
    }

    public static boolean f(int i, tfq tfqVar, int i2) {
        return i > i2 && tfqVar.g();
    }

    private final List g(List list, yoc yocVar) {
        zjr zjrVar = this.d;
        return yocVar.h.b(list, zjrVar.cQ(), zjrVar.dc());
    }

    private static List h(List list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            if (wgsVar.O()) {
                arrayList.add(wgsVar);
            }
            if (!TextUtils.isEmpty(str) && str.equals(wgsVar.v())) {
                arrayList2.add(wgsVar);
            }
        }
        if (arrayList2.isEmpty()) {
            return !arrayList.isEmpty() ? arrayList : list;
        }
        return arrayList2;
    }

    @Deprecated
    private static List i(Collection collection, Set set, String str) {
        if (set == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        if (!set.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                wgs wgsVar = (wgs) it.next();
                if (set.contains(Integer.valueOf(wgsVar.e()))) {
                    arrayList.add(wgsVar);
                }
            }
            if (arrayList.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    wgs wgsVar2 = (wgs) it2.next();
                    if (str.equals(wgsVar2.B())) {
                        arrayList.add(wgsVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void j(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            if (wgsVar.V()) {
                hashSet.add(Integer.valueOf(wgsVar.f()));
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        int iIntValue = ((Integer) Collections.min(hashSet)).intValue();
        while (it2.hasNext()) {
            wgs wgsVar2 = (wgs) it2.next();
            if (!wgsVar2.V() && wgsVar2.f() >= iIntValue) {
                it2.remove();
            }
        }
    }

    private final void k(List list, boolean z, int i) {
        boolean z2;
        if (!this.d.fi() || z) {
            return;
        }
        boolean zH = zic.h(i, 64);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (((wgs) it.next()).P()) {
                z2 = true;
                break;
            }
        }
        zhq zhqVar = zhq.ABR;
        j$.util.Collection.EL.removeIf(list, new yok(z2 && zH, 2));
    }

    private final boolean l(String str) {
        return str != null && str.equals(this.d.eW());
    }

    private final wiw[] m(List list, Collection collection, String str, yog yogVar) {
        zjr zjrVar = this.d;
        if (zjrVar.eb() && !l(str)) {
            ArrayList arrayList = new ArrayList(list);
            j(arrayList);
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list);
        if (zjrVar.cU() && collection != null && !collection.isEmpty()) {
            arrayList2.addAll(collection);
        }
        zjr.fJ();
        if (zjrVar.cQ()) {
            HashMap map = new HashMap();
            for (wgs wgsVar : n(arrayList2, yogVar)) {
                String strA = wgsVar.A();
                if (map.containsKey(strA)) {
                    yor yorVar = (yor) map.get(strA);
                    yorVar.a.add(Integer.valueOf(wgsVar.e()));
                    if (wgsVar.W()) {
                        yorVar.b = wgsVar;
                    }
                    if (wgsVar.q().compareTo(yorVar.c) > 0) {
                        yorVar.c = wgsVar.q();
                    }
                } else {
                    map.put(strA, new yor(wgsVar));
                }
            }
            return (wiw[]) j$.util.Collection.EL.stream(map.values()).sorted().map(new yom(3)).toArray(new hhv(11));
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (wgs wgsVar2 : n(arrayList2, yogVar)) {
            String strA2 = wgsVar2.A();
            if (!map2.containsKey(strA2) || wgsVar2.W()) {
                map2.put(strA2, wgsVar2);
            }
            if (!map3.containsKey(strA2) || wgsVar2.q().compareTo((aipc) map3.get(strA2)) > 0) {
                map3.put(strA2, wgsVar2.q());
            }
        }
        wiw[] wiwVarArr = new wiw[map2.size()];
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            int i2 = i + 1;
            wgs wgsVar3 = (wgs) entry.getValue();
            wiwVarArr[i] = new wiw(((Set) wir.a.io()).contains(Integer.valueOf(wgsVar3.e())) ? wgp.b(wgsVar3.i(), wgsVar3.d()) : wgsVar3.f(), (aipc) map3.get(entry.getKey()), wgsVar3.A(), wgsVar3.W(), agpr.a);
            i = i2;
        }
        Arrays.sort(wiwVarArr, (zjrVar.R().g || zjrVar.u.m()) ? Collections.reverseOrder() : null);
        return wiwVarArr;
    }

    private static final List n(List list, yog yogVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            int iF = wgsVar.f();
            String strA = wgsVar.A();
            if (iF != -1 && !TextUtils.isEmpty(strA) && (yogVar == null || yogVar.a(iF) == 0)) {
                arrayList.add(wgsVar);
            }
        }
        return arrayList;
    }

    private static void o(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iF = ((wgs) it.next()).f();
            if (iF == -1 || iF > i) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0230  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a0 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b3 A[Catch: Exception -> 0x036a, TRY_LEAVE, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d6 A[Catch: Exception -> 0x0368, TryCatch #1 {Exception -> 0x0368, blocks: (B:118:0x02c7, B:120:0x02d6, B:145:0x032c, B:150:0x033b, B:153:0x0346, B:155:0x034f, B:157:0x0353, B:159:0x0357, B:161:0x035b, B:163:0x035f, B:154:0x034b, B:151:0x0340, B:123:0x02de, B:125:0x02ea, B:127:0x02f0, B:129:0x02fa, B:132:0x0308, B:134:0x030c, B:136:0x0310, B:138:0x031c, B:140:0x0320, B:142:0x0324, B:144:0x0328), top: B:319:0x02c7 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x02ea A[Catch: Exception -> 0x0368, TryCatch #1 {Exception -> 0x0368, blocks: (B:118:0x02c7, B:120:0x02d6, B:145:0x032c, B:150:0x033b, B:153:0x0346, B:155:0x034f, B:157:0x0353, B:159:0x0357, B:161:0x035b, B:163:0x035f, B:154:0x034b, B:151:0x0340, B:123:0x02de, B:125:0x02ea, B:127:0x02f0, B:129:0x02fa, B:132:0x0308, B:134:0x030c, B:136:0x0310, B:138:0x031c, B:140:0x0320, B:142:0x0324, B:144:0x0328), top: B:319:0x02c7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0310 A[Catch: Exception -> 0x0368, TryCatch #1 {Exception -> 0x0368, blocks: (B:118:0x02c7, B:120:0x02d6, B:145:0x032c, B:150:0x033b, B:153:0x0346, B:155:0x034f, B:157:0x0353, B:159:0x0357, B:161:0x035b, B:163:0x035f, B:154:0x034b, B:151:0x0340, B:123:0x02de, B:125:0x02ea, B:127:0x02f0, B:129:0x02fa, B:132:0x0308, B:134:0x030c, B:136:0x0310, B:138:0x031c, B:140:0x0320, B:142:0x0324, B:144:0x0328), top: B:319:0x02c7 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x031c A[Catch: Exception -> 0x0368, TryCatch #1 {Exception -> 0x0368, blocks: (B:118:0x02c7, B:120:0x02d6, B:145:0x032c, B:150:0x033b, B:153:0x0346, B:155:0x034f, B:157:0x0353, B:159:0x0357, B:161:0x035b, B:163:0x035f, B:154:0x034b, B:151:0x0340, B:123:0x02de, B:125:0x02ea, B:127:0x02f0, B:129:0x02fa, B:132:0x0308, B:134:0x030c, B:136:0x0310, B:138:0x031c, B:140:0x0320, B:142:0x0324, B:144:0x0328), top: B:319:0x02c7 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0328 A[Catch: Exception -> 0x0368, TryCatch #1 {Exception -> 0x0368, blocks: (B:118:0x02c7, B:120:0x02d6, B:145:0x032c, B:150:0x033b, B:153:0x0346, B:155:0x034f, B:157:0x0353, B:159:0x0357, B:161:0x035b, B:163:0x035f, B:154:0x034b, B:151:0x0340, B:123:0x02de, B:125:0x02ea, B:127:0x02f0, B:129:0x02fa, B:132:0x0308, B:134:0x030c, B:136:0x0310, B:138:0x031c, B:140:0x0320, B:142:0x0324, B:144:0x0328), top: B:319:0x02c7 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0387 A[PHI: r6
      0x0387: PHI (r6v2 java.util.Collection) = 
      (r6v1 java.util.Collection)
      (r6v1 java.util.Collection)
      (r6v1 java.util.Collection)
      (r6v1 java.util.Collection)
      (r6v9 java.util.Collection)
     binds: [B:79:0x01c3, B:80:0x01c5, B:82:0x01cb, B:112:0x029e, B:338:0x0387] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x0390  */
    /* JADX WARN: Code duplicated, block: B:175:0x039d  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ee A[EDGE_INSN: B:195:0x03ee->B:196:0x03ef BREAK  A[LOOP:6: B:182:0x03bb->B:346:?]] */
    /* JADX WARN: Code duplicated, block: B:198:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x043f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0449  */
    /* JADX WARN: Code duplicated, block: B:226:0x0465  */
    /* JADX WARN: Code duplicated, block: B:227:0x046a  */
    /* JADX WARN: Code duplicated, block: B:229:0x046e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0478  */
    /* JADX WARN: Code duplicated, block: B:233:0x049c  */
    /* JADX WARN: Code duplicated, block: B:234:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:238:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:241:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:242:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:248:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:251:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:257:0x0511  */
    /* JADX WARN: Code duplicated, block: B:260:0x054a  */
    /* JADX WARN: Code duplicated, block: B:262:0x0550  */
    /* JADX WARN: Code duplicated, block: B:269:0x0569  */
    /* JADX WARN: Code duplicated, block: B:271:0x056f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0572  */
    /* JADX WARN: Code duplicated, block: B:276:0x0578  */
    /* JADX WARN: Code duplicated, block: B:280:0x058c  */
    /* JADX WARN: Code duplicated, block: B:282:0x0599  */
    /* JADX WARN: Code duplicated, block: B:285:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:290:0x05d3 A[LOOP:0: B:286:0x05b3->B:290:0x05d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:294:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:297:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:299:0x0601  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:303:0x060c  */
    /* JADX WARN: Code duplicated, block: B:305:0x061d A[LOOP:1: B:304:0x061b->B:305:0x061d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x0633  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0646  */
    /* JADX WARN: Code duplicated, block: B:312:0x0658 A[LOOP:2: B:309:0x0644->B:312:0x0658, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:321:0x05d5 A[EDGE_INSN: B:321:0x05d5->B:291:0x05d5 BREAK  A[LOOP:0: B:286:0x05b3->B:290:0x05d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x065a A[EDGE_INSN: B:325:0x065a->B:313:0x065a BREAK  A[LOOP:2: B:309:0x0644->B:312:0x0658], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:? A[LOOP:6: B:182:0x03bb->B:346:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x03d2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e5 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0204 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:96:0x021e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0221 A[Catch: Exception -> 0x036a, TryCatch #0 {Exception -> 0x036a, blocks: (B:83:0x01cd, B:85:0x01e5, B:89:0x01f8, B:90:0x01fe, B:92:0x0204, B:94:0x0218, B:103:0x0232, B:105:0x0251, B:107:0x0255, B:109:0x025b, B:113:0x02a0, B:114:0x02ad, B:116:0x02b3, B:97:0x0221, B:100:0x022a, B:86:0x01e8, B:88:0x01f6), top: B:317:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0227  */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0575, code lost:
    
        if (r2 < 2147483647(0x7fffffff, float:NaN)) goto L277;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yod a(defpackage.wiu r40, java.util.Collection r41, java.util.Collection r42, defpackage.yoc r43, java.util.Set r44, java.util.Set r45, int r46, int r47, java.lang.Integer r48, java.lang.String r49, defpackage.ywn r50, defpackage.agkz r51, boolean r52) throws defpackage.yof {
        /*
            Method dump skipped, instruction units count: 1685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yos.a(wiu, java.util.Collection, java.util.Collection, yoc, java.util.Set, java.util.Set, int, int, java.lang.Integer, java.lang.String, ywn, agkz, boolean):yod");
    }
}
