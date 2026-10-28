package defpackage;

import app.rive.semantics.SemanticState;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzz extends qzr {
    private final qyt b;

    public qzz(qzl qzlVar, qyt qytVar) {
        super(qzlVar);
        this.b = qytVar;
    }

    @Override // defpackage.qzr
    public final atte a() {
        qzl qzlVar = (qzl) this.a;
        String strB = b(qzlVar.i().getPath());
        if (c(strB)) {
            throw new IllegalStateException(String.format("Asset for the effect was removed, uri: %s", strB));
        }
        String strF = qzlVar.f("gl_skottie_renderer_calculator_runtime_options");
        String strF2 = qzlVar.f("playback_position");
        String str = qzlVar.b;
        String str2 = str + File.separator + "fonts.xml";
        aihh aihhVarE = e();
        atsf atsfVarD = d(strB);
        aihhVarE.copyOnWrite();
        atte atteVar = (atte) aihhVarE.instance;
        atte atteVar2 = atte.a;
        atsfVarD.getClass();
        atteVar.n = atsfVarD;
        atteVar.b |= SemanticState.LiveRegion;
        jrq jrqVar = (jrq) atup.a.createBuilder();
        atul atulVar = atul.a;
        aihf aihfVarCreateBuilder = atulVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atul atulVar2 = (atul) aihfVarCreateBuilder.instance;
        atulVar2.b |= 1;
        atulVar2.e = "base_path";
        aihfVarCreateBuilder.copyOnWrite();
        atul atulVar3 = (atul) aihfVarCreateBuilder.instance;
        atulVar3.c = 5;
        atulVar3.d = str;
        jrqVar.o(aihfVarCreateBuilder);
        aihf aihfVarCreateBuilder2 = atulVar.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atul atulVar4 = (atul) aihfVarCreateBuilder2.instance;
        atulVar4.b |= 1;
        atulVar4.e = "fonts_xml";
        aihfVarCreateBuilder2.copyOnWrite();
        atul atulVar5 = (atul) aihfVarCreateBuilder2.instance;
        atulVar5.c = 5;
        atulVar5.d = str2;
        jrqVar.o(aihfVarCreateBuilder2);
        atty attyVar = atty.a;
        aihf aihfVarCreateBuilder3 = attyVar.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        atty attyVar2 = (atty) aihfVarCreateBuilder3.instance;
        attyVar2.b |= 1;
        attyVar2.e = strF2;
        aihf aihfVarCreateBuilder4 = atto.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        atto attoVar = (atto) aihfVarCreateBuilder4.instance;
        attoVar.b |= 1;
        attoVar.c = 0.0d;
        aihfVarCreateBuilder3.copyOnWrite();
        atty attyVar3 = (atty) aihfVarCreateBuilder3.instance;
        atto attoVar2 = (atto) aihfVarCreateBuilder4.build();
        attoVar2.getClass();
        attyVar3.d = attoVar2;
        attyVar3.c = 11;
        jrqVar.n(aihfVarCreateBuilder3);
        aihf aihfVarCreateBuilder5 = attyVar.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        atty attyVar4 = (atty) aihfVarCreateBuilder5.instance;
        attyVar4.b |= 1;
        attyVar4.e = strF;
        aihf aihfVarCreateBuilder6 = attw.a.createBuilder();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atqs.b, atqs.a);
        aihfVarCreateBuilder6.copyOnWrite();
        attw attwVar = (attw) aihfVarCreateBuilder6.instance;
        atwa atwaVar = (atwa) aihhVar.build();
        atwaVar.getClass();
        attwVar.c = atwaVar;
        attwVar.b |= 1;
        aihfVarCreateBuilder5.copyOnWrite();
        atty attyVar5 = (atty) aihfVarCreateBuilder5.instance;
        attw attwVar2 = (attw) aihfVarCreateBuilder6.build();
        attwVar2.getClass();
        attyVar5.d = attwVar2;
        attyVar5.c = 7;
        jrqVar.n(aihfVarCreateBuilder5);
        aihhVarE.copyOnWrite();
        atte atteVar3 = (atte) aihhVarE.instance;
        atup atupVar = (atup) jrqVar.build();
        atupVar.getClass();
        atteVar3.o = atupVar;
        atteVar3.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder7 = ahnl.a.createBuilder();
        aihfVarCreateBuilder7.ao("input_frames");
        aihfVarCreateBuilder7.ao(strF);
        aihfVarCreateBuilder7.ao(strF2);
        aihfVarCreateBuilder7.an("base_path");
        aihfVarCreateBuilder7.an("fonts_xml");
        aihf aihfVarCreateBuilder8 = ahnk.a.createBuilder();
        aihfVarCreateBuilder8.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder8.instance).c = "GlSkottieRendererCalculator";
        aihfVarCreateBuilder8.aq("VIDEO:input_frames");
        aihfVarCreateBuilder8.aq("SEEK_FRAME_TIME_SECONDS:".concat(strF2));
        aihfVarCreateBuilder8.aq("RUNTIME_OPTIONS:".concat(strF));
        aihfVarCreateBuilder8.ap("FONTS_BASE_PATH:base_path");
        aihfVarCreateBuilder8.ap("FONTS_XML_PATH:fonts_xml");
        UUID uuid = qzlVar.c;
        jrq jrqVar2 = (jrq) atqr.a.createBuilder();
        aihf aihfVarCreateBuilder9 = ahxb.a.createBuilder();
        aihfVarCreateBuilder9.copyOnWrite();
        ahxb ahxbVar = (ahxb) aihfVarCreateBuilder9.instance;
        ahxbVar.b = 7;
        ahxbVar.c = "$SK_ANIM_FILE";
        ahxb ahxbVar2 = (ahxb) aihfVarCreateBuilder9.build();
        jrqVar2.copyOnWrite();
        atqr atqrVar = (atqr) jrqVar2.instance;
        ahxbVar2.getClass();
        atqrVar.d = ahxbVar2;
        atqrVar.c |= 1;
        jrqVar2.copyOnWrite();
        atqr atqrVar2 = (atqr) jrqVar2.instance;
        atqrVar2.c |= 2;
        atqrVar2.e = "VIDEO";
        String string = uuid.toString();
        jrqVar2.copyOnWrite();
        atqr atqrVar3 = (atqr) jrqVar2.instance;
        string.getClass();
        atqrVar3.c |= 64;
        atqrVar3.j = string;
        if (this.b.m) {
            jrqVar2.copyOnWrite();
            atqr atqrVar4 = (atqr) jrqVar2.instance;
            atqrVar4.c |= SemanticState.LiveRegion;
            atqrVar4.k = 0L;
        }
        aihh aihhVar2 = (aihh) ahnj.a.createBuilder();
        aihhVar2.e(atqr.b, (atqr) jrqVar2.build());
        ahnj ahnjVar = (ahnj) aihhVar2.build();
        aihfVarCreateBuilder8.copyOnWrite();
        ahnk ahnkVar = (ahnk) aihfVarCreateBuilder8.instance;
        ahnjVar.getClass();
        ahnkVar.g = ahnjVar;
        ahnkVar.b |= 1;
        aihfVarCreateBuilder8.ar("OUTPUT:output_frames");
        aihfVarCreateBuilder7.bm(aihfVarCreateBuilder8);
        aihhVarE.copyOnWrite();
        atte atteVar4 = (atte) aihhVarE.instance;
        ahnl ahnlVar = (ahnl) aihfVarCreateBuilder7.build();
        ahnlVar.getClass();
        atteVar4.c = ahnlVar;
        atteVar4.b |= 1;
        return (atte) aihhVarE.build();
    }
}
