package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aany {
    private static final agrf k = agrf.h("com/google/android/libraries/youtube/offline/orchestration/OrchestrationController");
    public final aunn a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final awmd e;
    public final tbt f;
    public final ScheduledExecutorService g;
    public final AtomicReference h = new AtomicReference();
    public final Map i = new HashMap();
    public boolean j;
    private final awmd l;
    private final zwb m;
    private final awmd n;
    private final aunn o;

    public aany(awmd awmdVar, aunn aunnVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, tbt tbtVar, zwb zwbVar, awmd awmdVar6, ScheduledExecutorService scheduledExecutorService, aunn aunnVar2) {
        this.l = awmdVar;
        this.a = aunnVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.f = tbtVar;
        this.m = zwbVar;
        this.n = awmdVar6;
        this.g = scheduledExecutorService;
        this.o = aunnVar2;
    }

    public final avlr a(aofh aofhVar) {
        return (avlr) b(agke.q(aofhVar)).get(0);
    }

    public final List b(List list) throws aaob {
        Stream map = Collection.EL.stream(list).map(new ygi(4));
        Collector collector = aghu.b;
        map.collect(collector);
        AtomicReference atomicReference = this.h;
        if (atomicReference.get() == null) {
            e();
        }
        aaof aaofVar = (aaof) atomicReference.get();
        if (aaofVar == null) {
            throw new aaob("No active identity");
        }
        ArrayList<aanq> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((aanw) this.l.io()).a((aofh) it.next(), null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (aanq aanqVar : arrayList) {
            awli awliVar = new awli(new aanv(aanqVar.c, aanu.a));
            aaofVar.m.put(aanqVar.a, awliVar);
            arrayList2.add(awliVar);
        }
        Collection.EL.stream(arrayList).map(new ygi(5)).collect(collector);
        aaofVar.d.execute(new ahfo(Executors.callable(afwl.i(new wdd(aaofVar, arrayList, 16)), null)));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((avlr) it2.next()).af(new zgd(this, 12));
        }
        return arrayList2;
    }

    public final void c() {
        AtomicReference atomicReference = this.h;
        aaof aaofVar = (aaof) atomicReference.get();
        if (aaofVar != null) {
            aaofVar.m();
            atomicReference.set(null);
        }
    }

    @Deprecated
    public final void d(final Predicate predicate) {
        if (((aauk) this.o.io()).b.l(197, 45762254L, false)) {
            f(new aaoa() { // from class: aanx
                @Override // defpackage.aaoa
                public final aanz a(aanq aanqVar) {
                    return predicate.test(aanqVar.c) ? aanz.b : aanz.a;
                }
            });
            return;
        }
        AtomicReference atomicReference = this.h;
        if (atomicReference.get() == null) {
            e();
        }
        final aaof aaofVar = (aaof) atomicReference.get();
        if (aaofVar != null) {
            ahno.ao(new Runnable() { // from class: aaod
                @Override // java.lang.Runnable
                public final void run() {
                    agke agkeVarB;
                    aaof aaofVar2 = aaofVar;
                    Predicate predicate2 = predicate;
                    synchronized (aaofVar2.h) {
                        agkeVarB = aaofVar2.b(predicate2);
                    }
                    if (agkeVarB.isEmpty()) {
                        return;
                    }
                    aaofVar2.r(agkeVarB);
                    aaofVar2.q();
                }
            }, aaofVar.d);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final void e() {
        zwb zwbVar = this.m;
        if (zwbVar.u()) {
            zwa zwaVarE = zwbVar.e();
            AtomicReference atomicReference = this.h;
            aaof aaofVar = (aaof) atomicReference.get();
            if (aaofVar == null || !aaofVar.b.i().equals(zwaVarE.i())) {
                try {
                    afip afipVar = (afip) this.n.io();
                    tfq tfqVar = (tfq) afipVar.b.io();
                    tfqVar.getClass();
                    abte abteVar = (abte) afipVar.d.io();
                    abteVar.getClass();
                    aanw aanwVar = (aanw) afipVar.g.io();
                    aanwVar.getClass();
                    ?? r4 = afipVar.f;
                    Executor executor = (Executor) afipVar.h.io();
                    executor.getClass();
                    ?? r6 = afipVar.e;
                    ?? r7 = afipVar.c;
                    ?? r8 = afipVar.a;
                    zwaVarE.getClass();
                    aaof aaofVar2 = new aaof(tfqVar, abteVar, aanwVar, r4, executor, r6, r7, r8, zwaVarE);
                    aaofVar2.p = new hzo(this);
                    aaofVar2.n();
                    atomicReference.set(aaofVar2);
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) k.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationController", "restoreQueue", (char) 185, "OrchestrationController.java")).t("Couldn't initialize orchestration queue");
                    zvp.b(zvn.b, zvm.C, "Couldn't initialize orchestration queue", e);
                }
            }
        }
    }

    public final void f(aaoa aaoaVar) {
        AtomicReference atomicReference = this.h;
        if (atomicReference.get() == null) {
            e();
        }
        aaof aaofVar = (aaof) atomicReference.get();
        if (aaofVar == null) {
            if (agpi.a == null) {
                ListenableFuture listenableFuture = aher.a;
                return;
            } else {
                ListenableFuture listenableFuture2 = aher.a;
                return;
            }
        }
        fzs fzsVar = new fzs(aaofVar, aaoaVar, 14, null);
        long j = afwl.a;
        aaofVar.d.execute(new ahfo(new ahcz(afty.c(false), fzsVar, 1)));
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        e();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        ((aaog) this.a.io()).a();
        c();
    }
}
