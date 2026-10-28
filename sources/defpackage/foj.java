package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class foj extends flf {
    final /* synthetic */ String a;
    final /* synthetic */ foq c;

    public foj(foq foqVar, String str) {
        this.a = str;
        this.c = foqVar;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [fop, java.lang.Object] */
    @Override // defpackage.flf
    public final void a(flf flfVar) {
        foq foqVar = this.c;
        foe foeVar = foqVar.k;
        if (foeVar == null) {
            throw new IllegalStateException("You cannot call requestFocus methods before dataBound() is called!");
        }
        String str = this.a;
        aami aamiVarM = foqVar.m(foeVar, str, 0);
        if (aamiVarM == null) {
            throw new fog("Did not find section with key '" + str + "'! Currently bound section's global key is '" + foqVar.k.k + '\'');
        }
        int i = ((foe) aamiVarM.b).i;
        if (i <= 0) {
            gzj.br(2, a.bR(i, "You are trying to request focus with offset on an index that is out of bounds: requested 0 , total "));
            return;
        }
        foc focVar = foqVar.e;
        int i2 = aamiVarM.a;
        if (focVar.c()) {
            focVar.c.e(i2);
        } else {
            focVar.d = new amp(i2);
        }
    }
}
