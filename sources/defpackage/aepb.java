package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aepb {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;

    public aepb() {
        new HashSet();
        new ArrayList();
        new HashMap();
        this.a = new HashSet();
        this.b = Collections.newSetFromMap(new WeakHashMap());
        this.c = Collections.newSetFromMap(new WeakHashMap());
        new HashMap();
        new ArrayList();
        this.e = "";
    }

    public static void h(Object obj, long j, Map map) {
        j$.util.Map.EL.merge(map, obj, Long.valueOf(j), new itl(1));
    }

    public static vmq i(vmp vmpVar, vmp vmpVar2) {
        return new vmq(vmpVar, Optional.of(vmpVar2), Math.max(vmpVar.a(), vmpVar2.a()));
    }

    public static vmq j(vmp vmpVar) {
        return new vmq(vmpVar, Optional.of(vmpVar.f()), vmpVar.a());
    }

    public static vmq k(vmp vmpVar) {
        return new vmq(vmpVar.f(), Optional.of(vmpVar), vmpVar.a());
    }

    public static List l(String str, vmn vmnVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            if (Character.isDigit(str.charAt(i))) {
                if (i2 != i) {
                    arrayList.add(vmr.d(str.substring(i2, i), vmnVar));
                }
                int i4 = Integer.parseInt(str.substring(i, i3));
                arrayList.add(vmm.d(i4, vmnVar.a(i4)));
                i2 = i3;
            }
            i = i3;
        }
        if (i2 < i) {
            arrayList.add(vmr.d(str.substring(i2, i), vmnVar));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final cim n(List list) {
        int i = 1;
        if (list.size() == 1) {
            return (cim) list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = ((cim) list.get(0)).c;
        for (int i3 = 0; i3 < list.size(); i3++) {
            cim cimVar = (cim) list.get(i3);
            if (i2 != cimVar.c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (cim) list.get(0);
            }
            arrayList.add(new Pair(cimVar.b, Integer.valueOf(cimVar.d)));
        }
        return (cim) j$.util.Map.EL.computeIfAbsent(this.a, arrayList, new hph(this, list, i));
    }

    private static void o(long j, Map map) {
        Collection.EL.removeIf(map.entrySet(), new uqr(j, 1));
    }

    public final kdi a() {
        if (this.d == null) {
            kdi kdiVar = new kdi((kcw) this.e, (String) this.b);
            this.d = kdiVar;
            kdiVar.c(1);
        }
        return (kdi) this.d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b() {
        int i;
        int i2;
        aihf aihfVar;
        int i3;
        long jLongValue;
        Object obj = this.d;
        if (obj != null) {
            kdi kdiVar = (kdi) obj;
            kbu kbuVar = kdiVar.l;
            if (kbuVar != null) {
                kbuVar.e = null;
                kdiVar.l = null;
            }
            aihf aihfVarCreateBuilder = agzp.a.createBuilder();
            long j = kdiVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            agzp agzpVar = (agzp) aihfVarCreateBuilder.instance;
            agzpVar.b |= 2;
            agzpVar.d = j;
            String str = kdiVar.n;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                agzp agzpVar2 = (agzp) aihfVarCreateBuilder.instance;
                agzpVar2.b |= 262144;
                agzpVar2.i = str;
            }
            aihf aihfVarCreateBuilder2 = agzy.a.createBuilder();
            int i4 = 1;
            if (!TextUtils.isEmpty(kdiVar.p)) {
                String str2 = kdiVar.p;
                aihfVarCreateBuilder.copyOnWrite();
                agzp agzpVar3 = (agzp) aihfVarCreateBuilder.instance;
                str2.getClass();
                agzpVar3.b |= SemanticState.Modal;
                agzpVar3.e = str2;
                String str3 = kdiVar.p;
                aihfVarCreateBuilder2.copyOnWrite();
                agzy agzyVar = (agzy) aihfVarCreateBuilder2.instance;
                str3.getClass();
                agzyVar.b |= 1;
                agzyVar.c = str3;
            }
            if (!TextUtils.isEmpty(kdiVar.q)) {
                String str4 = kdiVar.q;
                aihfVarCreateBuilder2.copyOnWrite();
                agzy agzyVar2 = (agzy) aihfVarCreateBuilder2.instance;
                str4.getClass();
                agzyVar2.b |= 2;
                agzyVar2.d = str4;
            }
            if (!TextUtils.isEmpty(kdiVar.r)) {
                String str5 = kdiVar.r;
                aihfVarCreateBuilder2.copyOnWrite();
                agzy agzyVar3 = (agzy) aihfVarCreateBuilder2.instance;
                str5.getClass();
                agzyVar3.b |= 4;
                agzyVar3.e = str5;
            }
            int i5 = 8;
            if (!TextUtils.isEmpty(kdiVar.s)) {
                String str6 = kdiVar.s;
                aihfVarCreateBuilder2.copyOnWrite();
                agzy agzyVar4 = (agzy) aihfVarCreateBuilder2.instance;
                str6.getClass();
                agzyVar4.b |= 8;
                agzyVar4.f = str6;
            }
            int i6 = 16;
            if (!TextUtils.isEmpty(kdiVar.t)) {
                String str7 = kdiVar.t;
                aihfVarCreateBuilder2.copyOnWrite();
                agzy agzyVar5 = (agzy) aihfVarCreateBuilder2.instance;
                str7.getClass();
                agzyVar5.b |= 16;
                agzyVar5.g = str7;
            }
            if (!TextUtils.isEmpty(kdiVar.u)) {
                String str8 = kdiVar.u;
                aihfVarCreateBuilder2.copyOnWrite();
                agzy agzyVar6 = (agzy) aihfVarCreateBuilder2.instance;
                str8.getClass();
                agzyVar6.b |= 32;
                agzyVar6.h = str8;
            }
            int iP = ket.p(kdiVar.v);
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar7 = (agzy) aihfVarCreateBuilder2.instance;
            agzyVar7.i = iP - 1;
            agzyVar7.b |= SemanticState.Focused;
            agzy agzyVar8 = (agzy) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            agzp agzpVar4 = (agzp) aihfVarCreateBuilder.instance;
            agzyVar8.getClass();
            agzpVar4.p = agzyVar8;
            agzpVar4.c |= 67108864;
            aihf aihfVarCreateBuilder3 = agzn.a.createBuilder();
            String str9 = kdi.b;
            aihfVarCreateBuilder3.copyOnWrite();
            agzn agznVar = (agzn) aihfVarCreateBuilder3.instance;
            str9.getClass();
            agznVar.b |= 2;
            agznVar.d = str9;
            String str10 = kdiVar.i;
            aihfVarCreateBuilder3.copyOnWrite();
            agzn agznVar2 = (agzn) aihfVarCreateBuilder3.instance;
            str10.getClass();
            agznVar2.b |= 1;
            agznVar2.c = str10;
            aihfVarCreateBuilder.am((agzn) aihfVarCreateBuilder3.build());
            aihf aihfVarCreateBuilder4 = agzt.a.createBuilder();
            String str11 = (String) kdiVar.c.io();
            if (str11 != null) {
                aihf aihfVarCreateBuilder5 = agzw.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                agzw agzwVar = (agzw) aihfVarCreateBuilder5.instance;
                agzwVar.b |= 1;
                agzwVar.c = str11;
                agzw agzwVar2 = (agzw) aihfVarCreateBuilder5.build();
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar = (agzt) aihfVarCreateBuilder4.instance;
                agzwVar2.getClass();
                agztVar.c = agzwVar2;
                agztVar.b |= 1;
            }
            String str12 = kdiVar.m;
            if (str12 != null) {
                try {
                    String strReplace = str12.replace("-", "");
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    kdi.a.f(e, str12);
                    jLongValue = 0;
                }
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar2 = (agzt) aihfVarCreateBuilder4.instance;
                agztVar2.b |= 2;
                agztVar2.d = jLongValue;
            }
            List<keg> list = kdiVar.d;
            if (list.isEmpty()) {
                i = 8;
                i2 = 16;
            } else {
                ArrayList arrayList = new ArrayList();
                for (keg kegVar : list) {
                    aihf aihfVarCreateBuilder6 = agzs.a.createBuilder();
                    int i7 = kegVar.e;
                    aihfVarCreateBuilder6.copyOnWrite();
                    agzs agzsVar = (agzs) aihfVarCreateBuilder6.instance;
                    agzsVar.c = i7 - 1;
                    agzsVar.b |= 1;
                    int i8 = i5;
                    int i9 = i6;
                    long j2 = kegVar.b - kegVar.d;
                    aihfVarCreateBuilder6.copyOnWrite();
                    agzs agzsVar2 = (agzs) aihfVarCreateBuilder6.instance;
                    agzsVar2.b |= 16;
                    int i10 = (int) j2;
                    agzsVar2.g = i10;
                    aihfVarCreateBuilder6.copyOnWrite();
                    agzs agzsVar3 = (agzs) aihfVarCreateBuilder6.instance;
                    agzsVar3.b |= 2;
                    agzsVar3.d = i10;
                    Integer num = kegVar.a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        aihfVarCreateBuilder6.copyOnWrite();
                        agzs agzsVar4 = (agzs) aihfVarCreateBuilder6.instance;
                        agzsVar4.b |= 4;
                        agzsVar4.e = iIntValue;
                    }
                    Boolean bool = kegVar.c;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        aihfVarCreateBuilder6.copyOnWrite();
                        agzs agzsVar5 = (agzs) aihfVarCreateBuilder6.instance;
                        agzsVar5.b |= 8;
                        agzsVar5.f = zBooleanValue;
                    }
                    arrayList.add((agzs) aihfVarCreateBuilder6.build());
                    i5 = i8;
                    i6 = i9;
                }
                i = i5;
                i2 = i6;
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar3 = (agzt) aihfVarCreateBuilder4.instance;
                aiie aiieVar = agztVar3.e;
                if (!aiieVar.c()) {
                    agztVar3.e = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(arrayList, agztVar3.e);
            }
            List list2 = kdiVar.e;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar4 = (agzt) aihfVarCreateBuilder4.instance;
                aiie aiieVar2 = agztVar4.g;
                if (!aiieVar2.c()) {
                    agztVar4.g = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(arrayList2, agztVar4.g);
            }
            List<kee> list3 = kdiVar.f;
            if (list3.isEmpty()) {
                aihfVar = aihfVarCreateBuilder;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (kee keeVar : list3) {
                    aihf aihfVarCreateBuilder7 = agzq.a.createBuilder();
                    String str13 = keeVar.a;
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i4 = 13;
                            }
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i4 = 22;
                            }
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i4 = 15;
                            }
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i4 = 19;
                            }
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i4 = 23;
                            }
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i4 = 9;
                            }
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i4 = 21;
                            }
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i4 = 10;
                            }
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i4 = 14;
                            }
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i4 = 7;
                            }
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i4 = 20;
                            }
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i4 = 2;
                            }
                            break;
                        case 3363353:
                            if (str13.equals("mute")) {
                                i4 = i;
                            }
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i4 = 3;
                            }
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i4 = 6;
                            }
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i4 = 5;
                            }
                            break;
                        case 106440182:
                            if (str13.equals("pause")) {
                                i4 = 4;
                            }
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i4 = 18;
                            }
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i4 = i2;
                            }
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i4 = 12;
                            }
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i4 = 11;
                            }
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i4 = 17;
                            }
                            break;
                        default:
                            break;
                    }
                    aihfVarCreateBuilder7.copyOnWrite();
                    agzq agzqVar = (agzq) aihfVarCreateBuilder7.instance;
                    agzqVar.c = i4 - 1;
                    agzqVar.b |= 1;
                    int i11 = (int) keeVar.b;
                    aihfVarCreateBuilder7.copyOnWrite();
                    agzq agzqVar2 = (agzq) aihfVarCreateBuilder7.instance;
                    agzqVar2.b |= 2;
                    agzqVar2.d = i11;
                    int i12 = keeVar.c;
                    aihfVarCreateBuilder7.copyOnWrite();
                    agzq agzqVar3 = (agzq) aihfVarCreateBuilder7.instance;
                    agzqVar3.b |= 4;
                    agzqVar3.e = i12;
                    long j3 = keeVar.d - keeVar.f;
                    aihfVarCreateBuilder7.copyOnWrite();
                    agzq agzqVar4 = (agzq) aihfVarCreateBuilder7.instance;
                    agzqVar4.b |= 8;
                    agzqVar4.f = (int) j3;
                    long j4 = keeVar.e - keeVar.f;
                    aihfVarCreateBuilder7.copyOnWrite();
                    agzq agzqVar5 = (agzq) aihfVarCreateBuilder7.instance;
                    agzqVar5.b |= 16;
                    agzqVar5.g = (int) j4;
                    arrayList3.add((agzq) aihfVarCreateBuilder7.build());
                    aihfVarCreateBuilder = aihfVarCreateBuilder;
                }
                aihfVar = aihfVarCreateBuilder;
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar5 = (agzt) aihfVarCreateBuilder4.instance;
                aiie aiieVar3 = agztVar5.f;
                if (!aiieVar3.c()) {
                    agztVar5.f = aihn.mutableCopy(aiieVar3);
                }
                aifs.addAll(arrayList3, agztVar5.f);
            }
            if (kdiVar.o != null) {
                ArrayList arrayList4 = new ArrayList();
                kde kdeVar = kdiVar.o;
                aihf aihfVarCreateBuilder8 = agzr.a.createBuilder();
                int i13 = kdeVar.a;
                if (i13 == 1) {
                    i3 = 2;
                } else if (i13 == 2) {
                    i3 = 3;
                } else if (i13 != 3) {
                    i3 = i13 != 4 ? 1 : 5;
                } else {
                    i3 = 4;
                }
                aihfVarCreateBuilder8.copyOnWrite();
                agzr agzrVar = (agzr) aihfVarCreateBuilder8.instance;
                agzrVar.c = i3 - 1;
                agzrVar.b |= 1;
                long j5 = kdeVar.b - kdeVar.c;
                aihfVarCreateBuilder8.copyOnWrite();
                agzr agzrVar2 = (agzr) aihfVarCreateBuilder8.instance;
                agzrVar2.b |= 2;
                agzrVar2.d = (int) j5;
                arrayList4.add((agzr) aihfVarCreateBuilder8.build());
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar6 = (agzt) aihfVarCreateBuilder4.instance;
                aiie aiieVar4 = agztVar6.i;
                if (!aiieVar4.c()) {
                    agztVar6.i = aihn.mutableCopy(aiieVar4);
                }
                aifs.addAll(arrayList4, agztVar6.i);
            }
            Map map = kdiVar.g;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (kdj kdjVar : map.values()) {
                    aihf aihfVarCreateBuilder9 = agzu.a.createBuilder();
                    int i14 = kdjVar.e;
                    aihfVarCreateBuilder9.copyOnWrite();
                    agzu agzuVar = (agzu) aihfVarCreateBuilder9.instance;
                    agzuVar.c = i14 - 1;
                    agzuVar.b |= 1;
                    int i15 = kdjVar.d.get();
                    aihfVarCreateBuilder9.copyOnWrite();
                    agzu agzuVar2 = (agzu) aihfVarCreateBuilder9.instance;
                    agzuVar2.b |= 2;
                    agzuVar2.d = i15;
                    long j6 = kdjVar.a - kdjVar.c;
                    aihfVarCreateBuilder9.copyOnWrite();
                    agzu agzuVar3 = (agzu) aihfVarCreateBuilder9.instance;
                    agzuVar3.b |= 4;
                    agzuVar3.e = (int) j6;
                    long j7 = kdjVar.b - kdjVar.c;
                    aihfVarCreateBuilder9.copyOnWrite();
                    agzu agzuVar4 = (agzu) aihfVarCreateBuilder9.instance;
                    agzuVar4.b |= 8;
                    agzuVar4.f = (int) j7;
                    arrayList5.add((agzu) aihfVarCreateBuilder9.build());
                }
                aihfVarCreateBuilder4.copyOnWrite();
                agzt agztVar7 = (agzt) aihfVarCreateBuilder4.instance;
                aiie aiieVar5 = agztVar7.h;
                if (!aiieVar5.c()) {
                    agztVar7.h = aihn.mutableCopy(aiieVar5);
                }
                aifs.addAll(arrayList5, agztVar7.h);
            }
            int i16 = kdiVar.w;
            aihfVarCreateBuilder4.copyOnWrite();
            agzt agztVar8 = (agzt) aihfVarCreateBuilder4.instance;
            agztVar8.b |= 8;
            agztVar8.j = i16;
            agzt agztVar9 = (agzt) aihfVarCreateBuilder4.build();
            aihfVar.copyOnWrite();
            aihf aihfVar2 = aihfVar;
            agzp agzpVar5 = (agzp) aihfVar2.instance;
            agztVar9.getClass();
            agzpVar5.l = agztVar9;
            agzpVar5.c |= 8;
            kdiVar.h.a((agzp) aihfVar2.build(), 233);
            this.d = null;
        }
    }

    public final void c(keg kegVar) {
        kdi kdiVarA;
        int i = kegVar.e;
        if (i == 2 && this.d != null) {
            b();
        }
        if (i == 2) {
            kdiVarA = new kdi((kcw) this.e, (String) this.b);
            this.d = kdiVarA;
        } else {
            kdiVarA = a();
            this.d = kdiVarA;
        }
        kro.l(kdiVarA);
        kegVar.d = kdiVarA.j;
        kdiVarA.d.add(kegVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void d(aemq aemqVar) {
        taq.d();
        this.c.add(aemqVar);
        aemqVar.kc(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void e(aemq aemqVar) {
        taq.d();
        this.c.remove(aemqVar);
    }

    public final cim f(List list) {
        List listG = g(list);
        if (listG.size() < 2) {
            return (cim) aguu.J(listG, null);
        }
        j$.util.List.EL.sort(listG, new awv(4));
        Object obj = this.d;
        if (obj != null) {
            int i = 0;
            while (true) {
                agke agkeVar = (agke) obj;
                if (i >= agkeVar.size()) {
                    break;
                }
                String str = (String) agkeVar.get(i);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < listG.size(); i2++) {
                    cim cimVar = (cim) listG.get(i2);
                    if (Objects.equals(str, cimVar.b)) {
                        arrayList.add(cimVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return n(arrayList);
                }
                i++;
            }
        }
        return n(listG);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final List g(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ?? r2 = this.c;
        o(jElapsedRealtime, r2);
        ?? r5 = this.e;
        o(jElapsedRealtime, r5);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            cim cimVar = (cim) list.get(i);
            if (!r2.containsKey(cimVar.b) && !r5.containsKey(Integer.valueOf(cimVar.c))) {
                arrayList.add(cimVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void m(yvh yvhVar, double d) {
        double d2;
        float f;
        Bitmap bitmapA = ((vmd) this.c).a();
        Canvas canvas = (Canvas) yvhVar.c;
        canvas.setBitmap(bitmapA);
        canvas.save();
        ?? r3 = yvhVar.b;
        Iterator it = r3.iterator();
        float f2 = 0.0f;
        while (true) {
            d2 = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            vmq vmqVar = (vmq) it.next();
            float f3 = vmqVar.c;
            f2 = vmqVar.b.isPresent() ? f2 + ((float) ((0.0d * d) + ((double) f3))) : f2 + f3;
        }
        float fMax = Math.max(bitmapA.getWidth() - f2, 0.0f) / 2.0f;
        vmn vmnVar = (vmn) yvhVar.d;
        canvas.translate(fMax, vmnVar.d);
        Iterator it2 = r3.iterator();
        while (it2.hasNext()) {
            vmq vmqVar2 = (vmq) it2.next();
            float f4 = vmqVar2.c;
            Optional optional = vmqVar2.b;
            if (optional.isPresent()) {
                f4 = (float) ((d * d2) + ((double) f4));
            }
            float f5 = f4;
            vmp vmpVar = vmqVar2.a;
            if (vmpVar instanceof vmm) {
                int i = yvhVar.a;
                Optional optionalEmpty = Optional.empty();
                Integer num = (Integer) vmpVar.c();
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) (true != optional.isPresent() ? optional : Optional.ofNullable((Integer) ((vmp) optional.get()).c())).orElse(num)).intValue();
                int i2 = i == 1 ? iIntValue : (10 - iIntValue) % 10;
                int i3 = i == 1 ? iIntValue2 : (10 - iIntValue2) % 10;
                int i4 = 0;
                if (optional.isPresent() && iIntValue == iIntValue2) {
                    i4 = 10;
                }
                int i5 = i2 + 10;
                int i6 = i5 + (((i3 - i2) + 10) % 10) + i4 + 1;
                String strSubstring = i == 1 ? "012345678901234567890123456789".substring(i5, i6) : "098765432109876543210987654321".substring(i5, i6);
                int i7 = i == 1 ? 1 : -1;
                float f6 = vmnVar.c;
                double d3 = f6;
                double length = (((double) ((strSubstring.length() - 1) * f6)) * d) / d3;
                String str = strSubstring;
                vmn vmnVar2 = vmnVar;
                int i8 = (int) length;
                double d4 = (length - ((double) i8)) * d3;
                double d5 = -i7;
                canvas = canvas;
                yno.eS(vmnVar2, canvas, str, i8, optionalEmpty, (float) (d4 * d5));
                yno.eS(vmnVar2, canvas, str, i8 + 1, optionalEmpty, (float) ((d4 - d3) * d5));
                vmnVar = vmnVar2;
                f = 0.0f;
            } else {
                vmp vmpVar2 = optional.isPresent() ? (vmp) optional.get() : vmpVar;
                vmpVar.c().toString();
                String string = vmpVar2.c().toString();
                canvas.save();
                f = 0.0f;
                canvas.drawText(string, 0.0f, 0.0f, vmnVar.a);
            }
            canvas.translate(f5, f);
            it2 = it2;
            d2 = 0.0d;
        }
        canvas.restore();
        ((vmi) this.b).a(bitmapA);
    }

    public aepb(kcw kcwVar, kdl kdlVar, String str) {
        this.e = kcwVar;
        this.a = kdlVar;
        this.b = str;
        this.c = new qcb(this);
    }

    public aepb(vmi vmiVar, vmd vmdVar, vmn vmnVar, xgn xgnVar) {
        this.b = vmiVar;
        this.c = vmdVar;
        this.e = vmnVar;
        this.a = xgnVar;
        this.d = new AnimatorSet();
    }

    public aepb(byte[] bArr) {
        Random random = new Random();
        this.a = new HashMap();
        this.b = random;
        this.c = new HashMap();
        this.e = new HashMap();
    }

    public aepb(Object obj, wki wkiVar) {
        this.b = obj;
        this.c = wkiVar;
        this.e = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
    }

    public aepb(gcz gczVar, File file, File file2, File file3) {
        this.c = gczVar;
        this.b = file;
        this.a = file3;
        this.e = file2;
    }

    public aepb(aepd aepdVar, Executor executor, Executor executor2) {
        this.a = new awku();
        this.e = aepdVar;
        this.b = executor;
        this.c = executor2;
    }
}
