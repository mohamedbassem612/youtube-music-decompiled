package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class away extends awav implements avlw {
    static final awaw[] b = new awaw[0];
    static final awaw[] c = new awaw[0];
    final AtomicBoolean d;
    final AtomicReference e;
    volatile long f;
    final awax g;
    awax h;
    int i;
    Throwable j;
    volatile boolean k;

    public away(avlr avlrVar) {
        super(avlrVar);
        this.d = new AtomicBoolean();
        awax awaxVar = new awax();
        this.g = awaxVar;
        this.h = awaxVar;
        this.e = new AtomicReference(b);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.j = th;
        this.k = true;
        for (awaw awawVar : (awaw[]) this.e.getAndSet(c)) {
            f(awawVar);
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        AtomicReference atomicReference;
        awaw[] awawVarArr;
        awaw[] awawVarArr2;
        awaw awawVar = new awaw(avlwVar, this);
        avlwVar.d(awawVar);
        do {
            atomicReference = this.e;
            awawVarArr = (awaw[]) atomicReference.get();
            if (awawVarArr == c) {
                break;
            }
            int length = awawVarArr.length;
            awawVarArr2 = new awaw[length + 1];
            System.arraycopy(awawVarArr, 0, awawVarArr2, 0, length);
            awawVarArr2[length] = awawVar;
        } while (!a.av(atomicReference, awawVarArr, awawVarArr2));
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            f(awawVar);
        } else {
            this.a.ak(this);
        }
    }

    final void f(awaw awawVar) {
        if (awawVar.getAndIncrement() == 0) {
            long j = awawVar.e;
            int i = awawVar.d;
            Object obj = awawVar.c;
            avlw avlwVar = awawVar.a;
            int iAddAndGet = 1;
            while (!awawVar.f) {
                boolean z = this.k;
                long j2 = this.f;
                if (z) {
                    if (j2 == j) {
                        awawVar.c = null;
                        Throwable th = this.j;
                        if (th != null) {
                            avlwVar.b(th);
                            return;
                        } else {
                            avlwVar.kn();
                            return;
                        }
                    }
                } else if (j2 == j) {
                    awawVar.e = j;
                    awawVar.d = i;
                    awawVar.c = (awax) obj;
                    iAddAndGet = awawVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                if (i == 16) {
                    obj = ((awax) obj).b;
                    i = 0;
                }
                avlwVar.kk(((awax) obj).a[i]);
                j++;
                i++;
            }
            awawVar.c = null;
        }
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        int i = this.i;
        if (i == 16) {
            awax awaxVar = new awax();
            awaxVar.a[0] = obj;
            this.i = 1;
            this.h.b = awaxVar;
            this.h = awaxVar;
        } else {
            this.h.a[i] = obj;
            this.i = i + 1;
        }
        this.f++;
        for (awaw awawVar : (awaw[]) this.e.get()) {
            f(awawVar);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.k = true;
        for (awaw awawVar : (awaw[]) this.e.getAndSet(c)) {
            f(awawVar);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
    }
}
