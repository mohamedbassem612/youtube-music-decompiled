package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rhc extends rgr {
    public static final /* synthetic */ int m = 0;
    private final Executor d;
    public final Object k = new Object();
    private final BlockingQueue c = new LinkedBlockingQueue();
    public final BlockingDeque l = new LinkedBlockingDeque();

    public rhc(Executor executor) {
        this.d = (Executor) Objects.requireNonNullElse(executor, rjb.a.h());
    }

    @Override // defpackage.rgr
    public final void c(rfs rfsVar) {
        synchronized (this.k) {
            this.c.add(rfsVar);
            n();
        }
    }

    @Override // defpackage.rgr, java.lang.AutoCloseable
    public void close() {
        super.close();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.k) {
            this.c.drainTo(arrayList);
        }
        this.l.drainTo(arrayList2);
        Iterable$EL.forEach(arrayList, new rcp(this, 15));
        Iterable$EL.forEach(arrayList2, new hgi(14));
    }

    public abstract void l(rfs rfsVar);

    public final void n() {
        if (this.l.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.c.drainTo(arrayList);
            Iterable$EL.forEach(arrayList, new rcp(this, 16));
        }
    }

    public final void o(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return;
        }
        this.l.add(listenableFuture);
        ahng.g(agke.q(listenableFuture)).a(new jkb(this, listenableFuture, 17), this.d);
    }
}
