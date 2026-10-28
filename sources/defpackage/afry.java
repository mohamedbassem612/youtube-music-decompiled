package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afry implements afrm {
    private static final agrf l = agrf.h("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final mbc a;
    public final ahey b;
    public final ahex c;
    public final afjn d;
    public final afrr e;
    public final Map f;
    public final ListenableFuture g;
    public final Object h = new Object();
    public final afv i;
    public final Map j;
    public final Map k;
    private final Context m;
    private final agev n;
    private final afsc o;
    private final AtomicReference p;
    private final afsq q;
    private final omr r;

    public afry(mbc mbcVar, Context context, ahey aheyVar, ahex ahexVar, omr omrVar, afjn afjnVar, agev agevVar, afrr afrrVar, Map map, Map map2, Map map3, afsq afsqVar, afsc afscVar) {
        afv afvVar = new afv();
        this.i = afvVar;
        this.j = new afv();
        this.k = new afv();
        this.p = new AtomicReference();
        this.a = mbcVar;
        this.m = context;
        this.b = aheyVar;
        this.c = ahexVar;
        this.r = omrVar;
        this.d = afjnVar;
        this.n = agevVar;
        Boolean bool = Boolean.FALSE;
        bool.booleanValue();
        this.e = afrrVar;
        this.f = map3;
        this.q = afsqVar;
        bool.booleanValue();
        ahno.P(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.g = afrrVar.c();
        HashMap map4 = new HashMap();
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            afre afreVarA = afre.a((String) entry.getKey());
            aihf aihfVarCreateBuilder = afsw.a.createBuilder();
            afsv afsvVar = afreVarA.a;
            aihfVarCreateBuilder.copyOnWrite();
            afsw afswVar = (afsw) aihfVarCreateBuilder.instance;
            afsvVar.getClass();
            afswVar.c = afsvVar;
            afswVar.b |= 1;
            p(new afsa((afsw) aihfVarCreateBuilder.build()), entry, map4);
        }
        afvVar.putAll(map4);
        this.o = afscVar;
        String strL = qnl.l(context);
        int iIndexOf = strL.indexOf(58);
        if (iIndexOf != -1) {
            strL.substring(iIndexOf + 1);
        }
    }

    public static /* synthetic */ void j(ListenableFuture listenableFuture) {
        try {
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            a.i(listenableFuture);
        } catch (CancellationException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 698, "SyncManagerImpl.java")).t("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e2)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 696, "SyncManagerImpl.java")).t("Error scheduling next sync wakeup");
        }
    }

    public static /* synthetic */ void k(ListenableFuture listenableFuture) {
        try {
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            a.i(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            boolean z = e.getCause() instanceof TimeoutException;
            agrf agrfVar = l;
            if (z) {
                ((agrc) ((agrc) ((agrc) agrfVar.c()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 799, "SyncManagerImpl.java")).t("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((agrc) ((agrc) ((agrc) agrfVar.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 803, "SyncManagerImpl.java")).t("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final ListenableFuture n() {
        ListenableFuture listenableFutureZ = ((abhh) ((agfa) this.n).a).z();
        abzy abzyVar = new abzy(18);
        long j = afwl.a;
        ahcr ahcrVar = new ahcr(listenableFutureZ, new afwi(afty.c(false), abzyVar));
        listenableFutureZ.addListener(ahcrVar, MoreExecutors.c(this.b, ahcrVar));
        return ahcrVar;
    }

    private final ListenableFuture o() {
        AtomicReference atomicReference = this.p;
        SettableFuture settableFutureCreate = SettableFuture.create();
        if (a.ap(atomicReference, settableFutureCreate)) {
            ListenableFuture listenableFutureN = n();
            afro afroVar = new afro(this, 2);
            ahey aheyVar = this.b;
            long j = afwl.a;
            ahcr ahcrVar = new ahcr(listenableFutureN, new afwi(afty.c(false), afroVar));
            listenableFutureN.addListener(ahcrVar, MoreExecutors.c(aheyVar, ahcrVar));
            settableFutureCreate.setFuture(ahcrVar);
        }
        return ahng.o((ListenableFuture) atomicReference.get());
    }

    private static final void p(afsa afsaVar, Map.Entry entry, Map map) {
        try {
            afrg afrgVar = (afrg) ((awmd) entry.getValue()).io();
            if (afrgVar.b) {
                map.put(afsaVar, afrgVar);
            }
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", (char) 915, "SyncManagerImpl.java")).w("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new ahve(ahvd.a, entry.getKey()));
        }
    }

    @Override // defpackage.afrm
    public final ListenableFuture a() {
        agpr agprVar = agpr.a;
        return this.q.a(f(agprVar == null ? aher.a : new aher(agprVar)), new hqn(16));
    }

    @Override // defpackage.afrm
    public final ListenableFuture b() {
        final long epochMilli = this.a.f().toEpochMilli();
        final afrr afrrVar = this.e;
        int i = 8;
        ListenableFuture listenableFutureA = this.q.a(ahno.az(afrrVar.c.submit(afwl.j(new Callable() { // from class: afrq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                afsu afsuVar = afsu.a;
                afrr afrrVar2 = afrrVar;
                afrrVar2.b.writeLock().lock();
                long j = epochMilli;
                try {
                    try {
                        afsu afsuVarA = afrrVar2.a();
                        aihf builder = afsuVarA.toBuilder();
                        builder.copyOnWrite();
                        afsu afsuVar2 = (afsu) builder.instance;
                        afsuVar2.b |= 2;
                        afsuVar2.e = j;
                        try {
                            afrrVar2.f((afsu) builder.build());
                        } catch (IOException e) {
                            ((agrc) ((agrc) ((agrc) afrr.a.c()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", 500, "SyncManagerDataStore.java")).t("Error writing sync data file. Cannot update last wakeup.");
                        }
                        afrrVar2.b.writeLock().unlock();
                        int i2 = afsuVarA.b;
                        if ((i2 & 2) != 0) {
                            return Long.valueOf(afsuVarA.e);
                        }
                        if ((i2 & 1) != 0) {
                            return Long.valueOf(afsuVarA.c);
                        }
                        return -1L;
                    } catch (IOException e2) {
                        agfv.d(e2);
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th) {
                    afrrVar2.b.writeLock().unlock();
                    throw th;
                }
            }
        })), new afgi(this, i), this.b), new oly(16));
        listenableFutureA.addListener(new aeia(i), MoreExecutors.directExecutor());
        return listenableFutureA;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0139 */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture c(com.google.common.util.concurrent.ListenableFuture r14, java.util.Map r15) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afry.c(com.google.common.util.concurrent.ListenableFuture, java.util.Map):com.google.common.util.concurrent.ListenableFuture");
    }

    public final /* synthetic */ ListenableFuture d(ListenableFuture listenableFuture, afsa afsaVar) {
        boolean z = false;
        try {
            ahng.v(listenableFuture);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((agrc) ((agrc) ((agrc) l.c()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", (char) 484, "SyncManagerImpl.java")).w("Sync cancelled from timeout and will be retried later: %s", afsaVar.b.b());
            }
        }
        final long epochMilli = this.a.f().toEpochMilli();
        return ahno.ay(this.e.d(afsaVar, epochMilli, z), new Callable() { // from class: afru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(epochMilli);
            }
        }, this.b);
    }

    public final ListenableFuture e() {
        ListenableFuture listenableFutureH = h(n());
        afrr afrrVar = this.e;
        ahex ahexVar = afrrVar.c;
        rru rruVar = new rru(afrrVar, 15);
        long j = afwl.a;
        ListenableFuture listenableFutureSubmit = ahexVar.submit(new ahcz(afty.c(false), rruVar, 1));
        ahud ahudVar = new ahud(new ahek(true, agke.p(new ListenableFuture[]{listenableFutureH, listenableFutureSubmit})), (byte[]) null);
        afng afngVar = new afng(this, listenableFutureH, listenableFutureSubmit, 3);
        ahey aheyVar = this.b;
        ListenableFuture listenableFutureL = ahudVar.l(afngVar, aheyVar);
        this.p.set(listenableFutureL);
        ListenableFuture listenableFutureU = ahng.u(listenableFutureL, 10L, TimeUnit.SECONDS, aheyVar);
        ahev ahevVar = new ahev(afwl.i(new acem(listenableFutureU, 11)));
        listenableFutureU.addListener(ahevVar, MoreExecutors.directExecutor());
        return ahevVar;
    }

    public final ListenableFuture f(ListenableFuture listenableFuture) {
        afsk afskVar = new afsk(this, listenableFuture, 1);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), afskVar, 1);
        int i = ahcs.c;
        ahey aheyVar = this.b;
        ListenableFuture listenableFuture2 = this.g;
        ahcq ahcqVar = new ahcq(listenableFuture2, ahdbVar);
        listenableFuture2.addListener(ahcqVar, MoreExecutors.c(aheyVar, ahcqVar));
        ListenableFuture listenableFutureO = ahng.o(ahcqVar);
        this.d.b(listenableFutureO, "SyncManager: Scheduling in parallel");
        listenableFutureO.addListener(new acem(listenableFutureO, 12), aheyVar);
        afwi afwiVar = new afwi(afty.c(false), new abzy(19));
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahcr ahcrVar = new ahcr(listenableFuture, afwiVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public final ListenableFuture g(ListenableFuture listenableFuture, final long j) {
        final Set set;
        final HashMap map;
        ListenableFuture listenableFuture2;
        agpr agprVar = agpr.a;
        try {
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            set = (Set) a.i(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) l.c()).j(e)).k("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 681, "SyncManagerImpl.java")).t("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
            set = agprVar;
        }
        synchronized (this.h) {
            map = new HashMap(this.i);
        }
        Collection.EL.removeIf(map.entrySet(), new hkn(this, 18));
        final afsl afslVar = (afsl) this.o;
        if (afslVar.d.booleanValue()) {
            final afse afseVar = afslVar.b;
            ListenableFuture listenableFutureB = afseVar.b.b();
            agek agekVar = new agek() { // from class: afsd
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    int i;
                    long jLongValue;
                    long j2;
                    afsd afsdVar = this;
                    Map map2 = (Map) obj;
                    ArrayList<afsb> arrayList = new ArrayList();
                    afse afseVar2 = afseVar;
                    long epochMilli = afseVar2.a.f().toEpochMilli();
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Set set2 = set;
                        Map.Entry entry = (Map.Entry) it.next();
                        afsa afsaVar = (afsa) entry.getKey();
                        afrb afrbVarA = ((afrg) entry.getValue()).a();
                        Long l2 = (Long) map2.get(afsaVar);
                        if (set2.contains(afsaVar)) {
                            jLongValue = epochMilli;
                        } else {
                            jLongValue = j;
                            if (l2 != null) {
                                jLongValue = l2.longValue();
                            }
                        }
                        agkx agkxVar = new agkx();
                        long j3 = afrbVarA.a;
                        double d = afseVar2.d;
                        Map map3 = afrbVarA.c;
                        agdf agdfVar = agdf.a;
                        agqs agqsVarListIterator = ((agke) ((agpn) map3).values()).listIterator(0);
                        Map map4 = map2;
                        agev agfaVar = agdfVar;
                        while (true) {
                            j2 = (long) (j3 * d);
                            if (agqsVarListIterator.hasNext()) {
                                afrc afrcVar = (afrc) agqsVarListIterator.next();
                                long j4 = j3;
                                long j5 = afrcVar.b;
                                if (j5 != -1) {
                                    long j6 = j5 + jLongValue + j2;
                                    if (epochMilli <= j6) {
                                        agfaVar = !agfaVar.g() ? new agfa(Long.valueOf(j6)) : new agfa(Long.valueOf(Math.min(((Long) agfaVar.c()).longValue(), j6)));
                                        agkxVar.c(afrcVar.a);
                                    } else {
                                        agqsVarListIterator = agqsVarListIterator;
                                    }
                                } else {
                                    agqsVarListIterator = agqsVarListIterator;
                                    agkxVar.c(afrcVar.a);
                                }
                                agqsVarListIterator = agqsVarListIterator;
                                j3 = j4;
                            }
                        }
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(agkxVar.g());
                        arrayList.add(new afsb(hashSet, j2 + jLongValue, agfaVar));
                        afsdVar = this;
                        map2 = map4;
                    }
                    int i2 = 0;
                    while (true) {
                        long j7 = 900000;
                        if (i2 >= arrayList.size()) {
                            long jAbs = Math.abs(((SecureRandom) afseVar2.e.a.io()).nextLong());
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            if (qow.a.a(afsg.a)) {
                                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                                j7 = 5000;
                            } else {
                                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                            }
                            long j8 = jAbs % j7;
                            for (i = 0; i < arrayList.size(); i++) {
                                afsb afsbVar = (afsb) arrayList.get(i);
                                HashSet hashSet2 = new HashSet();
                                agev agfaVar2 = agdf.a;
                                hashSet2.addAll(afsbVar.a);
                                long j9 = afsbVar.b + j8;
                                agev agevVar = afsbVar.c;
                                if (agevVar.g()) {
                                    agfaVar2 = new agfa(Long.valueOf(((Long) agevVar.c()).longValue() + j8));
                                }
                                arrayList.set(i, new afsb(hashSet2, j9, agfaVar2));
                            }
                            afv afvVar = new afv();
                            for (afsb afsbVar2 : arrayList) {
                                Set set3 = afsbVar2.a;
                                afsb afsbVar3 = (afsb) afvVar.get(set3);
                                if (afsbVar3 == null) {
                                    afvVar.put(set3, afsbVar2);
                                } else {
                                    afvVar.put(set3, afsb.a(afsbVar3, afsbVar2));
                                }
                            }
                            agev agevVar2 = agdf.a;
                            Iterator it2 = afvVar.values().iterator();
                            while (it2.hasNext()) {
                                agev agfaVar3 = ((afsb) it2.next()).c;
                                if (agfaVar3.g()) {
                                    if (agevVar2.g()) {
                                        agfaVar3 = new agfa(Long.valueOf(Math.min(((Long) agevVar2.c()).longValue(), ((Long) agfaVar3.c()).longValue())));
                                    }
                                    agevVar2 = agfaVar3;
                                }
                            }
                            if (!agevVar2.g()) {
                                return afvVar;
                            }
                            HashMap map5 = new HashMap(afvVar);
                            agpr agprVar2 = agpr.a;
                            HashSet hashSet3 = new HashSet();
                            long jLongValue2 = ((Long) agevVar2.c()).longValue();
                            hashSet3.addAll(agprVar2);
                            afsb afsbVar4 = new afsb(hashSet3, jLongValue2, agevVar2);
                            afsb afsbVar5 = (afsb) map5.get(agprVar2);
                            if (afsbVar5 == null) {
                                map5.put(agprVar2, afsbVar4);
                            } else {
                                map5.put(agprVar2, afsb.a(afsbVar5, afsbVar4));
                            }
                            return DesugarCollections.unmodifiableMap(map5);
                        }
                        afsb afsbVar6 = (afsb) arrayList.get(i2);
                        TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
                        TimeUnit timeUnit5 = TimeUnit.MINUTES;
                        long j10 = afsbVar6.b;
                        long j11 = 900000 + epochMilli;
                        if (j10 < j11) {
                            long jMax = Math.max(epochMilli, j10);
                            HashSet hashSet4 = new HashSet();
                            agev agfaVar4 = agdf.a;
                            hashSet4.addAll(afsbVar6.a);
                            agev agevVar3 = afsbVar6.c;
                            if (agevVar3.g()) {
                                long j12 = j11 - jMax;
                                if (j12 <= 0) {
                                    throw new IllegalStateException();
                                }
                                if (j12 > 900000) {
                                    throw new IllegalStateException();
                                }
                                agfaVar4 = new agfa(Long.valueOf(((Long) agevVar3.c()).longValue() + j12));
                            }
                            arrayList.set(i2, new afsb(hashSet4, j11, agfaVar4));
                        }
                        i2++;
                    }
                }
            };
            long j2 = afwl.a;
            ahcr ahcrVar = new ahcr(listenableFutureB, new afwi(afty.c(false), agekVar));
            listenableFutureB.addListener(ahcrVar, MoreExecutors.c(afseVar.c, ahcrVar));
            ahdb ahdbVar = new ahdb(afty.c(false), new ahcy() { // from class: afsj
                /* JADX WARN: Type inference failed for: r0v27, types: [aflp, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v31, types: [aflp, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v39, types: [aflp, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v43, types: [aflp, java.lang.Object] */
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    String str;
                    ahcr ahcrVar2;
                    Map map2 = (Map) obj;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map2.entrySet().iterator();
                    while (true) {
                        afsl afslVar2 = afslVar;
                        if (!it.hasNext()) {
                            Set setKeySet = map2.keySet();
                            HashSet hashSet = new HashSet();
                            Iterator it2 = setKeySet.iterator();
                            while (it2.hasNext()) {
                                hashSet.add(afsl.a((Set) it2.next()));
                            }
                            ListenableFuture listenableFutureD = afslVar2.f.d(afsi.e(afslVar2.b()));
                            afsk afskVar = new afsk(afslVar2, hashSet, 0);
                            long j3 = afwl.a;
                            ahdb ahdbVar2 = new ahdb(afty.c(false), afskVar, 1);
                            Executor executor = afslVar2.c;
                            ahcq ahcqVar = new ahcq(listenableFutureD, ahdbVar2);
                            listenableFutureD.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
                            arrayList.add(ahcqVar);
                            return new ahek(true, agke.j(arrayList)).a(new ahcz(afty.c(false), new okp(12), 1), MoreExecutors.directExecutor());
                        }
                        afsb afsbVar = (afsb) ((Map.Entry) it.next()).getValue();
                        dov dovVar = new dov((byte[]) null);
                        dyn dynVarA = afsl.a(afsbVar.a);
                        afsq afsqVar = afslVar2.e;
                        long j4 = afsbVar.b;
                        Instant.ofEpochMilli(j4);
                        Iterator it3 = ((Set) afsqVar.c.io()).iterator();
                        while (it3.hasNext()) {
                            try {
                                ((ahub) it3.next()).n();
                            } catch (RuntimeException e2) {
                                ((agrc) ((agrc) ((agrc) afsq.a.b()).j(e2)).k("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl", "reportWorkerScheduled", (char) 130, "SyncMonitoringDispatcherImpl.java")).t("SyncWorkerMonitor failed during onWorkerSchedule.");
                            }
                        }
                        ahrn ahrnVar = afslVar2.f;
                        aflk aflkVar = afsl.a;
                        String strC = afsl.c(dynVarA, afslVar2.b());
                        agev agevVarB = afslVar2.b();
                        Boolean.FALSE.booleanValue();
                        afli afliVar = new afli();
                        afliVar.a = afsi.class;
                        afliVar.b(dyn.a);
                        Iterator it4 = it;
                        afliVar.d = new aflk(0L, TimeUnit.SECONDS);
                        afliVar.c(agpr.a);
                        afliVar.f = new dov((byte[]) null).g();
                        afliVar.e = new agfa(Long.valueOf(j4));
                        afliVar.g = new agfa(new aflj(aflkVar, agdf.a));
                        afliVar.h = new agfa(new afll(strC));
                        afliVar.b(dynVarA);
                        String strE = afsi.e(agevVarB);
                        int i = 2;
                        if (dynVarA.c) {
                            int i2 = dynVarA.j;
                            if (i2 == 3) {
                                str = "charger_unmetered";
                            } else {
                                str = i2 == 2 ? "charger_connected" : "charger";
                            }
                        } else {
                            int i3 = dynVarA.j;
                            if (i3 == 3) {
                                str = "unmetered";
                            } else {
                                str = i3 == 2 ? "connected" : "none";
                            }
                        }
                        afliVar.c(agkz.q(strE, "sync_constraint:".concat(str)));
                        afliVar.f = dovVar.g();
                        aflm aflmVarA = afliVar.a();
                        Boolean.FALSE.booleanValue();
                        agkz agkzVar = aflmVarA.i;
                        Pattern pattern = afly.a;
                        agqr it5 = agkzVar.iterator();
                        while (it5.hasNext()) {
                            String str2 = (String) it5.next();
                            if (afly.a.matcher(str2).matches()) {
                                throw new aflt("Tag " + str2 + " is reserved by AccountWorkManager.");
                            }
                        }
                        agqr it6 = agkzVar.iterator();
                        while (it6.hasNext()) {
                            String str3 = (String) it6.next();
                            if (afly.b.matcher(str3).matches()) {
                                throw new aflt("Tag " + str3 + " is reserved by TikTokWorkManager.");
                            }
                        }
                        agev agevVar = aflmVarA.l;
                        if (agevVar.g()) {
                            ahno.P(!((String) agevVar.c()).equals(((Context) ahrnVar.b).getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
                            throw new IllegalStateException("You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
                        }
                        agqj agqjVar = new agqj("TikTokWorker#".concat(ahrnVar.e(aflmVarA.a)));
                        afli afliVar2 = new afli(aflmVarA);
                        agkzVar.getClass();
                        afliVar2.c(new agpx(agkzVar, agqjVar));
                        aflm aflmVarA2 = afliVar2.a();
                        Object obj2 = ahrnVar.a;
                        agev agevVar2 = aflmVarA2.g;
                        if (agevVar2.g()) {
                            if (!agevVar2.g()) {
                                throw new IllegalStateException();
                            }
                            agev agevVar3 = aflmVarA2.h;
                            if (agevVar3.g()) {
                                if (!agevVar2.g()) {
                                    throw new IllegalStateException();
                                }
                                if (!agevVar3.g()) {
                                    throw new IllegalStateException();
                                }
                                aflk aflkVar2 = ((aflj) agevVar2.c()).a;
                                agevVar2.c();
                                ayq ayqVarG = ahrnVar.g(aflmVarA2, aflkVar2);
                                ListenableFuture listenableFutureE = ahrnVar.c.e(((afll) agevVar3.c()).a, ((afll) agevVar3.c()).b, ayqVarG);
                                afro afroVar = new afro(ayqVarG, 1);
                                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                                int i4 = ahcs.c;
                                ahcrVar2 = new ahcr(listenableFutureE, afroVar);
                                listenableFutureE.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor, ahcrVar2));
                            } else {
                                if (!agevVar2.g()) {
                                    throw new IllegalStateException();
                                }
                                if (agevVar3.g()) {
                                    throw new IllegalStateException();
                                }
                                aflk aflkVar3 = ((aflj) agevVar2.c()).a;
                                agevVar2.c();
                                ayq ayqVarG2 = ahrnVar.g(aflmVarA2, aflkVar3);
                                ListenableFuture listenableFutureD2 = ahrnVar.c.d(ayqVarG2);
                                aeqk aeqkVar = new aeqk(ayqVarG2, 10);
                                Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
                                int i5 = ahcs.c;
                                ahcrVar2 = new ahcr(listenableFutureD2, aeqkVar);
                                listenableFutureD2.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor2, ahcrVar2));
                            }
                        } else {
                            if (agevVar2.g()) {
                                throw new IllegalStateException();
                            }
                            agev agevVar4 = aflmVarA2.h;
                            if (agevVar4.g()) {
                                if (agevVar2.g()) {
                                    throw new IllegalStateException();
                                }
                                if (!agevVar4.g()) {
                                    throw new IllegalStateException();
                                }
                                ayq ayqVarH = ahrnVar.h(aflmVarA2);
                                ?? r0 = ahrnVar.c;
                                String str4 = ((afll) agevVar4.c()).a;
                                int i6 = ((afll) agevVar4.c()).b - 1;
                                if (i6 == 0) {
                                    i = 1;
                                } else if (i6 != 1) {
                                    throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
                                }
                                ListenableFuture listenableFutureF = r0.f(str4, i, ayqVarH);
                                aeqk aeqkVar2 = new aeqk(ayqVarH, 8);
                                Executor executorDirectExecutor3 = MoreExecutors.directExecutor();
                                int i7 = ahcs.c;
                                ahcrVar2 = new ahcr(listenableFutureF, aeqkVar2);
                                listenableFutureF.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor3, ahcrVar2));
                            } else {
                                if (agevVar2.g()) {
                                    throw new IllegalStateException();
                                }
                                if (agevVar4.g()) {
                                    throw new IllegalStateException();
                                }
                                ayq ayqVarH2 = ahrnVar.h(aflmVarA2);
                                ListenableFuture listenableFutureD3 = ahrnVar.c.d(ayqVarH2);
                                aeqk aeqkVar3 = new aeqk(ayqVarH2, 9);
                                Executor executorDirectExecutor4 = MoreExecutors.directExecutor();
                                int i8 = ahcs.c;
                                ahcrVar2 = new ahcr(listenableFutureD3, aeqkVar3);
                                listenableFutureD3.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor4, ahcrVar2));
                            }
                        }
                        ListenableFuture listenableFutureL = ((jij) obj2).L(ahcrVar2, new hqn(15));
                        afro afroVar2 = new afro(afsbVar, 3);
                        long j5 = afwl.a;
                        afwi afwiVar = new afwi(afty.c(false), afroVar2);
                        Executor executorDirectExecutor5 = MoreExecutors.directExecutor();
                        ahcr ahcrVar3 = new ahcr(listenableFutureL, afwiVar);
                        listenableFutureL.addListener(ahcrVar3, MoreExecutors.c(executorDirectExecutor5, ahcrVar3));
                        arrayList.add(ahcrVar3);
                        it = it4;
                    }
                }
            }, 1);
            Executor executor = afslVar.c;
            ahcq ahcqVar = new ahcq(ahcrVar, ahdbVar);
            ahcrVar.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
            listenableFuture2 = ahcqVar;
        } else {
            listenableFuture2 = aher.a;
        }
        idm idmVar = new idm(this, map, 20);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j3 = afwl.a;
        ahdb ahdbVar2 = new ahdb(afty.c(false), idmVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar2 = new ahcq(listenableFuture2, ahdbVar2);
        listenableFuture2.addListener(ahcqVar2, MoreExecutors.c(executorDirectExecutor, ahcqVar2));
        return ahcqVar2;
    }

    public final ListenableFuture h(final ListenableFuture listenableFuture) {
        ListenableFuture listenableFutureO = o();
        ahcy ahcyVar = new ahcy() { // from class: afrt
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                return listenableFuture;
            }
        };
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureO, ahdbVar);
        listenableFutureO.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        return ahcqVar;
    }

    public final void i(Set set) {
        synchronized (this.h) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                affd affdVar = (affd) it.next();
                afv afvVar = this.i;
                HashMap map = new HashMap();
                agqr it2 = ((agpk) ((agpn) ((afrv) aguu.aw(this.m, afrv.class, affdVar)).s()).entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    afre afreVarA = afre.a((String) entry.getKey());
                    int i = affdVar.a;
                    aihf aihfVarCreateBuilder = afsw.a.createBuilder();
                    afsv afsvVar = afreVarA.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    afsw afswVar = (afsw) aihfVarCreateBuilder.instance;
                    afsvVar.getClass();
                    afswVar.c = afsvVar;
                    afswVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    afsw afswVar2 = (afsw) aihfVarCreateBuilder.instance;
                    afswVar2.b |= 2;
                    afswVar2.d = i;
                    p(new afsa((afsw) aihfVarCreateBuilder.build()), entry, map);
                }
                afvVar.putAll(map);
            }
        }
    }

    public final /* synthetic */ void l(afsa afsaVar, ListenableFuture listenableFuture) {
        synchronized (this.h) {
            try {
                this.k.put(afsaVar, (Long) ahng.v(listenableFuture));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final boolean m() {
        return this.r.m();
    }
}
