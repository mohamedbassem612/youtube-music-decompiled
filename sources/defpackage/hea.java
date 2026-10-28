package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hea {
    public final Executor a;
    public final vxe b;
    public hdz c = null;
    public String d;
    public String e;
    public ajwo f;
    public final hcb g;
    public final aapz h;

    public hea(aapz aapzVar, hcb hcbVar, Executor executor, vxe vxeVar) {
        this.h = aapzVar;
        this.g = hcbVar;
        this.a = executor;
        this.b = vxeVar;
    }

    public final ajwo a(ajwo ajwoVar) {
        if (this.f == null) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akgl.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aotf.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                        return ajwoVar;
                    }
                }
            }
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVar = aoaq.b;
        ajwo ajwoVar2 = this.f;
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
        ajwoVar2.c(aihlVarCheckIsLite5);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite5.d);
        aihhVar.e(aihlVar, (aoar) (objK == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK)));
        aigj aigjVar = this.f.c;
        aihhVar.copyOnWrite();
        ajwo ajwoVar3 = (ajwo) aihhVar.instance;
        aigjVar.getClass();
        ajwoVar3.b |= 1;
        ajwoVar3.c = aigjVar;
        return (ajwo) aihhVar.build();
    }

    public final void b(anvx anvxVar) {
        anvs anvsVar;
        String str = this.d;
        if (str != null) {
            hcb hcbVar = this.g;
            anvu anvuVar = (anvu) hcbVar.b(str, anvu.class);
            if (anvuVar != null) {
                anvsVar = anvuVar.d();
            } else {
                String str2 = this.d;
                str2.getClass();
                ahno.P(!str2.isEmpty(), "key cannot be empty");
                aihf aihfVarCreateBuilder = anvv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anvv anvvVar = (anvv) aihfVarCreateBuilder.instance;
                anvvVar.b |= 1;
                anvvVar.c = str2;
                anvsVar = new anvs(aihfVarCreateBuilder);
            }
            aihf aihfVar = anvsVar.a;
            aihfVar.copyOnWrite();
            anvv anvvVar2 = (anvv) aihfVar.instance;
            anvv anvvVar3 = anvv.a;
            anvvVar2.d = anvxVar.g;
            anvvVar2.b |= 2;
            hcbVar.c();
            hcbVar.e(anvsVar.am());
        }
    }
}
