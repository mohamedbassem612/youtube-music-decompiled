package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iwu extends adsv {
    private anlj a;
    private final adlq b;
    private final admu c;
    private final admu d;
    private final admu e;

    public iwu(anlj anljVar) {
        this.a = anljVar;
        adlq adlqVar = new adlq(false);
        this.b = adlqVar;
        admu admuVar = new admu();
        this.c = admuVar;
        admu admuVar2 = new admu();
        this.d = admuVar2;
        admu admuVar3 = new admu();
        this.e = admuVar3;
        adlqVar.e(new hde(7));
        adlqVar.m(-1, admuVar, true);
        adlqVar.m(-1, admuVar2, true);
        adlqVar.m(-1, admuVar3, true);
        anlj anljVar2 = this.a;
        admuVar.clear();
        admuVar2.clear();
        admuVar3.clear();
        this.a = anljVar2;
        apji apjiVar = anljVar2.k;
        apjiVar = apjiVar == null ? apji.a : apjiVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anli.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = anljVar2.k;
            apjiVar2 = apjiVar2 == null ? apji.a : apjiVar2;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anli.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            anlh anlhVar = (anlh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            aihf aihfVarCreateBuilder = anwt.a.createBuilder();
            alay alayVar = anlhVar.b;
            alayVar = alayVar == null ? alay.a : alayVar;
            aihfVarCreateBuilder.copyOnWrite();
            anwt anwtVar = (anwt) aihfVarCreateBuilder.instance;
            alayVar.getClass();
            anwtVar.d = alayVar;
            anwtVar.c |= 1;
            apji apjiVar3 = anlhVar.d;
            apjiVar3 = apjiVar3 == null ? apji.a : apjiVar3;
            aihfVarCreateBuilder.copyOnWrite();
            anwt anwtVar2 = (anwt) aihfVarCreateBuilder.instance;
            apjiVar3.getClass();
            anwtVar2.u = apjiVar3;
            anwtVar2.c |= 524288;
            aigj aigjVar = anlhVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anwt anwtVar3 = (anwt) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            anwtVar3.c |= 65536;
            anwtVar3.r = aigjVar;
            admuVar.add((anwt) aihfVarCreateBuilder.build());
        }
        admuVar2.add(this.a);
        admuVar3.add(new ixn(3, 2, false));
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.b;
    }
}
