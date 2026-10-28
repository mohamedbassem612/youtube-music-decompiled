package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awej implements avlu {
    private final AtomicReference a;
    private final awee b;

    public awej(AtomicReference atomicReference, awee aweeVar) {
        this.a = atomicReference;
        this.b = aweeVar;
    }

    @Override // defpackage.avlu
    public final void ak(avlw avlwVar) {
        awei aweiVar;
        AtomicReference atomicReference;
        awef[] awefVarArr;
        awef[] awefVarArr2;
        while (true) {
            AtomicReference atomicReference2 = this.a;
            aweiVar = (awei) atomicReference2.get();
            if (aweiVar != null) {
                break;
            }
            awei aweiVar2 = new awei(this.b.a());
            if (a.ap(atomicReference2, aweiVar2)) {
                aweiVar = aweiVar2;
                break;
            }
        }
        awef awefVar = new awef(aweiVar, avlwVar);
        avlwVar.d(awefVar);
        do {
            atomicReference = aweiVar.e;
            awefVarArr = (awef[]) atomicReference.get();
            if (awefVarArr == awei.b) {
                break;
            }
            int length = awefVarArr.length;
            awefVarArr2 = new awef[length + 1];
            System.arraycopy(awefVarArr, 0, awefVarArr2, 0, length);
            awefVarArr2[length] = awefVar;
        } while (!a.av(atomicReference, awefVarArr, awefVarArr2));
        if (awefVar.d) {
            aweiVar.e(awefVar);
        } else {
            aweiVar.c.e(awefVar);
        }
    }
}
