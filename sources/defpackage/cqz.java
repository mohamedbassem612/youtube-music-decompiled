package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cqz {
    private cqy a;
    public crd g;

    public bts d() {
        return bts.a;
    }

    public void f(cqy cqyVar, crd crdVar) {
        if (this.a != null) {
            throw new IllegalStateException();
        }
        this.a = cqyVar;
        this.g = crdVar;
    }

    public void i() {
        this.a = null;
        this.g = null;
    }

    public boolean l() {
        return false;
    }

    public cqr m() {
        return null;
    }

    public abstract void p(Object obj);

    public abstract pob q(cdq[] cdqVarArr, coy coyVar, cnm cnmVar, btn btnVar);

    public final void r(bts btsVar) {
        cqy cqyVar = this.a;
        if (cqyVar != null) {
            ((ccs) cqyVar).e.k(10, btsVar).p();
        }
    }

    public void h(bts btsVar) {
    }

    public void j(brq brqVar) {
    }

    public void k(bts btsVar) {
    }
}
