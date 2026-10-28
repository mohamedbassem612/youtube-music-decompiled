package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avwh implements axso {
    private final AtomicReference a;

    public avwh(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.axso
    public final void aq(axsp axspVar) {
        avwi avwiVar;
        AtomicReference atomicReference;
        avwe[] avweVarArr;
        avwe[] avweVarArr2;
        while (true) {
            AtomicReference atomicReference2 = this.a;
            avwiVar = (avwi) atomicReference2.get();
            if (avwiVar != null) {
                break;
            }
            try {
                avwi avwiVar2 = new avwi(new avwj());
                if (a.ap(atomicReference2, avwiVar2)) {
                    avwiVar = avwiVar2;
                    break;
                }
            } catch (Throwable th) {
                avkz.a(th);
                awjx.f(th, axspVar);
                return;
            }
        }
        avwe avweVar = new avwe(avwiVar, axspVar);
        axspVar.e(avweVar);
        do {
            atomicReference = avwiVar.d;
            avweVarArr = (avwe[]) atomicReference.get();
            if (avweVarArr == avwi.b) {
                break;
            }
            int length = avweVarArr.length;
            avweVarArr2 = new avwe[length + 1];
            System.arraycopy(avweVarArr, 0, avweVarArr2, 0, length);
            avweVarArr2[length] = avweVar;
        } while (!a.av(atomicReference, avweVarArr, avweVarArr2));
        if (avweVar.f()) {
            avwiVar.g(avweVar);
        } else {
            avwiVar.d();
            avwiVar.i.b(avweVar);
        }
    }
}
