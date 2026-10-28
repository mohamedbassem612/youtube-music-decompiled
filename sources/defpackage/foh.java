package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class foh implements fin, fir {
    public static void l(fof fofVar, int i) {
        fip fipVar;
        foe foeVarA = fofVar.A();
        if (foeVarA == null) {
            fipVar = null;
        } else {
            while (true) {
                foe foeVar = foeVarA.a;
                if (foeVar == null) {
                    break;
                }
                fip fipVar2 = foeVarA.d;
                foeVarA = foeVar;
            }
            fipVar = fofVar.n;
        }
        if (fipVar != null) {
            atwg atwgVar = new atwg(null);
            atwgVar.a = false;
            atwgVar.b = i;
            fipVar.gK(atwgVar);
        }
    }

    protected static fip m(Class cls, fof fofVar, int i, Object[] objArr) {
        if (fofVar == null || fofVar.A() == null) {
            gzj.br(3, "Creating event handler without scope.");
            return fkh.a;
        }
        if (fofVar.A().getClass() != cls) {
            String str = fofVar.A().f;
            gzj.br(2, String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a SectionContext from its Section.", "DataDrivenCollectionSection", fofVar.A().f));
        }
        foe foeVar = (foe) fofVar.m.get();
        if (foeVar == null) {
            throw new IllegalStateException("Called newEventHandler on a released Section");
        }
        fip fipVar = new fip(foeVar, i, objArr);
        foq foqVar = fofVar.l;
        if (foqVar == null) {
            return fipVar;
        }
        foqVar.m.L(fofVar.A().k, fipVar);
        return fipVar;
    }

    static final boolean o(foe foeVar, foe foeVar2) {
        if (foeVar2 == null || !foeVar2.b) {
            if (foeVar != foeVar2) {
                if (foeVar != null) {
                    fky fkyVar = foeVar.g;
                    fky fkyVar2 = foeVar2 == null ? null : foeVar2.g;
                    if (!foeVar.a(foeVar2) || !gzj.bz(fkyVar, fkyVar2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.fir
    public final void at(fiq fiqVar, Object obj) {
        throw null;
    }

    protected Object g(fip fipVar, Object obj) {
        return null;
    }

    protected String h(fof fofVar) {
        return null;
    }

    public boolean k() {
        return false;
    }

    protected dov s(fof fofVar) {
        return null;
    }

    @Override // defpackage.fin
    public final Object z(fip fipVar, Object obj) throws Exception {
        try {
            return g(fipVar, obj);
        } catch (Exception e) {
            Object[] objArr = fipVar.d;
            if (objArr != null) {
                Object obj2 = objArr[0];
                if (obj2 instanceof fhd) {
                    throw gzj.bt((fhd) obj2, e);
                }
            }
            throw e;
        }
    }

    protected void p() {
    }

    protected void i(fof fofVar) {
    }

    protected void j(fky fkyVar, fky fkyVar2) {
    }

    protected void q(int i, int i2) {
    }

    protected void r(fof fofVar, afts aftsVar, foe foeVar, foe foeVar2) {
    }
}
