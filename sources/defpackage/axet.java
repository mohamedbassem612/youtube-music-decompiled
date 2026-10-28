package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axet implements avlw {
    final /* synthetic */ awyp a;
    final /* synthetic */ AtomicReference b;

    public axet(awyp awypVar, AtomicReference atomicReference) {
        this.a = awypVar;
        this.b = atomicReference;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.u(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (a.ap(this.b, avmnVar)) {
            return;
        }
        avmnVar.dispose();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        try {
            awyp awypVar = this.a;
            Object objJ = awypVar.j(obj);
            if (objJ instanceof awyh) {
                Object obj2 = ((awyi) awqx.l(awov.a, new uzq(awypVar, obj, (awoq) null, 3))).b;
            }
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.u(null);
    }
}
