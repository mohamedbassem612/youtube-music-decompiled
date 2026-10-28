package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubm extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auec auecVar = (auec) obj;
        aihf aihfVarCreateBuilder = andi.a.createBuilder();
        if ((auecVar.b & 1) != 0) {
            agdy agdyVar = uem.a;
            audk audkVar = auecVar.c;
            if (audkVar == null) {
                audkVar = audk.a;
            }
            ancq ancqVar = (ancq) agdyVar.b(audkVar);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar = (andi) aihfVarCreateBuilder.instance;
            ancqVar.getClass();
            andiVar.c = ancqVar;
            andiVar.b |= 1;
        }
        if ((auecVar.b & 2) != 0) {
            agdy agdyVar2 = uem.b;
            auef auefVar = auecVar.d;
            if (auefVar == null) {
                auefVar = auef.a;
            }
            andm andmVar = (andm) agdyVar2.b(auefVar);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar2 = (andi) aihfVarCreateBuilder.instance;
            andmVar.getClass();
            andiVar2.d = andmVar;
            andiVar2.b |= 2;
        }
        if ((auecVar.b & 4) != 0) {
            agdy agdyVar3 = uem.d;
            aude audeVarA = aude.a(auecVar.e);
            if (audeVarA == null) {
                audeVarA = aude.MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN;
            }
            anch anchVar = (anch) agdyVar3.b(audeVarA);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar3 = (andi) aihfVarCreateBuilder.instance;
            andiVar3.e = anchVar.h;
            andiVar3.b |= 4;
        }
        if ((auecVar.b & 8) != 0) {
            long j = auecVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar4 = (andi) aihfVarCreateBuilder.instance;
            andiVar4.b |= 8;
            andiVar4.f = j;
        }
        if ((auecVar.b & 16) != 0) {
            long j2 = auecVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar5 = (andi) aihfVarCreateBuilder.instance;
            andiVar5.b |= 16;
            andiVar5.g = j2;
        }
        if ((auecVar.b & 32) != 0) {
            agdy agdyVar4 = uem.e;
            aued auedVar = auecVar.h;
            if (auedVar == null) {
                auedVar = aued.a;
            }
            andk andkVar = (andk) agdyVar4.b(auedVar);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar6 = (andi) aihfVarCreateBuilder.instance;
            andkVar.getClass();
            andiVar6.h = andkVar;
            andiVar6.b |= 32;
        }
        if ((auecVar.b & 64) != 0) {
            agdy agdyVar5 = uem.c;
            auee aueeVar = auecVar.i;
            if (aueeVar == null) {
                aueeVar = auee.a;
            }
            andl andlVar = (andl) agdyVar5.b(aueeVar);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar7 = (andi) aihfVarCreateBuilder.instance;
            andlVar.getClass();
            andiVar7.i = andlVar;
            andiVar7.b |= 64;
        }
        if ((auecVar.b & SemanticState.Focused) != 0) {
            agdy agdyVar6 = uem.f;
            aueq aueqVar = auecVar.j;
            if (aueqVar == null) {
                aueqVar = aueq.a;
            }
            anea aneaVar = (anea) agdyVar6.b(aueqVar);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar8 = (andi) aihfVarCreateBuilder.instance;
            aneaVar.getClass();
            andiVar8.j = aneaVar;
            andiVar8.b |= SemanticState.Focused;
        }
        if ((auecVar.b & SemanticState.Hidden) != 0) {
            agdy agdyVar7 = uem.g;
            audv audvVar = auecVar.k;
            if (audvVar == null) {
                audvVar = audv.a;
            }
            andb andbVar = (andb) agdyVar7.b(audvVar);
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar9 = (andi) aihfVarCreateBuilder.instance;
            andbVar.getClass();
            andiVar9.k = andbVar;
            andiVar9.b |= SemanticState.Hidden;
        }
        Iterator it = auecVar.l.iterator();
        while (it.hasNext()) {
            andz andzVar = (andz) uem.h.b((auep) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar10 = (andi) aihfVarCreateBuilder.instance;
            andzVar.getClass();
            aiie aiieVar = andiVar10.l;
            if (!aiieVar.c()) {
                andiVar10.l = aihn.mutableCopy(aiieVar);
            }
            andiVar10.l.add(andzVar);
        }
        Iterator it2 = auecVar.m.iterator();
        while (it2.hasNext()) {
            anda andaVar = (anda) uem.i.b((audu) it2.next());
            aihfVarCreateBuilder.copyOnWrite();
            andi andiVar11 = (andi) aihfVarCreateBuilder.instance;
            andaVar.getClass();
            aiie aiieVar2 = andiVar11.m;
            if (!aiieVar2.c()) {
                andiVar11.m = aihn.mutableCopy(aiieVar2);
            }
            andiVar11.m.add(andaVar);
        }
        return (andi) aihfVarCreateBuilder.build();
    }
}
