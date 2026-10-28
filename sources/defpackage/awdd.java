package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awdd implements avlw, avmn {
    private final /* synthetic */ int $cid;
    avmn a;
    final Object b;

    public awdd(Object obj, int i) {
        this.$cid = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avlc, avlw, java.lang.Object] */
    @Override // defpackage.avlw
    public final void b(Throwable th) {
        int i = this.$cid;
        ?? r1 = this.b;
        if (i != 0) {
            r1.b(th);
        } else {
            r1.b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [avlc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [avlw, java.lang.Object] */
    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (this.$cid == 0) {
            this.a = avmnVar;
            this.b.d(this);
        } else if (avnr.e(this.a, avmnVar)) {
            this.a = avmnVar;
            this.b.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        int i = this.$cid;
        avmn avmnVar = this.a;
        if (i != 0) {
            avmnVar.dispose();
        } else {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        int i = this.$cid;
        avmn avmnVar = this.a;
        return i != 0 ? avmnVar.f() : avmnVar.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avlw, java.lang.Object] */
    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.$cid != 0) {
            this.b.kk(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avlc, avlw, java.lang.Object] */
    @Override // defpackage.avlw
    public final void kn() {
        int i = this.$cid;
        ?? r1 = this.b;
        if (i != 0) {
            r1.kn();
        } else {
            r1.kn();
        }
    }
}
