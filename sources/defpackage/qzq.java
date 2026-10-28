package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzq extends qzr {
    public qzq(qva qvaVar) {
        super(qvaVar);
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
        atty attyVar = atty.a;
        aihf aihfVarCreateBuilder = attyVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar2 = (atty) aihfVarCreateBuilder.instance;
        attyVar2.b |= 1;
        attyVar2.e = "intensity";
        aihf aihfVarCreateBuilder2 = attp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        attp attpVar = (attp) aihfVarCreateBuilder2.instance;
        attpVar.b |= 1;
        attpVar.c = 0.0f;
        aihfVarCreateBuilder2.copyOnWrite();
        attp attpVar2 = (attp) aihfVarCreateBuilder2.instance;
        attpVar2.b |= 2;
        attpVar2.d = 0.0f;
        aihfVarCreateBuilder2.copyOnWrite();
        attp attpVar3 = (attp) aihfVarCreateBuilder2.instance;
        attpVar3.b |= 4;
        attpVar3.e = 1.0f;
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar3 = (atty) aihfVarCreateBuilder.instance;
        attp attpVar4 = (attp) aihfVarCreateBuilder2.build();
        attpVar4.getClass();
        attyVar3.d = attpVar4;
        attyVar3.c = 3;
        jrqVar.l((atty) aihfVarCreateBuilder.build());
        aihf aihfVarCreateBuilder3 = attyVar.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        atty attyVar4 = (atty) aihfVarCreateBuilder3.instance;
        attyVar4.b |= 1;
        attyVar4.e = "key_color";
        aihf aihfVarCreateBuilder4 = attn.a.createBuilder();
        atsq atsqVar = atsq.a;
        aihfVarCreateBuilder4.copyOnWrite();
        attn attnVar = (attn) aihfVarCreateBuilder4.instance;
        atsqVar.getClass();
        attnVar.c = atsqVar;
        attnVar.b |= 1;
        attn attnVar2 = (attn) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder3.copyOnWrite();
        atty attyVar5 = (atty) aihfVarCreateBuilder3.instance;
        attnVar2.getClass();
        attyVar5.d = attnVar2;
        attyVar5.c = 10;
        jrqVar.l((atty) aihfVarCreateBuilder3.build());
        aihhVarE.copyOnWrite();
        atte atteVar3 = (atte) aihhVarE.instance;
        atup atupVar = (atup) jrqVar.build();
        atupVar.getClass();
        atteVar3.o = atupVar;
        atteVar3.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder5 = ahnl.a.createBuilder();
        aihfVarCreateBuilder5.ao("input_frames");
        aihfVarCreateBuilder5.ao("intensity");
        aihfVarCreateBuilder5.ao("key_color");
        aihf aihfVarCreateBuilder6 = ahnk.a.createBuilder();
        aihfVarCreateBuilder6.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder6.instance).c = "ChromaKeyEffectCalculator";
        aihfVarCreateBuilder6.aq("VIDEO_IN:input_frames");
        aihfVarCreateBuilder6.aq("INTENSITY:intensity");
        aihfVarCreateBuilder6.aq("KEY_COLOR:key_color");
        aihfVarCreateBuilder6.ar("VIDEO_OUT:output_frames");
        aihfVarCreateBuilder5.bm(aihfVarCreateBuilder6);
        aihhVarE.copyOnWrite();
        atte atteVar4 = (atte) aihhVarE.instance;
        ahnl ahnlVar = (ahnl) aihfVarCreateBuilder5.build();
        ahnlVar.getClass();
        atteVar4.c = ahnlVar;
        atteVar4.b |= 1;
        return (atte) aihhVarE.build();
    }
}
