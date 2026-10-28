package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gur extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/MusicCheckboxFormItemMutatedCommandResolver");
    private final hcb b;

    public gur(hcb hcbVar) {
        this.b = hcbVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anlt.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        anls anlsVar = (anls) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        String str = anlsVar.c;
        hcb hcbVar = this.b;
        anop anopVar = (anop) hcbVar.b(str, anop.class);
        if (anopVar == null) {
            ((agrc) ((agrc) a.c().i(agso.a, "MusicCheckboxFormItem")).k("com/google/android/apps/youtube/music/command/MusicCheckboxFormItemMutatedCommandResolver", "resolve", 50, "MusicCheckboxFormItemMutatedCommandResolver.java")).w("form item not found in form: %s", str);
            return;
        }
        wek wekVarC = hcbVar.c();
        boolean z = anlsVar.d;
        anon anonVarD = anopVar.d();
        anonVarD.am(Boolean.valueOf(z));
        anop anopVarAn = anonVarD.an();
        wer werVarE = wekVarC.e();
        werVarE.e(anopVarAn);
        werVarE.b().G();
    }
}
