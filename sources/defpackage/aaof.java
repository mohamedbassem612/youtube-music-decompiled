package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaof {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/orchestration/OrchestrationQueue");
    public final zwa b;
    public final awmd c;
    public final Executor d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public hzo p;
    private final aanw q;
    private final tfq r;
    private final abte s;
    public final Object h = new Object();
    public final AtomicBoolean n = new AtomicBoolean(false);
    public boolean o = false;
    public final Queue i = new PriorityQueue(1, new asx(8));
    public final Map j = new HashMap();
    final Map k = new HashMap();
    final Set l = new HashSet();
    final Map m = new HashMap();

    public aaof(tfq tfqVar, abte abteVar, aanw aanwVar, awmd awmdVar, Executor executor, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, zwa zwaVar) {
        this.r = tfqVar;
        this.s = abteVar;
        this.q = aanwVar;
        this.b = zwaVar;
        this.c = awmdVar;
        this.d = executor;
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.g = awmdVar4;
    }

    private final synchronized void A(agkx agkxVar) {
        if (this.o) {
            agkxVar.j(this.l);
        }
    }

    private final synchronized void B(agkx agkxVar) {
        if (this.o) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                agkxVar.j((Set) it.next());
            }
        }
    }

    private final synchronized void C(agkx agkxVar) {
        if (this.o) {
            agkxVar.k(this.i.iterator());
        }
    }

    private final void D(agjz agjzVar, Set set, Predicate predicate, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aanq aanqVar = (aanq) it.next();
            String str = aanqVar.a;
            if (set.contains(str) || L(aanqVar, predicate)) {
                it.remove();
                set.remove(str);
                F(agjzVar, aanqVar);
                H(agjzVar, set, aanqVar);
            }
        }
    }

    private final void E(aanq aanqVar, Set set) {
        Set set2;
        aanqVar.f();
        set.add(aanqVar);
        x(aanqVar, 7);
        I(aanqVar, aanqVar, null, aanu.e);
        String str = aanqVar.a;
        synchronized (this) {
            set2 = (Set) this.k.remove(str);
        }
        if (set2 != null) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                E((aanq) it.next(), set);
            }
        }
    }

    private final void F(agjz agjzVar, aanq aanqVar) {
        aanqVar.f();
        agjzVar.h(aanqVar);
        x(aanqVar, 7);
        I(aanqVar, aanqVar, null, aanu.e);
    }

    private final void G(RuntimeException runtimeException) {
        ((agrc) ((agrc) ((agrc) a.b()).j(runtimeException)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationQueue", "handlePersistError", (char) 854, "OrchestrationQueue.java")).t("[Offline] orchestration error writing to store");
        ((aalv) this.f.io()).i(3);
        zvl zvlVar = (zvl) this.e.io();
        zvj zvjVarA = zvk.a();
        zvjVarA.f(runtimeException);
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 30;
        zvjVarA.d("[Offline] orchestration error writing to store");
        zvlVar.a(zvjVarA.a());
        m();
    }

    private final void H(agjz agjzVar, Set set, aanq aanqVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(aanqVar.a);
        while (!arrayDeque.isEmpty()) {
            Set<aanq> set2 = (Set) this.k.remove(arrayDeque.poll());
            if (set2 != null) {
                for (aanq aanqVar2 : set2) {
                    String str = aanqVar2.a;
                    set.remove(str);
                    F(agjzVar, aanqVar2);
                    arrayDeque.add(str);
                }
            }
        }
    }

    private final void I(aanq aanqVar, aanq aanqVar2, aanp aanpVar, aanu aanuVar) {
        Map map = this.m;
        String str = aanqVar.a;
        awli awliVar = (awli) map.get(str);
        if (awliVar != null) {
            aanv aanvVar = new aanv(aanqVar2.c, aanpVar, aanuVar);
            awliVar.kk(aanvVar);
            if (aanvVar.a()) {
                map.remove(str);
                awliVar.kn();
            }
        }
    }

    private final void J(aanq aanqVar, aanp aanpVar) {
        aanq aanqVar2;
        if (!aanqVar.a().g() || (aanqVar2 = (aanq) this.j.get(aanqVar.g)) == null) {
            return;
        }
        I(aanqVar2, aanqVar, aanpVar, aanu.c);
    }

    private final boolean K(aanq aanqVar) {
        aofg aofgVar = aanqVar.c.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        Iterator<E> it = new aihx(aofgVar.e, aofg.a).iterator();
        while (it.hasNext()) {
            int iOrdinal = ((aoff) it.next()).ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    tfq tfqVar = this.r;
                    if (!tfqVar.i() || !tfqVar.j(1)) {
                        return false;
                    }
                } else if (iOrdinal == 4) {
                    tfq tfqVar2 = this.r;
                    if (!tfqVar2.i() || (!tfqVar2.k() && !tfqVar2.j(1))) {
                        return false;
                    }
                } else if (iOrdinal == 6 && this.n.get()) {
                    return false;
                }
            } else if (!this.r.i()) {
                return false;
            }
        }
        return true;
    }

    private static final boolean L(aanq aanqVar, Predicate predicate) {
        return !aanqVar.a().g() && predicate.test(aanqVar.c);
    }

    private final void M(aofm aofmVar, String str, int i) {
        xfh xfhVar = new xfh(i - 1, 4);
        aihf aihfVarCreateBuilder = akzk.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
        aofmVar.getClass();
        akzkVar.f = aofmVar;
        akzkVar.b |= 4;
        xfhVar.a = (akzk) aihfVarCreateBuilder.build();
        this.s.e(xfhVar, alai.FLOW_TYPE_OFFLINE_ORCHESTRATION, str);
    }

    private static aihf N(aanq aanqVar) {
        aihf aihfVarCreateBuilder = aofm.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aofn.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aofn aofnVar = (aofn) aihfVarCreateBuilder2.instance;
        String str = aanqVar.a;
        str.getClass();
        aofnVar.b |= 1;
        aofnVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar = (aofm) aihfVarCreateBuilder.instance;
        aofn aofnVar2 = (aofn) aihfVarCreateBuilder2.build();
        aofnVar2.getClass();
        aofmVar.i = aofnVar2;
        aofmVar.b |= SemanticState.Focused;
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar2 = (aofm) aihfVarCreateBuilder.instance;
        aofmVar2.b |= 1;
        aofmVar2.c = aanqVar.b;
        String strH = wfs.h(aanqVar.d());
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar3 = (aofm) aihfVarCreateBuilder.instance;
        aofmVar3.b |= 2;
        aofmVar3.d = strH;
        aofh aofhVar = aanqVar.c;
        int iBc = a.bc(aofhVar.c);
        int i = iBc != 0 ? iBc : 1;
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar4 = (aofm) aihfVarCreateBuilder.instance;
        aofmVar4.e = i - 1;
        aofmVar4.b |= 4;
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aofa aofaVar = aofgVar.g;
        if (aofaVar == null) {
            aofaVar = aofa.a;
        }
        aofb aofbVarA = aofb.a(aofaVar.d);
        if (aofbVarA == null) {
            aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar5 = (aofm) aihfVarCreateBuilder.instance;
        aofmVar5.m = aofbVarA.i;
        aofmVar5.b |= SemanticState.ReadOnly;
        aofg aofgVar2 = aofhVar.e;
        if (aofgVar2 == null) {
            aofgVar2 = aofg.b;
        }
        int i2 = aofgVar2.d;
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar6 = (aofm) aihfVarCreateBuilder.instance;
        aofmVar6.b |= SemanticState.Modal;
        aofmVar6.o = i2;
        aofg aofgVar3 = aofhVar.e;
        if (aofgVar3 == null) {
            aofgVar3 = aofg.b;
        }
        aihx aihxVar = new aihx(aofgVar3.e, aofg.a);
        aihfVarCreateBuilder.copyOnWrite();
        aofm aofmVar7 = (aofm) aihfVarCreateBuilder.instance;
        aihv aihvVar = aofmVar7.n;
        if (!aihvVar.c()) {
            aofmVar7.n = aihn.mutableCopy(aihvVar);
        }
        Iterator<E> it = aihxVar.iterator();
        while (it.hasNext()) {
            aofmVar7.n.h(((aoff) it.next()).h);
        }
        return aihfVarCreateBuilder;
    }

    private final wer y(Collection collection) {
        agke<String> agkeVarC;
        awmd awmdVar = this.c;
        wco wcoVar = (wco) awmdVar.io();
        zwa zwaVar = this.b;
        wer werVarE = wcoVar.b(zwaVar).e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aanq aanqVar = (aanq) it.next();
            if (aanqVar.i) {
                werVarE.j(wfs.e(169, aanqVar.a));
            } else {
                String strE = wfs.e(169, aanqVar.a);
                strE.getClass();
                ahno.P(!strE.isEmpty(), "key cannot be empty");
                aihf aihfVarCreateBuilder = aofl.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aofl aoflVar = (aofl) aihfVarCreateBuilder.instance;
                aoflVar.b |= 1;
                aoflVar.e = strE;
                aofi aofiVar = new aofi(aihfVarCreateBuilder);
                aofh aofhVar = aanqVar.c;
                aihf aihfVar = aofiVar.a;
                aihfVar.copyOnWrite();
                aofl aoflVar2 = (aofl) aihfVar.instance;
                aofhVar.getClass();
                aoflVar2.f = aofhVar;
                aoflVar2.b |= 2;
                long j = aanqVar.d;
                Long.valueOf(j).getClass();
                aihfVar.copyOnWrite();
                aofl aoflVar3 = (aofl) aihfVar.instance;
                aoflVar3.c = 11;
                aoflVar3.d = Long.valueOf(j);
                String str = aanqVar.g;
                aihfVar.copyOnWrite();
                aofl aoflVar4 = (aofl) aihfVar.instance;
                str.getClass();
                aoflVar4.b |= 4;
                aoflVar4.g = str;
                int i = aanqVar.e.get();
                Integer.valueOf(i).getClass();
                aihfVar.copyOnWrite();
                aofl aoflVar5 = (aofl) aihfVar.instance;
                aoflVar5.b |= 32;
                aoflVar5.l = i;
                boolean z = aanqVar.j;
                Boolean.valueOf(z).getClass();
                aihfVar.copyOnWrite();
                aofl aoflVar6 = (aofl) aihfVar.instance;
                aoflVar6.b |= 64;
                aoflVar6.m = z;
                if (aanqVar.a().g()) {
                    String str2 = (String) aanqVar.a().c();
                    aihfVar.copyOnWrite();
                    aofl aoflVar7 = (aofl) aihfVar.instance;
                    aoflVar7.b |= 8;
                    aoflVar7.h = str2;
                }
                if (aanqVar.b().g()) {
                    String str3 = (String) aanqVar.b().c();
                    aihfVar.copyOnWrite();
                    aofl aoflVar8 = (aofl) aihfVar.instance;
                    aoflVar8.b |= 16;
                    aoflVar8.j = str3;
                }
                if (aanqVar.g() && (agkeVarC = aanqVar.c()) != null && !agkeVarC.isEmpty()) {
                    for (String str4 : agkeVarC) {
                        aihfVar.copyOnWrite();
                        aofl aoflVar9 = (aofl) aihfVar.instance;
                        str4.getClass();
                        aiie aiieVar = aoflVar9.i;
                        if (!aiieVar.c()) {
                            aoflVar9.i = aihn.mutableCopy(aiieVar);
                        }
                        aoflVar9.i.add(str4);
                    }
                }
                ((wco) awmdVar.io()).b(zwaVar);
                werVarE.e(aofiVar.am());
            }
        }
        return werVarE;
    }

    private final Set z(aanq aanqVar, aanq aanqVar2, aanp aanpVar, boolean z) {
        HashSet hashSet = new HashSet();
        if (aanqVar.a().g()) {
            Map map = this.j;
            aanq aanqVar3 = (aanq) map.get(aanqVar.a().c());
            if (aanqVar3 != null) {
                aanqVar3.e(aanqVar.a);
                if (z) {
                    aanqVar3.j = true;
                }
                if (aanqVar3.g()) {
                    J(aanqVar2, aanpVar);
                    if (((aauk) this.g.io()).b.l(209, 45802491L, false)) {
                        hashSet.add(aanqVar3);
                    }
                } else {
                    map.remove(aanqVar3.a);
                    if (aanqVar3.j) {
                        hashSet.addAll(k(aanqVar3, aanqVar2, aanpVar));
                    } else {
                        hashSet.addAll(l(aanqVar3, aanqVar2, aanpVar));
                    }
                }
            }
        }
        return hashSet;
    }

    public final synchronized aanq a() {
        aanq aanqVar;
        Queue queue = this.i;
        aanqVar = (aanq) queue.poll();
        while (aanqVar != null && !K(aanqVar)) {
            this.l.add(aanqVar);
            aanqVar = (aanq) queue.poll();
        }
        return aanqVar;
    }

    final synchronized agke b(Predicate predicate) {
        agjz agjzVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        Map map = this.j;
        for (aanq aanqVar : map.values()) {
            if (L(aanqVar, predicate)) {
                arrayDeque.add(aanqVar);
            }
        }
        agjzVar = new agjz(4);
        HashSet hashSet = new HashSet();
        while (true) {
            aanq aanqVar2 = (aanq) arrayDeque.poll();
            if (aanqVar2 != null) {
                map.remove(aanqVar2.a);
                F(agjzVar, aanqVar2);
                agke agkeVarC = aanqVar2.c();
                int size = agkeVarC.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) agkeVarC.get(i);
                    aanq aanqVar3 = (aanq) map.get(str);
                    if (aanqVar3 != null) {
                        arrayDeque.add(aanqVar3);
                    } else {
                        hashSet.add(str);
                    }
                }
                H(agjzVar, hashSet, aanqVar2);
            } else {
                D(agjzVar, hashSet, predicate, this.l);
                D(agjzVar, hashSet, predicate, this.i);
            }
        }
        return agjzVar.g();
    }

    final synchronized agke c(aanq aanqVar, aans aansVar) {
        agke agkeVarG;
        agjz agjzVar = new agjz(4);
        agjzVar.h(aanqVar);
        if (aansVar.a() <= 1) {
            agkeVarG = agjzVar.g();
        } else {
            int iA = aansVar.a();
            while (true) {
                iA--;
                if (iA <= 0) {
                    break;
                }
                Queue queue = this.i;
                aanq aanqVar2 = (aanq) queue.peek();
                if (aanqVar2 == null || !K(aanqVar2) || aanqVar.b != aanqVar2.b) {
                    break;
                }
                int iBc = a.bc(aanqVar.c.c);
                if (iBc == 0) {
                    iBc = 1;
                }
                aofh aofhVar = aanqVar2.c;
                int iBc2 = a.bc(aofhVar.c);
                if (iBc2 == 0) {
                    iBc2 = 1;
                }
                if (iBc != iBc2 || !aansVar.b().a(aofhVar)) {
                    break;
                }
                queue.poll();
                agjzVar.h(aanqVar2);
            }
            agkeVarG = agjzVar.g();
        }
        return agkeVarG;
    }

    public final synchronized agkj d() {
        agkh agkhVar;
        agkhVar = new agkh(4);
        Queue<aanq> queue = this.i;
        for (aanq aanqVar : queue) {
            agkhVar.e(aanqVar.a, aanqVar);
        }
        queue.clear();
        Map map = this.j;
        agkhVar.i(map);
        map.clear();
        Set<aanq> set = this.l;
        for (aanq aanqVar2 : set) {
            agkhVar.e(aanqVar2.a, aanqVar2);
        }
        set.clear();
        return agkhVar.d(true);
    }

    public final avlb e() {
        wcn wcnVarB = ((wco) this.c.io()).b(this.b);
        return wcnVarB.q(169).c(new yrb(wcnVarB, 8)).s();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized Set f(List list, aanq aanqVar) {
        if (!this.o) {
            return agpr.a;
        }
        HashSet hashSet = new HashSet();
        if (!list.isEmpty()) {
            hashSet.addAll(list);
            if (aanqVar != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aanq aanqVar2 = (aanq) it.next();
                    if (aanqVar2.a().g() && ((String) aanqVar2.a().c()).equals(aanqVar.a)) {
                        aanqVar.f.add(aanqVar2.a);
                        hashSet.add(aanqVar);
                    }
                }
                this.j.put(aanqVar.a, aanqVar);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                aanq aanqVar3 = (aanq) it2.next();
                if (aanqVar3.b().g()) {
                    String str = (String) aanqVar3.b().c();
                    Map map = this.k;
                    if (!map.containsKey(str)) {
                        map.put(str, new HashSet());
                    }
                    ((Set) map.get(str)).add(aanqVar3);
                } else {
                    arrayList.add(aanqVar3);
                }
                x(aanqVar3, 2);
            }
            this.i.addAll(arrayList);
        }
        return hashSet;
    }

    public final synchronized Set g() {
        agkx agkxVar;
        agkxVar = new agkx();
        A(agkxVar);
        return agkxVar.g();
    }

    public final synchronized Set h() {
        agkx agkxVar;
        agkxVar = new agkx();
        B(agkxVar);
        return agkxVar.g();
    }

    public final synchronized Set i() {
        agkx agkxVar;
        agkxVar = new agkx();
        C(agkxVar);
        return agkxVar.g();
    }

    final synchronized Set j() {
        agkz agkzVarG;
        if (this.o) {
            agkx agkxVar = new agkx();
            C(agkxVar);
            A(agkxVar);
            B(agkxVar);
            agkzVarG = agkxVar.g();
        } else {
            agkzVarG = agpr.a;
        }
        return agkzVarG;
    }

    final synchronized Set k(aanq aanqVar, aanq aanqVar2, aanp aanpVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        I(aanqVar, aanqVar2, aanpVar, aanu.f);
        aanqVar.f();
        hashSet.add(aanqVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = aanqVar.c.g.iterator();
        while (it.hasNext()) {
            try {
                arrayList.addAll(this.q.a((aofh) it.next(), null));
            } catch (aaob e) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationQueue", "enqueueFailedChainActions", 955, "OrchestrationQueue.java")).y("[Offline] Add failedChainAction failed on original action type: %d ErrorMessage: %s", aanqVar.b, e.getMessage());
            }
        }
        hashSet.addAll(new HashSet(f(arrayList, null)));
        String str = aanqVar.a;
        HashSet hashSet2 = new HashSet();
        Set<aanq> set = (Set) this.k.remove(str);
        if (set != null) {
            for (aanq aanqVar3 : set) {
                x(aanqVar3, 5);
                hashSet2.addAll(k(aanqVar3, aanqVar3, null));
            }
        }
        hashSet.addAll(hashSet2);
        hashSet.addAll(z(aanqVar, aanqVar2, aanpVar, true));
        return hashSet;
    }

    final synchronized Set l(aanq aanqVar, aanq aanqVar2, aanp aanpVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.add(aanqVar);
        if (aanqVar.g()) {
            I(aanqVar, aanqVar2, aanpVar, aanu.b);
            J(aanqVar2, aanpVar);
        } else {
            aanqVar.f();
            I(aanqVar, aanqVar2, aanpVar, aanu.d);
            Set set = (Set) this.k.remove(aanqVar.a);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((aanq) it.next()).h = null;
                }
                t(set);
                hashSet.addAll(set);
            }
            hashSet.addAll(z(aanqVar, aanqVar2, aanpVar, false));
        }
        return hashSet;
    }

    final synchronized void m() {
        this.o = false;
        this.p = null;
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
    }

    final void n() {
        this.d.execute(new ahfo(Executors.callable(afwl.i(new Runnable() { // from class: aaoc
            @Override // java.lang.Runnable
            public final void run() {
                final aaof aaofVar = this.a;
                try {
                    try {
                        agkz agkzVar = (agkz) ((wco) aaofVar.c.io()).b(aaofVar.b).b(169).E();
                        awmd awmdVar = aaofVar.g;
                        final boolean zL = ((aauk) awmdVar.io()).b.l(212, 45803275L, false);
                        final HashSet hashSet = new HashSet();
                        final HashSet hashSet2 = new HashSet();
                        j$.util.Collection.EL.stream(agkzVar).map(new ygi(7)).forEach(new Consumer() { // from class: aaoe
                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void r(Object obj) {
                                aanq aanqVar = new aanq((aofk) obj);
                                if (zL) {
                                    hashSet.add(aanqVar.a);
                                }
                                aaof aaofVar2 = aaofVar;
                                if (aanqVar.g()) {
                                    aaofVar2.j.put(aanqVar.a, aanqVar);
                                    return;
                                }
                                if (!aanqVar.b().g()) {
                                    hashSet2.add(aanqVar);
                                    return;
                                }
                                String str = (String) aanqVar.b().c();
                                Map map = aaofVar2.k;
                                if (!map.containsKey(str)) {
                                    map.put(str, new HashSet());
                                }
                                ((Set) map.get(str)).add(aanqVar);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        aaofVar.t(hashSet2);
                        if (zL) {
                            if (((aauk) awmdVar.io()).b.l(240, 45846624L, false)) {
                                ArrayList arrayList = new ArrayList(100);
                                Iterator it = aaofVar.j.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        if (!arrayList.isEmpty()) {
                                            aaofVar.w(arrayList);
                                            break;
                                        }
                                        break;
                                    }
                                    aanq aanqVar = (aanq) it.next();
                                    agke agkeVarC = aanqVar.c();
                                    int size = agkeVarC.size();
                                    boolean z = false;
                                    for (int i = 0; i < size; i++) {
                                        String str = (String) agkeVarC.get(i);
                                        if (!hashSet.contains(str)) {
                                            aanqVar.e(str);
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        if (!aanqVar.g()) {
                                            aanqVar.f();
                                            it.remove();
                                        }
                                        arrayList.add(aanqVar);
                                        if (arrayList.size() < 100) {
                                            continue;
                                        } else if (!aaofVar.w(arrayList)) {
                                            break;
                                        } else {
                                            arrayList.clear();
                                        }
                                    }
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = aaofVar.j.entrySet().iterator();
                                while (it2.hasNext()) {
                                    aanq aanqVar2 = (aanq) ((Map.Entry) it2.next()).getValue();
                                    agke agkeVarC2 = aanqVar2.c();
                                    int size2 = agkeVarC2.size();
                                    boolean z2 = false;
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        String str2 = (String) agkeVarC2.get(i2);
                                        if (!hashSet.contains(str2)) {
                                            aanqVar2.e(str2);
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        if (aanqVar2.g()) {
                                            arrayList2.add(aanqVar2);
                                        } else {
                                            aanqVar2.f();
                                            arrayList2.add(aanqVar2);
                                            it2.remove();
                                        }
                                    }
                                }
                                boolean z3 = aaofVar.o;
                                aaofVar.o = true;
                                try {
                                    aaofVar.r(arrayList2);
                                    aaofVar.o = z3;
                                } catch (Throwable th) {
                                    aaofVar.o = z3;
                                    throw th;
                                }
                            }
                        }
                        hashSet2.size();
                    } catch (Throwable th2) {
                        aaofVar.o = true;
                        throw th2;
                    }
                } catch (RuntimeException e) {
                    ((aalv) aaofVar.f.io()).i(2);
                    zvj zvjVarA = zvk.a();
                    zvjVarA.j = 30;
                    zvjVarA.d("Failed to initialize OrchestrationQueue.");
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.f(e);
                    ((zvl) aaofVar.e.io()).a(zvjVarA.a());
                    ((agrc) ((agrc) ((agrc) aaof.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationQueue", "doInit", 219, "OrchestrationQueue.java")).t("OrchestrationQueue initialized with an error, clearing persisted actions.");
                    aaofVar.e().G();
                }
                aaofVar.o = true;
            }
        }), null)));
    }

    final void o(aanq aanqVar, aanp aanpVar, List list, long j, long j2, boolean z) {
        aihf aihfVarN = N(aanqVar);
        boolean z2 = false;
        if (aanpVar.d && !z) {
            z2 = true;
        }
        aihfVarN.copyOnWrite();
        aofm aofmVar = (aofm) aihfVarN.instance;
        aofm aofmVar2 = aofm.a;
        aofmVar.b |= 32;
        aofmVar.h = z2;
        int i = aanpVar.f;
        aihfVarN.copyOnWrite();
        aofm aofmVar3 = (aofm) aihfVarN.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        aofmVar3.f = i2;
        aofmVar3.b |= 8;
        int i3 = aanpVar.g;
        aihfVarN.copyOnWrite();
        aofm aofmVar4 = (aofm) aihfVarN.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        aofmVar4.g = i4;
        aofmVar4.b |= 16;
        aihfVarN.copyOnWrite();
        aofm aofmVar5 = (aofm) aihfVarN.instance;
        aofmVar5.b |= SemanticState.LiveRegion;
        aofmVar5.l = j;
        long j3 = aanqVar.d;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        aihfVarN.copyOnWrite();
        aofm aofmVar6 = (aofm) aihfVarN.instance;
        aofmVar6.b |= SemanticState.Hidden;
        aofmVar6.k = j2 - (j3 / 1000000);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aanq aanqVar2 = (aanq) it.next();
            aihf aihfVarCreateBuilder = aofn.a.createBuilder();
            String str = aanqVar2.a;
            aihfVarCreateBuilder.copyOnWrite();
            aofn aofnVar = (aofn) aihfVarCreateBuilder.instance;
            str.getClass();
            aofnVar.b |= 1;
            aofnVar.c = str;
            aihfVarN.copyOnWrite();
            aofm aofmVar7 = (aofm) aihfVarN.instance;
            aofn aofnVar2 = (aofn) aihfVarCreateBuilder.build();
            aofnVar2.getClass();
            aiie aiieVar = aofmVar7.j;
            if (!aiieVar.c()) {
                aofmVar7.j = aihn.mutableCopy(aiieVar);
            }
            aofmVar7.j.add(aofnVar2);
        }
        M((aofm) aihfVarN.build(), aanqVar.g, 4);
    }

    public final synchronized void p() {
        Set set = this.l;
        for (aanq aanqVar : new HashSet(set)) {
            if (K(aanqVar)) {
                set.remove(aanqVar);
                s(aanqVar);
            }
        }
    }

    public final void q() {
        hzo hzoVar = this.p;
        if (hzoVar != null) {
            aaog aaogVar = (aaog) ((aany) hzoVar.a).a.io();
            ListenableFuture listenableFuture = aaogVar.b;
            if (listenableFuture == null || listenableFuture.isDone()) {
                aaogVar.b = aaogVar.a.submit(aaogVar);
                ListenableFuture listenableFuture2 = aaogVar.b;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(taf.c, null, new hmb(18));
                long j = afwl.a;
                listenableFuture2.addListener(new ahei(listenableFuture2, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            }
        }
    }

    public final void r(Collection collection) {
        if (collection.isEmpty() || !this.o) {
            return;
        }
        try {
            y(collection).b().G();
        } catch (RuntimeException e) {
            G(e);
        }
    }

    public final synchronized void s(aanq aanqVar) {
        this.i.add(aanqVar);
        q();
    }

    public final void t(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            s((aanq) it.next());
        }
        q();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aaoa, java.lang.Object] */
    public final boolean u(aanq aanqVar, Optional optional, agkj agkjVar, Set set, Set set2) {
        agkj agkjVar2 = agkjVar;
        int iOrdinal = ((aanz) (true != optional.isPresent() ? optional : Optional.ofNullable(optional.get().a((aanq) new vre(aanqVar, 13).a))).orElse(aanz.b)).ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            Set set3 = set;
            E(aanqVar, set3);
            agke agkeVarC = aanqVar.c();
            int size = agkeVarC.size();
            while (i < size) {
                aanq aanqVar2 = (aanq) agkjVar2.get((String) agkeVarC.get(i));
                if (aanqVar2 != null) {
                    u(aanqVar2, Optional.empty(), agkjVar2, set3, set2);
                }
                i++;
                agkjVar2 = agkjVar;
                set3 = set;
            }
            return true;
        }
        if (iOrdinal == 2) {
            agke agkeVarC2 = aanqVar.c();
            int size2 = agkeVarC2.size();
            boolean z = true;
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) agkeVarC2.get(i2);
                aanq aanqVar3 = (aanq) agkjVar2.get(str);
                if (aanqVar3 != null) {
                    if (u(aanqVar3, optional, agkjVar2, set, set2)) {
                        aanqVar.e(str);
                    } else {
                        z = false;
                    }
                }
            }
            if (z) {
                E(aanqVar, set);
                return true;
            }
            set2.add(aanqVar);
        }
        return false;
    }

    public final boolean v() {
        return !this.l.isEmpty();
    }

    public final boolean w(Collection collection) {
        try {
            y(collection).d().G();
            collection.size();
            return true;
        } catch (RuntimeException e) {
            G(e);
            return false;
        }
    }

    final void x(aanq aanqVar, int i) {
        M((aofm) N(aanqVar).build(), aanqVar.g, i);
    }
}
