package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class stl {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/comment/util/CommentEntityUtil");

    public static ajwo a(wek wekVar, String str) {
        ajxn ajxnVar = (ajxn) wekVar.g(str).g(ajxn.class).j(new sqk(str, 12)).E();
        if (ajxnVar == null || (ajxnVar.c.b & SemanticState.Focused) == 0) {
            return null;
        }
        return ajxnVar.getDismissDialogCommand();
    }

    public static void b(wek wekVar, String str) {
        ajxn ajxnVar = (ajxn) wekVar.g(str).g(ajxn.class).j(new sqk(str, 13)).E();
        if (ajxnVar != null) {
            ajxl ajxlVarD = ajxnVar.d();
            aihf aihfVar = ajxlVarD.a;
            aihfVar.copyOnWrite();
            ajxo ajxoVar = (ajxo) aihfVar.instance;
            ajxo ajxoVar2 = ajxo.a;
            ajxoVar.b |= 2;
            ajxoVar.d = "";
            aihfVar.copyOnWrite();
            ajxo ajxoVar3 = (ajxo) aihfVar.instance;
            ajxoVar3.b |= 4;
            ajxoVar3.e = "";
            aihfVar.copyOnWrite();
            ((ajxo) aihfVar.instance).f = ajxo.emptyProtobufList();
            aihfVar.copyOnWrite();
            ((ajxo) aihfVar.instance).g = ajxo.emptyProtobufList();
            Boolean.TRUE.booleanValue();
            aihfVar.copyOnWrite();
            ajxo ajxoVar4 = (ajxo) aihfVar.instance;
            ajxoVar4.b |= 64;
            ajxoVar4.k = true;
            Float.valueOf(0.0f).getClass();
            aihfVar.copyOnWrite();
            ajxo ajxoVar5 = (ajxo) aihfVar.instance;
            ajxoVar5.b |= SemanticState.Hidden;
            ajxoVar5.m = 0.0f;
            aihfVar.copyOnWrite();
            ajxo ajxoVar6 = (ajxo) aihfVar.instance;
            ajxoVar6.b |= SemanticState.Obscured;
            ajxoVar6.q = "";
            aihfVar.copyOnWrite();
            ajxo ajxoVar7 = (ajxo) aihfVar.instance;
            ajxoVar7.b |= 8;
            ajxoVar7.h = "";
            aihfVar.copyOnWrite();
            ajxo ajxoVar8 = (ajxo) aihfVar.instance;
            ajxoVar8.b |= 131072;
            ajxoVar8.v = "";
            aihfVar.copyOnWrite();
            ajxo ajxoVar9 = (ajxo) aihfVar.instance;
            ajxoVar9.b |= 65536;
            ajxoVar9.u = "";
            ajxn ajxnVarAm = ajxlVarD.am();
            wer werVarE = wekVar.e();
            werVarE.e(ajxnVarAm);
            werVarE.b().D();
        }
    }

    public static void c(wek wekVar, String str, boolean z) {
        ajxf ajxfVar = (ajxf) wekVar.g(str).g(ajxf.class).j(new sqk(str, 11)).E();
        if (ajxfVar != null) {
            ajxd ajxdVarD = ajxfVar.d();
            aihf aihfVar = ajxdVarD.a;
            Boolean bool = Boolean.FALSE;
            bool.booleanValue();
            aihfVar.copyOnWrite();
            ajxg ajxgVar = (ajxg) aihfVar.instance;
            ajxg ajxgVar2 = ajxg.a;
            ajxgVar.b |= 2;
            ajxgVar.d = false;
            if (z) {
                bool.booleanValue();
                aihfVar.copyOnWrite();
                ajxg ajxgVar3 = (ajxg) aihfVar.instance;
                ajxgVar3.b |= 32;
                ajxgVar3.h = false;
            }
            ajxf ajxfVarAm = ajxdVarD.am();
            wer werVarE = wekVar.e();
            werVarE.e(ajxfVarAm);
            werVarE.b().D();
        }
    }
}
