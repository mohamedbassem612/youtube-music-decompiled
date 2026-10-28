package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqq extends mm {
    final /* synthetic */ fqu c;

    public fqq(fqu fquVar) {
        this.c = fquVar;
    }

    @Override // defpackage.mm
    public final int b(int i) {
        fqu fquVar = this.c;
        frh frhVar = fquVar.b;
        if (frhVar == null) {
            return 1;
        }
        ftg ftgVarN = frhVar.n(i);
        return ftgVarN.j() ? fquVar.a.b : ftgVarN.a();
    }
}
