package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsp extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final avsq c;
    final AtomicBoolean d = new AtomicBoolean();

    public avsp(Object obj, long j, avsq avsqVar) {
        this.a = obj;
        this.b = j;
        this.c = avsqVar;
    }

    final void a() {
        if (this.d.compareAndSet(false, true)) {
            avsq avsqVar = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == avsqVar.g) {
                if (avsqVar.get() == 0) {
                    avsqVar.kj();
                    avsqVar.a.b(new avmx("Could not deliver value due to lack of requests"));
                } else {
                    avsqVar.a.kk(obj);
                    atqp.F(avsqVar, 1L);
                    avnr.b(this);
                }
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == avnr.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }
}
