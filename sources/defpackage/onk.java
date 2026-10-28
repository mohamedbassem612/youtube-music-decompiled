package defpackage;

import android.content.Context;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onk implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ onk(olt oltVar, int i, olg olgVar, int i2) {
        this.$cid = i2;
        this.c = oltVar;
        this.a = i;
        this.b = olgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        Set setB;
        if (this.$cid != 0) {
            if (!((Boolean) obj).booleanValue()) {
                return ahng.n(Boolean.FALSE);
            }
            Object obj2 = this.b;
            int i = this.a;
            olt oltVar = (olt) this.c;
            qnl.bi(oltVar.a, olg.a(i));
            return oltVar.b((olg) obj2, i + 1);
        }
        List<oip> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add((omh) it.next());
        }
        for (oip oipVar : list) {
            aihf aihfVarCreateBuilder = oiw.a.createBuilder();
            String str = oipVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            oiw oiwVar = (oiw) aihfVarCreateBuilder.instance;
            str.getClass();
            oiwVar.b |= 1;
            oiwVar.c = str;
            if (oipVar.e.isEmpty()) {
                aihfVarCreateBuilder.copyOnWrite();
                oiw oiwVar2 = (oiw) aihfVarCreateBuilder.instance;
                oiwVar2.b |= 2;
                oiwVar2.d = "com.google.android.gms";
            } else {
                String str2 = oipVar.e;
                aihfVarCreateBuilder.copyOnWrite();
                oiw oiwVar3 = (oiw) aihfVarCreateBuilder.instance;
                str2.getClass();
                oiwVar3.b |= 2;
                oiwVar3.d = str2;
            }
            arrayList.add(new omh((oiw) aihfVarCreateBuilder.build(), oipVar));
        }
        final HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        final HashMap map4 = new HashMap();
        final HashSet hashSet = new HashSet();
        final AtomicLong atomicLong = new AtomicLong(0L);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            Object obj3 = this.b;
            if (i2 >= size) {
                final int i3 = this.a;
                kjc kjcVarAJ = qnl.aJ(arrayList2);
                final onp onpVar = (onp) obj3;
                return kjcVarAJ.N(new Callable() { // from class: onm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        aihf aihfVarCreateBuilder2 = ahaw.a.createBuilder();
                        Map map5 = map;
                        onp onpVar2 = onpVar;
                        for (String str3 : map5.keySet()) {
                            Map map6 = map4;
                            ono onoVar = (ono) map5.get(str3);
                            List listH = agfm.c("|").h(str3);
                            aihf aihfVarCreateBuilder3 = ahai.a.createBuilder();
                            String str4 = (String) listH.get(0);
                            aihfVarCreateBuilder3.copyOnWrite();
                            ahai ahaiVar = (ahai) aihfVarCreateBuilder3.instance;
                            str4.getClass();
                            ahaiVar.b |= 1;
                            ahaiVar.c = str4;
                            String str5 = (String) listH.get(1);
                            aihfVarCreateBuilder3.copyOnWrite();
                            ahai ahaiVar2 = (ahai) aihfVarCreateBuilder3.instance;
                            str5.getClass();
                            ahaiVar2.b |= 4;
                            ahaiVar2.e = str5;
                            int i4 = onoVar.e;
                            aihfVarCreateBuilder3.copyOnWrite();
                            ahai ahaiVar3 = (ahai) aihfVarCreateBuilder3.instance;
                            ahaiVar3.b |= 8;
                            ahaiVar3.f = i4;
                            int i5 = onoVar.f;
                            aihfVarCreateBuilder3.copyOnWrite();
                            ahai ahaiVar4 = (ahai) aihfVarCreateBuilder3.instance;
                            ahaiVar4.b |= 16;
                            ahaiVar4.g = i5;
                            oip oipVar2 = (oip) map6.get(str3);
                            if (oipVar2 == null) {
                                aihfVarCreateBuilder3.copyOnWrite();
                                ahai ahaiVar5 = (ahai) aihfVarCreateBuilder3.instance;
                                ahaiVar5.b |= 2;
                                ahaiVar5.d = -1;
                            } else {
                                int i6 = oipVar2.f;
                                aihfVarCreateBuilder3.copyOnWrite();
                                ahai ahaiVar6 = (ahai) aihfVarCreateBuilder3.instance;
                                ahaiVar6.b |= 2;
                                ahaiVar6.d = i6;
                                long j = oipVar2.s;
                                aihfVarCreateBuilder3.copyOnWrite();
                                ahai ahaiVar7 = (ahai) aihfVarCreateBuilder3.instance;
                                ahaiVar7.b |= 64;
                                ahaiVar7.i = j;
                                String str6 = oipVar2.t;
                                aihfVarCreateBuilder3.copyOnWrite();
                                ahai ahaiVar8 = (ahai) aihfVarCreateBuilder3.instance;
                                str6.getClass();
                                ahaiVar8.b |= SemanticState.Focused;
                                ahaiVar8.j = str6;
                            }
                            ahai ahaiVar9 = (ahai) aihfVarCreateBuilder3.build();
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahaw ahawVar = (ahaw) aihfVarCreateBuilder2.instance;
                            ahaiVar9.getClass();
                            aiie aiieVar = ahawVar.c;
                            if (!aiieVar.c()) {
                                ahawVar.c = aihn.mutableCopy(aiieVar);
                            }
                            ahawVar.c.add(ahaiVar9);
                            long j2 = onoVar.a;
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahaw ahawVar2 = (ahaw) aihfVarCreateBuilder2.instance;
                            aihy aihyVar = ahawVar2.d;
                            if (!aihyVar.c()) {
                                ahawVar2.d = aihn.mutableCopy(aihyVar);
                            }
                            ahawVar2.d.g(j2);
                            long j3 = onoVar.b;
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahaw ahawVar3 = (ahaw) aihfVarCreateBuilder2.instance;
                            aihy aihyVar2 = ahawVar3.e;
                            if (!aihyVar2.c()) {
                                ahawVar3.e = aihn.mutableCopy(aihyVar2);
                            }
                            ahawVar3.e.g(j3);
                            long j4 = onoVar.c;
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahaw ahawVar4 = (ahaw) aihfVarCreateBuilder2.instance;
                            aihy aihyVar3 = ahawVar4.f;
                            if (!aihyVar3.c()) {
                                ahawVar4.f = aihn.mutableCopy(aihyVar3);
                            }
                            ahawVar4.f.g(j4);
                            long j5 = onoVar.d;
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahaw ahawVar5 = (ahaw) aihfVarCreateBuilder2.instance;
                            aihy aihyVar4 = ahawVar5.g;
                            if (!aihyVar4.c()) {
                                ahawVar5.g = aihn.mutableCopy(aihyVar4);
                            }
                            ahawVar5.g.g(j5);
                        }
                        long j6 = atomicLong.get();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahaw ahawVar6 = (ahaw) aihfVarCreateBuilder2.instance;
                        ahawVar6.b |= 1;
                        ahawVar6.h = j6;
                        long jLongValue = 0;
                        try {
                            Uri uriBa = qnl.ba((Context) onpVar2.d, (agev) onpVar2.e);
                            Object obj4 = onpVar2.c;
                            if (((ayq) obj4).ac(uriBa)) {
                                jLongValue = ((Long) ((ayq) obj4).X(uriBa, new qqp(5))).longValue();
                            }
                        } catch (IOException e) {
                            onb.g(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
                        }
                        int i7 = i3;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahaw ahawVar7 = (ahaw) aihfVarCreateBuilder2.instance;
                        ahawVar7.b |= 2;
                        ahawVar7.i = jLongValue;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahaw ahawVar8 = (ahaw) aihfVarCreateBuilder2.instance;
                        ahawVar8.b |= 4;
                        ahawVar8.j = i7;
                        return (ahaw) aihfVarCreateBuilder2.build();
                    }
                }, onpVar.f);
            }
            final omh omhVar = (omh) arrayList.get(i2);
            oiw oiwVar4 = omhVar.a;
            Set setB2 = onp.b(map2, onp.a(oiwVar4));
            String strA = onp.a(oiwVar4);
            ono onoVar = (ono) map.get(strA);
            HashMap map5 = map2;
            if (onoVar == null) {
                map.put(strA, new ono());
                onoVar = (ono) map.get(strA);
            }
            if (oiwVar4.f) {
                setB = onp.b(map3, onp.a(oiwVar4));
                map4.put(onp.a(oiwVar4), omhVar.b);
            } else {
                setB = null;
            }
            oip oipVar2 = omhVar.b;
            int size2 = oipVar2.o.size();
            Set set = setB;
            Iterator it2 = oipVar2.o.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                oin oinVar = (oin) it2.next();
                final boolean zH = nsp.h(oinVar);
                final Set set2 = setB2;
                int iAS = a.aS(oipVar2.j);
                if (iAS == 0) {
                    iAS = 1;
                }
                final oiz oizVarA = nsj.a(oinVar, iAS);
                onp onpVar2 = (onp) obj3;
                ArrayList arrayList3 = arrayList;
                ooi ooiVarD = ooi.d(((omn) onpVar2.b).d(oizVarA));
                oly olyVar = new oly(3);
                ?? r2 = onpVar2.f;
                ooi ooiVarE = ooiVarD.c(oma.class, olyVar, r2).e(new onn(obj3, 0), r2);
                oip oipVar3 = oipVar2;
                final AtomicLong atomicLong2 = atomicLong;
                int i4 = size2;
                final ono onoVar2 = onoVar;
                final Set set3 = set;
                arrayList2.add(ahno.ar(ooiVarE, new agek() { // from class: onl
                    @Override // defpackage.agek
                    public final Object apply(Object obj4) {
                        Long l = (Long) obj4;
                        Set set4 = hashSet;
                        oiz oizVar = oizVarA;
                        if (!set4.contains(oizVar)) {
                            atomicLong2.getAndAdd(l.longValue());
                            set4.add(oizVar);
                        }
                        ono onoVar3 = onoVar2;
                        boolean z = zH;
                        Set set5 = set2;
                        if (!set5.contains(oizVar)) {
                            if (z) {
                                onoVar3.b += l.longValue();
                            }
                            onoVar3.a += l.longValue();
                            set5.add(oizVar);
                        }
                        if (!omhVar.a.f) {
                            return null;
                        }
                        Set set6 = set3;
                        set6.getClass();
                        if (set6.contains(oizVar)) {
                            return null;
                        }
                        if (z) {
                            onoVar3.d += l.longValue();
                            onoVar3.f++;
                        }
                        onoVar3.c += l.longValue();
                        set6.add(oizVar);
                        return null;
                    }
                }, r2));
                size = size;
                obj3 = obj3;
                atomicLong = atomicLong2;
                setB2 = set2;
                i2 = i2;
                oipVar2 = oipVar3;
                it2 = it3;
                map3 = map3;
                set = set3;
                onoVar = onoVar2;
                size2 = i4;
                arrayList = arrayList3;
            }
            onoVar.e = size2;
            i2++;
            map2 = map5;
            arrayList = arrayList;
        }
    }

    public /* synthetic */ onk(onp onpVar, List list, int i, int i2) {
        this.$cid = i2;
        this.b = onpVar;
        this.c = list;
        this.a = i;
    }
}
