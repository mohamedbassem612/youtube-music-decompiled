package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzw extends qzr {
    public qzw(qvg qvgVar) {
        super(qvgVar);
    }

    @Override // defpackage.qzr
    public final atte a() {
        aihh aihhVarE = e();
        atsf atsfVar = atsf.a;
        aihhVarE.copyOnWrite();
        atte atteVar = (atte) aihhVarE.instance;
        atte atteVar2 = atte.a;
        atsfVar.getClass();
        atteVar.n = atsfVar;
        atteVar.b |= SemanticState.LiveRegion;
        jrq jrqVar = (jrq) atup.a.createBuilder();
        aihf aihfVarCreateBuilder = atty.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar = (atty) aihfVarCreateBuilder.instance;
        attyVar.b |= 1;
        attyVar.e = "options";
        aihf aihfVarCreateBuilder2 = attw.a.createBuilder();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihl aihlVar = aube.b;
        aihf aihfVarCreateBuilder3 = aube.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aube aubeVar = (aube) aihfVarCreateBuilder3.instance;
        aubeVar.d = 1;
        aubeVar.c |= 1;
        aihhVar.e(aihlVar, (aube) aihfVarCreateBuilder3.build());
        atwa atwaVar = (atwa) aihhVar.build();
        aihfVarCreateBuilder2.copyOnWrite();
        attw attwVar = (attw) aihfVarCreateBuilder2.instance;
        atwaVar.getClass();
        attwVar.c = atwaVar;
        attwVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar2 = (atty) aihfVarCreateBuilder.instance;
        attw attwVar2 = (attw) aihfVarCreateBuilder2.build();
        attwVar2.getClass();
        attyVar2.d = attwVar2;
        attyVar2.c = 7;
        jrqVar.n(aihfVarCreateBuilder);
        aihhVarE.copyOnWrite();
        atte atteVar3 = (atte) aihhVarE.instance;
        atup atupVar = (atup) jrqVar.build();
        atupVar.getClass();
        atteVar3.o = atupVar;
        atteVar3.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder4 = ahnl.a.createBuilder();
        aihfVarCreateBuilder4.ao("input_frames");
        aihfVarCreateBuilder4.ao("options");
        aihf aihfVarCreateBuilder5 = ahnk.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder5.instance).c = "MaskEffectCalculator";
        aihfVarCreateBuilder5.aq("VIDEO_IN:input_frames");
        aihfVarCreateBuilder5.aq("RUNTIME_OPTIONS:options");
        aihfVarCreateBuilder5.ar("VIDEO_OUT:output_frames");
        aihfVarCreateBuilder4.bm(aihfVarCreateBuilder5);
        aihhVarE.copyOnWrite();
        atte atteVar4 = (atte) aihhVarE.instance;
        ahnl ahnlVar = (ahnl) aihfVarCreateBuilder4.build();
        ahnlVar.getClass();
        atteVar4.c = ahnlVar;
        atteVar4.b |= 1;
        return (atte) aihhVarE.build();
    }
}
