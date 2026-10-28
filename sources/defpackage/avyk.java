package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avyk implements avln, avmn {
    private final /* synthetic */ int $cid;
    avmn a;
    final Object b;
    final Object c;

    public avyk(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [avno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [avmd, java.lang.Object] */
    @Override // defpackage.avln
    public final void b(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            this.b.b(th);
            return;
        }
        if (i == 1) {
            this.b.b(th);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.a = avnr.DISPOSED;
                this.b.b(th);
                return;
            }
            try {
                this.b.ki(((avog) this.c).a);
                return;
            } catch (Throwable th2) {
                avkz.a(th2);
                this.b.b(new avmw(th, th2));
                return;
            }
        }
        try {
            boolean zA = this.c.a(th);
            ?? r5 = this.b;
            if (zA) {
                r5.kn();
            } else {
                r5.b(th);
            }
        } catch (Throwable th3) {
            avkz.a(th3);
            this.b.b(new avmw(th, th3));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [avmd, java.lang.Object] */
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
        if (i == 1) {
            if (avnr.e(this.a, avmnVar)) {
                this.a = avmnVar;
                this.b.d(this);
                return;
            }
            return;
        }
        if (i == 2) {
            if (avnr.e(this.a, avmnVar)) {
                this.a = avmnVar;
                this.b.d(this);
                return;
            }
            return;
        }
        avmn avmnVar2 = this.a;
        if (i != 3) {
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
            avmn avmnVar = this.a;
            this.a = avnr.DISPOSED;
            avmnVar.dispose();
        } else {
            if (i == 1) {
                this.a.dispose();
                return;
            }
            if (i == 2) {
                this.a.dispose();
                return;
            }
            avmn avmnVar2 = this.a;
            if (i == 3) {
                avmnVar2.dispose();
            } else {
                avmnVar2.dispose();
                this.a = avnr.DISPOSED;
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.f();
        }
        if (i == 1) {
            return this.a.f();
        }
        if (i == 2) {
            return this.a.f();
        }
        avmn avmnVar = this.a;
        return i != 3 ? avmnVar.f() : avmnVar.f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [avni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [avmd, java.lang.Object] */
    @Override // defpackage.avln
    public final void ki(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            try {
                boolean zA = this.c.a(obj);
                ?? r2 = this.b;
                if (zA) {
                    r2.ki(obj);
                    return;
                } else {
                    r2.kn();
                    return;
                }
            } catch (Throwable th) {
                avkz.a(th);
                this.b.b(th);
                return;
            }
        }
        if (i == 1) {
            this.b.ki(obj);
            try {
                this.c.a(obj);
                return;
            } catch (Throwable th2) {
                avkz.a(th2);
                atqp.n(th2);
                return;
            }
        }
        if (i == 2) {
            this.b.ki(obj);
        } else if (i == 3) {
            this.b.ki(obj);
        } else {
            this.a = avnr.DISPOSED;
            this.b.ki(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [avmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [avln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [avln, java.lang.Object] */
    @Override // defpackage.avln
    public final void kn() {
        int i = this.$cid;
        if (i == 0) {
            this.b.kn();
            return;
        }
        if (i == 1) {
            this.b.kn();
            return;
        }
        if (i == 2) {
            this.b.kn();
        } else if (i == 3) {
            this.b.kn();
        } else {
            this.a = avnr.DISPOSED;
            this.b.ki(this.c);
        }
    }
}
