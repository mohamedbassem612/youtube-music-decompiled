package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awdl implements avlw, avmn {
    private final /* synthetic */ int $cid;
    final avlw a;
    avmn b;

    public awdl(avlw avlwVar, int i) {
        this.$cid = i;
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.$cid != 0) {
            this.a.b(th);
            return;
        }
        avlq avlqVarA = avlq.a(th);
        avlw avlwVar = this.a;
        avlwVar.kk(avlqVarA);
        avlwVar.kn();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (this.$cid != 0) {
            this.b = avmnVar;
            this.a.d(this);
        } else if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        int i = this.$cid;
        avmn avmnVar = this.b;
        if (i != 0) {
            avmnVar.dispose();
        } else {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        int i = this.$cid;
        avmn avmnVar = this.b;
        return i != 0 ? avmnVar.f() : avmnVar.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.$cid == 0) {
            this.a.kk(avlq.b(obj));
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        int i = this.$cid;
        avlw avlwVar = this.a;
        if (i != 0) {
            avlwVar.kn();
        } else {
            avlwVar.kk(avlq.a);
            avlwVar.kn();
        }
    }
}
