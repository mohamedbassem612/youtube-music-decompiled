package defpackage;

import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwz implements Runnable {
    public final afwd a;
    public final UUID b;
    public final String c;
    public final afwm d;
    public final AtomicReference e;
    public ListenableFuture f;
    private final mbc h;
    private final long i;
    private final Set j = new HashSet();
    int g = 0;
    private final boolean k = false;

    public afwz(afwd afwdVar, UUID uuid, String str, afwm afwmVar, afwy afwyVar, long j, boolean z, mbc mbcVar) {
        this.a = afwdVar;
        this.b = uuid;
        this.c = str;
        this.d = afwmVar;
        this.i = j;
        this.h = mbcVar;
        this.e = new AtomicReference(afwyVar);
    }

    public final long a() {
        return this.h.c() - this.i;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0195 A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x019a A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019e A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0 A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0228 A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0231 A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0239 A[Catch: all -> 0x0243, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x002d, B:9:0x003d, B:12:0x0049, B:14:0x0061, B:16:0x0073, B:17:0x0079, B:18:0x0090, B:20:0x009b, B:22:0x00ad, B:23:0x00b3, B:24:0x00ca, B:25:0x00ce, B:27:0x00d6, B:29:0x00dc, B:32:0x00f1, B:33:0x00f7, B:34:0x00fb, B:36:0x0101, B:38:0x010e, B:40:0x0119, B:42:0x0125, B:43:0x012e, B:45:0x0132, B:47:0x0138, B:51:0x0141, B:52:0x0151, B:53:0x0160, B:55:0x016a, B:57:0x017d, B:58:0x017f, B:64:0x0195, B:66:0x019a, B:68:0x019e, B:73:0x01b7, B:75:0x01c0, B:76:0x01c2, B:71:0x01a8, B:72:0x01af, B:77:0x01c5, B:79:0x01ca, B:80:0x0217, B:83:0x0228, B:84:0x022f, B:86:0x0231, B:87:0x0238, B:88:0x0239, B:89:0x0240), top: B:94:0x0003 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final afwo b() {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        UUID uuid;
        afwm afwmVar;
        afwo afwoVar;
        int length;
        int i5;
        afwy afwyVar;
        afus afusVarF;
        synchronized (this) {
            int i6 = 0;
            afwy[] afwyVarArrE = ((afwy) this.e.get()).e(0);
            aihf builder = this.d.toBuilder();
            int length2 = afwyVarArrE.length;
            SparseArray sparseArray = new SparseArray(length2);
            afwy afwyVar2 = afwyVarArrE[0];
            Map map = new HashMap();
            Map map2 = new HashMap();
            afwy afwyVar3 = null;
            int i7 = 0;
            while (true) {
                i = -1;
                if (i7 >= length2) {
                    break;
                }
                afwy afwyVar4 = afwyVarArrE[i7];
                afuy afuyVar = afwyVar4.g;
                afuv afuvVarJ = afuy.j(afvf.c, afuyVar);
                if (afuvVarJ.b()) {
                    ((afua) afuvVarJ.a()).a();
                    if (afwyVar4 != afwyVar2) {
                        afwyVar3 = afwyVar4;
                    }
                }
                sparseArray.append(afwyVar4.h, afuy.e(afuyVar, afwyVar4.b()));
                String str2 = afwyVar4.d;
                str2.isEmpty();
                if (!map.containsKey(str2)) {
                    builder.copyOnWrite();
                    afwm afwmVar2 = (afwm) builder.instance;
                    str2.getClass();
                    aiie aiieVar = afwmVar2.j;
                    if (!aiieVar.c()) {
                        afwmVar2.j = aihn.mutableCopy(aiieVar);
                    }
                    afwmVar2.j.add(str2);
                    map.put(str2, Integer.valueOf(((afwm) builder.instance).j.size() - 1));
                }
                String str3 = afwyVar4.e;
                str3.isEmpty();
                if (!map2.containsKey(str3)) {
                    builder.copyOnWrite();
                    afwm afwmVar3 = (afwm) builder.instance;
                    str3.getClass();
                    aiie aiieVar2 = afwmVar3.k;
                    if (!aiieVar2.c()) {
                        afwmVar3.k = aihn.mutableCopy(aiieVar2);
                    }
                    afwmVar3.k.add(str3);
                    map2.put(str3, Integer.valueOf(((afwm) builder.instance).k.size() - 1));
                }
                i7++;
            }
            Set set = this.j;
            if (set.isEmpty()) {
                i2 = 0;
            } else {
                int length3 = afwyVarArrE.length;
                int[] iArrA = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    afwy afwyVar5 = afwyVarArrE[i8];
                    iArrA[afwyVar5.h] = afwyVar5.a();
                    i8++;
                    i6 = i6;
                }
                i2 = i6;
                if (afwyVar3 != null) {
                    int i9 = afwyVar3.h;
                    iArrA[i9] = -1;
                    iArrA[i2] = i9;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    iArrA = ((afuz) it.next()).a();
                }
                if (iArrA != null) {
                    int length4 = afwyVarArrE.length;
                    BitSet bitSet = new BitSet(length4);
                    int i10 = i2;
                    int i11 = i10;
                    while (i10 < length4) {
                        afwy afwyVar6 = afwyVarArrE[i10];
                        int i12 = afwyVar6.h;
                        int i13 = length4;
                        if (iArrA[i12] == i) {
                            ahno.G(i11 ^ 1, "Can't have more than one root in the trace tree");
                            i11 = 1;
                        }
                        while (true) {
                            i12 = iArrA[i12];
                            if (i12 == i || bitSet.get(i12)) {
                                break;
                            }
                            ahno.K(i12 != afwyVar6.h ? 1 : i2, "Detected loop in the newly constructed graph! Span %s is in the loop", afwyVar6.c);
                            bitSet.set(i12);
                            sparseArray = sparseArray;
                            i = -1;
                        }
                        bitSet.set(afwyVar6.h);
                        i10++;
                        length4 = i13;
                        sparseArray = sparseArray;
                        i = -1;
                    }
                    sparseArray = sparseArray;
                    int length5 = afwyVarArrE.length;
                    int i14 = i2;
                    i3 = i14;
                    while (i14 < length5) {
                        afwy afwyVar7 = afwyVarArrE[i14];
                        builder.al(afwyVar7.f(iArrA[afwyVar7.h], map, map2));
                        if (!afwyVar7.d()) {
                            i3++;
                        }
                        i14++;
                    }
                    i6 = 1;
                } else {
                    i6 = i2;
                }
                if (i6 == 0) {
                    length = afwyVarArrE.length;
                    for (i5 = i2; i5 < length; i5++) {
                        afwyVar = afwyVarArrE[i5];
                        if (afwyVar == afwyVar3) {
                            afusVarF = afwyVar.f(-1, map, map2);
                        } else if (afwyVar3 == null && afwyVar == afwyVar2) {
                            afusVarF = afwyVar.f(afwyVar3.h, map, map2);
                        } else {
                            afusVarF = afwyVar.f(afwyVar.a(), map, map2);
                        }
                        builder.al(afusVarF);
                        if (!afwyVar.d()) {
                            i3++;
                        }
                    }
                }
                i4 = i3;
                if (this.g != 0) {
                    aihf aihfVarCreateBuilder = aftf.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = afte.a.createBuilder();
                    int i15 = this.g;
                    aihfVarCreateBuilder2.copyOnWrite();
                    afte afteVar = (afte) aihfVarCreateBuilder2.instance;
                    afteVar.b |= 1;
                    afteVar.c = i15;
                    afte afteVar2 = (afte) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    aftf aftfVar = (aftf) aihfVarCreateBuilder.instance;
                    afteVar2.getClass();
                    aftfVar.c = afteVar2;
                    aftfVar.b |= 1;
                    aftf aftfVar2 = (aftf) aihfVarCreateBuilder.build();
                    builder.copyOnWrite();
                    afwm afwmVar4 = (afwm) builder.instance;
                    aftfVar2.getClass();
                    afwmVar4.h = aftfVar2;
                    afwmVar4.b |= 32;
                }
                str = afwyVarArrE[i2].c;
                uuid = this.b;
                afwmVar = (afwm) builder.build();
                if (str != null) {
                    throw new NullPointerException("Null name");
                }
                if (afwmVar != null) {
                    throw new NullPointerException("Null record");
                }
                afwoVar = new afwo(str, uuid, afwmVar, sparseArray, i4);
            }
            i3 = i6;
            if (i6 == 0) {
                length = afwyVarArrE.length;
                while (i5 < length) {
                    afwyVar = afwyVarArrE[i5];
                    if (afwyVar == afwyVar3) {
                        afusVarF = afwyVar.f(-1, map, map2);
                    } else if (afwyVar3 == null) {
                        afusVarF = afwyVar.f(afwyVar.a(), map, map2);
                    } else {
                        afusVarF = afwyVar.f(afwyVar.a(), map, map2);
                    }
                    builder.al(afusVarF);
                    if (!afwyVar.d()) {
                        i3++;
                    }
                }
            }
            i4 = i3;
            if (this.g != 0) {
                aihf aihfVarCreateBuilder3 = aftf.a.createBuilder();
                aihf aihfVarCreateBuilder4 = afte.a.createBuilder();
                int i16 = this.g;
                aihfVarCreateBuilder4.copyOnWrite();
                afte afteVar3 = (afte) aihfVarCreateBuilder4.instance;
                afteVar3.b |= 1;
                afteVar3.c = i16;
                afte afteVar4 = (afte) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder3.copyOnWrite();
                aftf aftfVar3 = (aftf) aihfVarCreateBuilder3.instance;
                afteVar4.getClass();
                aftfVar3.c = afteVar4;
                aftfVar3.b |= 1;
                aftf aftfVar4 = (aftf) aihfVarCreateBuilder3.build();
                builder.copyOnWrite();
                afwm afwmVar5 = (afwm) builder.instance;
                aftfVar4.getClass();
                afwmVar5.h = aftfVar4;
                afwmVar5.b |= 32;
            }
            str = afwyVarArrE[i2].c;
            uuid = this.b;
            afwmVar = (afwm) builder.build();
            if (str != null) {
                throw new NullPointerException("Null name");
            }
            if (afwmVar != null) {
                throw new NullPointerException("Null record");
            }
            afwoVar = new afwo(str, uuid, afwmVar, sparseArray, i4);
        }
        return afwoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        ListenableFuture listenableFuture = this.f;
        afwo afwoVarB = b();
        boolean zIsCancelled = listenableFuture.isCancelled();
        afwd afwdVar = this.a;
        String str = "TraceManagerImpl.java";
        try {
            if (zIsCancelled) {
                afwm afwmVar = afwoVarB.c;
                aftf aftfVar = afwmVar.h;
                if (aftfVar == null) {
                    aftfVar = aftf.a;
                }
                long jB = afwdVar.b.b() - afwmVar.g;
                aihf builder = afwmVar.toBuilder();
                aihf builder2 = aftfVar.toBuilder();
                aihf aihfVarCreateBuilder = aftd.a.createBuilder();
                int i = afwoVarB.e;
                aihfVarCreateBuilder.copyOnWrite();
                aftd aftdVar = (aftd) aihfVarCreateBuilder.instance;
                aftdVar.b |= 2;
                aftdVar.d = i;
                aihfVarCreateBuilder.copyOnWrite();
                aftd aftdVar2 = (aftd) aihfVarCreateBuilder.instance;
                aftdVar2.b |= 1;
                aftdVar2.c = jB;
                aftd aftdVar3 = (aftd) aihfVarCreateBuilder.build();
                builder2.copyOnWrite();
                aftf aftfVar2 = (aftf) builder2.instance;
                aftdVar3.getClass();
                aftfVar2.d = aftdVar3;
                aftfVar2.b |= 2;
                aftf aftfVar3 = (aftf) builder2.build();
                builder.copyOnWrite();
                afwm afwmVar2 = (afwm) builder.instance;
                aftfVar3.getClass();
                afwmVar2.h = aftfVar3;
                afwmVar2.b |= 32;
                afwm afwmVar3 = (afwm) builder.build();
                int size = afwmVar3.e.size() - 1;
                ArrayList arrayList = new ArrayList();
                for (int i2 = -1; size != i2; i2 = -1) {
                    afus afusVar = (afus) afwmVar3.e.get(size);
                    String str2 = str;
                    arrayList.add(new StackTraceElement("tk_trace", String.valueOf(afusVar.c).concat((afusVar.b & 32) == 0 ? " (Timed Out)" : ""), "Started After", (int) (afusVar.f / 1000)));
                    size = ((afus) afwmVar3.e.get(size)).e;
                    str = str2;
                }
                String str3 = str;
                z = false;
                try {
                    afwq afwqVar = new afwq(null, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    afwq.f(afwmVar3, Collections.singletonMap(0, afwqVar), 0, new HashMap());
                    agrc agrcVar = (agrc) ((agrc) ((agrc) afwd.a.b()).j(afwqVar)).k("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 372, str3);
                    String str4 = afwoVarB.a;
                    agrcVar.E("Trace %s timed out after %d ms. Complete trace: %s", str4, Long.valueOf(jB), afwmVar3);
                    afwdVar.a(str4);
                } catch (Throwable th) {
                    th = th;
                    ahno.O(((afwz) afwdVar.d.remove(afwoVarB.b)) != null ? true : z);
                    throw th;
                }
            } else {
                try {
                    ahng.v(listenableFuture);
                    long j = afwoVarB.c.g;
                    while (true) {
                        AtomicLong atomicLong = afwdVar.e;
                        long j2 = atomicLong.get();
                        if (j <= j2) {
                            break;
                        }
                        if (atomicLong.compareAndSet(j2, 300000 + j)) {
                            long j3 = j - ((long) afwdVar.g);
                            for (afwz afwzVar : afwdVar.d.values()) {
                                if (afwzVar.d.g < j3) {
                                    ahew ahewVarSchedule = ((ahey) afwdVar.c.io()).schedule(new aeia(10), 10L, TimeUnit.SECONDS);
                                    afwzVar.getClass();
                                    ahewVarSchedule.addListener(new afjc(afwzVar, 4), MoreExecutors.directExecutor());
                                }
                            }
                            break;
                        }
                    }
                    afwdVar.a(afwoVarB.a);
                } catch (ExecutionException e) {
                    ((agrc) ((agrc) ((agrc) afwd.a.b()).j(e.getCause())).k("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 323, "TraceManagerImpl.java")).w("Trace %s failed collection", afwoVarB.a);
                }
                z = false;
            }
            ahno.O(((afwz) afwdVar.d.remove(afwoVarB.b)) != null ? true : z);
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public final String toString() {
        return "UnfinishedTrace@" + Integer.toHexString(System.identityHashCode(this)) + '[' + b().a + ']';
    }
}
