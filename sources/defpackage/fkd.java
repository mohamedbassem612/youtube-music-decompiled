package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkd extends fji {
    public fji n;

    public fkd(fjd fjdVar, fhd fhdVar, fkc fkcVar, fwo fwoVar, fji fjiVar) {
        super(fjdVar, fhdVar, fkcVar, fwoVar, fjiVar);
    }

    @Override // defpackage.fji
    public final void n(int i, int i2, fkw fkwVar) {
        fhd fhdVarF;
        fjq fjqVar = this.c;
        fjd fjdVar = this.a;
        boolean zBm = gzj.bm();
        fjc fjcVar = fjdVar.b;
        fgy fgyVarE = fjqVar.e();
        if (fjcVar == null) {
            throw new IllegalStateException(fgyVarE.c().concat(": To measure a component outside of a layout calculation use Component#measureMightNotCacheInternalNode."));
        }
        if (fjqVar.b() == 1) {
            fji fjiVar = this.f;
            fhdVarF = fjiVar != null ? fjiVar.l().g() : fjcVar.b;
        } else {
            fhdVarF = fjqVar.f(1);
        }
        if (zBm) {
            fgyVarE.c();
            boolean z = fna.a;
        }
        try {
            fji fjiVarBb = gzj.bb(fjdVar, fhdVarF, this, i, i2);
            fkwVar.a = fjiVarBb != null ? fjiVarBb.g() : 0;
            fkwVar.b = fjiVarBb != null ? fjiVarBb.b() : 0;
        } finally {
            if (zBm) {
                boolean z2 = fna.a;
            }
        }
    }

    @Override // defpackage.fji
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final fkc l() {
        return (fkc) this.c;
    }
}
