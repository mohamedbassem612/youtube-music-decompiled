package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avvt implements axso {
    private final AtomicReference a;
    private final int b;

    public avvt(AtomicReference atomicReference, int i) {
        this.a = atomicReference;
        this.b = i;
    }

    @Override // defpackage.axso
    public final void aq(axsp axspVar) {
        avvv avvvVar;
        avvu avvuVar = new avvu(axspVar);
        axspVar.e(avvuVar);
        loop0: while (true) {
            AtomicReference atomicReference = this.a;
            avvvVar = (avvv) atomicReference.get();
            if (avvvVar == null || avvvVar.f()) {
                avvv avvvVar2 = new avvv(atomicReference, this.b);
                if (a.av(atomicReference, avvvVar, avvvVar2)) {
                    avvvVar = avvvVar2;
                } else {
                    continue;
                }
            }
            while (true) {
                AtomicReference atomicReference2 = avvvVar.e;
                avvu[] avvuVarArr = (avvu[]) atomicReference2.get();
                if (avvuVarArr == avvv.b) {
                    break;
                }
                int length = avvuVarArr.length;
                avvu[] avvuVarArr2 = new avvu[length + 1];
                System.arraycopy(avvuVarArr, 0, avvuVarArr2, 0, length);
                avvuVarArr2[length] = avvuVar;
                if (a.av(atomicReference2, avvuVarArr, avvuVarArr2)) {
                    break loop0;
                }
            }
        }
        if (avvuVar.get() == Long.MIN_VALUE) {
            avvvVar.g(avvuVar);
        } else {
            avvuVar.b = avvvVar;
        }
        avvvVar.d();
    }
}
