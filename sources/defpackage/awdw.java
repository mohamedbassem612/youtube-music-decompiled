package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdw extends awko {
    public final avlu a;
    final AtomicReference b;
    final avlu c;

    public awdw(avlu avluVar, avlu avluVar2, AtomicReference atomicReference) {
        this.c = avluVar;
        this.a = avluVar2;
        this.b = atomicReference;
    }

    @Override // defpackage.awko
    public final void a(avni avniVar) {
        awdu awduVar;
        while (true) {
            AtomicReference atomicReference = this.b;
            awduVar = (awdu) atomicReference.get();
            if (awduVar != null && !awduVar.f()) {
                break;
            }
            awdu awduVar2 = new awdu(atomicReference);
            if (a.av(atomicReference, awduVar, awduVar2)) {
                awduVar = awduVar2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = awduVar.e;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            avniVar.a(awduVar);
            if (z) {
                this.a.ak(awduVar);
            }
        } catch (Throwable th) {
            avkz.a(th);
            throw awkh.b(th);
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        this.c.ak(avlwVar);
    }
}
