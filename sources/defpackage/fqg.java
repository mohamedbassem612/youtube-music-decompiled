package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fqg implements fjl, fjj {
    public final fjm a;
    final /* synthetic */ fqh b;

    public fqg(fqh fqhVar) {
        this.b = fqhVar;
        fqhVar.a.b(this);
        this.a = new fjm();
    }

    @Override // defpackage.fjl
    public final fjk a() {
        return this.a.a;
    }

    @Override // defpackage.fjl
    public final synchronized void b(fjj fjjVar) {
        this.a.b(fjjVar);
    }

    @Override // defpackage.fjl
    public final synchronized void c(fjj fjjVar) {
        this.a.c(fjjVar);
    }

    public final void d(fjk fjkVar) {
        gzj.aS();
        this.a.d(fjkVar);
        if (fjkVar == fjk.DESTROYED) {
            fqh fqhVar = this.b;
            fqhVar.a.c(this);
            fqhVar.d = null;
            fqhVar.c = false;
        }
    }

    @Override // defpackage.fjj
    public final void s(fjk fjkVar) {
        int iOrdinal = fjkVar.ordinal();
        if (iOrdinal == 0) {
            d(fjk.HINT_VISIBLE);
        } else if (iOrdinal == 1) {
            d(fjk.HINT_INVISIBLE);
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException("Illegal state: ".concat(fjkVar.d));
            }
            d(fjk.DESTROYED);
        }
    }
}
