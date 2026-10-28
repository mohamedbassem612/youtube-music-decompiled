package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fkx extends fgy {
    private final String a;

    protected fkx(String str) {
        this.a = str;
    }

    @Override // defpackage.fgy
    public final ci aB(fhd fhdVar, int i, int i2) {
        return fgy.Y(this) ? new ci(aD(fhdVar, i, i2), (char[]) null) : new ci(aC(fhdVar), (char[]) null);
    }

    protected fgy aC(fhd fhdVar) {
        return fgr.f(fhdVar).a;
    }

    protected fgy aD(fhd fhdVar, int i, int i2) {
        return fgr.f(fhdVar).a;
    }

    @Override // defpackage.fgy
    public final String c() {
        fgy fgyVarF = f();
        String str = this.a;
        if (fgyVarF == null) {
            return str;
        }
        while (fgyVarF instanceof fkx) {
            fkx fkxVar = (fkx) fgyVarF;
            if (fkxVar.f() == null) {
                break;
            }
            fgyVarF = fkxVar.f();
        }
        return str + '(' + fgyVarF.c() + ')';
    }

    @Override // defpackage.fgy
    public final boolean e() {
        return true;
    }

    protected fgy f() {
        return null;
    }
}
