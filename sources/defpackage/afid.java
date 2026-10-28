package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afid {
    public final awmd a;
    public final mbc b;
    public final awmd c;
    public final int d;
    public final Executor e;
    public final qrx f;
    public final abhh g;
    private final auor h = new auor();

    public afid(awmd awmdVar, abhh abhhVar, qrx qrxVar, mbc mbcVar, awmd awmdVar2, int i, Executor executor) {
        this.a = awmdVar;
        this.g = abhhVar;
        this.f = qrxVar;
        this.b = mbcVar;
        this.c = awmdVar2;
        this.d = i;
        this.e = executor;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureB = b();
        e(listenableFutureB);
        return listenableFutureB;
    }

    public final ListenableFuture b() {
        final long epochMilli = this.b.f().toEpochMilli();
        ahcx ahcxVar = new ahcx() { // from class: afhz
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                final afid afidVar = this.a;
                final ListenableFuture listenableFutureC = afidVar.f.c();
                boolean zIsEmpty = agkz.n(((abhh) afidVar.a.io()).v().values()).isEmpty();
                final long j = epochMilli;
                if (zIsEmpty) {
                    ahcy ahcyVar = new ahcy() { // from class: afib
                        @Override // defpackage.ahcy
                        public final ListenableFuture a(Object obj) {
                            return afidVar.c(j, (afie) obj);
                        }
                    };
                    long j2 = afwl.a;
                    ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
                    Executor executor = afidVar.e;
                    int i = ahcs.c;
                    ahcq ahcqVar = new ahcq(listenableFutureC, ahdbVar);
                    listenableFutureC.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
                    return ahcqVar;
                }
                thc thcVar = new thc(afidVar, 18);
                long j3 = afwl.a;
                ahdb ahdbVar2 = new ahdb(afty.c(false), thcVar, 1);
                Executor executor2 = afidVar.e;
                int i2 = ahcs.c;
                ahcq ahcqVar2 = new ahcq(listenableFutureC, ahdbVar2);
                listenableFutureC.addListener(ahcqVar2, MoreExecutors.c(executor2, ahcqVar2));
                return aheo.p(ahcqVar2).r(new ahdb(afty.c(false), new thc(afidVar, 19), 1), executor2).r(new ahdb(afty.c(false), new ahcy() { // from class: afic
                    @Override // defpackage.ahcy
                    public final ListenableFuture a(Object obj) {
                        ListenableFuture listenableFuture = listenableFutureC;
                        ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                        return afidVar.c(j, (afie) a.i(listenableFuture));
                    }
                }, 1), executor2);
            }
        };
        long j = afwl.a;
        return this.h.d(new afwh(afty.c(false), ahcxVar, 0), this.e);
    }

    public final ListenableFuture c(final long j, final afie afieVar) {
        return this.f.a(new agek() { // from class: afia
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                afie afieVar2 = (afie) obj;
                int i = afieVar2.b;
                int i2 = i & 1;
                long j2 = j;
                if (i2 == 0 && (i & 2) != 0) {
                    long j3 = afieVar2.d;
                    if (j3 > j2) {
                        afie afieVar3 = afieVar;
                        if ((afieVar3.b & 2) == 0 || afieVar3.d != j3) {
                            return afieVar2;
                        }
                    }
                }
                afid afidVar = this.a;
                aihf builder = afieVar2.toBuilder();
                builder.copyOnWrite();
                afie afieVar4 = (afie) builder.instance;
                afieVar4.b |= 1;
                afieVar4.c = j2;
                builder.copyOnWrite();
                afie afieVar5 = (afie) builder.instance;
                afieVar5.b |= 4;
                afieVar5.e = afidVar.d;
                builder.copyOnWrite();
                afie afieVar6 = (afie) builder.instance;
                afieVar6.b &= -3;
                afieVar6.d = 0L;
                return (afie) builder.build();
            }
        }, MoreExecutors.directExecutor());
    }

    public final ListenableFuture d() {
        return this.f.c();
    }

    final void e(ListenableFuture listenableFuture) {
        tzd tzdVar = new tzd(this, 4);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), tzdVar, 0)), this.e);
    }
}
