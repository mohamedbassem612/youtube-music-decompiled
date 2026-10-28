package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaog implements Runnable {
    public static final /* synthetic */ int c = 0;
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker");
    private static final aanp e;
    private static final aanp f;
    private static final aanp g;
    public final ahex a;
    public ListenableFuture b;
    private final ScheduledExecutorService h;
    private final Map i;
    private final aany j;
    private final aanw k;
    private final awmd l;
    private final mbc m;
    private final aauk n;

    static {
        aano aanoVar = new aano(aanp.c);
        aanoVar.d = 36;
        e = aanoVar.a();
        aano aanoVar2 = new aano(aanp.c);
        aanoVar2.d = 6;
        f = aanoVar2.a();
        aano aanoVar3 = new aano(aanp.c);
        aanoVar3.d = 34;
        g = aanoVar3.a();
    }

    public aaog(abxu abxuVar, Map map, aany aanyVar, aanw aanwVar, awmd awmdVar, mbc mbcVar, aauk aaukVar) {
        boolean zA = aaukVar.A();
        abxu abxuVarW = abxuVar.w();
        this.a = (ahex) (zA ? abxuVarW.e : abxuVar.v().c);
        this.h = (ScheduledExecutorService) (zA ? abxuVarW.e : abxuVarW.c);
        this.i = map;
        this.j = aanyVar;
        this.k = aanwVar;
        this.l = awmdVar;
        this.m = mbcVar;
        this.n = aaukVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        ((agrc) ((agrc) ((agrc) d.b()).j(th)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "maybeWakeUp", (char) 131, "OrchestrationWorker.java")).w("[Offline] %s", "Problem with orchestration worker");
        zvp.b(zvn.b, zvm.C, "Problem with orchestration worker", th);
    }

    private final void d(ListenableFuture listenableFuture) {
        if (listenableFuture == null || !this.n.A()) {
            return;
        }
        listenableFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    private final void e(aaof aaofVar, aanq aanqVar, aanp aanpVar, long j, long j2) {
        boolean z;
        List arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = aanpVar.f;
        int i2 = i - 1;
        byte[] bArr = null;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            int i3 = 2;
            if (i2 == 2) {
                if (aanpVar.d) {
                    int iIncrementAndGet = aanqVar.e.incrementAndGet();
                    aofg aofgVar = aanqVar.c.e;
                    if (aofgVar == null) {
                        aofgVar = aofg.b;
                    }
                    List list = aofgVar.f;
                    if (list.isEmpty()) {
                        list = aael.a;
                    }
                    if (iIncrementAndGet <= list.size()) {
                        hashSet.add(aanqVar);
                        this.h.schedule(new aadw(aaofVar, aanqVar, i3, bArr), ((Integer) list.get(iIncrementAndGet - 1)).intValue(), TimeUnit.SECONDS);
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                aaofVar.o(aanqVar, aanpVar, arrayList, j, j2, z);
                if (z) {
                    hashSet.addAll(aaofVar.k(aanqVar, aanqVar, aanpVar));
                }
            }
        } else {
            agke agkeVar = aanpVar.e;
            if (!agkeVar.isEmpty()) {
                int size = agkeVar.size();
                for (int i4 = 0; i4 < size; i4++) {
                    try {
                        arrayList.addAll(this.k.a((aofh) agkeVar.get(i4), aanqVar));
                    } catch (aaob e2) {
                        ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "processResult", 360, "OrchestrationWorker.java")).y("[Offline] Add additionAction failed for parentEntityType: %d ErrorMessasge: %s", aanqVar.b, e2.getMessage());
                    }
                }
            }
            aaofVar.o(aanqVar, aanpVar, arrayList, j, j2, false);
            hashSet.addAll(aaofVar.f(arrayList, aanqVar));
            hashSet.addAll(aaofVar.l(aanqVar, aanqVar, aanpVar));
        }
        aaofVar.r(hashSet);
    }

    private static agke f(agke agkeVar, int i) {
        agjz agjzVar = new agjz(4);
        for (int i2 = 0; i2 < ((agpi) agkeVar).d; i2++) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = i;
            agjzVar.h(aanoVar.a());
        }
        return agjzVar.g();
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return aher.a;
        }
        listenableFuture.cancel(true);
        return listenableFuture;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x027a  */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x012d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x027a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(aanq aanqVar, aaof aaofVar) {
        aanp aanpVarA;
        aauk aaukVar;
        ListenableFuture listenableFutureB;
        String str;
        String str2;
        ListenableFuture listenableFutureC;
        String str3;
        RuntimeException runtimeException;
        agke agkeVarF;
        long jB;
        long epochMilli;
        int i;
        agqs agqsVarListIterator;
        Iterator it;
        aanp aanpVarA2;
        aant aantVar = (aant) this.i.get(Integer.valueOf(aanqVar.b));
        if (aantVar != null) {
            aofh aofhVar = aanqVar.c;
            int i2 = aofhVar.c;
            aantVar.getClass().getSimpleName();
            agke agkeVarC = aaofVar.c(aanqVar, aantVar.a(aofhVar));
            agpi agpiVar = (agpi) agkeVarC;
            if (agpiVar.d <= 1) {
                aaofVar.x(aanqVar, 3);
                long jB2 = this.m.b();
                try {
                    try {
                        listenableFutureB = aantVar.b(aaofVar.b, aanqVar.c);
                        try {
                            aanpVarA = (aanp) listenableFutureB.get(60L, TimeUnit.SECONDS);
                        } catch (TimeoutException unused) {
                            agrc agrcVar = (agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", 277, "OrchestrationWorker.java");
                            int i3 = aanqVar.b;
                            int iBc = a.bc(aanqVar.c.c);
                            agrcVar.y("[Offline] Controller for Entity [%d] Action [%s] timed out", i3, agvp.F(iBc == 0 ? 1 : iBc));
                            d(listenableFutureB);
                            aano aanoVar = new aano(aanp.b);
                            aanoVar.d = 29;
                            aanpVarA = aanoVar.a();
                        }
                    } catch (TimeoutException unused2) {
                        listenableFutureB = null;
                    }
                } catch (SQLiteException unused3) {
                    aanpVarA = f;
                } catch (InterruptedException e2) {
                    e = e2;
                    aaukVar = this.n;
                    aanp aanpVar = e;
                    if (aaukVar.y()) {
                        zvl zvlVar = (zvl) this.l.io();
                        zvj zvjVarA = zvk.a();
                        zvjVarA.f(e);
                        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                        zvjVarA.j = 30;
                        zvjVarA.d("Orchestration worker async operation failed for type: " + aanqVar.b);
                        zvlVar.a(zvjVarA.a());
                    }
                    aanpVarA = aanpVar;
                } catch (RuntimeException e3) {
                    ((agrc) ((agrc) ((agrc) d.b()).j(e3)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", (char) 274, "OrchestrationWorker.java")).t("[Offline] Problem with a controller");
                    aanpVarA = g;
                } catch (ExecutionException e4) {
                    e = e4;
                    aaukVar = this.n;
                    aanp aanpVar2 = e;
                    if (aaukVar.y()) {
                        zvl zvlVar2 = (zvl) this.l.io();
                        zvj zvjVarA2 = zvk.a();
                        zvjVarA2.f(e);
                        zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                        zvjVarA2.j = 30;
                        zvjVarA2.d("Orchestration worker async operation failed for type: " + aanqVar.b);
                        zvlVar2.a(zvjVarA2.a());
                    }
                    aanpVarA = aanpVar2;
                }
                mbc mbcVar = this.m;
                e(aaofVar, aanqVar, aanpVarA, mbcVar.b() - jB2, mbcVar.f().toEpochMilli());
                return;
            }
            agqs agqsVarListIterator2 = agkeVarC.listIterator(0);
            while (agqsVarListIterator2.hasNext()) {
                aaofVar.x((aanq) agqsVarListIterator2.next(), 3);
            }
            long jB3 = this.m.b();
            try {
                try {
                    try {
                        try {
                            zwa zwaVar = aaofVar.b;
                            try {
                                agjz agjzVar = new agjz(4);
                                agqs agqsVarListIterator3 = agkeVarC.listIterator(0);
                                while (agqsVarListIterator3.hasNext()) {
                                    try {
                                        agjzVar.h(((aanq) agqsVarListIterator3.next()).c);
                                    } catch (RuntimeException e5) {
                                        runtimeException = e5;
                                        str3 = "OrchestrationWorker.java";
                                        ((agrc) ((agrc) ((agrc) d.b()).j(runtimeException)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", (char) 225, str3)).t("[Offline] Problem with a controller");
                                        agkeVarF = f(agkeVarC, 34);
                                        mbc mbcVar2 = this.m;
                                        jB = mbcVar2.b() - jB3;
                                        epochMilli = mbcVar2.f().toEpochMilli();
                                        if (agpiVar.d != agkeVarF.size()) {
                                            i = 0;
                                            ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "processResults", 317, "OrchestrationWorker.java")).u("[Offline] BatchedResult size does not match actions for type: %d", ((aanq) agkeVarC.get(0)).b);
                                        } else {
                                            i = 0;
                                        }
                                        agqsVarListIterator = agkeVarC.listIterator(i);
                                        it = agkeVarF.iterator();
                                        while (agqsVarListIterator.hasNext()) {
                                            aanq aanqVar2 = (aanq) agqsVarListIterator.next();
                                            if (it.hasNext()) {
                                                aanpVarA2 = (aanp) it.next();
                                            } else {
                                                aano aanoVar2 = new aano(aanp.b);
                                                aanoVar2.d = 14;
                                                aanpVarA2 = aanoVar2.a();
                                            }
                                            long j = jB;
                                            long j2 = epochMilli;
                                            e(aaofVar, aanqVar2, aanpVarA2, j, j2);
                                            epochMilli = j2;
                                            jB = j;
                                        }
                                    }
                                }
                                listenableFutureC = aantVar.c(zwaVar, agjzVar.g());
                                try {
                                    str2 = "OrchestrationWorker.java";
                                    try {
                                        agkeVarF = (agke) listenableFutureC.get(600L, TimeUnit.SECONDS);
                                    } catch (InterruptedException e6) {
                                        e = e6;
                                        str = str2;
                                        if (this.n.y()) {
                                            zvl zvlVar3 = (zvl) this.l.io();
                                            zvj zvjVarA3 = zvk.a();
                                            zvjVarA3.f(e);
                                            zvjVarA3.c(ajtv.ERROR_LEVEL_WARNING);
                                            zvjVarA3.j = 30;
                                            zvjVarA3.d("Orchestration worker async operation failed for type: " + aanqVar.b);
                                            zvlVar3.a(zvjVarA3.a());
                                        }
                                        ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", ModuleDescriptor.MODULE_VERSION, str)).u("[Offline] Orchestration worker async operation failed for type: %d", aanqVar.b);
                                        agkeVarF = f(agkeVarC, 36);
                                    } catch (RuntimeException e7) {
                                        e = e7;
                                        runtimeException = e;
                                        str3 = str2;
                                        ((agrc) ((agrc) ((agrc) d.b()).j(runtimeException)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", (char) 225, str3)).t("[Offline] Problem with a controller");
                                        agkeVarF = f(agkeVarC, 34);
                                    } catch (ExecutionException e8) {
                                        e = e8;
                                        str = str2;
                                        if (this.n.y()) {
                                            zvl zvlVar4 = (zvl) this.l.io();
                                            zvj zvjVarA4 = zvk.a();
                                            zvjVarA4.f(e);
                                            zvjVarA4.c(ajtv.ERROR_LEVEL_WARNING);
                                            zvjVarA4.j = 30;
                                            zvjVarA4.d("Orchestration worker async operation failed for type: " + aanqVar.b);
                                            zvlVar4.a(zvjVarA4.a());
                                        }
                                        ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", ModuleDescriptor.MODULE_VERSION, str)).u("[Offline] Orchestration worker async operation failed for type: %d", aanqVar.b);
                                        agkeVarF = f(agkeVarC, 36);
                                    } catch (TimeoutException unused4) {
                                        agrc agrcVar2 = (agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", 232, str2);
                                        int i4 = aanqVar.b;
                                        int iBc2 = a.bc(aanqVar.c.c);
                                        agrcVar2.y("[Offline] Controller for Entity [%d] Actions [%s] timed out", i4, agvp.F(iBc2 == 0 ? 1 : iBc2));
                                        d(listenableFutureC);
                                        agjz agjzVar2 = new agjz(4);
                                        for (int i5 = 0; i5 < agpiVar.d; i5++) {
                                            aano aanoVar3 = new aano(aanp.b);
                                            aanoVar3.d = 29;
                                            agjzVar2.h(aanoVar3.a());
                                        }
                                        agkeVarF = agjzVar2.g();
                                    }
                                } catch (TimeoutException unused5) {
                                    str2 = "OrchestrationWorker.java";
                                }
                            } catch (InterruptedException e9) {
                                e = e9;
                                str2 = "OrchestrationWorker.java";
                                str = str2;
                                if (this.n.y()) {
                                    zvl zvlVar5 = (zvl) this.l.io();
                                    zvj zvjVarA5 = zvk.a();
                                    zvjVarA5.f(e);
                                    zvjVarA5.c(ajtv.ERROR_LEVEL_WARNING);
                                    zvjVarA5.j = 30;
                                    zvjVarA5.d("Orchestration worker async operation failed for type: " + aanqVar.b);
                                    zvlVar5.a(zvjVarA5.a());
                                }
                                ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", ModuleDescriptor.MODULE_VERSION, str)).u("[Offline] Orchestration worker async operation failed for type: %d", aanqVar.b);
                                agkeVarF = f(agkeVarC, 36);
                                mbc mbcVar3 = this.m;
                                jB = mbcVar3.b() - jB3;
                                epochMilli = mbcVar3.f().toEpochMilli();
                                if (agpiVar.d != agkeVarF.size()) {
                                    i = 0;
                                    ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "processResults", 317, "OrchestrationWorker.java")).u("[Offline] BatchedResult size does not match actions for type: %d", ((aanq) agkeVarC.get(0)).b);
                                } else {
                                    i = 0;
                                }
                                agqsVarListIterator = agkeVarC.listIterator(i);
                                it = agkeVarF.iterator();
                                while (agqsVarListIterator.hasNext()) {
                                    aanq aanqVar3 = (aanq) agqsVarListIterator.next();
                                    if (it.hasNext()) {
                                        aanpVarA2 = (aanp) it.next();
                                    } else {
                                        aano aanoVar4 = new aano(aanp.b);
                                        aanoVar4.d = 14;
                                        aanpVarA2 = aanoVar4.a();
                                    }
                                    long j3 = jB;
                                    long j4 = epochMilli;
                                    e(aaofVar, aanqVar3, aanpVarA2, j3, j4);
                                    epochMilli = j4;
                                    jB = j3;
                                }
                            } catch (RuntimeException e10) {
                                e = e10;
                                str2 = "OrchestrationWorker.java";
                            } catch (ExecutionException e11) {
                                e = e11;
                                str2 = "OrchestrationWorker.java";
                                str = str2;
                                if (this.n.y()) {
                                    zvl zvlVar6 = (zvl) this.l.io();
                                    zvj zvjVarA6 = zvk.a();
                                    zvjVarA6.f(e);
                                    zvjVarA6.c(ajtv.ERROR_LEVEL_WARNING);
                                    zvjVarA6.j = 30;
                                    zvjVarA6.d("Orchestration worker async operation failed for type: " + aanqVar.b);
                                    zvlVar6.a(zvjVarA6.a());
                                }
                                ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "handleActionableItemFromQueue", ModuleDescriptor.MODULE_VERSION, str)).u("[Offline] Orchestration worker async operation failed for type: %d", aanqVar.b);
                                agkeVarF = f(agkeVarC, 36);
                                mbc mbcVar4 = this.m;
                                jB = mbcVar4.b() - jB3;
                                epochMilli = mbcVar4.f().toEpochMilli();
                                if (agpiVar.d != agkeVarF.size()) {
                                    i = 0;
                                    ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "processResults", 317, "OrchestrationWorker.java")).u("[Offline] BatchedResult size does not match actions for type: %d", ((aanq) agkeVarC.get(0)).b);
                                } else {
                                    i = 0;
                                }
                                agqsVarListIterator = agkeVarC.listIterator(i);
                                it = agkeVarF.iterator();
                                while (agqsVarListIterator.hasNext()) {
                                    aanq aanqVar4 = (aanq) agqsVarListIterator.next();
                                    if (it.hasNext()) {
                                        aanpVarA2 = (aanp) it.next();
                                    } else {
                                        aano aanoVar5 = new aano(aanp.b);
                                        aanoVar5.d = 14;
                                        aanpVarA2 = aanoVar5.a();
                                    }
                                    long j5 = jB;
                                    long j6 = epochMilli;
                                    e(aaofVar, aanqVar4, aanpVarA2, j5, j6);
                                    epochMilli = j6;
                                    jB = j5;
                                }
                            }
                        } catch (SQLiteException unused6) {
                            agkeVarF = f(agkeVarC, 37);
                        }
                    } catch (RuntimeException e12) {
                        str3 = "OrchestrationWorker.java";
                        runtimeException = e12;
                    }
                } catch (TimeoutException unused7) {
                    str2 = "OrchestrationWorker.java";
                    listenableFutureC = null;
                }
            } catch (InterruptedException | ExecutionException e13) {
                e = e13;
                str = "OrchestrationWorker.java";
            }
            mbc mbcVar5 = this.m;
            jB = mbcVar5.b() - jB3;
            epochMilli = mbcVar5.f().toEpochMilli();
            if (agpiVar.d != agkeVarF.size()) {
                i = 0;
                ((agrc) ((agrc) d.c()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationWorker", "processResults", 317, "OrchestrationWorker.java")).u("[Offline] BatchedResult size does not match actions for type: %d", ((aanq) agkeVarC.get(0)).b);
            } else {
                i = 0;
            }
            agqsVarListIterator = agkeVarC.listIterator(i);
            it = agkeVarF.iterator();
            while (agqsVarListIterator.hasNext()) {
                aanq aanqVar5 = (aanq) agqsVarListIterator.next();
                if (it.hasNext()) {
                    aanpVarA2 = (aanp) it.next();
                } else {
                    aano aanoVar6 = new aano(aanp.b);
                    aanoVar6.d = 14;
                    aanpVarA2 = aanoVar6.a();
                }
                long j7 = jB;
                long j8 = epochMilli;
                e(aaofVar, aanqVar5, aanpVarA2, j7, j8);
                epochMilli = j8;
                jB = j7;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Optional optionalOfNullable = Optional.ofNullable((aaof) this.j.h.get());
        if (optionalOfNullable.isEmpty()) {
            return;
        }
        aaof aaofVar = (aaof) optionalOfNullable.get();
        while (true) {
            hpf hpfVar = new hpf(this, aaofVar, 7, null);
            synchronized (aaofVar.h) {
                aanq aanqVarA = aaofVar.a();
                if (aanqVarA == null) {
                    return;
                } else {
                    hpfVar.r(aanqVarA);
                }
            }
        }
    }
}
