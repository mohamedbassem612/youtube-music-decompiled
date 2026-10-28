package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awbm extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final awbn c;
    final AtomicBoolean d = new AtomicBoolean();

    public awbm(Object obj, long j, awbn awbnVar) {
        this.a = obj;
        this.b = j;
        this.c = awbnVar;
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
        if (this.d.compareAndSet(false, true)) {
            awbn awbnVar = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == awbnVar.g) {
                awbnVar.a.kk(obj);
                avnr.b(this);
            }
        }
    }
}
