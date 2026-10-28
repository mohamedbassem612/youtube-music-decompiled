package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdz extends awko implements avnu {
    final avlu a;
    final AtomicReference b = new AtomicReference();

    public awdz(avlu avluVar) {
        this.a = avluVar;
    }

    @Override // defpackage.awko
    public final void a(avni avniVar) {
        awdy awdyVar;
        while (true) {
            AtomicReference atomicReference = this.b;
            awdyVar = (awdy) atomicReference.get();
            if (awdyVar != null && !awdyVar.f()) {
                break;
            }
            awdy awdyVar2 = new awdy(atomicReference);
            if (a.av(atomicReference, awdyVar, awdyVar2)) {
                awdyVar = awdyVar2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = awdyVar.c;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            avniVar.a(awdyVar);
            if (z) {
                this.a.ak(awdyVar);
            }
        } catch (Throwable th) {
            avkz.a(th);
            throw awkh.b(th);
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        AtomicReference atomicReference;
        awdy awdyVar;
        awdx[] awdxVarArr;
        awdx[] awdxVarArr2;
        do {
            atomicReference = this.b;
            awdyVar = (awdy) atomicReference.get();
            if (awdyVar != null) {
                break;
            } else {
                awdyVar = new awdy(atomicReference);
            }
        } while (!a.av(atomicReference, null, awdyVar));
        awdx awdxVar = new awdx(avlwVar, awdyVar);
        avlwVar.d(awdxVar);
        do {
            awdxVarArr = (awdx[]) awdyVar.get();
            if (awdxVarArr == awdy.b) {
                Throwable th = awdyVar.f;
                if (th != null) {
                    avlwVar.b(th);
                    return;
                } else {
                    avlwVar.kn();
                    return;
                }
            }
            int length = awdxVarArr.length;
            awdxVarArr2 = new awdx[length + 1];
            System.arraycopy(awdxVarArr, 0, awdxVarArr2, 0, length);
            awdxVarArr2[length] = awdxVar;
        } while (!awdyVar.compareAndSet(awdxVarArr, awdxVarArr2));
        if (awdxVar.f()) {
            awdyVar.e(awdxVar);
        }
    }

    @Override // defpackage.avnu
    public final void kr(avmn avmnVar) {
        a.av(this.b, (awdy) avmnVar, null);
    }
}
