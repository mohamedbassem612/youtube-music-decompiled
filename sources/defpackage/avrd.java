package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avrd implements avlc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private final Object b;

    public avrd(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [avlc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [avlc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [avmd, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (this.$cid == 0) {
            this.b.b(th);
            return;
        }
        try {
            boolean zA = ((avqo) this.a).b.a(th);
            ?? r4 = this.b;
            if (zA) {
                r4.kn();
            } else {
                r4.b(th);
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            this.b.b(new avmw(th, th2));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avlc, avmd, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        ?? r1 = this.b;
        if (i != 0) {
            r1.d(avmnVar);
        } else {
            r1.d(avmnVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [avmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [avlc, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (this.$cid != 0) {
            this.b.kn();
        } else {
            this.b.ki(((avre) this.a).b);
        }
    }
}
