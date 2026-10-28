package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awei extends AtomicReference implements avlw, avmn {
    static final awef[] a = new awef[0];
    static final awef[] b = new awef[0];
    private static final long serialVersionUID = -533785617179540163L;
    final aweh c;
    boolean d;
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public awei(aweh awehVar) {
        this.c = awehVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.d) {
            atqp.n(th);
            return;
        }
        this.d = true;
        this.c.c(th);
        h();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            g();
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.e.set(b);
        avnr.b(this);
    }

    final void e(awef awefVar) {
        AtomicReference atomicReference;
        awef[] awefVarArr;
        awef[] awefVarArr2;
        do {
            atomicReference = this.e;
            awefVarArr = (awef[]) atomicReference.get();
            int length = awefVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awefVarArr[i].equals(awefVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awefVarArr2 = a;
            } else {
                awef[] awefVarArr3 = new awef[length - 1];
                System.arraycopy(awefVarArr, 0, awefVarArr3, 0, i);
                System.arraycopy(awefVarArr, i + 1, awefVarArr3, i, (length - i) - 1);
                awefVarArr2 = awefVarArr3;
            }
        } while (!a.av(atomicReference, awefVarArr, awefVarArr2));
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e.get() == b;
    }

    final void g() {
        for (awef awefVar : (awef[]) this.e.get()) {
            this.c.e(awefVar);
        }
    }

    final void h() {
        for (awef awefVar : (awef[]) this.e.getAndSet(b)) {
            this.c.e(awefVar);
        }
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        this.c.d(obj);
        g();
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.b();
        h();
    }
}
