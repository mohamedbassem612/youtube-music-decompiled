package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyp implements avlw {
    final /* synthetic */ avlw a;
    final /* synthetic */ omj b;
    private final AtomicBoolean c = new AtomicBoolean();

    public nyp(omj omjVar, avlw avlwVar) {
        this.a = avlwVar;
        this.b = omjVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        this.a.d(avmnVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [avni, java.lang.Object] */
    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.c.compareAndSet(false, true)) {
            try {
                this.b.a.a(obj);
            } catch (Exception e) {
                throw new nud("Error happened with doOnFirst Action", e);
            }
        }
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
    }
}
