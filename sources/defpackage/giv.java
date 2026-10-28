package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class giv implements aupr {
    public final ght a;
    private final int b;

    public giv(ght ghtVar, int i) {
        this.a = ghtVar;
        this.b = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        int i = this.b;
        if (i == 0 || i == 1) {
            qcb qcbVar = new qcb(this);
            return qcbVar;
        }
        ght ghtVar = this.a;
        if (i != 2) {
            return agev.i((aati) ghtVar.sp.io());
        }
        ghx ghxVar = ghtVar.a;
        return new aaok((syi) ghxVar.bh.io(), (vxz) ghtVar.jR.io(), (syn) ghtVar.cc.io(), (elr) ghxVar.at());
    }
}
