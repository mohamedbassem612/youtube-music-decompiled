package defpackage;

import app.rive.semantics.SemanticState;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qzy extends qzr {
    private final qyt b;

    public qzy(qvi qviVar, qyt qytVar) {
        super(qviVar);
        this.b = qytVar;
    }

    @Override // defpackage.qzr
    public final atte a() {
        qvi qviVar = (qvi) this.a;
        String strB = b(qviVar.i().getPath());
        if (c(strB)) {
            throw new IllegalStateException(String.format("Asset for the effect was removed, uri: %s", strB));
        }
        String strF = qviVar.f("gl_skottie_renderer_calculator_runtime_options");
        String strF2 = qviVar.f("playback_position");
        aihh aihhVarE = e();
        atsf atsfVarD = d(strB);
        aihhVarE.copyOnWrite();
        atte atteVar = (atte) aihhVarE.instance;
        atte atteVar2 = atte.a;
        atsfVarD.getClass();
        atteVar.n = atsfVarD;
        atteVar.b |= SemanticState.LiveRegion;
        jrq jrqVar = (jrq) atup.a.createBuilder();
        atty attyVar = atty.a;
        aihf aihfVarCreateBuilder = attyVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar2 = (atty) aihfVarCreateBuilder.instance;
        attyVar2.b |= 1;
        attyVar2.e = strF2;
        aihf aihfVarCreateBuilder2 = atto.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atto attoVar = (atto) aihfVarCreateBuilder2.instance;
        attoVar.b |= 1;
        attoVar.c = 0.0d;
        aihfVarCreateBuilder.copyOnWrite();
        atty attyVar3 = (atty) aihfVarCreateBuilder.instance;
        atto attoVar2 = (atto) aihfVarCreateBuilder2.build();
        attoVar2.getClass();
        attyVar3.d = attoVar2;
        attyVar3.c = 11;
        jrqVar.n(aihfVarCreateBuilder);
        aihf aihfVarCreateBuilder3 = attyVar.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        atty attyVar4 = (atty) aihfVarCreateBuilder3.instance;
        attyVar4.b |= 1;
        attyVar4.e = strF;
        aihf aihfVarCreateBuilder4 = attw.a.createBuilder();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atqs.b, atqs.a);
        aihfVarCreateBuilder4.copyOnWrite();
        attw attwVar = (attw) aihfVarCreateBuilder4.instance;
        atwa atwaVar = (atwa) aihhVar.build();
        atwaVar.getClass();
        attwVar.c = atwaVar;
        attwVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        atty attyVar5 = (atty) aihfVarCreateBuilder3.instance;
        attw attwVar2 = (attw) aihfVarCreateBuilder4.build();
        attwVar2.getClass();
        attyVar5.d = attwVar2;
        attyVar5.c = 7;
        jrqVar.n(aihfVarCreateBuilder3);
        aihhVarE.copyOnWrite();
        atte atteVar3 = (atte) aihhVarE.instance;
        atup atupVar = (atup) jrqVar.build();
        atupVar.getClass();
        atteVar3.o = atupVar;
        atteVar3.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder5 = ahnl.a.createBuilder();
        aihfVarCreateBuilder5.ao("input_frames");
        aihfVarCreateBuilder5.ao(strF);
        aihfVarCreateBuilder5.ao(strF2);
        aihf aihfVarCreateBuilder6 = ahnk.a.createBuilder();
        aihfVarCreateBuilder6.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder6.instance).c = "GlSkottieRendererCalculator";
        aihfVarCreateBuilder6.aq("VIDEO:input_frames");
        aihfVarCreateBuilder6.aq("SEEK_FRAME_TIME_SECONDS:".concat(strF2));
        aihfVarCreateBuilder6.aq("RUNTIME_OPTIONS:".concat(strF));
        UUID uuid = qviVar.c;
        jrq jrqVar2 = (jrq) atqr.a.createBuilder();
        aihf aihfVarCreateBuilder7 = ahxb.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        ahxb ahxbVar = (ahxb) aihfVarCreateBuilder7.instance;
        ahxbVar.b = 7;
        ahxbVar.c = "$SK_ANIM_FILE";
        ahxb ahxbVar2 = (ahxb) aihfVarCreateBuilder7.build();
        jrqVar2.copyOnWrite();
        atqr atqrVar = (atqr) jrqVar2.instance;
        ahxbVar2.getClass();
        atqrVar.d = ahxbVar2;
        atqrVar.c |= 1;
        jrqVar2.g("in_image_1", "VIDEO");
        jrqVar2.copyOnWrite();
        atqr atqrVar2 = (atqr) jrqVar2.instance;
        atqrVar2.g = 1;
        atqrVar2.c |= 4;
        jrqVar2.copyOnWrite();
        atqr atqrVar3 = (atqr) jrqVar2.instance;
        atqrVar3.h = 1;
        atqrVar3.c |= 8;
        String string = uuid.toString();
        jrqVar2.copyOnWrite();
        atqr atqrVar4 = (atqr) jrqVar2.instance;
        string.getClass();
        atqrVar4.c |= 64;
        atqrVar4.j = string;
        if (this.b.m) {
            jrqVar2.copyOnWrite();
            atqr atqrVar5 = (atqr) jrqVar2.instance;
            atqrVar5.c |= SemanticState.LiveRegion;
            atqrVar5.k = 0L;
        }
        aihh aihhVar2 = (aihh) ahnj.a.createBuilder();
        aihhVar2.e(atqr.b, (atqr) jrqVar2.build());
        ahnj ahnjVar = (ahnj) aihhVar2.build();
        aihfVarCreateBuilder6.copyOnWrite();
        ahnk ahnkVar = (ahnk) aihfVarCreateBuilder6.instance;
        ahnjVar.getClass();
        ahnkVar.g = ahnjVar;
        ahnkVar.b |= 1;
        aihfVarCreateBuilder6.ar("OUTPUT:output_frames");
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
