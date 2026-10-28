package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdv implements avlu {
    private final AtomicReference a;

    public awdv(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.avlu
    public final void ak(avlw avlwVar) {
        awdu awduVar;
        awdt awdtVar = new awdt(avlwVar);
        avlwVar.d(awdtVar);
        loop0: while (true) {
            AtomicReference atomicReference = this.a;
            awduVar = (awdu) atomicReference.get();
            if (awduVar == null || awduVar.f()) {
                awdu awduVar2 = new awdu(atomicReference);
                if (a.av(atomicReference, awduVar, awduVar2)) {
                    awduVar = awduVar2;
                } else {
                    continue;
                }
            }
            while (true) {
                AtomicReference atomicReference2 = awduVar.d;
                awdt[] awdtVarArr = (awdt[]) atomicReference2.get();
                if (awdtVarArr == awdu.b) {
                    break;
                }
                int length = awdtVarArr.length;
                awdt[] awdtVarArr2 = new awdt[length + 1];
                System.arraycopy(awdtVarArr, 0, awdtVarArr2, 0, length);
                awdtVarArr2[length] = awdtVar;
                if (a.av(atomicReference2, awdtVarArr, awdtVarArr2)) {
                    break loop0;
                }
            }
        }
        if (awdtVar.compareAndSet(null, awduVar)) {
            return;
        }
        awduVar.e(awdtVar);
    }
}
