package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cdo extends cna {
    private final btm c;

    public cdo(btn btnVar) {
        super(btnVar);
        this.c = new btm();
    }

    @Override // defpackage.cna, defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        btl btlVarD = super.d(i, btlVar, z);
        if (e(btlVarD.c, this.c, 0L).d()) {
            btlVarD.j(btlVar.a, btlVar.b, btlVar.c, btlVar.d, btlVar.f, brp.a, true, btlVar.e);
        } else {
            btlVarD.g = true;
        }
        return btlVarD;
    }
}
