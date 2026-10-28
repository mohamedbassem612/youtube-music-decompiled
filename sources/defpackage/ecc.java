package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecc implements eao, eco, eaa {
    Boolean a;
    private final Context b;
    private final ecb d;
    private boolean e;
    private final eam h;
    private final dyl i;
    private final ecd k;
    private final qv l;
    private final dov m;
    private final axfd n;
    private final Map c = new HashMap();
    private final Object f = new Object();
    private final ear g = new eat(new eas());
    private final Map j = new HashMap();

    static {
        dzf.a("GreedyScheduler");
    }

    public ecc(Context context, dyl dylVar, axfd axfdVar, eam eamVar, qv qvVar, axfd axfdVar2) {
        this.b = context;
        dzp dzpVar = dylVar.e;
        this.d = new ecb(this, dzpVar);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.k = new ecd(dzpVar, qvVar, 5400000L);
        this.n = axfdVar2;
        this.m = new dov(axfdVar);
        this.i = dylVar;
        this.h = eamVar;
        this.l = qvVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(efs.a(this.b, this.i));
    }

    private final void g() {
        if (this.e) {
            return;
        }
        this.h.c(this);
        this.e = true;
    }

    @Override // defpackage.eaa
    public final void a(eek eekVar, boolean z) {
        awwd awwdVar;
        dov dovVarB = this.g.b(eekVar);
        if (dovVarB != null) {
            this.k.a(dovVarB);
        }
        synchronized (this.f) {
            awwdVar = (awwd) this.c.remove(eekVar);
        }
        if (awwdVar != null) {
            dzf.b();
            Objects.toString(eekVar);
            awwdVar.p(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f) {
            this.j.remove(eekVar);
        }
    }

    @Override // defpackage.eao
    public final void b(String str) {
        List<dov> listAp;
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            dzf.b();
            return;
        }
        g();
        dzf.b();
        ecb ecbVar = this.d;
        if (ecbVar != null && (runnable = (Runnable) ecbVar.c.remove(str)) != null) {
            ecbVar.b.a(runnable);
        }
        ear earVar = this.g;
        str.getClass();
        synchronized (((eat) earVar).b) {
            ear earVar2 = ((eat) earVar).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = ((eas) earVar2).a;
            for (Map.Entry entry : map.entrySet()) {
                if (awrc.c(((eek) entry.getKey()).a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                map.remove((eek) it.next());
            }
            listAp = atqq.ap(linkedHashMap.values());
        }
        for (dov dovVar : listAp) {
            this.k.a(dovVar);
            qv qvVar = this.l;
            dovVar.getClass();
            qvVar.l(dovVar, -512);
        }
    }

    @Override // defpackage.eao
    public final void c(ees... eesVarArr) {
        long jMax;
        ees[] eesVarArr2 = eesVarArr;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            dzf.b();
            return;
        }
        g();
        HashSet<ees> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = eesVarArr2.length;
        int i = 0;
        while (i < length) {
            ees eesVar = eesVarArr2[i];
            eesVar.getClass();
            int i2 = eesVar.t;
            String str = eesVar.c;
            eek eekVar = new eek(str, i2);
            ear earVar = this.g;
            if (earVar.a(eekVar)) {
                hashSet2 = hashSet2;
                length = length;
            } else {
                synchronized (this.f) {
                    eesVar.getClass();
                    eek eekVar2 = new eek(str, i2);
                    Map map = this.j;
                    syj syjVar = (syj) map.get(eekVar2);
                    if (syjVar == null) {
                        int i3 = eesVar.m;
                        bnz bnzVar = this.i.k;
                        syjVar = new syj(i3, System.currentTimeMillis(), null);
                        map.put(eekVar2, syjVar);
                    }
                    jMax = syjVar.b + (((long) Math.max((eesVar.m - syjVar.a) - 5, 0)) * 30000);
                }
                long jMax2 = Math.max(eesVar.a(), jMax);
                bnz bnzVar2 = this.i.k;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (eesVar.d == dzr.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        ecb ecbVar = this.d;
                        if (ecbVar != null) {
                            Map map2 = ecbVar.c;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                ecbVar.b.a(runnable);
                            }
                            br brVar = new br(ecbVar, eesVar, 10);
                            map2.put(str, brVar);
                            ecbVar.b.b(jMax2 - System.currentTimeMillis(), brVar);
                        }
                    } else if (eesVar.c()) {
                        dyn dynVar = eesVar.l;
                        if (dynVar.d) {
                            dzf.b();
                            Objects.toString(eesVar);
                        } else if (dynVar.b()) {
                            dzf.b();
                            Objects.toString(eesVar);
                        } else {
                            hashSet.add(eesVar);
                            hashSet2.add(str);
                        }
                    } else {
                        eesVar.getClass();
                        if (!earVar.a(new eek(str, i2))) {
                            dzf.b();
                            eesVar.getClass();
                            dov dovVarC = earVar.c(new eek(str, i2));
                            this.k.b(dovVarC);
                            this.l.k(dovVarC, null);
                        }
                    }
                }
            }
            i++;
            eesVarArr2 = eesVarArr;
            hashSet2 = hashSet2;
            length = length;
        }
        HashSet hashSet3 = hashSet2;
        synchronized (this.f) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet3);
                dzf.b();
                for (ees eesVar2 : hashSet) {
                    eesVar2.getClass();
                    eek eekVar3 = new eek(eesVar2.c, eesVar2.t);
                    Map map3 = this.c;
                    if (!map3.containsKey(eekVar3)) {
                        map3.put(eekVar3, ecu.a(this.m, eesVar2, (awuq) this.n.b, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.eao
    public final boolean d() {
        return false;
    }

    @Override // defpackage.eco
    public final void e(ees eesVar, bou bouVar) {
        eek eekVar = new eek(eesVar.c, eesVar.t);
        if (bouVar instanceof ech) {
            ear earVar = this.g;
            if (earVar.a(eekVar)) {
                return;
            }
            dzf.b();
            eekVar.toString();
            eekVar.toString();
            dov dovVarC = earVar.c(eekVar);
            this.k.b(dovVarC);
            this.l.k(dovVarC, null);
            return;
        }
        dzf.b();
        eekVar.toString();
        eekVar.toString();
        dov dovVarB = this.g.b(eekVar);
        if (dovVarB != null) {
            this.k.a(dovVarB);
            this.l.l(dovVarB, ((eci) bouVar).a);
        }
    }
}
