package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlx extends avmc implements avmd {
    static final awlw[] a = new awlw[0];
    public static final awlw[] b = new awlw[0];
    public Object e;
    Throwable f;
    final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference(a);

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        AtomicReference atomicReference;
        awlw[] awlwVarArr;
        awlw[] awlwVarArr2;
        awlw awlwVar = new awlw(avmdVar, this);
        avmdVar.d(awlwVar);
        do {
            atomicReference = this.c;
            awlwVarArr = (awlw[]) atomicReference.get();
            if (awlwVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    avmdVar.b(th);
                    return;
                } else {
                    avmdVar.ki(this.e);
                    return;
                }
            }
            int length = awlwVarArr.length;
            awlwVarArr2 = new awlw[length + 1];
            System.arraycopy(awlwVarArr, 0, awlwVarArr2, 0, length);
            awlwVarArr2[length] = awlwVar;
        } while (!a.av(atomicReference, awlwVarArr, awlwVarArr2));
        if (awlwVar.f()) {
            I(awlwVar);
        }
    }

    final void I(awlw awlwVar) {
        AtomicReference atomicReference;
        awlw[] awlwVarArr;
        awlw[] awlwVarArr2;
        do {
            atomicReference = this.c;
            awlwVarArr = (awlw[]) atomicReference.get();
            int length = awlwVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awlwVarArr[i] == awlwVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awlwVarArr2 = a;
            } else {
                awlw[] awlwVarArr3 = new awlw[length - 1];
                System.arraycopy(awlwVarArr, 0, awlwVarArr3, 0, i);
                System.arraycopy(awlwVarArr, i + 1, awlwVarArr3, i, (length - i) - 1);
                awlwVarArr2 = awlwVarArr3;
            }
        } while (!a.av(atomicReference, awlwVarArr, awlwVarArr2));
    }

    public final boolean J() {
        return this.c.get() == b && this.e != null;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        th.getClass();
        if (!this.d.compareAndSet(false, true)) {
            atqp.n(th);
            return;
        }
        this.f = th;
        for (awlw awlwVar : (awlw[]) this.c.getAndSet(b)) {
            awlwVar.a.b(th);
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (this.c.get() == b) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        obj.getClass();
        if (this.d.compareAndSet(false, true)) {
            this.e = obj;
            for (awlw awlwVar : (awlw[]) this.c.getAndSet(b)) {
                awlwVar.a.ki(obj);
            }
        }
    }
}
