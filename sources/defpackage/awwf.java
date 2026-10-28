package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awwf extends awwk implements awwd {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awwf(awwd awwdVar) {
        awwk awwkVarE;
        super(true);
        boolean z = true;
        F(awwdVar);
        awuh awuhVarC = C();
        awui awuiVar = awuhVarC instanceof awui ? (awui) awuhVarC : null;
        if (awuiVar == null || (awwkVarE = awuiVar.e()) == null) {
            z = false;
            break;
        }
        while (!awwkVarE.ks()) {
            awuh awuhVarC2 = awwkVarE.C();
            awui awuiVar2 = awuhVarC2 instanceof awui ? (awui) awuhVarC2 : null;
            if (awuiVar2 == null || (awwkVarE = awuiVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    public final void c() {
        L(awmy.a);
    }

    @Override // defpackage.awwk
    public final boolean ks() {
        return this.a;
    }

    @Override // defpackage.awwk
    public final boolean kt() {
        return true;
    }
}
