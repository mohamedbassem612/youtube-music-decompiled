package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awhd implements avln {
    private final /* synthetic */ int $cid;
    final AtomicReference a;
    final avln b;

    public awhd(AtomicReference atomicReference, avln avlnVar, int i) {
        this.$cid = i;
        this.a = atomicReference;
        this.b = avlnVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        int i = this.$cid;
        avln avlnVar = this.b;
        if (i != 0) {
            avlnVar.b(th);
        } else {
            avlnVar.b(th);
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        AtomicReference atomicReference = this.a;
        if (i != 0) {
            avnr.g(atomicReference, avmnVar);
        } else {
            avnr.g(atomicReference, avmnVar);
        }
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        int i = this.$cid;
        avln avlnVar = this.b;
        if (i != 0) {
            avlnVar.ki(obj);
        } else {
            avlnVar.ki(obj);
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        int i = this.$cid;
        avln avlnVar = this.b;
        if (i != 0) {
            avlnVar.kn();
        } else {
            avlnVar.kn();
        }
    }
}
