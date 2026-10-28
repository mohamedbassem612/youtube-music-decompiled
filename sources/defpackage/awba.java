package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awba extends AtomicInteger implements avmn {
    private static final long serialVersionUID = 8567835998786448817L;
    final avlw a;
    final avnn b;
    final awaz[] c;
    Object[] d;
    final awig e;
    volatile boolean f;
    volatile boolean g;
    final awkd h = new awkd();
    int i;
    int j;

    public awba(avlw avlwVar, avnn avnnVar, int i, int i2) {
        this.a = avlwVar;
        this.b = avnnVar;
        this.d = new Object[i];
        awaz[] awazVarArr = new awaz[i];
        for (int i3 = 0; i3 < i; i3++) {
            awazVarArr[i3] = new awaz(this, i3);
        }
        this.c = awazVarArr;
        this.e = new awig(i2);
    }

    final void a() {
        for (awaz awazVar : this.c) {
            avnr.b(awazVar);
        }
    }

    final void b(awig awigVar) {
        synchronized (this) {
            this.d = null;
        }
        awigVar.c();
    }

    final void c() {
        if (getAndIncrement() == 0) {
            awig awigVar = this.e;
            avlw avlwVar = this.a;
            int iAddAndGet = 1;
            while (!this.f) {
                awkd awkdVar = this.h;
                if (awkdVar.get() != null) {
                    a();
                    b(awigVar);
                    avlwVar.b(awkh.d(awkdVar));
                    return;
                }
                boolean z = this.g;
                Object[] objArr = (Object[]) awigVar.km();
                try {
                    if (z) {
                        if (objArr == null) {
                            b(awigVar);
                            Throwable thD = awkh.d(awkdVar);
                            if (thD == null) {
                                avlwVar.kn();
                                return;
                            } else {
                                avlwVar.b(thD);
                                return;
                            }
                        }
                    } else if (objArr == null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                    Object objA = this.b.a(objArr);
                    objA.getClass();
                    avlwVar.kk(objA);
                } catch (Throwable th) {
                    avkz.a(th);
                    awkd awkdVar2 = this.h;
                    awkh.e(awkdVar2, th);
                    a();
                    b(awigVar);
                    avlwVar.b(awkh.d(awkdVar2));
                    return;
                }
            }
            b(awigVar);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.e);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.f;
    }
}
