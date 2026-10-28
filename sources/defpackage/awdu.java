package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awdu implements avlw, avmn {
    static final awdt[] a = new awdt[0];
    static final awdt[] b = new awdt[0];
    final AtomicReference c;
    final AtomicReference f = new AtomicReference();
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();

    public awdu(AtomicReference atomicReference) {
        this.c = atomicReference;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        a.av(this.c, this, null);
        awdt[] awdtVarArr = (awdt[]) this.d.getAndSet(b);
        if (awdtVarArr.length == 0) {
            atqp.n(th);
            return;
        }
        for (awdt awdtVar : awdtVarArr) {
            awdtVar.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.f, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        AtomicReference atomicReference = this.d;
        awdt[] awdtVarArr = b;
        if (((awdt[]) atomicReference.getAndSet(awdtVarArr)) != awdtVarArr) {
            a.av(this.c, this, null);
            avnr.b(this.f);
        }
    }

    final void e(awdt awdtVar) {
        AtomicReference atomicReference;
        awdt[] awdtVarArr;
        awdt[] awdtVarArr2;
        do {
            atomicReference = this.d;
            awdtVarArr = (awdt[]) atomicReference.get();
            int length = awdtVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awdtVarArr[i].equals(awdtVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awdtVarArr2 = a;
            } else {
                awdt[] awdtVarArr3 = new awdt[length - 1];
                System.arraycopy(awdtVarArr, 0, awdtVarArr3, 0, i);
                System.arraycopy(awdtVarArr, i + 1, awdtVarArr3, i, (length - i) - 1);
                awdtVarArr2 = awdtVarArr3;
            }
        } while (!a.av(atomicReference, awdtVarArr, awdtVarArr2));
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.get() == b;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        for (awdt awdtVar : (awdt[]) this.d.get()) {
            awdtVar.a.kk(obj);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        a.av(this.c, this, null);
        for (awdt awdtVar : (awdt[]) this.d.getAndSet(b)) {
            awdtVar.a.kn();
        }
    }
}
