package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abty implements abuh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/sequencerv2/ClientPrefetchController");
    public final ExecutorService b;
    public final abwj c;
    public final Executor d;
    public ListenableFuture e;
    private final ci j;
    private final Queue g = new ArrayDeque();
    private final AtomicBoolean f = new AtomicBoolean(false);
    private agke h = agpi.a;
    private abul i = new abul(0, null);

    public abty(ci ciVar, ExecutorService executorService, abwj abwjVar) {
        this.j = ciVar;
        this.b = executorService;
        this.c = abwjVar;
        this.d = new ahfg(executorService);
    }

    private final void g(abuk abukVar, int i) {
        abul abulVarE = aasc.e(this.i, this.h, abukVar.c, i);
        if (abulVarE != null) {
            abun abunVarF = aasc.f(abulVarE, this.h);
            boolean z = i == 1;
            if (abunVarF != null) {
                this.g.add(new abup(abulVarE, abunVarF, z));
            }
        }
    }

    public final void a() {
        abup abupVar = (abup) this.g.poll();
        if (abupVar != null) {
            ci ciVar = this.j;
            abul abulVar = this.i;
            abun abunVarF = aasc.f(abulVar, this.h);
            abulVar.getClass();
            Optional optionalAo = ciVar.ao(abupVar, abulVar, abunVarF, true);
            yyk yykVar = new yyk(this, 20);
            if (true == optionalAo.isPresent()) {
                Object obj = optionalAo.get();
                Object obj2 = yykVar.a;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                abty abtyVar = (abty) obj2;
                ListenableFuture listenableFuture2 = abtyVar.e;
                if (listenableFuture2 != null) {
                    if (listenableFuture2 == listenableFuture) {
                        return;
                    } else {
                        listenableFuture2.cancel(false);
                    }
                }
                abtyVar.e = listenableFuture;
                taf.i(listenableFuture, abtyVar.c.k ? abtyVar.d : abtyVar.b, new wuy(obj2, 14), new yqj(obj2, 11), new abmn(2));
            }
        }
    }

    @Override // defpackage.abuh
    public final void b() {
        if (this.c.k) {
            this.d.execute(new abbj(this, 17));
        } else {
            synchronized (this) {
                c();
            }
        }
    }

    public final void c() {
        this.h = agpi.a;
        this.i = new abul(0, null);
        this.g.clear();
        this.f.set(false);
        ListenableFuture listenableFuture = this.e;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.e = null;
        }
    }

    public final synchronized boolean d() {
        ListenableFuture listenableFuture = this.e;
        return (listenableFuture == null || !listenableFuture.isDone() || this.f.get()) ? false : true;
    }

    public final void e(agke agkeVar, abuk abukVar, abul abulVar) {
        abuj abujVar = abukVar.b;
        if (abujVar.equals(abuj.a) || agkeVar.size() <= 1) {
            c();
            return;
        }
        AtomicBoolean atomicBoolean = this.f;
        atomicBoolean.set(true);
        this.h = agkeVar;
        this.i = abulVar;
        int iOrdinal = abujVar.ordinal();
        if (iOrdinal == 1) {
            g(abukVar, 1);
        } else if (iOrdinal == 2) {
            g(abukVar, 1);
            g(abukVar, -1);
        } else if (iOrdinal == 3) {
            g(abukVar, 1);
            g(abukVar, 2);
        }
        a();
        atomicBoolean.set(false);
    }

    @Override // defpackage.abuh
    public final void f(agke agkeVar, abuk abukVar, abul abulVar) {
        if (this.c.k) {
            this.d.execute(new aasv(this, agkeVar, abukVar, abulVar, 8));
        } else {
            synchronized (this) {
                e(agkeVar, abukVar, abulVar);
            }
        }
    }
}
