package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvq extends agtx {
    public static final /* synthetic */ int d = 0;
    private static final long e;
    public final Executor a;
    public final agfr b;
    public final ahpu c;
    private final awmd f;
    private final ahvy g;
    private final awmd h;
    private final ahpu i;
    private volatile qnl j;
    private final ahno k;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        e = 3600L;
    }

    public ahvq(Context context, kje kjeVar, qjk qjkVar, Executor executor, awmd awmdVar, ahno ahnoVar, awmd awmdVar2, ahpu ahpuVar) {
        ahpu ahpuVar2 = new ahpu(context, kjeVar);
        super(null);
        this.c = ahpuVar2;
        this.a = executor;
        this.h = awmdVar;
        this.k = ahnoVar;
        this.i = ahpuVar;
        ahvm ahvmVar = new ahvm(context, awmdVar2, awmdVar);
        this.f = ahvmVar;
        this.g = new ahvy(e, ahvmVar);
        this.b = aguu.al(new ahvl(qjkVar, context, 0));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:27:0x0086, B:29:0x008a, B:30:0x0092), top: B:39:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void e(ahwf ahwfVar, ListenableFuture listenableFuture) {
        aher aherVar;
        ahpu ahpuVar = this.i;
        if (ahpuVar != null) {
            long serializedSize = ahwfVar.getSerializedSize();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = (-86400000) + jElapsedRealtime;
            if (j > 0) {
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ahpuVar.a;
                for (ahvv ahvvVar = (ahvv) concurrentLinkedQueue.peek(); ahvvVar != null && ahvvVar.a <= j; ahvvVar = (ahvv) concurrentLinkedQueue.peek()) {
                    if (concurrentLinkedQueue.remove(ahvvVar)) {
                        ((AtomicLong) ahpuVar.b).addAndGet(-ahvvVar.b);
                    }
                }
            }
            AtomicLong atomicLong = (AtomicLong) ahpuVar.b;
            long j2 = atomicLong.get();
            int i = 0;
            while (true) {
                if (i >= 10 || j2 + serializedSize >= 1048576) {
                    Log.w("ClientLoggingBackend", "Log rate too high, dropping logs.");
                    aherVar = new aher(Boolean.FALSE);
                } else {
                    j2 = atomicLong.get();
                    if (atomicLong.compareAndSet(j2, j2 + serializedSize)) {
                        ((ConcurrentLinkedQueue) ahpuVar.a).offer(new ahvv(jElapsedRealtime, serializedSize));
                        break;
                    }
                    i++;
                }
            }
            if (this.j == null) {
                synchronized (this) {
                    if (this.j == null) {
                        this.j = new qnl((char[]) null);
                    }
                }
            }
            aherVar = new aher(Boolean.TRUE);
        } else {
            if (this.j == null) {
                synchronized (this) {
                    if (this.j == null) {
                        this.j = new qnl((char[]) null);
                    }
                }
            }
            aherVar = new aher(Boolean.TRUE);
        }
        ahvo ahvoVar = new ahvo(this, listenableFuture, ahwfVar);
        long j3 = afwl.a;
        aherVar.addListener(new ahei(aherVar, new afwj(afty.c(false), ahvoVar, 0)), MoreExecutors.directExecutor());
    }

    @Override // defpackage.agtx, defpackage.agsw
    public final void b(RuntimeException runtimeException, agsu agsuVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.agsw
    public final void c(agsu agsuVar) {
        long j;
        awmd awmdVar = this.h;
        awmdVar.io();
        ListenableFuture listenableFuture = (ListenableFuture) this.k.a(agsuVar).e(aher.a);
        String str = agsuVar.n() != null ? agsuVar.n().b : null;
        ahvy ahvyVar = this.g;
        ahvx ahvxVar = new ahvx(agsuVar.f(), str);
        long jE = agsuVar.e();
        synchronized (ahvyVar) {
            if (jE < ahvyVar.c && ahvyVar.d.size() < 1000) {
                j = 0;
                break;
            }
            long nanos = TimeUnit.SECONDS.toNanos(ahvyVar.a);
            LinkedHashMap linkedHashMap = ahvyVar.d;
            Iterator it = linkedHashMap.values().iterator();
            int size = linkedHashMap.size();
            while (true) {
                if (!it.hasNext()) {
                    j = 0;
                    break;
                }
                ahvw ahvwVar = (ahvw) it.next();
                j = 0;
                long j2 = ahvwVar.b + nanos;
                if (j2 >= jE && size <= 1000) {
                    ahvyVar.c = j2;
                    break;
                }
                if (ahvwVar.c > 0 && ahvyVar.e.size() < 1000) {
                    ahvyVar.e.add(ahvwVar);
                }
                it.remove();
                size--;
            }
            LinkedHashMap linkedHashMap2 = ahvyVar.d;
            ahvw ahvwVar2 = (ahvw) linkedHashMap2.get(ahvxVar);
            if (ahvwVar2 != null) {
                if (ahvwVar2.c == j) {
                    ahvwVar2.d = ((ahvm) ahvyVar.b).io().a(agsuVar, 3, ahvh.a);
                }
                ahvwVar2.c++;
                for (ahvw ahvwVar3 : ahvyVar.a()) {
                    long j3 = ahvwVar3.c;
                    if (j3 <= j) {
                        throw new IllegalStateException();
                    }
                    aihf aihfVar = ahvwVar3.d;
                    aihfVar.getClass();
                    aihfVar.copyOnWrite();
                    ahwf ahwfVar = (ahwf) aihfVar.instance;
                    ahwf ahwfVar2 = ahwf.a;
                    ahwfVar.b |= 2;
                    ahwfVar.d = j3;
                    e((ahwf) aihfVar.build(), ahvwVar3.a);
                }
                return;
            }
            linkedHashMap2.put(ahvxVar, new ahvw(listenableFuture, jE));
            ahvh ahvhVarIo = ((ahvm) this.f).io();
            ahvf ahvfVarA = ahvg.a();
            ahvfVarA.b(true);
            ahvfVarA.c(true);
            ahvfVarA.d(true);
            aihf aihfVarA = ahvhVarIo.a(agsuVar, 2, ahvfVarA.a());
            Throwable th = (Throwable) agsuVar.m().d(agrj.a);
            awmdVar.io();
            if (agsuVar.q().intValue() >= Integer.MAX_VALUE && !(th instanceof agrs)) {
                ahab ahabVar = ((ahwf) aihfVarA.instance).g;
                if (ahabVar == null) {
                    ahabVar = ahab.a;
                }
                aihf builder = ahabVar.toBuilder();
                awmdVar.io();
                aihf aihfVarB = aext.b(new ahvp(th), false);
                builder.copyOnWrite();
                ahab ahabVar2 = (ahab) builder.instance;
                ahag ahagVar = (ahag) aihfVarB.build();
                ahagVar.getClass();
                ahabVar2.k = ahagVar;
                ahabVar2.b |= SemanticState.ReadOnly;
                ahab ahabVar3 = (ahab) builder.build();
                aihfVarA.copyOnWrite();
                ahwf ahwfVar3 = (ahwf) aihfVarA.instance;
                ahabVar3.getClass();
                ahwfVar3.g = ahabVar3;
                ahwfVar3.b |= 64;
            }
            awmdVar.io();
            boolean z = afty.a;
            agjz agjzVar = new agjz(4);
            for (afvl afvlVarB = ((afvh) afty.d.get()).c; afvlVarB != null; afvlVarB = afvlVarB.b()) {
                agjzVar.h(afvlVarB.d());
            }
            List listT = aguu.t(agjzVar.g());
            if (!listT.isEmpty()) {
                aihf aihfVarCreateBuilder = ahwc.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ahwc ahwcVar = (ahwc) aihfVarCreateBuilder.instance;
                aiie aiieVar = ahwcVar.b;
                if (!aiieVar.c()) {
                    ahwcVar.b = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(listT, ahwcVar.b);
                aihfVarA.copyOnWrite();
                ahwf ahwfVar4 = (ahwf) aihfVarA.instance;
                ahwc ahwcVar2 = (ahwc) aihfVarCreateBuilder.build();
                ahwf ahwfVar5 = ahwf.a;
                ahwcVar2.getClass();
                ahwfVar4.h = ahwcVar2;
                ahwfVar4.b |= SemanticState.Focused;
            }
            e((ahwf) aihfVarA.build(), listenableFuture);
        }
    }

    @Override // defpackage.agsw
    public final boolean d(Level level) {
        this.h.io();
        return level.intValue() >= Level.SEVERE.intValue();
    }
}
