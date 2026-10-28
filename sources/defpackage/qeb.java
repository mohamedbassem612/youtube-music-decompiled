package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qeb {
    public qec a;
    public qdx b;
    public final qea c = new qea();

    public qeb(kjc kjcVar, qej qejVar, awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        int i = 19;
        agfr agfrVarAl = aguu.al(new pwe(awmdVar, i));
        awmdVar2.getClass();
        agfr agfrVarAl2 = aguu.al(new pwe(awmdVar2, i));
        if (!((Boolean) agfrVarAl2.io()).booleanValue()) {
            d(kjcVar, agfrVarAl, agfrVarAl2);
            c(qejVar, agfrVarAl, agfrVarAl2);
        } else if (((Boolean) agfrVarAl.io()).booleanValue()) {
            c(qejVar, agfrVarAl, agfrVarAl2);
        } else {
            d(kjcVar, agfrVarAl, agfrVarAl2);
        }
    }

    private final void c(qej qejVar, agfr agfrVar, agfr agfrVar2) {
        this.b = new qdx(new qdz(this, agfrVar2, agfrVar, qejVar, 0));
        qejVar.g.add(this.b);
    }

    private final void d(kjc kjcVar, agfr agfrVar, agfr agfrVar2) {
        qec qecVar = new qec(new qdz(this, agfrVar2, agfrVar, kjcVar, 1));
        this.a = qecVar;
        kjcVar.E(qecVar);
    }

    public final void a(qdy qdyVar) {
        this.c.b.add(qdyVar);
    }

    public final void b(qdy qdyVar) {
        this.c.b.remove(qdyVar);
    }
}
