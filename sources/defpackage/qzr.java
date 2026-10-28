package defpackage;

import app.rive.semantics.SemanticState;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class qzr {
    protected final qvc a;

    public qzr(qvc qvcVar) {
        this.a = qvcVar;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        return str.startsWith("/android_asset/") ? str.replace("/android_asset/", "") : str;
    }

    protected static boolean c(String str) {
        return str.startsWith("/") && !new File(str).exists();
    }

    protected static atsf d(String str) {
        atse atseVar;
        if (str.startsWith("http") || str.startsWith("https")) {
            aihf aihfVarCreateBuilder = atse.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            atse atseVar2 = (atse) aihfVarCreateBuilder.instance;
            str.getClass();
            atseVar2.c = 1;
            atseVar2.d = str;
            atseVar = (atse) aihfVarCreateBuilder.build();
        } else {
            aihf aihfVarCreateBuilder2 = atse.a.createBuilder();
            aihf aihfVarCreateBuilder3 = atsb.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            atsb atsbVar = (atsb) aihfVarCreateBuilder3.instance;
            str.getClass();
            atsbVar.b |= 2;
            atsbVar.e = str;
            aihfVarCreateBuilder2.copyOnWrite();
            atse atseVar3 = (atse) aihfVarCreateBuilder2.instance;
            atsb atsbVar2 = (atsb) aihfVarCreateBuilder3.build();
            atsbVar2.getClass();
            atseVar3.e = atsbVar2;
            atseVar3.b |= 1;
            atseVar = (atse) aihfVarCreateBuilder2.build();
        }
        jrr jrrVar = (jrr) atsf.a.createBuilder();
        aihf aihfVarCreateBuilder4 = atsa.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        atsa atsaVar = (atsa) aihfVarCreateBuilder4.instance;
        atsaVar.b |= 1;
        atsaVar.e = "$SK_ANIM_FILE";
        aihfVarCreateBuilder4.copyOnWrite();
        atsa atsaVar2 = (atsa) aihfVarCreateBuilder4.instance;
        atseVar.getClass();
        atsaVar2.d = atseVar;
        atsaVar2.c = 2;
        jrrVar.b(aihfVarCreateBuilder4);
        return (atsf) jrrVar.build();
    }

    protected static aihh e() {
        aihh aihhVar = (aihh) atte.a.createBuilder();
        aihhVar.copyOnWrite();
        atte atteVar = (atte) aihhVar.instance;
        atteVar.b |= 2;
        atteVar.d = "input_frames";
        aihhVar.copyOnWrite();
        atte atteVar2 = (atte) aihhVar.instance;
        atteVar2.b |= 8;
        atteVar2.f = "output_frames";
        aihhVar.copyOnWrite();
        atte atteVar3 = (atte) aihhVar.instance;
        atteVar3.b |= SemanticState.Hidden;
        atteVar3.m = 16;
        return aihhVar;
    }

    public atte a() {
        return atte.a;
    }
}
