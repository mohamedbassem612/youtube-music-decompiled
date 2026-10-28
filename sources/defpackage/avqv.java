package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avqv implements Runnable {
    public final avmm a;
    public final avlc b;
    final /* synthetic */ avqx c;
    private final AtomicBoolean d;

    public avqv(avqx avqxVar, AtomicBoolean atomicBoolean, avmm avmmVar, avlc avlcVar) {
        this.c = avqxVar;
        this.d = atomicBoolean;
        this.a = avmmVar;
        this.b = avlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            this.a.b();
            avqx avqxVar = this.c;
            avle avleVar = avqxVar.e;
            if (avleVar != null) {
                avleVar.kp(new xda(this, 2));
                return;
            }
            this.b.b(new TimeoutException(awkh.c(avqxVar.b, avqxVar.c)));
        }
    }
}
