package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class aoa extends anu implements and, anc {
    public final anq h;
    public apf i;
    public anf j;

    static {
        new ani(null);
    }

    public aoa(anq anqVar) {
        this.h = anqVar;
        this.i = anqVar.b;
    }

    @Override // defpackage.anu, defpackage.ana
    public final apj f() {
        return this.h.c;
    }

    @Override // defpackage.anc
    public final long g() {
        return this.c;
    }

    public abstract akp j();

    public final anf l() {
        anf anfVar = this.j;
        if (anfVar != null) {
            return anfVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void m() {
        int i = aob.a;
        akp akpVarJ = j();
        for (akp akpVarN = n(); akpVarN != null && (akpVarN.b & 4194304) != 0 && akpVarN != akpVarJ; akpVarN = null) {
        }
    }

    public final akp n() {
        anq anqVar = this.h;
        if (anqVar.d() == this) {
            return anqVar.d.e;
        }
        return null;
    }
}
