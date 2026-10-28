package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuj implements abtp {
    private final adyc a;
    private final adif b;

    public acuj(adif adifVar, adyc adycVar) {
        this.b = adifVar;
        this.a = adycVar;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.abtp
    public final abto a(abnl abnlVar) {
        ajwo ajwoVar = abnlVar.b;
        boolean z = false;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            }
        }
        ahno.K(z, "[%s] should be reel playback", abnlVar);
        adyc adycVar = this.a;
        actv actvVar = (actv) this.b.a.io();
        actvVar.getClass();
        acui acuiVar = new acui(actvVar);
        avlh avlhVar = (avlh) adycVar.b.io();
        avlhVar.getClass();
        avlh avlhVar2 = (avlh) adycVar.a.io();
        avlhVar2.getClass();
        adet adetVar = (adet) adycVar.c.io();
        adetVar.getClass();
        aboi aboiVar = (aboi) adycVar.d.io();
        aboiVar.getClass();
        abpj abpjVar = (abpj) adycVar.e.io();
        abpjVar.getClass();
        abmt abmtVar = (abmt) adycVar.f.io();
        abmtVar.getClass();
        return new abtn(avlhVar, avlhVar2, adetVar, aboiVar, abpjVar, abmtVar, acuiVar);
    }

    @Override // defpackage.abtp
    public final /* synthetic */ void b() {
    }
}
