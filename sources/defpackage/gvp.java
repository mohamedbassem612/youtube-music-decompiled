package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvp extends gut {
    public final vxe a;
    private final wco b;
    private final zwb c;
    private final avmb d;

    public gvp(wco wcoVar, zwb zwbVar, vxe vxeVar, avmb avmbVar) {
        this.b = wcoVar;
        this.c = zwbVar;
        vxeVar.getClass();
        this.a = vxeVar;
        this.d = avmbVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anzq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzq.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anzq anzqVar = (anzq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int i = anzqVar.c;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return;
        }
        wcn wcnVarB = this.b.b(this.c.e());
        String str = jks.b;
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anql.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anql anqlVar = (anql) aihfVarCreateBuilder.instance;
        anqlVar.b |= 1;
        anqlVar.c = str;
        anqi anqiVar = new anqi(aihfVarCreateBuilder);
        anqm anqmVarA = anqm.a(anzqVar.d);
        if (anqmVarA == null) {
            anqmVarA = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED;
        }
        aihf aihfVar = anqiVar.a;
        aihfVar.copyOnWrite();
        anql anqlVar2 = (anql) aihfVar.instance;
        anqlVar2.d = anqmVarA.d;
        anqlVar2.b |= 2;
        anqk anqkVarAm = anqiVar.am();
        wer werVarE = wcnVarB.e();
        werVarE.e(anqkVarAm);
        werVarE.b().r(this.d).E(new mgd(this, anzqVar, map, 1));
    }
}
