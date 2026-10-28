package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlm extends avlm implements avln {
    static final awll[] a = new awll[0];
    static final awll[] b = new awll[0];
    Object e;
    Throwable f;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicReference c = new AtomicReference(a);

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        AtomicReference atomicReference;
        awll[] awllVarArr;
        awll[] awllVarArr2;
        awll awllVar = new awll(avlnVar, this);
        avlnVar.d(awllVar);
        do {
            atomicReference = this.c;
            awllVarArr = (awll[]) atomicReference.get();
            if (awllVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    avlnVar.b(th);
                    return;
                }
                Object obj = this.e;
                if (obj == null) {
                    avlnVar.kn();
                    return;
                } else {
                    avlnVar.ki(obj);
                    return;
                }
            }
            int length = awllVarArr.length;
            awllVarArr2 = new awll[length + 1];
            System.arraycopy(awllVarArr, 0, awllVarArr2, 0, length);
            awllVarArr2[length] = awllVar;
        } while (!a.av(atomicReference, awllVarArr, awllVarArr2));
        if (awllVar.f()) {
            I(awllVar);
        }
    }

    final void I(awll awllVar) {
        AtomicReference atomicReference;
        awll[] awllVarArr;
        awll[] awllVarArr2;
        do {
            atomicReference = this.c;
            awllVarArr = (awll[]) atomicReference.get();
            int length = awllVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awllVarArr[i] == awllVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awllVarArr2 = a;
            } else {
                awll[] awllVarArr3 = new awll[length - 1];
                System.arraycopy(awllVarArr, 0, awllVarArr3, 0, i);
                System.arraycopy(awllVarArr, i + 1, awllVarArr3, i, (length - i) - 1);
                awllVarArr2 = awllVarArr3;
            }
        } while (!a.av(atomicReference, awllVarArr, awllVarArr2));
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        th.getClass();
        if (!this.d.compareAndSet(false, true)) {
            atqp.n(th);
            return;
        }
        this.f = th;
        for (awll awllVar : (awll[]) this.c.getAndSet(b)) {
            awllVar.a.b(th);
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (this.c.get() == b) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        obj.getClass();
        if (this.d.compareAndSet(false, true)) {
            this.e = obj;
            for (awll awllVar : (awll[]) this.c.getAndSet(b)) {
                awllVar.a.ki(obj);
            }
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        if (this.d.compareAndSet(false, true)) {
            for (awll awllVar : (awll[]) this.c.getAndSet(b)) {
                awllVar.a.kn();
            }
        }
    }
}
