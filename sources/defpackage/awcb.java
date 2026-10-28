package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awcb implements avlw, avmn {
    final avmd a;
    final Object b;
    avmn c;
    long d;
    boolean e;

    public awcb(avmd avmdVar, Object obj) {
        this.a = avmdVar;
        this.b = obj;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.e) {
            atqp.n(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.dispose();
        this.a.ki(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.b;
        avmd avmdVar = this.a;
        if (obj != null) {
            avmdVar.ki(obj);
        } else {
            avmdVar.b(new NoSuchElementException());
        }
    }
}
