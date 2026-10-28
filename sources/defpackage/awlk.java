package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlk extends avlb implements avlc {
    static final awlj[] a = new awlj[0];
    public static final awlj[] b = new awlj[0];
    public Throwable e;
    final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference(a);

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        AtomicReference atomicReference;
        awlj[] awljVarArr;
        awlj[] awljVarArr2;
        awlj awljVar = new awlj(avlcVar, this);
        avlcVar.d(awljVar);
        do {
            atomicReference = this.c;
            awljVarArr = (awlj[]) atomicReference.get();
            if (awljVarArr == b) {
                Throwable th = this.e;
                if (th != null) {
                    avlcVar.b(th);
                    return;
                } else {
                    avlcVar.kn();
                    return;
                }
            }
            int length = awljVarArr.length;
            awljVarArr2 = new awlj[length + 1];
            System.arraycopy(awljVarArr, 0, awljVarArr2, 0, length);
            awljVarArr2[length] = awljVar;
        } while (!a.av(atomicReference, awljVarArr, awljVarArr2));
        if (awljVar.f()) {
            J(awljVar);
        }
    }

    final void J(awlj awljVar) {
        AtomicReference atomicReference;
        awlj[] awljVarArr;
        awlj[] awljVarArr2;
        do {
            atomicReference = this.c;
            awljVarArr = (awlj[]) atomicReference.get();
            int length = awljVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awljVarArr[i] == awljVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awljVarArr2 = a;
            } else {
                awlj[] awljVarArr3 = new awlj[length - 1];
                System.arraycopy(awljVarArr, 0, awljVarArr3, 0, i);
                System.arraycopy(awljVarArr, i + 1, awljVarArr3, i, (length - i) - 1);
                awljVarArr2 = awljVarArr3;
            }
        } while (!a.av(atomicReference, awljVarArr, awljVarArr2));
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        th.getClass();
        if (!this.d.compareAndSet(false, true)) {
            atqp.n(th);
            return;
        }
        this.e = th;
        for (awlj awljVar : (awlj[]) this.c.getAndSet(b)) {
            awljVar.a.b(th);
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (this.c.get() == b) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (this.d.compareAndSet(false, true)) {
            for (awlj awljVar : (awlj[]) this.c.getAndSet(b)) {
                awljVar.a.kn();
            }
        }
    }
}
