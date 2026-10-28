package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkx extends awkv {
    static final awkw[] b = new awkw[0];
    static final awkw[] c = new awkw[0];
    final AtomicReference d = new AtomicReference(c);
    Throwable e;

    final void aC(awkw awkwVar) {
        AtomicReference atomicReference;
        awkw[] awkwVarArr;
        awkw[] awkwVarArr2;
        do {
            atomicReference = this.d;
            awkwVarArr = (awkw[]) atomicReference.get();
            if (awkwVarArr == b || awkwVarArr == (awkwVarArr2 = c)) {
                return;
            }
            int length = awkwVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awkwVarArr[i] == awkwVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                awkwVarArr2 = new awkw[length - 1];
                System.arraycopy(awkwVarArr, 0, awkwVarArr2, 0, i);
                System.arraycopy(awkwVarArr, i + 1, awkwVarArr2, i, (length - i) - 1);
            }
        } while (!a.av(atomicReference, awkwVarArr, awkwVarArr2));
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        AtomicReference atomicReference;
        awkw[] awkwVarArr;
        awkw[] awkwVarArr2;
        awkw awkwVar = new awkw(axspVar, this);
        axspVar.e(awkwVar);
        do {
            atomicReference = this.d;
            awkwVarArr = (awkw[]) atomicReference.get();
            if (awkwVarArr == b) {
                Throwable th = this.e;
                if (th != null) {
                    axspVar.b(th);
                    return;
                } else {
                    axspVar.kn();
                    return;
                }
            }
            int length = awkwVarArr.length;
            awkwVarArr2 = new awkw[length + 1];
            System.arraycopy(awkwVarArr, 0, awkwVarArr2, 0, length);
            awkwVarArr2[length] = awkwVar;
        } while (!a.av(atomicReference, awkwVarArr, awkwVarArr2));
        if (awkwVar.get() == Long.MIN_VALUE) {
            aC(awkwVar);
        }
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        th.getClass();
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        Object obj2 = b;
        if (obj == obj2) {
            atqp.n(th);
            return;
        }
        this.e = th;
        for (awkw awkwVar : (awkw[]) atomicReference.getAndSet(obj2)) {
            if (awkwVar.get() != Long.MIN_VALUE) {
                awkwVar.a.b(th);
            } else {
                atqp.n(th);
            }
        }
    }

    @Override // defpackage.axsp
    public final void e(axsq axsqVar) {
        if (this.d.get() == b) {
            axsqVar.kj();
        } else {
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        obj.getClass();
        for (awkw awkwVar : (awkw[]) this.d.get()) {
            long j = awkwVar.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    awkwVar.a.kk(obj);
                    atqp.G(awkwVar, 1L);
                } else {
                    awkwVar.kj();
                    awkwVar.a.b(new avmx("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        Object obj2 = b;
        if (obj != obj2) {
            awkw[] awkwVarArr = (awkw[]) atomicReference.getAndSet(obj2);
            for (awkw awkwVar : awkwVarArr) {
                if (awkwVar.get() != Long.MIN_VALUE) {
                    awkwVar.a.kn();
                }
            }
        }
    }
}
