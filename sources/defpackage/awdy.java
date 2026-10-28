package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awdy extends AtomicReference implements avlw, avmn {
    static final awdx[] a = new awdx[0];
    static final awdx[] b = new awdx[0];
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicReference d;
    Throwable f;
    final AtomicBoolean c = new AtomicBoolean();
    final AtomicReference e = new AtomicReference();

    public awdy(AtomicReference atomicReference) {
        this.d = atomicReference;
        lazySet(a);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.f = th;
        this.e.lazySet(avnr.DISPOSED);
        for (awdx awdxVar : (awdx[]) getAndSet(b)) {
            awdxVar.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.e, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        getAndSet(b);
        a.aq(this.d, this);
        avnr.b(this.e);
    }

    public final void e(awdx awdxVar) {
        awdx[] awdxVarArr;
        awdx[] awdxVarArr2;
        do {
            awdxVarArr = (awdx[]) get();
            int length = awdxVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awdxVarArr[i] == awdxVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            awdxVarArr2 = a;
            if (length != 1) {
                awdxVarArr2 = new awdx[length - 1];
                System.arraycopy(awdxVarArr, 0, awdxVarArr2, 0, i);
                System.arraycopy(awdxVarArr, i + 1, awdxVarArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(awdxVarArr, awdxVarArr2));
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == b;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        for (awdx awdxVar : (awdx[]) get()) {
            awdxVar.a.kk(obj);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.e.lazySet(avnr.DISPOSED);
        for (awdx awdxVar : (awdx[]) getAndSet(b)) {
            awdxVar.a.kn();
        }
    }
}
