package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfs implements avlw, avmn {
    final avmd a;
    Collection b;
    avmn c;

    public awfs(avmd avmdVar, Collection collection) {
        this.a = avmdVar;
        this.b = collection;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.b = null;
        this.a.b(th);
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
        this.b.add(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        Collection collection = this.b;
        this.b = null;
        this.a.ki(collection);
    }
}
