package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gvj extends gut {
    public final dov a;
    private final wbz b;
    private final zwh c;
    private final vxz d;

    public gvj(dov dovVar, wbz wbzVar, zwh zwhVar, vxz vxzVar) {
        dovVar.getClass();
        wbzVar.getClass();
        zwhVar.getClass();
        vxzVar.getClass();
        this.a = dovVar;
        this.b = wbzVar;
        this.c = zwhVar;
        this.d = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apoy.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("command is missing SectionReloadCommand extension");
        }
        if (this.d.l(240, 45794845L, false)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apoy.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            objC.getClass();
            apoy apoyVar = (apoy) objC;
            String str = apoyVar.e;
            str.getClass();
            if (str.length() != 0) {
                int i = apoyVar.c;
                if (i == 3) {
                    this.b.e(this.c.hw()).g(apoyVar.c == 3 ? (String) apoyVar.d : "").g(akeo.class).C(new gks(new apm(this, apoyVar, 15, null), 18), new gks(new akl(19), 19));
                    return;
                }
                akeh akehVar = i == 1 ? (akeh) apoyVar.d : akeh.a;
                aihl aihlVar = apho.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                akehVar.c(aihlVarCheckIsLite3);
                if (akehVar.j.n(aihlVarCheckIsLite3.d)) {
                    dov dovVar = this.a;
                    String str2 = apoyVar.e;
                    str2.getClass();
                    akeh akehVar2 = apoyVar.c == 1 ? (akeh) apoyVar.d : akeh.a;
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                    akehVar2.c(aihlVarCheckIsLite4);
                    Object objK2 = akehVar2.j.k(aihlVarCheckIsLite4.d);
                    Object objC2 = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                    objC2.getClass();
                    dovVar.s(new gvk(str2, (apho) objC2));
                }
            }
        }
    }
}
