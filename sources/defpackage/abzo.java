package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatImageView;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abzo {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public abzo(Activity activity, vwt vwtVar, adhv adhvVar, avmb avmbVar, zvl zvlVar, acxn acxnVar, xxj xxjVar) {
        this.a = new ArrayDeque();
        this.e = new AtomicBoolean(false);
        this.j = new awku().aI();
        this.i = activity;
        this.f = adhvVar;
        this.c = avmbVar;
        this.h = zvlVar;
        this.g = new AppCompatImageView(activity);
        this.k = new AppCompatImageView(activity);
        this.b = acxnVar;
        this.d = xxjVar;
        vwtVar.D(new wci(this, avmbVar, 9));
    }

    public static boolean E(acfw acfwVar) {
        acjb acjbVarD = acfwVar.d();
        return acjbVarD != null && (acjbVarD.x() instanceof aciw);
    }

    public static auzk G(int i, Exception exc) {
        String message;
        if (exc instanceof rso) {
            rso rsoVar = (rso) exc;
            int i2 = rsoVar.a;
            if (i2 == 0) {
                throw null;
            }
            message = afxw.aC(i2) + ": " + rsoVar.getMessage();
        } else {
            message = exc.getMessage() != null ? exc.getMessage() : "Unknown exception";
        }
        return H(i, message);
    }

    public static auzk H(int i, String str) {
        aihf aihfVarCreateBuilder = aosi.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aosi aosiVar = (aosi) aihfVarCreateBuilder.instance;
        aosiVar.c = acfz.bu(i);
        aosiVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aosi aosiVar2 = (aosi) aihfVarCreateBuilder.instance;
        str.getClass();
        aosiVar2.b |= 2;
        aosiVar2.d = str;
        return aajc.i((aosi) aihfVarCreateBuilder.build());
    }

    private final avlb K(amer amerVar, DisplayMetrics displayMetrics, ImageView imageView) {
        int size = amerVar.l.size();
        return size == 0 ? avlb.e() : avlb.g(new xdj(this, amerVar, imageView, displayMetrics, size, 0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    private final List L(String str) {
        if (str == null) {
            return new ArrayList(this.c.values());
        }
        ArrayList arrayList = new ArrayList(2);
        ?? r2 = this.c;
        rtz rtzVar = (rtz) r2.get(str);
        if (rtzVar != null) {
            arrayList.add(rtzVar);
        }
        rtz rtzVar2 = (rtz) r2.get("");
        if (rtzVar2 != null && rtzVar2 != rtzVar) {
            arrayList.add(rtzVar2);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    private final void M(String str, rtz rtzVar) {
        Map map = rtzVar.b;
        if (map.isEmpty()) {
            return;
        }
        acfw acfwVarB = !str.isEmpty() ? ((rsr) this.g.io()).b(str) : null;
        if (acfwVarB != null) {
            Iterator it = new HashSet(map.values()).iterator();
            while (it.hasNext()) {
                ((xsc) this.e.io()).ab(acfwVarB, (String) it.next());
            }
        }
    }

    private static final int N(List list, int i) {
        while (i < ((agpi) list).d) {
            if (((abic) list.get(i)).a != null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int i(DisplayMetrics displayMetrics, int i) {
        int iC = twm.c(displayMetrics, i);
        if (iC <= 0) {
            return 1;
        }
        return iC;
    }

    public static String l(String str) {
        return str == null ? "" : str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final void A(acfw acfwVar, List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v((String) it.next(), str);
        }
        ((acm) this.f.io()).e(acfwVar, new rtu(this, (String) list.get(0), list, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    public final boolean B(String str) {
        if (!((acm) this.f.io()).f()) {
            return false;
        }
        for (rtz rtzVar : L(str)) {
            tld tldVar = rtzVar.i;
            if (tldVar != null) {
                rtzVar.i = null;
                try {
                    u(tldVar.b, 0, new rtv(this, (String) tldVar.a));
                } catch (RuntimeException | rso e) {
                    rmp.n(null, "CisaShimLegacyGaplessFlow: Failed to start pending fallback interstitial: ".concat(e.toString()));
                    ?? r6 = tldVar.b;
                    String str2 = (String) tldVar.a;
                    n(r6, str2);
                    x(str2);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean C(String str) {
        Iterator it = L(null).iterator();
        while (it.hasNext()) {
            if (((rtz) it.next()).a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(String str) {
        Iterator it = L(str).iterator();
        while (it.hasNext()) {
            if (((rtz) it.next()).f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awmd, java.lang.Object] */
    public final rop F(rnp rnpVar, ViewGroup viewGroup) {
        Context context = (Context) this.d.io();
        context.getClass();
        tld tldVar = (tld) this.g.io();
        zwb zwbVar = (zwb) this.c.io();
        zwbVar.getClass();
        rmw rmwVar = (rmw) this.e.io();
        rmwVar.getClass();
        adhv adhvVar = (adhv) this.b.io();
        adhvVar.getClass();
        xsc xscVar = (xsc) this.a.io();
        xscVar.getClass();
        Activity activity = (Activity) this.h.io();
        activity.getClass();
        afip afipVar = (afip) this.k.io();
        afipVar.getClass();
        vxe vxeVar = (vxe) this.i.io();
        vxeVar.getClass();
        Handler handler = (Handler) this.f.io();
        handler.getClass();
        aciz acizVar = (aciz) this.j.io();
        acizVar.getClass();
        rnpVar.getClass();
        return new rop(context, tldVar, zwbVar, rmwVar, adhvVar, xscVar, activity, afipVar, vxeVar, handler, acizVar, rnpVar, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [abzo] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v3, types: [int] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final auzk I(List list, wjj wjjVar, acfw acfwVar, boolean z, boolean z2, String str) throws Throwable {
        String str2;
        ?? r10;
        int i;
        boolean z3;
        ArrayList arrayList;
        abnp abnpVarA;
        String str3 = str;
        long jC = wjjVar.c();
        long jB = wjjVar.b();
        if (z2) {
            jC = acfwVar.b();
        }
        boolean z4 = wjjVar.a;
        ArrayList arrayList2 = new ArrayList();
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            arrayList2.add(((abic) agqsVarListIterator.next()).b);
        }
        long j = -wjjVar.a();
        ?? r8 = this.f;
        boolean zF = ((acm) r8.io()).f();
        try {
            ArrayList arrayList3 = new ArrayList();
            long j2 = jC;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            long j3 = jB;
            ?? r6 = 0;
            while (true) {
                i = ((agpi) list).d;
                z3 = zF;
                if (r6 >= i) {
                    break;
                }
                abic abicVar = (abic) list.get(r6);
                wjf wjfVar = abicVar.a;
                if (wjfVar == null) {
                    arrayList5.add(abicVar);
                    arrayList = arrayList5;
                    r6 = r6;
                } else {
                    if (r6 > 0) {
                        arrayList = arrayList5;
                        if (((abic) list.get(r6 - 1)).a == null) {
                            abno abnoVarA = abnp.a();
                            abnoVarA.h(true);
                            abnpVarA = abnoVarA.a();
                        }
                        String str4 = abicVar.b;
                        arrayList3.add(sdo.l(wjfVar, str4, acfwVar, abnpVarA, !z4));
                        arrayList4.add(str4);
                    } else {
                        arrayList = arrayList5;
                    }
                    abnpVarA = abnp.a;
                    String str5 = abicVar.b;
                    arrayList3.add(sdo.l(wjfVar, str5, acfwVar, abnpVarA, !z4));
                    arrayList4.add(str5);
                }
                zF = z3;
                arrayList5 = arrayList;
                r6++;
                r10.x(str2);
                throw th;
            }
            ArrayList arrayList6 = arrayList5;
            try {
                if (!arrayList3.isEmpty()) {
                    try {
                        boolean z5 = !arrayList6.isEmpty() && ((abic) list.get(i + (-1))).a == null;
                        boolean z6 = z || (!z2 && j2 <= acfwVar.a() + 1000);
                        if (!arrayList2.isEmpty()) {
                            rtz rtzVarJ = j(str3);
                            tld tldVar = new tld(new ArrayList(arrayList2), new ArrayList(arrayList4));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                rtzVarJ.d.put((String) it.next(), tldVar);
                            }
                        }
                        aciw[] aciwVarArr = (aciw[]) arrayList3.toArray(new aciw[0]);
                        if (z6) {
                            boolean z7 = z5;
                            if (z3 || D(str3)) {
                                j(str3).e = true;
                                ((sdo) this.j.io()).i(acfwVar, z7, j, aciwVarArr);
                            } else {
                                try {
                                    ((acm) r8.io()).e(acfwVar, new rtt(this, acfwVar, z7, j, aciwVarArr, str3));
                                } catch (Throwable th) {
                                    th = th;
                                    r6 = this;
                                    str3 = str3;
                                    str2 = str3;
                                    r10 = r6;
                                    r10.x(str2);
                                    throw th;
                                }
                            }
                        } else {
                            ((sdo) this.j.io()).h(acfwVar, j2, z5, j, aciwVarArr);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r6 = this;
                    }
                } else if (!arrayList6.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList(arrayList6.size());
                    Iterator it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(((abic) it2.next()).b);
                    }
                    String str6 = (String) arrayList7.get(0);
                    if (z2 || (j2 != 0 && acfwVar.a() < j2)) {
                        String strConcat = "cisa_shim_nvc_".concat(String.valueOf((String) arrayList7.get(0)));
                        if (true == z2) {
                            j2 = 9223372036854775806L;
                        }
                        if (true == z2) {
                            j3 = 9223372036854775806L;
                        }
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            w((String) it3.next(), strConcat, str3);
                        }
                        xsc xscVar = (xsc) this.e.io();
                        try {
                            rtw rtwVar = new rtw(this, arrayList7, str3, acfwVar, strConcat, 1);
                            r10 = this;
                            str2 = str3;
                            try {
                                xscVar.ac(rtwVar, acfwVar, j2, j3, 2, 1, strConcat);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r10 = this;
                            str2 = str3;
                        }
                    } else if (z3 || D(str3)) {
                        Iterator it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            v((String) it4.next(), str3);
                        }
                        r(str6);
                    } else {
                        A(acfwVar, arrayList7, str3);
                    }
                }
                return new auzk(true, (aosi) null);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str2 = str3;
            r10 = this;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final tld J(String str, String str2) {
        ?? r1 = this.c;
        rtz rtzVar = (rtz) r1.get(l(str));
        tld tldVar = rtzVar != null ? (tld) rtzVar.d.get(str2) : null;
        if (tldVar == null) {
            Iterator it = r1.values().iterator();
            while (it.hasNext()) {
                tldVar = (tld) ((rtz) it.next()).d.get(str2);
                if (tldVar != null) {
                }
            }
            return null;
        }
        return tldVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [awmd, java.lang.Object] */
    public final abzn a(aopm aopmVar, wjm wjmVar, String str, String str2, int i) {
        zxj zxjVar = (zxj) this.a.io();
        zxjVar.getClass();
        Executor executor = (Executor) this.b.io();
        executor.getClass();
        ((Context) this.c.io()).getClass();
        ek ekVar = (ek) this.d.io();
        ekVar.getClass();
        zwb zwbVar = (zwb) this.e.io();
        zwbVar.getClass();
        ci ciVar = (ci) this.f.io();
        ciVar.getClass();
        tfq tfqVar = (tfq) this.g.io();
        tfqVar.getClass();
        ztf ztfVar = (ztf) this.h.io();
        ztfVar.getClass();
        vxu vxuVar = (vxu) this.i.io();
        vxuVar.getClass();
        acqf acqfVar = (acqf) this.j.io();
        acqfVar.getClass();
        abzq abzqVar = (abzq) this.k.io();
        abzqVar.getClass();
        aopmVar.getClass();
        wjmVar.getClass();
        str.getClass();
        str2.getClass();
        return new abzn(zxjVar, executor, ekVar, zwbVar, ciVar, tfqVar, ztfVar, vxuVar, acqfVar, abzqVar, aopmVar, wjmVar, str, str2, i);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r4v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final abyx b(List list, List list2, String str) {
        List arrayList = list == null ? new ArrayList() : list;
        List arrayList2 = list2 == null ? new ArrayList() : list2;
        ?? r4 = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.e;
        ?? r8 = this.b;
        Object obj4 = this.f;
        return new abyx((zxj) obj3, (tfq) obj2, (abuz) obj, r4, arrayList, arrayList2, str, r8, (aavv) obj4, (xeu) this.d, (vyo) this.a, this.g, this.c, this.h);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zvl] */
    public final void c(String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.i = 220;
        zvjVarA.j = 33;
        zvjVarA.d(str);
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        this.h.a(zvjVarA.a());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void d() {
        amej amejVar;
        ?? r0 = this.a;
        if (!r0.isEmpty() && !((AtomicBoolean) this.e).get() && (amejVar = (amej) r0.poll()) != null) {
            e(amejVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void e(amej amejVar) {
        Object obj = this.e;
        if (((AtomicBoolean) obj).get()) {
            this.a.add(amejVar);
            return;
        }
        amer amerVarDu = yno.du(amejVar);
        Optional optionalDv = yno.dv(amejVar);
        int size = amerVarDu.l.size() + (optionalDv.isPresent() ? ((amer) optionalDv.get()).l.size() : 0);
        if ((amerVarDu.c & 8) == 0 || size <= 0) {
            ((xxj) this.d).c(amejVar);
            d();
            return;
        }
        ((AtomicBoolean) obj).set(true);
        DisplayMetrics displayMetrics = ((Activity) this.i).getResources().getDisplayMetrics();
        avlb avlbVarK = K(amerVarDu, displayMetrics, (ImageView) this.g);
        if (optionalDv.isPresent()) {
            avlbVarK = K((amer) optionalDv.get(), displayMetrics, (ImageView) this.k).q(avlbVarK);
        }
        avlbVarK.w(10L, TimeUnit.SECONDS, awlg.a(), avlb.m(new Throwable("Took more than 10 seconds to preload widget images."))).r((avmb) this.c).kp(new xdk(this, amejVar));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    public final synchronized void f(String str) {
        Collection.EL.removeIf(this.a, new uso(str, 20));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    public final synchronized void g(String str) {
        Collection.EL.removeIf(this.a, new iab(this, str, 6));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v0, types: [adhv, java.lang.Object] */
    public final synchronized void h() {
        this.a.clear();
        Object obj = this.g;
        ?? r1 = this.f;
        r1.f((ImageView) obj);
        r1.f((ImageView) this.k);
        ((AtomicBoolean) this.e).set(false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final rtz j(String str) {
        return (rtz) j$.util.Map.EL.computeIfAbsent(this.c, l(str), new ris(20));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final String k(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            if (((rtz) entry.getValue()).d.containsKey(str)) {
                String str2 = (String) entry.getKey();
                if (str2.isEmpty()) {
                    return null;
                }
                return str2;
            }
        }
        return null;
    }

    public final String m(String str, String str2) {
        Iterator it = L(str2).iterator();
        String str3 = null;
        while (it.hasNext()) {
            String str4 = (String) ((rtz) it.next()).b.remove(str);
            if (str4 != null) {
                str3 = str4;
            }
        }
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void n(List list, String str) {
        rtz rtzVar = (rtz) this.c.get(l(str));
        if (rtzVar != null) {
            if (aguu.v(list, rtzVar.h)) {
                rtzVar.h = null;
            }
            tld tldVar = rtzVar.i;
            if (tldVar != null && aguu.v(list, tldVar.b)) {
                rtzVar.i = null;
            }
        }
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            abic abicVar = (abic) agqsVarListIterator.next();
            if (abicVar.a == null) {
                y(abicVar.b, str);
            }
        }
    }

    public final void o(String str) {
        for (rtz rtzVar : L(str)) {
            rtzVar.h = null;
            rtzVar.i = null;
        }
    }

    public final void p(String str) {
        for (rtz rtzVar : L(str)) {
            rtzVar.f = false;
            rtzVar.g = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void q(String str) {
        ?? r0 = this.c;
        if (str != null) {
            rtz rtzVar = (rtz) r0.remove(str);
            if (rtzVar != null) {
                M(str, rtzVar);
                return;
            }
            return;
        }
        for (Map.Entry entry : r0.entrySet()) {
            M((String) entry.getKey(), (rtz) entry.getValue());
        }
        r0.clear();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final void r(String str) {
        ((rsr) this.g.io()).g(new aazp(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [awmd, java.lang.Object] */
    public final void s(String str, acfw acfwVar) throws Throwable {
        ArrayList arrayList;
        abzo abzoVar;
        String str2;
        ?? r0 = this.c;
        if (str == null) {
            Iterator it = new HashSet(r0.keySet()).iterator();
            while (it.hasNext()) {
                s((String) it.next(), acfwVar);
            }
            return;
        }
        rtz rtzVar = (rtz) r0.get(str);
        if (rtzVar != null) {
            List list = rtzVar.c;
            if (list.isEmpty()) {
                return;
            }
            acfw acfwVarB = ((rsr) this.g.io()).b(str);
            acfw acfwVar2 = acfwVarB != null ? acfwVarB : acfwVar;
            if (acfwVar2 == null || !E(acfwVar2)) {
                return;
            }
            if (!D(str) || ((acm) this.f.io()).f()) {
                synchronized (list) {
                    arrayList = new ArrayList(list);
                    list.clear();
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    rua ruaVar = (rua) arrayList.get(i);
                    try {
                        abzoVar = this;
                        str2 = str;
                        try {
                            abzoVar.I(ruaVar.a, ruaVar.d, acfwVar2, ruaVar.b, ruaVar.c, str2);
                        } catch (RuntimeException e) {
                            e = e;
                            rmp.n(null, "CisaShimLegacyGaplessFlow: Failed to execute pending timeline schedule: ".concat(e.toString()));
                        } catch (rso e2) {
                            e = e2;
                            rmp.n(null, "CisaShimLegacyGaplessFlow: Failed to execute pending timeline schedule: ".concat(e.toString()));
                        }
                    } catch (RuntimeException | rso e3) {
                        e = e3;
                        abzoVar = this;
                        str2 = str;
                    }
                    i++;
                    this = abzoVar;
                    str = str2;
                }
                this.t(str);
            }
        }
    }

    public final void t(String str) {
        if (D(str)) {
            for (rtz rtzVar : L(str)) {
                if (rtzVar.g != null && !rtzVar.g.isDone()) {
                    return;
                }
            }
            for (rtz rtzVar2 : L(str)) {
                if (!rtzVar2.a.isEmpty() || !rtzVar2.c.isEmpty() || rtzVar2.e || rtzVar2.h != null) {
                    return;
                }
            }
            x(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    public final void u(List list, int i, rsu rsuVar) {
        int iN = N(list, i);
        if (iN == -1) {
            if (i < 0 || i >= ((agpi) list).d || ((abic) list.get(i)).a != null) {
                rsuVar.c();
                return;
            } else {
                r(((abic) list.get(i)).b);
                return;
            }
        }
        abic abicVar = (abic) list.get(iN);
        wjf wjfVar = abicVar.a;
        if (wjfVar == null) {
            rsuVar.s();
            return;
        }
        int iN2 = N(list, iN + 1);
        ?? r3 = this.f;
        if (iN2 == -1) {
            ((acm) r3.io()).c(wjfVar, abicVar.b, rsuVar);
        } else {
            ((acm) r3.io()).c(wjfVar, abicVar.b, new rtx(this, list, iN2, rsuVar));
        }
    }

    public final void v(String str, String str2) {
        j(str2).a.add(str);
    }

    public final void w(String str, String str2, String str3) {
        j(str3).b.put(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final void x(String str) {
        p(str);
        ?? r0 = this.f;
        if (((acm) r0.io()).f()) {
            ((acm) r0.io()).d();
        }
    }

    public final void y(String str, String str2) {
        Iterator it = L(str2).iterator();
        while (it.hasNext()) {
            ((rtz) it.next()).a.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    public final void z(List list, acfw acfwVar, String str) {
        rtz rtzVarJ = j(str);
        rtzVarJ.h = list;
        rtzVarJ.i = null;
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            abic abicVar = (abic) agqsVarListIterator.next();
            if (abicVar.a == null) {
                v(abicVar.b, str);
            }
        }
        if (((acm) this.f.io()).f()) {
            try {
                u(list, 0, new rtv(this, str));
                return;
            } catch (RuntimeException | rso e) {
                n(list, str);
                throw e;
            }
        }
        rtzVarJ.i = new tld(list, str, (char[]) null);
        if (D(str)) {
            return;
        }
        try {
            ((acm) this.f.io()).e(acfwVar, new rty(this, str, list, 1));
        } catch (RuntimeException | rso e2) {
            n(list, str);
            throw e2;
        }
    }

    public abzo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, byte[] bArr) {
        awmdVar.getClass();
        this.k = awmdVar;
        this.f = awmdVar2;
        awmdVar3.getClass();
        this.i = awmdVar3;
        awmdVar4.getClass();
        this.g = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        this.c = awmdVar6;
        this.a = awmdVar7;
        this.h = awmdVar8;
        this.e = awmdVar9;
        awmdVar10.getClass();
        this.d = awmdVar10;
        awmdVar11.getClass();
        this.j = awmdVar11;
    }

    public abzo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = awmdVar;
        this.k = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.i = awmdVar5;
        awmdVar6.getClass();
        this.a = awmdVar6;
        this.b = awmdVar7;
        awmdVar8.getClass();
        this.g = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
        awmdVar10.getClass();
        this.h = awmdVar10;
        this.j = awmdVar11;
    }

    public abzo(zxj zxjVar, tfq tfqVar, abuz abuzVar, agfr agfrVar, Executor executor, aavv aavvVar, xeu xeuVar, vyo vyoVar, agfr agfrVar2, agfr agfrVar3, tqj tqjVar) {
        zxjVar.getClass();
        this.e = zxjVar;
        tfqVar.getClass();
        this.j = tfqVar;
        abuzVar.getClass();
        this.k = abuzVar;
        this.i = agfrVar;
        executor.getClass();
        this.b = executor;
        this.f = aavvVar;
        this.d = xeuVar;
        this.a = vyoVar;
        this.g = agfrVar2;
        this.c = agfrVar3;
        this.h = tqjVar;
    }

    public abzo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.i = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        awmdVar4.getClass();
        this.j = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.d = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.k = awmdVar9;
        awmdVar10.getClass();
        this.f = awmdVar10;
        awmdVar11.getClass();
        this.b = awmdVar11;
    }

    public abzo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        this.g = awmdVar7;
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        awmdVar10.getClass();
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
    }

    public abzo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.h = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        this.a = awmdVar3;
        this.j = awmdVar4;
        this.i = awmdVar5;
        awmdVar6.getClass();
        this.k = awmdVar6;
        this.b = awmdVar7;
        this.e = awmdVar8;
        this.g = awmdVar9;
        awmdVar10.getClass();
        this.f = awmdVar10;
        awmdVar11.getClass();
        this.c = awmdVar11;
    }

    public abzo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, char[] cArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        this.g = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.e = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        this.a = awmdVar6;
        awmdVar7.getClass();
        this.h = awmdVar7;
        awmdVar8.getClass();
        this.k = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        this.f = awmdVar10;
        awmdVar11.getClass();
        this.j = awmdVar11;
    }

    public abzo(Context context, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, vyo vyoVar, vxu vxuVar, rmp rmpVar, Executor executor) {
        this.c = new ConcurrentHashMap();
        this.h = context;
        this.j = awmdVar;
        this.f = awmdVar2;
        this.g = awmdVar3;
        this.e = awmdVar4;
        this.a = awmdVar5;
        this.d = vyoVar;
        this.i = vxuVar;
        this.k = rmpVar;
        this.b = executor;
    }

    public abzo(thm thmVar, Context context, Executor executor, String str, vxu vxuVar, awmd awmdVar, zjk zjkVar, tao taoVar, Executor executor2, tfx tfxVar, awmd awmdVar2) {
        this.d = thmVar;
        this.i = context;
        this.c = executor;
        this.f = str;
        this.h = vxuVar;
        this.e = awmdVar;
        this.b = zjkVar;
        this.k = taoVar;
        this.j = executor2;
        this.g = tfxVar;
        this.a = awmdVar2;
    }
}
