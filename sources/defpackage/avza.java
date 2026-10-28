package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avza implements avln, avmn {
    private final /* synthetic */ int $cid;
    avmn a;
    final Object b;

    public avza(Object obj, int i) {
        this.$cid = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [avmd, java.lang.Object] */
    @Override // defpackage.avln
    public final void b(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            this.b.b(th);
        } else if (i != 1) {
            this.a = avnr.DISPOSED;
            this.b.b(th);
        } else {
            this.a = avnr.DISPOSED;
            this.b.b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [avmd, java.lang.Object] */
    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        if (i == 0) {
            if (avnr.e(this.a, avmnVar)) {
                this.a = avmnVar;
                this.b.d(this);
                return;
            }
            return;
        }
        avmn avmnVar2 = this.a;
        if (i != 1) {
            if (avnr.e(avmnVar2, avmnVar)) {
                this.a = avmnVar;
                this.b.d(this);
                return;
            }
            return;
        }
        if (avnr.e(avmnVar2, avmnVar)) {
            this.a = avmnVar;
            this.b.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        int i = this.$cid;
        if (i == 0) {
            this.a.dispose();
            return;
        }
        avmn avmnVar = this.a;
        if (i != 1) {
            avmnVar.dispose();
            this.a = avnr.DISPOSED;
        } else {
            avmnVar.dispose();
            this.a = avnr.DISPOSED;
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.f();
        }
        avmn avmnVar = this.a;
        return i != 1 ? avmnVar.f() : avmnVar.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [avmd, java.lang.Object] */
    @Override // defpackage.avln
    public final void ki(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            this.b.ki(Boolean.FALSE);
        } else if (i != 1) {
            this.a = avnr.DISPOSED;
            this.b.ki(Boolean.FALSE);
        } else {
            this.a = avnr.DISPOSED;
            this.b.kn();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [avmd, java.lang.Object] */
    @Override // defpackage.avln
    public final void kn() {
        int i = this.$cid;
        if (i == 0) {
            this.b.ki(Boolean.TRUE);
        } else if (i != 1) {
            this.a = avnr.DISPOSED;
            this.b.ki(Boolean.TRUE);
        } else {
            this.a = avnr.DISPOSED;
            this.b.kn();
        }
    }
}
