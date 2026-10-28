package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awgl extends avmc implements avmd {
    static final awgk[] a = new awgk[0];
    static final awgk[] b = new awgk[0];
    final avmf c;
    final AtomicInteger d = new AtomicInteger();
    final AtomicReference e = new AtomicReference(a);
    Object f;
    Throwable g;

    public awgl(avmf avmfVar) {
        this.c = avmfVar;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        AtomicReference atomicReference;
        awgk[] awgkVarArr;
        awgk[] awgkVarArr2;
        awgk awgkVar = new awgk(avmdVar, this);
        avmdVar.d(awgkVar);
        do {
            atomicReference = this.e;
            awgkVarArr = (awgk[]) atomicReference.get();
            if (awgkVarArr == b) {
                Throwable th = this.g;
                if (th != null) {
                    avmdVar.b(th);
                    return;
                } else {
                    avmdVar.ki(this.f);
                    return;
                }
            }
            int length = awgkVarArr.length;
            awgkVarArr2 = new awgk[length + 1];
            System.arraycopy(awgkVarArr, 0, awgkVarArr2, 0, length);
            awgkVarArr2[length] = awgkVar;
        } while (!a.av(atomicReference, awgkVarArr, awgkVarArr2));
        if (awgkVar.get()) {
            I(awgkVar);
        }
        if (this.d.getAndIncrement() == 0) {
            this.c.F(this);
        }
    }

    final void I(awgk awgkVar) {
        AtomicReference atomicReference;
        awgk[] awgkVarArr;
        awgk[] awgkVarArr2;
        do {
            atomicReference = this.e;
            awgkVarArr = (awgk[]) atomicReference.get();
            int length = awgkVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awgkVarArr[i] == awgkVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awgkVarArr2 = a;
            } else {
                awgk[] awgkVarArr3 = new awgk[length - 1];
                System.arraycopy(awgkVarArr, 0, awgkVarArr3, 0, i);
                System.arraycopy(awgkVarArr, i + 1, awgkVarArr3, i, (length - i) - 1);
                awgkVarArr2 = awgkVarArr3;
            }
        } while (!a.av(atomicReference, awgkVarArr, awgkVarArr2));
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.g = th;
        for (awgk awgkVar : (awgk[]) this.e.getAndSet(b)) {
            if (!awgkVar.get()) {
                awgkVar.a.b(th);
            }
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.f = obj;
        for (awgk awgkVar : (awgk[]) this.e.getAndSet(b)) {
            if (!awgkVar.get()) {
                awgkVar.a.ki(obj);
            }
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
    }
}
