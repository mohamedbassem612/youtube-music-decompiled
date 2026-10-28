package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfu extends AtomicReference implements avlw, avmn {
    private static final long serialVersionUID = -312246233408980075L;
    final avlw a;
    final avnf b;
    final AtomicReference c = new AtomicReference();
    final AtomicReference d = new AtomicReference();

    public awfu(avlw avlwVar, avnf avnfVar) {
        this.a = avlwVar;
        this.b = avnfVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        avnr.b(this.d);
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.c, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.c);
        avnr.b(this.d);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) this.c.get());
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object objA = this.b.a(obj, obj2);
                objA.getClass();
                this.a.kk(objA);
            } catch (Throwable th) {
                avkz.a(th);
                dispose();
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        avnr.b(this.d);
        this.a.kn();
    }
}
