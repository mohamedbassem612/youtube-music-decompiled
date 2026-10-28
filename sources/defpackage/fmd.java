package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmd extends fkx {
    public static final /* synthetic */ int b = 0;

    @fmu
    fgy a;

    public fmd() {
        super("Wrapper");
    }

    public static fmc aE(fhd fhdVar) {
        return new fmc(fhdVar, new fmd());
    }

    @Override // defpackage.fgy
    public final fjq b(fjd fjdVar, fhd fhdVar) {
        fgy fgyVar = this.a;
        if (fgyVar != null) {
            return gzj.bd(fjdVar, fhdVar, fgyVar, false, null);
        }
        return null;
    }

    @Override // defpackage.fgy
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy f() {
        return this.a;
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fmd fmdVar = (fmd) fgyVar;
            if (this.j == fmdVar.j) {
                return true;
            }
            fgy fgyVar2 = this.a;
            if (fgyVar2 != null) {
                if (fgyVar2.g(fmdVar.a)) {
                    return true;
                }
            } else if (fmdVar.a == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        return this;
    }
}
