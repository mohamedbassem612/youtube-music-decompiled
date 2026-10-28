package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awho implements avmd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ avmc a;
    private final avmd b;

    public awho(avmc avmcVar, avmd avmdVar, int i) {
        this.$cid = i;
        this.a = avmcVar;
        this.b = avmdVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        Object objA;
        if (this.$cid != 0) {
            try {
                ((awgt) this.a).b.a(th);
            } catch (Throwable th2) {
                avkz.a(th2);
                th = new avmw(th, th2);
            }
            this.b.b(th);
            return;
        }
        avnn avnnVar = ((awhp) this.a).b;
        if (avnnVar != null) {
            try {
                objA = avnnVar.a(th);
            } catch (Throwable th3) {
                avkz.a(th3);
                this.b.b(new avmw(th, th3));
                return;
            }
        } else {
            objA = ((awhp) this.a).c;
        }
        if (objA != null) {
            this.b.ki(objA);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
        nullPointerException.initCause(th);
        this.b.b(nullPointerException);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        avmd avmdVar = this.b;
        if (i != 0) {
            avmdVar.d(avmnVar);
        } else {
            avmdVar.d(avmnVar);
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        int i = this.$cid;
        avmd avmdVar = this.b;
        if (i != 0) {
            avmdVar.ki(obj);
        } else {
            avmdVar.ki(obj);
        }
    }
}
