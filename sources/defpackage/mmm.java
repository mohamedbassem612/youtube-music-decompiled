package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmm extends fhz {
    private final mmf l;
    private final oyg m;
    private frc n;

    public mmm(mmf mmfVar, oyg oygVar) {
        super(null, null);
        this.l = mmfVar;
        this.m = oygVar;
    }

    @Override // defpackage.fhz
    public final void o(frc frcVar) {
        if (frcVar != null) {
            this.n = frcVar;
            mmf mmfVar = this.l;
            mmfVar.j(this.m, true);
            mmfVar.c(frcVar);
            return;
        }
        frc frcVar2 = this.n;
        if (frcVar2 != null) {
            this.n = null;
            this.l.e(frcVar2);
        }
    }
}
