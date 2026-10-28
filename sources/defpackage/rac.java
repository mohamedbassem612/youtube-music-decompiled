package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rac extends qzr {
    public static final /* synthetic */ int b = 0;
    private static final agke c = agke.A(new rab("exposure", 0.0f, -1.0f, 1.0f), new rab("highlights", 0.0f, -1.0f, 1.0f), new rab("shadows", 0.0f, -1.0f, 1.0f), new rab("contrast", 0.0f, -1.0f, 1.0f), new rab("saturation", 0.0f, -1.0f, 1.0f), new rab("whitepoint", 0.0f, -1.0f, 1.0f), new rab("blackpoint", 0.0f, -1.0f, 1.0f), new rab("tint", 0.0f, -1.0f, 1.0f), new rab("temp", 0.0f, -1.0f, 1.0f), new rab("skintonesat", 0.0f, -1.0f, 1.0f), new rab("deepbluesat", 0.0f, -1.0f, 1.0f), new rab("vignette_strength", 0.0f, -1.0f, 0.0f), new rab("vignette_center_x", 0.0f, -1.0f, 1.0f), new rab("vignette_center_y", 0.0f, -1.0f, 1.0f), new rab("sharpen", 0.0f, 0.0f, 10.0f), new rab("opacity", 1.0f, 0.0f, 1.0f));
    private static final agke d = agke.A("input_frames", "exposure", "highlights", "shadows", "contrast", "saturation", "whitepoint", "blackpoint", "tint", "temp", "skintonesat", "deepbluesat", "vignette_strength", "vignette_center_x", "vignette_center_y", "sharpen", "opacity");
    private static final agke e = agke.A("VIDEO_IN:input_frames", "EXPOSURE:exposure", "HIGHLIGHTS:highlights", "SHADOWS:shadows", "CONTRAST:contrast", "SATURATION:saturation", "WHITE_POINT:whitepoint", "BLACK_POINT:blackpoint", "TINT:tint", "TEMPERATURE:temp", "SKIN_TONE_SATURATION:skintonesat", "DEEP_BLUE_SATURATION:deepbluesat", "VIGNETTE_STRENGTH:vignette_strength", "VIGNETTE_CENTER_X:vignette_center_x", "VIGNETTE_CENTER_Y:vignette_center_y", "SHARPEN:sharpen", "OPACITY:opacity");

    public rac(qvj qvjVar) {
        super(qvjVar);
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
        Iterable iterable = (Iterable) Collection.EL.stream(c).map(new qzp(3)).collect(aghu.b);
        jrqVar.copyOnWrite();
        atup atupVar = (atup) jrqVar.instance;
        atupVar.a();
        aifs.addAll(iterable, atupVar.c);
        aihhVarE.copyOnWrite();
        atte atteVar3 = (atte) aihhVarE.instance;
        atup atupVar2 = (atup) jrqVar.build();
        atupVar2.getClass();
        atteVar3.o = atupVar2;
        atteVar3.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder = ahnl.a.createBuilder();
        agke agkeVar = d;
        aihfVarCreateBuilder.copyOnWrite();
        ahnl ahnlVar = (ahnl) aihfVarCreateBuilder.instance;
        ahnlVar.a();
        aifs.addAll(agkeVar, ahnlVar.c);
        aihf aihfVarCreateBuilder2 = ahnk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahnk) aihfVarCreateBuilder2.instance).c = "AdjustmentEffectCalculator";
        agke agkeVar2 = e;
        aihfVarCreateBuilder2.copyOnWrite();
        ahnk ahnkVar = (ahnk) aihfVarCreateBuilder2.instance;
        ahnkVar.a();
        aifs.addAll(agkeVar2, ahnkVar.d);
        aihfVarCreateBuilder2.ar("VIDEO_OUT:output_frames");
        aihfVarCreateBuilder.bm(aihfVarCreateBuilder2);
        aihhVarE.copyOnWrite();
        atte atteVar4 = (atte) aihhVarE.instance;
        ahnl ahnlVar2 = (ahnl) aihfVarCreateBuilder.build();
        ahnlVar2.getClass();
        atteVar4.c = ahnlVar2;
        atteVar4.b |= 1;
        return (atte) aihhVarE.build();
    }
}
