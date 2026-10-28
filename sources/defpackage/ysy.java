package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ysy implements ysz {
    public final byw a;
    public final ypx b;
    public final yre c;
    private final Executor d;
    private final zjr e;
    private Future f;

    public ysy(byw bywVar, Executor executor, yre yreVar, zjr zjrVar, ypx ypxVar) {
        zkf.d(bywVar);
        this.a = bywVar;
        zkf.d(executor);
        this.d = executor;
        zkf.d(yreVar);
        this.c = yreVar;
        this.e = zjrVar;
        this.b = ypxVar;
    }

    @Override // defpackage.ysz
    public final synchronized void a() {
        Future future = this.f;
        if (future != null) {
            future.cancel(true);
            this.f = null;
        }
    }

    @Override // defpackage.ysz
    public final synchronized void b(byi byiVar) {
        if (this.f == null) {
            this.f = ahno.ao(new ysx(this, byiVar, this.e), this.d);
        }
    }
}
