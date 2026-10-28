package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtb extends wms {
    public wtb(abxv abxvVar, zwa zwaVar, String str, List list, apcc apccVar, Optional optional, Optional optional2, Optional optional3) {
        aihf aihfVarCreateBuilder = alsr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alsr alsrVar = (alsr) aihfVarCreateBuilder.instance;
        aiie aiieVar = alsrVar.e;
        if (!aiieVar.c()) {
            alsrVar.e = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, alsrVar.e);
        if (!ahno.aa("")) {
            aihfVarCreateBuilder.copyOnWrite();
            alsr alsrVar2 = (alsr) aihfVarCreateBuilder.instance;
            alsrVar2.b |= 4;
            alsrVar2.f = "";
        }
        if (!ahno.aa(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            alsr alsrVar3 = (alsr) aihfVarCreateBuilder.instance;
            str.getClass();
            alsrVar3.b |= 2;
            alsrVar3.d = str;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alsr alsrVar4 = (alsr) aihfVarCreateBuilder.instance;
        alsrVar4.i = apccVar.e;
        alsrVar4.b |= 32;
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 14);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            alsr alsrVar5 = (alsr) aihfVar.instance;
            alsrVar5.b |= 8;
            alsrVar5.g = (aigj) obj;
        }
        vrl vrlVar2 = new vrl(aihfVarCreateBuilder, 15);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            aihf aihfVar2 = (aihf) vrlVar2.a;
            aihfVar2.copyOnWrite();
            alsr alsrVar6 = (alsr) aihfVar2.instance;
            alsrVar6.b |= 16;
            alsrVar6.h = (aigj) obj2;
        }
        vrl vrlVar3 = new vrl(aihfVarCreateBuilder, 16);
        if (true == optional3.isPresent()) {
            Object obj3 = optional3.get();
            aihf aihfVar3 = (aihf) vrlVar3.a;
            aihfVar3.copyOnWrite();
            alsr alsrVar7 = (alsr) aihfVar3.instance;
            alsrVar7.j = (amyf) obj3;
            alsrVar7.b |= SemanticState.Focused;
        }
        super(abxvVar, zwaVar, "music/get_queue", aihfVarCreateBuilder, true);
    }

    @Override // defpackage.wkf
    protected final void b() {
        if ((((alsr) ((aihf) a()).instance).b & 2) == 0 && DesugarCollections.unmodifiableList(((alsr) ((aihf) a()).instance).e).isEmpty()) {
            zvp.a(zvn.b, zvm.n, "MusicQueueService request must a non-empty list of video ids or a non-empty playlist id.");
        }
    }
}
