package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avyb extends avlm implements avln {
    static final avya[] a = new avya[0];
    static final avya[] b = new avya[0];
    final AtomicReference c;
    final AtomicReference d = new AtomicReference(a);
    Object e;
    Throwable f;

    public avyb(avlp avlpVar) {
        this.c = new AtomicReference(avlpVar);
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        AtomicReference atomicReference;
        avya[] avyaVarArr;
        avya[] avyaVarArr2;
        avya avyaVar = new avya(avlnVar, this);
        avlnVar.d(avyaVar);
        do {
            atomicReference = this.d;
            avyaVarArr = (avya[]) atomicReference.get();
            if (avyaVarArr == b) {
                if (avyaVar.f()) {
                    return;
                }
                Throwable th = this.f;
                if (th != null) {
                    avlnVar.b(th);
                    return;
                }
                Object obj = this.e;
                if (obj != null) {
                    avlnVar.ki(obj);
                    return;
                } else {
                    avlnVar.kn();
                    return;
                }
            }
            int length = avyaVarArr.length;
            avyaVarArr2 = new avya[length + 1];
            System.arraycopy(avyaVarArr, 0, avyaVarArr2, 0, length);
            avyaVarArr2[length] = avyaVar;
        } while (!a.av(atomicReference, avyaVarArr, avyaVarArr2));
        if (avyaVar.f()) {
            I(avyaVar);
            return;
        }
        avlp avlpVar = (avlp) this.c.getAndSet(null);
        if (avlpVar != null) {
            avlpVar.F(this);
        }
    }

    final void I(avya avyaVar) {
        AtomicReference atomicReference;
        avya[] avyaVarArr;
        avya[] avyaVarArr2;
        do {
            atomicReference = this.d;
            avyaVarArr = (avya[]) atomicReference.get();
            int length = avyaVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (avyaVarArr[i] == avyaVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                avyaVarArr2 = a;
            } else {
                avya[] avyaVarArr3 = new avya[length - 1];
                System.arraycopy(avyaVarArr, 0, avyaVarArr3, 0, i);
                System.arraycopy(avyaVarArr, i + 1, avyaVarArr3, i, (length - i) - 1);
                avyaVarArr2 = avyaVarArr3;
            }
        } while (!a.av(atomicReference, avyaVarArr, avyaVarArr2));
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.f = th;
        for (avya avyaVar : (avya[]) this.d.getAndSet(b)) {
            if (!avyaVar.f()) {
                avyaVar.a.b(th);
            }
        }
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        this.e = obj;
        for (avya avyaVar : (avya[]) this.d.getAndSet(b)) {
            if (!avyaVar.f()) {
                avyaVar.a.ki(obj);
            }
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        for (avya avyaVar : (avya[]) this.d.getAndSet(b)) {
            if (!avyaVar.f()) {
                avyaVar.a.kn();
            }
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
    }
}
