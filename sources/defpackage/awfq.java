package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awfq implements avlw, avmn {
    final avlw a;
    avmn b;
    Collection c;

    public awfq(avlw avlwVar, Collection collection) {
        this.a = avlwVar;
        this.c = collection;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.c = null;
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.c.add(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        Collection collection = this.c;
        this.c = null;
        avlw avlwVar = this.a;
        avlwVar.kk(collection);
        avlwVar.kn();
    }
}
