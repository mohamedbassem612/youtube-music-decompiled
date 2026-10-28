package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwp {
    public final awut a;
    public final tqj b;
    public final vxz c;
    private final mbc d;
    private final tqv e;
    private final LinkedHashMap f;
    private final List g;
    private avmn h;
    private final agfr i;
    private final agfr j;
    private final agfr k;
    private final awmi l;
    private final dov m;

    public vwp(dov dovVar, awut awutVar, mbc mbcVar, vxz vxzVar, tqv tqvVar, tqj tqjVar) {
        dovVar.getClass();
        awutVar.getClass();
        mbcVar.getClass();
        vxzVar.getClass();
        tqvVar.getClass();
        tqjVar.getClass();
        this.m = dovVar;
        this.a = awutVar;
        this.d = mbcVar;
        this.c = vxzVar;
        this.e = tqvVar;
        this.b = tqjVar;
        this.f = new LinkedHashMap();
        this.g = new ArrayList();
        agfr agfrVarAl = aguu.al(new tpc(this, 7));
        agfrVarAl.getClass();
        this.i = agfrVarAl;
        agfr agfrVarAl2 = aguu.al(new tpc(this, 8));
        agfrVarAl2.getClass();
        this.j = agfrVarAl2;
        agfr agfrVarAl3 = aguu.al(new tpc(this, 9));
        agfrVarAl3.getClass();
        this.k = agfrVarAl3;
        this.l = new awmp(new ebk(this, 19));
    }

    private final void h() {
        LinkedHashMap linkedHashMap = this.f;
        long jB = this.d.b();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (linkedHashMap.size() < ((Number) this.j.io()).longValue() && jB < ((Number) entry.getValue()).longValue()) {
                return;
            } else {
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [awqg, java.lang.Object] */
    private final synchronized void i(String str, tmr tmrVar, int i, boolean z) {
        Boolean boolValueOf;
        int i2;
        h();
        Long l = (Long) this.f.get(str);
        if (l != null) {
            boolValueOf = Boolean.valueOf((boolean) ((this.d.b() > l.longValue() ? 1 : (this.d.b() == l.longValue() ? 0 : -1)) >>> 31));
        } else {
            boolValueOf = null;
        }
        axst axstVarQ = afyd.Q(alwy.a.createBuilder());
        axstVarQ.q(2);
        int i3 = 5;
        if (z) {
            i2 = 5;
        } else {
            i2 = awrc.c(boolValueOf, Boolean.TRUE) ? 4 : 3;
        }
        axstVarQ.p(i2);
        axstVarQ.l(i);
        tmt tmtVar = tmrVar.b;
        vrl vrlVar = new vrl(new uwk(axstVarQ, 10), i3);
        Optional optional = tmtVar.i;
        if (true == optional.isPresent()) {
            vrlVar.a.invoke(optional.get());
        }
        axstVarQ.m(l(tmrVar));
        if (k()) {
            axstVarQ.k(afyd.h(str));
        }
        j(axstVarQ.j());
    }

    private final synchronized void j(alwy alwyVar) {
        List list = this.g;
        list.add(alwyVar);
        if (this.h == null) {
            tqv tqvVar = this.e;
            this.h = tqvVar.a.K(new rtq(17)).r().af(new vva(new uwk(this, 8), 3));
        }
        if (list.size() >= ((Number) this.k.io()).intValue()) {
            awro.r(this.a, awov.a, 1, new hqx(this, (awoq) null, 10, (byte[]) null));
        }
    }

    private final boolean k() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    private static final int l(tmr tmrVar) {
        tmp tmpVar = tmrVar.a;
        return tmpVar.b() + (-1) != 0 ? tmpVar.c().b : tmpVar.a().length;
    }

    public final synchronized void a() {
        List list = this.g;
        if (list.isEmpty()) {
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.getClass();
        aihf aihfVarCreateBuilder = alwz.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((alwz) aihfVarCreateBuilder.instance).b);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
        aihfVarCreateBuilder.copyOnWrite();
        alwz alwzVar = (alwz) aihfVarCreateBuilder.instance;
        aiie aiieVar = alwzVar.b;
        if (!aiieVar.c()) {
            alwzVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, alwzVar.b);
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alouVar.d = (alwz) aihnVarBuild;
        alouVar.c = 505;
        this.m.R(afxw.at(alosVar));
        list.clear();
    }

    public final synchronized void b(int i) {
        axst axstVarQ = afyd.Q(alwy.a.createBuilder());
        axstVarQ.q(5);
        axstVarQ.l(i);
        j(axstVarQ.j());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awqg, java.lang.Object] */
    public final synchronized void c(String str, tmr tmrVar, int i) {
        str.getClass();
        tmt tmtVar = tmrVar.b;
        mbc mbcVar = this.d;
        if (tmtVar.b(mbcVar)) {
            return;
        }
        axst axstVarQ = afyd.Q(alwy.a.createBuilder());
        axstVarQ.q(4);
        axstVarQ.l(i);
        vrl vrlVar = new vrl(new uwk(axstVarQ, 11), 6);
        Optional optional = tmtVar.i;
        if (true == optional.isPresent()) {
            vrlVar.a.invoke(optional.get());
        }
        if (!tmrVar.c()) {
            axstVarQ.o();
        }
        axstVarQ.m(l(tmrVar));
        if (k()) {
            axstVarQ.k(afyd.h(str));
        }
        j(axstVarQ.j());
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.remove(str);
        }
        h();
        long jB = mbcVar.b();
        Object objIo = this.i.io();
        objIo.getClass();
        linkedHashMap.put(str, Long.valueOf(jB + ((Number) objIo).longValue()));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awqg, java.lang.Object] */
    public final synchronized void d(String str, tmr tmrVar, int i, boolean z) {
        str.getClass();
        tmrVar.getClass();
        axst axstVarQ = afyd.Q(alwy.a.createBuilder());
        axstVarQ.q(2);
        axstVarQ.p(2);
        axstVarQ.l(i);
        vrl vrlVar = new vrl(new uwk(axstVarQ, 9), 4);
        Optional optional = tmrVar.b.i;
        if (true == optional.isPresent()) {
            vrlVar.a.invoke(optional.get());
        }
        if (z) {
            axstVarQ.o();
        }
        axstVarQ.m(l(tmrVar));
        if (k()) {
            axstVarQ.k(afyd.h(str));
        }
        j(axstVarQ.j());
    }

    public final synchronized void e(int i) {
        int i2 = tqr.a;
        if (this.b.k(1073815163)) {
            axst axstVarQ = afyd.Q(alwy.a.createBuilder());
            axstVarQ.q(6);
            axstVarQ.l(i);
            j(axstVarQ.j());
        }
    }

    public final synchronized void f(String str, tmr tmrVar, int i) {
        str.getClass();
        i(str, tmrVar, i, true);
    }

    public final synchronized void g(String str, tmr tmrVar, int i) {
        str.getClass();
        i(str, tmrVar, i, false);
    }
}
