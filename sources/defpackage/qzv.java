package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qzv extends qzr {
    private static final atte b;

    static {
        aihh aihhVarE = e();
        jrr jrrVar = (jrr) atsf.a.createBuilder();
        aihf aihfVarCreateBuilder = atsa.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atsa atsaVar = (atsa) aihfVarCreateBuilder.instance;
        atsaVar.b |= 1;
        atsaVar.e = "$ASSET_ID";
        atse atseVar = atse.a;
        aihfVarCreateBuilder.copyOnWrite();
        atsa atsaVar2 = (atsa) aihfVarCreateBuilder.instance;
        atseVar.getClass();
        atsaVar2.d = atseVar;
        atsaVar2.c = 2;
        jrrVar.b(aihfVarCreateBuilder);
        aihhVarE.copyOnWrite();
        atte atteVar = (atte) aihhVarE.instance;
        atsf atsfVar = (atsf) jrrVar.build();
        atte atteVar2 = atte.a;
        atsfVar.getClass();
        atteVar.n = atsfVar;
        atteVar.b |= SemanticState.LiveRegion;
        jrq jrqVar = (jrq) atup.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atty.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atty attyVar = (atty) aihfVarCreateBuilder2.instance;
        attyVar.b |= 1;
        attyVar.e = "strength";
        aihf aihfVarCreateBuilder3 = attp.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        attp attpVar = (attp) aihfVarCreateBuilder3.instance;
        attpVar.b |= 1;
        attpVar.c = 1.0f;
        aihfVarCreateBuilder3.copyOnWrite();
        attp attpVar2 = (attp) aihfVarCreateBuilder3.instance;
        attpVar2.b |= 2;
        attpVar2.d = 0.0f;
        aihfVarCreateBuilder3.copyOnWrite();
        attp attpVar3 = (attp) aihfVarCreateBuilder3.instance;
        attpVar3.b |= 4;
        attpVar3.e = 1.0f;
        aihfVarCreateBuilder2.copyOnWrite();
        atty attyVar2 = (atty) aihfVarCreateBuilder2.instance;
        attp attpVar4 = (attp) aihfVarCreateBuilder3.build();
        attpVar4.getClass();
        attyVar2.d = attpVar4;
        attyVar2.c = 3;
        jrqVar.n(aihfVarCreateBuilder2);
        aihhVarE.copyOnWrite();
        atte atteVar3 = (atte) aihhVarE.instance;
        atup atupVar = (atup) jrqVar.build();
        atupVar.getClass();
        atteVar3.o = atupVar;
        atteVar3.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder4 = ahnl.a.createBuilder();
        aihfVarCreateBuilder4.ao("input_frames");
        aihfVarCreateBuilder4.ao("strength");
        aihf aihfVarCreateBuilder5 = ahnk.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder5.instance).c = "AssetCalculator";
        aihfVarCreateBuilder5.aq("VIDEO:input_frames");
        aihfVarCreateBuilder5.ar("VIDEO:lut_image");
        aihh aihhVar = (aihh) ahnj.a.createBuilder();
        aihl aihlVar = aimu.b;
        aihf aihfVarCreateBuilder6 = aimu.a.createBuilder();
        aihfVarCreateBuilder6.copyOnWrite();
        aimu aimuVar = (aimu) aihfVarCreateBuilder6.instance;
        aimuVar.c = 5;
        aimuVar.d = "$ASSET_ID";
        aihhVar.e(aihlVar, (aimu) aihfVarCreateBuilder6.build());
        aihfVarCreateBuilder5.copyOnWrite();
        ahnk ahnkVar = (ahnk) aihfVarCreateBuilder5.instance;
        ahnj ahnjVar = (ahnj) aihhVar.build();
        ahnjVar.getClass();
        ahnkVar.g = ahnjVar;
        ahnkVar.b |= 1;
        aihfVarCreateBuilder4.bm(aihfVarCreateBuilder5);
        aihf aihfVarCreateBuilder7 = ahnk.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder7.instance).c = "ColorAdjustGpuCalculator";
        aihfVarCreateBuilder7.aq("VIDEO0:input_frames");
        aihfVarCreateBuilder7.aq("VIDEO1:lut_image");
        aihfVarCreateBuilder7.aq("MIX:strength");
        aihfVarCreateBuilder7.ar("VIDEO:output_frames");
        aihh aihhVar2 = (aihh) ahnj.a.createBuilder();
        aihl aihlVar2 = aimv.b;
        aihf aihfVarCreateBuilder8 = aimv.a.createBuilder();
        aihfVarCreateBuilder8.copyOnWrite();
        aimv aimvVar = (aimv) aihfVarCreateBuilder8.instance;
        aimvVar.c |= 8;
        aimvVar.d = true;
        aihhVar2.e(aihlVar2, (aimv) aihfVarCreateBuilder8.build());
        aihfVarCreateBuilder7.copyOnWrite();
        ahnk ahnkVar2 = (ahnk) aihfVarCreateBuilder7.instance;
        ahnj ahnjVar2 = (ahnj) aihhVar2.build();
        ahnjVar2.getClass();
        ahnkVar2.g = ahnjVar2;
        ahnkVar2.b |= 1;
        aihfVarCreateBuilder4.bm(aihfVarCreateBuilder7);
        aihhVarE.copyOnWrite();
        atte atteVar4 = (atte) aihhVarE.instance;
        ahnl ahnlVar = (ahnl) aihfVarCreateBuilder4.build();
        ahnlVar.getClass();
        atteVar4.c = ahnlVar;
        atteVar4.b |= 1;
        b = (atte) aihhVarE.build();
    }

    public qzv(qvd qvdVar) {
        super(qvdVar);
    }

    @Override // defpackage.qzr
    public final atte a() {
        return b;
    }
}
