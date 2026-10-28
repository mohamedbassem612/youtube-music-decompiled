package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlu extends awly {
    static final awlr[] a = new awlr[0];
    static final awlr[] b = new awlr[0];
    final awlq c;
    final AtomicReference d = new AtomicReference(a);
    boolean e;

    public awlu(awlq awlqVar) {
        this.c = awlqVar;
    }

    public static awlu au() {
        return new awlu(new awlt(16));
    }

    public static awlu av(int i) {
        return new awlu(new awlt(i));
    }

    public static awlu ay() {
        return new awlu(new awls());
    }

    final void aw(awlr awlrVar) {
        AtomicReference atomicReference;
        awlr[] awlrVarArr;
        awlr[] awlrVarArr2;
        do {
            atomicReference = this.d;
            awlrVarArr = (awlr[]) atomicReference.get();
            if (awlrVarArr == b || awlrVarArr == (awlrVarArr2 = a)) {
                return;
            }
            int length = awlrVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awlrVarArr[i] == awlrVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                awlrVarArr2 = new awlr[length - 1];
                System.arraycopy(awlrVarArr, 0, awlrVarArr2, 0, i);
                System.arraycopy(awlrVarArr, i + 1, awlrVarArr2, i, (length - i) - 1);
            }
        } while (!a.av(atomicReference, awlrVarArr, awlrVarArr2));
    }

    final awlr[] ax(Object obj) {
        return this.c.compareAndSet(null, obj) ? (awlr[]) this.d.getAndSet(b) : b;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        th.getClass();
        if (this.e) {
            atqp.n(th);
            return;
        }
        this.e = true;
        awkj awkjVar = new awkj(th);
        awlq awlqVar = this.c;
        awlqVar.b(awkjVar);
        for (awlr awlrVar : ax(awkjVar)) {
            awlqVar.c(awlrVar);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (this.e) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        AtomicReference atomicReference;
        awlr[] awlrVarArr;
        awlr[] awlrVarArr2;
        awlr awlrVar = new awlr(avlwVar, this);
        avlwVar.d(awlrVar);
        if (awlrVar.d) {
            return;
        }
        do {
            atomicReference = this.d;
            awlrVarArr = (awlr[]) atomicReference.get();
            if (awlrVarArr != b) {
                int length = awlrVarArr.length;
                awlrVarArr2 = new awlr[length + 1];
                System.arraycopy(awlrVarArr, 0, awlrVarArr2, 0, length);
                awlrVarArr2[length] = awlrVar;
            }
            this.c.c(awlrVar);
        } while (!a.av(atomicReference, awlrVarArr, awlrVarArr2));
        if (awlrVar.d) {
            aw(awlrVar);
            return;
        }
        this.c.c(awlrVar);
    }

    @Override // defpackage.awly
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        obj.getClass();
        if (this.e) {
            return;
        }
        awlq awlqVar = this.c;
        awlqVar.a(obj);
        for (awlr awlrVar : (awlr[]) this.d.get()) {
            awlqVar.c(awlrVar);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.e) {
            return;
        }
        this.e = true;
        awlq awlqVar = this.c;
        awkl awklVar = awkl.COMPLETE;
        awlqVar.b(awklVar);
        for (awlr awlrVar : ax(awklVar)) {
            awlqVar.c(awlrVar);
        }
    }
}
