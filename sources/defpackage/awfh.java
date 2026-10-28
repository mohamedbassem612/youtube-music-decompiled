package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfh implements avlw, avmn {
    private final /* synthetic */ int $cid;
    final avlw a;
    final avno b;
    avmn c;
    boolean d;

    public awfh(avlw avlwVar, avno avnoVar, int i) {
        this.$cid = i;
        this.a = avlwVar;
        this.b = avnoVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.$cid != 0) {
            this.a.b(th);
        } else if (this.d) {
            atqp.n(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        avmn avmnVar2 = this.c;
        if (i != 0) {
            if (avnr.e(avmnVar2, avmnVar)) {
                this.c = avmnVar;
                this.a.d(this);
                return;
            }
            return;
        }
        if (avnr.e(avmnVar2, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        int i = this.$cid;
        avmn avmnVar = this.c;
        if (i != 0) {
            avmnVar.dispose();
        } else {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        int i = this.$cid;
        avmn avmnVar = this.c;
        return i != 0 ? avmnVar.f() : avmnVar.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        int i = this.$cid;
        boolean z = this.d;
        if (i != 0) {
            if (z) {
                this.a.kk(obj);
                return;
            }
            try {
                if (this.b.a(obj)) {
                    return;
                }
                this.d = true;
                this.a.kk(obj);
                return;
            } catch (Throwable th) {
                avkz.a(th);
                this.c.dispose();
                this.a.b(th);
                return;
            }
        }
        if (z) {
            return;
        }
        this.a.kk(obj);
        try {
            if (this.b.a(obj)) {
                this.d = true;
                this.c.dispose();
                this.a.kn();
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            this.c.dispose();
            b(th2);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.$cid != 0) {
            this.a.kn();
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.kn();
        }
    }
}
