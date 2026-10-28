package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class scf extends sbk {
    public scf(awmd awmdVar) {
        ovo ovoVar = (ovo) awmdVar.io();
        if (ovoVar.b == null) {
            ovoVar.b = this;
        } else {
            Object obj = ovoVar.a;
            rmp.n(null, "Tried to override existing survey listener");
        }
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.q(sne.class, snb.class);
    }
}
