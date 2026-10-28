package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class teq implements tes {
    public final awut a;
    public final awou b;
    public final awou c;
    public final mbc d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public awwd i;
    public volatile tew j;
    private final awmd k;
    private final awmd l;
    private final awmd m;

    public teq(awut awutVar, awou awouVar, awou awouVar2, mbc mbcVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        awutVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        mbcVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        this.a = awutVar;
        this.b = awouVar;
        this.c = awouVar2;
        this.d = mbcVar;
        this.k = awmdVar;
        this.l = awmdVar2;
        this.m = awmdVar3;
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.j = tew.a;
    }

    public static final tew i(tew tewVar) {
        int iOrdinal = tewVar.ordinal();
        if (iOrdinal == 1) {
            return tew.c;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return tew.e;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [awut] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:23:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.awut r6, java.util.List r7, defpackage.awoq r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ten
            if (r0 == 0) goto L13
            r0 = r8
            ten r0 = (defpackage.ten) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ten r0 = new ten
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.d
            awox r8 = defpackage.awox.a
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            int r6 = r0.c
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = r0.a
            defpackage.atqp.j(r5)     // Catch: java.lang.Exception -> L2e
            r5 = r1
            goto L61
        L2e:
            r5 = r1
            goto L63
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            defpackage.atqp.j(r5)
            java.util.Iterator r5 = r7.iterator()
            r7 = 0
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L44:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            acyg r1 = (defpackage.acyg) r1
            defpackage.awrc.M(r5)
            r0.a = r5     // Catch: java.lang.Exception -> L63
            r0.b = r7     // Catch: java.lang.Exception -> L63
            r0.c = r6     // Catch: java.lang.Exception -> L63
            r0.f = r2     // Catch: java.lang.Exception -> L63
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Exception -> L63
            if (r1 == r8) goto L6c
        L61:
            int r6 = r6 + r2
            goto L44
        L63:
            defpackage.awrc.M(r5)
            goto L44
        L67:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r6)
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.teq.a(awut, java.util.List, awoq):java.lang.Object");
    }

    @Override // defpackage.tes
    public final void b(tdz tdzVar, tew... tewVarArr) {
        tewVarArr.getClass();
        for (tew tewVar : tewVarArr) {
            ((CopyOnWriteArrayList) ConcurrentMap.EL.computeIfAbsent(this.e, tewVar, new rhk(new prq(13), 17))).addIfAbsent(tdzVar);
        }
    }

    @Override // defpackage.tes
    public final /* synthetic */ void c(tdz tdzVar) {
        tdzVar.getClass();
        tew[] tewVarArr = ter.a;
        b(tdzVar, (tew[]) Arrays.copyOf(tewVarArr, tewVarArr.length));
    }

    public final void d(tew tewVar) {
        if (this.j == tewVar) {
            this.i = null;
            this.j = tew.a;
        }
    }

    @Override // defpackage.tes
    public final void e(tef tefVar) {
        Collection<CopyOnWriteArrayList> collectionValues = this.e.values();
        collectionValues.getClass();
        for (CopyOnWriteArrayList copyOnWriteArrayList : collectionValues) {
            copyOnWriteArrayList.getClass();
            awro.d(copyOnWriteArrayList);
            copyOnWriteArrayList.remove(tefVar);
        }
        Collection<CopyOnWriteArrayList> collectionValues2 = this.f.values();
        collectionValues2.getClass();
        for (CopyOnWriteArrayList copyOnWriteArrayList2 : collectionValues2) {
            copyOnWriteArrayList2.getClass();
            awro.d(copyOnWriteArrayList2);
            copyOnWriteArrayList2.remove(tefVar);
        }
        Collection<CopyOnWriteArrayList> collectionValues3 = this.g.values();
        collectionValues3.getClass();
        for (CopyOnWriteArrayList copyOnWriteArrayList3 : collectionValues3) {
            copyOnWriteArrayList3.getClass();
            awro.d(copyOnWriteArrayList3);
            copyOnWriteArrayList3.remove(tefVar);
        }
    }

    public final boolean f() {
        Object obj = ((aupo) this.m).b;
        obj.getClass();
        tee teeVar = (tee) awrc.f((Optional) obj);
        return teeVar != null && teeVar.a();
    }

    @Override // defpackage.tes
    public final void g(acyg acygVar, tew... tewVarArr) {
        for (tew tewVar : tewVarArr) {
            ((CopyOnWriteArrayList) ConcurrentMap.EL.computeIfAbsent(this.f, tewVar, new rhk(new prq(11), 15))).addIfAbsent(acygVar);
        }
    }

    @Override // defpackage.tes
    public final void h(acqh acqhVar, tew... tewVarArr) {
        for (int i = 0; i < 3; i++) {
            ((CopyOnWriteArrayList) ConcurrentMap.EL.computeIfAbsent(this.g, tewVarArr[i], new rhk(new prq(12), 16))).addIfAbsent(acqhVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void j(tew tewVar, int i) {
        String strA;
        tew tewVarI;
        List list;
        Long l;
        int i2;
        Long l2;
        tew tewVar2 = tew.a;
        if (tewVar != tewVar2) {
            if (f() && a.x()) {
                Object obj = ((aupo) this.l).b;
                obj.getClass();
                tdy tdyVar = (tdy) awrc.f((Optional) obj);
                if (tdyVar != null) {
                    strA = tdyVar.a();
                } else {
                    strA = null;
                }
            } else {
                strA = null;
            }
            mbc mbcVar = this.d;
            awmd awmdVar = this.k;
            long jB = mbcVar.b();
            long jK = ((rnj) awmdVar.io()).k();
            ConcurrentHashMap concurrentHashMap = this.h;
            Long l3 = (Long) concurrentHashMap.get(tewVar);
            if ((l3 != null && jB - l3.longValue() < jK) || ((tewVarI = i(tewVar)) != null && (this.j == tewVarI || ((l = (Long) concurrentHashMap.get(tewVarI)) != null && jB - l.longValue() < jK)))) {
                if (f()) {
                    long jK2 = ((rnj) awmdVar.io()).k();
                    tew tewVarI2 = i(tewVar);
                    if (tewVarI2 == null || (this.j != tewVarI2 && ((l2 = (Long) concurrentHashMap.get(tewVarI2)) == null || jB - l2.longValue() >= jK2))) {
                        Long l4 = (Long) concurrentHashMap.get(tewVar);
                        i2 = (l4 == null || jB - l4.longValue() >= jK2) ? 1 : 2;
                    } else {
                        i2 = 3;
                    }
                    k(i, new tev(4, tewVar, false, true, i2, false, 0L, 0, 228), strA);
                    return;
                }
                return;
            }
            String str = strA;
            int i3 = 0;
            if (((vxz) ((rnj) awmdVar.io()).a).l(213, 45814561L, false)) {
                switch (tewVar.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        if (a.x()) {
                            awwd awwdVar = this.i;
                            boolean z = awwdVar != null && awwdVar.q();
                            if (z) {
                                awwd awwdVar2 = this.i;
                                if (awwdVar2 != null) {
                                    awwdVar2.p(null);
                                }
                                this.i = null;
                            }
                            concurrentHashMap.put(tewVar, Long.valueOf(jB));
                            if (!z) {
                                tewVar2 = this.j;
                            }
                            this.j = tewVar;
                            List list2 = (CopyOnWriteArrayList) this.e.get(tewVar);
                            if (list2 == null) {
                                list2 = awno.a;
                            }
                            List list3 = (CopyOnWriteArrayList) this.g.get(tewVar);
                            if (list3 == null) {
                                list3 = awno.a;
                            }
                            List list4 = (CopyOnWriteArrayList) this.f.get(tewVar);
                            if (list4 == null) {
                                list4 = awno.a;
                            }
                            long jB2 = mbcVar.b();
                            try {
                                Iterator it = list2.iterator();
                                list = list4;
                                int i4 = 0;
                                while (it.hasNext()) {
                                    try {
                                        try {
                                            ((tdz) it.next()).jz();
                                            i4++;
                                        } catch (Exception unused) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (this.j == tewVar && list.isEmpty()) {
                                            this.j = tewVar2;
                                        }
                                        throw th;
                                    }
                                }
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((acqh) it2.next()).V();
                                        i3++;
                                    } catch (Exception unused2) {
                                    }
                                    break;
                                }
                                if (this.j == tewVar && list.isEmpty()) {
                                    this.j = tewVar2;
                                }
                                if (!list.isEmpty()) {
                                    awwd awwdVarT = awro.t(this.a, this.c, 0, new teo(this, list, jB2, i, tewVar, z, i4, i3, str, null), 2);
                                    this.i = awwdVarT;
                                    awwdVarT.kJ(new pge(this, tewVar, 10, null));
                                    return;
                                } else {
                                    if (f()) {
                                        k(i, new tev(3, tewVar, z, false, 0, true, this.d.b() - jB2, i4 + i3, 24), str);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list = list4;
                            }
                        }
                        break;
                    default:
                        throw new awmj();
                }
            }
            awro.t(this.a, this.b, 0, new tem(this, tewVar, i, str, jB, null), 2);
        }
    }

    public final void k(int i, tev tevVar, String str) {
        if (f()) {
            try {
                Object obj = ((aupo) this.m).b;
                obj.getClass();
                tee teeVar = (tee) awrc.f((Optional) obj);
                if (teeVar == null || !teeVar.c()) {
                    return;
                }
                awro.t(this.a, this.c, 0, new tep(this, teeVar, i, tevVar, str, null), 2);
            } catch (Exception unused) {
            }
        }
    }
}
