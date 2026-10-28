package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fqd extends fgy {
    @Override // defpackage.fgy
    public final ci aB(fhd fhdVar, int i, int i2) {
        return new ci(fgr.f(fhdVar).a, (char[]) null);
    }

    @Override // defpackage.fgy
    public final String c() {
        return "EmptyComponent";
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this != fgyVar) {
            return fgyVar != null && getClass() == fgyVar.getClass();
        }
        return true;
    }
}
