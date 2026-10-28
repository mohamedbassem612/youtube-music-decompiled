package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acur implements abuo {
    public final acrz a;
    public final actv b;
    private final adhv c;
    private final hno d;

    public acur(acrz acrzVar, actv actvVar, hno hnoVar, adhv adhvVar) {
        this.a = acrzVar;
        this.b = actvVar;
        this.d = hnoVar;
        this.c = adhvVar;
    }

    @Override // defpackage.abuo
    public final /* synthetic */ ListenableFuture a(abun abunVar, abug abugVar) {
        ajwo ajwoVar = ((acup) abunVar).a;
        int i = 6;
        if (((vxz) this.d.b).l(6, 45702248L, false)) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if ((apfpVar.d & 8388608) != 0) {
                    apfr apfrVar = apfpVar.W;
                    if (apfrVar == null) {
                        apfrVar = apfr.a;
                    }
                    for (asno asnoVar : apfrVar.b) {
                        aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
                        String str = asnoVar.c == 1 ? (String) asnoVar.d : "";
                        aihfVarCreateBuilder.copyOnWrite();
                        aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
                        str.getClass();
                        aqmgVar.b |= 1;
                        aqmgVar.c = str;
                        int i2 = asnoVar.e;
                        aihfVarCreateBuilder.copyOnWrite();
                        aqmg aqmgVar2 = (aqmg) aihfVarCreateBuilder.instance;
                        aqmgVar2.b |= 2;
                        aqmgVar2.d = i2;
                        int i3 = asnoVar.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        aqmg aqmgVar3 = (aqmg) aihfVarCreateBuilder.instance;
                        aqmgVar3.b |= 4;
                        aqmgVar3.e = i3;
                        aqmg aqmgVar4 = (aqmg) aihfVarCreateBuilder.build();
                        aihh aihhVar = (aihh) aqmh.a.createBuilder();
                        aihhVar.r(aqmgVar4);
                        this.c.n((aqmh) aihhVar.build(), asnoVar.e, asnoVar.f);
                    }
                }
            }
        }
        return ape.f(new dzx(this, ajwoVar, i));
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void b(abun abunVar, abuc abucVar) {
        ajwo ajwoVar = ((acup) abunVar).a;
        this.a.j(ajwoVar, "", new gml(this, ajwoVar, 9), zzd.a);
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void c(abun abunVar, abun abunVar2) {
    }
}
