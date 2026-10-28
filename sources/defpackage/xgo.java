package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgo {
    public final tbt b;
    public final awmd c;
    public final awmd d;
    public final awmd e;
    public final vyo f;
    public final awmd g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    private final agfr o;
    private final xgl p;
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/logging/interaction/InteractionLoggingController");
    public static final amec a = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN;

    public xgo(Context context, tbt tbtVar, vxu vxuVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, vyo vyoVar, awmd awmdVar4, tqj tqjVar, xgl xglVar, vxz vxzVar) {
        context.getClass();
        tbtVar.getClass();
        this.b = tbtVar;
        awmdVar.getClass();
        this.d = awmdVar;
        this.o = aguu.al(new wkw(vxuVar, 11));
        this.c = awmdVar2;
        this.e = awmdVar3;
        this.f = vyoVar;
        this.g = awmdVar4;
        this.p = xglVar;
        int i = tqr.a;
        this.h = tqjVar.k(1073829246);
        this.i = tqjVar.k(1073828950);
        this.j = tqjVar.k(1073828948);
        this.k = tqjVar.k(1073829869);
        this.l = tqjVar.k(1073840073);
        this.m = vxzVar.l(78, 45859731L, false);
    }

    public static argn b(argn argnVar) {
        if (!e(argnVar) || (argnVar.b & 8) != 0) {
            return argnVar;
        }
        aihf builder = argnVar.toBuilder();
        builder.copyOnWrite();
        argn argnVar2 = (argn) builder.instance;
        argnVar2.b |= 8;
        argnVar2.f = 0;
        return (argn) builder.build();
    }

    public static argn c(int i) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
        argnVar2.b |= 8;
        argnVar2.f = 0;
        return (argn) aihfVarCreateBuilder.build();
    }

    public static boolean e(argn argnVar) {
        return argnVar != null && argnVar.d > 0;
    }

    static boolean f(aigj aigjVar) {
        return (aigjVar == null || aigjVar.E()) ? false : true;
    }

    public static boolean p(amdz amdzVar, xgt xgtVar) {
        return amdzVar.c && xgtVar != null;
    }

    public static boolean q(amdz amdzVar, xgt xgtVar, xho xhoVar) {
        if (!amdzVar.c || xgtVar == null) {
            return false;
        }
        argn argnVar = xhoVar.f;
        if (argnVar != null && (f(argnVar.c) || argnVar.d > 0)) {
            return true;
        }
        String.valueOf(argnVar);
        return false;
    }

    public static boolean r(xho xhoVar) {
        return xhoVar.e != amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN;
    }

    public static boolean s(amdz amdzVar, xgt xgtVar, argn... argnVarArr) {
        if (!p(amdzVar, xgtVar)) {
            return false;
        }
        for (argn argnVar : argnVarArr) {
            if (argnVar == null || (!f(argnVar.c) && argnVar.d <= 0)) {
                String.valueOf(argnVar);
                return false;
            }
        }
        return true;
    }

    private final void t(xgt xgtVar, argn argnVar, agke agkeVar, xie xieVar) {
        if (agkeVar.isEmpty()) {
            return;
        }
        String str = xgtVar.a;
        aihf aihfVarCreateBuilder = amca.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amca amcaVar = (amca) aihfVarCreateBuilder.instance;
        str.getClass();
        amcaVar.b |= 1;
        amcaVar.c = str;
        argn argnVarB = b(argnVar);
        aihfVarCreateBuilder.copyOnWrite();
        amca amcaVar2 = (amca) aihfVarCreateBuilder.instance;
        argnVarB.getClass();
        amcaVar2.d = argnVarB;
        amcaVar2.b |= 2;
        Collection.EL.stream(agkeVar).map(new rmm(14)).forEachOrdered(new jap(aihfVarCreateBuilder, 8));
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amca amcaVar3 = (amca) aihfVarCreateBuilder.build();
        amcaVar3.getClass();
        alouVar.d = amcaVar3;
        alouVar.c = 215;
        d(alosVar, xgtVar, xieVar);
    }

    private final void u(xgt xgtVar, argn argnVar, argn argnVar2, xie xieVar) {
        argn argnVarB = b(argnVar);
        argn argnVarB2 = b(argnVar2);
        if (xgtVar.j(argnVarB, argnVarB2)) {
            return;
        }
        Object[] objArr = {argnVarB};
        aguu.j(objArr, 1);
        t(xgtVar, argnVarB2, new agpi(objArr, 1), xieVar);
        ((xhf) this.c.io()).e(argnVarB, argnVarB2, xgtVar.a, xieVar);
    }

    public final amdz a() {
        return (amdz) this.o.io();
    }

    public final void d(alos alosVar, xgt xgtVar, xie xieVar) {
        wjr wjrVar = (wjr) this.g.io();
        if (a().d && xgtVar != null) {
            String str = xgtVar.a;
            if (!TextUtils.isEmpty(str)) {
                aihf aihfVarCreateBuilder = alov.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aloz.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aloz alozVar = (aloz) aihfVarCreateBuilder2.instance;
                str.getClass();
                alozVar.b |= 1;
                alozVar.c = str;
                xgtVar.o++;
                int i = xgtVar.p;
                xgtVar.p = i + 1;
                long j = i;
                aihfVarCreateBuilder2.copyOnWrite();
                aloz alozVar2 = (aloz) aihfVarCreateBuilder2.instance;
                alozVar2.b |= 2;
                alozVar2.d = j;
                aloz alozVar3 = (aloz) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                alov alovVar = (alov) aihfVarCreateBuilder.instance;
                alozVar3.getClass();
                alovVar.d = alozVar3;
                alovVar.b |= 4;
                alov alovVar2 = (alov) aihfVarCreateBuilder.build();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                alou alouVar2 = alou.a;
                alovVar2.getClass();
                alouVar.f = alovVar2;
                alouVar.b |= 2;
            }
        }
        wjrVar.A(alosVar, xieVar);
    }

    public final void g(xgt xgtVar, argn argnVar, xie xieVar) {
        if (s(a(), xgtVar, argnVar)) {
            xgtVar.getClass();
            u(xgtVar, argnVar, c(xgtVar.f), xieVar);
        }
    }

    public final void h(xgt xgtVar, argn argnVar, argn argnVar2, xie xieVar) {
        if (s(a(), xgtVar, argnVar, argnVar2)) {
            xgtVar.getClass();
            u(xgtVar, argnVar, argnVar2, xieVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(xgt xgtVar, List list, xie xieVar) {
        if (p(a(), xgtVar)) {
            argn argnVarC = c(xgtVar.f);
            agjz agjzVar = new agjz(4);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                argn argnVar = (argn) it.next();
                if (s(a(), xgtVar, argnVar)) {
                    argn argnVarB = b(argnVar);
                    if (!xgtVar.j(argnVarB, argnVarC)) {
                        agjzVar.h(argnVarB);
                    }
                }
            }
            agke agkeVarG = agjzVar.g();
            if (agkeVarG.isEmpty()) {
                return;
            }
            t(xgtVar, argnVarC, agkeVarG, xieVar);
            xhf xhfVar = (xhf) this.c.io();
            String str = xgtVar.a;
            if (xhfVar.c()) {
                return;
            }
            agqs agqsVarListIterator = agkeVarG.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                xhfVar.e((argn) agqsVarListIterator.next(), argnVarC, str, xieVar);
            }
        }
    }

    public final void j(xgt xgtVar, ameb amebVar, argn argnVar, amdd amddVar, xie xieVar) {
        if (s(a(), xgtVar, argnVar)) {
            xgl xglVar = this.p;
            long j = xieVar.a;
            if (((vxz) xglVar.c).l(154, 45737748L, false) && amebVar == ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) xglVar.b;
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (j - ((xgk) ((Map.Entry) it.next()).getValue()).b > 1000) {
                        it.remove();
                    }
                }
                String str = xgtVar.a;
                xgk xgkVar = (xgk) linkedHashMap.get(xgl.a(argnVar, str));
                if (xgkVar != null && Math.abs(j - xgkVar.b) < xglVar.a) {
                    return;
                }
                xgk xgkVar2 = new xgk(argnVar, j, str);
                String strA = xgl.a(xgkVar2.a, xgkVar2.c);
                linkedHashMap.remove(strA);
                linkedHashMap.put(strA, xgkVar2);
            }
            String str2 = xgtVar.a;
            argn argnVarB = b(argnVar);
            aihf aihfVarCreateBuilder = amcb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amcb amcbVar = (amcb) aihfVarCreateBuilder.instance;
            str2.getClass();
            amcbVar.b |= 1;
            amcbVar.c = str2;
            aihfVarCreateBuilder.copyOnWrite();
            amcb amcbVar2 = (amcb) aihfVarCreateBuilder.instance;
            amcbVar2.f = amebVar.u;
            amcbVar2.b |= 8;
            aihfVarCreateBuilder.copyOnWrite();
            amcb amcbVar3 = (amcb) aihfVarCreateBuilder.instance;
            argnVarB.getClass();
            amcbVar3.d = argnVarB;
            amcbVar3.b |= 2;
            if (amddVar != null && !amddVar.equals(amdd.a)) {
                aihfVarCreateBuilder.copyOnWrite();
                amcb amcbVar4 = (amcb) aihfVarCreateBuilder.instance;
                amcbVar4.e = amddVar;
                amcbVar4.b |= 4;
            }
            amcb amcbVar5 = (amcb) aihfVarCreateBuilder.build();
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            amcbVar5.getClass();
            alouVar.d = amcbVar5;
            alouVar.c = 78;
            d(alosVar, xgtVar, xieVar);
            xhf xhfVar = (xhf) this.c.io();
            if (xhfVar.c()) {
                return;
            }
            HashMap map = new HashMap();
            argn argnVar2 = amcbVar5.d;
            if (argnVar2 == null) {
                argnVar2 = argn.a;
            }
            map.put("client.params.ve", xhf.i(argnVar2));
            if ((amcbVar5.b & 1) == 0 || amcbVar5.c.isEmpty()) {
                argn argnVar3 = amcbVar5.d;
                if (argnVar3 == null) {
                    argnVar3 = argn.a;
                }
                xhf.j("INTERACTIONLOGGINGBUG->CLICK_MISSING_CSN", "ve: " + xhf.i(argnVar3) + " event_context: " + xieVar.toString());
                xhfVar.f("INTERACTIONLOGGINGBUG->CLICK_MISSING_CSN", map);
                return;
            }
            Map map2 = xhfVar.a;
            if (map2.containsKey(amcbVar5.c)) {
                xsc xscVar = (xsc) map2.get(amcbVar5.c);
                argn argnVar4 = amcbVar5.d;
                if (argnVar4 == null) {
                    argnVar4 = argn.a;
                }
                xhfVar.o("CLICK", xscVar, argnVar4, map);
                return;
            }
            argn argnVar5 = amcbVar5.d;
            if (argnVar5 == null) {
                argnVar5 = argn.a;
            }
            xhf.j("INTERACTIONLOGGINGBUG->CLICK_UNRESOLVED_CSN", "ve: " + xhf.i(argnVar5) + " event_context: " + xieVar.toString());
            xhfVar.f("INTERACTIONLOGGINGBUG->CLICK_UNRESOLVED_CSN", map);
        }
    }

    public final void k(xgt xgtVar, argn argnVar, String str, xie xieVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str) || !xgtVar.m.contains(str)) {
            String str2 = xgtVar.a;
            argn argnVarB = b(argnVar);
            aihf aihfVarCreateBuilder = ambx.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ambx ambxVar = (ambx) aihfVarCreateBuilder.instance;
            str2.getClass();
            ambxVar.b |= 4;
            ambxVar.e = str2;
            aihfVarCreateBuilder.copyOnWrite();
            ambx ambxVar2 = (ambx) aihfVarCreateBuilder.instance;
            argnVarB.getClass();
            ambxVar2.d = argnVarB;
            ambxVar2.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            ambx ambxVar3 = (ambx) aihfVarCreateBuilder.instance;
            str.getClass();
            ambxVar3.b |= 1;
            ambxVar3.c = str;
            ambx ambxVar4 = (ambx) aihfVarCreateBuilder.build();
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            ambxVar4.getClass();
            alouVar.d = ambxVar4;
            alouVar.c = 202;
            d(alosVar, xgtVar, xieVar);
            if (!TextUtils.isEmpty(str)) {
                xgtVar.m.add(str);
            }
        }
    }

    @Deprecated
    public final void l(xgt xgtVar, xie xieVar) {
        xgtVar.k();
        m(xgtVar, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_DESTROYED, xieVar);
    }

    public final void m(xgt xgtVar, amec amecVar, xie xieVar) {
        aihf aihfVarCreateBuilder = amcc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amcc amccVar = (amcc) aihfVarCreateBuilder.instance;
        String str = xgtVar.a;
        str.getClass();
        amccVar.b |= 1;
        amccVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        amcc amccVar2 = (amcc) aihfVarCreateBuilder.instance;
        amccVar2.f = amecVar.i;
        amccVar2.b |= 8;
        argn argnVarC = c(xgtVar.f);
        aihfVarCreateBuilder.copyOnWrite();
        amcc amccVar3 = (amcc) aihfVarCreateBuilder.instance;
        argnVarC.getClass();
        amccVar3.d = argnVarC;
        amccVar3.b |= 2;
        amcc amccVar4 = (amcc) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amccVar4.getClass();
        alouVar.d = amccVar4;
        alouVar.c = 73;
        d(alosVar, xgtVar, xieVar);
        ((xhf) this.c.io()).g(amccVar4, xieVar);
    }

    public final void n(xgt xgtVar, xhm xhmVar, xie xieVar) {
        if (q(a(), xgtVar, xhmVar)) {
            if (this.i && xhmVar.g.isEmpty()) {
                xgtVar.g.add(xhmVar.f);
            }
            if (r(xhmVar)) {
                if ((xhmVar.c.b() == amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN && this.j) || xgtVar.i(xhmVar, this.l)) {
                    return;
                }
                xgtVar.e(xhmVar, this.m);
                aihf aihfVarCreateBuilder = amcd.a.createBuilder();
                String str = xgtVar.a;
                aihfVarCreateBuilder.copyOnWrite();
                amcd amcdVar = (amcd) aihfVarCreateBuilder.instance;
                str.getClass();
                amcdVar.b |= 1;
                amcdVar.c = str;
                amec amecVar = xhmVar.e;
                aihfVarCreateBuilder.copyOnWrite();
                amcd amcdVar2 = (amcd) aihfVarCreateBuilder.instance;
                amcdVar2.f = amecVar.i;
                amcdVar2.b |= 8;
                argn argnVar = xhmVar.f;
                aihfVarCreateBuilder.copyOnWrite();
                amcd amcdVar3 = (amcd) aihfVarCreateBuilder.instance;
                argnVar.getClass();
                amcdVar3.d = argnVar;
                amcdVar3.b |= 2;
                amdd amddVar = xhmVar.h;
                if (amddVar != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    amcd amcdVar4 = (amcd) aihfVarCreateBuilder.instance;
                    amcdVar4.e = amddVar;
                    amcdVar4.b |= 4;
                }
                Optional optional = xhmVar.g;
                if (optional.isPresent()) {
                    aihf aihfVarCreateBuilder2 = atqe.a.createBuilder();
                    atqd atqdVar = (atqd) optional.get();
                    aihfVarCreateBuilder2.copyOnWrite();
                    atqe atqeVar = (atqe) aihfVarCreateBuilder2.instance;
                    atqeVar.c = atqdVar;
                    atqeVar.b |= 1;
                    atqe atqeVar2 = (atqe) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    amcd amcdVar5 = (amcd) aihfVarCreateBuilder.instance;
                    atqeVar2.getClass();
                    amcdVar5.g = atqeVar2;
                    amcdVar5.b |= 16;
                }
                amcd amcdVar6 = (amcd) aihfVarCreateBuilder.build();
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                amcdVar6.getClass();
                alouVar.d = amcdVar6;
                alouVar.c = 72;
                d(alosVar, xgtVar, xieVar);
                ((xhf) this.c.io()).h(amcdVar6, xieVar);
            }
        }
    }

    public final void o(xgt xgtVar, argn argnVar, amdd amddVar, xie xieVar) {
        if (!s(a(), xgtVar, argnVar) || amddVar == null) {
            return;
        }
        xgtVar.getClass();
        String str = xgtVar.a;
        if (str.isEmpty()) {
            ((agrc) ((agrc) n.c()).k("com/google/android/libraries/youtube/logging/interaction/InteractionLoggingController", "logVisualElementStateChangedLoggingThread", 953, "InteractionLoggingController.java")).t("[InteractionLogging] csn is empty for state change event, please provide a valid csn");
            return;
        }
        argn argnVarB = b(argnVar);
        aihf aihfVarCreateBuilder = amce.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amce amceVar = (amce) aihfVarCreateBuilder.instance;
        str.getClass();
        amceVar.b |= 1;
        amceVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        amce amceVar2 = (amce) aihfVarCreateBuilder.instance;
        argnVarB.getClass();
        amceVar2.d = argnVarB;
        amceVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        amce amceVar3 = (amce) aihfVarCreateBuilder.instance;
        amceVar3.e = amddVar;
        amceVar3.b |= 4;
        amce amceVar4 = (amce) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amceVar4.getClass();
        alouVar.d = amceVar4;
        alouVar.c = 208;
        ((wjr) this.g.io()).A(alosVar, xieVar);
    }
}
