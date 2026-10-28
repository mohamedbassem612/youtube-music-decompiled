package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpf extends AtomicReference implements avlw, avmn {
    private static final long serialVersionUID = -7251123623727029452L;
    final avni a;
    final avni b;
    final avnd c;
    final avni d;

    public avpf(avni avniVar, avni avniVar2, avnd avndVar, avni avniVar3) {
        this.a = avniVar;
        this.b = avniVar2;
        this.c = avndVar;
        this.d = avniVar3;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (f()) {
            atqp.n(th);
            return;
        }
        lazySet(avnr.DISPOSED);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            atqp.n(new avmw(th, th2));
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            try {
                this.d.a(this);
            } catch (Throwable th) {
                avkz.a(th);
                avmnVar.dispose();
                b(th);
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == avnr.DISPOSED;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (f()) {
            return;
        }
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            avkz.a(th);
            ((avmn) get()).dispose();
            b(th);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (f()) {
            return;
        }
        lazySet(avnr.DISPOSED);
        try {
            this.c.a();
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
        }
    }
}
