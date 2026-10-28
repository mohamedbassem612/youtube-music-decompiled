package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awhh implements avmd, avmn {
    private final /* synthetic */ int $cid;
    avmn a;
    final Object b;

    public awhh(Object obj, int i) {
        this.$cid = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [avln, java.lang.Object] */
    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (this.$cid == 0) {
            this.b.b(th);
        } else {
            this.a = avnr.DISPOSED;
            this.b.b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [avmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [avln, java.lang.Object] */
    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        avmn avmnVar2 = this.a;
        if (i != 0) {
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
        avmn avmnVar = this.a;
        if (i == 0) {
            avmnVar.dispose();
        } else {
            avmnVar.dispose();
            this.a = avnr.DISPOSED;
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        int i = this.$cid;
        avmn avmnVar = this.a;
        return i != 0 ? avmnVar.f() : avmnVar.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [avln, java.lang.Object] */
    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        if (this.$cid == 0) {
            this.b.ki(obj);
        } else {
            this.a = avnr.DISPOSED;
            this.b.ki(obj);
        }
    }
}
