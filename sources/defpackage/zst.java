package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zst implements ztf {
    final HashMap a;
    protected final ztk b;
    final double c;
    private final awmd d;
    private final mbc e;
    private long g;
    private int h;
    private final double i;
    private final boolean j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private volatile boolean o;
    private final zuh p;
    private final Executor r;
    private final tfq s;
    private final zrs t;
    private final abwk u;
    private volatile int n = -1;
    private Map f = new HashMap();

    public zst(zrs zrsVar, ztk ztkVar, abwk abwkVar, zwb zwbVar, tbt tbtVar, ci ciVar, Executor executor, awmd awmdVar, mbc mbcVar, tfq tfqVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        this.t = zrsVar;
        this.b = ztkVar;
        this.u = abwkVar;
        this.d = awmdVar;
        this.e = mbcVar;
        this.s = tfqVar;
        HashMap map = new HashMap();
        this.a = map;
        this.j = zrsVar.k();
        this.i = zrsVar.a();
        this.c = zrsVar.c().m;
        long j = zrsVar.c().f;
        long epochMilli = mbcVar.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(j <= 0 ? 5L : j);
        this.g = epochMilli;
        map.put(akku.DELAYED_EVENT_TIER_DEFAULT, new zvc(epochMilli, "delayed_event_dispatch_default_tier_one_off_task", zrsVar.d()));
        map.put(akku.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY, new zvc(this.g, "delayed_event_dispatch_dispatch_to_empty_tier_one_off_task", zrsVar.e()));
        map.put(akku.DELAYED_EVENT_TIER_FAST, new zvc(this.g, "delayed_event_dispatch_fast_tier_one_off_task", zrsVar.f()));
        map.put(akku.DELAYED_EVENT_TIER_IMMEDIATE, new zvc(this.g, "not_applicable_delayed_event_dispatch_immediate_tier_one_off_task", zrsVar.g()));
        this.k = awmdVar2;
        this.l = awmdVar3;
        this.m = awmdVar4;
        this.p = new zuh(zwbVar, ciVar, null, tbtVar);
        this.r = executor;
    }

    private final synchronized void A(akku akkuVar) {
        akkuVar.name();
        N();
        taq.c();
        if (!this.o) {
            if (this.f.isEmpty()) {
                C("Failed delayed event dispatch, no dispatchers in dispatchEventsForcedByTierUntilEmpty.(" + akkuVar.name() + ").", null);
                return;
            }
            if (!G(akkuVar)) {
                C("Invalid tier is supplied in dispatchEventsForcedByTierUntilEmpty. Falls back to default tier.", null);
                akkuVar = akku.DELAYED_EVENT_TIER_DEFAULT;
            }
            if (E(akkuVar)) {
                A(akkuVar);
            }
        }
    }

    private final void B(SQLException sQLException) {
        if (this.t.c().i && (sQLException instanceof SQLiteBlobTooBigException)) {
            this.b.h();
        }
        zss zssVar = new zss("The DB is deleted since large record > 2MB is encountered: ".concat(sQLException.toString()));
        C("DB dropped on large record: ", zssVar);
        throw zssVar;
    }

    private final void C(String str, Exception exc) {
        double d = this.c;
        if (exc != null) {
            if (Math.random() < d) {
                twu.d("GEL_DELAYED_EVENT_DEBUG", 6, str, exc);
            }
            if (this.j) {
                double d2 = this.i;
                zvp.f(zvn.a, zvm.m, "GEL_DELAYED_EVENT_DEBUG ".concat(str), exc, d2);
                return;
            }
            return;
        }
        if (Math.random() < d) {
            twu.d("GEL_DELAYED_EVENT_DEBUG", 6, str, null);
        }
        if (this.j) {
            double d3 = this.i;
            zvp.h(zvn.a, zvm.m, "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(str), d3);
        }
    }

    private final void D(akku akkuVar) {
        if (H(akkuVar)) {
            Bundle bundle = new Bundle();
            zvc zvcVarX = x(akkuVar);
            bundle.putInt("tier_type", akkuVar.f);
            String str = zvcVarX.a;
            akkn akknVar = zvcVarX.b;
            syn synVar = (syn) this.d.io();
            awmd awmdVar = this.k;
            synVar.d(str, (((vxz) awmdVar.io()).c(2, 45369112L, 0L) <= 0 || !this.s.j(0)) ? akknVar.c : ((vxz) awmdVar.io()).c(2, 45369112L, 0L), 1, 1, false, bundle, null, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    private final boolean E(akku akkuVar) {
        mbc mbcVar = this.e;
        long epochMilli = mbcVar.f().toEpochMilli();
        x(akkuVar).c = epochMilli;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        long j = epochMilli - this.g;
        this.g = epochMilli;
        ArrayList arrayList = new ArrayList();
        List listD = d();
        HashMap map3 = new HashMap();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            aihf aihfVar = (aihf) it.next();
            String str = ((jrc) aihfVar.instance).d;
            zsz zszVar = (zsz) this.f.get(str);
            if (zszVar == null) {
                arrayList.add(aihfVar);
                C("Failed to find delayed event dispatcher for type ".concat(String.valueOf(str)), null);
            } else {
                akku akkuVarA = akku.DELAYED_EVENT_TIER_DEFAULT;
                jrc jrcVar = (jrc) aihfVar.instance;
                if ((jrcVar.b & SemanticState.LiveRegion) != 0) {
                    akku akkuVarA2 = akku.a(jrcVar.l);
                    if (akkuVarA2 == null) {
                        akkuVarA2 = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                    }
                    if (G(akkuVarA2) && (akkuVarA = akku.a(((jrc) aihfVar.instance).l)) == null) {
                        akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                    }
                }
                zsa zsaVarA = zszVar.a();
                long epochMilli2 = mbcVar.f().toEpochMilli();
                mbc mbcVar2 = mbcVar;
                Iterator it2 = it;
                if (epochMilli2 - ((jrc) aihfVar.instance).f <= TimeUnit.HOURS.toMillis(zsaVarA.b())) {
                    jrc jrcVar2 = (jrc) aihfVar.instance;
                    if (jrcVar2.i <= 0 || epochMilli2 - jrcVar2.h <= TimeUnit.MINUTES.toMillis(zsaVarA.d())) {
                        M(map, zszVar, akkuVarA, aihfVar);
                        K(map3, str, false);
                    } else {
                        arrayList.add(aihfVar);
                        if (zszVar.a().e()) {
                            M(map2, zszVar, akkuVarA, aihfVar);
                        }
                        K(map3, str, true);
                    }
                } else {
                    arrayList.add(aihfVar);
                    if (zszVar.a().e()) {
                        M(map2, zszVar, akkuVarA, aihfVar);
                    }
                    K(map3, str, true);
                }
                mbcVar = mbcVar2;
                it = it2;
            }
        }
        abwk abwkVar = this.u;
        if (abwkVar != null && abwkVar.g()) {
            for (Map.Entry entry : map3.entrySet()) {
                abwkVar.f((String) entry.getKey(), ((Integer) ((axq) entry.getValue()).a).intValue(), ((Integer) ((axq) entry.getValue()).b).intValue());
            }
        }
        if (!map2.isEmpty()) {
            Map mapZ = z(map2, arrayList, akkuVar, true);
            for (zsz zszVar2 : mapZ.keySet()) {
                if (zszVar2.a().e()) {
                    zszVar2.c();
                    N();
                    List<aihf> listY = y(mapZ, zszVar2);
                    HashMap map4 = new HashMap();
                    for (aihf aihfVar2 : listY) {
                        jrc jrcVar3 = (jrc) aihfVar2.instance;
                        ((List) j$.util.Map.EL.computeIfAbsent(map4, new axq(jrcVar3.g, jrcVar3.j), new yom(13))).add(aihfVar2);
                    }
                    for (Map.Entry entry2 : map4.entrySet()) {
                        axq axqVar = (axq) entry2.getKey();
                        List list = (List) entry2.getValue();
                        new zvh((String) axqVar.b, F(list));
                        zszVar2.f((String) axqVar.a, list);
                    }
                }
            }
        }
        Map mapZ2 = z(map, arrayList, akkuVar, false);
        for (zsz zszVar3 : mapZ2.keySet()) {
            zszVar3.c();
            N();
            List<aihf> listY2 = y(mapZ2, zszVar3);
            if (!listY2.isEmpty()) {
                if (abwkVar != null && abwkVar.g()) {
                    abwkVar.e(zszVar3.c(), listY2.size(), j);
                }
                HashMap map5 = new HashMap();
                for (aihf aihfVar3 : listY2) {
                    jrc jrcVar4 = (jrc) aihfVar3.instance;
                    axq axqVar2 = new axq(jrcVar4.g, jrcVar4.j);
                    if (!map5.containsKey(axqVar2)) {
                        map5.put(axqVar2, new ArrayList());
                    }
                    ((List) map5.get(axqVar2)).add(aihfVar3);
                }
                for (Map.Entry entry3 : map5.entrySet()) {
                    axq axqVar3 = (axq) entry3.getKey();
                    List list2 = (List) entry3.getValue();
                    zso zsoVar = new zso(new zvh((String) axqVar3.b, F(list2)), akkuVar);
                    zszVar3.c();
                    N();
                    zszVar3.d((String) axqVar3.a, zsoVar, list2);
                }
            }
        }
        return !J(akkuVar, map).isEmpty();
    }

    private static boolean F(List list) {
        if (list.isEmpty()) {
            return false;
        }
        return ((jrc) ((aihf) list.get(0)).instance).k;
    }

    private final boolean G(akku akkuVar) {
        return this.a.containsKey(akkuVar);
    }

    private final synchronized boolean H(akku akkuVar) {
        zvc zvcVarX = x(akkuVar);
        long epochMilli = this.e.f().toEpochMilli();
        if (epochMilli - zvcVarX.d <= Duration.ofSeconds(zvcVarX.b.d).toMillis()) {
            return false;
        }
        zvcVarX.d = epochMilli;
        this.a.put(akkuVar, zvcVarX);
        return true;
    }

    private final boolean I() {
        tfq tfqVar = this.s;
        if (!tfqVar.h()) {
            return false;
        }
        akkk akkkVarC = this.t.c();
        return ((akkkVarC.b & 8388608) != 0 && akkkVarC.l && tfqVar.j(0)) ? false : true;
    }

    private static final Set J(akku akkuVar, Map map) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            if (((Map) entry.getValue()).containsKey(akkuVar)) {
                hashSet.add((zsz) entry.getKey());
            }
        }
        return hashSet;
    }

    private static final void K(Map map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, new axq(0, 0));
        }
        axq axqVar = (axq) map.get(str);
        map.put(str, z ? new axq((Integer) axqVar.a, Integer.valueOf(((Integer) axqVar.b).intValue() + 1)) : new axq(Integer.valueOf(((Integer) axqVar.a).intValue() + 1), (Integer) axqVar.b));
    }

    private static final boolean L(akku akkuVar) {
        return akkuVar == akku.DELAYED_EVENT_TIER_DEFAULT || akkuVar == akku.DELAYED_EVENT_TIER_UNSPECIFIED || akkuVar == akku.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY;
    }

    private static final void M(Map map, zsz zszVar, akku akkuVar, aihf aihfVar) {
        ((List) j$.util.Map.EL.computeIfAbsent((Map) j$.util.Map.EL.computeIfAbsent(map, zszVar, new yom(11)), akkuVar, new yom(12))).add(aihfVar);
    }

    private static final void N() {
        taf.g(zzg.d(), new uqk(6));
    }

    private final synchronized int w() {
        int iMax;
        Iterator it = this.f.values().iterator();
        iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((zsz) it.next()).a().a());
        }
        return iMax;
    }

    private final zvc x(akku akkuVar) {
        if (!G(akkuVar)) {
            C("Invalid tier is supplied in getInfoByTier. Falls back to default tier.", null);
            akkuVar = akku.DELAYED_EVENT_TIER_DEFAULT;
        }
        return (zvc) this.a.get(akkuVar);
    }

    private static List y(Map map, zsz zszVar) {
        List list = (List) map.get(zszVar);
        return list.subList(0, Math.min(zszVar.a().a(), list.size()));
    }

    private final Map z(Map map, List list, akku akkuVar, boolean z) {
        Iterator it;
        ArrayList arrayList;
        akku akkuVar2 = akkuVar;
        Set setJ = J(akkuVar2, map);
        HashSet hashSet = new HashSet();
        HashMap map2 = new HashMap();
        Iterator it2 = setJ.iterator();
        while (it2.hasNext()) {
            zsz zszVar = (zsz) it2.next();
            ArrayList arrayList2 = new ArrayList();
            Map map3 = (Map) map.get(zszVar);
            ArrayList arrayList3 = new ArrayList(map3.keySet());
            Collections.sort(arrayList3, Collections.reverseOrder());
            if (map3.containsKey(akkuVar2)) {
                arrayList3.remove(akkuVar2);
                arrayList3.add(0, akkuVar2);
            }
            int iA = zszVar.a().a();
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                akku akkuVar3 = (akku) arrayList3.get(i);
                int size2 = iA - arrayList2.size();
                if (size2 <= 0) {
                    break;
                }
                List list2 = (List) map3.get(akkuVar3);
                if (size2 < list2.size()) {
                    it = it2;
                    arrayList = arrayList3;
                    ArrayList arrayList4 = new ArrayList(list2.subList(0, size2));
                    arrayList2.addAll(arrayList4);
                    if (!z) {
                        hashSet.addAll(arrayList4);
                        if (L(akkuVar3)) {
                            this.h -= arrayList4.size();
                        }
                    }
                    map3.put(akkuVar3, new ArrayList(list2.subList(size2, list2.size())));
                } else {
                    it = it2;
                    arrayList = arrayList3;
                    arrayList2.addAll(list2);
                    if (!z) {
                        hashSet.addAll(list2);
                        if (L(akkuVar3)) {
                            this.h -= list2.size();
                        }
                    }
                    map3.remove(akkuVar3);
                    if (map3.isEmpty()) {
                        map.remove(zszVar);
                    }
                }
                i++;
                it2 = it;
                arrayList3 = arrayList;
            }
            map2.put(zszVar, arrayList2);
            akkuVar2 = akkuVar;
            it2 = it2;
        }
        if (!z) {
            hashSet.addAll(list);
            this.b.g(hashSet);
        }
        return map2;
    }

    @Override // defpackage.ztf
    public final long a() {
        return this.e.b();
    }

    @Override // defpackage.ztf
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ztf
    public final /* synthetic */ zvb c() {
        int i = zte.a;
        return null;
    }

    public final List d() {
        if (this.o) {
            return agpi.a;
        }
        if (((vxz) this.l.io()).l(90, 45461032L, false)) {
            try {
                ztk ztkVar = this.b;
                if (this.n < 0) {
                    this.n = w();
                }
                return ztkVar.b(this.n);
            } catch (SQLException e) {
                B(e);
                return agpi.a;
            }
        }
        ArrayList arrayList = new ArrayList();
        tbf tbfVarA = null;
        try {
            try {
                tbfVarA = this.b.a();
                while (tbfVarA.hasNext()) {
                    arrayList.add((aihf) tbfVarA.next());
                }
                N();
            } catch (SQLException e2) {
                B(e2);
            }
            return arrayList;
        } finally {
            if (tbfVarA != null) {
                tbfVarA.a();
            }
        }
    }

    @Override // defpackage.ztf
    public final void e(awmd awmdVar) {
        Set<zsz> set = (Set) awmdVar.io();
        agkh agkhVarF = agkj.f(set.size());
        for (zsz zszVar : set) {
            String strC = zszVar.c();
            if (!TextUtils.isEmpty(strC) && (zszVar.jc() & 1) != 0) {
                agkhVarF.e(strC, zszVar);
            }
        }
        this.f = agkhVarF.d(true);
    }

    public final synchronized void f() {
        taq.c();
        if (!this.o) {
            if (this.f.isEmpty()) {
                C("Failed delayed event dispatch, no dispatchers in dispatchAllEvents.", null);
                return;
            }
            if (I()) {
                List<akku> listAsList = Arrays.asList(akku.values());
                Collections.sort(listAsList, Collections.reverseOrder());
                for (akku akkuVar : listAsList) {
                    if (G(akkuVar)) {
                        A(akkuVar);
                    }
                }
            }
        }
    }

    public final synchronized void g(akku akkuVar) {
        taq.c();
        if (!this.o) {
            zvc zvcVarX = x(akkuVar);
            if (this.e.f().toEpochMilli() - zvcVarX.c >= TimeUnit.SECONDS.toMillis(zvcVarX.b.c)) {
                h(akkuVar);
            } else {
                akkuVar.name();
                N();
                D(akkuVar);
            }
        }
    }

    public final synchronized void h(akku akkuVar) {
        akkuVar.name();
        N();
        taq.c();
        if (!this.o) {
            if (this.f.isEmpty()) {
                C("Failed delayed event dispatch, no dispatchers in dispatchEventsForcedByTier(" + akkuVar.name() + ").", null);
                return;
            }
            if (!G(akkuVar)) {
                C("Invalid tier is supplied in dispatchEventsForcedByTier. Falls back to default tier.", null);
                akkuVar = akku.DELAYED_EVENT_TIER_DEFAULT;
            }
            if (E(akkuVar)) {
                int iAS = a.aS(x(akkuVar).b.e);
                if (iAS == 0 || iAS != 3) {
                    D(akkuVar);
                } else {
                    h(akkuVar);
                }
            }
        }
    }

    public final synchronized void i() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.f = agpn.b;
        syn synVar = (syn) this.d.io();
        synVar.b("delayed_event_dispatch_one_off_task");
        synVar.b("delayed_event_dispatch_default_tier_one_off_task");
        synVar.b("delayed_event_dispatch_dispatch_to_empty_tier_one_off_task");
        synVar.b("delayed_event_dispatch_fast_tier_one_off_task");
        synVar.b("not_applicable_delayed_event_dispatch_immediate_tier_one_off_task");
        this.b.c();
        this.u.d();
        this.p.b();
    }

    @Override // defpackage.ztf
    public final void j(zsa zsaVar, List list, Throwable th) {
        taq.c();
        if (this.o) {
            return;
        }
        if ((!((vxz) this.m.io()).m(141, 45707657L) || (th instanceof toe)) && yno.aa((toe) th)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aihf aihfVar = (aihf) it.next();
            if ((((jrc) aihfVar.instance).b & 32) == 0) {
                long epochMilli = this.e.f().toEpochMilli();
                aihfVar.copyOnWrite();
                jrc jrcVar = (jrc) aihfVar.instance;
                jrcVar.b |= 32;
                jrcVar.h = epochMilli;
            }
            int i = ((jrc) aihfVar.instance).i;
            if (i >= zsaVar.c()) {
                it.remove();
            } else {
                aihfVar.copyOnWrite();
                jrc jrcVar2 = (jrc) aihfVar.instance;
                jrcVar2.b |= 64;
                jrcVar2.i = i + 1;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.b.i(list);
        D(akku.DELAYED_EVENT_TIER_DEFAULT);
    }

    @Override // defpackage.ztf
    public final void k(zug zugVar) {
        this.r.execute(afwl.i(new zgc(this, zugVar, 9)));
    }

    @Override // defpackage.ztf
    public final void l(zug zugVar) {
        aihf aihfVarR = r(zugVar);
        if (aihfVarR != null) {
            v(aihfVarR);
        }
    }

    public final synchronized boolean o() {
        return this.o || this.b.j();
    }

    @Override // defpackage.ztf
    public final /* synthetic */ boolean p() {
        return zte.a(this);
    }

    @Override // defpackage.ztf
    public final /* synthetic */ zup q() {
        return zte.c(this);
    }

    public final aihf r(zug zugVar) {
        mbc mbcVar = this.e;
        zugVar.l(mbcVar.b(), mbcVar.f().toEpochMilli());
        zuh zuhVar = this.p;
        ReentrantLock reentrantLock = zuhVar.a;
        reentrantLock.lock();
        try {
            boolean zE = zuhVar.e(zugVar);
            reentrantLock.unlock();
            if (!zE) {
                return null;
            }
            aigj aigjVarK = zugVar.k();
            String str = zugVar.n;
            String str2 = zugVar.o;
            if (aigjVarK == null || str == null || str2 == null) {
                return null;
            }
            aihf aihfVarCreateBuilder = jrc.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar = (jrc) aihfVarCreateBuilder.instance;
            jrcVar.b |= 4;
            jrcVar.e = aigjVarK;
            String strC = zugVar.k.f.c();
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar2 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar2.b |= 2;
            jrcVar2.d = strC;
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar3 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar3.b |= 16;
            jrcVar3.g = str;
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar4 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar4.b |= SemanticState.Focused;
            jrcVar4.j = str2;
            boolean z = zugVar.p;
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar5 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar5.b |= SemanticState.Hidden;
            jrcVar5.k = z;
            return aihfVarCreateBuilder;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.ztf
    public final void s(aihf aihfVar) {
        t(akku.DELAYED_EVENT_TIER_DEFAULT, aihfVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0132  */
    /* JADX WARN: Code duplicated, block: B:41:0x0176  */
    /* JADX WARN: Code duplicated, block: B:44:0x0186  */
    @Override // defpackage.ztf
    public final void t(akku akkuVar, aihf aihfVar) {
        taq.c();
        if (this.o) {
            return;
        }
        if (akkuVar == akku.DELAYED_EVENT_TIER_IMMEDIATE) {
            if (this.s.h()) {
                aihfVar.copyOnWrite();
                jrc jrcVar = (jrc) aihfVar.instance;
                jrc jrcVar2 = jrc.a;
                jrcVar.l = akkuVar.f;
                jrcVar.b |= SemanticState.LiveRegion;
                String str = ((jrc) aihfVar.instance).d;
                zsz zszVar = (zsz) this.f.get(str);
                if (zszVar == null) {
                    C("Failed to find delayed event dispatcher for single immediate tier event type ".concat(String.valueOf(str)), null);
                    return;
                }
                jrc jrcVar3 = (jrc) aihfVar.instance;
                axq axqVar = new axq(jrcVar3.g, jrcVar3.j);
                zvh zvhVar = new zvh((String) axqVar.b, jrcVar3.k);
                akku akkuVarA = akku.a(((jrc) aihfVar.instance).l);
                if (akkuVarA == null) {
                    akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                }
                zso zsoVar = new zso(zvhVar, akkuVarA);
                zszVar.c();
                N();
                zszVar.d((String) axqVar.a, zsoVar, agke.q(aihfVar));
                return;
            }
            akkuVar = akku.DELAYED_EVENT_TIER_FAST;
        }
        aihfVar.copyOnWrite();
        jrc jrcVar4 = (jrc) aihfVar.instance;
        jrc jrcVar5 = jrc.a;
        jrcVar4.l = akkuVar.f;
        jrcVar4.b |= SemanticState.LiveRegion;
        boolean zL = ((vxz) this.l.io()).l(115, 45617948L, false);
        ztk ztkVar = this.b;
        if (zL) {
            taq.c();
            ztkVar.m(aihfVar);
            try {
                ztkVar.a.add(aihfVar);
            } catch (RuntimeException e) {
                ztkVar.f("Could not add DelayedEvent of type" + ((jrc) aihfVar.instance).d + " to bufferQueue.", e);
            }
            ztkVar.e();
        } else {
            ztkVar.k(aihfVar);
        }
        long jC = ((vxz) this.m.io()).c(15, 45637870L, 0L);
        if (jC > 0) {
            if (L(akkuVar)) {
                zvc zvcVarX = x(akkuVar);
                if (this.e.f().minusMillis(zvcVarX.c).isBefore(Instant.ofEpochMilli(Duration.ofSeconds(zvcVarX.b.d).toMillis() << 2))) {
                    int i = this.h + 1;
                    this.h = i;
                    if (i < jC) {
                        return;
                    }
                } else {
                    zvc zvcVarX2 = x(akkuVar);
                    zvcVarX2.c = this.e.f().toEpochMilli();
                    this.a.put(akkuVar, zvcVarX2);
                }
            } else {
                zvc zvcVarX3 = x(akkuVar);
                zvcVarX3.c = this.e.f().toEpochMilli();
                this.a.put(akkuVar, zvcVarX3);
            }
        }
        int i2 = this.t.d().c;
        Integer numValueOf = Integer.valueOf(i2);
        numValueOf.getClass();
        if (i2 != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            numValueOf.getClass();
            if (this.e.f().toEpochMilli() - this.g < timeUnit.toMillis(i2) * 3) {
                if (I()) {
                    g(akkuVar);
                    return;
                }
            }
        } else if (I()) {
            g(akkuVar);
            return;
        }
        akkuVar.name();
        N();
        D(akkuVar);
    }

    @Override // defpackage.ztf
    public final /* synthetic */ void u(akku akkuVar, aihf aihfVar, boolean z, zsz zszVar) {
        zte.e(this, akkuVar, aihfVar, z);
    }

    @Override // defpackage.ztf
    public final void v(aihf aihfVar) {
        if (this.o) {
            return;
        }
        boolean zL = ((vxz) this.l.io()).l(121, 45621565L, false);
        ztk ztkVar = this.b;
        if (!zL) {
            ztkVar.n(aihfVar);
        } else if (a.x()) {
            ztkVar.b.b(tai.a, afwl.i(new zgc(ztkVar, aihfVar, 10)));
        } else {
            ztkVar.n(aihfVar);
        }
    }

    @Override // defpackage.ztf
    public final void m() {
    }

    @Override // defpackage.ztf
    public final void n() {
    }
}
