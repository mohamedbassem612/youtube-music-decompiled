package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrb extends avow implements avlc {
    final avlw a;
    avmn b;

    public avrb(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avot
    public final boolean i() {
        return true;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 2;
    }

    @Override // defpackage.avot
    public final /* bridge */ /* synthetic */ Object km() {
        return null;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
    }

    @Override // defpackage.avot
    public final void c() {
    }
}
