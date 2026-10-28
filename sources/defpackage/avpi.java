package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpi extends avlb {
    private final avle[] a;

    public avpi(avle[] avleVarArr) {
        this.a = avleVarArr;
    }

    @Override // defpackage.avlb
    public final void H(avlc avlcVar) {
        avmm avmmVar = new avmm();
        avlcVar.d(avmmVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int i = 0;
        while (true) {
            avle[] avleVarArr = this.a;
            if (i >= avleVarArr.length) {
                return;
            }
            avle avleVar = avleVarArr[i];
            if (avmmVar.b) {
                return;
            }
            if (avleVar == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    atqp.n(nullPointerException);
                    return;
                } else {
                    avmmVar.dispose();
                    avlcVar.b(nullPointerException);
                    return;
                }
            }
            avleVar.kp(new avph(atomicBoolean, avmmVar, avlcVar));
            i++;
        }
    }
}
