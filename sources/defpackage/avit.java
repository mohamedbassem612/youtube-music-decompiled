package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avit implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ avjf b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Future d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Future f;
    final /* synthetic */ avjh g;

    public avit(avjh avjhVar, Collection collection, avjf avjfVar, boolean z, Future future, boolean z2, Future future2) {
        this.a = collection;
        this.b = avjfVar;
        this.c = z;
        this.d = future;
        this.e = z2;
        this.f = future2;
        this.g = avjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (avjf avjfVar : this.a) {
            if (avjfVar != this.b) {
                avjfVar.a.h(avjh.c);
            }
        }
        if (this.c) {
            Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.e) {
                avjh avjhVar = this.g;
                if (avjhVar.u.decrementAndGet() == Integer.MIN_VALUE) {
                    avjhVar.h.execute(new avgv(this, 12));
                }
            }
        }
        Future future2 = this.f;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.g.x();
    }
}
