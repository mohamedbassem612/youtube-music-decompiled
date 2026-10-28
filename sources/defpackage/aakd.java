package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aakd implements aans {
    public final boolean a;
    public final boolean b;

    public aakd(aofh aofhVar) {
        aofg aofgVar = aofhVar.e;
        aofgVar = aofgVar == null ? aofg.b : aofgVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        aoom aoomVar = (aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        this.a = aoomVar.n;
        this.b = aoomVar.o;
    }

    @Override // defpackage.aans
    public final int a() {
        return 20;
    }

    @Override // defpackage.aans
    public final agex b() {
        return new hsb(this, 11);
    }
}
