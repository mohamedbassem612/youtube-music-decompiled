package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlo extends awly {
    static final awln[] a = new awln[0];
    static final awln[] b = new awln[0];
    final AtomicReference c = new AtomicReference(b);
    Throwable d;

    final void au(awln awlnVar) {
        AtomicReference atomicReference;
        awln[] awlnVarArr;
        awln[] awlnVarArr2;
        do {
            atomicReference = this.c;
            awlnVarArr = (awln[]) atomicReference.get();
            if (awlnVarArr == a || awlnVarArr == (awlnVarArr2 = b)) {
                return;
            }
            int length = awlnVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awlnVarArr[i] == awlnVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                awlnVarArr2 = new awln[length - 1];
                System.arraycopy(awlnVarArr, 0, awlnVarArr2, 0, i);
                System.arraycopy(awlnVarArr, i + 1, awlnVarArr2, i, (length - i) - 1);
            }
        } while (!a.av(atomicReference, awlnVarArr, awlnVarArr2));
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        th.getClass();
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        Object obj2 = a;
        if (obj == obj2) {
            atqp.n(th);
            return;
        }
        this.d = th;
        for (awln awlnVar : (awln[]) atomicReference.getAndSet(obj2)) {
            if (awlnVar.get()) {
                atqp.n(th);
            } else {
                awlnVar.a.b(th);
            }
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (this.c.get() == a) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        AtomicReference atomicReference;
        awln[] awlnVarArr;
        awln[] awlnVarArr2;
        awln awlnVar = new awln(avlwVar, this);
        avlwVar.d(awlnVar);
        do {
            atomicReference = this.c;
            awlnVarArr = (awln[]) atomicReference.get();
            if (awlnVarArr == a) {
                Throwable th = this.d;
                if (th != null) {
                    avlwVar.b(th);
                    return;
                } else {
                    avlwVar.kn();
                    return;
                }
            }
            int length = awlnVarArr.length;
            awlnVarArr2 = new awln[length + 1];
            System.arraycopy(awlnVarArr, 0, awlnVarArr2, 0, length);
            awlnVarArr2[length] = awlnVar;
        } while (!a.av(atomicReference, awlnVarArr, awlnVarArr2));
        if (awlnVar.get()) {
            au(awlnVar);
        }
    }

    @Override // defpackage.awly
    public final boolean f() {
        return ((awln[]) this.c.get()).length != 0;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        obj.getClass();
        for (awln awlnVar : (awln[]) this.c.get()) {
            if (!awlnVar.get()) {
                awlnVar.a.kk(obj);
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        Object obj2 = a;
        if (obj != obj2) {
            awln[] awlnVarArr = (awln[]) atomicReference.getAndSet(obj2);
            for (awln awlnVar : awlnVarArr) {
                if (!awlnVar.get()) {
                    awlnVar.a.kn();
                }
            }
        }
    }
}
