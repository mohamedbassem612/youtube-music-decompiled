package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aweo extends AtomicInteger implements Runnable, avoo {
    private static final long serialVersionUID = 3880992722410194083L;
    final avlw a;
    final Object b;

    public aweo(avlw avlwVar, Object obj) {
        this.a = avlwVar;
        this.b = obj;
    }

    @Override // defpackage.avot
    public final void c() {
        lazySet(3);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        set(3);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == 3;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return get() != 1;
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        return a.aD();
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // defpackage.avot
    public final Object km() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            avlw avlwVar = this.a;
            avlwVar.kk(this.b);
            if (get() == 2) {
                lazySet(3);
                avlwVar.kn();
            }
        }
    }
}
