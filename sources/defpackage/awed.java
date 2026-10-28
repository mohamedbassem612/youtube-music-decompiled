package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class awed extends AtomicReference implements aweh {
    private static final long serialVersionUID = 2346567790059478686L;
    aweg a;
    int b;

    public awed() {
        aweg awegVar = new aweg(null);
        this.a = awegVar;
        set(awegVar);
    }

    final void a(aweg awegVar) {
        this.a.set(awegVar);
        this.a = awegVar;
        this.b++;
    }

    @Override // defpackage.aweh
    public final void b() {
        a(new aweg(awkl.COMPLETE));
        f();
    }

    @Override // defpackage.aweh
    public final void c(Throwable th) {
        a(new aweg(new awkj(th)));
        f();
    }

    @Override // defpackage.aweh
    public final void d(Object obj) {
        a(new aweg(obj));
        g();
    }

    @Override // defpackage.aweh
    public final void e(awef awefVar) {
        if (awefVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                aweg awegVar = (aweg) awefVar.c;
                if (awegVar == null) {
                    awegVar = (aweg) get();
                    awefVar.c = awegVar;
                }
                while (true) {
                    if (awefVar.d) {
                        awefVar.c = null;
                        return;
                    }
                    aweg awegVar2 = (aweg) awegVar.get();
                    if (awegVar2 != null) {
                        if (awkl.b(awegVar2.a, awefVar.b)) {
                            awefVar.c = null;
                            return;
                        }
                        awegVar = awegVar2;
                    }
                }
                awefVar.c = awegVar;
                iAddAndGet = awefVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    final void f() {
        aweg awegVar = (aweg) get();
        if (awegVar.a != null) {
            aweg awegVar2 = new aweg(null);
            awegVar2.lazySet((aweg) awegVar.get());
            set(awegVar2);
        }
    }

    public abstract void g();
}
