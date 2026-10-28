package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avze implements avln, avmn {
    final avln a;
    final avnn b;
    avmn c;

    public avze(avln avlnVar, avnn avnnVar) {
        this.a = avlnVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avmn avmnVar = this.c;
        this.c = avnr.DISPOSED;
        avmnVar.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        try {
            Object objA = this.b.a(obj);
            objA.getClass();
            this.a.ki(objA);
        } catch (Throwable th) {
            avkz.a(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
