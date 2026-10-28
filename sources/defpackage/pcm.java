package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pcm implements pcb {
    private static final Map a = atqq.y(new awml(ahza.DISMISSED_REMOTE, ahyy.DROPPED_BY_STATE), new awml(ahza.EXPIRED, ahyy.DROPPED_EXPIRED));
    private static final Map b = atqq.y(new awml(ahza.DISMISSED_REMOTE, ahzv.DISMISSED_REMOTE), new awml(ahza.EXPIRED, ahzv.EXPIRED));
    private static final Map c = atqq.y(new awml(ahyy.DROPPED_BY_STATE, pqf.B), new awml(ahyy.DROPPED_BY_CLIENT, pqf.n), new awml(ahyy.DROPPED_EXPIRED, pqf.u));
    private final phe d;
    private final aunn e;
    private final aunn f;
    private final pav g;
    private final Context h;
    private final pls i;
    private final awmd j;
    private final awmd k;
    private final mbc l;
    private final aunn m;
    private final axff n;
    private final tld o;

    public pcm(phe pheVar, aunn aunnVar, aunn aunnVar2, pav pavVar, Context context, pls plsVar, awmd awmdVar, tld tldVar, awmd awmdVar2, mbc mbcVar, aunn aunnVar3, axff axffVar) {
        pheVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        pavVar.getClass();
        context.getClass();
        plsVar.getClass();
        awmdVar.getClass();
        tldVar.getClass();
        awmdVar2.getClass();
        mbcVar.getClass();
        aunnVar3.getClass();
        axffVar.getClass();
        this.d = pheVar;
        this.e = aunnVar;
        this.f = aunnVar2;
        this.g = pavVar;
        this.h = context;
        this.i = plsVar;
        this.j = awmdVar;
        this.o = tldVar;
        this.k = awmdVar2;
        this.l = mbcVar;
        this.m = aunnVar3;
        this.n = axffVar;
    }

    private final Object k(ahyy ahyyVar, plx plxVar, qab qabVar, List list, pax paxVar, boolean z, awoq awoqVar) {
        String strName;
        paw pawVarA = this.g.a(ahyyVar);
        pawVarA.f(plxVar);
        pawVarA.c(list);
        pbc pbcVar = (pbc) pawVarA;
        pbcVar.r = 2;
        pbcVar.k = paxVar;
        pwf pwfVar = (pwf) this.j.io();
        String packageName = this.h.getPackageName();
        int i = Build.VERSION.SDK_INT;
        pqf pqfVar = (pqf) c.get(ahyyVar);
        if (pqfVar == null || (strName = pqfVar.name()) == null) {
            strName = "UNKNOWN";
        }
        pwfVar.m(packageName, this.i.a, i, strName);
        if (qabVar != null) {
            pbcVar.g = qabVar;
        }
        pawVarA.a();
        Object objL = l(plxVar, list, z, awoqVar);
        return objL != awox.a ? awmy.a : objL;
    }

    private final Object l(plx plxVar, List list, boolean z, awoq awoqVar) {
        if (auvy.c() && plxVar != null && !list.isEmpty() && !z) {
            peq peqVar = (peq) this.m.io();
            aihf aihfVarCreateBuilder = aiff.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aext.D(aihfVarCreateBuilder);
            Object objD = peqVar.d(plxVar, aext.B(aihfVarCreateBuilder), "com.google.android.libraries.notifications.NOTIFICATION_DROPPED", 1, new pbh(null, null, null, false), nxi.b(list), 1, 7, awoqVar);
            if (objD == awox.a) {
                return objD;
            }
        }
        return awmy.a;
    }

    @Override // defpackage.pcb
    public final Object a(plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, boolean z3, awoq awoqVar) {
        Object objA = nxe.a(this.n, new pci(this, plxVar, list, plbVar, paxVar, z, z2, z3, null), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r0 == defpackage.aidu.DELETED) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [pcm] */
    @Override // defpackage.pcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.plx r10, java.util.List r11, defpackage.aiff r12, int r13, defpackage.pbh r14, defpackage.awoq r15) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r15 instanceof defpackage.pcl
            if (r0 == 0) goto L13
            r0 = r15
            pcl r0 = (defpackage.pcl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pcl r0 = new pcl
            r0.<init>(r9, r15)
        L18:
            r15 = r0
            java.lang.Object r0 = r15.b
            awox r6 = defpackage.awox.a
            int r1 = r15.d
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            defpackage.atqp.j(r0)
            goto L9e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            pbh r10 = r15.f
            int r11 = r15.g
            aiff r12 = r15.e
            java.lang.Object r13 = r15.a
            plx r14 = r15.h
            defpackage.atqp.j(r0)
            r8 = r14
            r14 = r10
            r10 = r8
            r8 = r13
            r13 = r11
            r11 = r8
            goto L86
        L48:
            defpackage.atqp.j(r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L9e
            int r0 = r12.f
            int r0 = defpackage.a.aS(r0)
            if (r0 == 0) goto L5c
            r1 = 3
            if (r0 == r1) goto L6a
        L5c:
            int r0 = r12.d
            aidu r0 = defpackage.aidu.a(r0)
            if (r0 != 0) goto L66
            aidu r0 = defpackage.aidu.DELETION_STATUS_UNKNOWN
        L66:
            aidu r1 = defpackage.aidu.DELETED
            if (r0 != r1) goto L88
        L6a:
            phe r0 = r9.d
            r15.h = r10
            r15.a = r11
            r15.e = r12
            r15.g = r13
            r15.f = r14
            r15.d = r2
            r3 = 0
            r1 = r10
            r2 = r11
            r4 = r14
            r5 = r15
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == r6) goto La0
            r10 = r1
            r11 = r2
            r14 = r4
        L86:
            java.util.List r0 = (java.util.List) r0
        L88:
            r0 = 0
            r15.h = r0
            r15.a = r0
            r15.e = r0
            r1 = 0
            r15.g = r1
            r15.f = r0
            r15.d = r7
            ahza r14 = r14.a
            java.lang.Object r9 = r9.j(r10, r11, r12, r13, r14, r15)
            if (r9 == r6) goto La0
        L9e:
            awmy r6 = defpackage.awmy.a
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcm.b(plx, java.util.List, aiff, int, pbh, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [ahex, java.lang.Object] */
    public final Object c(plx plxVar, List list, awoq awoqVar) throws Throwable {
        pcc pccVar;
        aido aidoVar;
        if (awoqVar instanceof pcc) {
            pccVar = (pcc) awoqVar;
            int i = pccVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pccVar.c = i - Integer.MIN_VALUE;
            } else {
                pccVar = new pcc(this, awoqVar);
            }
        } else {
            pccVar = new pcc(this, awoqVar);
        }
        Object objAd = pccVar.a;
        awox awoxVar = awox.a;
        int i2 = pccVar.c;
        if (i2 == 0) {
            atqp.j(objAd);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                        aidoVar = ((pot) it.next()).o.k;
                        if (aidoVar == null) {
                            aidoVar = aido.a;
                        }
                    }
                } while (!aidoVar.i);
                omm ommVar = (omm) this.k.io();
                ArrayList arrayList = new ArrayList(atqq.N(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((pot) it2.next()).a);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                ListenableFuture listenableFutureSubmit = ommVar.b.submit(new ium(ommVar, plxVar, (String[]) Arrays.copyOf(strArr, strArr.length), 12));
                listenableFutureSubmit.getClass();
                pccVar.c = 1;
                objAd = awrc.ad(listenableFutureSubmit, pccVar);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
            }
            return awnq.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objAd);
        objAd.getClass();
        Iterable iterable = (Iterable) objAd;
        ArrayList arrayList2 = new ArrayList(atqq.N(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((pot) it3.next()).a);
        }
        return atqq.aw(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0129  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0146  */
    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:49:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01be  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [pcm] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    public final Object d(plx plxVar, List list, pax paxVar, boolean z, awoq awoqVar) throws Throwable {
        pcd pcdVar;
        pax paxVar2;
        boolean z2;
        plx plxVar2;
        boolean z3;
        pax paxVar3;
        Map map;
        List list2;
        Set set;
        ?? r7;
        ?? r2;
        ?? r6;
        List listAp;
        pot potVar;
        pgc pgcVar;
        Set set2;
        Map map2;
        aido aidoVar;
        List listH;
        pot potVarG;
        boolean zC;
        plx plxVar3 = plxVar;
        List list3 = list;
        if (awoqVar instanceof pcd) {
            pcdVar = (pcd) awoqVar;
            int i = pcdVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcdVar.j = i - Integer.MIN_VALUE;
            } else {
                pcdVar = new pcd(this, awoqVar);
            }
        } else {
            pcdVar = new pcd(this, awoqVar);
        }
        Object objA = pcdVar.h;
        awox awoxVar = awox.a;
        int i2 = pcdVar.j;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = pcdVar.g;
                pax paxVar4 = (pax) pcdVar.b;
                List list4 = (List) pcdVar.a;
                plx plxVar4 = pcdVar.k;
                atqp.j(objA);
                z2 = z4;
                paxVar2 = paxVar4;
                list3 = list4;
                plxVar3 = plxVar4;
            } else if (i2 == 2) {
                z3 = pcdVar.g;
                Map map3 = (Map) pcdVar.c;
                pax paxVar5 = (pax) pcdVar.b;
                list2 = (List) pcdVar.a;
                plx plxVar5 = pcdVar.k;
                atqp.j(objA);
                map = map3;
                paxVar3 = paxVar5;
                plxVar2 = plxVar5;
                set = (Set) objA;
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = list2.iterator();
                r7 = arrayList;
                r2 = it;
                r6 = linkedHashSet;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = pcdVar.g;
                Object obj = pcdVar.f;
                Object obj2 = pcdVar.e;
                Object obj3 = pcdVar.d;
                set = (Set) pcdVar.c;
                map = (Map) pcdVar.b;
                paxVar3 = (pax) pcdVar.a;
                plxVar2 = pcdVar.k;
                atqp.j(objA);
                r2 = obj;
                r6 = obj2;
                r7 = obj3;
            }
            while (r2.hasNext()) {
                potVar = (pot) r2.next();
                pgcVar = (pgc) map.get(potVar.a);
                if (pgcVar != null) {
                    map2 = map;
                    set2 = set;
                    if (pgcVar.c > potVar.c) {
                        potVarG = pot.g(potVar, pgcVar.h, pgcVar.d, pgcVar.f, pgcVar.g, null, 268435425);
                        zC = nvo.c(potVar);
                        boolean zC2 = nvo.c(potVarG);
                        if (!zC && zC2) {
                            r6.add(potVarG);
                        }
                        potVar = potVarG;
                    }
                } else {
                    set2 = set;
                    map2 = map;
                }
                aidoVar = potVar.o.k;
                if (aidoVar == null) {
                    aidoVar = aido.a;
                }
                if (aidoVar.i) {
                    set = set2;
                    if (set.contains(potVar.a)) {
                        r6.add(potVar);
                        listH = atqq.H(potVar);
                        pcdVar.k = plxVar2;
                        pcdVar.a = paxVar3;
                        map = map2;
                        pcdVar.b = map;
                        pcdVar.c = set;
                        pcdVar.d = r7;
                        pcdVar.e = r6;
                        pcdVar.f = r2;
                        pcdVar.g = z3;
                        pcdVar.j = 3;
                        if (l(plxVar2, listH, z3, pcdVar) == awoxVar) {
                            return awoxVar;
                        }
                    }
                } else {
                    set = set2;
                }
                map = map2;
                r7.add(potVar);
            }
            listAp = atqq.ap(r6);
            if (!listAp.isEmpty()) {
                paw pawVarA = this.g.a(ahyy.THREAD_ALREADY_DISMISSED);
                pawVarA.f(plxVar2);
                pawVarA.c(listAp);
                pbc pbcVar = (pbc) pawVarA;
                pbcVar.r = 2;
                pbcVar.k = paxVar3;
                pawVarA.a();
            }
            return r7;
        }
        atqp.j(objA);
        ArrayList arrayList2 = new ArrayList(atqq.N(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((pot) it2.next()).a);
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        pfl pflVar = (pfl) this.o.C(plxVar3);
        List listAR = atqq.aR(strArr);
        pcdVar.k = plxVar3;
        pcdVar.a = list3;
        paxVar2 = paxVar;
        pcdVar.b = paxVar2;
        z2 = z;
        pcdVar.g = z2;
        pcdVar.j = 1;
        objA = pflVar.a(listAR, pcdVar);
        if (objA == awoxVar) {
            return awoxVar;
        }
        List list5 = (List) objA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(list5, 10)), 16));
        for (Object obj4 : list5) {
            linkedHashMap.put(((pgc) obj4).b, obj4);
        }
        pcdVar.k = plxVar3;
        pcdVar.a = list3;
        pcdVar.b = paxVar2;
        pcdVar.c = linkedHashMap;
        pcdVar.g = z2;
        pcdVar.j = 2;
        objA = c(plxVar3, list3, pcdVar);
        if (objA == awoxVar) {
            return awoxVar;
        }
        plxVar2 = plxVar3;
        z3 = z2;
        paxVar3 = paxVar2;
        map = linkedHashMap;
        list2 = list3;
        set = (Set) objA;
        ArrayList arrayList3 = new ArrayList();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it3 = list2.iterator();
        r7 = arrayList3;
        r2 = it3;
        r6 = linkedHashSet2;
        while (r2.hasNext()) {
            potVar = (pot) r2.next();
            pgcVar = (pgc) map.get(potVar.a);
            if (pgcVar != null) {
                map2 = map;
                set2 = set;
                if (pgcVar.c > potVar.c) {
                    potVarG = pot.g(potVar, pgcVar.h, pgcVar.d, pgcVar.f, pgcVar.g, null, 268435425);
                    zC = nvo.c(potVar);
                    boolean zC3 = nvo.c(potVarG);
                    if (!zC) {
                        r6.add(potVarG);
                    }
                    potVar = potVarG;
                }
            } else {
                set2 = set;
                map2 = map;
            }
            aidoVar = potVar.o.k;
            if (aidoVar == null) {
                aidoVar = aido.a;
            }
            if (aidoVar.i) {
                set = set2;
                if (set.contains(potVar.a)) {
                    r6.add(potVar);
                    listH = atqq.H(potVar);
                    pcdVar.k = plxVar2;
                    pcdVar.a = paxVar3;
                    map = map2;
                    pcdVar.b = map;
                    pcdVar.c = set;
                    pcdVar.d = r7;
                    pcdVar.e = r6;
                    pcdVar.f = r2;
                    pcdVar.g = z3;
                    pcdVar.j = 3;
                    if (l(plxVar2, listH, z3, pcdVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            } else {
                set = set2;
            }
            map = map2;
            r7.add(potVar);
        }
        listAp = atqq.ap(r6);
        if (!listAp.isEmpty()) {
            paw pawVarA2 = this.g.a(ahyy.THREAD_ALREADY_DISMISSED);
            pawVarA2.f(plxVar2);
            pawVarA2.c(listAp);
            pbc pbcVar2 = (pbc) pawVarA2;
            pbcVar2.r = 2;
            pbcVar2.k = paxVar3;
            pawVarA2.a();
        }
        return r7;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[PHI: r6 r7 r8
      0x0058: PHI (r6v5 ??) = (r6v11 ??), (r6v12 ??) binds: [B:18:0x0054, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r7v1 plx) = (r7v0 plx), (r7v2 plx) binds: [B:18:0x0054, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r8v1 pot) = (r8v0 pot), (r8v2 pot) binds: [B:18:0x0054, B:24:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:23:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object e(defpackage.plx r7, defpackage.pot r8, defpackage.awoq r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.pce
            if (r0 == 0) goto L13
            r0 = r9
            pce r0 = (defpackage.pce) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pce r0 = new pce
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            awox r1 = defpackage.awox.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r6 = r0.a
            pot r7 = r0.e
            plx r8 = r0.f
            defpackage.atqp.j(r9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L72
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.atqp.j(r9)
            aunn r6 = r6.e
            java.lang.Object r6 = r6.io()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r9 = r6 instanceof java.util.Collection
            if (r9 == 0) goto L54
            r9 = r6
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L77
        L54:
            java.util.Iterator r6 = r6.iterator()
        L58:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L77
            java.lang.Object r9 = r6.next()
            pyp r9 = (defpackage.pyp) r9
            r0.f = r7
            r0.e = r8
            r0.a = r6
            r0.d = r4
            java.lang.Object r9 = r9.a()
            if (r9 == r1) goto L7b
        L72:
            pyo r2 = defpackage.pyo.a
            if (r9 == r2) goto L58
            r3 = r4
        L77:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcm.e(plx, pot, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [pcm] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0111 -> B:18:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x0074
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(defpackage.plx r15, java.util.EnumMap r16, java.util.List r17, defpackage.pax r18, boolean r19, defpackage.awoq r20) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcm.f(plx, java.util.EnumMap, java.util.List, pax, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object g(plx plxVar, List list, pax paxVar, awoq awoqVar) throws Throwable {
        pcg pcgVar;
        Object obj;
        ?? it;
        if (awoqVar instanceof pcg) {
            pcgVar = (pcg) awoqVar;
            int i = pcgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcgVar.e = i - Integer.MIN_VALUE;
            } else {
                pcgVar = new pcg(this, awoqVar);
            }
        } else {
            pcgVar = new pcg(this, awoqVar);
        }
        Object obj2 = pcgVar.c;
        awox awoxVar = awox.a;
        int i2 = pcgVar.e;
        if (i2 == 0) {
            atqp.j(obj2);
            it = ((Set) this.e.io()).iterator();
            obj = list;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = pcgVar.b;
            paxVar = pcgVar.f;
            Object obj4 = pcgVar.a;
            plxVar = pcgVar.g;
            atqp.j(obj2);
            it = obj3;
            obj = obj4;
        }
        while (it.hasNext()) {
            pyp pypVar = (pyp) it.next();
            pcgVar.g = plxVar;
            pcgVar.a = obj;
            pcgVar.f = paxVar;
            pcgVar.b = it;
            pcgVar.e = 1;
            if (pypVar.e() == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x014a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0156  */
    /* JADX WARN: Code duplicated, block: B:35:0x0160  */
    /* JADX WARN: Code duplicated, block: B:37:0x016b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0183  */
    /* JADX WARN: Code duplicated, block: B:40:0x0186  */
    /* JADX WARN: Code duplicated, block: B:42:0x0189  */
    /* JADX WARN: Code duplicated, block: B:44:0x018f  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0208  */
    /* JADX WARN: Code duplicated, block: B:55:0x021b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r19v0, types: [pcm] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0208 -> B:54:0x0215). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x021b -> B:30:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object h(defpackage.plx r20, java.util.List r21, defpackage.plb r22, defpackage.pax r23, boolean r24, boolean r25, boolean r26, defpackage.awoq r27) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcm.h(plx, java.util.List, plb, pax, boolean, boolean, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    /* JADX WARN: Code duplicated, block: B:38:0x0126  */
    /* JADX WARN: Code duplicated, block: B:40:0x013b  */
    /* JADX WARN: Code duplicated, block: B:41:0x016a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0173  */
    /* JADX WARN: Code duplicated, block: B:45:0x017f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0198  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final Object i(plx plxVar, pot potVar, plb plbVar, pax paxVar, EnumMap enumMap, boolean z, boolean z2, boolean z3, awoq awoqVar) throws Throwable {
        pck pckVar;
        elr elrVar;
        Optional optionalU;
        Optional optionalS;
        ajcs ajcsVar;
        ajji ajjiVar;
        elr elrVar2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        plb plbVar2;
        plx plxVar2;
        pot potVar2;
        long j;
        pax paxVar2;
        ?? r11;
        boolean zEquals;
        qac qacVar;
        long jB;
        phe pheVar;
        pcv pcvVar;
        qab qabVar;
        Object arrayList;
        if (awoqVar instanceof pck) {
            pckVar = (pck) awoqVar;
            int i = pckVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                pckVar.h = i - Integer.MIN_VALUE;
            } else {
                pckVar = new pck(this, awoqVar);
            }
        } else {
            pckVar = new pck(this, awoqVar);
        }
        Object qacVar2 = pckVar.f;
        awox awoxVar = awox.a;
        int i2 = pckVar.h;
        if (i2 == 0) {
            atqp.j(qacVar2);
            ozj ozjVarB = nvj.b(potVar);
            agev agevVarA = ((pcn) this.f.io()).a(ozjVarB);
            if (agevVarA.g()) {
                long jB2 = this.l.b();
                aczl aczlVar = (aczl) agevVarA.c();
                pckVar.k = plxVar;
                pckVar.i = potVar;
                pckVar.l = plbVar;
                pckVar.j = paxVar;
                pckVar.a = enumMap;
                pckVar.b = z;
                pckVar.c = z2;
                pckVar.d = z3;
                pckVar.e = jB2;
                pckVar.h = 1;
                if (plxVar != null) {
                    zzt zztVar = (zzt) aczlVar.c;
                    zwa zwaVarE = ((zwb) zztVar.b.io()).e();
                    pxk pxkVarB = plxVar.b();
                    if (pxkVarB instanceof pyb) {
                        zEquals = zwaVarE.h();
                    } else if (pxkVarB instanceof pxl) {
                        zEquals = Objects.equals(zwaVarE.l(), ((pxl) pxkVarB).a);
                    } else {
                        if (pxkVarB instanceof pxo) {
                            Optional optionalA = zztVar.a(zwaVarE);
                            if (!optionalA.isEmpty()) {
                                zEquals = Objects.equals(optionalA.get(), ((pxo) pxkVarB).a);
                            }
                        } else {
                            ((agrc) ((agrc) zzt.a.c()).k("com/google/android/libraries/youtube/notification/chime/ChimeIdentityProvider", "isLoggedInUser", 217, "ChimeIdentityProvider.java")).t("Unsupported account type was provided by Chime.");
                        }
                        qacVar2 = new qac(true, qab.f);
                    }
                    if (zEquals) {
                        elrVar = (elr) aczlVar.g;
                        optionalU = elrVar.u(ozjVarB.c, ajjj.a);
                        if (optionalU.isPresent()) {
                            ajjiVar = (ajji) optionalU.get();
                            elrVar2 = (elr) aczlVar.d;
                            elrVar2.p(aaao.RECEIVED, true);
                            if ((ajjiVar.b & 1) != 0) {
                                aczlVar.b.execute(afwl.i(new fuc(aczlVar, ajjiVar, 15)));
                                z4 = true;
                                ((qtf) ((aerv) elrVar2.a).j.io()).b(1L, aaam.GNP_RECEIVED.name());
                            } else {
                                z4 = true;
                            }
                            qacVar2 = new qac(z4, qab.c);
                        } else {
                            optionalS = elrVar.s(ozjVarB);
                            if (optionalS.isPresent()) {
                                ajcsVar = (ajcs) optionalS.get();
                                ((elr) aczlVar.d).p(aaao.RECEIVED, false);
                                if (ajcsVar.i.size() > 0) {
                                    aczlVar.b.execute(afwl.i(new fuc(aczlVar, ajcsVar, 14)));
                                }
                            }
                            ((elr) aczlVar.f).x(ozjVarB.a, aczlVar.e.b(xhb.a(28631), null, null));
                            qacVar2 = new qac(false, null);
                        }
                    } else {
                        qacVar2 = new qac(true, qab.f);
                    }
                } else {
                    elrVar = (elr) aczlVar.g;
                    optionalU = elrVar.u(ozjVarB.c, ajjj.a);
                    if (optionalU.isPresent()) {
                        ajjiVar = (ajji) optionalU.get();
                        elrVar2 = (elr) aczlVar.d;
                        elrVar2.p(aaao.RECEIVED, true);
                        if ((ajjiVar.b & 1) != 0) {
                            aczlVar.b.execute(afwl.i(new fuc(aczlVar, ajjiVar, 15)));
                            z4 = true;
                            ((qtf) ((aerv) elrVar2.a).j.io()).b(1L, aaam.GNP_RECEIVED.name());
                        } else {
                            z4 = true;
                        }
                        qacVar2 = new qac(z4, qab.c);
                    } else {
                        optionalS = elrVar.s(ozjVarB);
                        if (optionalS.isPresent()) {
                            ajcsVar = (ajcs) optionalS.get();
                            ((elr) aczlVar.d).p(aaao.RECEIVED, false);
                            if (ajcsVar.i.size() > 0) {
                                aczlVar.b.execute(afwl.i(new fuc(aczlVar, ajcsVar, 14)));
                            }
                        }
                        ((elr) aczlVar.f).x(ozjVarB.a, aczlVar.e.b(xhb.a(28631), null, null));
                        qacVar2 = new qac(false, null);
                    }
                }
                if (qacVar2 == awoxVar) {
                    return awoxVar;
                }
                z5 = z2;
                z6 = z3;
                z7 = z;
                plbVar2 = plbVar;
                plxVar2 = plxVar;
                potVar2 = potVar;
                j = jB2;
                paxVar2 = paxVar;
                r11 = enumMap;
                qacVar = (qac) qacVar2;
                jB = this.l.b() - j;
                if (qacVar.a) {
                    qabVar = qacVar.b;
                    if (qabVar != null) {
                        arrayList = r11.get(qabVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            r11.put(qabVar, arrayList);
                        }
                        ((List) arrayList).add(potVar2);
                    }
                } else {
                    if (paxVar2 != null) {
                        paxVar2.d = new Long(jB);
                    }
                    pheVar = this.d;
                    pcvVar = new pcv(nvu.a(plxVar2), plbVar2, paxVar2, null, z7, z5, null, z6, 200);
                    pckVar.k = null;
                    pckVar.i = null;
                    pckVar.l = null;
                    pckVar.j = null;
                    pckVar.a = null;
                    pckVar.h = 2;
                    if (pheVar.d(potVar2, pcvVar, pckVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            } else {
                phe pheVar2 = this.d;
                pcv pcvVar2 = new pcv(nvu.a(plxVar), plbVar, paxVar, null, z, z2, null, z3, 200);
                pckVar.h = 3;
                if (pheVar2.d(potVar, pcvVar2, pckVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else if (i2 == 1) {
            j = pckVar.e;
            boolean z8 = pckVar.d;
            boolean z9 = pckVar.c;
            boolean z10 = pckVar.b;
            Object obj = pckVar.a;
            paxVar2 = pckVar.j;
            plb plbVar3 = pckVar.l;
            potVar2 = pckVar.i;
            plxVar2 = pckVar.k;
            atqp.j(qacVar2);
            z6 = z8;
            z5 = z9;
            z7 = z10;
            plbVar2 = plbVar3;
            r11 = obj;
            qacVar = (qac) qacVar2;
            jB = this.l.b() - j;
            if (qacVar.a) {
                qabVar = qacVar.b;
                if (qabVar != null) {
                    arrayList = r11.get(qabVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        r11.put(qabVar, arrayList);
                    }
                    ((List) arrayList).add(potVar2);
                }
            } else {
                if (paxVar2 != null) {
                    paxVar2.d = new Long(jB);
                }
                pheVar = this.d;
                pcvVar = new pcv(nvu.a(plxVar2), plbVar2, paxVar2, null, z7, z5, null, z6, 200);
                pckVar.k = null;
                pckVar.i = null;
                pckVar.l = null;
                pckVar.j = null;
                pckVar.a = null;
                pckVar.h = 2;
                if (pheVar.d(potVar2, pcvVar, pckVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(qacVar2);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object j(plx plxVar, List list, aiff aiffVar, int i, ahza ahzaVar, awoq awoqVar) throws Throwable {
        pch pchVar;
        Object obj;
        ?? it;
        if (awoqVar instanceof pch) {
            pchVar = (pch) awoqVar;
            int i2 = pchVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pchVar.e = i2 - Integer.MIN_VALUE;
            } else {
                pchVar = new pch(this, awoqVar);
            }
        } else {
            pchVar = new pch(this, awoqVar);
        }
        Object obj2 = pchVar.c;
        awox awoxVar = awox.a;
        int i3 = pchVar.e;
        if (i3 == 0) {
            atqp.j(obj2);
            it = ((Set) this.e.io()).iterator();
            obj = list;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = pchVar.b;
            ahzaVar = pchVar.g;
            i = pchVar.h;
            aiffVar = pchVar.f;
            Object obj4 = pchVar.a;
            plxVar = pchVar.i;
            atqp.j(obj2);
            it = obj3;
            obj = obj4;
        }
        while (it.hasNext()) {
            pyp pypVar = (pyp) it.next();
            pchVar.i = plxVar;
            pchVar.a = obj;
            pchVar.f = aiffVar;
            pchVar.h = i;
            pchVar.g = ahzaVar;
            pchVar.b = it;
            pchVar.e = 1;
            if (pypVar.g() == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
