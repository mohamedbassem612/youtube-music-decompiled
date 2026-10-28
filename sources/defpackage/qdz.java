package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qdz implements qdy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ agfr a;
    final /* synthetic */ agfr b;
    final /* synthetic */ qeb c;
    final /* synthetic */ Object d;

    public qdz(qeb qebVar, agfr agfrVar, agfr agfrVar2, Object obj, int i) {
        this.$cid = i;
        this.a = agfrVar;
        this.b = agfrVar2;
        this.d = obj;
        this.c = qebVar;
    }

    private final void a() {
        qeb qebVar = this.c;
        qdx qdxVar = qebVar.b;
        if (qdxVar != null) {
            ((qej) this.d).g.remove(qdxVar);
            qebVar.b = null;
        }
    }

    private final void b() {
        qeb qebVar = this.c;
        qec qecVar = qebVar.a;
        if (qecVar != null) {
            ((kjc) this.d).F(qecVar);
            qebVar.a = null;
        }
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        int i = this.$cid;
        agfr agfrVar = this.a;
        if (i != 0) {
            if (((Boolean) agfrVar.io()).booleanValue()) {
                this.c.c.k(qciVar);
                return;
            } else if (((Boolean) this.b.io()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(qciVar);
                return;
            }
        }
        if (((Boolean) agfrVar.io()).booleanValue()) {
            this.c.c.k(qciVar);
        } else if (((Boolean) this.b.io()).booleanValue()) {
            this.c.c.k(qciVar);
        } else {
            a();
        }
    }

    @Override // defpackage.qdy
    public final void j(qci qciVar) {
        int i = this.$cid;
        agfr agfrVar = this.a;
        if (i != 0) {
            if (((Boolean) agfrVar.io()).booleanValue()) {
                this.c.c.l(qciVar);
                return;
            } else if (((Boolean) this.b.io()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(qciVar);
                return;
            }
        }
        if (((Boolean) agfrVar.io()).booleanValue()) {
            this.c.c.l(qciVar);
        } else if (((Boolean) this.b.io()).booleanValue()) {
            this.c.c.l(qciVar);
        } else {
            a();
        }
    }
}
