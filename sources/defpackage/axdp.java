package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axdp {
    private final awtr a;
    public final awtr e;
    public final awtr f;

    public axdp() {
        awts awtsVar = awts.a;
        this.e = new awtr(this, awtsVar);
        this.f = new awtr(this, awtsVar);
        this.a = new awtr(null, awtsVar);
    }

    private final axdp a() {
        axdp axdpVar;
        Object obj;
        while (true) {
            awtr awtrVar = this.f;
            axdp axdpVar2 = (axdp) awtrVar.a;
            axdpVar = axdpVar2;
            while (true) {
                axdp axdpVar3 = null;
                while (true) {
                    obj = axdpVar.e.a;
                    if (obj == this) {
                        if (axdpVar2 != axdpVar && !awtrVar.d(axdpVar2, axdpVar)) {
                            break;
                        }
                        break;
                    }
                    if (kx()) {
                        return null;
                    }
                    if (!(obj instanceof axdt)) {
                        obj.getClass();
                        axdpVar3 = axdpVar;
                        axdpVar = (axdp) obj;
                    } else {
                        if (axdpVar3 != null) {
                            break;
                        }
                        axdpVar = (axdp) axdpVar.f.a;
                    }
                }
                if (!axdpVar3.e.d(axdpVar, ((axdt) obj).a)) {
                    break;
                }
                axdpVar = axdpVar3;
            }
        }
        return axdpVar;
    }

    public final Object f() {
        return this.e.a;
    }

    public final axdp g() {
        Object objF = f();
        axdt axdtVar = objF instanceof axdt ? (axdt) objF : null;
        if (axdtVar != null) {
            return axdtVar.a;
        }
        objF.getClass();
        return (axdp) objF;
    }

    public final axdp h() {
        axdp axdpVarA = a();
        if (axdpVarA == null) {
            axdpVarA = (axdp) this.f.a;
            while (axdpVarA.kx()) {
                axdpVarA = (axdp) axdpVarA.f.a;
            }
        }
        return axdpVarA;
    }

    public final axdt i() {
        awtr awtrVar = this.a;
        axdt axdtVar = (axdt) awtrVar.a;
        if (axdtVar != null) {
            return axdtVar;
        }
        axdt axdtVar2 = new axdt(this);
        awtrVar.b(axdtVar2);
        return axdtVar2;
    }

    public final void j(int i) {
        l(new axdm(i), i);
    }

    public final void k(axdp axdpVar) {
        awtr awtrVar;
        axdp axdpVar2;
        do {
            awtrVar = axdpVar.f;
            axdpVar2 = (axdp) awtrVar.a;
            if (f() != axdpVar) {
                return;
            }
        } while (!awtrVar.d(axdpVar2, this));
        if (kx()) {
            axdpVar.a();
        }
    }

    public boolean kx() {
        return f() instanceof axdt;
    }

    public final boolean l(axdp axdpVar, int i) {
        axdp axdpVarH;
        do {
            axdpVarH = h();
            if (axdpVarH instanceof axdm) {
                return (((axdm) axdpVarH).a & i) == 0 && axdpVarH.l(axdpVar, i);
            }
            axdpVar.f.b(axdpVarH);
            axdpVar.e.b(this);
        } while (!axdpVarH.e.d(this, axdpVar));
        axdpVar.k(this);
        return true;
    }

    public final void m() {
        Object objF;
        axdp axdpVar;
        do {
            objF = f();
            if (objF instanceof axdt) {
                axdp axdpVar2 = ((axdt) objF).a;
                return;
            } else if (objF == this) {
                return;
            } else {
                objF.getClass();
                axdpVar = (axdp) objF;
            }
        } while (!this.e.d(objF, axdpVar.i()));
        axdpVar.a();
    }

    public String toString() {
        return new awre(this) { // from class: axdo
            @Override // defpackage.awre
            public final Object b() {
                return awuw.a(this.receiver);
            }
        } + '@' + awuw.b(this);
    }
}
