package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afkb {
    public final SettableFuture c;
    public final ahej d;
    public final AtomicLong a = new AtomicLong(-9223372034707292160L);
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = new ahfg(MoreExecutors.directExecutor());

    public afkb(ahcx ahcxVar, Executor executor) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.c = settableFutureCreate;
        ahej ahejVar = new ahej(ahcxVar, executor, 1);
        this.d = ahejVar;
        settableFutureCreate.addListener(ahejVar, MoreExecutors.directExecutor());
    }

    public final ListenableFuture a() {
        AtomicLong atomicLong;
        long j;
        final int i;
        ListenableFuture listenableFuture;
        SettableFuture settableFuture = this.c;
        if (settableFuture.isDone()) {
            return settableFuture;
        }
        do {
            atomicLong = this.a;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) i) << 32) | (((long) (((int) j) + 1)) & 4294967295L)));
        AtomicReference atomicReference = this.e;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        ListenableFuture listenableFuture2 = (ListenableFuture) atomicReference.getAndSet(settableFutureCreate);
        if (listenableFuture2 == null) {
            onj onjVar = new onj(this, i, 2);
            long j2 = afwl.a;
            ahfo ahfoVar = new ahfo(new afwh(afty.c(false), onjVar, 0));
            ahfoVar.run();
            listenableFuture = ahfoVar;
        } else {
            ahcy ahcyVar = new ahcy() { // from class: afjx
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    return this.a.b(i);
                }
            };
            long j3 = afwl.a;
            ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
            Executor executor = this.f;
            int i2 = ahbz.d;
            ahbx ahbxVar = new ahbx(listenableFuture2, Throwable.class, ahdbVar);
            listenableFuture2.addListener(ahbxVar, MoreExecutors.c(executor, ahbxVar));
            listenableFuture = ahbxVar;
        }
        settableFutureCreate.setFuture(listenableFuture);
        final afjz afjzVar = new afjz(this, i);
        settableFutureCreate.addListener(new Runnable() { // from class: afjy
            @Override // java.lang.Runnable
            public final void run() {
                afjz afjzVar2 = afjzVar;
                SettableFuture settableFuture2 = settableFutureCreate;
                try {
                    ahno.R(settableFuture2.isDone(), "Future was expected to be done: %s", settableFuture2);
                    Object objI = a.i(settableFuture2);
                    SettableFuture settableFuture3 = this.a.c;
                    settableFuture3.set(objI);
                    afjzVar2.setFuture(settableFuture3);
                } catch (Throwable unused) {
                    afjzVar2.setFuture(settableFuture2);
                }
            }
        }, MoreExecutors.directExecutor());
        return afjzVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture b(int i) {
        AtomicReference atomicReference;
        afka afkaVar;
        AtomicLong atomicLong = this.a;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            return ahng.l();
        }
        afka afkaVar2 = new afka(i);
        do {
            atomicReference = this.b;
            afkaVar = (afka) atomicReference.get();
            if (afkaVar != null && afkaVar.a > i) {
                return ahng.l();
            }
        } while (!a.av(atomicReference, afkaVar, afkaVar2));
        if (((int) (atomicLong.get() >>> 32)) > i) {
            afkaVar2.cancel(true);
            a.av(atomicReference, afkaVar2, null);
        } else {
            ahej ahejVar = this.d;
            Object obj = ahejVar.a;
            ?? r7 = ahejVar.b;
            if (obj == null || r7 == 0) {
                afkaVar2.setFuture(this.c);
            } else {
                long j = afwl.a;
                ahfo ahfoVar = new ahfo(new afwh(afty.c(false), obj, 0));
                r7.execute(ahfoVar);
                afkaVar2.setFuture(ahfoVar);
            }
        }
        return afkaVar2;
    }

    public final boolean c() {
        return this.c.isDone();
    }
}
