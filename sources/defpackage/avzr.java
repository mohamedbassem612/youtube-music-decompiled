package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avzr implements avmd {
    private final /* synthetic */ int $cid;
    final avmd a;
    final Object b;

    public avzr(avmd avmdVar, Object obj, int i) {
        this.$cid = i;
        this.a = avmdVar;
        this.b = obj;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            this.a.b(th);
            return;
        }
        if (i == 1) {
            this.a.b(th);
            return;
        }
        avmd avmdVar = this.a;
        if (i != 2) {
            avmdVar.b(th);
        } else {
            avmdVar.b(th);
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        if (i == 0) {
            avnr.d((AtomicReference) this.b, avmnVar);
            return;
        }
        if (i == 1) {
            avnr.g((AtomicReference) this.b, avmnVar);
        } else if (i != 2) {
            this.a.d(avmnVar);
        } else {
            avnr.g((AtomicReference) this.b, avmnVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avnn, java.lang.Object] */
    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            this.a.ki(obj);
            return;
        }
        if (i == 1) {
            this.a.ki(obj);
            return;
        }
        if (i == 2) {
            this.a.ki(obj);
            return;
        }
        try {
            Object objA = this.b.a(obj);
            objA.getClass();
            this.a.ki(objA);
        } catch (Throwable th) {
            avkz.a(th);
            b(th);
        }
    }

    public avzr(AtomicReference atomicReference, avmd avmdVar, int i) {
        this.$cid = i;
        this.b = atomicReference;
        this.a = avmdVar;
    }
}
