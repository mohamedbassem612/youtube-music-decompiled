package defpackage;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pjv implements phe {
    public static final agsn a = agsn.h("GnpSdk");
    public final Context b;
    public final pls c;
    public final mbc d;
    public final awmd e;
    public final piz f;
    public final omm g;
    public final tld h;
    private final pcn i;
    private final agev j;
    private final pcn k;
    private final pgt l;
    private final pgy m;
    private final piy n;
    private final pav o;
    private final Map p;
    private final pjz q;
    private final aunn r;
    private final aunn s;
    private final aunn t;
    private final aunn u;
    private final aunn v;
    private final axff w;

    public pjv(Context context, pcn pcnVar, agev agevVar, pcn pcnVar2, pgt pgtVar, omm ommVar, pve pveVar, pgy pgyVar, piy piyVar, pav pavVar, pls plsVar, Map map, mbc mbcVar, pjz pjzVar, tld tldVar, aunn aunnVar, awmd awmdVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, piz pizVar, aunn aunnVar5) {
        context.getClass();
        pcnVar2.getClass();
        pgtVar.getClass();
        ommVar.getClass();
        pveVar.getClass();
        pgyVar.getClass();
        piyVar.getClass();
        pavVar.getClass();
        plsVar.getClass();
        mbcVar.getClass();
        tldVar.getClass();
        aunnVar.getClass();
        awmdVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        pizVar.getClass();
        aunnVar5.getClass();
        this.b = context;
        this.i = pcnVar;
        this.j = agevVar;
        this.k = pcnVar2;
        this.l = pgtVar;
        this.g = ommVar;
        this.m = pgyVar;
        this.n = piyVar;
        this.o = pavVar;
        this.c = plsVar;
        this.p = map;
        this.d = mbcVar;
        this.q = pjzVar;
        this.h = tldVar;
        this.r = aunnVar;
        this.e = awmdVar;
        this.s = aunnVar2;
        this.t = aunnVar3;
        this.u = aunnVar4;
        this.f = pizVar;
        this.v = aunnVar5;
        this.w = new axfi(false);
    }

    private final plt s() {
        plt pltVar = this.c.c;
        if (pltVar != null) {
            return pltVar;
        }
        throw new IllegalArgumentException("SystemTrayNotificationConfig must be set in GnpConfig for showing system tray notifications.");
    }

    private final Object t(Context context, String str, Notification notification, boolean z, pax paxVar, awoq awoqVar) {
        Object objA = nxe.a(this.w, new pjc(this, paxVar, context, z, str, notification, null), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    private final Object u(Context context, String str, awoq awoqVar) {
        Object objA = nxe.a(this.w, new pjm(this, context, str, (awoq) null, 1), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    private final Object v(pcv pcvVar, pot potVar, awoq awoqVar) {
        plx plxVarA = pcvVar.a();
        if (plxVarA != null && y(pcvVar)) {
            peq peqVar = (peq) this.v.io();
            aihf aihfVarCreateBuilder = aiff.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aext.D(aihfVarCreateBuilder);
            Object objD = peqVar.d(plxVarA, aext.B(aihfVarCreateBuilder), "com.google.android.libraries.notifications.NOTIFICATION_DROPPED", 1, new pbh(null, null, null, false), atqq.H(nxh.a(potVar)), 1, 7, awoqVar);
            if (objD == awox.a) {
                return objD;
            }
        }
        return awmy.a;
    }

    private final void w(pqf pqfVar) {
        ((pwf) this.e.io()).m(this.b.getPackageName(), this.c.a, Build.VERSION.SDK_INT, pqfVar.name());
    }

    private final void x(plx plxVar, List list, ahza ahzaVar, boolean z, agom agomVar, pax paxVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ahza ahzaVar2 = ahza.LIMIT_REACHED;
        if (ahzaVar == ahzaVar2 && agomVar != null) {
            for (Object obj : agomVar.q()) {
                obj.getClass();
                pbg pbgVar = (pbg) obj;
                Collection collectionC = agomVar.c(pbgVar);
                collectionC.getClass();
                Set setAw = atqq.aw(collectionC);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (setAw.contains(((pot) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                linkedHashSet.addAll(setAw);
                pav pavVar = this.o;
                ahzv ahzvVar = ahzv.REMOVED;
                paw pawVarB = pavVar.b(ahzvVar);
                pawVarB.f(plxVar);
                pawVarB.c(arrayList);
                pbc pbcVar = (pbc) pawVarB;
                pbcVar.r = 2;
                pbcVar.f = ahzaVar;
                pbcVar.o = z;
                if (pbcVar.b != ahzvVar || pbcVar.f != ahzaVar2) {
                    throw new IllegalStateException("Check failed.");
                }
                pbcVar.n = pbgVar;
                pbcVar.k = paxVar;
                pawVarB.a();
                w(pqf.D);
            }
        }
        if (linkedHashSet.size() != list.size()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (!linkedHashSet.contains(((pot) obj3).a)) {
                    arrayList2.add(obj3);
                }
            }
            paw pawVarB2 = this.o.b(ahzv.REMOVED);
            pawVarB2.f(plxVar);
            pawVarB2.c(arrayList2);
            pbc pbcVar2 = (pbc) pawVarB2;
            pbcVar2.r = 2;
            pbcVar2.f = ahzaVar;
            pbcVar2.o = z;
            pbcVar2.k = paxVar;
            pawVarB2.a();
            w(pqf.D);
        }
    }

    private static final boolean y(pcv pcvVar) {
        return (pcvVar.f || pcvVar.i) ? false : true;
    }

    @Override // defpackage.phe
    public final Object a(plx plxVar, List list, pax paxVar, pbh pbhVar, awoq awoqVar) {
        return nxe.a(this.w, new pjg(this, plxVar, list, paxVar, pbhVar, null), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.phe
    public final Object b(plx plxVar, pbh pbhVar, awoq awoqVar) throws Throwable {
        pjk pjkVar;
        if (awoqVar instanceof pjk) {
            pjkVar = (pjk) awoqVar;
            int i = pjkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjkVar.c = i - Integer.MIN_VALUE;
            } else {
                pjkVar = new pjk(this, awoqVar);
            }
        } else {
            pjkVar = new pjk(this, awoqVar);
        }
        Object objA = pjkVar.a;
        awox awoxVar = awox.a;
        int i2 = pjkVar.c;
        if (i2 == 0) {
            atqp.j(objA);
            axff axffVar = this.w;
            pjl pjlVar = new pjl(this, plxVar, pbhVar, null);
            pjkVar.c = 1;
            objA = nxe.a(axffVar, pjlVar, pjkVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objA);
        }
        objA.getClass();
        return objA;
    }

    @Override // defpackage.phe
    public final Object c(plx plxVar, List list, pbh pbhVar, awoq awoqVar) {
        return nxe.a(this.w, new ozq(list, this, plxVar, pbhVar, (awoq) null, 2), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x04db  */
    /* JADX WARN: Code duplicated, block: B:155:0x0530  */
    /* JADX WARN: Code duplicated, block: B:159:0x056c  */
    /* JADX WARN: Code duplicated, block: B:162:0x057a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0581  */
    /* JADX WARN: Code duplicated, block: B:166:0x0589  */
    /* JADX WARN: Code duplicated, block: B:185:0x05be  */
    /* JADX WARN: Code duplicated, block: B:187:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:188:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:189:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:191:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:194:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:196:0x0607  */
    /* JADX WARN: Code duplicated, block: B:197:0x060a A[LOOP:0: B:153:0x052a->B:197:0x060a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [pyt] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r35v0, types: [pjv] */
    /* JADX WARN: Type inference failed for: r38v1, types: [android.app.PendingIntent, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x056c -> B:160:0x0574). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.phe
    public final java.lang.Object d(defpackage.pot r36, defpackage.pcv r37, defpackage.awoq r38) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjv.d(pot, pcv, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final Object e(plx plxVar, List list, awoq awoqVar) throws Throwable {
        pjd pjdVar;
        plx plxVar2;
        ?? r7;
        if (awoqVar instanceof pjd) {
            pjdVar = (pjd) awoqVar;
            int i = pjdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjdVar.d = i - Integer.MIN_VALUE;
            } else {
                pjdVar = new pjd(this, awoqVar);
            }
        } else {
            pjdVar = new pjd(this, awoqVar);
        }
        Object obj = pjdVar.b;
        awox awoxVar = awox.a;
        int i2 = pjdVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                plxVar2 = plxVar;
                r7 = it;
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = pjdVar.a;
        plxVar2 = pjdVar.e;
        atqp.j(obj);
        r7 = obj2;
        while (r7.hasNext()) {
            pot potVar = (pot) r7.next();
            ppy ppyVar = (ppy) this.u.io();
            String str = potVar.a;
            pjdVar.e = plxVar2;
            pjdVar.a = r7;
            pjdVar.d = 1;
            if (ppyVar.a(18, plxVar2, str, pjdVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(pot potVar, pcv pcvVar, plx plxVar, awoq awoqVar) throws Throwable {
        pje pjeVar;
        Object next;
        if (awoqVar instanceof pje) {
            pjeVar = (pje) awoqVar;
            int i = pjeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjeVar.c = i - Integer.MIN_VALUE;
            } else {
                pjeVar = new pje(this, awoqVar);
            }
        } else {
            pjeVar = new pje(this, awoqVar);
        }
        Object obj = pjeVar.a;
        Object obj2 = awox.a;
        int i2 = pjeVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                pot potVar2 = pjeVar.d;
                atqp.j(obj);
                w(pqf.o);
                String str = potVar2.a;
                return Boolean.FALSE;
            }
            if (i2 == 2) {
                potVar = pjeVar.d;
                atqp.j(obj);
                w(pqf.p);
                String str2 = potVar.a;
                return Boolean.FALSE;
            }
            if (i2 == 3) {
                potVar = pjeVar.d;
                atqp.j(obj);
                w(pqf.q);
                ((agsj) a.b()).w("Skipping thread [%s]. Channel not found error.", potVar.a);
                return Boolean.FALSE;
            }
            if (i2 == 4) {
                potVar = pjeVar.d;
                atqp.j(obj);
                w(pqf.r);
                String str3 = potVar.a;
                return Boolean.FALSE;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            potVar = pjeVar.d;
            atqp.j(obj);
            w(pqf.r);
            String str4 = potVar.a;
            return Boolean.FALSE;
        }
        atqp.j(obj);
        s();
        if (!pcvVar.f) {
            agke agkeVarR = this.g.r(plxVar, potVar.a);
            agkeVarR.getClass();
            pot potVar3 = (pot) atqq.Z(agkeVarR);
            if (potVar3 != null) {
                if (potVar3.c >= potVar.c) {
                    paw pawVarA = this.o.a(ahyy.DROPPED_BY_VERSION);
                    pbc pbcVar = (pbc) pawVarA;
                    pbcVar.r = 2;
                    pawVarA.f(plxVar);
                    pawVarA.b(potVar);
                    pbcVar.k = pcvVar.c;
                    pawVarA.a();
                    if (auvy.c()) {
                        pjeVar.d = potVar;
                        pjeVar.c = 2;
                        if (v(pcvVar, potVar, pjeVar) == obj2) {
                            return obj2;
                        }
                    }
                    w(pqf.p);
                    String str5 = potVar.a;
                    return Boolean.FALSE;
                }
            }
        }
        Context context = this.b;
        if (qnl.ab(context)) {
            pgy pgyVar = this.m;
            String strA = pgyVar.a(potVar);
            if (TextUtils.isEmpty(strA)) {
                paw pawVarA2 = this.o.a(ahyy.CHANNEL_NOT_FOUND);
                pbc pbcVar2 = (pbc) pawVarA2;
                pbcVar2.r = 2;
                pawVarA2.f(plxVar);
                pawVarA2.b(potVar);
                pbcVar2.k = pcvVar.c;
                pawVarA2.a();
                if (auvy.c()) {
                    pjeVar.d = potVar;
                    pjeVar.c = 3;
                    if (v(pcvVar, potVar, pjeVar) == obj2) {
                        return obj2;
                    }
                }
                w(pqf.q);
                ((agsj) a.b()).w("Skipping thread [%s]. Channel not found error.", potVar.a);
                return Boolean.FALSE;
            }
            if (!pgyVar.e(strA)) {
                paw pawVarA3 = this.o.a(ahyy.CHANNEL_BLOCKED);
                pbc pbcVar3 = (pbc) pawVarA3;
                pbcVar3.r = 2;
                pawVarA3.f(plxVar);
                Iterator it = pbcVar3.c.c().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!awrc.c(((pgv) next).a, strA));
                pbcVar3.i = (pgv) next;
                pawVarA3.b(potVar);
                pbcVar3.k = pcvVar.c;
                pawVarA3.a();
                if (auvy.c()) {
                    pjeVar.d = potVar;
                    pjeVar.c = 4;
                    if (v(pcvVar, potVar, pjeVar) == obj2) {
                        return obj2;
                    }
                }
                w(pqf.r);
                String str6 = potVar.a;
                return Boolean.FALSE;
            }
        }
        if (new auy(context).c()) {
            return Boolean.TRUE;
        }
        paw pawVarA4 = this.o.a(ahyy.USER_BLOCKED);
        pbc pbcVar4 = (pbc) pawVarA4;
        pbcVar4.r = 2;
        pawVarA4.f(plxVar);
        pawVarA4.b(potVar);
        pbcVar4.k = pcvVar.c;
        pawVarA4.a();
        if (auvy.c()) {
            pjeVar.d = potVar;
            pjeVar.c = 5;
            if (v(pcvVar, potVar, pjeVar) == obj2) {
                return obj2;
            }
        }
        w(pqf.r);
        String str7 = potVar.a;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:33:0x00d6->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [pjv] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Iterator] */
    public final Object g(plx plxVar, agke agkeVar, awoq awoqVar) throws Throwable {
        pjf pjfVar;
        Object obj;
        ?? it;
        Set set;
        Iterator it2;
        Object obj2;
        String strE;
        Context context;
        if (awoqVar instanceof pjf) {
            pjfVar = (pjf) awoqVar;
            int i = pjfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjfVar.f = i - Integer.MIN_VALUE;
            } else {
                pjfVar = new pjf(this, awoqVar);
            }
        } else {
            pjfVar = new pjf(this, awoqVar);
        }
        Object obj3 = pjfVar.d;
        awox awoxVar = awox.a;
        int i2 = pjfVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj4 = pjfVar.c;
                set = (Set) pjfVar.b;
                obj = pjfVar.a;
                atqp.j(obj3);
                it = obj4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) pjfVar.b;
                obj2 = pjfVar.a;
                atqp.j(obj3);
            }
            while (it2.hasNext()) {
                strE = pjx.e((pcu) obj2, (String) it2.next());
                context = this.b;
                pjfVar.a = obj2;
                pjfVar.b = it2;
                pjfVar.c = null;
                pjfVar.f = 2;
                if (u(context, strE, pjfVar) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        atqp.j(obj3);
        pcu pcuVarA = nvu.a(plxVar);
        ArrayList arrayList = new ArrayList(atqq.N(agkeVar, 10));
        agqs agqsVarListIterator = agkeVar.listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            arrayList.add(((pot) agqsVarListIterator.next()).q);
        }
        Set setAw = atqq.aw(arrayList);
        ArrayList arrayList2 = new ArrayList(atqq.N(agkeVar, 10));
        agqs agqsVarListIterator2 = agkeVar.listIterator(0);
        while (agqsVarListIterator2.hasNext()) {
            arrayList2.add(((pot) agqsVarListIterator2.next()).a);
        }
        obj = pcuVarA;
        it = this.h.E(pcuVarA, atqq.aw(arrayList2)).entrySet().iterator();
        set = setAw;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pjw pjwVar = (pjw) entry.getValue();
            if (pjwVar != null) {
                Context context2 = this.b;
                pjfVar.a = obj;
                pjfVar.b = set;
                pjfVar.c = it;
                pjfVar.f = 1;
                if (k(context2, pjwVar, pjfVar) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        it2 = set.iterator();
        obj2 = obj;
        while (it2.hasNext()) {
            strE = pjx.e((pcu) obj2, (String) it2.next());
            context = this.b;
            pjfVar.a = obj2;
            pjfVar.b = it2;
            pjfVar.c = null;
            pjfVar.f = 2;
            if (u(context, strE, pjfVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [pjv] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x018c -> B:37:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x023f -> B:15:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(defpackage.pcv r17, defpackage.pot r18, defpackage.pot r19, defpackage.pjy r20, defpackage.awoq r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjv.h(pcv, pot, pot, pjy, awoq):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12361. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object i(defpackage.pot r22, java.lang.String r23, defpackage.pcv r24, java.lang.String r25, defpackage.atr r26, defpackage.pzp r27, defpackage.pfm r28, defpackage.pot r29, boolean r30, defpackage.awoq r31) {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjv.i(pot, java.lang.String, pcv, java.lang.String, atr, pzp, pfm, pot, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x013b  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0187  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x0199  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:77:0x0209  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0216  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v16, types: [agfr, java.lang.Object] */
    public final Object j(pot potVar, pcv pcvVar, String str, atr atrVar, pzp pzpVar, pfm pfmVar, pot potVar2, boolean z, awoq awoqVar) throws Throwable {
        pjj pjjVar;
        pcv pcvVar2;
        pjw pjwVar;
        String str2;
        pzp pzpVar2;
        pot potVar3;
        atr atrVar2;
        pfm pfmVar2;
        boolean z2;
        pjy pjyVar;
        String str3;
        atr atrVar3;
        boolean z3;
        pzp pzpVar3;
        pcv pcvVar3;
        pot potVar4;
        pfm pfmVar3;
        pot potVar5;
        pot potVar6;
        pot potVar7;
        pjy pjyVar2;
        Object objH;
        pjv pjvVar;
        pot potVar8;
        StatusBarNotification[] statusBarNotificationArrA;
        ArrayList<StatusBarNotification> arrayList;
        int i;
        int iB;
        Iterator it;
        int i2;
        String strC;
        int iA;
        int i3;
        int iMin;
        int iMin2;
        pot potVar9 = potVar;
        if (awoqVar instanceof pjj) {
            pjjVar = (pjj) awoqVar;
            int i4 = pjjVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pjjVar.f = i4 - Integer.MIN_VALUE;
            } else {
                pjjVar = new pjj(this, awoqVar);
            }
        } else {
            pjjVar = new pjj(this, awoqVar);
        }
        pjj pjjVar2 = pjjVar;
        Object objA = pjjVar2.d;
        awox awoxVar = awox.a;
        int i5 = pjjVar2.f;
        char c = 1;
        if (i5 != 0) {
            if (i5 == 1) {
                boolean z4 = pjjVar2.c;
                potVar4 = pjjVar2.k;
                pfmVar3 = pjjVar2.j;
                pzpVar3 = pjjVar2.i;
                atr atrVar4 = (atr) pjjVar2.b;
                String str4 = (String) pjjVar2.a;
                pcvVar3 = pjjVar2.h;
                potVar5 = pjjVar2.g;
                atqp.j(objA);
                atrVar3 = atrVar4;
                str3 = str4;
                z3 = z4;
            } else {
                if (i5 == 2) {
                    pjyVar2 = (pjy) pjjVar2.b;
                    potVar7 = (pot) pjjVar2.a;
                    pcvVar2 = pjjVar2.h;
                    potVar6 = pjjVar2.g;
                    atqp.j(objA);
                    c = 1;
                    if (pjyVar2 != null) {
                        pjjVar2.g = potVar6;
                        pjjVar2.h = null;
                        pjjVar2.a = null;
                        pjjVar2.b = null;
                        pjjVar2.i = null;
                        pjjVar2.j = null;
                        pjjVar2.k = null;
                        pjjVar2.f = 3;
                        pot potVar10 = potVar6;
                        objH = h(pcvVar2, potVar10, potVar7, pjyVar2, pjjVar2);
                        pjvVar = this;
                        potVar8 = potVar10;
                        if (objH == awoxVar) {
                            return awoxVar;
                        }
                    }
                    return awmy.a;
                }
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                potVar8 = pjjVar2.g;
                atqp.j(objA);
                pjvVar = this;
                c = 1;
            }
            Context context = pjvVar.b;
            Object systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            systemService.getClass();
            statusBarNotificationArrA = nvz.a((NotificationManager) systemService);
            arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : statusBarNotificationArrA) {
                if (pjx.h(statusBarNotification, pjvVar.c)) {
                    arrayList.add(statusBarNotification);
                }
            }
            iB = nvk.b(potVar8);
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                it = arrayList.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (ato.e(((StatusBarNotification) it.next()).getNotification()) && (i2 = i2 + 1) < 0) {
                        atqq.L();
                    }
                }
            }
            strC = nvk.c(potVar8);
            iA = nvk.a(potVar8);
            if (strC.length() != 0 || arrayList.isEmpty()) {
                i3 = 0;
            } else {
                i3 = 0;
                for (StatusBarNotification statusBarNotification2 : arrayList) {
                    if (pjx.d(statusBarNotification2) != null && awrc.c(pjx.d(statusBarNotification2), strC) && (i3 = i3 + 1) < 0) {
                        atqq.L();
                    }
                }
            }
            if (iB > 0) {
                iMin = Math.min(10, Math.max(0, i2 - iB));
            } else {
                iMin = 0;
            }
            if (iA > 0) {
                iMin2 = Math.min(10, Math.max(0, i3 - iA));
            } else {
                iMin2 = 0;
            }
            pwf pwfVar = (pwf) pjvVar.e.io();
            pls plsVar = pjvVar.c;
            String packageName = context.getPackageName();
            qtf qtfVar = (qtf) pwfVar.n.io();
            String str5 = plsVar.a;
            Integer numValueOf = Integer.valueOf(iB);
            Integer numValueOf2 = Integer.valueOf(iMin);
            Integer numValueOf3 = Integer.valueOf(iA);
            Integer numValueOf4 = Integer.valueOf(iMin2);
            Object[] objArr = new Object[6];
            objArr[0] = packageName;
            objArr[c] = str5;
            objArr[2] = numValueOf;
            objArr[3] = numValueOf2;
            objArr[4] = numValueOf3;
            objArr[5] = numValueOf4;
            qtfVar.b(1L, objArr);
            return awmy.a;
        }
        atqp.j(objA);
        if (pcvVar.h) {
            pjz pjzVar = this.q;
            pcu pcuVar = pcvVar.a;
            pjjVar2.g = potVar9;
            pjjVar2.h = pcvVar;
            str3 = str;
            pjjVar2.a = str3;
            atrVar3 = atrVar;
            pjjVar2.b = atrVar3;
            pjjVar2.i = pzpVar;
            pjjVar2.j = pfmVar;
            pjjVar2.k = potVar2;
            z3 = z;
            pjjVar2.c = z3;
            pjjVar2.f = 1;
            objA = pjzVar.a(pcuVar, potVar9, potVar2, pjjVar2);
            if (objA == awoxVar) {
                return awoxVar;
            }
            pzpVar3 = pzpVar;
            pcvVar3 = pcvVar;
            potVar4 = potVar2;
            pfmVar3 = pfmVar;
            potVar5 = potVar9;
        } else {
            tld tldVar = this.h;
            pcu pcuVar2 = pcvVar.a;
            String str6 = potVar9.a;
            pjw pjwVarD = tldVar.D(pcuVar2, str6);
            if (pjwVarD == null) {
                if (!auwb.a.io().c()) {
                    ((agsj) a.c()).t("Tray management instructions shouldn't be applied but thread is not in tray, dropping notification.");
                    this.g.s(pcvVar.a(), str6);
                    return awmy.a;
                }
                pjwVarD = pjx.c(pcuVar2, potVar9);
            }
            pcvVar2 = pcvVar;
            pjwVar = pjwVarD;
            str2 = str;
            pzpVar2 = pzpVar;
            potVar3 = potVar2;
            atrVar2 = atrVar;
            pfmVar2 = pfmVar;
            z2 = z;
            pjyVar = null;
        }
        if (pjwVar != null) {
            pjjVar2.g = potVar9;
            pjjVar2.h = pcvVar2;
            pjjVar2.a = potVar3;
            pjjVar2.b = pjyVar;
            pjjVar2.i = null;
            pjjVar2.j = null;
            pjjVar2.k = null;
            pjjVar2.f = 2;
            if (i(potVar9, pjwVar.c, pcvVar2, str2, atrVar2, pzpVar2, pfmVar2, potVar3, z2, pjjVar2) == awoxVar) {
                return awoxVar;
            }
        }
        potVar6 = potVar9;
        potVar7 = potVar3;
        pjyVar2 = pjyVar;
        if (pjyVar2 != null) {
            pjjVar2.g = potVar6;
            pjjVar2.h = null;
            pjjVar2.a = null;
            pjjVar2.b = null;
            pjjVar2.i = null;
            pjjVar2.j = null;
            pjjVar2.k = null;
            pjjVar2.f = 3;
            pot potVar11 = potVar6;
            objH = h(pcvVar2, potVar11, potVar7, pjyVar2, pjjVar2);
            pjvVar = this;
            potVar8 = potVar11;
            if (objH == awoxVar) {
                return awoxVar;
            }
            Context context2 = pjvVar.b;
            Object systemService2 = context2.getSystemService((Class<Object>) NotificationManager.class);
            systemService2.getClass();
            statusBarNotificationArrA = nvz.a((NotificationManager) systemService2);
            arrayList = new ArrayList();
            while (i < r5) {
                if (pjx.h(statusBarNotification, pjvVar.c)) {
                    arrayList.add(statusBarNotification);
                }
            }
            iB = nvk.b(potVar8);
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                it = arrayList.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (ato.e(((StatusBarNotification) it.next()).getNotification())) {
                    }
                }
            }
            strC = nvk.c(potVar8);
            iA = nvk.a(potVar8);
            if (strC.length() != 0) {
                i3 = 0;
            } else {
                i3 = 0;
            }
            if (iB > 0) {
                iMin = Math.min(10, Math.max(0, i2 - iB));
            } else {
                iMin = 0;
            }
            if (iA > 0) {
                iMin2 = Math.min(10, Math.max(0, i3 - iA));
            } else {
                iMin2 = 0;
            }
            pwf pwfVar2 = (pwf) pjvVar.e.io();
            pls plsVar2 = pjvVar.c;
            String packageName2 = context2.getPackageName();
            qtf qtfVar2 = (qtf) pwfVar2.n.io();
            String str7 = plsVar2.a;
            Integer numValueOf5 = Integer.valueOf(iB);
            Integer numValueOf6 = Integer.valueOf(iMin);
            Integer numValueOf7 = Integer.valueOf(iA);
            Integer numValueOf8 = Integer.valueOf(iMin2);
            Object[] objArr2 = new Object[6];
            objArr2[0] = packageName2;
            objArr2[c] = str7;
            objArr2[2] = numValueOf5;
            objArr2[3] = numValueOf6;
            objArr2[4] = numValueOf7;
            objArr2[5] = numValueOf8;
            qtfVar2.b(1L, objArr2);
        }
        return awmy.a;
        pjy pjyVar3 = (pjy) objA;
        pjw pjwVar2 = pjyVar3.a;
        Boolean bool = pjyVar3.e;
        if (bool != null) {
            atrVar3.e(8, !bool.booleanValue());
        }
        pot potVar12 = potVar4;
        pjwVar = pjwVar2;
        potVar9 = potVar5;
        z2 = z3;
        pjyVar = pjyVar3;
        str2 = str3;
        pzpVar2 = pzpVar3;
        atrVar2 = atrVar3;
        pfmVar2 = pfmVar3;
        pcvVar2 = pcvVar3;
        potVar3 = potVar12;
        if (pjwVar != null) {
            pjjVar2.g = potVar9;
            pjjVar2.h = pcvVar2;
            pjjVar2.a = potVar3;
            pjjVar2.b = pjyVar;
            pjjVar2.i = null;
            pjjVar2.j = null;
            pjjVar2.k = null;
            pjjVar2.f = 2;
            if (i(potVar9, pjwVar.c, pcvVar2, str2, atrVar2, pzpVar2, pfmVar2, potVar3, z2, pjjVar2) == awoxVar) {
                return awoxVar;
            }
        }
        potVar6 = potVar9;
        potVar7 = potVar3;
        pjyVar2 = pjyVar;
        if (pjyVar2 != null) {
            pjjVar2.g = potVar6;
            pjjVar2.h = null;
            pjjVar2.a = null;
            pjjVar2.b = null;
            pjjVar2.i = null;
            pjjVar2.j = null;
            pjjVar2.k = null;
            pjjVar2.f = 3;
            pot potVar13 = potVar6;
            objH = h(pcvVar2, potVar13, potVar7, pjyVar2, pjjVar2);
            pjvVar = this;
            potVar8 = potVar13;
            if (objH == awoxVar) {
                return awoxVar;
            }
            Context context3 = pjvVar.b;
            Object systemService3 = context3.getSystemService((Class<Object>) NotificationManager.class);
            systemService3.getClass();
            statusBarNotificationArrA = nvz.a((NotificationManager) systemService3);
            arrayList = new ArrayList();
            while (i < r5) {
                if (pjx.h(statusBarNotification, pjvVar.c)) {
                    arrayList.add(statusBarNotification);
                }
            }
            iB = nvk.b(potVar8);
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                it = arrayList.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (ato.e(((StatusBarNotification) it.next()).getNotification())) {
                    }
                }
            }
            strC = nvk.c(potVar8);
            iA = nvk.a(potVar8);
            if (strC.length() != 0) {
                i3 = 0;
            } else {
                i3 = 0;
            }
            if (iB > 0) {
                iMin = Math.min(10, Math.max(0, i2 - iB));
            } else {
                iMin = 0;
            }
            if (iA > 0) {
                iMin2 = Math.min(10, Math.max(0, i3 - iA));
            } else {
                iMin2 = 0;
            }
            pwf pwfVar3 = (pwf) pjvVar.e.io();
            pls plsVar3 = pjvVar.c;
            String packageName3 = context3.getPackageName();
            qtf qtfVar3 = (qtf) pwfVar3.n.io();
            String str8 = plsVar3.a;
            Integer numValueOf9 = Integer.valueOf(iB);
            Integer numValueOf10 = Integer.valueOf(iMin);
            Integer numValueOf11 = Integer.valueOf(iA);
            Integer numValueOf12 = Integer.valueOf(iMin2);
            Object[] objArr3 = new Object[6];
            objArr3[0] = packageName3;
            objArr3[c] = str8;
            objArr3[2] = numValueOf9;
            objArr3[3] = numValueOf10;
            objArr3[4] = numValueOf11;
            objArr3[5] = numValueOf12;
            qtfVar3.b(1L, objArr3);
        }
        return awmy.a;
    }

    public final Object k(Context context, pjw pjwVar, awoq awoqVar) {
        Object objA = nxe.a(this.w, new pjm(this, context, pjwVar, (awoq) null, 0), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    public final Object l(Context context, int i, String str, awoq awoqVar) {
        Object objA = nxe.a(this.w, new pjn(context, str, i, this, null), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    public final Object m(plx plxVar, List list, List list2, pax paxVar, pbh pbhVar, awoq awoqVar) {
        return nxe.a(this.w, new pjo(list, list2, plxVar, this, pbhVar, paxVar, null), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0240  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final Object n(pot potVar, pcv pcvVar, String str, atr atrVar, pzp pzpVar, boolean z, awoq awoqVar) throws Throwable {
        pjq pjqVar;
        boolean z2;
        pjw pjwVarD;
        Object objK;
        pcv pcvVar2;
        String str2;
        pot potVar2;
        pfm pfmVar;
        pzp pzpVar2;
        atr atrVar2;
        pzp pzpVar3;
        pzp pzpVar4;
        pot potVar3 = potVar;
        if (awoqVar instanceof pjq) {
            pjqVar = (pjq) awoqVar;
            int i = pjqVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjqVar.e = i - Integer.MIN_VALUE;
            } else {
                pjqVar = new pjq(this, awoqVar);
            }
        } else {
            pjqVar = new pjq(this, awoqVar);
        }
        pjq pjqVar2 = pjqVar;
        Object obj = pjqVar2.c;
        Object obj2 = awox.a;
        switch (pjqVar2.e) {
            case 0:
                atqp.j(obj);
                plx plxVarA = pcvVar.a();
                Context context = this.b;
                Object systemService = context.getSystemService((Class<Object>) NotificationManager.class);
                systemService.getClass();
                if (nvz.a((NotificationManager) systemService).length >= (true != a.aL() ? 49 : 24)) {
                    paw pawVarA = this.o.a(ahyy.MAX_NOTIFICATION_COUNT_REACHED);
                    pbc pbcVar = (pbc) pawVarA;
                    pbcVar.r = 2;
                    pawVarA.f(plxVarA);
                    pawVarA.b(potVar3);
                    pbcVar.k = pcvVar.c;
                    pawVarA.a();
                    if (auvy.c()) {
                        pjqVar2.a = potVar3;
                        pjqVar2.e = 1;
                        if (v(pcvVar, potVar3, pjqVar2) == obj2) {
                            return obj2;
                        }
                    }
                    w(pqf.s);
                    return new pkv("Skipping thread " + potVar3.a + ". Max notification count reached.", pkx.B);
                }
                omm ommVar = this.g;
                boolean z3 = pcvVar.f;
                Pair pairC = ((pfv) ommVar.a).c(plxVarA, potVar3, z3);
                pfm pfmVar2 = (pfm) pairC.first;
                if (!z3 && pfmVar2 != pfm.a && pfmVar2 != pfm.b) {
                    if (pfmVar2 == pfm.c) {
                        paw pawVarA2 = this.o.a(ahyy.DROPPED_BY_VERSION);
                        pbc pbcVar2 = (pbc) pawVarA2;
                        pbcVar2.r = 2;
                        pawVarA2.f(plxVarA);
                        pawVarA2.b(potVar3);
                        pbcVar2.k = pcvVar.c;
                        pawVarA2.a();
                        if (auvy.c()) {
                            pjqVar2.a = potVar3;
                            pjqVar2.e = 5;
                            if (v(pcvVar, potVar3, pjqVar2) == obj2) {
                                return obj2;
                            }
                        }
                        w(pqf.p);
                        return new pkv("Skipping thread " + potVar3.a + ". Rejected due to same version.", pkx.A);
                    }
                    if (pfmVar2 == pfm.d) {
                        paw pawVarA3 = this.o.a(ahyy.DROPPED_DATABASE_ERROR);
                        pbc pbcVar3 = (pbc) pawVarA3;
                        pbcVar3.r = 2;
                        pawVarA3.f(plxVarA);
                        pawVarA3.b(potVar3);
                        pbcVar3.k = pcvVar.c;
                        pawVarA3.a();
                        if (auvy.c()) {
                            pjqVar2.a = potVar3;
                            pjqVar2.e = 6;
                            if (v(pcvVar, potVar3, pjqVar2) == obj2) {
                                return obj2;
                            }
                        }
                        w(pqf.v);
                    }
                    return new pkv("Skipping thread " + potVar3.a + ". Insertion failed.", pkx.C);
                }
                pot potVar4 = (pot) ((agev) pairC.second).f();
                if (auwb.d()) {
                    pfmVar2.getClass();
                    pjqVar2.a = pzpVar;
                    pjqVar2.e = 2;
                    if (j(potVar3, pcvVar, str, atrVar, pzpVar, pfmVar2, potVar4, z, pjqVar2) == obj2) {
                        return obj2;
                    }
                    pzpVar3 = pzpVar;
                    return new pla(new phd(pzpVar3));
                }
                pcu pcuVar = pcvVar.a;
                pjqVar2.a = potVar3;
                pjqVar2.f = pcvVar;
                pjqVar2.g = str;
                pjqVar2.h = atrVar;
                pjqVar2.i = pzpVar;
                pjqVar2.j = pfmVar2;
                pjqVar2.k = potVar4;
                z2 = z;
                pjqVar2.b = z2;
                pjqVar2.e = 3;
                if (potVar4 == null || (pjwVarD = this.h.D(pcuVar, potVar4.a)) == null || awrc.c(pjwVarD.c, str) || (objK = k(context, pjwVarD, pjqVar2)) != obj2) {
                    objK = awmy.a;
                }
                if (objK == obj2) {
                    return obj2;
                }
                pcvVar2 = pcvVar;
                str2 = str;
                potVar2 = potVar4;
                pfmVar = pfmVar2;
                pzpVar2 = pzpVar;
                atrVar2 = atrVar;
                pfmVar.getClass();
                pjqVar2.a = pzpVar2;
                pjqVar2.f = null;
                pjqVar2.g = null;
                pjqVar2.h = null;
                pjqVar2.i = null;
                pjqVar2.j = null;
                pjqVar2.k = null;
                pjqVar2.e = 4;
                if (i(potVar3, str2, pcvVar2, str2, atrVar2, pzpVar2, pfmVar, potVar2, z2, pjqVar2) != obj2) {
                    return obj2;
                }
                pzpVar4 = pzpVar2;
                return new pla(new phd(pzpVar4));
            case 1:
                potVar3 = (pot) pjqVar2.a;
                atqp.j(obj);
                w(pqf.s);
                return new pkv("Skipping thread " + potVar3.a + ". Max notification count reached.", pkx.B);
            case 2:
                pzpVar3 = (pzp) pjqVar2.a;
                atqp.j(obj);
                return new pla(new phd(pzpVar3));
            case 3:
                boolean z4 = pjqVar2.b;
                pot potVar5 = pjqVar2.k;
                pfm pfmVar3 = pjqVar2.j;
                pzp pzpVar5 = pjqVar2.i;
                atrVar2 = pjqVar2.h;
                String str3 = pjqVar2.g;
                pcv pcvVar3 = pjqVar2.f;
                pot potVar6 = (pot) pjqVar2.a;
                atqp.j(obj);
                pfmVar = pfmVar3;
                pcvVar2 = pcvVar3;
                z2 = z4;
                potVar3 = potVar6;
                potVar2 = potVar5;
                str2 = str3;
                pzpVar2 = pzpVar5;
                pfmVar.getClass();
                pjqVar2.a = pzpVar2;
                pjqVar2.f = null;
                pjqVar2.g = null;
                pjqVar2.h = null;
                pjqVar2.i = null;
                pjqVar2.j = null;
                pjqVar2.k = null;
                pjqVar2.e = 4;
                if (i(potVar3, str2, pcvVar2, str2, atrVar2, pzpVar2, pfmVar, potVar2, z2, pjqVar2) != obj2) {
                    return obj2;
                }
                pzpVar4 = pzpVar2;
                return new pla(new phd(pzpVar4));
            case 4:
                pzpVar4 = (pzp) pjqVar2.a;
                atqp.j(obj);
                return new pla(new phd(pzpVar4));
            case 5:
                potVar3 = (pot) pjqVar2.a;
                atqp.j(obj);
                w(pqf.p);
                return new pkv("Skipping thread " + potVar3.a + ". Rejected due to same version.", pkx.A);
            case 6:
                potVar3 = (pot) pjqVar2.a;
                atqp.j(obj);
                w(pqf.v);
                return new pkv("Skipping thread " + potVar3.a + ". Insertion failed.", pkx.C);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(pot potVar, pcv pcvVar, pzp pzpVar, awoq awoqVar) throws Throwable {
        pjr pjrVar;
        if (awoqVar instanceof pjr) {
            pjrVar = (pjr) awoqVar;
            int i = pjrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjrVar.c = i - Integer.MIN_VALUE;
            } else {
                pjrVar = new pjr(this, awoqVar);
            }
        } else {
            pjrVar = new pjr(this, awoqVar);
        }
        Object obj = pjrVar.a;
        awox awoxVar = awox.a;
        int i2 = pjrVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            if (pzpVar != null && !pzpVar.h) {
                phb phbVar = pcvVar.g;
                phb phbVar2 = phb.d;
                if (phbVar != phbVar2) {
                    String str = potVar.a;
                    ozv ozvVar = (ozv) this.t.io();
                    plx plxVarA = pcvVar.a();
                    pjrVar.c = 1;
                    if (ozvVar.a(plxVarA, str, phbVar2, pjrVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
            String str2 = potVar.a;
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(pot potVar, String str, plx plxVar, awoq awoqVar) throws Throwable {
        pjs pjsVar;
        long jB;
        Object obj;
        long j;
        if (awoqVar instanceof pjs) {
            pjsVar = (pjs) awoqVar;
            int i = pjsVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjsVar.f = i - Integer.MIN_VALUE;
            } else {
                pjsVar = new pjs(this, awoqVar);
            }
        } else {
            pjsVar = new pjs(this, awoqVar);
        }
        Object obj2 = pjsVar.d;
        awox awoxVar = awox.a;
        int i2 = pjsVar.f;
        int i3 = 1;
        if (i2 == 0) {
            atqp.j(obj2);
            long j2 = potVar.r;
            if (j2 <= 0 && potVar.s <= 0) {
                return awmy.a;
            }
            long j3 = potVar.s;
            if (j3 > 0) {
                long epochMilli = potVar.h;
                if (epochMilli <= 0) {
                    epochMilli = this.d.f().toEpochMilli();
                }
                jB = epochMilli + j3;
            } else {
                int i4 = awtl.b;
                jB = awtl.b(awrc.j(j2, awtn.MICROSECONDS));
            }
            Object systemService = this.b.getSystemService("alarm");
            systemService.getClass();
            piy piyVar = this.n;
            AlarmManager alarmManager = (AlarmManager) systemService;
            pjsVar.a = alarmManager;
            pjsVar.b = 1;
            pjsVar.c = jB;
            pjsVar.f = 1;
            Object objF = piy.f(piyVar, str, plxVar, potVar, pjsVar);
            if (objF == awoxVar) {
                return awoxVar;
            }
            obj = alarmManager;
            obj2 = objF;
            j = jB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = pjsVar.c;
            i3 = pjsVar.b;
            obj = pjsVar.a;
            atqp.j(obj2);
        }
        ((AlarmManager) obj).set(i3, j, (PendingIntent) obj2);
        return awmy.a;
    }

    public final void q(plx plxVar, List list, pbh pbhVar, pax paxVar) {
        agom agomVar = pbhVar.b;
        if (agomVar == null) {
            x(plxVar, list, pbhVar.a, pbhVar.d, pbhVar.c, paxVar);
            return;
        }
        pax paxVar2 = paxVar;
        Map mapN = agomVar.n();
        mapN.getClass();
        for (Map.Entry entry : mapN.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            ahza ahzaVar = (ahza) key;
            Object value = entry.getValue();
            value.getClass();
            Set setAw = atqq.aw((Collection) value);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (setAw.contains(((pot) obj).a)) {
                    arrayList.add(obj);
                }
            }
            pax paxVar3 = paxVar2;
            x(plxVar, arrayList, ahzaVar, pbhVar.d, pbhVar.c, paxVar3);
            paxVar2 = paxVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v37 */
    public final Object r(String str, String str2, plx plxVar, pot potVar, pzn pznVar, pax paxVar, awoq awoqVar) throws Throwable {
        pju pjuVar;
        int i;
        pax paxVar2;
        String str3;
        ?? r1;
        boolean z;
        pzq pzqVar;
        agev agevVar;
        Notification notificationA;
        Context context;
        pjv pjvVar = this;
        String str4 = str;
        plx plxVar2 = plxVar;
        if (awoqVar instanceof pju) {
            pjuVar = (pju) awoqVar;
            int i2 = pjuVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjuVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pjuVar = new pju(pjvVar, awoqVar);
            }
        } else {
            pjuVar = new pju(pjvVar, awoqVar);
        }
        Object objB = pjuVar.b;
        awox awoxVar = awox.a;
        int i3 = pjuVar.d;
        if (i3 == 0) {
            atqp.j(objB);
            boolean zC = awrc.c("chime_default_group", str2);
            omm ommVar = pjvVar.g;
            agke agkeVarQ = ommVar.q(plxVar2, str2);
            tld tldVar = pjvVar.h;
            pcu pcuVarA = nvu.a(plxVar2);
            agkeVarQ.getClass();
            ArrayList arrayList = new ArrayList(atqq.N(agkeVarQ, 10));
            agqs agqsVarListIterator = agkeVarQ.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                arrayList.add(((pot) agqsVarListIterator.next()).a);
            }
            Set setKeySet = tldVar.F(pcuVarA, arrayList).keySet();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            agqs agqsVarListIterator2 = agkeVarQ.listIterator(0);
            while (agqsVarListIterator2.hasNext()) {
                Object next = agqsVarListIterator2.next();
                pot potVar2 = (pot) next;
                if (potVar == null) {
                    z = false;
                } else if (awrc.c(potVar.a, potVar2.a)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zContains = setKeySet.contains(potVar2.a);
                if (z || zContains) {
                    arrayList2.add(next);
                } else {
                    arrayList3.add(next);
                }
            }
            awml awmlVar = new awml(arrayList2, arrayList3);
            List list = (List) awmlVar.a;
            List list2 = (List) awmlVar.b;
            if (list2.isEmpty()) {
                i = 0;
            } else {
                ArrayList arrayList4 = new ArrayList(atqq.N(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((pot) it.next()).a);
                }
                i = 0;
                String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                ommVar.s(plxVar2, (String[]) Arrays.copyOf(strArr, strArr.length));
            }
            if (list.isEmpty()) {
                Context context2 = pjvVar.b;
                pjuVar.d = 1;
                if (pjvVar.u(context2, str4, pjuVar) == awoxVar) {
                    return awoxVar;
                }
                return Boolean.FALSE;
            }
            if (list.size() < (zC ? pjvVar.s().k : pjvVar.s().l)) {
                Object systemService = pjvVar.b.getSystemService("notification");
                systemService.getClass();
                StatusBarNotification[] statusBarNotificationArrA = nvz.a((NotificationManager) systemService);
                ArrayList arrayList5 = new ArrayList();
                int length = statusBarNotificationArrA.length;
                for (int i4 = i; i4 < length; i4++) {
                    StatusBarNotification statusBarNotification = statusBarNotificationArrA[i4];
                    if (pjx.h(statusBarNotification, pjvVar.c)) {
                        arrayList5.add(statusBarNotification);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    Iterator it2 = arrayList5.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            StatusBarNotification statusBarNotification2 = (StatusBarNotification) it2.next();
                            if (awrc.c(str4, statusBarNotification2.getTag()) && statusBarNotification2.getId() == 0) {
                                break;
                            }
                            pjvVar = this;
                            str4 = str;
                            plxVar2 = plxVar;
                        }
                    }
                }
                return Boolean.TRUE;
            }
            pjuVar.e = str4;
            paxVar2 = paxVar;
            pjuVar.f = paxVar2;
            pjuVar.a = list;
            pjuVar.d = 2;
            objB = pjvVar.l.b(str4, plxVar2, list, pznVar, pjuVar);
            if (objB == awoxVar) {
                return awoxVar;
            }
            str3 = str;
            r1 = list;
            pzqVar = (pzq) objB;
            if (pzqVar == null) {
                ((agsj) a.c()).t("Failed to create summary notification.");
                return Boolean.FALSE;
            }
            nvj.c(r1);
            agevVar = ((pco) pjvVar.i).a;
            if (agevVar.g()) {
            }
            atr atrVar = pzqVar.a;
            atrVar.u = true;
            atrVar.t = str3;
            notificationA = atrVar.a();
            notificationA.getClass();
            context = pjvVar.b;
            pjuVar.e = null;
            pjuVar.f = null;
            pjuVar.a = null;
            pjuVar.d = 3;
            if (pjvVar.t(context, str3, notificationA, true, paxVar2, pjuVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 == 1) {
                atqp.j(objB);
                return Boolean.FALSE;
            }
            if (i3 == 2) {
                Object obj = pjuVar.a;
                pax paxVar3 = pjuVar.f;
                str3 = pjuVar.e;
                atqp.j(objB);
                paxVar2 = paxVar3;
                r1 = obj;
                pzqVar = (pzq) objB;
                if (pzqVar == null) {
                    ((agsj) a.c()).t("Failed to create summary notification.");
                    return Boolean.FALSE;
                }
                nvj.c(r1);
                agevVar = ((pco) pjvVar.i).a;
                if (agevVar.g()) {
                }
                atr atrVar2 = pzqVar.a;
                atrVar2.u = true;
                atrVar2.t = str3;
                notificationA = atrVar2.a();
                notificationA.getClass();
                context = pjvVar.b;
                pjuVar.e = null;
                pjuVar.f = null;
                pjuVar.a = null;
                pjuVar.d = 3;
                if (pjvVar.t(context, str3, notificationA, true, paxVar2, pjuVar) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objB);
            }
        }
        return Boolean.TRUE;
    }
}
