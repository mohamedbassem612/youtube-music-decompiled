package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awbx implements avlw, avmn {
    final avlw a;
    final Object b;
    final boolean c;
    avmn d;
    long e;
    boolean f;

    public awbx(avlw avlwVar, Object obj, boolean z) {
        this.a = avlwVar;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.f) {
            atqp.n(th);
        } else {
            this.f = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.d, avmnVar)) {
            this.d = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.d.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e;
        if (j != 0) {
            this.e = j + 1;
            return;
        }
        this.f = true;
        this.d.dispose();
        avlw avlwVar = this.a;
        avlwVar.kk(obj);
        avlwVar.kn();
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.f) {
            return;
        }
        this.f = true;
        Object obj = this.b;
        if (obj != null) {
            this.a.kk(obj);
        } else if (this.c) {
            this.a.b(new NoSuchElementException());
            return;
        }
        this.a.kn();
    }
}
