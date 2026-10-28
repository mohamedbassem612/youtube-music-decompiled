package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class hsc implements aans {
    public final anue a;

    public hsc(aofh aofhVar) {
        aofg aofgVar = aofhVar.e;
        aofgVar = aofgVar == null ? aofg.b : aofgVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anue.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        this.a = (anue) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    @Override // defpackage.aans
    public final int a() {
        return 100;
    }

    @Override // defpackage.aans
    public final agex b() {
        return new hsb(this, 0);
    }
}
