package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avvz extends avnb implements avnu {
    final axso b;
    final int c;
    final AtomicReference d = new AtomicReference();

    public avvz(axso axsoVar, int i) {
        this.b = axsoVar;
        this.c = i;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        avvy avvyVar;
        AtomicReference atomicReference;
        avvx[] avvxVarArr;
        avvx[] avvxVarArr2;
        while (true) {
            AtomicReference atomicReference2 = this.d;
            avvyVar = (avvy) atomicReference2.get();
            if (avvyVar != null) {
                break;
            }
            avvy avvyVar2 = new avvy(atomicReference2, this.c);
            if (a.av(atomicReference2, null, avvyVar2)) {
                avvyVar = avvyVar2;
                break;
            }
        }
        avvx avvxVar = new avvx(axspVar, avvyVar);
        axspVar.e(avvxVar);
        do {
            atomicReference = avvyVar.f;
            avvxVarArr = (avvx[]) atomicReference.get();
            if (avvxVarArr == avvy.b) {
                Throwable th = avvyVar.k;
                if (th != null) {
                    axspVar.b(th);
                    return;
                } else {
                    axspVar.kn();
                    return;
                }
            }
            int length = avvxVarArr.length;
            avvxVarArr2 = new avvx[length + 1];
            System.arraycopy(avvxVarArr, 0, avvxVarArr2, 0, length);
            avvxVarArr2[length] = avvxVar;
        } while (!a.av(atomicReference, avvxVarArr, avvxVarArr2));
        if (avvxVar.a()) {
            avvyVar.g(avvxVar);
        } else {
            avvyVar.d();
        }
    }

    @Override // defpackage.avnb
    public final void e(avni avniVar) {
        avvy avvyVar;
        while (true) {
            AtomicReference atomicReference = this.d;
            avvyVar = (avvy) atomicReference.get();
            if (avvyVar != null && !avvyVar.f()) {
                break;
            }
            avvy avvyVar2 = new avvy(atomicReference, this.c);
            if (a.av(atomicReference, avvyVar, avvyVar2)) {
                avvyVar = avvyVar2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = avvyVar.e;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            avniVar.a(avvyVar);
            if (z) {
                this.b.aq(avvyVar);
            }
        } catch (Throwable th) {
            avkz.a(th);
            throw awkh.b(th);
        }
    }

    @Override // defpackage.avnu
    public final void kr(avmn avmnVar) {
        a.av(this.d, (avvy) avmnVar, null);
    }
}
